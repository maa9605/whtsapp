package X;

import android.text.TextUtils;

/* renamed from: X.4Fh */
/* loaded from: classes3.dex */
public class C91534Fh extends C0MU {
    public String A03;
    public boolean A04;
    public final C01B A05;
    public final C002301c A06;
    public final AnonymousClass483 A07;
    public final C4AU A08;
    public C461825l A02 = new C461825l();
    public C0HK A01 = new C0HK();
    public C0HK A00 = new C0HK();

    public C91534Fh(C01B c01b, C4AU c4au, C002301c c002301c, AnonymousClass483 anonymousClass483) {
        this.A05 = c01b;
        this.A08 = c4au;
        this.A06 = c002301c;
        this.A07 = anonymousClass483;
    }

    public static void A00(C91534Fh c91534Fh) {
        if (c91534Fh.A05.A0E(C01C.A1w) && !TextUtils.isEmpty(c91534Fh.A02().A08)) {
            AnonymousClass483 anonymousClass483 = c91534Fh.A07;
            C4CF c4cf = new C4CF(anonymousClass483.A02.A00, anonymousClass483.A01, anonymousClass483.A07, new C3NV(), anonymousClass483.A00, anonymousClass483.A06);
            String str = c91534Fh.A02().A02;
            final C78543k7 c78543k7 = new C78543k7(c91534Fh);
            ((C48B) c4cf).A01.A0F("get", new C02590Ca("account", new C04P[]{new C04P("action", "upi-verify-qr-code", null, (byte) 0), new C04P("signed-qr-code", str, null, (byte) 0)}, null, null), new C91754Gd(c4cf.A00, c4cf.A01, c4cf.A02, c4cf.A03, ((C48B) c4cf).A00) { // from class: X.4IX
                @Override // X.C91754Gd, X.C28V
                public void A02(C28Q c28q) {
                    super.A02(c28q);
                    c78543k7.A00.A06(c28q);
                }

                @Override // X.C91754Gd, X.C28V
                public void A03(C28Q c28q) {
                    super.A03(c28q);
                    c78543k7.A00.A06(c28q);
                }

                @Override // X.C91754Gd, X.C28V
                public void A04(C02590Ca c02590Ca) {
                    super.A04(c02590Ca);
                    c78543k7.A00.A06(null);
                }
            }, 0L);
            return;
        }
        c91534Fh.A01.A0B(Boolean.FALSE);
        c91534Fh.A03();
    }

    public C49E A02() {
        Object A01 = this.A00.A01();
        if (A01 != null) {
            return (C49E) A01;
        }
        throw null;
    }

    public final void A03() {
        if (this.A05.A0E(C01C.A1z) && A02().A0C && !TextUtils.isEmpty(A02().A07)) {
            this.A02.A0B(new C4AZ(3));
        } else {
            A04();
        }
    }

    public final void A04() {
        C4AZ c4az = new C4AZ(5);
        c4az.A03 = !TextUtils.isEmpty(A02().A04);
        c4az.A04 = "PAY_INTENT".equals(this.A03);
        this.A02.A0B(c4az);
    }

    public void A05(int i) {
        if (i == 1) {
            A03();
        } else if (i == 2) {
            A04();
        } else if (i != 3) {
            if (i == 4) {
                this.A04 = true;
                this.A02.A0B(new C4AZ(6));
            }
        } else if (!this.A04) {
            this.A02.A0B(new C4AZ(0));
        } else {
            this.A04 = false;
        }
    }

    public /* synthetic */ void A06(C28Q c28q) {
        this.A01.A0B(Boolean.FALSE);
        if (c28q != null) {
            this.A02.A0B(new C4AZ(4));
        } else {
            A03();
        }
    }
}
