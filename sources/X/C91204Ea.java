package X;

import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.4Ea */
/* loaded from: classes3.dex */
public class C91204Ea implements C49D {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ AbstractC899949g A01;

    public C91204Ea(AbstractC899949g abstractC899949g, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = abstractC899949g;
        this.A00 = pinBottomSheetDialogFragment;
    }

    @Override // X.C49D
    public void AIo(final String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        pinBottomSheetDialogFragment.A1D();
        AbstractC899949g abstractC899949g = this.A01;
        ActivityC02270An activityC02270An = abstractC899949g.A04;
        C018508q c018508q = abstractC899949g.A02;
        C0E7 c0e7 = abstractC899949g.A05;
        C463026g c463026g = abstractC899949g.A0B;
        C28S c28s = abstractC899949g.A09;
        C899048w c899048w = abstractC899949g.A0D;
        C48R c48r = new C48R(activityC02270An, c018508q, c0e7, c463026g, c28s, c899048w, "PIN");
        C77343i3 A02 = c899048w.A02("FB", "PIN", true);
        if (A02 == null) {
            c48r.A00("FB", new C48Q() { // from class: X.4EZ
                {
                    C91204Ea.this = this;
                }

                @Override // X.C48Q
                public void AJs(C28Q c28q) {
                    C91204Ea c91204Ea = C91204Ea.this;
                    c91204Ea.A00.A11();
                    AbstractC899949g.A00(c91204Ea.A01);
                }

                @Override // X.C48Q
                public void AO6(C77343i3 c77343i3) {
                    C91204Ea c91204Ea = C91204Ea.this;
                    AbstractC899949g abstractC899949g2 = c91204Ea.A01;
                    C49A c49a = new C49A(c77343i3);
                    String str2 = str;
                    PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = c91204Ea.A00;
                    abstractC899949g2.A0C.A01(c49a, str2, new C91234Ed(abstractC899949g2, c49a, new C49B(abstractC899949g2.A06, abstractC899949g2.A0B), pinBottomSheetDialogFragment2));
                }
            });
            return;
        }
        C49A c49a = new C49A(A02);
        abstractC899949g.A0C.A01(c49a, str, new C91234Ed(abstractC899949g, c49a, new C49B(abstractC899949g.A06, c463026g), pinBottomSheetDialogFragment));
    }

    @Override // X.C49D
    public void AKa(View view) {
        AbstractC899949g abstractC899949g = this.A01;
        ActivityC02270An activityC02270An = abstractC899949g.A04;
        if (abstractC899949g instanceof C4EV) {
            C4EV c4ev = (C4EV) abstractC899949g;
            if (c4ev.A00 != null) {
                c4ev.A02.ARy(new C4BY(c4ev.A01, new C76943hP(activityC02270An)), new Void[0]);
                return;
            }
            throw null;
        }
    }
}
