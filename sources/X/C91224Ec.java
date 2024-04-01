package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.4Ec  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91224Ec implements AnonymousClass494 {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ AbstractC899949g A01;

    public C91224Ec(AbstractC899949g abstractC899949g, FingerprintBottomSheet fingerprintBottomSheet) {
        this.A01 = abstractC899949g;
        this.A00 = fingerprintBottomSheet;
    }

    @Override // X.AnonymousClass494
    public void AOf() {
        AbstractC899949g abstractC899949g = this.A01;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
        pinBottomSheetDialogFragment.A0A = new C90834Cp();
        pinBottomSheetDialogFragment.A0B = new C91204Ea(abstractC899949g, pinBottomSheetDialogFragment);
        abstractC899949g.A04.AUh(pinBottomSheetDialogFragment);
    }

    @Override // X.AnonymousClass494
    public void APK(final byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A00;
        fingerprintBottomSheet.A11();
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
            c48r.A00("FB", new C48Q() { // from class: X.4Eb
                @Override // X.C48Q
                public void AJs(C28Q c28q) {
                    AbstractC899949g.A00(C91224Ec.this.A01);
                }

                @Override // X.C48Q
                public void AO6(C77343i3 c77343i3) {
                    C02590Ca c02590Ca = new C02590Ca("pin", new C04P[]{new C04P("key-type", c77343i3.A03, null, (byte) 0), new C04P("key-version", c77343i3.A04, null, (byte) 0), new C04P("provider", c77343i3.A05, null, (byte) 0)}, null, c77343i3.A00.A7c(bArr, C02A.A0C(16)));
                    C91224Ec c91224Ec = C91224Ec.this;
                    c91224Ec.A00.A11();
                    c91224Ec.A01.A03(c02590Ca, null);
                }
            });
            return;
        }
        C02590Ca c02590Ca = new C02590Ca("pin", new C04P[]{new C04P("key-type", A02.A03, null, (byte) 0), new C04P("key-version", A02.A04, null, (byte) 0), new C04P("provider", A02.A05, null, (byte) 0)}, null, A02.A00.A7c(bArr, C02A.A0C(16)));
        fingerprintBottomSheet.A11();
        abstractC899949g.A03(c02590Ca, null);
    }
}
