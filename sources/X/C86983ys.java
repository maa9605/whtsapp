package X;

/* renamed from: X.3ys  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86983ys extends AbstractC86773yH {
    @Override // X.C0DO
    public String A8K() {
        return "SHA-384";
    }

    @Override // X.C0DO
    public int A9n() {
        return 48;
    }

    public C86983ys() {
    }

    public C86983ys(C86983ys c86983ys) {
        super(c86983ys);
    }

    @Override // X.C0DM
    public C0DM A6a() {
        return new C86983ys(this);
    }

    @Override // X.C0DO
    public int A7P(byte[] bArr, int i) {
        long j = this.A0A;
        if (j > 2305843009213693951L) {
            this.A0B += j >>> 61;
            j &= 2305843009213693951L;
            this.A0A = j;
        }
        long j2 = j << 3;
        long j3 = this.A0B;
        AVj(Byte.MIN_VALUE);
        while (this.A01 != 0) {
            AVj((byte) 0);
        }
        if (this.A00 > 14) {
            A02();
        }
        long[] jArr = this.A0D;
        jArr[14] = j3;
        jArr[15] = j2;
        A02();
        C02180Ae.A0w(this.A02, bArr, i);
        C02180Ae.A0w(this.A03, bArr, i + 8);
        C02180Ae.A0w(this.A04, bArr, i + 16);
        C02180Ae.A0w(this.A05, bArr, i + 24);
        C02180Ae.A0w(this.A06, bArr, i + 32);
        C02180Ae.A0w(this.A07, bArr, i + 40);
        reset();
        return 48;
    }

    @Override // X.C0DM
    public void ARi(C0DM c0dm) {
        super.A03((AbstractC86773yH) c0dm);
    }

    @Override // X.AbstractC86773yH, X.C0DO
    public void reset() {
        super.reset();
        this.A02 = -3766243637369397544L;
        this.A03 = 7105036623409894663L;
        this.A04 = -7973340178411365097L;
        this.A05 = 1526699215303891257L;
        this.A06 = 7436329637833083697L;
        this.A07 = -8163818279084223215L;
        this.A08 = -2662702644619276377L;
        this.A09 = 5167115440072839076L;
    }
}
