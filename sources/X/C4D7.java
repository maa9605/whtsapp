package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.4D7  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4D7 {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C014006r A01;
    public final /* synthetic */ C0N2 A02;
    public final /* synthetic */ BrazilPaymentActivity A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C4D7(BrazilPaymentActivity brazilPaymentActivity, C0N2 c0n2, C014006r c014006r, String str, boolean z, FingerprintBottomSheet fingerprintBottomSheet) {
        this.A03 = brazilPaymentActivity;
        this.A02 = c0n2;
        this.A01 = c014006r;
        this.A04 = str;
        this.A05 = z;
        this.A00 = fingerprintBottomSheet;
    }

    public /* synthetic */ void A00(FingerprintBottomSheet fingerprintBottomSheet) {
        this.A03.A0Q.A0a.setText((CharSequence) null);
        if (fingerprintBottomSheet.A0W()) {
            fingerprintBottomSheet.A11();
        }
    }

    public /* synthetic */ void A01(FingerprintBottomSheet fingerprintBottomSheet) {
        if (this.A03.A0I.A02("FB", "PIN", false) != null) {
            if (fingerprintBottomSheet.A0W()) {
                fingerprintBottomSheet.A18();
            }
        } else if (!fingerprintBottomSheet.A0W()) {
        } else {
            fingerprintBottomSheet.A11();
        }
    }
}
