package X;

import java.nio.FloatBuffer;

/* renamed from: X.0ry  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17360ry {
    public static final FloatBuffer A07;
    public static final FloatBuffer A09;
    public static final FloatBuffer A0B;
    public static final float[] A0D;
    public static final float[] A0F;
    public static final float[] A0H;
    public EnumC17350rx A04;
    public static final float[] A0I = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public static final FloatBuffer A0C = C17400s2.A02(A0I);
    public static final float[] A0G = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final FloatBuffer A0A = C17400s2.A02(A0G);
    public static final float[] A0E = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public static final FloatBuffer A08 = C17400s2.A02(A0E);
    public FloatBuffer A06 = A07;
    public FloatBuffer A05 = A08;
    public int A00 = 2;
    public int A03 = 8;
    public int A02 = A0D.length / 2;
    public int A01 = 8;

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        A0H = fArr;
        A0B = C17400s2.A02(fArr);
        float[] fArr2 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        A0F = fArr2;
        A09 = C17400s2.A02(fArr2);
        float[] fArr3 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0D = fArr3;
        A07 = C17400s2.A02(fArr3);
    }

    public C17360ry(EnumC17350rx enumC17350rx) {
        this.A04 = enumC17350rx;
    }

    public String toString() {
        EnumC17350rx enumC17350rx = this.A04;
        if (enumC17350rx != null) {
            StringBuilder A0P = C000200d.A0P("[Drawable2d: ");
            A0P.append(enumC17350rx);
            A0P.append("]");
            return A0P.toString();
        }
        return "[Drawable2d: ...]";
    }
}
