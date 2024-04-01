package X;

import java.security.MessageDigest;

/* renamed from: X.2Iq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49132Iq extends MessageDigest {
    public C0DO A00;

    public C49132Iq(C0DO c0do) {
        super(c0do.A8K());
        this.A00 = c0do;
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        C0DO c0do = this.A00;
        byte[] bArr = new byte[c0do.A9n()];
        c0do.A7P(bArr, 0);
        return bArr;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.A00.reset();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.A00.AVj(b);
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A00.update(bArr, i, i2);
    }
}
