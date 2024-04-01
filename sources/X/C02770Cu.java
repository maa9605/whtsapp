package X;

import android.text.method.LinkMovementMethod;

/* renamed from: X.0Cu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02770Cu extends LinkMovementMethod {
    public InterfaceC02760Ct A00;

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.widget.TextView r13, android.text.Spannable r14, android.view.MotionEvent r15) {
        /*
            r12 = this;
            java.lang.Class<X.0Ct> r9 = X.InterfaceC02760Ct.class
            int r4 = r15.getAction()
            r0 = 1
            if (r4 == r0) goto L17
            if (r4 == 0) goto L17
            r0 = 3
            if (r4 != r0) goto L15
            X.0Ct r0 = r12.A00
            if (r0 == 0) goto L15
            r0.APh(r13, r15)
        L15:
            r1 = 0
        L16:
            return r1
        L17:
            float r0 = r15.getX()
            int r2 = (int) r0
            float r0 = r15.getY()
            int r1 = (int) r0
            int r0 = r13.getTotalPaddingLeft()
            int r2 = r2 - r0
            int r0 = r13.getTotalPaddingTop()
            int r1 = r1 - r0
            int r11 = r13.getScrollX()
            int r11 = r11 + r2
            int r0 = r13.getScrollY()
            int r0 = r0 + r1
            android.text.Layout r10 = r13.getLayout()
            int r8 = r10.getLineForVertical(r0)
            int r7 = r10.getLineStart(r8)
            int r6 = r10.getLineEnd(r8)
            int r0 = r6 - r7
            r5 = 256(0x100, float:3.59E-43)
            if (r0 <= r5) goto L9a
            r3 = r7
            r2 = 0
        L4d:
            if (r3 >= r6) goto L9a
            char r1 = r14.charAt(r3)
            r0 = 8206(0x200e, float:1.1499E-41)
            if (r1 == r0) goto L73
            r0 = 8207(0x200f, float:1.15E-41)
            if (r1 == r0) goto L73
            r0 = 1564(0x61c, float:2.192E-42)
            if (r1 == r0) goto L73
            r0 = 1807(0x70f, float:2.532E-42)
            if (r1 == r0) goto L73
            r0 = 8234(0x202a, float:1.1538E-41)
            if (r1 < r0) goto L6b
            r0 = 8238(0x202e, float:1.1544E-41)
            if (r1 <= r0) goto L73
        L6b:
            r0 = 8294(0x2066, float:1.1622E-41)
            if (r1 < r0) goto L97
            r0 = 8297(0x2069, float:1.1627E-41)
            if (r1 > r0) goto L97
        L73:
            int r2 = r2 + 1
            if (r2 <= r5) goto L97
            java.lang.Object[] r3 = r14.getSpans(r7, r6, r9)
            X.0Ct[] r3 = (X.InterfaceC02760Ct[]) r3
            int r0 = r3.length
            r2 = 1
            r1 = 0
            if (r0 <= r2) goto L84
            X.0Ct[] r3 = new X.InterfaceC02760Ct[r1]
        L84:
            int r0 = r3.length
            if (r0 == 0) goto L16
            r0 = r3[r1]
            r12.A00 = r0
            if (r4 != r2) goto L91
            r0.APh(r13, r15)
        L90:
            return r2
        L91:
            if (r4 != 0) goto L90
            r0.APh(r13, r15)
            return r2
        L97:
            int r3 = r3 + 1
            goto L4d
        L9a:
            float r0 = (float) r11
            int r0 = r10.getOffsetForHorizontal(r8, r0)
            java.lang.Object[] r3 = r14.getSpans(r0, r0, r9)
            X.0Ct[] r3 = (X.InterfaceC02760Ct[]) r3
            r1 = 0
            r2 = 1
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02770Cu.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
