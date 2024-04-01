package X;

/* renamed from: X.20e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C450420e {
    public final C004802e A01 = new C004802e();
    public final C004802e A00 = new C004802e();

    public static final boolean A00(C004802e c004802e, boolean z) {
        boolean z2;
        synchronized (c004802e) {
            z2 = c004802e.A00 > 3;
        }
        if (z2) {
            return false;
        }
        if (z) {
            c004802e.A01();
            return true;
        }
        c004802e.A02();
        return true;
    }

    public final boolean A01() {
        return this.A01.A05() && this.A00.A05();
    }

    public final boolean A02() {
        boolean z;
        boolean z2;
        C004802e c004802e = this.A01;
        synchronized (c004802e) {
            z = c004802e.A00 == 5;
        }
        if (z) {
            C004802e c004802e2 = this.A00;
            synchronized (c004802e2) {
                z2 = c004802e2.A00 == 5;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean A03() {
        boolean z;
        boolean z2;
        C004802e c004802e = this.A01;
        synchronized (c004802e) {
            z = c004802e.A00 == 4;
        }
        if (!z) {
            C004802e c004802e2 = this.A00;
            synchronized (c004802e2) {
                z2 = c004802e2.A00 == 4;
            }
            if (!z2 && !A02()) {
                return false;
            }
        }
        return true;
    }
}
