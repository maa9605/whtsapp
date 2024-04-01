package X;

import java.util.Arrays;

/* renamed from: X.2AB  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AB {
    public final int A00;
    public final int A01;
    public final long A02;

    public C2AB(int i, int i2, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2AB) {
            C2AB c2ab = (C2AB) obj;
            return this.A00 == c2ab.A00 && this.A01 == c2ab.A01 && this.A02 == c2ab.A02;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("FutureStageTiming{stage=");
        A0P.append(this.A00);
        A0P.append(", type=");
        A0P.append(this.A01);
        A0P.append(", timeInMillis=");
        A0P.append(this.A02);
        A0P.append('}');
        return A0P.toString();
    }
}
