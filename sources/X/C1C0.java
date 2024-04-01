package X;

import java.security.KeyPair;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: X.1C0  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1C0 {
    public final long A00;
    public final KeyPair A01;

    public C1C0(KeyPair keyPair, long j) {
        this.A01 = keyPair;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1C0) {
            C1C0 c1c0 = (C1C0) obj;
            if (this.A00 == c1c0.A00) {
                KeyPair keyPair = this.A01;
                PublicKey publicKey = keyPair.getPublic();
                KeyPair keyPair2 = c1c0.A01;
                if (publicKey.equals(keyPair2.getPublic()) && keyPair.getPrivate().equals(keyPair2.getPrivate())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        KeyPair keyPair = this.A01;
        return Arrays.hashCode(new Object[]{keyPair.getPublic(), keyPair.getPrivate(), Long.valueOf(this.A00)});
    }
}
