package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1RI */
/* loaded from: classes.dex */
public class C1RI {
    public static final Object A02 = new Object();
    public final AnonymousClass050 A00;
    public final C0XS A01;

    public C1RI(AnonymousClass050 anonymousClass050, C0XS c0xs) {
        this.A00 = anonymousClass050;
        this.A01 = c0xs;
    }

    public static final C75733fS A00(C1RN c1rn, int i) {
        C75713fQ A01 = c1rn.A01();
        int i2 = A01.A00;
        if (i2 <= i) {
            if (i2 < i) {
                A01 = A01.A02(i - i2);
            }
            c1rn.A02(A01.A02(1));
            return A01.A03();
        }
        StringBuilder A0P = C000200d.A0P("Received message with old counter: ");
        A0P.append(i2);
        A0P.append(" , ");
        A0P.append(i);
        throw new C1R7(A0P.toString());
    }

    public byte[] A01(byte[] bArr) {
        byte[] bArr2;
        synchronized (A02) {
            try {
                C1RM A00 = this.A00.A00(this.A01);
                C1RN A002 = A00.A00();
                C75733fS A03 = A002.A01().A03();
                byte[] bArr3 = A03.A02;
                byte[] bArr4 = A03.A01;
                try {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(1, new SecretKeySpec(bArr4, "AES"), ivParameterSpec);
                    C85533vm c85533vm = new C85533vm(A002.A00.A01, A03.A00, cipher.doFinal(bArr), new C40651sc(A002.A00.A0i().A01.A06()));
                    A002.A02(A002.A01().A02(1));
                    this.A00.A01.A0R(C002701i.A0V(this.A01), A00.A02());
                    bArr2 = c85533vm.A03;
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                    throw new AssertionError(e);
                }
            } catch (C1RA e2) {
                throw new C1RE(e2);
            }
        }
        return bArr2;
    }

    public byte[] A02(byte[] bArr, C1R6 c1r6) {
        byte[] doFinal;
        synchronized (A02) {
            try {
                C1RM A00 = this.A00.A00(this.A01);
                if (!A00.A00.isEmpty()) {
                    C85533vm c85533vm = new C85533vm(bArr);
                    int i = c85533vm.A01;
                    Iterator it = A00.A00.iterator();
                    while (it.hasNext()) {
                        C1RN c1rn = (C1RN) it.next();
                        if (c1rn.A00.A01 == i) {
                            c85533vm.A00(c1rn.A00());
                            C75733fS A002 = A00(c1rn, c85533vm.A00);
                            byte[] bArr2 = A002.A02;
                            byte[] bArr3 = A002.A01;
                            byte[] bArr4 = c85533vm.A02;
                            try {
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                cipher.init(2, new SecretKeySpec(bArr3, "AES"), ivParameterSpec);
                                doFinal = cipher.doFinal(bArr4);
                                c1r6.AEI(doFinal);
                                this.A00.A01.A0R(C002701i.A0V(this.A01), A00.A02());
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new AssertionError(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new AssertionError(e);
                            } catch (NoSuchAlgorithmException e3) {
                                e = e3;
                                throw new AssertionError(e);
                            } catch (BadPaddingException e4) {
                                e = e4;
                                throw new C1RB(e);
                            } catch (IllegalBlockSizeException e5) {
                                e = e5;
                                throw new C1RB(e);
                            } catch (NoSuchPaddingException e6) {
                                e = e6;
                                throw new AssertionError(e);
                            }
                        }
                    }
                    throw new C1RA(C000200d.A0D("No keys for: ", i));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("No sender key for: ");
                sb.append(this.A01);
                throw new C1RE(sb.toString());
            } catch (C02650Cg | C1RA e7) {
                throw new C1RB(e7);
            }
        }
        return doFinal;
    }
}
