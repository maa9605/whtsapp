package X;

import android.util.Pair;
import java.util.Arrays;

/* renamed from: X.1zw */
/* loaded from: classes2.dex */
public class C44961zw {
    public final C44981zy A00;
    public final C44651zQ A01;

    public C44961zw(C44651zQ c44651zQ, C44981zy c44981zy) {
        this.A01 = c44651zQ;
        this.A00 = c44981zy;
    }

    public static Pair A00(C87433ze c87433ze) {
        C87483zj c87483zj = c87433ze.A02;
        if (c87483zj == null) {
            c87483zj = C87483zj.A02;
        }
        C44651zQ A00 = C44651zQ.A00(c87483zj);
        if (A00 != null) {
            if ((c87433ze.A00 & 2) == 2) {
                C87453zg c87453zg = c87433ze.A01;
                if (c87453zg == null) {
                    c87453zg = C87453zg.A04;
                }
                int i = c87453zg.A00;
                if ((i & 4) == 4 || (i & 2) == 2 || (i & 1) == 1) {
                    AnonymousClass201 anonymousClass201 = c87453zg.A03;
                    if (anonymousClass201 == null) {
                        anonymousClass201 = AnonymousClass201.A05;
                    }
                    C44971zx A002 = C44971zx.A00(anonymousClass201);
                    if (A002 != null) {
                        return new Pair(A00, new C44961zw(A00, new C44981zy(c87453zg.A02.A06(), c87453zg.A01, A002)));
                    }
                }
                throw new C44921zs(57);
            }
            return new Pair(A00, null);
        }
        throw new C44921zs(53);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44961zw) {
            C44961zw c44961zw = (C44961zw) obj;
            return this.A01.equals(c44961zw.A01) && this.A00.equals(c44961zw.A00);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SyncdKey{keyId=");
        A0P.append(this.A01);
        A0P.append(", syncdKeyData=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
