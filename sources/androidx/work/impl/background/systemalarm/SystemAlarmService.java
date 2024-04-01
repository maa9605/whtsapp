package androidx.work.impl.background.systemalarm;

import X.AbstractC16430qO;
import X.C1Tb;
import X.C29111Vj;
import X.InterfaceC16710qt;
import android.content.Intent;

/* loaded from: classes.dex */
public class SystemAlarmService extends C1Tb implements InterfaceC16710qt {
    public static final String A02 = AbstractC16430qO.A01("SystemAlarmService");
    public C29111Vj A00;
    public boolean A01;

    public final void A00() {
        C29111Vj c29111Vj = new C29111Vj(this);
        this.A00 = c29111Vj;
        if (c29111Vj.A01 != null) {
            AbstractC16430qO.A00().A03(C29111Vj.A0A, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            c29111Vj.A01 = this;
        }
    }

    @Override // X.C1Tb, android.app.Service
    public void onCreate() {
        super.onCreate();
        A00();
        this.A01 = false;
    }

    @Override // X.C1Tb, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.A01 = true;
        this.A00.A00();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.A01) {
            AbstractC16430qO.A00().A04(A02, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.A00.A00();
            A00();
            this.A01 = false;
        }
        if (intent != null) {
            this.A00.A03(intent, startId);
            return 3;
        }
        return 3;
    }
}
