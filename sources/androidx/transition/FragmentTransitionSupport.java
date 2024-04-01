package androidx.transition;

import X.AbstractC09380dB;
import X.AbstractC16100pq;
import X.AbstractC16120ps;
import X.C16140pu;
import X.C1V1;
import X.InterfaceC16110pr;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FragmentTransitionSupport extends AbstractC09380dB {
    @Override // X.AbstractC09380dB
    public Object A04(Object obj) {
        if (obj != null) {
            return ((AbstractC16120ps) obj).clone();
        }
        return null;
    }

    @Override // X.AbstractC09380dB
    public Object A05(Object obj) {
        if (obj == null) {
            return null;
        }
        C1V1 c1v1 = new C1V1();
        c1v1.A0W((AbstractC16120ps) obj);
        return c1v1;
    }

    @Override // X.AbstractC09380dB
    public Object A06(Object obj, Object obj2, Object obj3) {
        C1V1 c1v1 = new C1V1();
        if (obj != null) {
            c1v1.A0W((AbstractC16120ps) obj);
        }
        if (obj2 != null) {
            c1v1.A0W((AbstractC16120ps) obj2);
        }
        if (obj3 != null) {
            c1v1.A0W((AbstractC16120ps) obj3);
        }
        return c1v1;
    }

    @Override // X.AbstractC09380dB
    public void A07(ViewGroup viewGroup, Object obj) {
        C16140pu.A01(viewGroup, (AbstractC16120ps) obj);
    }

    @Override // X.AbstractC09380dB
    public void A09(Object obj, final Rect rect) {
        if (obj != null) {
            ((AbstractC16120ps) obj).A0M(new AbstractC16100pq() { // from class: X.1Uv
                @Override // X.AbstractC16100pq
                public Rect A00(AbstractC16120ps abstractC16120ps) {
                    Rect rect2 = rect;
                    if (rect2 == null || rect2.isEmpty()) {
                        return null;
                    }
                    return rect2;
                }
            });
        }
    }

    @Override // X.AbstractC09380dB
    public void A0A(Object obj, View view) {
        if (obj != null) {
            ((AbstractC16120ps) obj).A05(view);
        }
    }

    @Override // X.AbstractC09380dB
    public void A0B(Object obj, View view) {
        if (obj != null) {
            ((AbstractC16120ps) obj).A06(view);
        }
    }

    @Override // X.AbstractC09380dB
    public void A0C(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            AbstractC09380dB.A00(view, rect);
            ((AbstractC16120ps) obj).A0M(new AbstractC16100pq() { // from class: X.1Us
                @Override // X.AbstractC16100pq
                public Rect A00(AbstractC16120ps abstractC16120ps) {
                    return rect;
                }
            });
        }
    }

    @Override // X.AbstractC09380dB
    public void A0D(Object obj, final View view, final ArrayList arrayList) {
        ((AbstractC16120ps) obj).A07(new InterfaceC16110pr() { // from class: X.1Ut
            @Override // X.InterfaceC16110pr
            public void APv(AbstractC16120ps abstractC16120ps) {
            }

            @Override // X.InterfaceC16110pr
            public void APw(AbstractC16120ps abstractC16120ps) {
            }

            @Override // X.InterfaceC16110pr
            public void APx(AbstractC16120ps abstractC16120ps) {
            }

            @Override // X.InterfaceC16110pr
            public void APu(AbstractC16120ps abstractC16120ps) {
                abstractC16120ps.A08(this);
                view.setVisibility(8);
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList2.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // X.AbstractC09380dB
    public void A0E(Object obj, View view, ArrayList arrayList) {
        AbstractC16120ps abstractC16120ps = (AbstractC16120ps) obj;
        ArrayList arrayList2 = abstractC16120ps.A0H;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC09380dB.A01(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        A0G(abstractC16120ps, arrayList);
    }

    @Override // X.AbstractC09380dB
    public void A0F(Object obj, final Object obj2, final ArrayList arrayList, final Object obj3, final ArrayList arrayList2, final Object obj4, final ArrayList arrayList3) {
        ((AbstractC16120ps) obj).A07(new InterfaceC16110pr() { // from class: X.1Uu
            @Override // X.InterfaceC16110pr
            public void APu(AbstractC16120ps abstractC16120ps) {
            }

            @Override // X.InterfaceC16110pr
            public void APv(AbstractC16120ps abstractC16120ps) {
            }

            @Override // X.InterfaceC16110pr
            public void APw(AbstractC16120ps abstractC16120ps) {
            }

            @Override // X.InterfaceC16110pr
            public void APx(AbstractC16120ps abstractC16120ps) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    FragmentTransitionSupport.this.A0H(obj5, arrayList, null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    FragmentTransitionSupport.this.A0H(obj6, arrayList2, null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    FragmentTransitionSupport.this.A0H(obj7, arrayList3, null);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r1 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r1 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r1 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
        if (r1 != false) goto L45;
     */
    @Override // X.AbstractC09380dB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0G(java.lang.Object r5, java.util.ArrayList r6) {
        /*
            r4 = this;
            X.0ps r5 = (X.AbstractC16120ps) r5
            if (r5 != 0) goto L5
            return
        L5:
            boolean r0 = r5 instanceof X.C1V1
            r2 = 0
            if (r0 == 0) goto L2a
            X.1V1 r5 = (X.C1V1) r5
            java.util.ArrayList r0 = r5.A02
            int r3 = r0.size()
        L12:
            if (r2 >= r3) goto L72
            if (r2 < 0) goto L28
            java.util.ArrayList r1 = r5.A02
            int r0 = r1.size()
            if (r2 >= r0) goto L28
            java.lang.Object r0 = r1.get(r2)
        L22:
            r4.A0G(r0, r6)
            int r2 = r2 + 1
            goto L12
        L28:
            r0 = 0
            goto L22
        L2a:
            java.util.ArrayList r0 = r5.A0G
            if (r0 == 0) goto L35
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L36
        L35:
            r0 = 1
        L36:
            if (r0 == 0) goto L72
            r0 = 0
            if (r0 == 0) goto L42
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L43
        L42:
            r0 = 1
        L43:
            if (r0 == 0) goto L72
            r0 = 0
            if (r0 == 0) goto L4f
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L50
        L4f:
            r0 = 1
        L50:
            if (r0 == 0) goto L72
            java.util.ArrayList r0 = r5.A0H
            if (r0 == 0) goto L5d
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L5e
        L5d:
            r0 = 1
        L5e:
            if (r0 == 0) goto L72
            int r1 = r6.size()
        L64:
            if (r2 >= r1) goto L72
            java.lang.Object r0 = r6.get(r2)
            android.view.View r0 = (android.view.View) r0
            r5.A05(r0)
            int r2 = r2 + 1
            goto L64
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.FragmentTransitionSupport.A0G(java.lang.Object, java.util.ArrayList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r1 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r1 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
        if (r1 != false) goto L49;
     */
    @Override // X.AbstractC09380dB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0H(java.lang.Object r5, java.util.ArrayList r6, java.util.ArrayList r7) {
        /*
            r4 = this;
            X.0ps r5 = (X.AbstractC16120ps) r5
            boolean r0 = r5 instanceof X.C1V1
            r3 = 0
            if (r0 == 0) goto L27
            X.1V1 r5 = (X.C1V1) r5
            java.util.ArrayList r0 = r5.A02
            int r2 = r0.size()
        Lf:
            if (r3 >= r2) goto L87
            if (r3 < 0) goto L25
            java.util.ArrayList r1 = r5.A02
            int r0 = r1.size()
            if (r3 >= r0) goto L25
            java.lang.Object r0 = r1.get(r3)
        L1f:
            r4.A0H(r0, r6, r7)
            int r3 = r3 + 1
            goto Lf
        L25:
            r0 = 0
            goto L1f
        L27:
            java.util.ArrayList r0 = r5.A0G
            if (r0 == 0) goto L32
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L33
        L32:
            r0 = 1
        L33:
            if (r0 == 0) goto L87
            r0 = 0
            if (r0 == 0) goto L3f
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L40
        L3f:
            r0 = 1
        L40:
            if (r0 == 0) goto L87
            r0 = 0
            if (r0 == 0) goto L4c
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L4d
        L4c:
            r0 = 1
        L4d:
            if (r0 == 0) goto L87
            java.util.ArrayList r2 = r5.A0H
            int r1 = r2.size()
            int r0 = r6.size()
            if (r1 != r0) goto L87
            boolean r0 = r2.containsAll(r6)
            if (r0 == 0) goto L87
            if (r7 == 0) goto L75
            int r1 = r7.size()
        L67:
            if (r3 >= r1) goto L75
            java.lang.Object r0 = r7.get(r3)
            android.view.View r0 = (android.view.View) r0
            r5.A05(r0)
            int r3 = r3 + 1
            goto L67
        L75:
            int r1 = r6.size()
        L79:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L87
            java.lang.Object r0 = r6.get(r1)
            android.view.View r0 = (android.view.View) r0
            r5.A06(r0)
            goto L79
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.FragmentTransitionSupport.A0H(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void");
    }

    @Override // X.AbstractC09380dB
    public void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC16120ps abstractC16120ps = (AbstractC16120ps) obj;
        if (abstractC16120ps != null) {
            abstractC16120ps.A0H.clear();
            abstractC16120ps.A0H.addAll(arrayList2);
            A0H(abstractC16120ps, arrayList, arrayList2);
        }
    }

    @Override // X.AbstractC09380dB
    public boolean A0J(Object obj) {
        return obj instanceof AbstractC16120ps;
    }
}
