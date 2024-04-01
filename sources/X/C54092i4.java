package X;

import java.util.Hashtable;

/* renamed from: X.2i4 */
/* loaded from: classes2.dex */
public class C54092i4 {
    public static Hashtable A07;
    public int A00;
    public int A01;
    public C0DO A02;
    public C0DM A03;
    public C0DM A04;
    public byte[] A05;
    public byte[] A06;

    static {
        Hashtable hashtable = new Hashtable();
        A07 = hashtable;
        hashtable.put("GOST3411", 32);
        A07.put("MD2", 16);
        A07.put("MD4", 64);
        A07.put("MD5", 64);
        A07.put("RIPEMD128", 64);
        A07.put("RIPEMD160", 64);
        A07.put("SHA-1", 64);
        A07.put("SHA-224", 64);
        A07.put("SHA-256", 64);
        A07.put("SHA-384", 128);
        A07.put("SHA-512", 128);
        A07.put("Tiger", 64);
        A07.put("Whirlpool", 64);
    }

    public C54092i4(C0DO c0do) {
        int intValue;
        if (c0do instanceof C0DN) {
            intValue = ((C0DN) c0do).A8e();
        } else {
            Hashtable hashtable = A07;
            String A8K = c0do.A8K();
            Number number = (Number) hashtable.get(A8K);
            if (number != null) {
                intValue = number.intValue();
            } else {
                StringBuilder A0P = C000200d.A0P("unknown digest passed: ");
                A0P.append(A8K);
                throw new IllegalArgumentException(A0P.toString());
            }
        }
        this.A02 = c0do;
        int A9n = c0do.A9n();
        this.A01 = A9n;
        this.A00 = intValue;
        this.A05 = new byte[intValue];
        this.A06 = new byte[intValue + A9n];
    }

    public void A00(InterfaceC54072i2 interfaceC54072i2) {
        byte[] bArr;
        this.A02.reset();
        byte[] bArr2 = ((C54102i5) interfaceC54072i2).A00;
        int length = bArr2.length;
        if (length > this.A00) {
            C0DO c0do = this.A02;
            c0do.update(bArr2, 0, length);
            c0do.A7P(this.A05, 0);
            length = this.A01;
        } else {
            System.arraycopy(bArr2, 0, this.A05, 0, length);
        }
        while (true) {
            bArr = this.A05;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.A06, 0, this.A00);
        byte[] bArr3 = this.A05;
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ 54);
        }
        byte[] bArr4 = this.A06;
        for (int i3 = 0; i3 < i; i3++) {
            bArr4[i3] = (byte) (bArr4[i3] ^ 92);
        }
        C0DO c0do2 = this.A02;
        if (c0do2 instanceof C0DM) {
            C0DM A6a = ((C0DM) c0do2).A6a();
            this.A04 = A6a;
            ((C0DO) A6a).update(this.A06, 0, this.A00);
        }
        C0DO c0do3 = this.A02;
        byte[] bArr5 = this.A05;
        c0do3.update(bArr5, 0, bArr5.length);
        if (c0do3 instanceof C0DM) {
            this.A03 = ((C0DM) c0do3).A6a();
        }
    }

    public void A01(byte[] bArr) {
        C0DO c0do;
        this.A02.A7P(this.A06, this.A00);
        C0DM c0dm = this.A04;
        if (c0dm != null) {
            ((C0DM) this.A02).ARi(c0dm);
            c0do = this.A02;
            c0do.update(this.A06, this.A00, c0do.A9n());
        } else {
            c0do = this.A02;
            byte[] bArr2 = this.A06;
            c0do.update(bArr2, 0, bArr2.length);
        }
        c0do.A7P(bArr, 0);
        int i = this.A00;
        while (true) {
            byte[] bArr3 = this.A06;
            if (i >= bArr3.length) {
                break;
            }
            bArr3[i] = 0;
            i++;
        }
        C0DM c0dm2 = this.A03;
        if (c0dm2 != null) {
            ((C0DM) this.A02).ARi(c0dm2);
            return;
        }
        C0DO c0do2 = this.A02;
        byte[] bArr4 = this.A05;
        c0do2.update(bArr4, 0, bArr4.length);
    }
}
