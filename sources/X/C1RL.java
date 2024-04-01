package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.1RL  reason: invalid class name */
/* loaded from: classes.dex */
public class C1RL {
    public final C009704y A00;

    public C1RL(C009704y c009704y) {
        this.A00 = c009704y;
    }

    public C38161ne A00(C0XS c0xs) {
        C38161ne c38161ne;
        synchronized (C1RK.A02) {
            try {
                C1RO A00 = this.A00.A00(c0xs);
                if (A00.A00.isEmpty()) {
                    try {
                        int nextInt = SecureRandom.getInstance("SHA1PRNG").nextInt(Integer.MAX_VALUE);
                        try {
                            byte[] bArr = new byte[32];
                            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                            A00.A00(nextInt, bArr, AnonymousClass029.A14());
                            this.A00.A01.A0S(C002701i.A0V(c0xs), A00.A01());
                        } catch (NoSuchAlgorithmException e) {
                            throw new AssertionError(e);
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        throw new AssertionError(e2);
                    }
                }
                if (!A00.A00.isEmpty()) {
                    C1RP c1rp = (C1RP) A00.A00.get(0);
                    c38161ne = new C38161ne(c1rp.A00.A01, c1rp.A02().A00, c1rp.A02().A01, c1rp.A00());
                } else {
                    throw new C1RA("No key state in record!");
                }
            } catch (C02650Cg | C1RA e3) {
                throw new AssertionError(e3);
            }
        }
        return c38161ne;
    }

    public void A01(C0XS c0xs, C38161ne c38161ne) {
        synchronized (C1RK.A02) {
            C1RO A00 = this.A00.A00(c0xs);
            A00.A00.addFirst(new C1RP(c38161ne.A00, c38161ne.A01, c38161ne.A03, c38161ne.A02, C85543vn.A00));
            if (A00.A00.size() > 5) {
                A00.A00.removeLast();
            }
            this.A00.A01.A0S(new C0QS(c0xs.A00, C002701i.A0U(c0xs.A01)), A00.A01());
        }
    }
}
