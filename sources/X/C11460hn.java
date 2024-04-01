package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.0hn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11460hn extends TouchDelegate {
    public boolean A00;
    public final int A01;
    public final Rect A02;
    public final Rect A03;
    public final Rect A04;
    public final View A05;

    public C11460hn(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.A01 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.A04 = new Rect();
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A04.set(rect);
        Rect rect3 = this.A03;
        rect3.set(rect);
        int i = -this.A01;
        rect3.inset(i, i);
        this.A02.set(rect2);
        this.A05 = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r7.A03.contains(r1, r4) == false) goto L15;
     */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r1 = (int) r0
            float r0 = r8.getY()
            int r4 = (int) r0
            int r6 = r8.getAction()
            r3 = 2
            r5 = 1
            r2 = 0
            if (r6 == 0) goto L5a
            if (r6 == r5) goto L40
            if (r6 == r3) goto L40
            r0 = 3
            if (r6 != r0) goto L3f
            boolean r0 = r7.A00
            r7.A00 = r2
            if (r0 == 0) goto L3f
        L20:
            android.graphics.Rect r0 = r7.A02
            boolean r0 = r0.contains(r1, r4)
            if (r0 != 0) goto L4c
            android.view.View r2 = r7.A05
            int r0 = r2.getWidth()
            int r0 = r0 / r3
            float r1 = (float) r0
            int r0 = r2.getHeight()
            int r0 = r0 / r3
            float r0 = (float) r0
            r8.setLocation(r1, r0)
        L39:
            android.view.View r0 = r7.A05
            boolean r2 = r0.dispatchTouchEvent(r8)
        L3f:
            return r2
        L40:
            boolean r0 = r7.A00
            if (r0 == 0) goto L3f
            android.graphics.Rect r0 = r7.A03
            boolean r0 = r0.contains(r1, r4)
            if (r0 != 0) goto L20
        L4c:
            android.graphics.Rect r2 = r7.A02
            int r0 = r2.left
            int r1 = r1 - r0
            float r1 = (float) r1
            int r0 = r2.top
            int r4 = r4 - r0
            float r0 = (float) r4
            r8.setLocation(r1, r0)
            goto L39
        L5a:
            android.graphics.Rect r0 = r7.A04
            boolean r0 = r0.contains(r1, r4)
            if (r0 == 0) goto L3f
            r7.A00 = r5
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11460hn.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
