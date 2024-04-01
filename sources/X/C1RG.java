package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1RG */
/* loaded from: classes.dex */
public class C1RG {
    public static final Object A04 = new Object();
    public final C009604x A00;
    public final C009604x A01;
    public final C1RF A02;
    public final C0XR A03;

    public C1RG(C009604x c009604x, C009604x c009604x2, C009804z c009804z, C009604x c009604x3, C0XR c0xr) {
        this.A01 = c009604x;
        this.A00 = c009604x2;
        this.A03 = c0xr;
        this.A02 = new C1RF(c009604x, c009604x2, c009804z, c009604x3, c0xr);
    }

    public static final Cipher A00(int i, SecretKeySpec secretKeySpec, int i2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr = new byte[16];
            bArr[3] = (byte) i2;
            bArr[2] = (byte) (i2 >> 8);
            bArr[1] = (byte) (i2 >> 16);
            bArr[0] = (byte) (i2 >> 24);
            cipher.init(i, secretKeySpec, new IvParameterSpec(bArr));
            return cipher;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    public static final Cipher A01(int i, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i, secretKeySpec, ivParameterSpec);
            return cipher;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.1nd] */
    public C1RQ A02(byte[] bArr) {
        Cipher A00;
        C38171nf c38171nf;
        synchronized (A04) {
            C1RS A02 = this.A01.A02(this.A03);
            C1RT c1rt = A02.A01;
            C75793fY A042 = c1rt.A04();
            C75803fZ A01 = A042.A01();
            C02640Cf A03 = c1rt.A03();
            int i = c1rt.A00.A02;
            int A002 = c1rt.A00();
            try {
                if (A002 < 3) {
                    A00 = A00(1, A01.A02, A01.A00);
                } else {
                    A00 = A01(1, A01.A02, A01.A01);
                }
                c38171nf = new C38171nf(A002, A01.A03, A03, A042.A00, i, A00.doFinal(bArr), c1rt.A01(), c1rt.A02());
                if ((c1rt.A00.A00 & 128) == 128) {
                    C75843fd A05 = c1rt.A05();
                    c38171nf = new C38151nd(A002, c1rt.A00.A01, A05.A02, A05.A00, A05.A01, c1rt.A01(), c38171nf);
                }
                c1rt.A0E(A042.A00());
                this.A01.A04(this.A03, A02);
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new AssertionError(e);
            }
        }
        return c38171nf;
    }

    public byte[] A03(C38151nd c38151nd, C1R6 c1r6) {
        byte[] A05;
        synchronized (A04) {
            C1RS A02 = this.A01.A02(this.A03);
            AbstractC75873fg A022 = this.A02.A02(A02, c38151nd);
            A05 = A05(A02, c38151nd.A05);
            c1r6.AEI(A05);
            this.A01.A04(this.A03, A02);
            if (A022.A02()) {
                C009604x c009604x = this.A00;
                int intValue = ((Integer) A022.A01()).intValue();
                c009604x.A08.A00();
                c009604x.A04.A02(intValue);
            }
        }
        return A05;
    }

    public byte[] A04(C38171nf c38171nf, C1R6 c1r6) {
        byte[] A05;
        synchronized (A04) {
            if (this.A01.A07.A0U(C002701i.A0U(this.A03))) {
                C1RS A02 = this.A01.A02(this.A03);
                A05 = A05(A02, c38171nf);
                c1r6.AEI(A05);
                this.A01.A04(this.A03, A02);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No session for: ");
                sb.append(this.A03);
                throw new C1RE(sb.toString());
            }
        }
        return A05;
    }

    public final byte[] A05(C1RS c1rs, C38171nf c38171nf) {
        byte[] A06;
        synchronized (A04) {
            Iterator it = c1rs.A00.iterator();
            LinkedList linkedList = new LinkedList();
            try {
                C1RT c1rt = new C1RT(c1rs.A01);
                A06 = A06(c1rt, c38171nf);
                c1rs.A01 = c1rt;
            } catch (C1RB e) {
                linkedList.add(e);
                while (it.hasNext()) {
                    try {
                        C1RT c1rt2 = new C1RT((C1RT) it.next());
                        byte[] A062 = A06(c1rt2, c38171nf);
                        it.remove();
                        c1rs.A00(c1rt2);
                        return A062;
                    } catch (C1RB e2) {
                        linkedList.add(e2);
                    }
                }
                throw new C1RB(linkedList);
            }
        }
        return A06;
    }

