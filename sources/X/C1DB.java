package X;

/* renamed from: X.1DB  reason: invalid class name */
/* loaded from: classes.dex */
public class C1DB {
    public final float A00;
    public final float A01;

    public C1DB(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public static float A00(C1DB c1db, C1DB c1db2) {
        float f = c1db.A00;
        float f2 = c1db.A01;
        float f3 = f - c1db2.A00;
        float f4 = f2 - c1db2.A01;
        return (float) Math.sqrt((f4 * f4) + (f3 * f3));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1DB) {
            C1DB c1db = (C1DB) obj;
            return this.A00 == c1db.A00 && this.A01 == c1db.A01;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A01) + (Float.floatToIntBits(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append('(');
        sb.append(this.A00);
        sb.append(',');
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
