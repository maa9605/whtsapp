package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: X.27m  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C466027m {
    public byte[] A00;
    public final AbstractC000600i A01;
    public final C465927l A02;
    public final C466527r A03;

    public C466027m(AbstractC000600i abstractC000600i, C466527r c466527r, C465927l c465927l) {
        this.A01 = abstractC000600i;
        this.A03 = c466527r;
        this.A02 = c465927l;
    }

    public C466027m(C465927l c465927l) {
        this.A01 = null;
        this.A03 = null;
        this.A02 = c465927l;
    }

    public static String A00(String str, String str2, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        StringBuilder A0P = C000200d.A0P(str);
        A0P.append(i == 0 ? "" : C000200d.A0D(".", i));
        A0P.append(i2 != 0 ? C000200d.A0D(":", i2) : "");
        A0P.append('@');
        A0P.append(str2);
        return A0P.toString();
    }

    public static void A01(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read(bArr, i, length - i);
            if (read == -1) {
                throw new IOException("ran out of bytes while reading into buffer");
            }
            i += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A02(java.io.InputStream r6, int r7) {
        /*
            int r2 = r6.read()
            r0 = r2 & 128(0x80, float:1.794E-43)
            r5 = 0
            r1 = 0
            if (r0 == 0) goto Lb
            r1 = 1
        Lb:
            r0 = r2 & 127(0x7f, float:1.78E-43)
            byte[] r4 = new byte[r0]
            A01(r6, r4)
            int r6 = r0 << 1
            int r6 = r6 - r1
            byte[] r3 = new byte[r6]
        L17:
            if (r5 >= r6) goto L6c
            int r0 = r5 % 2
            int r0 = 1 - r0
            int r2 = r0 << 2
            int r0 = r5 >> 1
            r1 = r4[r0]
            r0 = 15
            int r0 = r0 << r2
            r1 = r1 & r0
            int r1 = r1 >> r2
            r0 = 251(0xfb, float:3.52E-43)
            if (r7 == r0) goto L44
            r0 = 255(0xff, float:3.57E-43)
            if (r7 != r0) goto L60
            switch(r1) {
                case 0: goto L58;
                case 1: goto L58;
                case 2: goto L58;
                case 3: goto L58;
                case 4: goto L58;
                case 5: goto L58;
                case 6: goto L58;
                case 7: goto L58;
                case 8: goto L58;
                case 9: goto L58;
                case 10: goto L3f;
                case 11: goto L3f;
                default: goto L33;
            }
        L33:
            java.lang.String r0 = "bad nibble "
            java.lang.String r1 = X.C000200d.A0D(r0, r1)
            X.0L4 r0 = new X.0L4
            r0.<init>(r1)
            throw r0
        L3f:
            int r0 = r1 + (-10)
            int r0 = r0 + 45
            goto L5a
        L44:
            switch(r1) {
                case 0: goto L58;
                case 1: goto L58;
                case 2: goto L58;
                case 3: goto L58;
                case 4: goto L58;
                case 5: goto L58;
                case 6: goto L58;
                case 7: goto L58;
                case 8: goto L58;
                case 9: goto L58;
                case 10: goto L53;
                case 11: goto L53;
                case 12: goto L53;
                case 13: goto L53;
                case 14: goto L53;
                case 15: goto L53;
                default: goto L47;
            }
        L47:
            java.lang.String r0 = "bad hex "
            java.lang.String r1 = X.C000200d.A0D(r0, r1)
            X.0L4 r0 = new X.0L4
            r0.<init>(r1)
            throw r0
        L53:
            int r0 = r1 + (-10)
            int r0 = r0 + 65
            goto L5a
        L58:
            int r0 = r1 + 48
        L5a:
            byte r0 = (byte) r0
            r3[r5] = r0
            int r5 = r5 + 1
            goto L17
        L60:
            java.lang.String r0 = "bad packed type "
            java.lang.String r1 = X.C000200d.A0D(r0, r7)
            X.0L4 r0 = new X.0L4
            r0.<init>(r1)
            throw r0
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466027m.A02(java.io.InputStream, int):byte[]");
    }

    public final int A03(InputStream inputStream, int i) {
        if (i != 0) {
            if (i != 248) {
                if (i == 249) {
                    return (inputStream.read() << 8) + inputStream.read();
                }
                throw new C0L4(C000200d.A0D("invalid list size in readListSize: token ", i), A07());
            }
            return inputStream.read();
        }
        return 0;
    }

    public C02590Ca A04() {
        C466527r c466527r = this.A03;
        C000700j.A04(c466527r, "frameInputStream is null");
        while (c466527r != null) {
            try {
                C466727t c466727t = c466527r.A00;
                byte[] A00 = c466727t.A00(AnonymousClass029.A09(c466727t.A00(3)));
                C466827u c466827u = c466527r.A01;
                byte[] A01 = c466827u.A03.A01(c466827u.A00.getAndIncrement(), new byte[0], A00);
                int length = A01.length;
                if (length != 0) {
                    if (length != 1) {
                        byte b = A01[0];
                        if ((b & 2) != 0) {
                            int i = length - 1;
                            byte[] bArr = {b};
                            if (this.A02 != null) {
                                InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(A01, 1, i));
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                                    byteArrayOutputStream.write(bArr);
                                    byte[] bArr2 = new byte[8192];
                                    for (int read = inflaterInputStream.read(bArr2); read >= 0; read = inflaterInputStream.read(bArr2)) {
                                        byteArrayOutputStream.write(bArr2, 0, read);
                                    }
                                    inflaterInputStream.close();
                                    byteArrayOutputStream.close();
                                    A01 = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                } finally {
                                }
                            } else {
                                throw null;
                            }
                        }
                        this.A00 = A01;
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(A01);
                        if ((((byte) byteArrayInputStream.read()) & 1) == 0) {
                            return A05(byteArrayInputStream);
                        }
                        throw new C0L4("server to client stanza fragmentation not supported");
                    }
                    throw new C0L4("header only frame received");
                }
            } catch (C467027w e) {
                throw new C467127x(e);
            }
        }
        throw null;
    }

    public final C02590Ca A05(InputStream inputStream) {
        C04P[] c04pArr;
        C04P c04p;
        int A03 = A03(inputStream, inputStream.read());
        int read = inputStream.read();
        if (read == 2) {
            return null;
        }
        String A08 = A08(inputStream, read);
        if (A03 != 0 && A08 != null) {
            int i = A03 - 2;
            int i2 = A03 % 2;
            int i3 = (i + i2) / 2;
            if (i3 == 0) {
                c04pArr = null;
            } else {
                c04pArr = new C04P[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    String A082 = A08(inputStream, inputStream.read());
                    int read2 = inputStream.read();
                    if (read2 == 247) {
                        String A00 = A00(A08(inputStream, inputStream.read()), "s.whatsapp.net", inputStream.read() & 255, inputStream.read() & 255);
                        try {
                            c04p = new C04P(A082, Jid.get(A00));
                        } catch (C011305p unused) {
                            c04p = new C04P(A082, A00);
                        }
                    } else if (read2 != 250) {
                        c04p = new C04P(A082, A08(inputStream, read2));
                    } else {
                        String A002 = A00(A08(inputStream, inputStream.read()), A08(inputStream, inputStream.read()), 0, 0);
                        try {
                            c04p = new C04P(A082, Jid.get(A002));
                        } catch (C011305p unused2) {
                            c04p = new C04P(A082, A002);
                        }
                    }
                    c04pArr[i4] = c04p;
                }
            }
            boolean z = true;
            if (i2 == 1) {
                return new C02590Ca(A08, c04pArr, null, null);
            }
            int read3 = inputStream.read();
            if (read3 != 0 && read3 != 248 && read3 != 249) {
                z = false;
            }
            if (z) {
                int A032 = A03(inputStream, read3);
                C02590Ca[] c02590CaArr = new C02590Ca[A032];
                for (int i5 = 0; i5 < A032; i5++) {
                    c02590CaArr[i5] = A05(inputStream);
                }
                return new C02590Ca(A08, c04pArr, c02590CaArr, null);
            } else if (read3 == 252) {
                byte[] bArr = new byte[inputStream.read()];
                A01(inputStream, bArr);
                return new C02590Ca(A08, c04pArr, null, bArr);
            } else if (read3 == 253) {
                byte[] bArr2 = new byte[((inputStream.read() & 15) << 16) + (inputStream.read() << 8) + inputStream.read()];
                A01(inputStream, bArr2);
                return new C02590Ca(A08, c04pArr, null, bArr2);
            } else if (read3 == 254) {
                byte[] bArr3 = new byte[inputStream.read() | ((inputStream.read() & 127) << 24) | (inputStream.read() << 16) | (inputStream.read() << 8)];
                A01(inputStream, bArr3);
                return new C02590Ca(A08, c04pArr, null, bArr3);
            } else {
                if (read3 != 255 && read3 != 251) {
                    return new C02590Ca(A08, c04pArr, A08(inputStream, read3));
                }
                return new C02590Ca(A08, c04pArr, null, A02(inputStream, read3));
            }
        }
        throw new C0L4("nextTree sees 0 list or null tag", A07());
    }

    public C02590Ca A06(byte[] bArr) {
        return A05(new ByteArrayInputStream(bArr));
    }

    public String A07() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return "null";
        }
        StringBuilder A0P = C000200d.A0P("size = ");
        int length = bArr.length;
        A0P.append(Integer.toString(length));
        A0P.append('<');
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                A0P.append(", ");
            }
            A0P.append(Integer.toString(bArr[i] & 255));
            if (A0P.length() >= 262144) {
                break;
            }
        }
        if (A0P.length() < 262144) {
            A0P.append('>');
        } else {
            A0P.append("...");
        }
        return A0P.toString();
    }

    public final String A08(InputStream inputStream, int i) {
        if (i != -1) {
            if (i > 2 && i < 236) {
                if (!(this instanceof C466627s)) {
                    try {
                        String A01 = C0D6.A01(false, 0, i);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Token was null for singlebyte idx: ");
                        sb.append(i);
                        C000700j.A04(A01, sb.toString());
                        return A01;
                    } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
                        throw new C0L4("invalid token index in getToken()", A07());
                    }
                }
                try {
                    String str = C0D6.A02[i];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Token was null for web dictionary idx: ");
                    sb2.append(i);
                    C000700j.A04(str, sb2.toString());
                    return str;
                } catch (Exception e) {
                    Log.e(e);
                    throw new C0L4("invalid token/length in getToken", A07());
                }
            } else if (i != 0) {
                if (i != 247) {
                    switch (i) {
                        case 236:
                        case 237:
                        case 238:
                        case 239:
                            int read = inputStream.read();
                            if (!(this instanceof C466627s)) {
                                try {
                                    String A012 = C0D6.A01(true, i, read);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Token was null for doublebyte dictNum=");
                                    sb3.append(i);
                                    sb3.append(", dictIdx=");
                                    sb3.append(read);
                                    C000700j.A04(A012, sb3.toString());
                                    return A012;
                                } catch (ArrayIndexOutOfBoundsException | NullPointerException unused2) {
                                    throw new C0L4("invalid token index in getToken()", A07());
                                }
                            }
                            throw new C0L4("Unexpected doublebyte token during use of web dictionary", A07());
                        default:
                            switch (i) {
                                case 250:
                                    Log.w("Unexpected ReadString for token JID_PAIR");
                                    return A00(A08(inputStream, inputStream.read()), A08(inputStream, inputStream.read()), 0, 0);
                                case 251:
                                case 255:
                                    return C02590Ca.A00(A02(inputStream, i));
                                case 252:
                                    byte[] bArr = new byte[inputStream.read()];
                                    A01(inputStream, bArr);
                                    return C02590Ca.A00(bArr);
                                case 253:
                                    byte[] bArr2 = new byte[((inputStream.read() & 15) << 16) + (inputStream.read() << 8) + inputStream.read()];
                                    A01(inputStream, bArr2);
                                    return C02590Ca.A00(bArr2);
                                case 254:
                                    byte[] bArr3 = new byte[inputStream.read() | ((inputStream.read() & 127) << 24) | (inputStream.read() << 16) | (inputStream.read() << 8)];
                                    A01(inputStream, bArr3);
                                    return C02590Ca.A00(bArr3);
                                default:
                                    throw new C0L4("readString couldn't match token", A07());
                            }
                    }
                }
                Log.w("Unexpected ReadString for token JID_4");
                return A00(A08(inputStream, inputStream.read()), "s.whatsapp.net", inputStream.read() & 255, inputStream.read() & 255);
            } else {
                return null;
            }
        }
        throw new C0L4("-1 token in readString", A07());
    }
}
