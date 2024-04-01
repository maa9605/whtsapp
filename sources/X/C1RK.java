package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1RK */
/* loaded from: classes.dex */
public class C1RK {
    public static final Object A02 = new Object();
    public final C009704y A00;
    public final C0XS A01;

    public C1RK(C009704y c009704y, C0XS c0xs) {
        this.A00 = c009704y;
        this.A01 = c0xs;
    }

    public static final C75733fS A00(C1RP c1rp, int i) {
        C75333ej c75333ej;
        C75723fR A022 = c1rp.A02();
        int i2 = A022.A00;
        if (i2 <= i) {
            if (i - i2 > 2000) {
                throw new C1RB("Over 2000 messages into the future!");
            }
            while (A022.A00 < i) {
                C75733fS A023 = A022.A02();
                C0CT AVX = C75333ej.A03.AVX();
                int i3 = A023.A00;
                AVX.A02();
                C75333ej c75333ej2 = (C75333ej) AVX.A00;
                c75333ej2.A00 |= 1;
                c75333ej2.A01 = i3;
                C0AN A00 = C0AN.A00(A023.A03);
                AVX.A02();
                C75333ej.A09((C75333ej) AVX.A00, A00);
                C0AZ A01 = AVX.A01();
                C0CT AVX2 = c1rp.A00.AVX();
                AVX2.A02();
                C12560jg c12560jg = (C12560jg) AVX2.A00;
                c12560jg.A0k();
                c12560jg.A02.add(A01);
                if (((C12560jg) AVX2.A00).A02.size() > 2000) {
                    AVX2.A02();
                    C12560jg c12560jg2 = (C12560jg) AVX2.A00;
                    c12560jg2.A0k();
                    c12560jg2.A02.remove(0);
                }
                c1rp.A00 = (C12560jg) AVX2.A01();
                A022 = A022.A01();
            }
            c1rp.A03(A022.A01());
            return A022.A02();
        }
        for (C75333ej c75333ej3 : c1rp.A00.A02) {
            if (c75333ej3.A01 == i) {
                LinkedList linkedList = new LinkedList(c1rp.A00.A02);
                Iterator it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c75333ej = (C75333ej) it.next();
                        if (c75333ej.A01 == i) {
                            it.remove();
                            break;
                        }
                    } else {
                        c75333ej = null;
                        break;
                    }
                }
                C0CT AVX3 = c1rp.A00.AVX();
                AVX3.A02();
                C12560jg c12560jg3 = (C12560jg) AVX3.A00;
                if (c12560jg3 != null) {
                    c12560jg3.A02 = C0RU.A01;
                    AVX3.A02();
                    C12560jg c12560jg4 = (C12560jg) AVX3.A00;
                    c12560jg4.A0k();
                    C0Aa.A08(linkedList, c12560jg4.A02);
                    c1rp.A00 = (C12560jg) AVX3.A01();
                    if (c75333ej != null) {
                        return new C75733fS(c75333ej.A01, c75333ej.A02.A06());
                    }
                    return null;
                }
                throw null;
            }
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
                C1RO A00 = this.A00.A00(this.A01);
                if (!A00.A00.isEmpty()) {
                    C1RP c1rp = (C1RP) A00.A00.get(0);
                    C75733fS A022 = c1rp.A02().A02();
                    InterfaceC02660Ch A01 = c1rp.A01();
                    byte[] bArr3 = A022.A02;
                    byte[] bArr4 = A022.A01;
                    try {
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
                        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        cipher.init(1, new SecretKeySpec(bArr4, "AES"), ivParameterSpec);
                        byte[] doFinal = cipher.doFinal(bArr);
                        if (A01 != null) {
                            C85533vm c85533vm = new C85533vm(c1rp.A00.A01, A022.A00, doFinal, A01);
                            c1rp.A03(c1rp.A02().A01());
                            this.A00.A01.A0S(C002701i.A0V(this.A01), A00.A01());
                            bArr2 = c85533vm.A03;
                        } else {
                            throw new C02650Cg("Session missing signature key!");
                        }
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                        throw new AssertionError(e);
                    }
                } else {
                    throw new C1RA("No key state in record!");
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
                C1RO A00 = this.A00.A00(this.A01);
                if (!A00.A00.isEmpty()) {
                    C85533vm c85533vm = new C85533vm(bArr);
                    int i = c85533vm.A01;
                    Iterator it = A00.A00.iterator();
                    while (it.hasNext()) {
                        C1RP c1rp = (C1RP) it.next();
                        if (c1rp.A00.A01 == i) {
                            c85533vm.A00(c1rp.A00());
                            C75733fS A002 = A00(c1rp, c85533vm.A00);
                            byte[] bArr2 = A002.A02;
                            byte[] bArr3 = A002.A01;
                            byte[] bArr4 = c85533vm.A02;
                            try {
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                cipher.init(2, new SecretKeySpec(bArr3, "AES"), ivParameterSpec);
                                doFinal = cipher.doFinal(bArr4);
                                c1r6.AEI(doFinal);
                                this.A00.A01.A0S(C002701i.A0V(this.A01), A00.A01());
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
