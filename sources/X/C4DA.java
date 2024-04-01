package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;

/* renamed from: X.4DA  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4DA implements AnonymousClass494 {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A01;
    public final /* synthetic */ String A02;

    public C4DA(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity, FingerprintBottomSheet fingerprintBottomSheet, String str) {
        this.A01 = brazilPaymentCardDetailsActivity;
        this.A00 = fingerprintBottomSheet;
        this.A02 = str;
    }

    @Override // X.AnonymousClass494
    public void AOf() {
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A01;
        if (brazilPaymentCardDetailsActivity != null) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
            pinBottomSheetDialogFragment.A0A = new C90834Cp();
            pinBottomSheetDialogFragment.A0B = new C4D8(brazilPaymentCardDetailsActivity, pinBottomSheetDialogFragment);
            brazilPaymentCardDetailsActivity.AUh(pinBottomSheetDialogFragment);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass494
    public void APK(final byte[] bArr) {
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A01;
        C48R c48r = new C48R(brazilPaymentCardDetailsActivity, ((ActivityC02290Ap) brazilPaymentCardDetailsActivity).A0A, ((ActivityC02290Ap) brazilPaymentCardDetailsActivity).A0D, brazilPaymentCardDetailsActivity.A08, brazilPaymentCardDetailsActivity.A07, brazilPaymentCardDetailsActivity.A0B, "PIN");
        C77343i3 A02 = brazilPaymentCardDetailsActivity.A0B.A02("FB", "PIN", true);
        if (brazilPaymentCardDetailsActivity != null) {
            final C4DC c4dc = new C4DC(brazilPaymentCardDetailsActivity, null, new C4EA(brazilPaymentCardDetailsActivity, null, 0));
            if (A02 == null) {
                c48r.A00("FB", new C48Q() { // from class: X.4D9
                    @Override // X.C48Q
                    public void AJs(C28Q c28q) {
                        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity2 = C4DA.this.A01;
                        brazilPaymentCardDetailsActivity2.A05.A01(brazilPaymentCardDetailsActivity2, c28q.A00, R.string.payment_method_cannot_be_removed).show();
                    }

                    @Override // X.C48Q
                    public void AO6(C77343i3 c77343i3) {
                        C4DA c4da = C4DA.this;
                        c4da.A00.A11();
                        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity2 = c4da.A01;
                        brazilPaymentCardDetailsActivity2.A12(R.string.register_wait_message);
                        brazilPaymentCardDetailsActivity2.A08.A0D(((C4KP) brazilPaymentCardDetailsActivity2).A07.A07, c4dc, new C02590Ca("pin", new C04P[]{new C04P("key-type", c77343i3.A03, null, (byte) 0), new C04P("key-version", c77343i3.A04, null, (byte) 0), new C04P("provider", c77343i3.A05, null, (byte) 0)}, null, c77343i3.A00.A7c(bArr, C02A.A0C(16))), c4da.A02);
                    }
                });
                return;
            }
            this.A00.A11();
            brazilPaymentCardDetailsActivity.A12(R.string.register_wait_message);
            brazilPaymentCardDetailsActivity.A08.A0D(((C4KP) brazilPaymentCardDetailsActivity).A07.A07, c4dc, new C02590Ca("pin", new C04P[]{new C04P("key-type", A02.A03, null, (byte) 0), new C04P("key-version", A02.A04, null, (byte) 0), new C04P("provider", A02.A05, null, (byte) 0)}, null, A02.A00.A7c(bArr, C02A.A0C(16))), this.A02);
            return;
        }
        throw null;
    }
}
