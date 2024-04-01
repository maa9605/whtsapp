package X;

import java.util.TimerTask;

/* renamed from: X.3T4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3T4 extends TimerTask {
    public final /* synthetic */ C04510Kl A00;

    public C3T4(C04510Kl c04510Kl) {
        this.A00 = c04510Kl;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        C04510Kl c04510Kl = this.A00;
        if (c04510Kl.A04) {
            return;
        }
        c04510Kl.A03 = true;
        C04510Kl.A0O.remove(c04510Kl.A02.toString());
        if (!c04510Kl.A05) {
            C018508q c018508q = c04510Kl.A08;
            c018508q.A02.post(new RunnableEBaseShape9S0100000_I1_1(this, 0));
        }
        c04510Kl.A01(2);
        C04500Kk c04500Kk = c04510Kl.A0L;
        if (c04500Kk != null) {
            c04510Kl.A0N.A0E(c04500Kk.A01, 500);
        }
    }
}
