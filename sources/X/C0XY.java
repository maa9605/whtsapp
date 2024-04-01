package X;

/* renamed from: X.0XY  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XY {
    public C0XX A00;

    public C0XY(int i, long j, C02670Ci c02670Ci, byte[] bArr) {
        C12550jf c12550jf = (C12550jf) C0XX.A06.AVX();
        c12550jf.A04(i);
        C0AN A00 = C0AN.A00(c02670Ci.A00.A00());
        c12550jf.A02();
        C0XX c0xx = (C0XX) c12550jf.A00;
        c0xx.A00 |= 2;
        c0xx.A04 = A00;
        C0AN A002 = C0AN.A00(c02670Ci.A01.ASe());
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
}
