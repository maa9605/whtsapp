package X;

/* renamed from: X.0Mx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05010Mx {
    public C13270ks A00;

    public C05010Mx(int i, C02670Ci c02670Ci) {
        C0CT AVX = C13270ks.A04.AVX();
        AVX.A02();
        C13270ks c13270ks = (C13270ks) AVX.A00;
        c13270ks.A00 |= 1;
        c13270ks.A01 = i;
        C0AN A00 = C0AN.A00(c02670Ci.A00.A00());
        AVX.A02();
        C13270ks c13270ks2 = (C13270ks) AVX.A00;
        c13270ks2.A00 |= 2;
        c13270ks2.A03 = A00;
        C0AN A002 = C0AN.A00(c02670Ci.A01.ASe());
        AVX.A02();
        C13270ks c13270ks3 = (C13270ks) AVX.A00;
        c13270ks3.A00 |= 4;
        c13270ks3.A02 = A002;
        this.A00 = (C13270ks) AVX.A01();
    }

    public C05010Mx(byte[] bArr) {
        this.A00 = (C13270ks) C0AZ.A03(C13270ks.A04, bArr);
    }

    public C02670Ci A00() {
        try {
            return new C02670Ci(AnonymousClass029.A13(this.A00.A03.A06()), new C40651sc(this.A00.A02.A06()));
        } catch (C02650Cg e) {
            throw new AssertionError(e);
        }
    }
}
