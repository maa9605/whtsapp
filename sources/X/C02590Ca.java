package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Ca */
/* loaded from: classes.dex */
public final class C02590Ca {
    public final String A00;
    public final byte[] A01;
    public final C04P[] A02;
    public final C02590Ca[] A03;

    public C02590Ca(String str, C04P[] c04pArr) {
        this(str, c04pArr, null, null);
    }

    public C02590Ca(String str, C04P[] c04pArr, C02590Ca c02590Ca) {
        this(str, c04pArr, c02590Ca != null ? new C02590Ca[]{c02590Ca} : null, null);
    }

    public C02590Ca(String str, C04P[] c04pArr, String str2) {
        this(str, c04pArr, null, str2 != null ? str2.getBytes() : null);
    }

    public C02590Ca(String str, C04P[] c04pArr, byte[] bArr) {
        this(str, c04pArr, null, bArr);
    }

    public C02590Ca(String str, C04P[] c04pArr, C02590Ca[] c02590CaArr, byte[] bArr) {
        if (str != null) {
            this.A00 = str;
            this.A02 = c04pArr;
            this.A03 = c02590CaArr;
            this.A01 = bArr;
            if (c02590CaArr != null && bArr != null) {
                throw new IllegalArgumentException("node may not have both data and children");
            }
            return;
        }
        throw null;
    }

    public static String A00(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
        return null;
    }

    public static void A01(C02590Ca c02590Ca, String str) {
        if (A02(c02590Ca, str)) {
            return;
        }
        StringBuilder sb = new StringBuilder("failed requireTag: node: ");
        sb.append(c02590Ca);
        sb.append(" tag: ");
        sb.append(str);
        throw new C0L4(sb.toString());
    }

    public static boolean A02(C02590Ca c02590Ca, String str) {
        return c02590Ca != null && c02590Ca.A00.equals(str);
    }

