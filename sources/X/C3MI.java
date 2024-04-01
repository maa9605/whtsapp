package X;

import java.util.Arrays;

/* renamed from: X.3MI  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MI {
    public final long A00;
    public final String A01;

    public C3MI(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3MI.class != obj.getClass()) {
            return false;
        }
        C3MI c3mi = (C3MI) obj;
        return this.A00 == c3mi.A00 && this.A01.equals(c3mi.A01);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Long.valueOf(this.A00)});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("{ path = ");
        C000200d.A1U(A0P, this.A01, ", ", "size", " = ");
        A0P.append(this.A00);
        A0P.append(" } \n");
        return A0P.toString();
    }
}
