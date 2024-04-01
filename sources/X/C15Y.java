package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.15Y  reason: invalid class name */
/* loaded from: classes.dex */
public final class C15Y implements ServiceConnection {
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final AnonymousClass151 A04;
    public final /* synthetic */ C31161bo A06;
    public final Set A05 = new HashSet();
    public int A00 = 2;

    public C15Y(C31161bo c31161bo, AnonymousClass151 anonymousClass151) {
        this.A06 = c31161bo;
        this.A04 = anonymousClass151;
    }

    public final void A00() {
        this.A00 = 3;
        C31161bo c31161bo = this.A06;
        Context context = c31161bo.A02;
        AnonymousClass151 anonymousClass151 = this.A04;
        boolean A01 = C231815n.A01(context, anonymousClass151.A00(), this, anonymousClass151.A00);
        this.A03 = A01;
        if (A01) {
            Handler handler = c31161bo.A03;
            handler.sendMessageDelayed(handler.obtainMessage(1, anonymousClass151), 300000L);
            return;
        }
        this.A00 = 2;
        try {
            if (c31161bo.A04 == null) {
                throw null;
            }
            context.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C31161bo c31161bo = this.A06;
        synchronized (c31161bo.A05) {
            c31161bo.A03.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            for (ServiceConnection serviceConnection : this.A05) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C31161bo c31161bo = this.A06;
        synchronized (c31161bo.A05) {
            c31161bo.A03.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            for (ServiceConnection serviceConnection : this.A05) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }
}
