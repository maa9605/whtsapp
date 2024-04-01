package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0ZS */
/* loaded from: classes.dex */
public abstract class C0ZS extends C0ZT {
    public final AbstractC02800Cx A03;
    public C0D0 A01 = null;
    public C0BA A00 = null;
    public final int A02 = 0;

    public long A0F(int i) {
        return i;
    }

    public abstract C0BA A0G(int i);

    public C0ZS(AbstractC02800Cx abstractC02800Cx) {
        this.A03 = abstractC02800Cx;
    }

    public C0ZS(AbstractC02800Cx abstractC02800Cx, int i) {
        this.A03 = abstractC02800Cx;
    }

    @Override // X.C0ZT
    public void A08(ViewGroup viewGroup) {
        C0D0 c0d0 = this.A01;
        if (c0d0 != null) {
            try {
                c0d0.A08();
            } catch (IllegalStateException unused) {
                this.A01.A05();
            }
            this.A01 = null;
        }
    }

    @Override // X.C0ZT
    public void A09(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        StringBuilder sb = new StringBuilder("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.C0ZT
    public void A0A(ViewGroup viewGroup, int i, Object obj) {
        C0BA c0ba = (C0BA) obj;
        C0BA c0ba2 = this.A00;
        if (c0ba != c0ba2) {
            if (c0ba2 != null) {
                c0ba2.A0U(false);
                if (this.A02 == 1) {
                    C0D0 c0d0 = this.A01;
                    if (c0d0 == null) {
                        AbstractC02800Cx abstractC02800Cx = this.A03;
                        if (abstractC02800Cx != null) {
                            c0d0 = new C02820Cz(abstractC02800Cx);
                            this.A01 = c0d0;
                        } else {
                            throw null;
                        }
                    }
                    c0d0.A07(this.A00, EnumC02560Bx.STARTED);
                } else {
                    this.A00.A0V(false);
                }
            }
            c0ba.A0U(true);
            if (this.A02 == 1) {
                C0D0 c0d02 = this.A01;
                if (c0d02 == null) {
                    AbstractC02800Cx abstractC02800Cx2 = this.A03;
                    if (abstractC02800Cx2 != null) {
                        c0d02 = new C02820Cz(abstractC02800Cx2);
                        this.A01 = c0d02;
                    } else {
                        throw null;
                    }
                }
                c0d02.A07(c0ba, EnumC02560Bx.RESUMED);
            } else {
                c0ba.A0V(true);
            }
            this.A00 = c0ba;
        }
    }

    @Override // X.C0ZT
    public Object A0C(ViewGroup viewGroup, int i) {
        if (this.A01 == null) {
            AbstractC02800Cx abstractC02800Cx = this.A03;
            if (abstractC02800Cx != null) {
                this.A01 = new C02820Cz(abstractC02800Cx);
            } else {
                throw null;
            }
        }
        long A0F = A0F(i);
        int id = viewGroup.getId();
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(id);
        sb.append(":");
        sb.append(A0F);
        C0BA A01 = this.A03.A0Q.A01(sb.toString());
        if (A01 != null) {
            this.A01.A02(new C09320d3(7, A01));
        } else {
            A01 = A0G(i);
            C0D0 c0d0 = this.A01;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder sb2 = new StringBuilder("android:switcher:");
            sb2.append(id3);
            sb2.append(":");
            sb2.append(A0F);
            c0d0.A09(id2, A01, sb2.toString(), 1);
        }
        if (A01 != this.A00) {
            A01.A0U(false);
            if (this.A02 == 1) {
                this.A01.A07(A01, EnumC02560Bx.STARTED);
            } else {
                A01.A0V(false);
                return A01;
            }
        }
        return A01;
    }

    @Override // X.C0ZT
    public void A0D(ViewGroup viewGroup, int i, Object obj) {
        C0BA c0ba = (C0BA) obj;
        C0D0 c0d0 = this.A01;
        if (c0d0 == null) {
            AbstractC02800Cx abstractC02800Cx = this.A03;
            if (abstractC02800Cx != null) {
                c0d0 = new C02820Cz(abstractC02800Cx);
                this.A01 = c0d0;
            } else {
                throw null;
            }
        }
        C02820Cz c02820Cz = (C02820Cz) c0d0;
        if (c02820Cz != null) {
            AbstractC02800Cx abstractC02800Cx2 = c0ba.A0H;
            if (abstractC02800Cx2 != null && abstractC02800Cx2 != c02820Cz.A02) {
                StringBuilder A0P = C000200d.A0P("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
                A0P.append(c0ba.toString());
                A0P.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(A0P.toString());
            }
            c02820Cz.A02(new C09320d3(6, c0ba));
            if (c0ba.equals(this.A00)) {
                this.A00 = null;
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.C0ZT
    public boolean A0E(View view, Object obj) {
        return ((C0BA) obj).A0A == view;
    }
}
