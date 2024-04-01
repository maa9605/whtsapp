package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.4H4 */
/* loaded from: classes3.dex */
public class C4H4 implements InterfaceC06550Tv, C48O {
    public final /* synthetic */ InterfaceC06550Tv A00;
    public final /* synthetic */ C4H5 A01;

    public C4H4(C4H5 c4h5, InterfaceC06550Tv interfaceC06550Tv) {
        this.A01 = c4h5;
        this.A00 = interfaceC06550Tv;
    }

    public void A00() {
        C4D7 c4d7 = this.A01.A06;
        BrazilPaymentActivity.A02(c4d7.A03, c4d7.A02, c4d7.A01, c4d7.A04, c4d7.A05);
    }

    @Override // X.InterfaceC06550Tv
    public void AHZ(int i, CharSequence charSequence) {
        this.A00.AHZ(i, charSequence);
    }

    @Override // X.InterfaceC06550Tv
    public void AHa() {
        this.A00.AHa();
    }

    @Override // X.InterfaceC06550Tv
    public void AHb(int i, CharSequence charSequence) {
        this.A00.AHb(i, charSequence);
    }

    @Override // X.InterfaceC06550Tv
    public void AHc(byte[] bArr) {
        C4H5 c4h5 = this.A01;
        c4h5.A02.A08 = true;
        c4h5.A01.A12(R.string.payment_verifying);
    }

    @Override // X.C48O
    public void AJs(C28Q c28q) {
        C4H5 c4h5 = this.A01;
        c4h5.A01.ARS();
        FingerprintBottomSheet fingerprintBottomSheet = c4h5.A02;
        fingerprintBottomSheet.A08 = false;
        int i = c28q.A00;
        if (i == 1441) {
            fingerprintBottomSheet.A1D(c28q.A02 * 1000);
            return;
        }
        final C4D7 c4d7 = c4h5.A06;
        BrazilPaymentActivity brazilPaymentActivity = c4d7.A03;
        C90454Bb c90454Bb = new C90454Bb(brazilPaymentActivity.A05, brazilPaymentActivity.A0G);
        if (i == 454) {
            BrazilPaymentActivity.A03(brazilPaymentActivity, c28q);
            BrazilPaymentActivity.A01(brazilPaymentActivity, c4d7.A00);
            return;
        }
        C018708s c018708s = brazilPaymentActivity.A02;
        C0DK c0dk = brazilPaymentActivity.A06;
        UserJid userJid = ((C4KG) brazilPaymentActivity).A0A;
        if (userJid != null) {
            String A08 = c018708s.A08(c0dk.A02(userJid), false);
            final FingerprintBottomSheet fingerprintBottomSheet2 = c4d7.A00;
            c90454Bb.A02(brazilPaymentActivity, i, A08, new DialogInterface.OnDismissListener() { // from class: X.3OD
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    c4d7.A00(fingerprintBottomSheet2);
                }
            }, new DialogInterface.OnDismissListener() { // from class: X.3OC
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    FingerprintBottomSheet fingerprintBottomSheet3 = fingerprintBottomSheet2;
                    if (fingerprintBottomSheet3.A0W()) {
                        fingerprintBottomSheet3.A11();
                    }
                }
            }, new DialogInterface.OnDismissListener() { // from class: X.3OB
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    c4d7.A01(fingerprintBottomSheet2);
                }
            }).show();
            return;
        }
        throw null;
    }

    @Override // X.C48O
    public void AOA(String str) {
        C4H5 c4h5 = this.A01;
        c4h5.A01.ARS();
        FingerprintBottomSheet fingerprintBottomSheet = c4h5.A02;
        fingerprintBottomSheet.A15(false);
        fingerprintBottomSheet.A02.setEnabled(false);
        fingerprintBottomSheet.A01.setEnabled(false);
        c4h5.A00 = str;
        this.A00.AHc(null);
    }
}
