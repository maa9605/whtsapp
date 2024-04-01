package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.4Dk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91044Dk extends C0HS {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public C91044Dk(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        C0DV c0dv = ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0C;
        c0dv.A04();
        C4GI c4gi = (C4GI) c0dv.A08.A05(indiaUpiPaymentActivity.A0I);
        C014406v c014406v = indiaUpiPaymentActivity.A0i;
        StringBuilder sb = new StringBuilder("got contact vpa: ");
        sb.append(c4gi);
        c014406v.A07(null, sb.toString(), null);
        if (c4gi == null || TextUtils.isEmpty(c4gi.A01)) {
            final UserJid userJid = indiaUpiPaymentActivity.A0I;
            C4C4 c4c4 = new C4C4(indiaUpiPaymentActivity, ((ActivityC02290Ap) indiaUpiPaymentActivity).A0A, ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A01, ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0C, ((ActivityC02290Ap) indiaUpiPaymentActivity).A0D, ((C4KG) indiaUpiPaymentActivity).A0C, indiaUpiPaymentActivity.A0F, ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0F, indiaUpiPaymentActivity.A0M, ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A05, ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A09);
            StringBuilder sb2 = new StringBuilder("sendGetContactInfoForJid: ");
            sb2.append(userJid);
            c014406v.A07(null, sb2.toString(), null);
            c4c4.A00(userJid, new AnonymousClass486() { // from class: X.4Dj
                @Override // X.AnonymousClass486
                public void AIz(C4GI c4gi2) {
                    IndiaUpiPaymentActivity indiaUpiPaymentActivity2 = C91044Dk.this.A00;
                    indiaUpiPaymentActivity2.A0f = false;
                    indiaUpiPaymentActivity2.ARS();
                    if (indiaUpiPaymentActivity2.A2N(c4gi2)) {
                        return;
                    }
                    C014406v c014406v2 = indiaUpiPaymentActivity2.A0i;
                    StringBuilder A0P = C000200d.A0P("starting onContactVpa for jid: ");
                    A0P.append(userJid);
                    A0P.append(" vpa: ");
                    A0P.append(C40841sx.A0Q(c4gi2.A01));
                    A0P.append(" receiverVpaId: ");
                    A0P.append(c4gi2.A02);
                    c014406v2.A07(null, A0P.toString(), null);
                    ((AbstractActivityC92444Kp) indiaUpiPaymentActivity2).A0E = c4gi2.A01;
                    ((AbstractActivityC92444Kp) indiaUpiPaymentActivity2).A0F = c4gi2.A02;
                    indiaUpiPaymentActivity2.A1v();
                }

                @Override // X.AnonymousClass486
                public void AJs(C28Q c28q) {
                    IndiaUpiPaymentActivity indiaUpiPaymentActivity2 = C91044Dk.this.A00;
                    indiaUpiPaymentActivity2.A0f = false;
                    indiaUpiPaymentActivity2.ARS();
                    if (C90944Da.A03(indiaUpiPaymentActivity2, "upi-get-vpa", c28q.A00, false)) {
                        return;
                    }
                    C014406v c014406v2 = indiaUpiPaymentActivity2.A0i;
                    StringBuilder A0P = C000200d.A0P("could not get vpa for jid: ");
                    A0P.append(userJid);
                    A0P.append("; showErrorAndFinish");
                    c014406v2.A07(null, A0P.toString(), null);
                    indiaUpiPaymentActivity2.A1g();
                }
            });
            indiaUpiPaymentActivity.A0f = true;
            indiaUpiPaymentActivity.A12(R.string.register_wait_message);
            return null;
        }
        return c4gi;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity;
        C4GI c4gi = (C4GI) obj;
        if (c4gi != null) {
            indiaUpiPaymentActivity = this.A00;
            ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0E = c4gi.A01;
            ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0F = c4gi.A02;
        } else {
            indiaUpiPaymentActivity = this.A00;
            ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0E = null;
            ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0F = null;
        }
        indiaUpiPaymentActivity.A1v();
    }
}
