package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.ReTosFragment;

/* renamed from: X.4EJ  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4EJ implements InterfaceC03640Gm {
    public final /* synthetic */ ReTosFragment A00;

    public C4EJ(ReTosFragment reTosFragment) {
        this.A00 = reTosFragment;
    }

    public /* synthetic */ void A00() {
        this.A00.A10();
    }

    public final void A01(C28Q c28q) {
        ReTosFragment reTosFragment = this.A00;
        reTosFragment.A15(true);
        reTosFragment.A00.setVisibility(0);
        reTosFragment.A01.setVisibility(8);
        ActivityC02330At A09 = reTosFragment.A09();
        if (A09 != null) {
            C895547l c895547l = new C895547l(reTosFragment.A03);
            C3R3 c3r3 = new C3R3(this);
            C3R2 c3r2 = C3R2.A00;
            DialogInterfaceC019408z A02 = c895547l.A02(A09, c28q.A00, c3r3, c3r2);
            if (A02 == null) {
                A02 = C895547l.A00(A09, reTosFragment.A03.A06(R.string.payments_generic_error), c3r2);
            }
            A02.show();
        }
    }

    @Override // X.InterfaceC03640Gm
    public void ANw(C28Q c28q) {
        A01(c28q);
    }

    @Override // X.InterfaceC03640Gm
    public void AO1(C28Q c28q) {
        A01(c28q);
    }

    @Override // X.InterfaceC03640Gm
    public void AO2(C468228k c468228k) {
        ReTosFragment reTosFragment = this.A00;
        C014406v c014406v = reTosFragment.A05;
        StringBuilder A0P = C000200d.A0P("accept-tos/result=");
        A0P.append(c468228k.A02);
        c014406v.A07(null, A0P.toString(), null);
        if (c468228k.A02) {
            reTosFragment.A15(true);
            reTosFragment.A00.setVisibility(0);
            reTosFragment.A01.setVisibility(8);
            reTosFragment.A16(false, false);
            return;
        }
        reTosFragment.A15(true);
        reTosFragment.A00.setVisibility(0);
        reTosFragment.A01.setVisibility(8);
        ActivityC02330At A09 = reTosFragment.A09();
        if (A09 == null) {
            return;
        }
        C895547l c895547l = new C895547l(reTosFragment.A03);
        C3R3 c3r3 = new C3R3(this);
        C3R2 c3r2 = C3R2.A00;
        DialogInterfaceC019408z A02 = c895547l.A02(A09, 0, c3r3, c3r2);
        if (A02 == null) {
            A02 = C895547l.A00(A09, reTosFragment.A03.A06(R.string.payments_generic_error), c3r2);
        }
        A02.show();
    }
}
