package X;

/* renamed from: X.0Hk */
/* loaded from: classes.dex */
public class C03860Hk {
    public final int A00;

    public C03860Hk(int i) {
        this.A00 = i;
    }

    public C03860Hk(int i, C59992tk c59992tk) {
        this.A00 = i;
    }

    public static C03860Hk A00(int i) {
        if (i <= 7) {
            return new C03860Hk(i);
        }
        throw new IllegalArgumentException(C000200d.A0D("Initialization state is not recognized. State = ", i));
    }

    public String toString() {
        return String.valueOf(this.A00);
    }
}
