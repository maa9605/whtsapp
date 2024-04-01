package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.1RJ  reason: invalid class name */
/* loaded from: classes.dex */
public class C1RJ {
    public final AnonymousClass050 A00;

    public C1RJ(AnonymousClass050 anonymousClass050) {
        this.A00 = anonymousClass050;
    }

    public C38141nc A00(C0XS c0xs) {
        C38141nc c38141nc;
        synchronized (C1RI.A02) {
            try {
                C1RM A00 = this.A00.A00(c0xs);
                if (A00.A00.isEmpty() || (1 << 3) != A00.A00().A01().A01.length) {
                    try {
                        byte[] bArr = new byte[32];
                        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                        C75713fQ c75713fQ = new C75713fQ(bArr);
                        try {
                            A00.A01(SecureRandom.getInstance("SHA1PRNG").nextInt(Integer.MAX_VALUE), c75713fQ.A01, AnonymousClass029.A14());
                            this.A00.A01.A0R(C002701i.A0V(c0xs), A00.A02());
                        } catch (NoSuchAlgorithmException e) {
                            throw new AssertionError(e);
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        throw new AssertionError(e2);
                    }
                }
                C1RN A002 = A00.A00();
                c38141nc = new C38141nc(A002.A00.A01, A002.A01().A00, A002.A01().A01, A002.A00());
            } catch (C02650Cg | C1RA e3) {
                throw new AssertionError(e3);
            }
        }
        return c38141nc;
    }

    public void A01(C0XS c0xs, C38141nc c38141nc) {
        synchronized (C1RI.A02) {
            C1RM A00 = this.A00.A00(c0xs);
            A00.A00.addFirst(new C1RN(c38141nc.A00, c38141nc.A01, c38141nc.A04, c38141nc.A02, C85543vn.A00));
            if (A00.A00.size() > 5) {
                A00.A00.removeLast();
            }
            this.A00.A01.A0R(new C0QS(c0xs.A00, C002701i.A0U(c0xs.A01)), A00.A02());
        }
    }
}
