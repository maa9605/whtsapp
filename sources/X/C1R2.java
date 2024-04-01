package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.SSLException;

/* renamed from: X.1R2  reason: invalid class name */
/* loaded from: classes.dex */
public class C1R2 {
    public SecureRandom A00;

    public C1R2() {
        try {
            this.A00 = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            throw new C27871Pc((byte) 80, new SSLException("SHA1PRNGalgorithm not found."));
        }
    }
}
