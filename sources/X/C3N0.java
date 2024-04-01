package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLException;

/* renamed from: X.3N0  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3N0 {
    public MessageDigest A00;
    public MessageDigest A01 = null;

    public C3N0(String str) {
        try {
            this.A00 = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new C27871Pc((byte) 80, new SSLException(e));
        }
    }

    public void A00(byte[] bArr) {
        if (bArr != null) {
            try {
                this.A01 = (MessageDigest) this.A00.clone();
                this.A00.update(bArr);
                return;
            } catch (CloneNotSupportedException e) {
                throw new C27871Pc((byte) 80, new SSLException(e));
            }
        }
        throw new C27871Pc((byte) 80, new SSLException("Cannot add null transcript."));
    }

    public byte[] A01() {
        try {
            return ((MessageDigest) this.A00.clone()).digest();
        } catch (CloneNotSupportedException e) {
            throw new C27871Pc((byte) 80, new SSLException(e));
        }
    }

    public byte[] A02() {
        try {
            return ((MessageDigest) this.A01.clone()).digest();
        } catch (CloneNotSupportedException e) {
            throw new C27871Pc((byte) 80, new SSLException(e));
        }
    }
}
