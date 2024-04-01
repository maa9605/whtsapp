package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* renamed from: X.1Uq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28971Uq extends AbstractC16120ps {
    public int[] A00 = new int[2];
    public static final String[] A08 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property A04 = new Property() { // from class: X.0pZ
        public Rect A00 = new Rect();

        @Override // android.util.Property
        public Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.A00);
            Rect rect = this.A00;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.A00);
            this.A00.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.A00);
        }
    };
    public static final Property A07 = new Property() { // from class: X.0pa
        @Override // android.util.Property
        public Object get(Object obj) {
            return null;
        }

        @Override // android.util.Property
        public void set(Object obj, Object obj2) {
            C16000pg c16000pg = (C16000pg) obj;
            PointF pointF = (PointF) obj2;
            if (c16000pg != null) {
                int round = Math.round(pointF.x);
                c16000pg.A02 = round;
                int round2 = Math.round(pointF.y);
                c16000pg.A04 = round2;
                int i = c16000pg.A05 + 1;
                c16000pg.A05 = i;
                if (i == c16000pg.A01) {
                    C16220q2.A02(c16000pg.A06, round, round2, c16000pg.A03, c16000pg.A00);
                    c16000pg.A05 = 0;
                    c16000pg.A01 = 0;
                    return;
                }
                return;
            }
            throw null;
        }
    };
    public static final Property A03 = new Property() { // from class: X.0pb
        @Override // android.util.Property
        public Object get(Object obj) {
            return null;
        }

        @Override // android.util.Property
        public void set(Object obj, Object obj2) {
            C16000pg c16000pg = (C16000pg) obj;
            PointF pointF = (PointF) obj2;
            if (c16000pg != null) {
                int round = Math.round(pointF.x);
                c16000pg.A03 = round;
                int round2 = Math.round(pointF.y);
                c16000pg.A00 = round2;
                int i = c16000pg.A01 + 1;
                c16000pg.A01 = i;
                if (c16000pg.A05 == i) {
                    C16220q2.A02(c16000pg.A06, c16000pg.A02, c16000pg.A04, round, round2);
                    c16000pg.A05 = 0;
                    c16000pg.A01 = 0;
                    return;
                }
                return;
            }
            throw null;
        }
    };
    public static final Property A02 = new Property() { // from class: X.0pc
        @Override // android.util.Property
        public Object get(Object obj) {
            return null;
        }

        @Override // android.util.Property
        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C16220q2.A02(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    public static final Property A06 = new Property() { // from class: X.0pd
        @Override // android.util.Property
        public Object get(Object obj) {
            return null;
        }

        @Override // android.util.Property
        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C16220q2.A02(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    public static final Property A05 = new Property() { // from class: X.0pe
        @Override // android.util.Property
        public Object get(Object obj) {
            return null;
        }

        @Override // android.util.Property
        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C16220q2.A02(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };
    public static C16050pl A01 = new C16050pl();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r2 != r0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC16120ps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator A0Q(android.view.ViewGroup r17, X.C16160pw r18, X.C16160pw r19) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28971Uq.A0Q(android.view.ViewGroup, X.0pw, X.0pw):android.animation.Animator");
    }

    @Override // X.AbstractC16120ps
    public String[] A0S() {
        return A08;
    }

    @Override // X.AbstractC16120ps
    public void A0T(C16160pw c16160pw) {
        A0V(c16160pw);
    }

    @Override // X.AbstractC16120ps
    public void A0U(C16160pw c16160pw) {
        A0V(c16160pw);
    }

    public final void A0V(C16160pw c16160pw) {
        View view = c16160pw.A00;
        if (C0AT.A0h(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            Map map = c16160pw.A02;
            map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeBounds:parent", c16160pw.A00.getParent());
        }
    }
}
