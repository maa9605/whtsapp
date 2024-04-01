package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2LD  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2LD extends C0TQ {
    public static final TimeInterpolator A0B = new ValueAnimator().getInterpolator();
    public List A09 = new ArrayList();
    public List A06 = new ArrayList();
    public List A08 = new ArrayList();
    public List A07 = new ArrayList();
    public List A01 = new ArrayList();
    public List A05 = new ArrayList();
    public List A03 = new ArrayList();
    public List A00 = new ArrayList();
    public List A04 = new ArrayList();
    public List A0A = new ArrayList();
    public List A02 = new ArrayList();

    public C2LD() {
        ((C0TR) this).A00 = 240L;
        super.A01 = 240L;
        super.A02 = 240L;
        super.A03 = 240L;
        ((C0TQ) this).A00 = false;
    }

    public static final void A02(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0AT.A0E(((C0TS) list.get(size)).A0H).A00();
        }
    }

    @Override // X.C0TR
    public void A05() {
        int size = this.A08.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C2LG c2lg = (C2LG) this.A08.get(size);
            View view = c2lg.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A03(c2lg.A04);
            this.A08.remove(size);
        }
        int size2 = this.A09.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A03((C0TS) this.A09.get(size2));
            this.A09.remove(size2);
        }
        int size3 = this.A06.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0TS c0ts = (C0TS) this.A06.get(size3);
            View view2 = c0ts.A0H;
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            A03(c0ts);
            this.A06.remove(size3);
        }
        int size4 = this.A07.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C2LI c2li = (C2LI) this.A07.get(size4);
            C0TS c0ts2 = c2li.A05;
            if (c0ts2 != null) {
                A0G(c2li, c0ts2);
            }
            C0TS c0ts3 = c2li.A04;
            if (c0ts3 != null) {
                A0G(c2li, c0ts3);
            }
        }
        this.A07.clear();
        if (!A08()) {
            return;
        }
        int size5 = this.A05.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            List list = (List) this.A05.get(size5);
            int size6 = list.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C2LG c2lg2 = (C2LG) list.get(size6);
                    View view3 = c2lg2.A04.A0H;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    A03(c2lg2.A04);
                    list.remove(size6);
                    if (list.isEmpty()) {
                        this.A05.remove(list);
                    }
                }
            }
        }
        int size7 = this.A01.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            List list2 = (List) this.A01.get(size7);
            int size8 = list2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    C0TS c0ts4 = (C0TS) list2.get(size8);
                    View view4 = c0ts4.A0H;
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                    A03(c0ts4);
                    list2.remove(size8);
                    if (list2.isEmpty()) {
                        this.A01.remove(list2);
                    }
                }
            }
        }
        int size9 = this.A03.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                List list3 = (List) this.A03.get(size9);
                int size10 = list3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        C2LI c2li2 = (C2LI) list3.get(size10);
                        C0TS c0ts5 = c2li2.A05;
                        if (c0ts5 != null) {
                            A0G(c2li2, c0ts5);
                        }
                        C0TS c0ts6 = c2li2.A04;
                        if (c0ts6 != null) {
                            A0G(c2li2, c0ts6);
                        }
                        if (list3.isEmpty()) {
                            this.A03.remove(list3);
                        }
                    }
                }
            } else {
                A02(this.A0A);
                A02(this.A04);
                A02(this.A00);
                A02(this.A02);
                A02();
                return;
            }
        }
    }

    @Override // X.C0TR
    public void A06() {
        long j;
        long j2;
        boolean z = !this.A09.isEmpty();
        boolean z2 = !this.A08.isEmpty();
        boolean z3 = !this.A07.isEmpty();
        boolean z4 = !this.A06.isEmpty();
        if (z || z2 || z4 || z3) {
            for (final C0TS c0ts : this.A09) {
                final C0TT A0E = C0AT.A0E(c0ts.A0H);
                this.A0A.add(c0ts);
                A0E.A04(super.A03);
                View view = (View) A0E.A01.get();
                if (view != null) {
                    view.animate().scaleX(0.0f);
                }
                View view2 = (View) A0E.A01.get();
                if (view2 != null) {
                    view2.animate().scaleY(0.0f);
                }
                C2LF c2lf = new C2LF() { // from class: X.3JB
                    @Override // X.C0TU
                    public void AH8(View view3) {
                        A0E.A06(null);
                        view3.setScaleX(1.0f);
                        view3.setScaleY(1.0f);
                        C2LD c2ld = C2LD.this;
                        C0TS c0ts2 = c0ts;
                        c2ld.A03(c0ts2);
                        c2ld.A0A.remove(c0ts2);
                        if (!c2ld.A08()) {
                            c2ld.A02();
                        }
                    }

                    @Override // X.C0TU
                    public void AHC(View view3) {
                        if (C2LD.this == null) {
                            throw null;
                        }
                    }
                };
                View view3 = (View) A0E.A01.get();
                if (view3 != null) {
                    A0E.A05(view3, c2lf);
                }
                A0E.A01();
            }
            this.A09.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.A08);
                this.A05.add(arrayList);
                this.A08.clear();
                RunnableEBaseShape1S0200000_I0_1 runnableEBaseShape1S0200000_I0_1 = new RunnableEBaseShape1S0200000_I0_1(this, arrayList, 6);
                if (z) {
                    ((C2LG) arrayList.get(0)).A04.A0H.postOnAnimationDelayed(runnableEBaseShape1S0200000_I0_1, super.A03);
                } else {
                    runnableEBaseShape1S0200000_I0_1.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.A07);
                this.A03.add(arrayList2);
                this.A07.clear();
                RunnableEBaseShape1S0200000_I0_1 runnableEBaseShape1S0200000_I0_12 = new RunnableEBaseShape1S0200000_I0_1(this, arrayList2, 5);
                if (z) {
                    ((C2LI) arrayList2.get(0)).A05.A0H.postOnAnimationDelayed(runnableEBaseShape1S0200000_I0_12, super.A03);
                } else {
                    runnableEBaseShape1S0200000_I0_12.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.A06);
                this.A01.add(arrayList3);
                this.A06.clear();
                RunnableEBaseShape1S0200000_I0_1 runnableEBaseShape1S0200000_I0_13 = new RunnableEBaseShape1S0200000_I0_1(this, arrayList3, 4);
                if (!z && !z2 && !z3) {
                    runnableEBaseShape1S0200000_I0_13.run();
                    return;
                }
                long j3 = 0;
                if (z) {
                    j = super.A03;
                } else {
                    j = 0;
                }
                if (z2) {
                    j2 = super.A02;
                } else {
                    j2 = 0;
                }
                if (z3) {
                    j3 = super.A01;
                }
                ((C0TS) arrayList3.get(0)).A0H.postOnAnimationDelayed(runnableEBaseShape1S0200000_I0_13, Math.max(j2, j3) + j);
            }
        }
    }

    @Override // X.C0TR
    public void A07(C0TS c0ts) {
        View view = c0ts.A0H;
        C0AT.A0E(view).A00();
        int size = this.A08.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C2LG) this.A08.get(size)).A04 == c0ts) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A03(c0ts);
                this.A08.remove(size);
            }
        }
        A0F(this.A07, c0ts);
        if (this.A09.remove(c0ts)) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A03(c0ts);
        }
        if (this.A06.remove(c0ts)) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A03(c0ts);
        }
        int size2 = this.A03.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            List list = (List) this.A03.get(size2);
            A0F(list, c0ts);
            if (list.isEmpty()) {
                this.A03.remove(size2);
            }
        }
        int size3 = this.A05.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            List list2 = (List) this.A05.get(size3);
            int size4 = list2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C2LG) list2.get(size4)).A04 == c0ts) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A03(c0ts);
                    list2.remove(size4);
                    if (list2.isEmpty()) {
                        this.A05.remove(size3);
                    }
                }
            }
        }
        int size5 = this.A01.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            List list3 = (List) this.A01.get(size5);
            if (list3.remove(c0ts)) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                A03(c0ts);
                if (list3.isEmpty()) {
                    this.A01.remove(size5);
                }
            }
        }
        this.A0A.remove(c0ts);
        this.A00.remove(c0ts);
        this.A02.remove(c0ts);
        this.A04.remove(c0ts);
        if (A08()) {
            return;
        }
        A02();
    }

    @Override // X.C0TR
    public boolean A08() {
        return (this.A06.isEmpty() && this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A04.isEmpty() && this.A0A.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // X.C0TR
    public boolean A09(C0TS c0ts, List list) {
        return !list.isEmpty() || super.A09(c0ts, list);
    }

    @Override // X.C0TQ
    public boolean A0A(C0TS c0ts) {
        A0E(c0ts);
        View view = c0ts.A0H;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        this.A06.add(c0ts);
        return true;
    }

    @Override // X.C0TQ
    public boolean A0B(C0TS c0ts) {
        A0E(c0ts);
        this.A09.add(c0ts);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r1 != 0) goto L7;
     */
    @Override // X.C0TQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C(X.C0TS r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r3 = r9
            android.view.View r2 = r9.A0H
            float r1 = (float) r10
            float r0 = r2.getTranslationX()
            float r0 = r0 + r1
            int r4 = (int) r0
            float r1 = (float) r11
            float r0 = r2.getTranslationY()
            float r0 = r0 + r1
            int r5 = (int) r0
            r8.A0E(r9)
            r6 = r12
            int r0 = r12 - r4
            r7 = r13
            int r1 = r13 - r5
            if (r0 != 0) goto L23
            if (r1 != 0) goto L2a
            r8.A03(r9)
            r0 = 0
            return r0
        L23:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L2f
        L2a:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L2f:
            java.util.List r0 = r8.A08
            X.2LG r2 = new X.2LG
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2LD.A0C(X.0TS, int, int, int, int):boolean");
    }

    @Override // X.C0TQ
    public boolean A0D(C0TS c0ts, C0TS c0ts2, int i, int i2, int i3, int i4) {
        if (c0ts == c0ts2) {
            return A0C(c0ts, i, i2, i3, i4);
        }
        View view = c0ts.A0H;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        A0E(c0ts);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A0E(c0ts2);
        View view2 = c0ts2.A0H;
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        this.A07.add(new C2LI(c0ts, c0ts2, i, i2, i3, i4));
        return true;
    }

    public final void A0E(C0TS c0ts) {
        c0ts.A0H.animate().setInterpolator(A0B);
        A07(c0ts);
    }

    public final void A0F(List list, C0TS c0ts) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C2LI c2li = (C2LI) list.get(size);
            if (A0G(c2li, c0ts) && c2li.A05 == null && c2li.A04 == null) {
                list.remove(c2li);
            }
        }
    }

    public final boolean A0G(C2LI c2li, C0TS c0ts) {
        if (c2li.A04 == c0ts) {
            c2li.A04 = null;
        } else if (c2li.A05 == c0ts) {
            c2li.A05 = null;
        } else {
            return false;
        }
        View view = c0ts.A0H;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        A03(c0ts);
        return true;
    }
}
