package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1C2 */
/* loaded from: classes.dex */
public final class C1C2 implements ServiceConnection {
    public C1C7 A01;
    public final /* synthetic */ C1C1 A05;
    public int A00 = 0;
    public final Messenger A02 = new Messenger(new HandlerC02410Bf(Looper.getMainLooper(), new Handler.Callback(this) { // from class: X.1C4
        public final C1C2 A00;

        {
            this.A00 = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            C1C2 c1c2 = this.A00;
            if (c1c2 != null) {
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Received response to request: ");
                    sb.append(i);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                synchronized (c1c2) {
                    SparseArray sparseArray = c1c2.A03;
                    C1C9 c1c9 = (C1C9) sparseArray.get(i);
                    if (c1c9 == null) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("Received response for unknown request: ");
                        sb2.append(i);
                        Log.w("MessengerIpcClient", sb2.toString());
                        return true;
                    }
                    sparseArray.remove(i);
                    c1c2.A00();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        c1c9.A01(new C1C8(4, "Not supported by GmsCore"));
                        return true;
                    }
                    c1c9.A00(data);
                    return true;
                }
            }
            throw null;
        }
    }));
    public final Queue A04 = new ArrayDeque();
    public final SparseArray A03 = new SparseArray();

    public C1C2(C1C1 c1c1) {
        this.A05 = c1c1;
    }

    public final synchronized void A00() {
        if (this.A00 == 2 && this.A04.isEmpty() && this.A03.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.A00 = 3;
            C231815n A00 = C231815n.A00();
            Context context = this.A05.A02;
            if (A00 == null) {
                throw null;
            }
            context.unbindService(this);
        }
    }

    public final synchronized void A01(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.A00;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    this.A00 = 4;
                    return;
                } else if (i2 == 4) {
                    return;
                } else {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.A00 = 4;
            C231815n A00 = C231815n.A00();
            Context context = this.A05.A02;
            if (A00 != null) {
                context.unbindService(this);
                C1C8 c1c8 = new C1C8(i, str);
                Queue<C1C9> queue = this.A04;
                for (C1C9 c1c9 : queue) {
                    c1c9.A01(c1c8);
                }
                queue.clear();
                int i3 = 0;
                while (true) {
                    SparseArray sparseArray = this.A03;
                    if (i3 < sparseArray.size()) {
                        ((C1C9) sparseArray.valueAt(i3)).A01(c1c8);
                        i3++;
                    } else {
                        sparseArray.clear();
                        return;
                    }
                }
            } else {
                throw null;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final synchronized boolean A02(C1C9 c1c9) {
        int i = this.A00;
        if (i != 0) {
            if (i == 1) {
                this.A04.add(c1c9);
                return true;
            } else if (i == 2) {
                this.A04.add(c1c9);
                this.A05.A03.execute(new C1C6(this));
                return true;
            } else if (i == 3 || i == 4) {
                return false;
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        this.A04.add(c1c9);
        C07K.A1a(this.A00 == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.A00 = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        C231815n A00 = C231815n.A00();
        C1C1 c1c1 = this.A05;
        Context context = c1c1.A02;
        if (A00 != null) {
            if (!C231815n.A01(context, intent, this, 1)) {
                A01(0, "Unable to bind to service");
            } else {
                c1c1.A03.schedule(new Runnable(this) { // from class: X.1C3
                    public final C1C2 A00;

                    {
                        this.A00 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C2 c1c2 = this.A00;
                        synchronized (c1c2) {
                            if (c1c2.A00 == 1) {
                                c1c2.A01(1, "Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            }
            return true;
        }
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            A01(0, "Null service connection");
            return;
        }
        try {
            this.A01 = new C1C7(iBinder);
            this.A00 = 2;
            this.A05.A03.execute(new C1C6(this));
        } catch (RemoteException e) {
            A01(0, e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        A01(2, "Service disconnected");
    }
}
