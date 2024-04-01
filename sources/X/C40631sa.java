package X;

/* renamed from: X.1sa */
/* loaded from: classes2.dex */
public class C40631sa {
    public final InterfaceC54262iO A00;

    public C40631sa(InterfaceC54262iO interfaceC54262iO) {
        this.A00 = interfaceC54262iO;
    }

    public static C40631sa A00() {
        if ("native".equals("best")) {
            return new C40631sa(A01("NativeCurve25519Provider"));
        }
        if ("java".equals("best")) {
            return new C40631sa(A01("JavaCurve25519Provider"));
        }
        if ("j2me".equals("best")) {
            return new C40631sa(A01("J2meCurve25519Provider"));
        }
        if ("best".equals("best")) {
            return new C40631sa(A01("OpportunisticCurve25519Provider"));
        }
        throw new C75583fD();
    }

    public static InterfaceC54262iO A01(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("org.whispersystems.curve25519.");
            sb.append(str);
            return (InterfaceC54262iO) Class.forName(sb.toString()).newInstance();
        } catch (ClassNotFoundException e) {
            throw new C75583fD(e);
        } catch (IllegalAccessException e2) {
            throw new C75583fD(e2);
        } catch (InstantiationException e3) {
            throw new C75583fD(e3);
        }
    }

    public C40641sb A02() {
        InterfaceC54262iO interfaceC54262iO = this.A00;
        byte[] A8A = interfaceC54262iO.A8A();
        return new C40641sb(interfaceC54262iO.generatePublicKey(A8A), A8A);
    }

    public boolean A03(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr.length == 32) {
            if (bArr2 == null || bArr3 == null || bArr3.length != 64) {
                return false;
            }
            return this.A00.verifySignature(bArr, bArr2, bArr3);
        }
        throw new IllegalArgumentException("Invalid public key!");
    }

    public byte[] A04(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr.length == 32 && bArr2.length == 32) {
                return this.A00.calculateAgreement(bArr2, bArr);
            }
            throw new IllegalArgumentException("Keys must be 32 bytes!");
        }
        throw new IllegalArgumentException("Keys must not be null!");
    }

    public byte[] A05(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length == 32) {
            InterfaceC54262iO interfaceC54262iO = this.A00;
            return interfaceC54262iO.calculateSignature(interfaceC54262iO.ACi(64), bArr, bArr2);
        }
        throw new IllegalArgumentException("Invalid private key length!");
    }
}
