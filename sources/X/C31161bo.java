package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.1bo */
/* loaded from: classes.dex */
public final class C31161bo extends AnonymousClass152 implements Handler.Callback {
    public final Context A02;
    public final Handler A03;
    public final HashMap A05 = new HashMap();
    public final C231815n A04 = C231815n.A00();
    public final long A00 = 5000;
    public final long A01 = 300000;

    public C31161bo(Context context) {
        this.A02 = context.getApplicationContext();
        this.A03 = new HandlerC234616t(context.getMainLooper(), this);
    }

    @Override // X.AnonymousClass152
    public final void A01(AnonymousClass151 anonymousClass151, ServiceConnection serviceConnection, String str) {
        C07K.A1Q(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.A05;
        synchronized (hashMap) {
            C15Y c15y = (C15Y) hashMap.get(anonymousClass151);
            if (c15y != null) {
                Set set = c15y.A05;
                if (set.contains(serviceConnection)) {
                    set.remove(serviceConnection);
                    if (set.isEmpty()) {
                        Handler handler = this.A03;
                        handler.sendMessageDelayed(handler.obtainMessage(0, anonymousClass151), 5000L);
                    }
                } else {
                    String valueOf = String.valueOf(anonymousClass151);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 76);
                    sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                String valueOf2 = String.valueOf(anonymousClass151);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    @Override // X.AnonymousClass152
    public final boolean A02(AnonymousClass151 anonymousClass151, ServiceConnection serviceConnection, String str) {
        boolean z;
        C07K.A1Q(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.A05;
        synchronized (hashMap) {
            C15Y c15y = (C15Y) hashMap.get(anonymousClass151);
            if (c15y == null) {
                c15y = new C15Y(this, anonymousClass151);
                c15y.A04.A00();
                c15y.A05.add(serviceConnection);
                c15y.A00();
                hashMap.put(anonymousClass151, c15y);
            } else {
                this.A03.removeMessages(0, anonymousClass151);
                Set set = c15y.A05;
                if (!set.contains(serviceConnection)) {
                    c15y.A04.A00();
                    set.add(serviceConnection);
                    int i = c15y.A00;
                    if (i != 1) {
                        if (i == 2) {
                            c15y.A00();
                        }
                    } else {
                        serviceConnection.onServiceConnected(c15y.A01, c15y.A02);
                    }
                } else {
                    String valueOf = String.valueOf(anonymousClass151);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = c15y.A03;
        }
        return z;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap hashMap = this.A05;
            synchronized (hashMap) {
                AnonymousClass151 anonymousClass151 = (AnonymousClass151) message.obj;
                C15Y c15y = (C15Y) hashMap.get(anonymousClass151);
                if (c15y != null && c15y.A05.isEmpty()) {
                    if (c15y.A03) {
                        C31161bo c31161bo = c15y.A06;
                        c31161bo.A03.removeMessages(1, c15y.A04);
                        C231815n c231815n = c31161bo.A04;
                        Context context = c31161bo.A02;
                        if (c231815n != null) {
                            context.unbindService(c15y);
                            c15y.A03 = false;
                            c15y.A00 = 2;
                        } else {
                            throw null;
                        }
                    }
                    hashMap.remove(anonymousClass151);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            HashMap hashMap2 = this.A05;
            synchronized (hashMap2) {
                AnonymousClass151 anonymousClass1512 = (AnonymousClass151) message.obj;
                C15Y c15y2 = (C15Y) hashMap2.get(anonymousClass1512);
                if (c15y2 != null && c15y2.A00 == 3) {
                    String valueOf = String.valueOf(anonymousClass1512);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = c15y2.A01;
                    if (componentName == null && (componentName = anonymousClass1512.A01) == null) {
                        componentName = new ComponentName(anonymousClass1512.A03, "unknown");
                    }
                    c15y2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
