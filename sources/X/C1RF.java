package X;

import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.1RF  reason: invalid class name */
/* loaded from: classes.dex */
public class C1RF {
    public final C009604x A00;
    public final C009604x A01;
    public final C009604x A02;
    public final C009804z A03;
    public final C0XR A04;

    public C1RF(C009604x c009604x, C009604x c009604x2, C009804z c009804z, C009604x c009604x3, C0XR c0xr) {
        this.A02 = c009604x;
        this.A01 = c009604x2;
        this.A03 = c009804z;
        this.A00 = c009604x3;
        this.A04 = c0xr;
    }

    public static C75813fa A00(byte[] bArr) {
        C85523vl c85523vl = new C85523vl();
        byte[][] A02 = C75823fb.A02(c85523vl.A01(bArr, new byte[32], "WhisperText".getBytes(), 64), 32, 32);
        return new C75813fa(new C75833fc(c85523vl, A02[0]), new C75793fY(c85523vl, A02[1], 0));
    }

    public static void A01(C1RT c1rt, C75783fX c75783fX) {
        try {
            c1rt.A07();
            C1R8 c1r8 = c75783fX.A00;
            c1rt.A0B(c1r8);
            C1R9 c1r9 = c75783fX.A01;
            c1rt.A0A(c1r9.A00);
            C02670Ci A14 = AnonymousClass029.A14();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[32];
            Arrays.fill(bArr, (byte) -1);
            byteArrayOutputStream.write(bArr);
            C02640Cf c02640Cf = c75783fX.A03;
            byteArrayOutputStream.write(AnonymousClass029.A1f(c02640Cf, c1r9.A01));
            C02640Cf c02640Cf2 = c1r8.A00;
            InterfaceC02660Ch interfaceC02660Ch = c75783fX.A04.A01;
            byteArrayOutputStream.write(AnonymousClass029.A1f(c02640Cf2, interfaceC02660Ch));
            byteArrayOutputStream.write(AnonymousClass029.A1f(c02640Cf, interfaceC02660Ch));
            AbstractC75873fg abstractC75873fg = c75783fX.A05;
            if (abstractC75873fg.A02()) {
                byteArrayOutputStream.write(AnonymousClass029.A1f((C02640Cf) abstractC75873fg.A01(), interfaceC02660Ch));
            }
            C75813fa A00 = A00(byteArrayOutputStream.toByteArray());
            C75833fc c75833fc = A00.A01;
            C02640Cf c02640Cf3 = c75783fX.A02;
            byte[] A1f = AnonymousClass029.A1f(c02640Cf3, A14.A01);
            AbstractC75763fV abstractC75763fV = c75833fc.A00;
            C75753fU c75753fU = new C75753fU(abstractC75763fV.A01(A1f, c75833fc.A01, "WhisperRatchet".getBytes(), 64));
            C1RU c1ru = new C1RU(new C75833fc(abstractC75763fV, c75753fU.A01), new C75793fY(abstractC75763fV, c75753fU.A00, 0));
            c1rt.A0C(c02640Cf3, A00.A00);
            c1rt.A0D(A14, (C75793fY) c1ru.A01);
            c1rt.A0F((C75833fc) c1ru.A00);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public AbstractC75873fg A02(C1RS c1rs, C38151nd c38151nd) {
        AbstractC75873fg abstractC75873fg;
        AbstractC75873fg abstractC75873fg2;
        C1R8 c1r8 = c38151nd.A03;
        C0XR c0xr = this.A04;
        C04r.A00(C002701i.A0U(c0xr));
        int i = c38151nd.A02;
        C02640Cf c02640Cf = c38151nd.A04;
        byte[] A00 = c02640Cf.A00();
        C1RT c1rt = c1rs.A01;
        boolean z = true;
        if (c1rt.A00() != i || !Arrays.equals(A00, c1rt.A0I())) {
            Iterator it = c1rs.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C1RT c1rt2 = (C1RT) it.next();
                if (c1rt2.A00() == i && Arrays.equals(A00, c1rt2.A0I())) {
                    break;
                }
            }
        }
        if (z) {
            if (C02180Ae.A01 != null) {
                Log.w(C000200d.A0J("SignalProtocolLogger (", "SessionBuilder", "): ", "We've already setup a session for this V3 message, letting bundled message fall through..."));
            }
            abstractC75873fg = C85543vn.A00;
        } else {
            C009804z c009804z = this.A03;
            int i2 = c38151nd.A01;
            c009804z.A01.A00();
            byte[] A01 = c009804z.A00.A01(i2);
            if (A01 != null) {
                try {
                    C0XX c0xx = (C0XX) C0AZ.A03(C0XX.A06, A01);
                    StringBuilder sb = new StringBuilder();
                    sb.append("axolotl loaded a signed pre key with id ");
                    sb.append(i2);
                    Log.i(sb.toString());
                    try {
                        C02670Ci c02670Ci = new C02670Ci(AnonymousClass029.A13(c0xx.A04.A06()), new C40651sc(c0xx.A03.A06()));
                        C009604x c009604x = this.A00;
                        C1R9 A012 = c009604x.A01();
                        abstractC75873fg = c38151nd.A06;
                        boolean A02 = abstractC75873fg.A02();
                        if (A02) {
                            C009604x c009604x2 = this.A01;
                            int intValue = ((Number) abstractC75873fg.A01()).intValue();
                            c009604x2.A08.A00();
                            C04o c04o = c009604x2.A04;
                            byte[] A04 = c04o.A04(intValue);
                            if (A04 != null) {
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("axolotl found a pre key with id ");
                                    sb2.append(intValue);
                                    Log.i(sb2.toString());
                                    C13270ks c13270ks = (C13270ks) C0AZ.A03(C13270ks.A04, A04);
                                    try {
                                        abstractC75873fg2 = new C85553vo(new C02670Ci(AnonymousClass029.A13(c13270ks.A03.A06()), new C40651sc(c13270ks.A02.A06())));
                                    } catch (C02650Cg e) {
                                        throw new AssertionError(e);
                                    }
                                } catch (IOException e2) {
                                    StringBuilder sb3 = new StringBuilder("error reading prekey ");
                                    sb3.append(intValue);
                                    sb3.append("; deleting");
                                    Log.e(sb3.toString(), e2);
                                    c04o.A02(intValue);
                                    throw new C1RA(e2);
                                }
                            } else {
                                throw new C1RA(C000200d.A0D("No prekey found with id ", intValue));
                            }
                        } else {
                            abstractC75873fg2 = C85543vn.A00;
                        }
                        c1rs.A00(new C1RT());
                        C1RT c1rt3 = c1rs.A01;
                        if (c1r8 != null && c02640Cf != null) {
                            try {
                                c1rt3.A07();
                                c1rt3.A0B(c1r8);
                                c1rt3.A0A(A012.A00);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[32];
                                Arrays.fill(bArr, (byte) -1);
                                byteArrayOutputStream.write(bArr);
                                C02640Cf c02640Cf2 = c1r8.A00;
                                InterfaceC02660Ch interfaceC02660Ch = c02670Ci.A01;
                                byteArrayOutputStream.write(AnonymousClass029.A1f(c02640Cf2, interfaceC02660Ch));
                                byteArrayOutputStream.write(AnonymousClass029.A1f(c02640Cf, A012.A01));
                                byteArrayOutputStream.write(AnonymousClass029.A1f(c02640Cf, interfaceC02660Ch));
                                if (abstractC75873fg2.A02()) {
                                    byteArrayOutputStream.write(AnonymousClass029.A1f(c02640Cf, ((C02670Ci) abstractC75873fg2.A01()).A01));
                                }
                                C75813fa A002 = A00(byteArrayOutputStream.toByteArray());
                                c1rt3.A0D(c02670Ci, A002.A00);
                                c1rt3.A0F(A002.A01);
                                c1rs.A01.A08(c009604x.A07.A08.A02());
                                c1rs.A01.A09(c38151nd.A00);
                                c1rs.A01.A0H(c02640Cf.A00());
                                if (!A02 || ((Number) abstractC75873fg.A01()).intValue() == 16777215) {
                                    abstractC75873fg = C85543vn.A00;
                                }
                            } catch (IOException e3) {
                                throw new AssertionError(e3);
                            }
                        } else {
                            throw new IllegalArgumentException("Null value!");
                        }
                    } catch (C02650Cg e4) {
                        throw new AssertionError(e4);
                    }
                } catch (IOException e5) {
                    StringBuilder sb4 = new StringBuilder("failed to parse signed pre key record during load for id ");
                    sb4.append(i2);
                    Log.e(sb4.toString(), e5);
                    throw new C1RA(C000200d.A0D("invalid prekey record with id ", i2));
                }
            } else {
                throw new C1RA(C000200d.A0D("no signed prekey available with id ", i2));
            }
        }
        this.A00.A03(c0xr, c1r8);
        return abstractC75873fg;
    }

