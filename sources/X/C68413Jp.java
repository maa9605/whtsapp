package X;

/* renamed from: X.3Jp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68413Jp extends C3A7 {
    public final C87083z5 A00;

    public C68413Jp(C03780Ha c03780Ha, byte[] bArr, byte[] bArr2, byte[] bArr3, String str, String str2) {
        super(c03780Ha, bArr, bArr2, bArr3);
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
        EnumC79083l3 enumC79083l3 = EnumC79083l3.WA_PROVIDED;
        AVX2.A02();
        C87083z5 c87083z5 = (C87083z5) AVX2.A00;
        c87083z5.A00 |= 1;
        c87083z5.A01 = enumC79083l3.value;
        C0CT AVX3 = C87123z9.A06.AVX();
        C0AN A00 = C0AN.A00(c03780Ha.A03);
        AVX3.A02();
        C87123z9 c87123z9 = (C87123z9) AVX3.A00;
        c87123z9.A00 |= 1;
        c87123z9.A01 = A00;
        String str3 = c03780Ha.A00;
        AVX3.A02();
        C87123z9 c87123z92 = (C87123z9) AVX3.A00;
        if (str3 != null) {
            c87123z92.A00 |= 2;
            c87123z92.A05 = str3;
            C0AN A002 = C0AN.A00(c03780Ha.A04);
            AVX3.A02();
            C87123z9 c87123z93 = (C87123z9) AVX3.A00;
            c87123z93.A00 |= 4;
            c87123z93.A04 = A002;
            C0AN A003 = C0AN.A00(c03780Ha.A02);
            AVX3.A02();
            C87123z9 c87123z94 = (C87123z9) AVX3.A00;
            c87123z94.A00 |= 8;
            c87123z94.A03 = A003;
            C0AN A004 = C0AN.A00(c03780Ha.A01);
            AVX3.A02();
            C87123z9 c87123z95 = (C87123z9) AVX3.A00;
            c87123z95.A00 |= 16;
            c87123z95.A02 = A004;
            C87123z9 c87123z96 = (C87123z9) AVX3.A01();
            AVX2.A02();
            C87083z5 c87083z52 = (C87083z5) AVX2.A00;
            if (c87123z96 != null) {
                c87083z52.A04 = c87123z96;
                c87083z52.A00 |= 2;
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
        throw null;
    }
}
