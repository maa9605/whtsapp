package X;

import com.google.android.search.verification.client.R;
import java.util.AbstractCollection;

/* renamed from: X.4EA  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4EA implements InterfaceC03640Gm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C28T A01;
    public final /* synthetic */ C4KP A02;

    public C4EA(C4KP c4kp, C28T c28t, int i) {
        this.A02 = c4kp;
        this.A01 = c28t;
        this.A00 = i;
    }

    @Override // X.InterfaceC03640Gm
    public void ANw(C28Q c28q) {
        C4KP c4kp = this.A02;
        C014406v c014406v = c4kp.A0H;
        StringBuilder sb = new StringBuilder("removePayment/onRequestError. paymentNetworkError: ");
        sb.append(c28q);
        c014406v.A03(sb.toString());
        C28T c28t = this.A01;
        if (c28t != null) {
            c28t.AG6(this.A00, c28q);
        }
        c4kp.ARS();
        c4kp.AUj(R.string.payment_method_cannot_be_removed);
    }

    @Override // X.InterfaceC03640Gm
    public void AO1(C28Q c28q) {
        C4KP c4kp = this.A02;
        C014406v c014406v = c4kp.A0H;
        StringBuilder sb = new StringBuilder("removePayment/onResponseError. paymentNetworkError: ");
        sb.append(c28q);
        c014406v.A07(null, sb.toString(), null);
        C28T c28t = this.A01;
        if (c28t != null) {
            c28t.AG6(this.A00, c28q);
        }
        c4kp.ARS();
        c4kp.AUj(R.string.payment_method_cannot_be_removed);
    }

    @Override // X.InterfaceC03640Gm
    public void AO2(C468228k c468228k) {
        C4KP c4kp = this.A02;
        c4kp.A0H.A07(null, "removePayment Success", null);
        C28T c28t = this.A01;
        if (c28t != null) {
            c28t.AG6(this.A00, null);
        }
        C0DV c0dv = c4kp.A0C;
        c0dv.A04();
        if (((AbstractCollection) c0dv.A08.A0A()).size() < 1) {
            C0GZ c0gz = c4kp.A09;
            c0gz.A04(c0gz.A01("add_card"));
        }
        c4kp.ARS();
        c4kp.AUj(R.string.payment_method_is_removed);
    }
}
