package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.0DB */
/* loaded from: classes.dex */
public class C0DB {
    public static String A06(byte b) {
        if (b == 0) {
            return null;
        }
        if (b == 7) {
            return "system";
        }
        if (b == 1 || b == 25 || b == 42) {
            return "image";
        }
        if (b == 2) {
            return "audio";
        }
        if (b == 3 || b == 28 || b == 43) {
            return "video";
        }
        if (b == 13) {
            return "gif";
        }
        if (b == 4) {
            return "vcard";
        }
        if (b == 5) {
            return "location";
        }
        if (b == 16) {
            return "livelocation";
        }
        if (b == 9) {
            return "document";
        }
        if (b == 20) {
            return "sticker";
        }
        if (b == 23) {
            return "product";
        }
        if (b == 37) {
            return "catalog";
        }
        if (b == 24) {
            return "invite";
        }
        if (b == 26) {
            return "document";
        }
        if (b == 29) {
            return "gif";
        }
        if (b == 30) {
            return "location";
        }
        if (b == 45) {
            return "list";
        }
        if (b == 46) {
            return "list_response";
        }
        if (b == 52) {
            return "product_list";
        }
        return null;
    }

    public static boolean A0B(byte b) {
        return b == 13 || b == 29;
    }

    public static boolean A0C(byte b) {
        return b == 1 || b == 23 || b == 37 || b == 2 || b == 3 || b == 13 || b == 9 || b == 20 || b == 25 || b == 26 || b == 28 || b == 29;
    }

    public static boolean A0D(byte b) {
        return b == 3 || b == 28 || b == 43;
    }

    public static boolean A0E(byte b) {
        return b == 42 || b == 43;
    }

    public static boolean A0F(byte b, int i) {
        return b == 0 ? i == 6 : b == 7;
    }

    public static int A00(AnonymousClass092 anonymousClass092, C01B c01b) {
        if (c01b.A0E(C01C.A0v) && !anonymousClass092.A0n.A02) {
            int max = Math.max(1, anonymousClass092.A03 + 1);
            if (max >= c01b.A07(C01C.A31)) {
                return 127;
            }
            return max;
        }
        return Math.max(1, anonymousClass092.A03);
    }

    public static int A01(AnonymousClass097 anonymousClass097) {
        if (A0n(anonymousClass097)) {
            return anonymousClass097.A0n.A02 ? 0 : 1;
        } else if (A0o(anonymousClass097)) {
            return 2;
        } else {
            if (A0m(anonymousClass097)) {
                return 5;
            }
            return anonymousClass097.A0n.A02 ? 3 : 4;
        }
    }

