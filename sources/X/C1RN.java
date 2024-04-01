package X;

/* renamed from: X.1RN  reason: invalid class name */
/* loaded from: classes.dex */
public class C1RN {
    public C13510lN A00;

    public C1RN(int i, int i2, byte[][] bArr, C02640Cf c02640Cf, AbstractC75873fg abstractC75873fg) {
        C75103eM c75103eM = (C75103eM) C75093eL.A03.AVX();
        C0AN A00 = C0AN.A00(c02640Cf.A00());
        c75103eM.A02();
        C75093eL.A09((C75093eL) c75103eM.A00, A00);
        if (abstractC75873fg.A02()) {
            C0AN A002 = C0AN.A00(((InterfaceC02660Ch) abstractC75873fg.A01()).ASe());
            c75103eM.A02();
            C75093eL.A0A((C75093eL) c75103eM.A00, A002);
        }
        C0CT AVX = C13510lN.A04.AVX();
        AVX.A02();
        C13510lN c13510lN = (C13510lN) AVX.A00;
        c13510lN.A00 |= 1;
        c13510lN.A01 = i;
        AVX.A02();
        C13510lN.A09((C13510lN) AVX.A00, c75103eM);
        int length = bArr.length;
        int[] A01 = C75823fb.A01(i2, length);
        for (int i3 = 0; i3 < length; i3++) {
            C880941s A09 = C881041t.A09();
            A09.A04(A01[i3]);
            C0AN A003 = C0AN.A00(bArr[i3]);
            A09.A02();
            C881041t.A0A((C881041t) A09.A00, A003);
            C0AZ A012 = A09.A01();
            AVX.A02();
            C13510lN c13510lN2 = (C13510lN) AVX.A00;
            if (A012 != null) {
                C0CX c0cx = c13510lN2.A02;
                if (!((C0CY) c0cx).A00) {
                    c0cx = C0AZ.A05(c0cx);
                    c13510lN2.A02 = c0cx;
                }
                c0cx.add(A012);
            } else {
                throw null;
            }
        }
        this.A00 = (C13510lN) AVX.A01();
    }

    public C1RN(C13510lN c13510lN) {
        this.A00 = c13510lN;
    }

    public C02640Cf A00() {
        return AnonymousClass029.A13(this.A00.A0i().A02.A06());
    }

    public C75713fQ A01() {
        return new C75713fQ(this.A00.A02);
    }

    public void A02(C75713fQ c75713fQ) {
        byte[][] bArr = c75713fQ.A01;
        int i = c75713fQ.A00;
        int length = bArr.length;
        int[] A01 = C75823fb.A01(i, length);
        C0CT AVX = this.A00.AVX();
        AVX.A02();
        C13510lN c13510lN = (C13510lN) AVX.A00;
        if (c13510lN != null) {
            c13510lN.A02 = C0RU.A01;
            for (int i2 = 0; i2 < length; i2++) {
                C880941s A09 = C881041t.A09();
                A09.A04(A01[i2]);
                C0AN A00 = C0AN.A00(bArr[i2]);
                A09.A02();
                C881041t.A0A((C881041t) A09.A00, A00);
                C0AZ A012 = A09.A01();
                AVX.A02();
                C13510lN c13510lN2 = (C13510lN) AVX.A00;
                if (A012 != null) {
                    C0CX c0cx = c13510lN2.A02;
                    if (!((C0CY) c0cx).A00) {
                        c0cx = C0AZ.A05(c0cx);
                        c13510lN2.A02 = c0cx;
                    }
                    c0cx.add(A012);
                } else {
                    throw null;
                }
            }
            this.A00 = (C13510lN) AVX.A01();
            return;
        }
        throw null;
    }
}
