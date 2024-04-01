package X;

/* renamed from: X.1EH  reason: invalid class name */
/* loaded from: classes.dex */
public class C1EH {
    public static final C1EH A02 = new C1EH(1.0E21f, C1EG.AUTO);
    public final float A00;
    public final C1EG A01;

    public C1EH(float f, C1EG c1eg) {
        this.A00 = f;
        this.A01 = c1eg;
    }

    public String toString() {
        int ordinal = this.A01.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "auto";
                }
                throw new IllegalStateException();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.A00);
            sb.append("%");
            return sb.toString();
        }
        return Float.toString(this.A00);
    }
}