    public static long A02(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 == null || anonymousClass092.A0p == 0) {
            return 1L;
        }
        return anonymousClass092.A0p;
    }

    public static Bundle A03(AnonymousClass094 anonymousClass094) {
        if (anonymousClass094 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("message_key_jid", C003101m.A07(anonymousClass094.A00));
        bundle.putBoolean("message_key_from_me", anonymousClass094.A02);
        bundle.putString("message_key_id", anonymousClass094.A01);
        return bundle;
    }

    public static C011005l A04(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C0CV) {
            return C011005l.A03(anonymousClass092.A0n.A00);
        }
        return null;
    }

    public static AnonymousClass094 A05(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        AbstractC005302j A02 = AbstractC005302j.A02(bundle.getString("message_key_jid"));
        boolean z = bundle.getBoolean("message_key_from_me");
        String string = bundle.getString("message_key_id");
        if (A02 == null || string == null) {
            return null;
        }
        return new AnonymousClass094(A02, z, string);
    }

    public static String A07(C002301c c002301c, long j) {
        return j <= 0 ? "" : C02180Ae.A0k(c002301c, j);
    }

    public static String A08(AnonymousClass092 anonymousClass092) {
        StringBuilder A0P = C000200d.A0P("fmsg/status:");
        A0P.append(anonymousClass092.A08);
        A0P.append("/type:");
        A0P.append((int) anonymousClass092.A0m);
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (C003101m.A0U(anonymousClass094.A00) && (anonymousClass092 instanceof C04300Jq)) {
            A0P.append("/grp_action:");
            A0P.append(((C04300Jq) anonymousClass092).A00);
        }
        A0P.append("/rmt-src:");
        A0P.append(anonymousClass092.A0A());
        A0P.append(" ");
        A0P.append(anonymousClass094.toString());
        return A0P.toString();
    }

    public static void A09(C02L c02l, AnonymousClass092 anonymousClass092, C05M c05m) {
        C0IT A07;
        if (!A0G(c02l, anonymousClass092) || (A07 = c05m.A07(anonymousClass092.A0n.A00)) == null) {
            return;
        }
        synchronized (A07) {
            int i = A07.A03;
            if (i > 0) {
                A07.A03 = i - 1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("chatInfo/decrementUnseenImportantMessageCount/");
            sb.append(A07.A0H());
            Log.i(sb.toString());
        }
    }

    public static void A0A(AnonymousClass092 anonymousClass092) {
        C04030Id A18;
        C04030Id A182;
        if (anonymousClass092 != null) {
            if (anonymousClass092.A0E() != null) {
                anonymousClass092.A0E().A01 = true;
            }
            if ((anonymousClass092 instanceof AnonymousClass097) && (A182 = ((AnonymousClass097) anonymousClass092).A18()) != null) {
                A182.A00 = true;
            }
            AnonymousClass092 A0C = anonymousClass092.A0C();
            if (A0C != null) {
                if (A0C.A0E() != null) {
                    anonymousClass092.A0C().A0E().A01 = true;
                }
                AnonymousClass092 A0C2 = anonymousClass092.A0C();
                if (!(A0C2 instanceof AnonymousClass097) || (A18 = ((AnonymousClass097) A0C2).A18()) == null) {
                    return;
                }
                A18.A00 = true;
            }
        }
    }

    public static boolean A0G(C02L c02l, AnonymousClass092 anonymousClass092) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (anonymousClass094.A02 || anonymousClass092.A0m == 15 || !C003101m.A0U(anonymousClass094.A00)) {
            return false;
        }
        List list = anonymousClass092.A0c;
        if (list != null) {
            c02l.A05();
            if (list.contains(c02l.A03)) {
                return true;
            }
        }
        AnonymousClass092 A0C = anonymousClass092.A0C();
        return A0C != null && A0C.A0n.A02;
    }

    public static boolean A0H(C02L c02l, AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C04300Jq) {
            int i = ((C04300Jq) anonymousClass092).A00;
            if (i != 12 && i != 20 && i != 52) {
                if (i == 4) {
                    return c02l.A0A(anonymousClass092.A0A());
                }
                return false;
            }
            List list = ((C04360Jw) anonymousClass092).A01;
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null) {
                return list.contains(userJid);
            }
            throw null;
        }
        return false;
    }

    public static boolean A0I(C02L c02l, AnonymousClass092 anonymousClass092) {
        if (anonymousClass092.A0n.A02) {
            if (anonymousClass092 instanceof C04300Jq) {
                int i = ((C04300Jq) anonymousClass092).A00;
                if (i != 1 && i != 14 && i != 17) {
                    if (i == 20) {
                        List list = ((C04360Jw) anonymousClass092).A01;
                        c02l.A05();
                        UserJid userJid = c02l.A03;
                        if (userJid != null) {
                            return list.contains(userJid);
                        }
                        throw null;
                    } else if (i != 27 && i != 4 && i != 5 && i != 6 && i != 11 && i != 12) {
                        return false;
                    }
                }
                return c02l.A0A(anonymousClass092.A0A());
            }
            return true;
        }
        return false;
    }

    public static boolean A0J(C02L c02l, AnonymousClass092 anonymousClass092) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (anonymousClass094.A02 && anonymousClass092.A08 != 6) {
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null) {
                if (userJid.equals(anonymousClass094.A00)) {
                    return true;
                }
            } else {
                throw null;
            }
        }
        return false;
    }

    public static boolean A0K(C01B c01b, AnonymousClass092 anonymousClass092) {
        List<C2D3> list;
        if (((anonymousClass092 instanceof C04160Iu) && ((C04160Iu) anonymousClass092).A01 == null) || (anonymousClass092 instanceof C0LN)) {
            return false;
        }
        if (anonymousClass092 instanceof C0LU) {
            C0XT c0xt = ((C0LU) anonymousClass092).A00;
            return c0xt != null && c0xt.A00 == 2;
        }
        byte b = anonymousClass092.A0m;
        if (A0E(b) || b == 10 || b == 11 || b == 31 || b == 12 || b == 15) {
            return false;
        }
        anonymousClass092.A0G();
        if (anonymousClass092.A0F != null) {
            return false;
        }
        if (A0C(b)) {
            C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
            if (c09h == null) {
                Log.e("userActionForwardMessage/media_data is null");
                return false;
            } else if (!(anonymousClass092 instanceof C0JP) || !A0p((C0JP) anonymousClass092)) {
                if (c09h.A0F == null) {
                    Log.e("userActionForwardMessage/media_data.file is null");
                    return false;
                } else if (!c09h.A03()) {
                    Log.e("userActionForwardMessage/media_data.file does not exist");
                    return false;
                } else {
                    long j = c09h.A0A;
                    if (j != 0) {
                        File file = c09h.A0F;
                        if (j != (file != null ? file.length() : 0L)) {
                            StringBuilder A0P = C000200d.A0P("userActionForwardMessage/original_size:");
                            A0P.append(c09h.A0A);
                            A0P.append(" file_length:");
                            A0P.append(c09h.A0F.length());
                            Log.w(A0P.toString());
                            return false;
                        }
                    }
                    if (anonymousClass092.A0n.A02 && !c09h.A0P && !c01b.A0E(C01C.A1a)) {
                        Log.w("userActionForwardMessage/cannot forward partially uploaded message.");
                        return false;
                    }
                }
            }
        }
        if (C40731sm.A0n(anonymousClass092) && (list = anonymousClass092.A0D().A00.A02) != null) {
            for (C2D3 c2d3 : list) {
                if (c2d3.A02 != null) {
                    return false;
                }
            }
        }
        return (anonymousClass092 instanceof C0D9) || (anonymousClass092 instanceof AnonymousClass097);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x002a, code lost:
        if (r6.A07(X.C01C.A30) != 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0L(X.C01B r6, X.AnonymousClass092 r7) {
        /*
            boolean r0 = r7 instanceof X.AnonymousClass097
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            int r1 = r7.A03
            r0 = 127(0x7f, float:1.78E-43)
            r4 = 1
            r3 = 0
            if (r1 < r0) goto Lf
            r3 = 1
        Lf:
            boolean r0 = r7 instanceof X.C09C
            if (r0 == 0) goto L14
            return r5
        L14:
            r0 = r7
            X.097 r0 = (X.AnonymousClass097) r0
            X.09H r0 = r0.A02
            if (r0 == 0) goto L3b
            boolean r2 = r0.A0P
        L1d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L2c
            X.039 r0 = X.C01C.A30
            int r0 = r6.A07(r0)
            r1 = 1
            if (r0 == r4) goto L2d
        L2c:
            r1 = 0
        L2d:
            X.094 r0 = r7.A0n
            boolean r0 = r0.A02
            if (r0 != 0) goto L35
            if (r2 == 0) goto L3a
        L35:
            if (r1 == 0) goto L39
            if (r3 != 0) goto L3a
        L39:
            r5 = 1
        L3a:
            return r5
        L3b:
            r2 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DB.A0L(X.01B, X.092):boolean");
    }

    public static boolean A0M(C05W c05w, C0C8 c0c8, AnonymousClass092 anonymousClass092) {
        C06C A09;
        GroupJid of = GroupJid.of(anonymousClass092.A0n.A00);
        return A0h(anonymousClass092) && (of == null || (((A09 = c05w.A09(of)) == null || !A09.A0Q || c0c8.A06(of)) && c0c8.A01(of).A0B(c0c8.A01)));
    }

    public static boolean A0N(AnonymousClass012 anonymousClass012, C009905a c009905a, AnonymousClass092 anonymousClass092) {
        boolean containsKey;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        boolean z = anonymousClass094.A02;
        if (z && C0D6.A00(anonymousClass092.A08, 4) < 0 && anonymousClass092.A0E + 86400000 < anonymousClass012.A05()) {
            Map map = c009905a.A01;
            synchronized (map) {
                containsKey = map.containsKey(anonymousClass094);
            }
            if (!containsKey) {
                return true;
            }
        }
        return z && anonymousClass092.A08 == 7;
    }

    public static boolean A0O(C003701t c003701t, AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof AnonymousClass095) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            if (C003101m.A0Z(anonymousClass092.A0n.A00) && c003701t.A0C(252)) {
                C04030Id A18 = anonymousClass097.A18();
                if (A18 != null) {
                    return A18.A04();
                }
                throw null;
            }
            return false;
        }
        return false;
    }

    public static boolean A0P(C003701t c003701t, AnonymousClass092 anonymousClass092) {
        boolean A0C;
        if (anonymousClass092 instanceof C09E) {
            A0C = c003701t.A0C(253);
        } else if ((!(anonymousClass092 instanceof AnonymousClass095) && !(anonymousClass092 instanceof C09F)) || !C003101m.A0Z(anonymousClass092.A0n.A00)) {
            return true;
        } else {
            A0C = c003701t.A0C(252);
        }
        return !A0C;
    }

    public static boolean A0Q(C003701t c003701t, AnonymousClass092 anonymousClass092, boolean z) {
        if (anonymousClass092 instanceof AnonymousClass097) {
            if ((anonymousClass092 instanceof C09E) && c003701t.A0C(247)) {
                return true;
            }
            if (c003701t.A0C(246) && ((anonymousClass092 instanceof C09B) || (anonymousClass092 instanceof AnonymousClass095))) {
                return z;
            }
            return false;
        }
        return false;
    }

    public static boolean A0R(AnonymousClass092 anonymousClass092) {
        byte b = anonymousClass092.A0m;
        return (b == 2 && anonymousClass092.A04 == 1) || A0E(b);
    }

    public static boolean A0S(AnonymousClass092 anonymousClass092) {
        return (anonymousClass092 instanceof C04300Jq) && ((long) ((C04300Jq) anonymousClass092).A00) == 61;
    }

    public static boolean A0T(AnonymousClass092 anonymousClass092) {
        return anonymousClass092.A0n.A02 && A0F(anonymousClass092.A0m, anonymousClass092.A08) && ((C04300Jq) anonymousClass092).A00 == 19;
    }

    public static boolean A0U(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092.A0n.A02 && A0F(anonymousClass092.A0m, anonymousClass092.A08)) {
            int i = ((C04300Jq) anonymousClass092).A00;
            return i == 28 || i == 10;
        }
        return false;
    }

    public static boolean A0V(AnonymousClass092 anonymousClass092) {
        return anonymousClass092.A0n.A02 && A0F(anonymousClass092.A0m, anonymousClass092.A08) && ((C04300Jq) anonymousClass092).A00 == 57;
    }

    public static boolean A0W(AnonymousClass092 anonymousClass092) {
        byte b = anonymousClass092.A0m;
        if (b != 36) {
            return anonymousClass092.A0n.A02 && A0F(b, anonymousClass092.A08) && (anonymousClass092 instanceof C04300Jq) && ((C04300Jq) anonymousClass092).A00 == 59;
        }
        return true;
    }

    public static boolean A0X(AnonymousClass092 anonymousClass092) {
        return anonymousClass092.A0n.A02 && A0F(anonymousClass092.A0m, anonymousClass092.A08) && ((C04300Jq) anonymousClass092).A00 == 18;
    }

    public static boolean A0Y(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C04300Jq) {
            int i = ((C04300Jq) anonymousClass092).A00;
            return i == 37 || i == 39 || i == 40 || i == 44 || i == 41 || i == 42 || i == 64 || i == 65;
        }
        return false;
    }

    public static boolean A0Z(AnonymousClass092 anonymousClass092) {
        byte b;
        return ((anonymousClass092 instanceof C09C) || (b = anonymousClass092.A0m) == 10 || b == 12 || b == 15 || b == 11 || b == 31) ? false : true;
    }

    public static boolean A0a(AnonymousClass092 anonymousClass092) {
        C04030Id A18;
        return (anonymousClass092 instanceof AnonymousClass095) && (A18 = ((AnonymousClass097) anonymousClass092).A18()) != null && A18.A04();
    }

    public static boolean A0b(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C0JP) {
            C04030Id A18 = ((AnonymousClass097) anonymousClass092).A18();
            if (A18 != null) {
                if (A18.A04() && AbstractC48662Ge.A01()) {
                    return true;
                }
            } else {
                throw null;
            }
        }
        return false;
    }

    public static boolean A0c(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C0JJ) {
            C0JJ c0jj = (C0JJ) anonymousClass092;
            return (TextUtils.isEmpty(c0jj.A04) && TextUtils.isEmpty(c0jj.A02)) ? false : true;
        }
        return false;
    }

    public static boolean A0d(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C09E) {
            C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
            return anonymousClass092.A04 == 7 && c09h != null && c09h.A01 > 0;
        }
        return false;
    }

    public static boolean A0e(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C04300Jq) {
            long j = ((C04300Jq) anonymousClass092).A00;
            return j == 22 || j == 34 || j == 35 || j == 36 || j == 23 || j == 24 || j == 25 || j == 26 || j == 46 || j == 47 || j == 48 || j == 49 || j == 50 || j == 55;
        }
        return false;
    }

    public static boolean A0f(AnonymousClass092 anonymousClass092) {
        if (1531267200000L > anonymousClass092.A0E || !anonymousClass092.A14(1)) {
            return false;
        }
        if (C40731sm.A0n(anonymousClass092)) {
            return true;
        }
        byte b = anonymousClass092.A0m;
        if (b == 0) {
            return !(anonymousClass092 instanceof C04300Jq) && anonymousClass092.A0F == null;
        }
        if (b != 1 && b != 2 && b != 3 && b != 4 && b != 5 && b != 9 && b != 23 && b != 32 && b != 37 && b != 52 && b != 13 && b != 14) {
            switch (b) {
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean A0g(AnonymousClass092 anonymousClass092) {
        return anonymousClass092.A14(512) || anonymousClass092.A14(4096);
    }

    public static boolean A0h(AnonymousClass092 anonymousClass092) {
        int i;
        C0K8 c0k8;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        boolean z = anonymousClass094.A02;
        boolean z2 = false;
        if ((!z || C0D6.A00(anonymousClass092.A08, 4) >= 0) && !C003101m.A0Y(anonymousClass094.A00)) {
            byte b = anonymousClass092.A0m;
            if (b != 0) {
                return (b == 10 || b == 12 || b == 15 || C0Ho.A0N(anonymousClass092)) ? false : true;
            }
            AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
            if (anonymousClass093 != null && z && ((i = anonymousClass093.A01) == 401 || i == 406 || i == 407 || i == 403 || i == 412 || (i == 408 && (c0k8 = anonymousClass093.A09) != null && c0k8.A06() == 403))) {
                z2 = true;
            }
            return !z2;
        }
        return false;
    }

    public static boolean A0i(AnonymousClass092 anonymousClass092, long j) {
        if (anonymousClass092.A10()) {
            Long l = anonymousClass092.A0R;
            if (l == null) {
                throw null;
            }
            if (l.longValue() < j) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0j(AnonymousClass092 anonymousClass092, C01B c01b) {
        return c01b.A0E(C01C.A0v) && anonymousClass092.A03 < 127 && A00(anonymousClass092, c01b) == 127;
    }

    public static boolean A0k(AnonymousClass092 anonymousClass092, boolean z) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        return z && !(anonymousClass092 instanceof C04300Jq) && anonymousClass094.A02 && ((abstractC005302j instanceof UserJid) || (abstractC005302j instanceof AbstractC011205o)) && anonymousClass092.A0C == 0 && anonymousClass092.A0v == null && anonymousClass092.A07 == 0;
    }

    public static boolean A0l(AnonymousClass097 anonymousClass097) {
        int[] A07;
        C04030Id A18 = anonymousClass097.A18();
        if (A18 != null && A18.A04() && (A07 = A18.A07()) != null && A07.length >= 4) {
            long j = A07[0] + A07[1] + A07[2];
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                return c09h.A09 >= j;
            }
            throw null;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0015, code lost:
        if (r4.A0n.A02 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0m(X.AnonymousClass097 r4) {
        /*
            boolean r0 = X.C40841sx.A0h(r4)
            r3 = 1
            if (r0 == 0) goto L8
            return r3
        L8:
            X.09H r2 = r4.A02
            if (r2 == 0) goto L25
            boolean r0 = r2.A0X
            if (r0 == 0) goto L17
            X.094 r0 = r4.A0n
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L18
        L17:
            r1 = 0
        L18:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L1e
            if (r1 == 0) goto L23
        L1e:
            java.lang.String r0 = r4.A09
            if (r0 == 0) goto L23
            return r3
        L23:
            r3 = 0
            return r3
        L25:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DB.A0m(X.097):boolean");
    }

    public static boolean A0n(AnonymousClass097 anonymousClass097) {
        C09H c09h = anonymousClass097.A02;
        if (c09h != null) {
            return c09h.A0a && !c09h.A0Y;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0015, code lost:
        if (r4.A0n.A02 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0o(X.AnonymousClass097 r4) {
        /*
            boolean r0 = X.C40841sx.A0h(r4)
            r3 = 0
            if (r0 == 0) goto L8
            return r3
        L8:
            X.09H r2 = r4.A02
            if (r2 == 0) goto L32
            boolean r0 = r2.A0X
            if (r0 == 0) goto L17
            X.094 r0 = r4.A0n
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L18
        L17:
            r1 = 0
        L18:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L1e
            if (r1 == 0) goto L30
        L1e:
            boolean r0 = r4.A0f
            if (r0 == 0) goto L31
            X.094 r1 = r4.A0n
            boolean r0 = r1.A02
            if (r0 == 0) goto L31
            X.02j r0 = r1.A00
            boolean r0 = X.C003101m.A0P(r0)
            if (r0 != 0) goto L31
        L30:
            r3 = 1
        L31:
            return r3
        L32:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DB.A0o(X.097):boolean");
    }

    public static boolean A0p(C0JP c0jp) {
        C09H c09h = ((AnonymousClass097) c0jp).A02;
        return (!A0D(c0jp.A0m) || c09h == null || c0jp.A0n.A02 || c09h.A0P || c09h.A0C <= 0) ? false : true;
    }

    public static boolean A0q(C09B c09b) {
        C09H c09h = ((AnonymousClass097) c09b).A02;
        return A0D(c09b.A0m) && c09h != null && c09b.A0n.A02 && c09b.A14(1) && !c09h.A0P && ((AnonymousClass097) c09b).A09 != null;
    }

    public static boolean A0r(C09B c09b) {
        C09H c09h = ((AnonymousClass097) c09b).A02;
        A0b(c09b);
        return c09h != null && A0b(c09b) && (!c09b.A0n.A02 || A0q(c09b)) && !c09h.A0P && c09h.A07 == 0;
    }

    public static boolean A0s(String str, C0ED c0ed) {
        String A01 = C04310Jr.A01(str);
        if (c0ed != null) {
            return !TextUtils.isEmpty(A01) && 5 == c0ed.A04(Uri.parse(A01));
        }
        throw null;
    }
}
