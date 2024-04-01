package X;

import android.view.View;

/* renamed from: X.1F3  reason: invalid class name */
/* loaded from: classes.dex */
public class C1F3 {
    public C1F2 A00;
    public C1F2 A01;
    public C1F4 A02;
    public Float A03;

    public C1F3(C1F4 c1f4, Float f) {
        this.A02 = c1f4;
        this.A03 = f;
    }

    public final int A00(View view, C0Y1 c0y1) {
        C1F4 c1f4 = this.A02;
        int ordinal = c1f4.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return c0y1.A08(view);
            }
            StringBuilder A0P = C000200d.A0P("Invalid gravity :");
            A0P.append(c1f4);
            throw new IllegalArgumentException(A0P.toString());
        }
        return c0y1.A0B(view);
    }

    public final int A01(C0SV c0sv, C0Y1 c0y1) {
        C1F4 c1f4 = this.A02;
        int ordinal = c1f4.ordinal();
        if (ordinal == 0) {
            Float f = this.A03;
            if (c0sv.A0Y()) {
                return Math.round(f.floatValue()) + c0y1.A06();
            }
            return 0;
        } else if (ordinal == 2) {
            if (c0sv.A0Y()) {
                return c0y1.A02();
            }
            return c0y1.A01();
        } else {
            StringBuilder A0P = C000200d.A0P("Invalid gravity :");
            A0P.append(c1f4);
            throw new IllegalArgumentException(A0P.toString());
        }
    }

    public View A02(C0SV c0sv) {
        C0Y1 c0y1;
        if (c0sv.A1A()) {
            C1F2 c1f2 = this.A00;
            if (c1f2 == null || c1f2.A01 != c0sv) {
                c1f2 = new C1F2(c0sv, new C1UO(c0sv));
                this.A00 = c1f2;
            }
            c0y1 = c1f2.A00;
        } else {
            C1F2 c1f22 = this.A01;
            if (c1f22 == null || c1f22.A01 != c0sv) {
                c1f22 = new C1F2(c0sv, new C1UP(c0sv));
                this.A01 = c1f22;
            }
            c0y1 = c1f22.A00;
        }
        int A0A = c0sv.A0A();
        View view = null;
        if (A0A != 0) {
            int i = Integer.MAX_VALUE;
            int A01 = A01(c0sv, c0y1);
            for (int i2 = 0; i2 < A0A; i2++) {
                View A0H = c0sv.A0H(i2);
                int abs = Math.abs(A00(A0H, c0y1) - A01);
                if (abs < i) {
                    view = A0H;
                    i = abs;
                }
            }
        }
        return view;
    }

    public int[] A03(C0SV c0sv, View view) {
        int[] iArr = new int[2];
        if (c0sv.A1A()) {
            C1F2 c1f2 = this.A00;
            if (c1f2 == null || c1f2.A01 != c0sv) {
                c1f2 = new C1F2(c0sv, new C1UO(c0sv));
                this.A00 = c1f2;
            }
            C0Y1 c0y1 = c1f2.A00;
            iArr[0] = A00(view, c0y1) - A01(c0sv, c0y1);
        } else {
            iArr[0] = 0;
        }
        if (c0sv.A1B()) {
            C1F2 c1f22 = this.A01;
            if (c1f22 == null || c1f22.A01 != c0sv) {
                c1f22 = new C1F2(c0sv, new C1UP(c0sv));
                this.A01 = c1f22;
            }
            C0Y1 c0y12 = c1f22.A00;
            iArr[1] = A00(view, c0y12) - A01(c0sv, c0y12);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