    public static byte[] A03(C02590Ca c02590Ca, int i) {
        byte[] bArr = c02590Ca.A01;
        if (bArr != null) {
            int length = bArr.length;
            if (length == i) {
                return bArr;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("failed require. node ");
            sb.append(c02590Ca);
            sb.append(" data length ");
            sb.append(length);
            sb.append(" != required length ");
            sb.append(i);
            throw new C0L4(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("failed require. node ");
        sb2.append(c02590Ca);
        sb2.append(" missing data");
        throw new C0L4(sb2.toString());
    }

    public int A04(String str) {
        String A0G = A0G(str);
        try {
            return Integer.parseInt(A0G);
        } catch (NumberFormatException unused) {
            throw new C0L4(C000200d.A0M(C000200d.A0W("attribute ", str, " for tag "), this.A00, " is not integral: ", A0G));
        }
    }

    public int A05(String str, int i) {
        String str2;
        C04P A0A = A0A(str);
        if (A0A != null && (str2 = A0A.A03) != null) {
            try {
                return Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                throw new C0L4(C000200d.A0M(C000200d.A0W("attribute ", str, " for tag "), this.A00, " is not integral: ", str2));
            }
        }
        return i;
    }

    public long A06(String str) {
        String A0G = A0G(str);
        try {
            return Long.parseLong(A0G);
        } catch (NumberFormatException unused) {
            throw new C0L4(C000200d.A0M(C000200d.A0W("attribute ", str, " for tag "), this.A00, " is not integral: ", A0G));
        }
    }

    public long A07(String str, long j) {
        String str2;
        C04P A0A = A0A(str);
        if (A0A != null && (str2 = A0A.A03) != null) {
            try {
                return Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                throw new C0L4(C000200d.A0M(C000200d.A0W("attribute ", str, " for tag "), this.A00, " is not integral: ", str2));
            }
        }
        return j;
    }

    public Jid A08(Class cls, String str, AbstractC000600i abstractC000600i) {
        String str2;
        Jid nullable;
        C04P A0A = A0A(str);
        if (A0A == null || (nullable = A0A.A01) == null) {
            C04P A0A2 = A0A(str);
            if (A0A2 != null) {
                str2 = A0A2.A03;
            } else {
                str2 = null;
            }
            nullable = Jid.getNullable(str2);
        }
        if (nullable != null && !nullable.isProtocolCompliant()) {
            StringBuilder sb = new StringBuilder("Jid: '");
            sb.append(nullable);
            sb.append("' key: '");
            sb.append(str);
            sb.append("' tag: '");
            abstractC000600i.A09("invalid jid!", C000200d.A0L(sb, this.A00, "'"), true);
        }
        if (cls == DeviceJid.class && (nullable instanceof UserJid)) {
            nullable = DeviceJid.of(nullable);
        }
        try {
            return (Jid) cls.cast(nullable);
        } catch (ClassCastException e) {
            StringBuilder A0P = C000200d.A0P("ProtocolTreeNode/getAttributeJid/failed to convert '");
            A0P.append(C003101m.A07(nullable));
            A0P.append("' to ");
            A0P.append(cls.getName());
            Log.e(A0P.toString(), e);
            abstractC000600i.A09("ProtocolTreeNode/getAttributeJid", "invalid-jid-attribute", true);
            return null;
        }
    }

    public Jid A09(Class cls, String str, AbstractC000600i abstractC000600i) {
        Jid A08 = A08(cls, str, abstractC000600i);
        if (A08 != null) {
            return A08;
        }
        StringBuilder A0W = C000200d.A0W("required attribute '", str, "' missing for tag ");
        A0W.append(this.A00);
        throw new C0L4(A0W.toString());
    }

    public final C04P A0A(String str) {
        C04P[] c04pArr = this.A02;
        if (c04pArr == null || (r3 = c04pArr.length) <= 0) {
            return null;
        }
        for (C04P c04p : c04pArr) {
            if (TextUtils.equals(str, c04p.A02)) {
                return c04p;
            }
        }
        return null;
    }

    public C02590Ca A0B() {
        C02590Ca[] c02590CaArr = this.A03;
        if (c02590CaArr != null && c02590CaArr.length != 0) {
            return c02590CaArr[0];
        }
        StringBuilder A0P = C000200d.A0P("required first child missing for tag ");
        A0P.append(this.A00);
        throw new C0L4(A0P.toString());
    }

    public C02590Ca A0C(int i) {
        C02590Ca[] c02590CaArr = this.A03;
        if (c02590CaArr == null || c02590CaArr.length <= i) {
            return null;
        }
        return c02590CaArr[i];
    }

    public C02590Ca A0D(String str) {
        C02590Ca[] c02590CaArr = this.A03;
        if (c02590CaArr == null) {
            return null;
        }
        for (C02590Ca c02590Ca : c02590CaArr) {
            if (TextUtils.equals(str, c02590Ca.A00)) {
                return c02590Ca;
            }
        }
        return null;
    }

    public C02590Ca A0E(String str) {
        C02590Ca A0D = A0D(str);
        if (A0D != null) {
            return A0D;
        }
        StringBuilder A0W = C000200d.A0W("required child ", str, " missing for tag ");
        A0W.append(this.A00);
        throw new C0L4(A0W.toString());
    }

    public String A0F() {
        return A00(this.A01);
    }

    public String A0G(String str) {
        String str2;
        C04P A0A = A0A(str);
        if (A0A == null || (str2 = A0A.A03) == null) {
            StringBuilder A0W = C000200d.A0W("required attribute '", str, "' missing for tag ");
            A0W.append(this.A00);
            throw new C0L4(A0W.toString());
        }
        return str2;
    }

    public List A0H(String str) {
        C02590Ca[] c02590CaArr = this.A03;
        if (c02590CaArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C02590Ca c02590Ca : c02590CaArr) {
            if (TextUtils.equals(str, c02590Ca.A00)) {
                arrayList.add(c02590Ca);
            }
        }
        return arrayList;
    }

    public C04P[] A0I() {
        C04P[] c04pArr = this.A02;
        if (c04pArr == null || c04pArr.length != 0) {
            return c04pArr;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x006b, code lost:
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 != r11) goto L4
            return r9
        L4:
            r8 = 0
            if (r11 == 0) goto L9a
            java.lang.Class<X.0Ca> r1 = X.C02590Ca.class
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L9a
            X.0Ca r11 = (X.C02590Ca) r11
            java.lang.String r1 = r10.A00
            java.lang.String r0 = r11.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1c
            return r8
        L1c:
            X.04P[] r5 = r10.A02
            if (r5 == 0) goto L48
            X.04P[] r0 = r11.A02
            if (r0 == 0) goto L48
            int r4 = r5.length
            int r0 = r0.length
            if (r4 == r0) goto L29
            return r8
        L29:
            r3 = 0
        L2a:
            if (r3 >= r4) goto L4e
            r2 = r5[r3]
            java.lang.String r0 = r2.A02
            X.04P r0 = r11.A0A(r0)
            if (r0 == 0) goto L45
            java.lang.String r1 = r0.A03
        L38:
            if (r1 == 0) goto L47
            java.lang.String r0 = r2.A03
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            int r3 = r3 + 1
            goto L2a
        L45:
            r1 = 0
            goto L38
        L47:
            return r8
        L48:
            if (r5 != 0) goto L99
            X.04P[] r0 = r11.A02
            if (r0 != 0) goto L99
        L4e:
            X.0Ca[] r7 = r10.A03
            if (r7 == 0) goto L72
            X.0Ca[] r6 = r11.A03
            if (r6 == 0) goto L72
            int r5 = r7.length
            int r4 = r6.length
            if (r5 == r4) goto L5b
            return r8
        L5b:
            r3 = 0
        L5c:
            if (r3 >= r5) goto L78
            r2 = r7[r3]
            r1 = 0
        L61:
            if (r1 >= r4) goto L71
            r0 = r6[r1]
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6e
            int r3 = r3 + 1
            goto L5c
        L6e:
            int r1 = r1 + 1
            goto L61
        L71:
            return r8
        L72:
            if (r7 != 0) goto L98
            X.0Ca[] r0 = r11.A03
            if (r0 != 0) goto L98
        L78:
            byte[] r3 = r10.A01
            if (r3 == 0) goto L8a
            byte[] r2 = r11.A01
            if (r2 == 0) goto L8a
            int r1 = r3.length
            int r0 = r2.length
            if (r1 != r0) goto L96
            boolean r0 = java.util.Arrays.equals(r3, r2)
            if (r0 == 0) goto L96
        L8a:
            if (r3 != 0) goto L91
            byte[] r0 = r11.A01
            if (r0 != 0) goto L96
            return r9
        L91:
            byte[] r0 = r11.A01
            if (r0 == 0) goto L96
            return r9
        L96:
            r9 = 0
            return r9
        L98:
            return r8
        L99:
            return r8
        L9a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02590Ca.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int hashCode = (this.A00.hashCode() + 31) * 31;
        byte[] bArr = this.A01;
        int i2 = 0;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        C02590Ca[] c02590CaArr = this.A03;
        if (c02590CaArr == null) {
            i = 0;
        } else {
            i = 0;
            for (C02590Ca c02590Ca : c02590CaArr) {
                if (c02590Ca != null) {
                    i = c02590Ca.hashCode() + i;
                }
            }
        }
        int i3 = (hashCode2 + i) * 31;
        C04P[] c04pArr = this.A02;
        if (c04pArr != null) {
            for (C04P c04p : c04pArr) {
                if (c04p != null) {
                    i2 = c04p.hashCode() + i2;
                }
            }
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("<");
        String str = this.A00;
        A0P.append(str);
        C04P[] c04pArr = this.A02;
        boolean z = false;
        if (c04pArr == null) {
            c04pArr = new C04P[0];
        }
        for (C04P c04p : c04pArr) {
            A0P.append(" ");
            A0P.append(c04p.A02);
            A0P.append("='");
            A0P.append(c04p.A03);
            A0P.append("'");
        }
        byte[] bArr = this.A01;
        if (bArr == null && this.A03 == null) {
            A0P.append("/>");
        } else {
            A0P.append(">");
            C02590Ca[] c02590CaArr = this.A03;
            if (c02590CaArr == null) {
                c02590CaArr = new C02590Ca[0];
            }
            for (C02590Ca c02590Ca : c02590CaArr) {
                if (c02590Ca != null) {
                    A0P.append(c02590Ca.toString());
                }
            }
            if (bArr != null) {
                try {
                    Charset.forName("UTF-8").newDecoder().decode(ByteBuffer.wrap(bArr));
                    z = true;
                } catch (CharacterCodingException unused) {
                }
                if (z) {
                    A0P.append(A00(bArr));
                } else {
                    A0P.append(Base64.encodeToString(bArr, 2));
                }
            }
            A0P.append("</");
            A0P.append(str);
            A0P.append(">");
        }
        return A0P.toString();
    }
}
