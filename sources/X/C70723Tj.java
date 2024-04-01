package X;

import java.util.Arrays;

/* renamed from: X.3Tj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C70723Tj {
    public final long A00;
    public final EnumC79253lM A01;
    public final String A02;
    public final String A03;
    public final byte[] A04;
    public final byte[] A05;
    public final byte[] A06;
    public final byte[] A07;

    public C70723Tj(C48392Fb c48392Fb) {
        EnumC79253lM enumC79253lM;
        EnumC79253lM enumC79253lM2 = EnumC79253lM.IMAGE;
        int i = c48392Fb.A00;
        if (i != 0) {
            enumC79253lM = i == 1 ? EnumC79253lM.PDF : enumC79253lM;
            this.A01 = enumC79253lM2;
            this.A03 = c48392Fb.A08;
            this.A07 = c48392Fb.A06.A06();
            this.A00 = c48392Fb.A02;
            this.A05 = c48392Fb.A04.A06();
            this.A04 = c48392Fb.A03.A06();
            this.A02 = c48392Fb.A07;
            this.A06 = c48392Fb.A05.A06();
        }
        enumC79253lM = enumC79253lM2;
        if (enumC79253lM != null) {
            enumC79253lM2 = enumC79253lM;
        }
        this.A01 = enumC79253lM2;
        this.A03 = c48392Fb.A08;
        this.A07 = c48392Fb.A06.A06();
        this.A00 = c48392Fb.A02;
        this.A05 = c48392Fb.A04.A06();
        this.A04 = c48392Fb.A03.A06();
        this.A02 = c48392Fb.A07;
        this.A06 = c48392Fb.A05.A06();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C70723Tj.class != obj.getClass()) {
            return false;
        }
        C70723Tj c70723Tj = (C70723Tj) obj;
        return this.A00 == c70723Tj.A00 && this.A01 == c70723Tj.A01 && AnonymousClass024.A0l(this.A03, c70723Tj.A03) && Arrays.equals(this.A07, c70723Tj.A07) && Arrays.equals(this.A05, c70723Tj.A05) && Arrays.equals(this.A04, c70723Tj.A04) && AnonymousClass024.A0l(this.A02, c70723Tj.A02) && Arrays.equals(this.A06, c70723Tj.A06);
    }

    public int hashCode() {
        return (((((((Arrays.hashCode(new Object[]{this.A01, this.A03, Long.valueOf(this.A00), this.A02}) * 31) + Arrays.hashCode(new Object[]{this.A07})) * 31) + Arrays.hashCode(new Object[]{this.A05})) * 31) + Arrays.hashCode(new Object[]{this.A04})) * 31) + Arrays.hashCode(new Object[]{this.A06});
    }
}
