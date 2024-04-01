package X;

import android.util.Log;
import android.util.Pair;
import java.nio.charset.Charset;

/* renamed from: X.102  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass102 {
    public static final int A07 = C08M.A01("vide");
    public static final int A04 = C08M.A01("soun");
    public static final int A06 = C08M.A01("text");
    public static final int A03 = C08M.A01("sbtl");
    public static final int A05 = C08M.A01("subt");
    public static final int A00 = C08M.A01("clcp");
    public static final int A02 = C08M.A01("meta");
    public static final int A01 = C08M.A01("mdta");
    public static final byte[] A08 = "OpusHead".getBytes(Charset.forName("UTF-8"));

    public static int A00(C223812f c223812f) {
        int A012 = c223812f.A01();
        int i = A012 & 127;
        while ((A012 & 128) == 128) {
            A012 = c223812f.A01();
            i = (i << 7) | (A012 & 127);
        }
        return i;
    }

    public static Pair A01(C223812f c223812f, int i) {
        c223812f.A0B(i + 8 + 4);
        c223812f.A0C(1);
        A00(c223812f);
        c223812f.A0C(2);
        int A012 = c223812f.A01();
        if ((A012 & 128) != 0) {
            c223812f.A0C(2);
        }
        if ((A012 & 64) != 0) {
            c223812f.A0C(c223812f.A03());
        }
        if ((A012 & 32) != 0) {
            c223812f.A0C(2);
        }
        c223812f.A0C(1);
        A00(c223812f);
        String A013 = C223412b.A01(c223812f.A01());
        if (!"audio/mpeg".equals(A013) && !"audio/vnd.dts".equals(A013) && !"audio/vnd.dts.hd".equals(A013)) {
            c223812f.A0C(12);
            c223812f.A0C(1);
            int A002 = A00(c223812f);
            byte[] bArr = new byte[A002];
            System.arraycopy(c223812f.A02, c223812f.A01, bArr, 0, A002);
            c223812f.A01 += A002;
            return Pair.create(A013, bArr);
        }
        return Pair.create(A013, null);
    }

    public static Pair A02(C223812f c223812f, int i, int i2) {
        Object obj;
        boolean z;
        final byte[] bArr;
        int i3 = c223812f.A01;
        while (i3 - i < i2) {
            c223812f.A0B(i3);
            int A002 = c223812f.A00();
            C002701i.A1L(A002 > 0, "childAtomSize should be positive");
            if (c223812f.A00() == AnonymousClass100.A0y) {
                int i4 = i3 + 8;
                int i5 = -1;
                int i6 = 0;
                final String str = null;
                Integer num = null;
                while (i4 - i3 < A002) {
                    c223812f.A0B(i4);
                    int A003 = c223812f.A00();
                    int A004 = c223812f.A00();
                    if (A004 == AnonymousClass100.A0W) {
                        num = Integer.valueOf(c223812f.A00());
                    } else if (A004 == AnonymousClass100.A0x) {
                        c223812f.A0C(4);
                        str = c223812f.A09(4, Charset.forName("UTF-8"));
                    } else if (A004 == AnonymousClass100.A0w) {
                        i5 = i4;
                        i6 = A003;
                    }
                    i4 += A003;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C002701i.A1L(num != null, "frma atom is mandatory");
                    C002701i.A1L(i5 != -1, "schi atom is mandatory");
                    int i7 = i5 + 8;
                    while (true) {
                        if (i7 - i5 >= i6) {
                            obj = null;
                            z = false;
                            break;
                        }
                        c223812f.A0B(i7);
                        int A005 = c223812f.A00();
                        if (c223812f.A00() == AnonymousClass100.A1B) {
                            int A006 = (c223812f.A00() >> 24) & 255;
                            c223812f.A0C(1);
                            if (A006 == 0) {
                                c223812f.A0C(1);
                            } else {
                                c223812f.A01();
                            }
                            boolean z2 = c223812f.A01() == 1;
                            final int A012 = c223812f.A01();
                            System.arraycopy(c223812f.A02, c223812f.A01, new byte[16], 0, 16);
                            c223812f.A01 += 16;
                            if (z2 && A012 == 0) {
                                int A013 = c223812f.A01();
                                bArr = new byte[A013];
                                System.arraycopy(c223812f.A02, c223812f.A01, bArr, 0, A013);
                                c223812f.A01 += A013;
                            } else {
                                bArr = null;
                            }
                            obj = new Object(str, A012, bArr) { // from class: X.108
                                public final String A00;

                                {
                                    C002701i.A1J((A012 == 0) ^ (bArr == null));
                                    this.A00 = str;
                                    if (str != null) {
                                        switch (str.hashCode()) {
                                            case 3046605:
                                                if (str.equals("cbc1")) {
                                                    return;
                                                }
                                                break;
                                            case 3046671:
                                                if (str.equals("cbcs")) {
                                                    return;
                                                }
                                                break;
                                            case 3049879:
                                                if (str.equals("cenc")) {
                                                    return;
                                                }
                                                break;
                                            case 3049895:
                                                if (str.equals("cens")) {
                                                    return;
                                                }
                                                break;
                                        }
                                        StringBuilder sb = new StringBuilder("Unsupported protection scheme type '");
                                        sb.append(str);
                                        sb.append("'. Assuming AES-CTR crypto mode.");
                                        Log.w("TrackEncryptionBox", sb.toString());
                                    }
                                }
                            };
                            z = true;
                        } else {
                            i7 += A005;
                        }
                    }
                    C002701i.A1L(z, "tenc atom is mandatory");
                    Pair create = Pair.create(num, obj);
                    if (create != null) {
                        return create;
                    }
                }
            }
            i3 += A002;
        }
        return null;
    }
}
