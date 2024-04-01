package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1oa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38551oa extends C0TQ {
    public static TimeInterpolator A0B;
    public ArrayList A09 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public ArrayList A08 = new ArrayList();
    public ArrayList A07 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public ArrayList A00 = new ArrayList();
    public ArrayList A04 = new ArrayList();
    public ArrayList A0A = new ArrayList();
    public ArrayList A02 = new ArrayList();

    public static void A02(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((C0TS) list.get(size)).A0H.animate().cancel();
        }
    }

    @Override // X.C0TR
    public void A05() {
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C14740nV c14740nV = (C14740nV) arrayList.get(size);
            View view = c14740nV.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A03(c14740nV.A04);
            arrayList = this.A08;
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A09;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A03((C0TS) arrayList2.get(size2));
            arrayList2 = this.A09;
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A06;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0TS c0ts = (C0TS) arrayList3.get(size3);
            c0ts.A0H.setAlpha(1.0f);
            A03(c0ts);
            arrayList3 = this.A06;
            arrayList3.remove(size3);
        }
        int size4 = this.A07.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C14730nU c14730nU = (C14730nU) this.A07.get(size4);
            C0TS c0ts2 = c14730nU.A05;
            if (c0ts2 != null) {
                A0H(c14730nU, c0ts2);
            }
            C0TS c0ts3 = c14730nU.A04;
            if (c0ts3 != null) {
                A0H(c14730nU, c0ts3);
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
            AbstractList abstractList = (AbstractList) this.A05.get(size5);
            int size6 = abstractList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C14740nV c14740nV2 = (C14740nV) abstractList.get(size6);
                    View view2 = c14740nV2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A03(c14740nV2.A04);
                    abstractList.remove(size6);
                    if (abstractList.isEmpty()) {
                        this.A05.remove(abstractList);
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
            AbstractList abstractList2 = (AbstractList) this.A01.get(size7);
            int size8 = abstractList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    C0TS c0ts4 = (C0TS) abstractList2.get(size8);
                    c0ts4.A0H.setAlpha(1.0f);
                    A03(c0ts4);
                    abstractList2.remove(size8);
                    if (abstractList2.isEmpty()) {
                        this.A01.remove(abstractList2);
                    }
                }
            }
        }
        int size9 = this.A03.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                AbstractList abstractList3 = (AbstractList) this.A03.get(size9);
                int size10 = abstractList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        C14730nU c14730nU2 = (C14730nU) abstractList3.get(size10);
                        C0TS c0ts5 = c14730nU2.A05;
                        if (c0ts5 != null) {
                            A0H(c14730nU2, c0ts5);
                        }
                        C0TS c0ts6 = c14730nU2.A04;
                        if (c0ts6 != null) {
                            A0H(c14730nU2, c0ts6);
                        }
                        if (abstractList3.isEmpty()) {
                            this.A03.remove(abstractList3);
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
        ArrayList arrayList = this.A09;
        boolean z = !arrayList.isEmpty();
        boolean z2 = !this.A08.isEmpty();
        boolean z3 = !this.A07.isEmpty();
        boolean z4 = !this.A06.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final C0TS c0ts = (C0TS) it.next();
                final View view = c0ts.A0H;
                final ViewPropertyAnimator animate = view.animate();
                this.A0A.add(c0ts);
                animate.setDuration(super.A03).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: X.0nP
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        animate.setListener(null);
                        view.setAlpha(1.0f);
                        C38551oa c38551oa = C38551oa.this;
                        C0TS c0ts2 = c0ts;
                        c38551oa.A03(c0ts2);
                        c38551oa.A0A.remove(c0ts2);
                        c38551oa.A0E();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        if (C38551oa.this == null) {
                            throw null;
                        }
                    }
                }).start();
            }
            this.A09.clear();
            if (z2) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.A08);
                this.A05.add(arrayList2);
                this.A08.clear();
                Runnable runnable = new Runnable() { // from class: X.0nM
                    @Override // java.lang.Runnable
                    public void run() {
                        ArrayList arrayList3 = arrayList2;
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            C14740nV c14740nV = (C14740nV) it2.next();
                            final C38551oa c38551oa = C38551oa.this;
                            final C0TS c0ts2 = c14740nV.A04;
                            int i = c14740nV.A00;
                            int i2 = c14740nV.A01;
                            int i3 = c14740nV.A02;
                            int i4 = c14740nV.A03;
                            if (c38551oa != null) {
                                final View view2 = c0ts2.A0H;
                                final int i5 = i3 - i;
                                final int i6 = i4 - i2;
                                if (i5 != 0) {
                                    view2.animate().translationX(0.0f);
                                }
                                if (i6 != 0) {
                                    view2.animate().translationY(0.0f);
                                }
                                final ViewPropertyAnimator animate2 = view2.animate();
                                c38551oa.A04.add(c0ts2);
                                animate2.setDuration(((C0TR) c38551oa).A02).setListener(new AnimatorListenerAdapter() { // from class: X.0nR
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationCancel(Animator animator) {
                                        if (i5 != 0) {
                                            view2.setTranslationX(0.0f);
                                        }
                                        if (i6 != 0) {
                                            view2.setTranslationY(0.0f);
                                        }
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator) {
                                        animate2.setListener(null);
                                        C38551oa c38551oa2 = C38551oa.this;
                                        C0TS c0ts3 = c0ts2;
                                        c38551oa2.A03(c0ts3);
                                        c38551oa2.A04.remove(c0ts3);
                                        c38551oa2.A0E();
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationStart(Animator animator) {
                                        if (C38551oa.this == null) {
                                            throw null;
                                        }
                                    }
                                }).start();
                            } else {
                                throw null;
                            }
                        }
                        arrayList3.clear();
                        C38551oa.this.A05.remove(arrayList3);
                    }
                };
                if (z) {
                    ((C14740nV) arrayList2.get(0)).A04.A0H.postOnAnimationDelayed(runnable, super.A03);
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.A07);
                this.A03.add(arrayList3);
                this.A07.clear();
                Runnable runnable2 = new Runnable() { // from class: X.0nN
                    @Override // java.lang.Runnable
                    public void run() {
                        ArrayList arrayList4 = arrayList3;
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            final C14730nU c14730nU = (C14730nU) it2.next();
                            final C38551oa c38551oa = C38551oa.this;
                            if (c38551oa != null) {
                                C0TS c0ts2 = c14730nU.A05;
                                final View view2 = c0ts2 == null ? null : c0ts2.A0H;
                                C0TS c0ts3 = c14730nU.A04;
                                final View view3 = c0ts3 != null ? c0ts3.A0H : null;
                                if (view2 != null) {
                                    final ViewPropertyAnimator duration = view2.animate().setDuration(((C0TR) c38551oa).A01);
                                    c38551oa.A02.add(c14730nU.A05);
                                    duration.translationX(c14730nU.A02 - c14730nU.A00);
                                    duration.translationY(c14730nU.A03 - c14730nU.A01);
                                    duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: X.0nS
                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public void onAnimationEnd(Animator animator) {
                                            duration.setListener(null);
                                            View view4 = view2;
                                            view4.setAlpha(1.0f);
                                            view4.setTranslationX(0.0f);
                                            view4.setTranslationY(0.0f);
                                            C38551oa c38551oa2 = C38551oa.this;
                                            C14730nU c14730nU2 = c14730nU;
                                            c38551oa2.A03(c14730nU2.A05);
                                            c38551oa2.A02.remove(c14730nU2.A05);
                                            c38551oa2.A0E();
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public void onAnimationStart(Animator animator) {
                                            if (C38551oa.this == null) {
                                                throw null;
                                            }
                                        }
                                    }).start();
                                }
                                if (view3 != null) {
                                    final ViewPropertyAnimator animate2 = view3.animate();
                                    c38551oa.A02.add(c14730nU.A04);
                                    animate2.translationX(0.0f).translationY(0.0f).setDuration(((C0TR) c38551oa).A01).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: X.0nT
                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public void onAnimationEnd(Animator animator) {
                                            animate2.setListener(null);
                                            View view4 = view3;
                                            view4.setAlpha(1.0f);
                                            view4.setTranslationX(0.0f);
                                            view4.setTranslationY(0.0f);
                                            C38551oa c38551oa2 = C38551oa.this;
                                            C14730nU c14730nU2 = c14730nU;
                                            c38551oa2.A03(c14730nU2.A04);
                                            c38551oa2.A02.remove(c14730nU2.A04);
                                            c38551oa2.A0E();
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public void onAnimationStart(Animator animator) {
                                            if (C38551oa.this == null) {
                                                throw null;
                                            }
                                        }
                                    }).start();
                                }
                            } else {
                                throw null;
                            }
                        }
                        arrayList4.clear();
                        C38551oa.this.A03.remove(arrayList4);
                    }
                };
                if (z) {
                    ((C14730nU) arrayList3.get(0)).A05.A0H.postOnAnimationDelayed(runnable2, super.A03);
                } else {
                    runnable2.run();
                }
            }
            if (z4) {
                final ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.A06);
                this.A01.add(arrayList4);
                this.A06.clear();
                Runnable runnable3 = new Runnable() { // from class: X.0nO
                    @Override // java.lang.Runnable
                    public void run() {
                        ArrayList arrayList5 = arrayList4;
                        Iterator it2 = arrayList5.iterator();
                        while (it2.hasNext()) {
                            final C0TS c0ts2 = (C0TS) it2.next();
                            final C38551oa c38551oa = C38551oa.this;
                            if (c38551oa != null) {
                                final View view2 = c0ts2.A0H;
                                final ViewPropertyAnimator animate2 = view2.animate();
                                c38551oa.A00.add(c0ts2);
                                animate2.alpha(1.0f).setDuration(((C0TR) c38551oa).A00).setListener(new AnimatorListenerAdapter() { // from class: X.0nQ
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationCancel(Animator animator) {
                                        view2.setAlpha(1.0f);
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator) {
                                        animate2.setListener(null);
                                        C38551oa c38551oa2 = C38551oa.this;
                                        C0TS c0ts3 = c0ts2;
                                        c38551oa2.A03(c0ts3);
                                        c38551oa2.A00.remove(c0ts3);
                                        c38551oa2.A0E();
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationStart(Animator animator) {
                                        if (C38551oa.this == null) {
                                            throw null;
                                        }
                                    }
                                }).start();
                            } else {
                                throw null;
                            }
                        }
                        arrayList5.clear();
                        C38551oa.this.A01.remove(arrayList5);
                    }
                };
                if (!z && !z2 && !z3) {
                    runnable3.run();
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
                ((C0TS) arrayList4.get(0)).A0H.postOnAnimationDelayed(runnable3, Math.max(j2, j3) + j);
            }
        }
    }

    @Override // X.C0TR
    public void A07(C0TS c0ts) {
        View view = c0ts.A0H;
        view.animate().cancel();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C14740nV) arrayList.get(size)).A04 == c0ts) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A03(c0ts);
                arrayList = this.A08;
                arrayList.remove(size);
            }
        }
        A0G(this.A07, c0ts);
        if (this.A09.remove(c0ts)) {
            view.setAlpha(1.0f);
            A03(c0ts);
        }
        if (this.A06.remove(c0ts)) {
            view.setAlpha(1.0f);
            A03(c0ts);
        }
        int size2 = this.A03.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.A03.get(size2);
            A0G(arrayList2, c0ts);
            if (arrayList2.isEmpty()) {
                this.A03.remove(size2);
            }
        }
        int size3 = this.A05.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractList abstractList = (AbstractList) this.A05.get(size3);
            int size4 = abstractList.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C14740nV) abstractList.get(size4)).A04 == c0ts) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A03(c0ts);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        this.A05.remove(size3);
                    }
                }
            }
        }
        int size5 = this.A01.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                AbstractCollection abstractCollection = (AbstractCollection) this.A01.get(size5);
                if (abstractCollection.remove(c0ts)) {
                    view.setAlpha(1.0f);
                    A03(c0ts);
                    if (abstractCollection.isEmpty()) {
                        this.A01.remove(size5);
                    }
                }
            } else {
                this.A0A.remove(c0ts);
                this.A00.remove(c0ts);
                this.A02.remove(c0ts);
                this.A04.remove(c0ts);
                A0E();
                return;
            }
        }
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
        A0F(c0ts);
        c0ts.A0H.setAlpha(0.0f);
        this.A06.add(c0ts);
        return true;
    }

    @Override // X.C0TQ
    public boolean A0B(C0TS c0ts) {
        A0F(c0ts);
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
            float r0 = r2.getTranslationX()
            int r0 = (int) r0
            int r4 = r10 + r0
            float r0 = r2.getTranslationY()
            int r0 = (int) r0
            int r5 = r11 + r0
            r8.A0F(r9)
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
            java.util.ArrayList r0 = r8.A08
            X.0nV r2 = new X.0nV
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38551oa.A0C(X.0TS, int, int, int, int):boolean");
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
        A0F(c0ts);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A0F(c0ts2);
        View view2 = c0ts2.A0H;
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        this.A07.add(new C14730nU(c0ts, c0ts2, i, i2, i3, i4));
        return true;
    }

    public void A0E() {
        if (A08()) {
            return;
        }
        A02();
    }

    public final void A0F(C0TS c0ts) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        c0ts.A0H.animate().setInterpolator(A0B);
        A07(c0ts);
    }

    public final void A0G(List list, C0TS c0ts) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C14730nU c14730nU = (C14730nU) list.get(size);
            if (A0H(c14730nU, c0ts) && c14730nU.A05 == null && c14730nU.A04 == null) {
                list.remove(c14730nU);
            }
        }
    }

    public final boolean A0H(C14730nU c14730nU, C0TS c0ts) {
        if (c14730nU.A04 == c0ts) {
            c14730nU.A04 = null;
        } else if (c14730nU.A05 == c0ts) {
            c14730nU.A05 = null;
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
