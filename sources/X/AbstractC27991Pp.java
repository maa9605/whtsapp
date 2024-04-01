package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.1Pp */
/* loaded from: classes.dex */
public abstract class AbstractC27991Pp {
    public final C03750Gx A00;

    public AbstractC27991Pp(C03750Gx c03750Gx) {
        this.A00 = c03750Gx;
    }

    public String A01(AnonymousClass093 anonymousClass093) {
        String A0C;
        C03750Gx c03750Gx = this.A00;
        C014406v c014406v = c03750Gx.A08;
        StringBuilder A0P = C000200d.A0P("getStatusChangeNotifStringWithoutMessage status:");
        A0P.append(anonymousClass093.A01);
        A0P.append(" type:");
        A0P.append(anonymousClass093.A02);
        c014406v.A07(null, A0P.toString(), null);
        C014006r c014006r = anonymousClass093.A07;
        int intValue = c014006r == null ? 1 : c014006r.A00.intValue();
        if (anonymousClass093.A07 == null) {
            A0C = c03750Gx.A04.A00.getString(R.string.unknown_amount_payment);
        } else {
            A0C = c03750Gx.A0C(anonymousClass093);
        }
        int i = anonymousClass093.A02;
        if (i != 1) {
            if (i != 2) {
                if (i == 10) {
                    int i2 = anonymousClass093.A01;
                    if (i2 == 13 || i2 == 14) {
                        return c03750Gx.A04.A00.getString(R.string.payments_request_message_from_me_failed, c03750Gx.A0K(anonymousClass093));
                    }
                    if (i2 == 16) {
                        return c03750Gx.A04.A00.getString(R.string.payments_request_message_from_me_expired, c03750Gx.A0K(anonymousClass093));
                    }
                    if (i2 != 15) {
                        return "";
                    }
                    return c03750Gx.A04.A00.getString(R.string.payments_request_message_from_me_rejected, c03750Gx.A0K(anonymousClass093));
                } else if (i == 20) {
                    if (anonymousClass093.A01 != 12) {
                        return "";
                    }
                    return c03750Gx.A04.A00.getString(R.string.payments_request_message_to_me_success, c03750Gx.A0H(anonymousClass093), A0C);
                } else if (i != 100) {
                    if (i != 200) {
                        return "";
                    }
                }
            }
            return c03750Gx.A04.A00.getResources().getQuantityString(R.plurals.payments_transaction_message_generic_success, intValue, c03750Gx.A0K(anonymousClass093), A0C, c03750Gx.A0H(anonymousClass093));
        }
        String A0H = c03750Gx.A0H(anonymousClass093);
        String A0K = c03750Gx.A0K(anonymousClass093);
        int i3 = anonymousClass093.A01;
        C0K8 c0k8 = anonymousClass093.A09;
        return c03750Gx.A0Q(true, A0H, A0K, i3, c0k8 == null ? 0 : c0k8.A06(), 0L, anonymousClass093.A05, c03750Gx.A0C(anonymousClass093), intValue);
    }
}
