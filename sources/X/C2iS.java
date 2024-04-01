package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: X.2iS  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2iS extends MacSpi {
    public C54092i4 A00;

    public C2iS(C54092i4 c54092i4) {
        this.A00 = c54092i4;
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.A00.A01(bArr);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return this.A00.A01;
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        InterfaceC54072i2 c54102i5;
        if (key != null) {
            if (key instanceof C54082i3) {
                C54082i3 c54082i3 = (C54082i3) key;
                c54102i5 = c54082i3.param;
                if (c54102i5 == null) {
                    boolean z = algorithmParameterSpec instanceof PBEParameterSpec;
                    if (z) {
                        if (algorithmParameterSpec != null && z) {
                            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                            C41001tD A0t = C02180Ae.A0t(c54082i3.type, c54082i3.digest);
                            byte[] encoded = c54082i3.getEncoded();
                            byte[] salt = pBEParameterSpec.getSalt();
                            int iterationCount = pBEParameterSpec.getIterationCount();
                            A0t.A02 = encoded;
                            A0t.A03 = salt;
                            A0t.A00 = iterationCount;
                            c54102i5 = A0t.A00(c54082i3.keySize);
                            for (int i = 0; i != encoded.length; i++) {
                                encoded[i] = 0;
                            }
                        } else {
                            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                }
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                c54102i5 = new C2i8(new C54102i5(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec == null) {
                c54102i5 = new C54102i5(key.getEncoded());
            } else {
                throw new InvalidAlgorithmParameterException("unknown parameter type.");
            }
            this.A00.A00(c54102i5);
            return;
        }
        throw new InvalidKeyException("key is null");
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        C54092i4 c54092i4 = this.A00;
        c54092i4.A02.reset();
        C0DO c0do = c54092i4.A02;
        byte[] bArr = c54092i4.A05;
        c0do.update(bArr, 0, bArr.length);
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b) {
        this.A00.A02.AVj(b);
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A00.A02.update(bArr, i, i2);
    }
}
