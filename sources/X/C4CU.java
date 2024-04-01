package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.HashMap;

/* renamed from: X.4CU  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4CU {
    public final /* synthetic */ ActivityC02290Ap A00;
    public final /* synthetic */ C897648i A01;
    public final /* synthetic */ C91164Dw A02;

    public C4CU(C897648i c897648i, C91164Dw c91164Dw, ActivityC02290Ap activityC02290Ap) {
        this.A01 = c897648i;
        this.A02 = c91164Dw;
        this.A00 = activityC02290Ap;
    }

    public void A00(C28Q c28q) {
        C897648i c897648i = this.A01;
        C014406v c014406v = c897648i.A07;
        StringBuilder sb = new StringBuilder("performDobComplianceCheck onError: ");
        sb.append(c28q);
        c014406v.A07(null, sb.toString(), null);
        C897748j c897748j = c897648i.A06;
        ActivityC02290Ap activityC02290Ap = this.A00;
        if (c897748j.A02(activityC02290Ap, c28q)) {
            this.A02.A00.A00("on_failure");
            return;
        }
        int i = c28q.A00;
        if (i == 10755) {
            this.A02.A00.A00("on_failure");
            PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg_is_underage_unavailability", false);
            paymentsUnavailableDialogFragment.A0P(bundle);
            activityC02290Ap.AUh(paymentsUnavailableDialogFragment);
            return;
        }
        C91164Dw c91164Dw = this.A02;
        if (c91164Dw != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", String.valueOf(i));
            c91164Dw.A00.A03("on_exception", hashMap);
            return;
        }
        throw null;
    }
}
