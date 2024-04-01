package X;

/* renamed from: X.109  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass109 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final AnonymousClass107 A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public AnonymousClass109(AnonymousClass107 anonymousClass107, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        C002701i.A1J(length == length2);
        int length3 = jArr.length;
        C002701i.A1J(length3 == length2);
        int length4 = iArr2.length;
        C002701i.A1J(length4 == length2);
        this.A03 = anonymousClass107;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public int A00(long j) {
        for (int A02 = C08M.A02(this.A07, j); A02 >= 0; A02--) {
            if ((this.A04[A02] & 1) != 0) {
                return A02;
            }
        }
        return -1;
    }

    public int A01(long j) {
        long[] jArr = this.A07;
        for (int A03 = C08M.A03(jArr, j, true, false); A03 < jArr.length; A03++) {
            if ((this.A04[A03] & 1) != 0) {
                return A03;
            }
        }
        return -1;
    }
}
