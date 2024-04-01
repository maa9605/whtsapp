package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1zx */
/* loaded from: classes2.dex */
public class C44971zx {
    public final int A00;
    public final int A01;
    public final Set A02;

    public C44971zx(int i, int i2, Set set) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public static C44971zx A00(AnonymousClass201 anonymousClass201) {
        int i = anonymousClass201.A00;
        if ((i & 1) == 1 && (i & 2) == 2 && anonymousClass201.A04.size() != 0) {
            return new C44971zx(anonymousClass201.A03, anonymousClass201.A01, new HashSet(anonymousClass201.A04));
        }
        return null;
    }

    public AnonymousClass201 A01() {
        C0CT AVX = AnonymousClass201.A05.AVX();
        int i = this.A01;
        AVX.A02();
        AnonymousClass201 anonymousClass201 = (AnonymousClass201) AVX.A00;
        anonymousClass201.A00 |= 1;
        anonymousClass201.A03 = i;
        int i2 = this.A00;
        AVX.A02();
        AnonymousClass201 anonymousClass2012 = (AnonymousClass201) AVX.A00;
        anonymousClass2012.A00 |= 2;
        anonymousClass2012.A01 = i2;
        Set set = this.A02;
        AVX.A02();
        AnonymousClass201 anonymousClass2013 = (AnonymousClass201) AVX.A00;
        C0O0 c0o0 = anonymousClass2013.A04;
        if (!((C0CY) c0o0).A00) {
            anonymousClass2013.A04 = C0AZ.A04(c0o0);
        }
        C0Aa.A08(set, anonymousClass2013.A04);
        return (AnonymousClass201) AVX.A01();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44971zx) {
            C44971zx c44971zx = (C44971zx) obj;
            return this.A01 == c44971zx.A01 && this.A00 == c44971zx.A00 && this.A02.equals(c44971zx.A02);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A02});
    }

    public String toString() {
        StringBuilder A0V = C000200d.A0V("SyncdKeyFingerprint{", "rawId=");
        A0V.append(this.A01);
        A0V.append(", currentIndex=");
        A0V.append(this.A00);
        A0V.append(", deviceIndexes=");
        A0V.append(this.A02);
        A0V.append('}');
        return A0V.toString();
    }
}
