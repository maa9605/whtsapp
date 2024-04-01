package X;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1V1  reason: invalid class name */
/* loaded from: classes.dex */
public class C1V1 extends AbstractC16120ps {
    public int A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03 = true;
    public boolean A04 = false;
    public int A00 = 0;

    @Override // X.AbstractC16120ps
    public AbstractC16120ps A02() {
        C1V1 c1v1 = (C1V1) super.clone();
        c1v1.A02 = new ArrayList();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            c1v1.A0W(((AbstractC16120ps) this.A02.get(i)).clone());
        }
        return c1v1;
    }

    @Override // X.AbstractC16120ps
    public AbstractC16120ps A03(long j) {
        super.A01 = j;
        if (j >= 0) {
            ArrayList arrayList = this.A02;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC16120ps) arrayList.get(i)).A03(j);
            }
        }
        return this;
    }

    @Override // X.AbstractC16120ps
    public AbstractC16120ps A04(TimeInterpolator timeInterpolator) {
        this.A00 |= 1;
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC16120ps) arrayList.get(i)).A04(timeInterpolator);
            }
        }
        super.A03 = timeInterpolator;
        return this;
    }

    @Override // X.AbstractC16120ps
    public /* bridge */ /* synthetic */ AbstractC16120ps A05(View view) {
        A0V(view);
        return this;
    }

    @Override // X.AbstractC16120ps
    public AbstractC16120ps A06(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AbstractC16120ps) arrayList.get(i)).A06(view);
                i++;
            } else {
                this.A0H.remove(view);
                return this;
            }
        }
    }

    @Override // X.AbstractC16120ps
    public AbstractC16120ps A07(InterfaceC16110pr interfaceC16110pr) {
        super.A07(interfaceC16110pr);
        return this;
    }

    @Override // X.AbstractC16120ps
    public AbstractC16120ps A08(InterfaceC16110pr interfaceC16110pr) {
        super.A08(interfaceC16110pr);
        return this;
    }

    @Override // X.AbstractC16120ps
    public String A0B(String str) {
        String A0B = super.A0B(str);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i >= arrayList.size()) {
                return A0B;
            }
            StringBuilder A0V = C000200d.A0V(A0B, "\n");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            A0V.append(((AbstractC16120ps) arrayList.get(i)).A0B(sb.toString()));
            A0B = A0V.toString();
            i++;
        }
    }

    @Override // X.AbstractC16120ps
    public void A0D() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A02;
        if (arrayList2.isEmpty()) {
            A0E();
            A0C();
            return;
        }
        C1V0 c1v0 = new C1V0(this) { // from class: X.1ow
            public C1V1 A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC16110pr
            public void APu(AbstractC16120ps abstractC16120ps) {
                C1V1 c1v1 = this.A00;
                int i = c1v1.A01 - 1;
                c1v1.A01 = i;
                if (i == 0) {
                    c1v1.A04 = false;
                    c1v1.A0C();
                }
                abstractC16120ps.A08(this);
            }

            @Override // X.C1V0, X.InterfaceC16110pr
            public void APx(AbstractC16120ps abstractC16120ps) {
                C1V1 c1v1 = this.A00;
                if (c1v1.A04) {
                    return;
                }
                c1v1.A0E();
                this.A00.A04 = true;
            }
        };
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC16120ps) it.next()).A07(c1v0);
        }
        ArrayList arrayList3 = this.A02;
        this.A01 = arrayList3.size();
        if (this.A03) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((AbstractC16120ps) it2.next()).A0D();
            }
            return;
        }
        int i = 1;
        while (true) {
            arrayList = this.A02;
            if (i >= arrayList.size()) {
                break;
            }
            final AbstractC16120ps abstractC16120ps = (AbstractC16120ps) arrayList.get(i);
            ((AbstractC16120ps) arrayList.get(i - 1)).A07(new C1V0() { // from class: X.1ov
                @Override // X.InterfaceC16110pr
                public void APu(AbstractC16120ps abstractC16120ps2) {
                    abstractC16120ps.A0D();
                    abstractC16120ps2.A08(this);
                }
            });
            i++;
        }
        AbstractC16120ps abstractC16120ps2 = (AbstractC16120ps) arrayList.get(0);
        if (abstractC16120ps2 != null) {
            abstractC16120ps2.A0D();
        }
    }

    @Override // X.AbstractC16120ps
    public void A0F(View view) {
        super.A0F(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16120ps) this.A02.get(i)).A0F(view);
        }
    }

    @Override // X.AbstractC16120ps
    public void A0G(View view) {
        super.A0G(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16120ps) this.A02.get(i)).A0G(view);
        }
    }

    @Override // X.AbstractC16120ps
    public void A0I(ViewGroup viewGroup, C16170px c16170px, C16170px c16170px2, ArrayList arrayList, ArrayList arrayList2) {
        long j = super.A02;
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            AbstractC16120ps abstractC16120ps = (AbstractC16120ps) this.A02.get(i);
            if (j > 0 && (this.A03 || i == 0)) {
                long j2 = abstractC16120ps.A02;
                if (j2 > 0) {
                    abstractC16120ps.A02 = j2 + j;
                } else {
                    abstractC16120ps.A02 = j;
                }
            }
            abstractC16120ps.A0I(viewGroup, c16170px, c16170px2, arrayList, arrayList2);
        }
    }

    @Override // X.AbstractC16120ps
    public void A0K(AbstractC16030pj abstractC16030pj) {
        if (abstractC16030pj == null) {
            super.A04 = AbstractC16120ps.A0M;
        } else {
            super.A04 = abstractC16030pj;
        }
        this.A00 |= 4;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AbstractC16120ps) arrayList.get(i)).A0K(abstractC16030pj);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC16120ps
    public void A0L(C29031Uw c29031Uw) {
        this.A05 = c29031Uw;
        this.A00 |= 2;
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16120ps) arrayList.get(i)).A0L(c29031Uw);
        }
    }

    @Override // X.AbstractC16120ps
    public void A0M(AbstractC16100pq abstractC16100pq) {
        this.A06 = abstractC16100pq;
        this.A00 |= 8;
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16120ps) arrayList.get(i)).A0M(abstractC16100pq);
        }
    }

    @Override // X.AbstractC16120ps
    public void A0N(C16160pw c16160pw) {
        super.A0N(c16160pw);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16120ps) this.A02.get(i)).A0N(c16160pw);
        }
    }

    @Override // X.AbstractC16120ps
    public void A0T(C16160pw c16160pw) {
        if (A0P(c16160pw.A00)) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                AbstractC16120ps abstractC16120ps = (AbstractC16120ps) it.next();
                if (abstractC16120ps.A0P(c16160pw.A00)) {
                    abstractC16120ps.A0T(c16160pw);
                    c16160pw.A01.add(abstractC16120ps);
                }
            }
        }
    }

    @Override // X.AbstractC16120ps
    public void A0U(C16160pw c16160pw) {
        if (A0P(c16160pw.A00)) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                AbstractC16120ps abstractC16120ps = (AbstractC16120ps) it.next();
                if (abstractC16120ps.A0P(c16160pw.A00)) {
                    abstractC16120ps.A0U(c16160pw);
                    c16160pw.A01.add(abstractC16120ps);
                }
            }
        }
    }

    public void A0V(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AbstractC16120ps) arrayList.get(i)).A05(view);
                i++;
            } else {
                this.A0H.add(view);
                return;
            }
        }
    }

    public void A0W(AbstractC16120ps abstractC16120ps) {
        this.A02.add(abstractC16120ps);
        abstractC16120ps.A07 = this;
        long j = super.A01;
        if (j >= 0) {
            abstractC16120ps.A03(j);
        }
        if ((this.A00 & 1) != 0) {
            abstractC16120ps.A04(super.A03);
        }
        if ((this.A00 & 2) != 0) {
            abstractC16120ps.A0L(this.A05);
        }
        if ((this.A00 & 4) != 0) {
            abstractC16120ps.A0K(super.A04);
        }
        if ((this.A00 & 8) != 0) {
            abstractC16120ps.A0M(this.A06);
        }
    }
}