    public void A03(C1RR c1rr) {
        AbstractC75873fg c85553vo;
        AbstractC75873fg abstractC75873fg;
        synchronized (C1RG.A04) {
            C009604x c009604x = this.A00;
            C0XR c0xr = this.A04;
            C1R8 c1r8 = c1rr.A03;
            C04r c04r = c009604x.A03;
            C0IO A0U = C002701i.A0U(c0xr);
            byte[] bArr = c1r8.A00.A00;
            C04r.A00(A0U);
            if (c1rr.A05 != null && !AnonymousClass029.A1Z(c1rr.A03.A00, c1rr.A05.A00(), c1rr.A06)) {
                throw new C02650Cg("Invalid signature on device key!");
            }
            if (c1rr.A05 != null) {
                C1RS A02 = this.A02.A02(this.A04);
                C02670Ci A14 = AnonymousClass029.A14();
                C02640Cf c02640Cf = c1rr.A05;
                C02640Cf c02640Cf2 = c1rr.A04;
                if (c02640Cf2 == null) {
                    c85553vo = C85543vn.A00;
                } else {
                    c85553vo = new C85553vo(c02640Cf2);
                }
                if (c85553vo.A02()) {
                    abstractC75873fg = AbstractC75873fg.A00(Integer.valueOf(c1rr.A00));
                } else {
                    abstractC75873fg = C85543vn.A00;
                }
                C1R9 A01 = this.A00.A01();
                C1R8 c1r82 = c1rr.A03;
                A02.A00(new C1RT());
                A01(A02.A01, new C75783fX(A01, A14, c1r82, c02640Cf, c02640Cf, c85553vo));
                A02.A01.A0G(abstractC75873fg, c1rr.A02, A14.A00);
                A02.A01.A08(this.A00.A07.A08.A02());
                A02.A01.A09(c1rr.A01);
                A02.A01.A0H(A14.A00.A00());
                this.A02.A04(this.A04, A02);
                this.A00.A03(this.A04, c1rr.A03);
            } else {
                throw new C02650Cg("No signed prekey!");
            }
        }
    }
}
