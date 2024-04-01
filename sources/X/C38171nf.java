package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1nf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38171nf implements C1RQ {
    public final int A00;
    public final int A01;
    public final C02640Cf A02;
    public final byte[] A03;
    public final byte[] A04;

    @Override // X.C1RQ
    public int getType() {
        return 2;
    }

    public C38171nf(int i, SecretKeySpec secretKeySpec, C02640Cf c02640Cf, int i2, int i3, byte[] bArr, C1R8 c1r8, C1R8 c1r82) {
        byte[] bArr2 = {(byte) (((i << 4) | 3) & 255)};
        C0CT AVX = C880141k.A05.AVX();
        C0AN A00 = C0AN.A00(c02640Cf.A00());
        AVX.A02();
        C880141k.A09((C880141k) AVX.A00, A00);
        AVX.A02();
        C880141k c880141k = (C880141k) AVX.A00;
        c880141k.A00 |= 2;
        c880141k.A01 = i2;
        AVX.A02();
        C880141k c880141k2 = (C880141k) AVX.A00;
        c880141k2.A00 |= 4;
        c880141k2.A02 = i3;
        C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
        AVX.A02();
        C880141k.A0A((C880141k) AVX.A00, A01);
        byte[] A0B = AVX.A01().A0B();
        this.A04 = C75823fb.A00(bArr2, A0B, A00(i, c1r8, c1r82, secretKeySpec, C75823fb.A00(bArr2, A0B)));
        this.A02 = c02640Cf;
        this.A00 = i2;
        this.A03 = bArr;
        this.A01 = i;
    }

    public C38171nf(byte[] bArr) {
        try {
            byte[][] A03 = C75823fb.A03(bArr, 1, (bArr.length - 1) - 8, 8);
            byte b = A03[0][0];
            byte[] bArr2 = A03[1];
            int i = (b & 255) >> 4;
            if (i <= 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i);
                throw new C1RD(sb.toString());
            } else if (i <= 3) {
                C880141k c880141k = (C880141k) C0AZ.A03(C880141k.A05, bArr2);
                if (c880141k.A0i() && c880141k.A0j() && c880141k.A0k()) {
                    this.A04 = bArr;
                    this.A02 = AnonymousClass029.A13(c880141k.A04.A06());
                    this.A01 = i;
                    this.A00 = c880141k.A01;
                    this.A03 = c880141k.A03.A06();
                    return;
                }
                throw new C1RB("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i);
                throw new C1RB(sb2.toString());
            }
        } catch (C02650Cg | C0JX | ParseException e) {
            throw new C1RB(e);
        }
    }

    public static final byte[] A00(int i, C1R8 c1r8, C1R8 c1r82, SecretKeySpec secretKeySpec, byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            if (i >= 3) {
                mac.update(c1r8.A00.A00());
                mac.update(c1r82.A00.A00());
            }
            byte[] doFinal = mac.doFinal(bArr);
            byte[] bArr2 = new byte[8];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            return bArr2;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // X.C1RQ
    public byte[] ASe() {
        return this.A04;
    }
}
