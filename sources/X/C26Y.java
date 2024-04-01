package X;

/* renamed from: X.26Y  reason: invalid class name */
/* loaded from: classes2.dex */
public class C26Y {
    public static final C26Y A01 = new C26Y();
    public int A00 = 3;

    public boolean A00() {
        return this.A00 == 1;
    }

    public boolean A01() {
        return this.A00 == 3;
    }

    public boolean A02() {
        return this.A00 == 2;
    }

    public String toString() {
        int i = this.A00;
        return i == 1 ? "available" : i == 3 ? "un-available" : "available-waiting-timeout";
    }
}
