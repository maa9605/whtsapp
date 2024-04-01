package X;

import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.0d9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09370d9 {
    public static final AbstractC09380dB A00;
    public static final AbstractC09380dB A01;
    public static final int[] A02 = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    static {
        AbstractC09380dB abstractC09380dB = null;
        A00 = Build.VERSION.SDK_INT >= 21 ? new AbstractC09380dB() { // from class: X.1TZ
            /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
                if (r1 != false) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
                if (r0.isEmpty() != false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
                if (r1 != false) goto L22;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static boolean A02(android.transition.Transition r2) {
                /*
                    java.util.List r0 = r2.getTargetIds()
                    if (r0 == 0) goto Ld
                    boolean r1 = r0.isEmpty()
                    r0 = 0
                    if (r1 == 0) goto Le
                Ld:
                    r0 = 1
                Le:
                    if (r0 == 0) goto L31
                    java.util.List r0 = r2.getTargetNames()
                    if (r0 == 0) goto L1d
                    boolean r1 = r0.isEmpty()
                    r0 = 0
                    if (r1 == 0) goto L1e
                L1d:
                    r0 = 1
                L1e:
                    if (r0 == 0) goto L31
                    java.util.List r0 = r2.getTargetTypes()
                    if (r0 == 0) goto L2d
                    boolean r0 = r0.isEmpty()
                    r1 = 0
                    if (r0 == 0) goto L2e
                L2d:
                    r1 = 1
                L2e:
                    r0 = 0
                    if (r1 != 0) goto L32
                L31:
                    r0 = 1
                L32:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1TZ.A02(android.transition.Transition):boolean");
            }

            @Override // X.AbstractC09380dB
            public Object A04(Object obj) {
                if (obj != null) {
                    return ((Transition) obj).clone();
                }
                return null;
            }

            @Override // X.AbstractC09380dB
            public Object A05(Object obj) {
                if (obj == null) {
                    return null;
                }
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition((Transition) obj);
                return transitionSet;
            }

            @Override // X.AbstractC09380dB
            public Object A06(Object obj, Object obj2, Object obj3) {
                TransitionSet transitionSet = new TransitionSet();
                if (obj != null) {
                    transitionSet.addTransition((Transition) obj);
                }
                if (obj2 != null) {
                    transitionSet.addTransition((Transition) obj2);
                }
                if (obj3 != null) {
                    transitionSet.addTransition((Transition) obj3);
                }
                return transitionSet;
            }

            @Override // X.AbstractC09380dB
            public void A07(ViewGroup viewGroup, Object obj) {
                TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
            }

            @Override // X.AbstractC09380dB
            public void A08(C0BA c0ba, Object obj, C0HE c0he, final Runnable runnable) {
                ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.0ls
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        runnable.run();
                    }
                });
            }

            @Override // X.AbstractC09380dB
            public void A09(Object obj, final Rect rect) {
                if (obj != null) {
                    ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: X.0lt
                        @Override // android.transition.Transition.EpicenterCallback
                        public Rect onGetEpicenter(Transition transition) {
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
                    ((Transition) obj).addTarget(view);
                }
            }

            @Override // X.AbstractC09380dB
            public void A0B(Object obj, View view) {
                if (obj != null) {
                    ((Transition) obj).removeTarget(view);
                }
            }

            @Override // X.AbstractC09380dB
            public void A0C(Object obj, View view) {
                if (view != null) {
                    final Rect rect = new Rect();
                    AbstractC09380dB.A00(view, rect);
                    ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: X.0lp
                        @Override // android.transition.Transition.EpicenterCallback
                        public Rect onGetEpicenter(Transition transition) {
                            return rect;
                        }
                    });
                }
            }

            @Override // X.AbstractC09380dB
            public void A0D(Object obj, final View view, final ArrayList arrayList) {
                ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.0lq
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        transition.removeListener(this);
                        view.setVisibility(8);
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            ((View) arrayList2.get(i)).setVisibility(0);
                        }
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        transition.removeListener(this);
                        transition.addListener(this);
                    }
                });
            }

            @Override // X.AbstractC09380dB
            public void A0E(Object obj, View view, ArrayList arrayList) {
                TransitionSet transitionSet = (TransitionSet) obj;
                List<View> targets = transitionSet.getTargets();
                targets.clear();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AbstractC09380dB.A01(targets, (View) arrayList.get(i));
                }
                targets.add(view);
                arrayList.add(view);
                A0G(transitionSet, arrayList);
            }

            @Override // X.AbstractC09380dB
            public void A0F(Object obj, final Object obj2, final ArrayList arrayList, final Object obj3, final ArrayList arrayList2, final Object obj4, final ArrayList arrayList3) {
                ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.0lr
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        transition.removeListener(this);
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        Object obj5 = obj2;
                        if (obj5 != null) {
                            A0H(obj5, arrayList, null);
                        }
                        Object obj6 = obj3;
                        if (obj6 != null) {
                            A0H(obj6, arrayList2, null);
                        }
                        Object obj7 = obj4;
                        if (obj7 != null) {
                            A0H(obj7, arrayList3, null);
                        }
                    }
                });
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
                if (r1 != false) goto L25;
             */
            @Override // X.AbstractC09380dB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A0G(java.lang.Object r4, java.util.ArrayList r5) {
                /*
                    r3 = this;
                    android.transition.Transition r4 = (android.transition.Transition) r4
                    if (r4 != 0) goto L5
                    return
                L5:
                    boolean r0 = r4 instanceof android.transition.TransitionSet
                    r2 = 0
                    if (r0 == 0) goto L1c
                    android.transition.TransitionSet r4 = (android.transition.TransitionSet) r4
                    int r1 = r4.getTransitionCount()
                L10:
                    if (r2 >= r1) goto L44
                    android.transition.Transition r0 = r4.getTransitionAt(r2)
                    r3.A0G(r0, r5)
                    int r2 = r2 + 1
                    goto L10
                L1c:
                    boolean r0 = A02(r4)
                    if (r0 != 0) goto L44
                    java.util.List r0 = r4.getTargets()
                    if (r0 == 0) goto L2f
                    boolean r1 = r0.isEmpty()
                    r0 = 0
                    if (r1 == 0) goto L30
                L2f:
                    r0 = 1
                L30:
                    if (r0 == 0) goto L44
                    int r1 = r5.size()
                L36:
                    if (r2 >= r1) goto L44
                    java.lang.Object r0 = r5.get(r2)
                    android.view.View r0 = (android.view.View) r0
                    r4.addTarget(r0)
                    int r2 = r2 + 1
                    goto L36
                L44:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1TZ.A0G(java.lang.Object, java.util.ArrayList):void");
            }

            @Override // X.AbstractC09380dB
            public void A0H(Object obj, ArrayList arrayList, ArrayList arrayList2) {
                List<View> targets;
                Transition transition = (Transition) obj;
                int i = 0;
                if (transition instanceof TransitionSet) {
                    TransitionSet transitionSet = (TransitionSet) transition;
                    int transitionCount = transitionSet.getTransitionCount();
                    while (i < transitionCount) {
                        A0H(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                        i++;
                    }
                } else if (!A02(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        while (i < size) {
                            transition.addTarget((View) arrayList2.get(i));
                            i++;
                        }
                    }
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        transition.removeTarget((View) arrayList.get(size2));
                    }
                }
            }

            @Override // X.AbstractC09380dB
            public void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2) {
                TransitionSet transitionSet = (TransitionSet) obj;
                if (transitionSet != null) {
                    transitionSet.getTargets().clear();
                    transitionSet.getTargets().addAll(arrayList2);
                    A0H(transitionSet, arrayList, arrayList2);
                }
            }

            @Override // X.AbstractC09380dB
            public boolean A0J(Object obj) {
                return obj instanceof Transition;
            }
        } : null;
        try {
            abstractC09380dB = (AbstractC09380dB) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        A01 = abstractC09380dB;
    }

    public static View A00(C006702y c006702y, C09390dC c09390dC, Object obj, boolean z) {
        ArrayList arrayList;
        Object obj2;
        C02820Cz c02820Cz = c09390dC.A01;
        if (obj != null && c006702y != null && (arrayList = c02820Cz.A0B) != null && !arrayList.isEmpty()) {
            if (z) {
                obj2 = arrayList.get(0);
            } else {
                obj2 = c02820Cz.A0C.get(0);
            }
            return (View) c006702y.get(obj2);
        }
        return null;
    }

    public static C006702y A01(AbstractC09380dB abstractC09380dB, C006702y c006702y, Object obj, C09390dC c09390dC) {
        ArrayList arrayList;
        Object obj2;
        Object obj3;
        C0BA c0ba = c09390dC.A03;
        View view = c0ba.A0A;
        if (!c006702y.isEmpty() && obj != null && view != null) {
            C006702y c006702y2 = new C006702y();
            abstractC09380dB.A03(c006702y2, view);
            C02820Cz c02820Cz = c09390dC.A01;
            if (c09390dC.A05) {
                C0XM c0xm = c0ba.A0C;
                arrayList = c02820Cz.A0B;
            } else {
                C0XM c0xm2 = c0ba.A0C;
                r0 = c0xm2 != null ? c0xm2.A05 : null;
                arrayList = c02820Cz.A0C;
            }
            if (arrayList != null) {
                C0TZ.A00(c006702y2, arrayList);
                C0TZ.A00(c006702y2, c006702y.values());
            }
            if (r0 != null) {
                r0.A01(arrayList, c006702y2);
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    String str = (String) arrayList.get(size);
                    View view2 = (View) c006702y2.get(str);
                    if (view2 == null) {
                        int i = ((C006802z) c006702y).A00;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= i) {
                                obj2 = null;
                                break;
                            }
                            Object[] objArr = c006702y.A02;
                            int i3 = i2 << 1;
                            if (str.equals(objArr[i3 + 1])) {
                                obj2 = objArr[i3];
                                break;
                            }
                            i2++;
                        }
                        if (obj2 != null) {
                            c006702y.remove(obj2);
                        }
                    } else if (!str.equals(C0AT.A0G(view2))) {
                        int i4 = ((C006802z) c006702y).A00;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i4) {
                                obj3 = null;
                                break;
                            }
                            Object[] objArr2 = c006702y.A02;
                            int i6 = i5 << 1;
                            if (str.equals(objArr2[i6 + 1])) {
                                obj3 = objArr2[i6];
                                break;
                            }
                            i5++;
                        }
                        if (obj3 != null) {
                            c006702y.put(obj3, C0AT.A0G(view2));
                        }
                    }
                }
            } else {
                int i7 = ((C006802z) c006702y).A00;
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    } else if (!c006702y2.containsKey(c006702y.A02[(i7 << 1) + 1])) {
                        c006702y.A05(i7);
                    }
                }
            }
            return c006702y2;
        }
        c006702y.clear();
        return null;
    }

    public static C006702y A02(AbstractC09380dB abstractC09380dB, C006702y c006702y, Object obj, C09390dC c09390dC) {
        ArrayList arrayList;
        if (!c006702y.isEmpty() && obj != null) {
            C0BA c0ba = c09390dC.A02;
            C006702y c006702y2 = new C006702y();
            abstractC09380dB.A03(c006702y2, c0ba.A05());
            C02820Cz c02820Cz = c09390dC.A00;
            if (c09390dC.A04) {
                C0XM c0xm = c0ba.A0C;
                r3 = c0xm != null ? c0xm.A05 : null;
                arrayList = c02820Cz.A0C;
            } else {
                C0XM c0xm2 = c0ba.A0C;
                arrayList = c02820Cz.A0B;
            }
            if (arrayList != null) {
                C0TZ.A00(c006702y2, arrayList);
            }
            if (r3 != null) {
                r3.A01(arrayList, c006702y2);
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    String str = (String) arrayList.get(size);
                    View view = (View) c006702y2.get(str);
                    if (view == null) {
                        c006702y.remove(str);
                    } else if (!str.equals(C0AT.A0G(view))) {
                        c006702y.put(C0AT.A0G(view), c006702y.remove(str));
                    }
                }
            } else {
                C0TZ.A00(c006702y, c006702y2.keySet());
            }
            return c006702y2;
        }
        c006702y.clear();
        return null;
    }

    public static AbstractC09380dB A03(C0BA c0ba, C0BA c0ba2) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (c0ba != null) {
            C0XM c0xm = c0ba.A0C;
            if (c0xm != null) {
                Object obj4 = c0xm.A09;
                if (obj4 == C0BA.A0k) {
                    if (c0xm != null) {
                        obj4 = c0xm.A07;
                    }
                }
                if (obj4 != null) {
                    arrayList.add(obj4);
                }
            }
            if (c0xm != null) {
                Object obj5 = c0xm.A0B;
                if (obj5 == C0BA.A0k) {
                    C0XM c0xm2 = c0ba.A0C;
                    if (c0xm2 != null) {
                        obj5 = c0xm2.A0A;
                    }
                }
                if (obj5 != null) {
                    arrayList.add(obj5);
                }
            }
        }
        if (c0ba2 != null) {
            C0XM c0xm3 = c0ba2.A0C;
            if (c0xm3 != null && (obj3 = c0xm3.A07) != null) {
                arrayList.add(obj3);
            }
            C0XM c0xm4 = c0ba2.A0C;
            if (c0xm4 != null && (obj2 = c0xm4.A08) != C0BA.A0k && obj2 != null) {
                arrayList.add(obj2);
            }
            C0XM c0xm5 = c0ba2.A0C;
            if (c0xm5 != null && (obj = c0xm5.A0A) != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC09380dB abstractC09380dB = A00;
        if (abstractC09380dB != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (abstractC09380dB.A0J(arrayList.get(i))) {
                }
            }
            return abstractC09380dB;
        }
        AbstractC09380dB abstractC09380dB2 = A01;
        if (abstractC09380dB2 != null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (abstractC09380dB2.A0J(arrayList.get(i2))) {
                }
            }
            return abstractC09380dB2;
        }
        if (abstractC09380dB == null && abstractC09380dB2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static Object A04(AbstractC09380dB abstractC09380dB, C0BA c0ba, C0BA c0ba2, boolean z) {
        Object obj;
        if (z) {
            C0XM c0xm = c0ba2.A0C;
            if (c0xm == null) {
                obj = null;
            } else {
                obj = c0xm.A0B;
                if (obj == C0BA.A0k) {
                    obj = c0xm == null ? null : c0xm.A0A;
                }
            }
        } else {
            C0XM c0xm2 = c0ba.A0C;
            obj = c0xm2 == null ? null : c0xm2.A0A;
        }
        return abstractC09380dB.A05(abstractC09380dB.A04(obj));
    }

    public static Object A05(AbstractC09380dB abstractC09380dB, C0BA c0ba, boolean z) {
        Object obj = null;
        if (c0ba == null) {
            return null;
        }
        if (z) {
            C0XM c0xm = c0ba.A0C;
            if (c0xm != null && (obj = c0xm.A08) == C0BA.A0k) {
                obj = null;
            }
        } else {
            C0XM c0xm2 = c0ba.A0C;
            if (c0xm2 != null) {
                obj = c0xm2.A07;
            }
        }
        return abstractC09380dB.A04(obj);
    }

    public static Object A06(AbstractC09380dB abstractC09380dB, C0BA c0ba, boolean z) {
        C0XM c0xm;
        Object obj = null;
        if (c0ba == null) {
            return null;
        }
        if (z && (c0xm = c0ba.A0C) != null && (obj = c0xm.A09) == C0BA.A0k) {
            obj = c0xm == null ? null : c0xm.A07;
        }
        return abstractC09380dB.A04(obj);
    }

    public static ArrayList A07(AbstractC09380dB abstractC09380dB, Object obj, C0BA c0ba, ArrayList arrayList, View view) {
        if (obj != null) {
            ArrayList arrayList2 = new ArrayList();
            View view2 = c0ba.A0A;
            if (view2 != null) {
                abstractC09380dB.A02(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                abstractC09380dB.A0G(obj, arrayList2);
            }
            return arrayList2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00e1, code lost:
        if (r2.A0Z == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00e3, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
        if (r6.A02 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0091, code lost:
        if (r2.A0T != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c6, code lost:
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A08(X.C02820Cz r9, X.C09320d3 r10, android.util.SparseArray r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09370d9.A08(X.0Cz, X.0d3, android.util.SparseArray, boolean, boolean):void");
    }

    public static void A09(C0BA c0ba, C0BA c0ba2, boolean z, C006702y c006702y, boolean z2) {
        AbstractC12840kA abstractC12840kA;
        if (z) {
            C0XM c0xm = c0ba2.A0C;
            if (c0xm == null) {
                return;
            }
            abstractC12840kA = c0xm.A05;
        } else {
            C0XM c0xm2 = c0ba.A0C;
            if (c0xm2 == null) {
                return;
            }
            abstractC12840kA = c0xm2.A05;
        }
        if (abstractC12840kA != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (c006702y != null) {
                int i = ((C006802z) c006702y).A00;
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = i2 << 1;
                    arrayList2.add(c006702y.A02[i3]);
                    arrayList.add(c006702y.A02[i3 + 1]);
                }
            }
            if (z2) {
                return;
            }
            abstractC12840kA.A00(arrayList2, arrayList, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0175 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0A(X.AbstractC02800Cx r46, java.util.ArrayList r47, java.util.ArrayList r48, int r49, int r50, boolean r51, X.C0UN r52) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09370d9.A0A(X.0Cx, java.util.ArrayList, java.util.ArrayList, int, int, boolean, X.0UN):void");
    }

    public static void A0B(ArrayList arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }

    public static void A0C(ArrayList arrayList, C006702y c006702y, Collection collection) {
        for (int i = ((C006802z) c006702y).A00 - 1; i >= 0; i--) {
            View view = (View) c006702y.A02[(i << 1) + 1];
            if (collection.contains(C0AT.A0G(view))) {
                arrayList.add(view);
            }
        }
    }
}
