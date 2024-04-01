package X;

import android.content.DialogInterface;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.4D5  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4D5 implements C48O {
    public final /* synthetic */ C4D6 A00;

    public C4D5(C4D6 c4d6) {
        this.A00 = c4d6;
    }

    public /* synthetic */ void A00(PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A00.A03.A0Q.A0a.setText((CharSequence) null);
        pinBottomSheetDialogFragment.A11();
    }

    @Override // X.C48O
    public void AJs(C28Q c28q) {
        C4D6 c4d6 = this.A00;
        final PinBottomSheetDialogFragment pinBottomSheetDialogFragment = c4d6.A02;
        pinBottomSheetDialogFragment.A1C();
        int i = c28q.A00;
        if (i == 454) {
            BrazilPaymentActivity brazilPaymentActivity = c4d6.A03;
            BrazilPaymentActivity.A03(brazilPaymentActivity, c28q);
            BrazilPaymentActivity.A01(brazilPaymentActivity, pinBottomSheetDialogFragment);
        } else if (i == 1440) {
            pinBottomSheetDialogFragment.A1E(c28q.A01);
        } else if (i != 1441) {
            BrazilPaymentActivity brazilPaymentActivity2 = c4d6.A03;
            new C90454Bb(brazilPaymentActivity2.A05, brazilPaymentActivity2.A0G).A02(brazilPaymentActivity2, i, brazilPaymentActivity2.A02.A08(brazilPaymentActivity2.A06.A02(((C4KG) brazilPaymentActivity2).A0A), false), new DialogInterface.OnDismissListener() { // from class: X.3O8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C4D5.this.A00(pinBottomSheetDialogFragment);
                }
            }, new DialogInterface.OnDismissListener() { // from class: X.3OA
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    PinBottomSheetDialogFragment.this.A11();
                }
            }, new DialogInterface.OnDismissListener() { // from class: X.3O9
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    PinBottomSheetDialogFragment.this.A1B();
                }
            }).show();
        } else {
            pinBottomSheetDialogFragment.A1F(c28q.A02 * 1000, true);
        }
    }

    @Override // X.C48O
    public void AOA(String str) {
        C4D6 c4d6 = this.A00;
        c4d6.A02.A1C();
        BrazilPaymentActivity.A04(c4d6.A03, c4d6.A04, c4d6.A00, c4d6.A01, str, c4d6.A05);
    }
}
