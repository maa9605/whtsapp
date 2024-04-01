package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.4H5  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4H5 extends AbstractC35891ju {
    public String A00;
    public final ActivityC02290Ap A01;
    public final FingerprintBottomSheet A02;
    public final AnonymousClass012 A03;
    public final C48P A04;
    public final AnonymousClass499 A05;
    public final C4D7 A06;

    public C4H5(AnonymousClass012 anonymousClass012, AnonymousClass499 anonymousClass499, ActivityC02290Ap activityC02290Ap, C48P c48p, FingerprintBottomSheet fingerprintBottomSheet, C4D7 c4d7) {
        this.A03 = anonymousClass012;
        this.A05 = anonymousClass499;
        this.A01 = activityC02290Ap;
        this.A04 = c48p;
        this.A02 = fingerprintBottomSheet;
        this.A06 = c4d7;
    }

    @Override // X.AbstractC27261Mr
    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        fingerprintBottomSheet.A15(true);
        String str = this.A00;
        if (str != null) {
            C4D7 c4d7 = this.A06;
            BrazilPaymentActivity.A04(c4d7.A03, c4d7.A04, c4d7.A01, c4d7.A02, str, c4d7.A05);
        }
        fingerprintBottomSheet.A11();
    }

    @Override // X.AbstractC35891ju
    public void A02() {
        C4D7 c4d7 = this.A06;
        BrazilPaymentActivity.A02(c4d7.A03, c4d7.A02, c4d7.A01, c4d7.A04, c4d7.A05);
    }

    @Override // X.AbstractC35891ju
    public void A03(final C0HE c0he, InterfaceC06550Tv interfaceC06550Tv) {
        long A01 = this.A05.A01() * 1000;
        if (A01 > this.A03.A05()) {
            this.A02.A1D(A01);
            return;
        }
        final C48P c48p = this.A04;
        final C4H4 c4h4 = new C4H4(this, interfaceC06550Tv);
        c48p.A0K.AS1(new RunnableC69153Ni(c48p));
        C899048w c899048w = c48p.A0E;
        String str = c48p.A0O;
        C77343i3 A02 = c899048w.A02(str, "PIN", true);
        if (A02 != null) {
            c48p.A02(new C49A(A02), c0he, c4h4);
        } else {
            c48p.A0D.A00(str, new C48Q() { // from class: X.4CL
                @Override // X.C48Q
                public void AJs(C28Q c28q) {
                    c4h4.AJs(c28q);
                }

                @Override // X.C48Q
                public void AO6(C77343i3 c77343i3) {
                    C48P.this.A02(new C49A(c77343i3), c0he, c4h4);
                }
            });
        }
    }
}
