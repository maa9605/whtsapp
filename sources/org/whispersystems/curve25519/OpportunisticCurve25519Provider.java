package org.whispersystems.curve25519;

import X.C75583fD;
import X.InterfaceC54262iO;

/* loaded from: classes2.dex */
public class OpportunisticCurve25519Provider implements InterfaceC54262iO {
    public InterfaceC54262iO A00;

    public OpportunisticCurve25519Provider() {
        try {
            this.A00 = new NativeCurve25519Provider();
        } catch (C75583fD unused) {
            this.A00 = new JavaCurve25519Provider();
        }
    }

    @Override // X.InterfaceC54262iO
    public byte[] A8A() {
        return this.A00.A8A();
    }

    @Override // X.InterfaceC54262iO
    public byte[] ACi(int i) {
        return this.A00.ACi(i);
    }

    @Override // X.InterfaceC54262iO
    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        return this.A00.calculateAgreement(bArr, bArr2);
    }

    @Override // X.InterfaceC54262iO
    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.A00.calculateSignature(bArr, bArr2, bArr3);
    }

    @Override // X.InterfaceC54262iO
    public byte[] generatePublicKey(byte[] bArr) {
        return this.A00.generatePublicKey(bArr);
    }

    @Override // X.InterfaceC54262iO
    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.A00.verifySignature(bArr, bArr2, bArr3);
    }
}
