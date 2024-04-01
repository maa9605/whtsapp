package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.1V7 */
/* loaded from: classes.dex */
public abstract class C1V7 extends AbstractC16120ps {
    public static final String[] A01 = {"android:visibility:visibility", "android:visibility:parent"};
    public int A00 = 3;

    public abstract Animator A0V(ViewGroup viewGroup, View view, C16160pw c16160pw, C16160pw c16160pw2);

    public abstract Animator A0W(ViewGroup viewGroup, View view, C16160pw c16160pw, C16160pw c16160pw2);

    /* JADX WARN: Code restructure failed: missing block: B:83:0x008f, code lost:
        if (r9 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C16250q5 A02(X.C16160pw r8, X.C16160pw r9) {
        /*
            X.0q5 r5 = new X.0q5
            r5.<init>()
            r6 = 0
            r5.A05 = r6
            r5.A04 = r6
            java.lang.String r3 = "android:visibility:parent"
            r4 = 0
            r7 = -1
            java.lang.String r2 = "android:visibility:visibility"
            if (r8 == 0) goto L61
            java.util.Map r1 = r8.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L61
            java.lang.Object r0 = r1.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.A01 = r0
            java.lang.Object r0 = r1.get(r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A03 = r0
        L2e:
            if (r9 == 0) goto L5c
            java.util.Map r1 = r9.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r1.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.A00 = r0
            java.lang.Object r4 = r1.get(r3)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r5.A02 = r4
        L4c:
            r3 = 1
            if (r8 == 0) goto L86
            if (r9 == 0) goto L91
            int r2 = r5.A01
            int r1 = r5.A00
            if (r2 != r1) goto L66
            android.view.ViewGroup r0 = r5.A03
            if (r0 != r4) goto L66
            return r5
        L5c:
            r5.A00 = r7
            r5.A02 = r4
            goto L4c
        L61:
            r5.A01 = r7
            r5.A03 = r4
            goto L2e
        L66:
            if (r2 == r1) goto L76
            if (r2 != 0) goto L6f
            r5.A04 = r6
            r5.A05 = r3
            return r5
        L6f:
            if (r1 != 0) goto L8e
            r5.A04 = r3
            r5.A05 = r3
            return r5
        L76:
            if (r4 != 0) goto L7d
            r5.A04 = r6
            r5.A05 = r3
            return r5
        L7d:
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L8e
            r5.A04 = r3
            r5.A05 = r3
            return r5
        L86:
            int r0 = r5.A00
            if (r0 != 0) goto L8f
            r5.A04 = r3
            r5.A05 = r3
        L8e:
            return r5
        L8f:
            if (r9 != 0) goto L8e
        L91:
            int r0 = r5.A01
            if (r0 != 0) goto L8e
            r5.A04 = r6
            r5.A05 = r3
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1V7.A02(X.0pw, X.0pw):X.0q5");
    }

    public static final void A03(C16160pw c16160pw) {
        int visibility = c16160pw.A00.getVisibility();
        Map map = c16160pw.A02;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", c16160pw.A00.getParent());
        int[] iArr = new int[2];
        c16160pw.A00.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0036, code lost:
        if (A02(A09(r0, false), A0A(r0, false)).A05 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0115, code lost:
        if (r4 == null) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x005b  */
    @Override // X.AbstractC16120ps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator A0Q(android.view.ViewGroup r10, X.C16160pw r11, X.C16160pw r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1V7.A0Q(android.view.ViewGroup, X.0pw, X.0pw):android.animation.Animator");
    }

    @Override // X.AbstractC16120ps
    public boolean A0R(C16160pw c16160pw, C16160pw c16160pw2) {
        if (c16160pw == null) {
            if (c16160pw2 == null) {
                return false;
            }
        } else if (c16160pw2 != null && c16160pw2.A02.containsKey("android:visibility:visibility") != c16160pw.A02.containsKey("android:visibility:visibility")) {
            return false;
        }
        C16250q5 A02 = A02(c16160pw, c16160pw2);
        if (A02.A05) {
            return A02.A01 == 0 || A02.A00 == 0;
        }
        return false;
    }

    @Override // X.AbstractC16120ps
    public String[] A0S() {
        return A01;
    }

    @Override // X.AbstractC16120ps
    public void A0T(C16160pw c16160pw) {
        A03(c16160pw);
    }
}
