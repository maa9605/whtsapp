package X;

import com.whatsapp.report.ReportActivity;

/* renamed from: X.2hU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53772hU extends C00T {
    public final /* synthetic */ ReportActivity A00;

    public C53772hU(ReportActivity reportActivity) {
        this.A00 = reportActivity;
    }

    @Override // X.C00T
    public void A08(AnonymousClass092 anonymousClass092, int i) {
        if (i == 8 || !C003101m.A0T(anonymousClass092.A0n.A00)) {
            return;
        }
        if (i != 3) {
            this.A00.A1Q();
            return;
        }
        C018508q c018508q = ((ActivityC02290Ap) this.A00).A0A;
        c018508q.A02.postDelayed(new RunnableEBaseShape5S0100000_I0_5(this, 43), 2000L);
    }
}
