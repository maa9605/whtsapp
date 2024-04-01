package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.4Ee  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91244Ee {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ AbstractC899949g A01;

    public C91244Ee(AbstractC899949g abstractC899949g, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = abstractC899949g;
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void A00(C28Q c28q) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1C();
        }
        StringBuilder sb = new StringBuilder("PAY: FbPayHubActivity/PaymentStepUpWebviewAction onError: ");
        sb.append(c28q);
        Log.e(sb.toString());
        int i = c28q.A00;
        if (i == 1441) {
            AbstractC899949g abstractC899949g = this.A01;
            abstractC899949g.A0F.A03(c28q.A02);
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1F(c28q.A02 * 1000, true);
            } else {
                AbstractC899949g.A00(abstractC899949g);
            }
        } else if (i == 1440) {
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1E(c28q.A01);
            } else {
                AbstractC899949g.A00(this.A01);
            }
        } else if (i == 455) {
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A11();
            }
            this.A01.A01();
        } else {
            if (i == 1448) {
                this.A01.A0D.A04("FB", "PIN", c28q);
            }
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A11();
            }
            AbstractC899949g.A00(this.A01);
        }
    }
}
