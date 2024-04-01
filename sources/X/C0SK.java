package X;

import android.content.Context;
import android.graphics.Canvas;
import java.util.Comparator;

/* renamed from: X.0SK  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0SK {
    public static int A0E;
    public static final Comparator A0F = new Comparator() { // from class: X.0td
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            C0SK c0sk = (C0SK) obj;
            C0SK c0sk2 = (C0SK) obj2;
            int i = c0sk.A03;
            int i2 = c0sk2.A03;
            float f = c0sk.A02;
            float f2 = c0sk2.A02;
            int i3 = i - i2;
            if (i == i2) {
                if (f != f2) {
                    return (int) Math.signum(f - f2);
                }
                return c0sk.A07 - c0sk2.A07;
            }
            return i3;
        }
    };
    public double A00;
    public double A01;
    public float A02;
    public final float A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final C0T4 A0A;
    public final C18450tl A0B;
    public final float[] A0D = new float[2];
    public boolean A04 = true;
    public int A03 = 1;
    public boolean A05 = true;
    public final C18630u3 A0C = new C18630u3();

    public int A00(float f, float f2) {
        return 0;
    }

    public void A02() {
    }

    public void A04(float f, float f2) {
    }

    public void A05(float f, float f2) {
    }

    public boolean A06(float f, float f2) {
        return false;
    }

    public boolean A07(float f, float f2) {
        return false;
    }

    public boolean A08(float f, float f2) {
        return false;
    }

    public boolean A09(float f, float f2, float f3, float f4) {
        return false;
    }

    public void A0A() {
    }

    public abstract void A0B(Canvas canvas);

    public C0SK(C0T4 c0t4) {
        int i = A0E;
        A0E = i + 1;
        this.A07 = i;
        this.A0A = c0t4;
        this.A0B = c0t4.A0R;
        Context context = c0t4.A0E.getContext();
        this.A09 = context;
        this.A06 = context.getResources().getDisplayMetrics().density;
        this.A08 = c0t4.A0O;
    }

    public void A01() {
        this.A0A.A0E.invalidate();
    }

    public void A03() {
        C0T4 c0t4 = this.A0A;
        c0t4.A0A(this);
        c0t4.A09(this);
    }
}