    public final byte[] A06(C1RT c1rt, C38171nf c38171nf) {
        C75793fY c75793fY;
        C75803fZ A01;
        Cipher A012;
        boolean z;
        if ((c1rt.A00.A00 & 32) == 32) {
            int i = c38171nf.A01;
            int A00 = c1rt.A00();
            if (i == A00) {
                C02640Cf c02640Cf = c38171nf.A02;
                int i2 = c38171nf.A00;
                try {
                    if (c1rt.A06(c02640Cf) != null) {
                        C74893e1 c74893e1 = (C74893e1) c1rt.A06(c02640Cf).A00;
                        if (c74893e1 != null) {
                            c75793fY = new C75793fY(AbstractC75763fV.A00(c1rt.A00()), c74893e1.A0i().A02.A06(), c74893e1.A0i().A01);
                        } else {
                            c75793fY = null;
                        }
                    } else {
                        AbstractC75763fV A002 = AbstractC75763fV.A00(c1rt.A00());
                        byte[] A06 = c1rt.A00.A08.A06();
                        c1rt.A03();
                        C75753fU c75753fU = new C75753fU(A002.A01(AnonymousClass029.A1f(c02640Cf, new C40651sc(c1rt.A00.A0i().A01.A06())), A06, "WhisperRatchet".getBytes(), 64));
                        byte[] bArr = c75753fU.A01;
                        c75793fY = new C75793fY(A002, c75753fU.A00, 0);
                        C02670Ci A14 = AnonymousClass029.A14();
                        C75753fU c75753fU2 = new C75753fU(A002.A01(AnonymousClass029.A1f(c02640Cf, A14.A01), bArr, "WhisperRatchet".getBytes(), 64));
                        C1RU c1ru = new C1RU(new C75833fc(A002, c75753fU2.A01), new C75793fY(A002, c75753fU2.A00, 0));
                        c1rt.A0F((C75833fc) c1ru.A00);
                        c1rt.A0C(c02640Cf, c75793fY);
                        int max = Math.max(c1rt.A04().A00 - 1, 0);
                        C0CT AVX = c1rt.A00.AVX();
                        AVX.A02();
                        C2U4 c2u4 = (C2U4) AVX.A00;
                        c2u4.A00 |= 16;
                        c2u4.A02 = max;
                        c1rt.A00 = (C2U4) AVX.A01();
                        c1rt.A0D(A14, (C75793fY) c1ru.A01);
                    }
                    int i3 = c75793fY.A00;
                    if (i3 > i2) {
                        C74893e1 c74893e12 = (C74893e1) c1rt.A06(c02640Cf).A00;
                        if (c74893e12 != null) {
                            for (C74903e2 c74903e2 : c74893e12.A03) {
                                if (c74903e2.A01 == i2) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            C1RU A062 = c1rt.A06(c02640Cf);
                            C74893e1 c74893e13 = (C74893e1) A062.A00;
                            if (c74893e13 == null) {
                                A01 = null;
                            } else {
                                LinkedList linkedList = new LinkedList(c74893e13.A03);
                                Iterator it = linkedList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        C74903e2 c74903e22 = (C74903e2) it.next();
                                        if (c74903e22.A01 == i2) {
                                            A01 = new C75803fZ(new SecretKeySpec(c74903e22.A02.A06(), "AES"), new SecretKeySpec(c74903e22.A04.A06(), "HmacSHA256"), new IvParameterSpec(c74903e22.A03.A06()), c74903e22.A01);
                                            it.remove();
                                            break;
                                        }
                                    } else {
                                        A01 = null;
                                        break;
                                    }
                                }
                                C0CT AVX2 = c74893e13.AVX();
                                AVX2.A02();
                                C74893e1.A09((C74893e1) AVX2.A00);
                                AVX2.A02();
                                C74893e1.A0D((C74893e1) AVX2.A00, linkedList);
                                C74953e7 c74953e7 = (C74953e7) c1rt.A00.AVX();
                                c74953e7.A04(((Number) A062.A01).intValue(), (C74893e1) AVX2.A01());
                                c1rt.A00 = (C2U4) c74953e7.A01();
                            }
                        } else {
                            StringBuilder A0P = C000200d.A0P("Received message with old counter: ");
                            A0P.append(i3);
                            A0P.append(" , ");
                            A0P.append(i2);
                            throw new C1R7(A0P.toString());
                        }
                    } else if (i2 - i3 > 2000) {
                        throw new C1RB("Over 2000 messages into the future!");
                    } else {
                        while (c75793fY.A00 < i2) {
                            C75803fZ A013 = c75793fY.A01();
                            C1RU A063 = c1rt.A06(c02640Cf);
                            C0CT AVX3 = C74903e2.A05.AVX();
                            C0AN A003 = C0AN.A00(A013.A02.getEncoded());
                            AVX3.A02();
                            C74903e2.A0B((C74903e2) AVX3.A00, A003);
                            C0AN A004 = C0AN.A00(A013.A03.getEncoded());
                            AVX3.A02();
                            C74903e2.A09((C74903e2) AVX3.A00, A004);
                            int i4 = A013.A00;
                            AVX3.A02();
                            C74903e2 c74903e23 = (C74903e2) AVX3.A00;
                            c74903e23.A00 |= 1;
                            c74903e23.A01 = i4;
                            C0AN A005 = C0AN.A00(A013.A01.getIV());
                            AVX3.A02();
                            C74903e2.A0A((C74903e2) AVX3.A00, A005);
                            C0CT AVX4 = ((C0AZ) A063.A00).AVX();
                            AVX4.A02();
                            C74893e1.A0F((C74893e1) AVX4.A00, (C74903e2) AVX3.A01());
                            if (((C74893e1) AVX4.A00).A03.size() > 2000) {
                                AVX4.A02();
                                C74893e1.A0A((C74893e1) AVX4.A00);
                            }
                            C74953e7 c74953e72 = (C74953e7) c1rt.A00.AVX();
                            c74953e72.A04(((Number) A063.A01).intValue(), (C74893e1) AVX4.A01());
                            c1rt.A00 = (C2U4) c74953e72.A01();
                            c75793fY = c75793fY.A00();
                        }
                        C75793fY A006 = c75793fY.A00();
                        C1RU A064 = c1rt.A06(c02640Cf);
                        C74933e5 A09 = C74923e4.A09();
                        C0AN A007 = C0AN.A00(A006.A02);
                        A09.A02();
                        C74923e4.A0A((C74923e4) A09.A00, A007);
                        A09.A04(A006.A00);
                        C0CT AVX5 = ((C0AZ) A064.A00).AVX();
                        AVX5.A02();
                        C74893e1.A0E((C74893e1) AVX5.A00, (C74923e4) A09.A01());
                        C74953e7 c74953e73 = (C74953e7) c1rt.A00.AVX();
                        c74953e73.A04(((Number) A064.A01).intValue(), (C74893e1) AVX5.A01());
                        c1rt.A00 = (C2U4) c74953e73.A01();
                        A01 = c75793fY.A01();
                    }
                    C1R8 A02 = c1rt.A02();
                    C1R8 A014 = c1rt.A01();
                    SecretKeySpec secretKeySpec = A01.A03;
                    byte[] bArr2 = c38171nf.A04;
                    byte[][] A022 = C75823fb.A02(bArr2, bArr2.length - 8, 8);
                    if (MessageDigest.isEqual(C38171nf.A00(i, A02, A014, secretKeySpec, A022[0]), A022[1])) {
                        byte[] bArr3 = c38171nf.A03;
                        try {
                            if (i >= 3) {
                                A012 = A01(2, A01.A02, A01.A01);
                            } else {
                                A012 = A00(2, A01.A02, A01.A00);
                            }
                            byte[] doFinal = A012.doFinal(bArr3);
                            C0CT AVX6 = c1rt.A00.AVX();
                            AVX6.A02();
                            C2U4 c2u42 = (C2U4) AVX6.A00;
                            c2u42.A0C = null;
                            c2u42.A00 &= -129;
                            c1rt.A00 = (C2U4) AVX6.A01();
                            return doFinal;
                        } catch (BadPaddingException | IllegalBlockSizeException e) {
                            throw new C1RB(e);
                        }
                    }
                    throw new C1RB("Bad Mac!");
                } catch (C02650Cg e2) {
                    throw new C1RB(e2);
                }
            }
            throw new C1RB(String.format("Message version %d, but session version %d", Integer.valueOf(i), Integer.valueOf(A00)));
        }
        throw new C1RB("Uninitialized session!");
    }
}
