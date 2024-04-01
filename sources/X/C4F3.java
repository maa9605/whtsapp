package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.4F3  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4F3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ActivityC02270An A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C92074Hk A03;
    public final /* synthetic */ String A04;

    public C4F3(C92074Hk c92074Hk, int i, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, ActivityC02270An activityC02270An, String str) {
        this.A03 = c92074Hk;
        this.A00 = i;
        this.A02 = pinBottomSheetDialogFragment;
        this.A01 = activityC02270An;
        this.A04 = str;
    }

    public void A00(C28Q c28q) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment;
        Log.i("DyiViewModel/request-report/on-error");
        int i = c28q.A00;
        if (i != 1440 && i != 1441 && i != 445 && i != 1448 && i != 10718) {
            if (this.A00 == 1 && (pinBottomSheetDialogFragment = this.A02) != null) {
                pinBottomSheetDialogFragment.A1C();
                pinBottomSheetDialogFragment.A1B();
            }
            C92074Hk c92074Hk = this.A03;
            c92074Hk.A02.A0A(0);
            c92074Hk.A03.A0A(new C0FK(0, c28q));
        } else if (this.A00 == 1) {
            C92074Hk c92074Hk2 = this.A03;
            String str = this.A04;
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = this.A02;
            if (c92074Hk2 != null) {
                pinBottomSheetDialogFragment2.A1C();
                int i2 = c28q.A00;
                if (i2 == 1441) {
                    ((C4FL) c92074Hk2).A06.A03(c28q.A02);
                    pinBottomSheetDialogFragment2.A1F(c28q.A02 * 1000, true);
                    return;
                } else if (i2 == 1440) {
                    pinBottomSheetDialogFragment2.A1E(c28q.A01);
                    return;
                } else {
                    if (i2 == 1448) {
                        ((C4FL) c92074Hk2).A03.A04(str, "PIN", c28q);
                    }
                    pinBottomSheetDialogFragment2.A11();
                    ((C4FL) c92074Hk2).A01.A0A(c28q);
                    return;
                }
            }
            throw null;
        } else {
            this.A03.A03.A0A(new C0FK(0, c28q));
        }
    }
}
