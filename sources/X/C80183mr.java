package X;

import android.app.job.JobInfo;
import android.os.Build;

/* renamed from: X.3mr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C80183mr implements C3VZ {
    public final C71173Vc A00;

    @Override // X.C3VZ
    public int ABO() {
        return 21;
    }

    public C80183mr(C71173Vc c71173Vc) {
        this.A00 = c71173Vc;
    }

    @Override // X.C3VZ
    public void A6S() {
        C71173Vc c71173Vc = this.A00;
        C41861ud c41861ud = c71173Vc.A01;
        if (c41861ud.A01() == 4 && Build.VERSION.SDK_INT >= 21) {
            JobInfo A01 = c71173Vc.A01(11);
            if (A01 == null) {
                c71173Vc.A04();
                return;
            }
            boolean isPeriodic = A01.isPeriodic();
            long intervalMillis = A01.getIntervalMillis();
            long A02 = c41861ud.A02();
            if (isPeriodic && intervalMillis == A02) {
                return;
            }
            c71173Vc.A05(11);
            c71173Vc.A04();
        }
    }

    @Override // X.C3VZ
    public boolean AFj() {
        return this.A00.A01(11) != null;
    }

    @Override // X.C3VZ
    public void ASC() {
        this.A00.A04();
    }

    @Override // X.C3VZ
    public void cancel() {
        this.A00.A05(11);
    }
}
