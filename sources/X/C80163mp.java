package X;

import android.app.job.JobInfo;
import android.os.Build;

/* renamed from: X.3mp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C80163mp implements C3VZ {
    public final C71173Vc A00;

    @Override // X.C3VZ
    public int ABO() {
        return 21;
    }

    public C80163mp(C71173Vc c71173Vc) {
        this.A00 = c71173Vc;
    }

    @Override // X.C3VZ
    public void A6S() {
        C71173Vc c71173Vc = this.A00;
        C41861ud c41861ud = c71173Vc.A01;
        if (c41861ud.A01() == 6 && Build.VERSION.SDK_INT >= 21) {
            JobInfo A01 = c71173Vc.A01(14);
            if (A01 == null) {
                c71173Vc.A02();
                return;
            }
            long minLatencyMillis = A01.getMinLatencyMillis();
            long maxExecutionDelayMillis = A01.getMaxExecutionDelayMillis();
            long A02 = c41861ud.A02();
            if (A02 == minLatencyMillis && A02 == maxExecutionDelayMillis) {
                return;
            }
            c71173Vc.A05(14);
            c71173Vc.A02();
        }
    }

    @Override // X.C3VZ
    public boolean AFj() {
        return this.A00.A01(14) != null;
    }

    @Override // X.C3VZ
    public void ASC() {
        this.A00.A02();
    }

    @Override // X.C3VZ
    public void cancel() {
        this.A00.A05(14);
    }
}
