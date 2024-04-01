package X;

import android.content.Context;

/* renamed from: X.4Gn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91844Gn extends C28V {
    public final /* synthetic */ C48M A00;
    public final /* synthetic */ C48N A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91844Gn(C48N c48n, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s, String str, C48M c48m, String str2) {
        super(context, c018508q, c0e7, c28s);
        this.A01 = c48n;
        this.A02 = str;
        this.A00 = c48m;
        this.A03 = str2;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        C014406v c014406v = this.A01.A06;
        StringBuilder A0P = C000200d.A0P("PaymentKycAction ");
        A0P.append(this.A02);
        A0P.append(": onRequestError: ");
        A0P.append(c28q);
        c014406v.A04(A0P.toString());
        C48M c48m = this.A00;
        if (c48m != null) {
            c48m.ALG(c28q);
        }
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        C014406v c014406v = this.A01.A06;
        StringBuilder A0P = C000200d.A0P("PaymentKycAction ");
        A0P.append(this.A02);
        A0P.append(": onResponseError: ");
        A0P.append(c28q);
        c014406v.A04(A0P.toString());
        C48M c48m = this.A00;
        if (c48m != null) {
            c48m.ALG(c28q);
        }
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        C02590Ca A0D = c02590Ca.A0D("account");
        if (A0D == null) {
            C014406v c014406v = this.A01.A06;
            StringBuilder A0P = C000200d.A0P("PaymentKycAction ");
            A0P.append(this.A02);
            A0P.append(": onResponseSuccess: missing account node");
            c014406v.A04(A0P.toString());
            C48M c48m = this.A00;
            if (c48m != null) {
                c48m.ALG(new C28Q());
                return;
            }
            return;
        }
        C28Q A00 = C28Q.A00(A0D);
        if (A00 != null) {
            C48N c48n = this.A01;
            C014406v c014406v2 = c48n.A06;
            StringBuilder A0P2 = C000200d.A0P("PaymentKycAction ");
            A0P2.append(this.A02);
            A0P2.append(": onResponseSuccess: account-node error: ");
            A0P2.append(A00);
            c014406v2.A04(A0P2.toString());
            if (A00.A00 == 1448) {
                c48n.A05.A04(this.A03, "KYC", A00);
            }
            C48M c48m2 = this.A00;
            if (c48m2 != null) {
                c48m2.ALG(A00);
                return;
            }
            return;
        }
        C0KK A002 = C0KK.A00(A0D);
        if (A002 != null) {
            C48M c48m3 = this.A00;
            if (c48m3 != null) {
                c48m3.ALH(A002);
                return;
            }
            return;
        }
        this.A01.A06.A04("PaymentKycAction/createCallback PaymentKycInfo is null");
        C48M c48m4 = this.A00;
        if (c48m4 == null) {
            return;
        }
        c48m4.ALG(new C28Q());
    }
}
