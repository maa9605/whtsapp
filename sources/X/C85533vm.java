package X;

import java.text.ParseException;

/* renamed from: X.3vm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C85533vm implements C1RQ {
    public final int A00;
    public final int A01;
    public final byte[] A02;
    public final byte[] A03;

    @Override // X.C1RQ
    public int getType() {
        return 4;
    }

    public C85533vm(int i, int i2, byte[] bArr, InterfaceC02660Ch interfaceC02660Ch) {
        byte[] bArr2 = {(byte) 51};
        C0CT AVX = C879941i.A04.AVX();
        AVX.A02();
        C879941i c879941i = (C879941i) AVX.A00;
        c879941i.A00 |= 1;
        c879941i.A01 = i;
        AVX.A02();
        C879941i c879941i2 = (C879941i) AVX.A00;
        c879941i2.A00 |= 2;
        c879941i2.A02 = i2;
        C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
        AVX.A02();
        C879941i c879941i3 = (C879941i) AVX.A00;
        c879941i3.A00 |= 4;
        c879941i3.A03 = A01;
        byte[] A0B = AVX.A01().A0B();
        byte[] A00 = C75823fb.A00(bArr2, A0B);
        try {
            int type = interfaceC02660Ch.getType();
            if (type == 5) {
                this.A03 = C75823fb.A00(bArr2, A0B, C40631sa.A00().A05(((C40651sc) interfaceC02660Ch).A00, A00));
                this.A01 = i;
                this.A00 = i2;
                this.A02 = bArr;
                return;
            }
            StringBuilder A0P = C000200d.A0P("Unknown type: ");
            A0P.append(type);
            throw new C02650Cg(A0P.toString());
        } catch (C02650Cg e) {
            throw new AssertionError(e);
        }
    }

    public C85533vm(byte[] bArr) {
        try {
            byte[][] A03 = C75823fb.A03(bArr, 1, (bArr.length - 1) - 64, 64);
            byte b = A03[0][0];
            byte[] bArr2 = A03[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i);
                throw new C1RD(sb.toString());
            } else if (i <= 3) {
                C879941i c879941i = (C879941i) C0AZ.A03(C879941i.A04, bArr2);
                int i2 = c879941i.A00;
                if ((i2 & 1) == 1 && (i2 & 2) == 2 && (i2 & 4) == 4) {
                    this.A03 = bArr;
                    this.A01 = c879941i.A01;
                    this.A00 = c879941i.A02;
                    this.A02 = c879941i.A03.A06();
                    return;
                }
                throw new C1RB("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i);
                throw new C1RB(sb2.toString());
            }
        } catch (C0JX | ParseException e) {
            throw new C1RB(e);
        }
    }

    public void A00(C02640Cf c02640Cf) {
        try {
            byte[] bArr = this.A03;
            byte[][] A02 = C75823fb.A02(bArr, bArr.length - 64, 64);
            if (AnonymousClass029.A1Z(c02640Cf, A02[0], A02[1])) {
                return;
            }
            throw new C1RB("Invalid signature!");
        } catch (C02650Cg e) {
            throw new C1RB(e);
        }
    }

    @Override // X.C1RQ
    public byte[] ASe() {
        return this.A03;
    }
}
