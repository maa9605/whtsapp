package X;

import android.content.Context;

/* renamed from: X.4H8 */
/* loaded from: classes3.dex */
public abstract class C4H8 extends C28V {
    public final AnonymousClass496 A00;

    public C4H8(Context context, C018508q c018508q, C0E7 c0e7, C28S c28s, AnonymousClass496 anonymousClass496) {
        super(context, c018508q, c0e7, c28s);
        this.A00 = anonymousClass496;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        A05(c28q);
        AnonymousClass496 anonymousClass496 = this.A00;
        if (anonymousClass496 != null) {
            anonymousClass496.AO5(c28q);
        }
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        A05(c28q);
        AnonymousClass496 anonymousClass496 = this.A00;
        if (anonymousClass496 != null) {
            anonymousClass496.AO5(c28q);
        }
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        C28Q c28q;
        C02590Ca A0D = c02590Ca.A0D("account");
        if (A0D != null) {
            c28q = C28Q.A00(A0D);
        } else {
            c28q = null;
        }
        A05(c28q);
        AnonymousClass496 anonymousClass496 = this.A00;
        if (anonymousClass496 != null) {
            anonymousClass496.AO5(c28q);
        }
    }

    public void A05(C28Q c28q) {
        if (this instanceof C92284Ih) {
            C92284Ih c92284Ih = (C92284Ih) this;
            if (c28q == null) {
                c92284Ih.A00.A08.A05("changePin success");
                return;
            }
            AnonymousClass498 anonymousClass498 = c92284Ih.A00;
            C014406v c014406v = anonymousClass498.A08;
            StringBuilder sb = new StringBuilder("changePin error: ");
            sb.append(c28q);
            c014406v.A05(sb.toString());
            int i = c28q.A00;
            if (i == 1441) {
                anonymousClass498.A0A.A03(c28q.A02);
            } else if (i == 1448) {
                anonymousClass498.A07.A04(c92284Ih.A01.A00.A05, "PIN", c28q);
            }
        } else if (this instanceof C92274Ig) {
            C92274Ig c92274Ig = (C92274Ig) this;
            if (c28q == null) {
                c92274Ig.A00.A08.A05("verifyPinToken success");
                return;
            }
            AnonymousClass498 anonymousClass4982 = c92274Ig.A00;
            C014406v c014406v2 = anonymousClass4982.A08;
            StringBuilder sb2 = new StringBuilder("verifyPinToken error: ");
            sb2.append(c28q);
            c014406v2.A05(sb2.toString());
            int i2 = c28q.A00;
            if (i2 == 1441) {
                anonymousClass4982.A0A.A03(c28q.A02);
            } else if (i2 == 1448) {
                anonymousClass4982.A07.A04(c92274Ig.A01.A00.A05, "PIN", c28q);
            }
        } else if (this instanceof C92264If) {
            C92264If c92264If = (C92264If) this;
            if (c28q == null) {
                AnonymousClass499 anonymousClass499 = c92264If.A00.A0A;
                anonymousClass499.A02();
                anonymousClass499.A03(0L);
            } else if (c28q.A00 == 1448) {
                c92264If.A00.A07.A04(c92264If.A01.A00.A05, "PIN", c28q);
            }
        } else if (!(this instanceof C92254Ie)) {
            C92244Id c92244Id = (C92244Id) this;
            if (c28q == null) {
                AnonymousClass498 anonymousClass4983 = c92244Id.A00;
                anonymousClass4983.A08.A05("setFingerprintFromPin success");
                anonymousClass4983.A09.A04(c92244Id.A02);
                return;
            }
            AnonymousClass498 anonymousClass4984 = c92244Id.A00;
            C014406v c014406v3 = anonymousClass4984.A08;
            StringBuilder sb3 = new StringBuilder("setFingerprintFromPin error: ");
            sb3.append(c28q);
            c014406v3.A05(sb3.toString());
            anonymousClass4984.A09.A03();
            int i3 = c28q.A00;
            if (i3 == 1441) {
                anonymousClass4984.A0A.A03(c28q.A02);
            } else if (i3 != 1448) {
            } else {
                anonymousClass4984.A07.A04(c92244Id.A01.A00.A05, "PIN", c28q);
            }
        } else {
            C92254Ie c92254Ie = (C92254Ie) this;
            if (c28q == null) {
                AnonymousClass498 anonymousClass4985 = c92254Ie.A00;
                anonymousClass4985.A08.A05("deleteFingerprint success");
                anonymousClass4985.A09.A03();
                return;
            }
            AnonymousClass498 anonymousClass4986 = c92254Ie.A00;
            C014406v c014406v4 = anonymousClass4986.A08;
            StringBuilder sb4 = new StringBuilder("deleteFingerprint error: ");
            sb4.append(c28q);
            c014406v4.A05(sb4.toString());
            int i4 = c28q.A00;
            if (i4 == 1441) {
                anonymousClass4986.A09.A04(c92254Ie.A02);
                anonymousClass4986.A0A.A03(c28q.A02);
            } else if (i4 == 1440 || i4 == 445) {
                anonymousClass4986.A09.A04(c92254Ie.A02);
            } else if (i4 == 1448) {
                anonymousClass4986.A09.A04(c92254Ie.A02);
                anonymousClass4986.A07.A04(c92254Ie.A01.A00.A05, "PIN", c28q);
            }
        }
    }
}
