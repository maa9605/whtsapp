package X;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

/* renamed from: X.2i3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54082i3 implements PBEKey {
    public String algorithm;
    public int keySize;
    public InterfaceC54072i2 param;
    public PBEKeySpec pbeKeySpec;
    public int type;
    public boolean tryWrong = false;
    public int digest = 1;
    public int ivSize = -1;

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    public C54082i3(String str, int i, int i2, PBEKeySpec pBEKeySpec, InterfaceC54072i2 interfaceC54072i2) {
        this.algorithm = str;
        this.type = i;
        this.keySize = i2;
        this.pbeKeySpec = pBEKeySpec;
        this.param = interfaceC54072i2;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C54102i5 c54102i5;
        InterfaceC54072i2 interfaceC54072i2 = this.param;
        if (interfaceC54072i2 != null) {
            if (interfaceC54072i2 instanceof C2i8) {
                c54102i5 = (C54102i5) ((C2i8) interfaceC54072i2).A00;
            } else {
                c54102i5 = (C54102i5) interfaceC54072i2;
            }
            return c54102i5.A00;
        } else if (this.type == 5) {
            char[] password = this.pbeKeySpec.getPassword();
            return password != null ? C54062i1.A01(password) : new byte[0];
        } else {
            char[] password2 = this.pbeKeySpec.getPassword();
            if (password2 != null) {
                int length = password2.length;
                byte[] bArr = new byte[length];
                for (int i = 0; i != length; i++) {
                    bArr[i] = (byte) password2[i];
                }
                return bArr;
            }
            return new byte[0];
        }
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.pbeKeySpec.getIterationCount();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        return this.pbeKeySpec.getPassword();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.pbeKeySpec.getSalt();
    }
}
