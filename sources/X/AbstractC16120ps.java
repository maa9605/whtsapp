package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0ps */
/* loaded from: classes.dex */
public abstract class AbstractC16120ps implements Cloneable {
    public C29031Uw A05;
    public AbstractC16100pq A06;
    public ArrayList A0D;
    public ArrayList A0F;
    public static final int[] A0N = {2, 1, 3, 4};
    public static final AbstractC16030pj A0M = new AbstractC16030pj() { // from class: X.1Uz
        @Override // X.AbstractC16030pj
        public Path A00(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    public static ThreadLocal A0L = new ThreadLocal();
    public String A0A = getClass().getName();
    public long A02 = -1;
    public long A01 = -1;
    public TimeInterpolator A03 = null;
    public ArrayList A0G = new ArrayList();
    public ArrayList A0H = new ArrayList();
    public C16170px A09 = new C16170px();
    public C16170px A08 = new C16170px();
    public C1V1 A07 = null;
    public int[] A0K = A0N;
    public ArrayList A0C = new ArrayList();
    public int A00 = 0;
    public boolean A0J = false;
    public boolean A0I = false;
    public ArrayList A0E = null;
    public ArrayList A0B = new ArrayList();
    public AbstractC16030pj A04 = A0M;

    public Animator A0Q(ViewGroup viewGroup, C16160pw c16160pw, C16160pw c16160pw2) {
        return null;
    }

    public String[] A0S() {
        return null;
    }

    public abstract void A0T(C16160pw c16160pw);

    public abstract void A0U(C16160pw c16160pw);

    public static C006702y A00() {
        C006702y c006702y = (C006702y) A0L.get();
        if (c006702y == null) {
            C006702y c006702y2 = new C006702y();
            A0L.set(c006702y2);
            return c006702y2;
        }
        return c006702y;
    }

    public static void A01(C16170px c16170px, View view, C16160pw c16160pw) {
        c16170px.A02.put(view, c16160pw);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = c16170px.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String A0G = C0AT.A0G(view);
        if (A0G != null) {
            C006702y c006702y = c16170px.A01;
            if (c006702y.A02(A0G) >= 0) {
                c006702y.put(A0G, null);
            } else {
                c006702y.put(A0G, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C05I c05i = c16170px.A03;
                if (c05i.A01) {
                    c05i.A06();
                }
                if (AnonymousClass030.A01(c05i.A02, c05i.A00, itemIdAtPosition) >= 0) {
                    View view2 = (View) c05i.A04(itemIdAtPosition, null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        c05i.A09(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c05i.A09(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: A02 */
    public AbstractC16120ps clone() {
        try {
            AbstractC16120ps abstractC16120ps = (AbstractC16120ps) super.clone();
            abstractC16120ps.A0B = new ArrayList();
            abstractC16120ps.A09 = new C16170px();
            abstractC16120ps.A08 = new C16170px();
            abstractC16120ps.A0F = null;
            abstractC16120ps.A0D = null;
            return abstractC16120ps;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public AbstractC16120ps A03(long j) {
        this.A01 = j;
        return this;
    }

    public AbstractC16120ps A04(TimeInterpolator timeInterpolator) {
        this.A03 = timeInterpolator;
        return this;
    }

    public AbstractC16120ps A05(View view) {
        this.A0H.add(view);
        return this;
    }

    public AbstractC16120ps A06(View view) {
        this.A0H.remove(view);
        return this;
    }

    public AbstractC16120ps A07(InterfaceC16110pr interfaceC16110pr) {
        ArrayList arrayList = this.A0E;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0E = arrayList;
        }
        arrayList.add(interfaceC16110pr);
        return this;
    }

    public AbstractC16120ps A08(InterfaceC16110pr interfaceC16110pr) {
        ArrayList arrayList = this.A0E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC16110pr);
        if (this.A0E.size() == 0) {
            this.A0E = null;
        }
        return this;
    }

    public C16160pw A09(View view, boolean z) {
        ArrayList arrayList;
        C1V1 c1v1 = this.A07;
        if (c1v1 != null) {
            return c1v1.A09(view, z);
        }
        ArrayList arrayList2 = z ? this.A0F : this.A0D;
        if (arrayList2 == null) {
            return null;
        }
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C16160pw c16160pw = (C16160pw) arrayList2.get(i);
            if (c16160pw == null) {
                return null;
            }
            if (c16160pw.A00 == view) {
                if (i >= 0) {
                    if (z) {
                        arrayList = this.A0D;
                    } else {
                        arrayList = this.A0F;
                    }
                    return (C16160pw) arrayList.get(i);
                }
                return null;
            }
        }
        return null;
    }

    public C16160pw A0A(View view, boolean z) {
        C16170px c16170px;
        C1V1 c1v1 = this.A07;
        if (c1v1 != null) {
            return c1v1.A0A(view, z);
        }
        if (z) {
            c16170px = this.A09;
        } else {
            c16170px = this.A08;
        }
        return (C16160pw) c16170px.A02.getOrDefault(view, null);
    }

    public String A0B(String str) {
        StringBuilder A0P = C000200d.A0P(str);
        A0P.append(getClass().getSimpleName());
        A0P.append("@");
        A0P.append(Integer.toHexString(hashCode()));
        A0P.append(": ");
        String obj = A0P.toString();
        long j = this.A01;
        if (j != -1) {
            StringBuilder A0V = C000200d.A0V(obj, "dur(");
            A0V.append(j);
            A0V.append(") ");
            obj = A0V.toString();
        }
        long j2 = this.A02;
        if (j2 != -1) {
            StringBuilder A0V2 = C000200d.A0V(obj, "dly(");
            A0V2.append(j2);
            A0V2.append(") ");
            obj = A0V2.toString();
        }
        TimeInterpolator timeInterpolator = this.A03;
        if (timeInterpolator != null) {
            StringBuilder A0V3 = C000200d.A0V(obj, "interp(");
            A0V3.append(timeInterpolator);
            A0V3.append(") ");
            obj = A0V3.toString();
        }
        ArrayList arrayList = this.A0G;
        if (arrayList.size() > 0 || this.A0H.size() > 0) {
            String A0H = C000200d.A0H(obj, "tgts(");
            int i = 0;
            if (arrayList.size() > 0) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.A0G;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    if (i2 > 0) {
                        A0H = C000200d.A0H(A0H, ", ");
                    }
                    StringBuilder A0P2 = C000200d.A0P(A0H);
                    A0P2.append(arrayList2.get(i2));
                    A0H = A0P2.toString();
                    i2++;
                }
            }
            if (this.A0H.size() > 0) {
                while (true) {
                    ArrayList arrayList3 = this.A0H;
                    if (i >= arrayList3.size()) {
                        break;
                    }
                    if (i > 0) {
                        A0H = C000200d.A0H(A0H, ", ");
                    }
                    StringBuilder A0P3 = C000200d.A0P(A0H);
                    A0P3.append(arrayList3.get(i));
                    A0H = A0P3.toString();
                    i++;
                }
            }
            return C000200d.A0H(A0H, ")");
        }
        return obj;
    }

    public void A0C() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i != 0) {
            return;
        }
        ArrayList arrayList = this.A0E;
        if (arrayList != null && arrayList.size() > 0) {
            AbstractList abstractList = (AbstractList) arrayList.clone();
            int size = abstractList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC16110pr) abstractList.get(i2)).APu(this);
            }
        }
        int i3 = 0;
        while (true) {
            C05I c05i = this.A09.A03;
            if (i3 >= c05i.A00()) {
                break;
            }
            View view = (View) c05i.A03(i3);
            if (view != null) {
                view.setHasTransientState(false);
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            C05I c05i2 = this.A08.A03;
            if (i4 < c05i2.A00()) {
                View view2 = (View) c05i2.A03(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
                i4++;
            } else {
                this.A0I = true;
                return;
            }
        }
    }

    public void A0D() {
        A0E();
        final C006702y A00 = A00();
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (A00.containsKey(animator)) {
                A0E();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter() { // from class: X.0pn
                        {
                            AbstractC16120ps.this = this;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator2) {
                            A00.remove(animator2);
                            AbstractC16120ps.this.A0C.remove(animator2);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator2) {
                            AbstractC16120ps.this.A0C.add(animator2);
                        }
                    });
                    long j = this.A01;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.A02;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2);
                    }
                    TimeInterpolator timeInterpolator = this.A03;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new AnimatorListenerAdapter() { // from class: X.0po
                        {
                            AbstractC16120ps.this = this;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator2) {
                            AbstractC16120ps.this.A0C();
                            animator2.removeListener(this);
                        }
                    });
                    animator.start();
                }
            }
        }
        this.A0B.clear();
        A0C();
    }

    public void A0E() {
        if (this.A00 == 0) {
            ArrayList arrayList = this.A0E;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC16110pr) abstractList.get(i)).APx(this);
                }
            }
            this.A0I = false;
        }
        this.A00++;
    }

    public void A0F(View view) {
        int i;
        if (this.A0I) {
            return;
        }
        C006702y A00 = A00();
        int i2 = ((C006802z) A00).A00;
        InterfaceC16260q6 A002 = C16220q2.A00(view);
        int i3 = i2 - 1;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            C16090pp c16090pp = (C16090pp) A00.A02[(i3 << 1) + 1];
            if (c16090pp.A00 != null && A002.equals(c16090pp.A03)) {
                Animator animator = (Animator) A00.A02[i3 << 1];
                if (Build.VERSION.SDK_INT >= 19) {
                    animator.pause();
                } else {
                    ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                    if (listeners != null) {
                        int size = listeners.size();
                        while (i < size) {
                            Animator.AnimatorListener animatorListener = listeners.get(i);
                            if (animatorListener instanceof InterfaceC15920pY) {
                                ((InterfaceC15920pY) animatorListener).onAnimationPause(animator);
                            }
                            i++;
                        }
                    }
                }
            }
            i3--;
        }
        ArrayList arrayList = this.A0E;
        if (arrayList != null && arrayList.size() > 0) {
            AbstractList abstractList = (AbstractList) arrayList.clone();
            int size2 = abstractList.size();
            while (i < size2) {
                ((InterfaceC16110pr) abstractList.get(i)).APv(this);
                i++;
            }
        }
        this.A0J = true;
    }

    public void A0G(View view) {
        if (this.A0J) {
            if (!this.A0I) {
                C006702y A00 = A00();
                int i = ((C006802z) A00).A00;
                InterfaceC16260q6 A002 = C16220q2.A00(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C16090pp c16090pp = (C16090pp) A00.A02[(i2 << 1) + 1];
                    if (c16090pp.A00 != null && A002.equals(c16090pp.A03)) {
                        Animator animator = (Animator) A00.A02[i2 << 1];
                        if (Build.VERSION.SDK_INT >= 19) {
                            animator.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                            if (listeners != null) {
                                int size = listeners.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i3);
                                    if (animatorListener instanceof InterfaceC15920pY) {
                                        ((InterfaceC15920pY) animatorListener).onAnimationResume(animator);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList = this.A0E;
                if (arrayList != null && arrayList.size() > 0) {
                    AbstractList abstractList = (AbstractList) arrayList.clone();
                    int size2 = abstractList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((InterfaceC16110pr) abstractList.get(i4)).APw(this);
                    }
                }
            }
            this.A0J = false;
        }
    }

    public final void A0H(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C16160pw c16160pw = new C16160pw();
            c16160pw.A00 = view;
            if (z) {
                A0U(c16160pw);
            } else {
                A0T(c16160pw);
            }
            c16160pw.A01.add(this);
            A0N(c16160pw);
            if (z) {
                A01(this.A09, view, c16160pw);
            } else {
                A01(this.A08, view, c16160pw);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A0H(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x0175, code lost:
        if (X.C0AT.A05(r27) == 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01c6, code lost:
        if (X.C0AT.A05(r27) == 1) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0I(android.view.ViewGroup r27, X.C16170px r28, X.C16170px r29, java.util.ArrayList r30, java.util.ArrayList r31) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC16120ps.A0I(android.view.ViewGroup, X.0px, X.0px, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void A0J(ViewGroup viewGroup, boolean z) {
        A0O(z);
        if (this.A0G.size() <= 0 && this.A0H.size() <= 0) {
            A0H(viewGroup, z);
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0G;
            if (i2 >= arrayList.size()) {
                break;
            }
            View findViewById = viewGroup.findViewById(((Number) arrayList.get(i2)).intValue());
            if (findViewById != null) {
                C16160pw c16160pw = new C16160pw();
                c16160pw.A00 = findViewById;
                if (z) {
                    A0U(c16160pw);
                } else {
                    A0T(c16160pw);
                }
                c16160pw.A01.add(this);
                A0N(c16160pw);
                if (z) {
                    A01(this.A09, findViewById, c16160pw);
                } else {
                    A01(this.A08, findViewById, c16160pw);
                }
            }
            i2++;
        }
        while (true) {
            ArrayList arrayList2 = this.A0H;
            if (i >= arrayList2.size()) {
                return;
            }
            View view = (View) arrayList2.get(i);
            C16160pw c16160pw2 = new C16160pw();
            c16160pw2.A00 = view;
            if (z) {
                A0U(c16160pw2);
            } else {
                A0T(c16160pw2);
            }
            c16160pw2.A01.add(this);
            A0N(c16160pw2);
            if (z) {
                A01(this.A09, view, c16160pw2);
            } else {
                A01(this.A08, view, c16160pw2);
            }
            i++;
        }
    }

    public void A0K(AbstractC16030pj abstractC16030pj) {
        if (abstractC16030pj == null) {
            this.A04 = A0M;
        } else {
            this.A04 = abstractC16030pj;
        }
    }

    public void A0L(C29031Uw c29031Uw) {
        this.A05 = c29031Uw;
    }

    public void A0M(AbstractC16100pq abstractC16100pq) {
        this.A06 = abstractC16100pq;
    }

    public void A0N(C16160pw c16160pw) {
        if (this.A05 != null) {
            Map map = c16160pw.A02;
            if (!map.isEmpty()) {
                if (this.A05 != null) {
                    for (String str : C29031Uw.A02) {
                        if (!map.containsKey(str)) {
                            if (this.A05 != null) {
                                View view = c16160pw.A00;
                                Object obj = map.get("android:visibility:visibility");
                                if (obj == null) {
                                    obj = Integer.valueOf(view.getVisibility());
                                }
                                map.put("android:visibilityPropagation:visibility", obj);
                                view.getLocationOnScreen(r3);
                                int round = Math.round(view.getTranslationX()) + r3[0];
                                int[] iArr = {round};
                                iArr[0] = (view.getWidth() / 2) + round;
                                int round2 = Math.round(view.getTranslationY()) + iArr[1];
                                iArr[1] = round2;
                                iArr[1] = (view.getHeight() / 2) + round2;
                                map.put("android:visibilityPropagation:center", iArr);
                                return;
                            }
                            throw null;
                        }
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public void A0O(boolean z) {
        if (z) {
            this.A09.A02.clear();
            this.A09.A00.clear();
            this.A09.A03.A05();
            return;
        }
        this.A08.A02.clear();
        this.A08.A00.clear();
        this.A08.A03.A05();
    }

    public boolean A0P(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A0G;
        return (arrayList.size() == 0 && this.A0H.size() == 0) || arrayList.contains(Integer.valueOf(id)) || this.A0H.contains(view);
    }

    public boolean A0R(C16160pw c16160pw, C16160pw c16160pw2) {
        int i;
        if (c16160pw == null || c16160pw2 == null) {
            return false;
        }
        String[] A0S = A0S();
        if (A0S != null) {
            int length = A0S.length;
            while (i < length) {
                String str = A0S[i];
                Object obj = c16160pw.A02.get(str);
                Object obj2 = c16160pw2.A02.get(str);
                if (obj != null) {
                    i = (obj2 == null || (true ^ obj.equals(obj2))) ? 0 : i + 1;
                } else if (obj2 == null) {
                }
            }
            return false;
        }
        Map map = c16160pw.A02;
        for (Object obj3 : map.keySet()) {
            Object obj4 = map.get(obj3);
            Object obj5 = c16160pw2.A02.get(obj3);
            if (obj4 == null) {
                if (obj5 == null) {
                }
            } else if (obj5 != null && !(true ^ obj4.equals(obj5))) {
            }
        }
        return false;
        return true;
    }

    public String toString() {
        return A0B("");
    }
}
