package java.lang;

import X.ActivityC02330At;
import X.C018508q;
import X.C06C;
import X.C2MR;
import X.C40261rr;
import X.C461124z;
import X.C655537q;
import com.whatsapp.support.ReportSpamDialogFragment;
import java.util.Set;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S1210000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public RunnableEBaseShape0S1210000_I0(Object obj, boolean z, Object obj2, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = z;
        this.A01 = obj2;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A04) {
            case 0:
                C461124z c461124z = (C461124z) this.A00;
                boolean z = this.A03;
                Set set = (Set) this.A01;
                String str = this.A02;
                C40261rr c40261rr = c461124z.A06;
                if (z) {
                    c40261rr.A0D(null);
                } else {
                    c40261rr.A0F(set, str);
                }
                c461124z.A0F.run();
                return;
            case 1:
                ReportSpamDialogFragment reportSpamDialogFragment = (ReportSpamDialogFragment) this.A00;
                boolean z2 = this.A03;
                C06C c06c = (C06C) this.A01;
                String str2 = this.A02;
                C2MR c2mr = reportSpamDialogFragment.A04;
                if (z2) {
                    ActivityC02330At A09 = reportSpamDialogFragment.A09();
                    c2mr.A01(c06c, str2);
                    c2mr.A00(A09, new C655537q(reportSpamDialogFragment, c06c), c06c, null, str2);
                    return;
                }
                c2mr.A01(c06c, str2);
                reportSpamDialogFragment.A00.A03();
                C018508q c018508q = reportSpamDialogFragment.A00;
                c018508q.A02.post(new RunnableEBaseShape7S0100000_I0_7(reportSpamDialogFragment, 15));
                return;
            default:
                return;
        }
    }
}
