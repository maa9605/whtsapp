package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.27n  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C466127n {
    public final C465927l A00;
    public final C466227o A01;

    public C466127n(C466227o c466227o, C465927l c465927l) {
        this.A01 = c466227o;
        this.A00 = c465927l;
    }

    public static void A00(OutputStream outputStream, int i) {
        if (i >= 0 && i < 256) {
            outputStream.write(i & 255);
            return;
        }
        throw new IOException(C000200d.A0D("value out of range; value=", i));
    }

    public static void A01(OutputStream outputStream, int i) {
        if (i == 0) {
            outputStream.write(0);
        } else if (i < 256) {
            outputStream.write(248);
            A00(outputStream, i);
        } else if (i < 65536) {
            outputStream.write(249);
            if (i >= 0 && i < 65536) {
                outputStream.write((65280 & i) >> 8);
                outputStream.write(i & 255);
                return;
            }
            throw new IOException(C000200d.A0D("value out of range; value=", i));
        } else {
            throw new IOException(C000200d.A0D("list too long; count=", i));
        }
    }

    public static void A02(OutputStream outputStream, int i) {
        if (i >= 0 && i <= 255) {
            outputStream.write((byte) i);
            return;
        }
        throw new IOException("invalid token");
    }

    public static void A03(OutputStream outputStream, byte[] bArr, boolean z) {
        int length = bArr.length;
        if (length >= 1048576) {
            outputStream.write(254);
            outputStream.write((2130706432 & length) >> 24);
            outputStream.write((16711680 & length) >> 16);
            outputStream.write((length & 65280) >> 8);
            outputStream.write(length & 255);
        } else if (length >= 256) {
            outputStream.write(253);
            if (length < 1048576) {
                outputStream.write((983040 & length) >> 16);
                outputStream.write((length & 65280) >> 8);
                outputStream.write(length & 255);
            } else {
                throw new IOException(C000200d.A0D("value out of range; value=", length));
            }
        } else {
            if (z) {
                byte[] A04 = A04(255, bArr);
                if (A04 != null) {
                    outputStream.write(255);
                } else {
                    A04 = A04(251, bArr);
                    if (A04 != null) {
                        outputStream.write(251);
                    }
                }
                outputStream.write(((length & 1) << 7) | A04.length);
                bArr = A04;
            }
            outputStream.write(252);
            A00(outputStream, length);
        }
        outputStream.write(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A04(int r10, byte[] r11) {
        /*
            int r7 = r11.length
            r9 = 0
            r0 = 128(0x80, float:1.794E-43)
            if (r7 < r0) goto L7
            return r9
        L7:
            int r0 = r7 + 1
            int r5 = r0 >> 1
            byte[] r4 = new byte[r5]
            r6 = 0
        Le:
            r8 = 1
            if (r6 >= r7) goto L45
            r2 = r11[r6]
            r0 = 251(0xfb, float:3.52E-43)
            r1 = -1
            if (r10 == r0) goto L23
            r0 = 255(0xff, float:3.57E-43)
            if (r10 != r0) goto L1f
            switch(r2) {
                case 45: goto L20;
                case 46: goto L20;
                case 47: goto L1f;
                case 48: goto L2a;
                case 49: goto L2a;
                case 50: goto L2a;
                case 51: goto L2a;
                case 52: goto L2a;
                case 53: goto L2a;
                case 54: goto L2a;
                case 55: goto L2a;
                case 56: goto L2a;
                case 57: goto L2a;
                default: goto L1f;
            }
        L1f:
            return r9
        L20:
            int r0 = r2 + (-45)
            goto L2f
        L23:
            switch(r2) {
                case 48: goto L2a;
                case 49: goto L2a;
                case 50: goto L2a;
                case 51: goto L2a;
                case 52: goto L2a;
                case 53: goto L2a;
                case 54: goto L2a;
                case 55: goto L2a;
                case 56: goto L2a;
                case 57: goto L2a;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 65: goto L2d;
                case 66: goto L2d;
                case 67: goto L2d;
                case 68: goto L2d;
                case 69: goto L2d;
                case 70: goto L2d;
                default: goto L29;
            }
        L29:
            return r9
        L2a:
            int r3 = r2 + (-48)
            goto L31
        L2d:
            int r0 = r2 + (-65)
        L2f:
            int r3 = r0 + 10
        L31:
            if (r3 == r1) goto L1f
            int r2 = r6 >> 1
            r1 = r4[r2]
            int r0 = r6 % 2
            int r8 = r8 - r0
            int r0 = r8 << 2
            int r3 = r3 << r0
            byte r0 = (byte) r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            r4[r2] = r0
            int r6 = r6 + 1
            goto Le
        L45:
            int r0 = r7 % 2
            if (r0 != r8) goto L51
            int r5 = r5 - r8
            r0 = r4[r5]
            r0 = r0 | 15
            byte r0 = (byte) r0
            r4[r5] = r0
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466127n.A04(int, byte[]):byte[]");
    }

    public void A05() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        A01(byteArrayOutputStream, 1);
        byteArrayOutputStream.write(2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C466227o c466227o = this.A01;
        int length = byteArray.length;
        C466827u c466827u = c466227o.A01;
        byte[] A02 = c466827u.A04.A02(c466827u.A01.getAndIncrement(), new byte[0], byteArray, length);
        OutputStream outputStream = c466227o.A00;
        outputStream.write(A02);
        outputStream.flush();
    }

    public void A06(C02590Ca c02590Ca) {
        A07(c02590Ca, 1);
    }

    public void A07(C02590Ca c02590Ca, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        if (!z2) {
            byteArrayOutputStream.write(0);
        }
        A09(byteArrayOutputStream, c02590Ca);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z2) {
            C465927l c465927l = this.A00;
            int length = byteArray.length;
            byte[] bArr = {2};
            if (c465927l != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
                    DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream2);
                    byteArrayOutputStream2.write(bArr);
                    deflaterOutputStream.write(byteArray, 0, length);
                    deflaterOutputStream.close();
                    byteArray = byteArrayOutputStream2.toByteArray();
                    deflaterOutputStream.close();
                    byteArrayOutputStream2.close();
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            } else {
                throw null;
            }
        }
        C466227o c466227o = this.A01;
        int length2 = byteArray.length;
        C466827u c466827u = c466227o.A01;
        byte[] A02 = c466827u.A04.A02(c466827u.A01.getAndIncrement(), new byte[0], byteArray, length2);
        OutputStream outputStream = c466227o.A00;
        outputStream.write(A02);
        if (z) {
            outputStream.flush();
        }
    }

    public final void A08(OutputStream outputStream, Jid jid) {
        int agent = jid.getAgent();
        if (agent <= 0 && jid.getDevice() <= 0) {
            if (jid.isProtocolCompliant() && agent == 0) {
                outputStream.write(250);
                if (TextUtils.isEmpty(jid.user)) {
                    A02(outputStream, 0);
                } else {
                    A0A(outputStream, jid.user, true, false);
                }
                A0A(outputStream, jid.getServer(), false, false);
                return;
            }
            StringBuilder sb = new StringBuilder("frame-tree-node-writer/writeJid/failed to write jid: ");
            sb.append(jid);
            Log.e(sb.toString());
            throw new IOException("failed to write jid");
        }
        outputStream.write(247);
        A00(outputStream, jid.getAgent());
        A00(outputStream, jid.getDevice());
        A0A(outputStream, jid.user, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r6.length <= 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09(java.io.OutputStream r11, X.C02590Ca r12) {
        /*
            r10 = this;
            X.0Ca[] r6 = r12.A03
            r5 = 0
            r8 = 1
            if (r6 == 0) goto La
            int r0 = r6.length
            r1 = 1
            if (r0 > 0) goto Lb
        La:
            r1 = 0
        Lb:
            byte[] r7 = r12.A01
            if (r7 == 0) goto L11
            int r1 = r1 + 1
        L11:
            if (r1 > r8) goto L65
            X.04P[] r4 = r12.A0I()
            if (r4 != 0) goto L49
            r0 = 0
        L1a:
            int r0 = r0 + r8
            int r0 = r0 + r1
            A01(r11, r0)
            java.lang.String r0 = r12.A00
            r10.A0A(r11, r0, r5, r8)
            if (r4 == 0) goto L4d
            int r9 = r4.length
            r3 = 0
        L28:
            if (r3 >= r9) goto L4d
            r2 = r4[r3]
            java.lang.String r0 = r2.A02
            r10.A0A(r11, r0, r5, r5)
            com.whatsapp.jid.Jid r1 = r2.A01
            byte r0 = r2.A00
            if (r8 != r0) goto L43
            boolean r0 = X.C003101m.A0W(r1)
            if (r0 == 0) goto L43
            r10.A08(r11, r1)
        L40:
            int r3 = r3 + 1
            goto L28
        L43:
            java.lang.String r0 = r2.A03
            r10.A0A(r11, r0, r8, r8)
            goto L40
        L49:
            int r0 = r4.length
            int r0 = r0 << 1
            goto L1a
        L4d:
            if (r7 == 0) goto L53
            A03(r11, r7, r5)
        L52:
            return
        L53:
            if (r6 == 0) goto L52
            int r1 = r6.length
            if (r1 <= 0) goto L52
            A01(r11, r1)
        L5b:
            if (r5 >= r1) goto L52
            r0 = r6[r5]
            r10.A09(r11, r0)
            int r5 = r5 + 1
            goto L5b
        L65:
            java.lang.String r0 = "more than one source of inner data for node; countValues="
            java.lang.String r1 = X.C000200d.A0D(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466127n.A09(java.io.OutputStream, X.0Ca):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(5:9|(4:11|(2:13|(1:15)(2:27|(1:29)(1:30)))(1:31)|16|(2:18|19))|32|23|24)(0)|21|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        if (r4 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A(java.io.OutputStream r3, java.lang.String r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C467227y
            if (r0 != 0) goto L48
            java.util.Map r0 = X.C0D6.A00
            if (r0 != 0) goto Lb
            X.C0D6.A02()
        Lb:
            java.util.Map r0 = X.C0D6.A00
            java.lang.Object r0 = r0.get(r4)
            X.27z r0 = (X.C467327z) r0
        L13:
            if (r0 != 0) goto L66
            if (r6 == 0) goto L58
            r1 = 1
            if (r4 == 0) goto L61
            r0 = 64
            int r0 = r4.indexOf(r0)
            if (r0 >= r1) goto L43
            java.lang.String r0 = "s.whatsapp.net"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L36
            X.0Jm r1 = X.C04260Jm.A00
        L2c:
            boolean r0 = X.C003101m.A0W(r1)
            if (r0 == 0) goto L5a
            r2.A08(r3, r1)
            return
        L36:
            java.lang.String r0 = "g.us"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L41
            X.0N9 r1 = X.C0N9.A00
            goto L2c
        L41:
            r1 = 0
            goto L2c
        L43:
            com.whatsapp.jid.Jid r1 = com.whatsapp.jid.Jid.getNullable(r4)
            goto L2c
        L48:
            java.util.Map r0 = X.C0D6.A01
            if (r0 != 0) goto L4f
            X.C0D6.A02()
        L4f:
            java.util.Map r0 = X.C0D6.A01
            java.lang.Object r0 = r0.get(r4)
            X.27z r0 = (X.C467327z) r0
            goto L13
        L58:
            if (r4 == 0) goto L61
        L5a:
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r4.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L61
            goto L62
        L61:
            r0 = 0
        L62:
            A03(r3, r0, r5)
            return
        L66:
            boolean r1 = r0.A02
            if (r1 == 0) goto L75
            short r1 = r0.A01
            A02(r3, r1)
            short r0 = r0.A00
            A02(r3, r0)
            return
        L75:
            short r0 = r0.A00
            A02(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466127n.A0A(java.io.OutputStream, java.lang.String, boolean, boolean):void");
    }

    public byte[] A0B(C02590Ca c02590Ca) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        A09(byteArrayOutputStream, c02590Ca);
        return byteArrayOutputStream.toByteArray();
    }
}
