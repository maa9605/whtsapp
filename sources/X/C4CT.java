package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.HashMap;

/* renamed from: X.4CT  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4CT {
    public final /* synthetic */ ActivityC02290Ap A00;
    public final /* synthetic */ C897648i A01;
    public final /* synthetic */ C91154Dv A02;

    public C4CT(C897648i c897648i, C91154Dv c91154Dv, ActivityC02290Ap activityC02290Ap) {
        this.A01 = c897648i;
        this.A02 = c91154Dv;
        this.A00 = activityC02290Ap;
    }

    public void A00(C28Q c28q) {
        C014406v c014406v = this.A01.A07;
        StringBuilder sb = new StringBuilder("performNameCheck onError: ");
        sb.append(c28q);
        c014406v.A07(null, sb.toString(), null);
        int i = c28q.A00;
        if (i == 10755) {
            ActivityC02290Ap activityC02290Ap = this.A00;
            PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg_is_underage_unavailability", false);
            paymentsUnavailableDialogFragment.A0P(bundle);
            activityC02290Ap.AUh(paymentsUnavailableDialogFragment);
            return;
        }
        C91154Dv c91154Dv = this.A02;
        if (c91154Dv != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", String.valueOf(i));
            c91154Dv.A00.A03("on_exception", hashMap);
            return;
        }
        throw null;
    }

    public void A01(boolean z) {
        C014406v c014406v = this.A01.A07;
        StringBuilder sb = new StringBuilder("performNameCheck onNameCheckComplete, eligible: ");
        sb.append(z);
        c014406v.A07(null, sb.toString(), null);
        C91154Dv c91154Dv = this.A02;
        if (!z) {
            c91154Dv.A00.A00("on_failure");
        } else {
            c91154Dv.A00.A00("on_success");
        }
    }
}
