package X;

import java.util.Arrays;

/* renamed from: X.0O2  reason: invalid class name */
/* loaded from: classes.dex */
public class C0O2 {
    public final int A00;
    public final C05200Ns A01;
    public final boolean A02;

    public C0O2(C05200Ns c05200Ns, int i, int i2) {
        this.A01 = c05200Ns == null ? new C05200Ns() : c05200Ns;
        this.A00 = i;
        this.A02 = i2 == 3;
    }

    public static int A00(C018108l c018108l) {
        if (c018108l == null) {
            return 1;
        }
        if (c018108l.A02()) {
            return 2;
        }
        return c018108l.A01() ? 3 : 1;
    }

    public int A01() {
        if (A03(1, 1, 1, false)) {
            return 0;
        }
        if (A03(2, 1, 1, false)) {
            return 1;
        }
        if (A03(2, 1, 1, true)) {
            return 2;
        }
        if (A03(3, 1, 1, false)) {
            return 3;
        }
        if (A03(3, 1, 1, true)) {
            return 4;
        }
        if (A03(3, 1, 2, false)) {
            return 5;
        }
        if (A03(3, 1, 2, true)) {
            return 6;
        }
        if (A03(3, 2, 1, false)) {
            return 7;
        }
        if (A03(3, 2, 1, true)) {
            return 8;
        }
        if (A03(3, 2, 2, false)) {
            return 9;
        }
        if (A03(3, 2, 2, true)) {
            return 10;
        }
        if (A03(1, 0, 0, false)) {
            return 0;
        }
        if (A03(2, 0, 0, false)) {
            return 1;
        }
        if (A03(2, 0, 0, true)) {
            return 2;
        }
        if (A03(3, 0, 0, false)) {
            return 3;
        }
        return A03(3, 0, 0, true) ? 4 : 0;
    }

    public boolean A02() {
        int A01 = A01();
        return A01 == 0 || A01 == 1 || A01 == 2 || A01 == 3 || A01 == 4;
    }

    public final boolean A03(int i, int i2, int i3, boolean z) {
        if (this.A00 == i) {
            C05200Ns c05200Ns = this.A01;
            if (c05200Ns.actualActors == i2 && c05200Ns.hostStorage == i3 && this.A02 == z) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0O2.class != obj.getClass()) {
            return false;
        }
        C0O2 c0o2 = (C0O2) obj;
        return this.A00 == c0o2.A00 && this.A02 == c0o2.A02 && this.A01.equals(c0o2.A01);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00), Boolean.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("BusinessState{privacyMode=");
        A0P.append(this.A01);
        A0P.append(", client=");
        A0P.append(this.A00);
        A0P.append(", isVerified=");
        A0P.append(this.A02);
        A0P.append(", stateId=");
        A0P.append(A01());
        A0P.append('}');
        return A0P.toString();
    }
}
