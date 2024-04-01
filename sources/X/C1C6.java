package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1C6  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1C6 implements Runnable {
    public final C1C2 A00;

    public C1C6(C1C2 c1c2) {
        this.A00 = c1c2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C1C2 c1c2 = this.A00;
        while (true) {
            synchronized (c1c2) {
                if (c1c2.A00 != 2) {
                    return;
                }
                Queue queue = c1c2.A04;
                if (queue.isEmpty()) {
                    c1c2.A00();
                    return;
                }
                final C1C9 c1c9 = (C1C9) queue.poll();
                SparseArray sparseArray = c1c2.A03;
                int i = c1c9.A01;
                sparseArray.put(i, c1c9);
                C1C1 c1c1 = c1c2.A05;
                c1c1.A03.schedule(new Runnable(c1c2, c1c9) { // from class: X.1C5
                    public final C1C2 A00;
                    public final C1C9 A01;

                    {
                        this.A00 = c1c2;
                        this.A01 = c1c9;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C2 c1c22 = this.A00;
                        int i2 = this.A01.A01;
                        synchronized (c1c22) {
                            SparseArray sparseArray2 = c1c22.A03;
                            C1C9 c1c92 = (C1C9) sparseArray2.get(i2);
                            if (c1c92 != null) {
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("Timing out request: ");
                                sb.append(i2);
                                Log.w("MessengerIpcClient", sb.toString());
                                sparseArray2.remove(i2);
                                c1c92.A01(new C1C8(3, "Timed out waiting for response"));
                                c1c22.A00();
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String valueOf = String.valueOf(c1c9);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                    sb.append("Sending ");
                    sb.append(valueOf);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                Context context = c1c1.A02;
                Messenger messenger = c1c2.A02;
                Message obtain = Message.obtain();
                obtain.what = c1c9.A00;
                obtain.arg1 = i;
                obtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", c1c9.A03());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle("data", c1c9.A02);
                obtain.setData(bundle);
                try {
                    C1C7 c1c7 = c1c2.A01;
                    Messenger messenger2 = c1c7.A00;
                    if (messenger2 == null) {
                        C1CO c1co = c1c7.A01;
                        if (c1co == null) {
                            throw new IllegalStateException("Both messengers are null");
                            break;
                        }
                        c1co.A00(obtain);
                    } else {
                        messenger2.send(obtain);
                    }
                } catch (RemoteException e) {
                    c1c2.A01(2, e.getMessage());
                }
            }
        }
    }
}
