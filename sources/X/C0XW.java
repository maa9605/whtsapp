package X;

/* renamed from: X.0XW  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XW {
    public final C0XX A00;

    public C0XW(int i, long j, C0XQ c0xq, byte[] bArr) {
        C12550jf c12550jf = (C12550jf) C0XX.A06.AVX();
        c12550jf.A04(i);
        C0AN A00 = C0AN.A00(c0xq.A01.A00());
        c12550jf.A02();
        C0XX c0xx = (C0XX) c12550jf.A00;
        c0xx.A00 |= 2;
        c0xx.A04 = A00;
        C0AN A002 = C0AN.A00(c0xq.A00.A01);
        c12550jf.A02();
        C0XX c0xx2 = (C0XX) c12550jf.A00;
        c0xx2.A00 |= 4;
        c0xx2.A03 = A002;
        C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
        c12550jf.A02();
        C0XX c0xx3 = (C0XX) c12550jf.A00;
        c0xx3.A00 |= 8;
        c0xx3.A05 = A01;
        c12550jf.A05(j);
        this.A00 = (C0XX) c12550jf.A01();
    }

    public C0XW(byte[] bArr) {
        this.A00 = (C0XX) C0AZ.A03(C0XX.A06, bArr);
    }

    public C0XQ A00() {
        try {
            C0XX c0xx = this.A00;
            return new C0XQ(C002701i.A0S(c0xx.A04.A06()), new C0R8(c0xx.A03.A06(), (byte) 5));
        } catch (C05240Nw e) {
            throw new AssertionError(e);
        }
    }
}
