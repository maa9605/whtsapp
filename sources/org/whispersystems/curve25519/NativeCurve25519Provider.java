package org.whispersystems.curve25519;

import X.C2E0;
import X.C75583fD;
import X.InterfaceC54262iO;

/* loaded from: classes2.dex */
public class NativeCurve25519Provider implements InterfaceC54262iO {
    public C2E0 A00 = new C2E0();

    private native boolean smokeCheck(int i);

    @Override // X.InterfaceC54262iO
    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    @Override // X.InterfaceC54262iO
    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] generatePrivateKey(byte[] bArr);

    @Override // X.InterfaceC54262iO
    public native byte[] generatePublicKey(byte[] bArr);

    @Override // X.InterfaceC54262iO
    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public NativeCurve25519Provider() {
        try {
            smokeCheck(31337);
        } catch (UnsatisfiedLinkError e) {
            throw new C75583fD(e);
        }
    }

    @Override // X.InterfaceC54262iO
    public byte[] A8A() {
        return generatePrivateKey(ACi(32));
    }

    @Override // X.InterfaceC54262iO
    public byte[] ACi(int i) {
        byte[] bArr = new byte[i];
        C2E0.A00(bArr);
        return bArr;
    }
}
