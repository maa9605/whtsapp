package X;

/* renamed from: X.3A8  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3A8 extends AbstractC59942tf {
    public final C87083z5 A00;
    public final byte[] A01;
    public final byte[] A02;

    public C3A8(byte[] bArr, byte[] bArr2, String str, String str2) {
        this.A02 = bArr;
        this.A01 = bArr2;
        C0CT AVX = C87063z3.A04.AVX();
        if (str != null) {
            AVX.A02();
            C87063z3 c87063z3 = (C87063z3) AVX.A00;
            c87063z3.A00 |= 1;
            c87063z3.A01 = str;
        }
        if (str2 != null) {
            String substring = str2.substring(str2.length() - 2);
            AVX.A02();
            C87063z3 c87063z32 = (C87063z3) AVX.A00;
            if (substring != null) {
                c87063z32.A00 |= 4;
                c87063z32.A03 = substring;
            } else {
                throw null;
            }
        }
        C0CT AVX2 = C87083z5.A05.AVX();
        EnumC79083l3 enumC79083l3 = EnumC79083l3.HSM_CONTROLLED;
        AVX2.A02();
        C87083z5 c87083z5 = (C87083z5) AVX2.A00;
        c87083z5.A00 |= 1;
        c87083z5.A01 = enumC79083l3.value;
        C0CT AVX3 = C87103z7.A02.AVX();
        C0AN A01 = C0AN.A01(bArr2, 0, bArr2.length);
        AVX3.A02();
        C87103z7 c87103z7 = (C87103z7) AVX3.A00;
        c87103z7.A00 |= 1;
        c87103z7.A01 = A01;
        C87103z7 c87103z72 = (C87103z7) AVX3.A01();
        AVX2.A02();
        C87083z5 c87083z52 = (C87083z5) AVX2.A00;
        if (c87103z72 != null) {
            c87083z52.A03 = c87103z72;
            c87083z52.A00 |= 4;
            AVX2.A02();
            C87083z5 c87083z53 = (C87083z5) AVX2.A00;
            if (c87083z53 != null) {
                c87083z53.A02 = (C87063z3) AVX.A01();
                c87083z53.A00 |= 8;
                this.A00 = (C87083z5) AVX2.A01();
                return;
            }
            throw null;
        }
        throw null;
    }
}
