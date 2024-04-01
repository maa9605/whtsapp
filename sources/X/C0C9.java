package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.data.ConversationDeleteService;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0C9 */
/* loaded from: classes.dex */
public class C0C9 {
    public static volatile C0C9 A1U;
    public C0ET A00;
    public final AbstractC000600i A01;
    public final C012005w A02;
    public final C018508q A03;
    public final C02L A04;
    public final C0E3 A05;
    public final C0F2 A06;
    public final C01B A07;
    public final C0E6 A08;
    public final C05W A09;
    public final C0FO A0A;
    public final C02E A0B;
    public final AnonymousClass012 A0C;
    public final C001200o A0D;
    public final C000500h A0E;
    public final C06T A0F;
    public final C014806z A0G;
    public final C05Q A0H;
    public final C06Z A0I;
    public final AnonymousClass071 A0J;
    public final C05A A0K;
    public final C05M A0L;
    public final C03340Fh A0M;
    public final C0GK A0N;
    public final C05D A0O;
    public final C03710Gt A0P;
    public final AnonymousClass070 A0Q;
    public final AnonymousClass079 A0R;
    public final AnonymousClass078 A0S;
    public final AnonymousClass073 A0T;
    public final C03730Gv A0U;
    public final C0D5 A0V;
    public final C06W A0W;
    public final C013206j A0X;
    public final C0C8 A0Y;
    public final C0EO A0Z;
    public final C05B A0a;
    public final C0H3 A0b;
    public final C03690Gr A0c;
    public final C012806f A0d;
    public final C05S A0e;
    public final C06J A0f;
    public final C012306a A0g;
    public final C012506c A0h;
    public final C012406b A0i;
    public final C0E8 A0j;
    public final C00A A0k;
    public final C05F A0l;
    public final C05N A0m;
    public final C05E A0n;
    public final C013106i A0o;
    public final C06X A0p;
    public final C07B A0q;
    public final C06R A0r;
    public final C014606x A0s;
    public final C0EV A0t;
    public final C03770Gz A0u;
    public final AnonymousClass074 A0v;
    public final C012706e A0w;
    public final C05C A0x;
    public final C06Y A0y;
    public final C0E9 A0z;
    public final C014706y A10;
    public final C05O A11;
    public final C05P A12;
    public final C0H0 A13;
    public final C03720Gu A14;
    public final C0EA A15;
    public final C05L A16;
    public final C0H2 A17;
    public final C0EB A18;
    public final C06O A19;
    public final C012906g A1A;
    public final C06Q A1B;
    public final C06I A1C;
    public final C06S A1D;
    public final C013006h A1E;
    public final C013406l A1F;
    public final C003701t A1G;
    public final C0EE A1H;
    public final C0EF A1I;
    public final C0EN A1J;
    public final C0EJ A1K;
    public final C03090Ed A1L;
    public final C03740Gw A1M;
    public final C0DV A1N;
    public final C05U A1O;
    public final C07A A1P;
    public final C003401q A1Q;
    public final InterfaceC002901k A1R;
    public final C0H7 A1S;
    public final Map A1T;

    public C0C9(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, C05B c05b, C05A c05a, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C05M c05m, C012005w c012005w, C05O c05o, C003401q c003401q, C01B c01b, C0EA c0ea, C0EB c0eb, C0FO c0fo, C013406l c013406l, C0EN c0en, C0E6 c0e6, C05W c05w, C0GK c0gk, C0EO c0eo, C0E3 c0e3, C02E c02e, C05U c05u, C0D5 c0d5, C0DV c0dv, AnonymousClass071 anonymousClass071, C03690Gr c03690Gr, C05S c05s, C00A c00a, C0EF c0ef, C06Q c06q, C0EE c0ee, C06R c06r, C05C c05c, C05L c05l, C06S c06s, C06T c06t, C05Q c05q, C06W c06w, C05F c05f, C06X c06x, C06Y c06y, C0EV c0ev, C0E9 c0e9, C06O c06o, C06Z c06z, C05D c05d, C03710Gt c03710Gt, C0EJ c0ej, C012406b c012406b, C05E c05e, C012706e c012706e, C014706y c014706y, C03720Gu c03720Gu, C000500h c000500h, C012306a c012306a, C03730Gv c03730Gv, C012806f c012806f, C05P c05p, C07A c07a, C012906g c012906g, C013006h c013006h, C014806z c014806z, C03340Fh c03340Fh, AnonymousClass070 anonymousClass070, AnonymousClass073 anonymousClass073, C06J c06j, C03740Gw c03740Gw, C03770Gz c03770Gz, C0H0 c0h0, C06I c06i, C013106i c013106i, C013206j c013206j, C0C8 c0c8, AnonymousClass074 anonymousClass074, C014606x c014606x, AnonymousClass078 anonymousClass078, C0E8 c0e8, C0F2 c0f2, AnonymousClass079 anonymousClass079, C05N c05n, C0H2 c0h2, C0H3 c0h3, C03090Ed c03090Ed, C07B c07b, C0H7 c0h7) {
        this.A0D = c001200o;
        this.A0C = anonymousClass012;
        this.A1G = c003701t;
        this.A03 = c018508q;
        this.A0a = c05b;
        this.A0K = c05a;
        this.A01 = abstractC000600i;
        this.A04 = c02l;
        this.A1R = interfaceC002901k;
        this.A0L = c05m;
        this.A02 = c012005w;
        this.A11 = c05o;
        this.A1Q = c003401q;
        this.A07 = c01b;
        this.A15 = c0ea;
        this.A18 = c0eb;
        this.A0A = c0fo;
        this.A1F = c013406l;
        this.A1J = c0en;
        this.A08 = c0e6;
        this.A09 = c05w;
        this.A0N = c0gk;
        this.A0Z = c0eo;
        this.A05 = c0e3;
        this.A0B = c02e;
        this.A1O = c05u;
        this.A0V = c0d5;
        this.A1N = c0dv;
        this.A0J = anonymousClass071;
        this.A0c = c03690Gr;
        this.A0e = c05s;
        this.A0k = c00a;
        this.A1I = c0ef;
        this.A1B = c06q;
        this.A1H = c0ee;
        this.A0r = c06r;
        this.A0x = c05c;
        this.A16 = c05l;
        this.A1D = c06s;
        this.A0F = c06t;
        this.A0H = c05q;
        this.A0W = c06w;
        this.A0l = c05f;
        this.A0p = c06x;
        this.A0y = c06y;
        this.A0t = c0ev;
        this.A0z = c0e9;
        this.A19 = c06o;
        this.A0I = c06z;
        this.A0O = c05d;
        this.A0P = c03710Gt;
        this.A1K = c0ej;
        this.A0i = c012406b;
        this.A0w = c012706e;
        this.A10 = c014706y;
        this.A14 = c03720Gu;
        this.A0E = c000500h;
        this.A0g = c012306a;
        this.A0n = c05e;
        this.A0U = c03730Gv;
        this.A0d = c012806f;
        this.A12 = c05p;
        this.A1P = c07a;
        this.A1A = c012906g;
        this.A1E = c013006h;
        this.A0G = c014806z;
        this.A0M = c03340Fh;
        this.A0Q = anonymousClass070;
        this.A0T = anonymousClass073;
        this.A0f = c06j;
        this.A1M = c03740Gw;
        this.A0u = c03770Gz;
        this.A13 = c0h0;
        this.A1C = c06i;
        this.A0o = c013106i;
        this.A0X = c013206j;
        this.A0Y = c0c8;
        this.A0v = anonymousClass074;
        this.A0s = c014606x;
        this.A0S = anonymousClass078;
        this.A0j = c0e8;
        this.A06 = c0f2;
        this.A0R = anonymousClass079;
        this.A0m = c05n;
        this.A17 = c0h2;
        this.A0b = c0h3;
        this.A1L = c03090Ed;
        this.A0q = c07b;
        this.A1S = c0h7;
        this.A0h = c012406b.A01;
        this.A1T = c012406b.A02;
        c0d5.A0K(new C0GX() { // from class: X.0H8
            @Override // X.C0GX
            public String ABV() {
                return "m";
            }

            @Override // X.C0GX
            public Set ABF(AnonymousClass092 anonymousClass092) {
                if (anonymousClass092.A0j) {
                    return Collections.singleton("s");
                }
                return null;
            }

            @Override // X.C0GX
            public C27751Op ABW(C0IU c0iu) {
                if (c0iu.A07 != null) {
                    if (c0iu.A01().booleanValue()) {
                        C27751Op c27751Op = new C27751Op();
                        c27751Op.A00 = Collections.singleton("s");
                        return c27751Op;
                    }
                    C27751Op c27751Op2 = new C27751Op();
                    c27751Op2.A01 = Collections.singleton("s");
                    return c27751Op2;
                }
                return null;
            }
        });
    }

    public static C0C9 A00() {
        if (A1U == null) {
            synchronized (C0C9.class) {
                if (A1U == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C018508q A003 = C018508q.A00();
                    C05B A004 = C05B.A00();
                    C05A A005 = C05A.A00();
                    AbstractC000600i A006 = AbstractC000600i.A00();
                    C02L A007 = C02L.A00();
                    InterfaceC002901k A008 = C002801j.A00();
                    C05M A009 = C05M.A00();
                    C012005w A0010 = C012005w.A00();
                    C05O A0011 = C05O.A00();
                    C003401q A0012 = C003401q.A00();
                    C01B A0013 = C01B.A00();
                    C0EA A0014 = C0EA.A00();
                    C0EB A0015 = C0EB.A00();
                    C0FO A0016 = C0FO.A00();
                    C013406l A0017 = C013406l.A00();
                    C0EN A0018 = C0EN.A00();
                    C0E6 A0019 = C0E6.A00();
                    C05W A0020 = C05W.A00();
                    C0GK A0021 = C0GK.A00();
                    C0EO A0022 = C0EO.A00();
                    C0E3 A06 = C0E3.A06();
                    C02E A0023 = C02E.A00();
                    C05U A01 = C05U.A01();
                    C0D5 A0024 = C0D5.A00();
                    C0DV A0025 = C0DV.A00();
                    AnonymousClass071 A0026 = AnonymousClass071.A00();
                    C03690Gr A0027 = C03690Gr.A00();
                    C05S A0028 = C05S.A00();
                    C00A c00a = C00A.A00;
                    C0EF A0029 = C0EF.A00();
                    C06Q A0030 = C06Q.A00();
                    C0EE A0031 = C0EE.A00();
                    C06R A0032 = C06R.A00();
                    C05C A0033 = C05C.A00();
                    C05L A0034 = C05L.A00();
                    C06S A0035 = C06S.A00();
                    C06T c06t = C06T.A02;
                    C05Q A0036 = C05Q.A00();
                    C06W A0037 = C06W.A00();
                    C05F c05f = C05F.A01;
                    C06X A0038 = C06X.A00();
                    C06Y A0039 = C06Y.A00();
                    C0EV A0040 = C0EV.A00();
                    C0E9 A0041 = C0E9.A00();
                    C06O A0042 = C06O.A00();
                    C06Z A0043 = C06Z.A00();
                    C05D A0044 = C05D.A00();
                    C03710Gt A0045 = C03710Gt.A00();
                    C0EJ A0046 = C0EJ.A00();
                    C012406b A0047 = C012406b.A00();
                    C05E A0048 = C05E.A00();
                    C012706e A0049 = C012706e.A00();
                    C014706y A0050 = C014706y.A00();
                    C03720Gu A0051 = C03720Gu.A00();
                    C000500h A0052 = C000500h.A00();
                    C012306a A0053 = C012306a.A00();
                    C03730Gv A0054 = C03730Gv.A00();
                    C012806f A0055 = C012806f.A00();
                    C05P A0056 = C05P.A00();
                    C07A A012 = C07A.A01();
                    C012906g A013 = C012906g.A01();
                    C013006h A0057 = C013006h.A00();
                    C014806z A0058 = C014806z.A00();
                    C03340Fh c03340Fh = C03340Fh.A00;
                    AnonymousClass070 A014 = AnonymousClass070.A01();
                    AnonymousClass073 A0059 = AnonymousClass073.A00();
                    C06J A015 = C06J.A01();
                    C03740Gw A0060 = C03740Gw.A00();
                    if (C03770Gz.A05 == null) {
                        synchronized (C03770Gz.class) {
                            if (C03770Gz.A05 == null) {
                                C03770Gz.A05 = new C03770Gz(AnonymousClass012.A00(), C05A.A00(), C05M.A00(), C05E.A00(), C07A.A01());
                            }
                        }
                    }
                    C03770Gz c03770Gz = C03770Gz.A05;
                    C0H0 A0061 = C0H0.A00();
                    C06I A0062 = C06I.A00();
                    C013106i A016 = C013106i.A01();
                    C013206j A0063 = C013206j.A00();
                    C0C8 A0064 = C0C8.A00();
                    AnonymousClass074 A0065 = AnonymousClass074.A00();
                    C014606x A0066 = C014606x.A00();
                    AnonymousClass078 A0067 = AnonymousClass078.A00();
                    C0E8 A0068 = C0E8.A00();
                    C0F2 A0069 = C0F2.A00();
                    AnonymousClass079 A0070 = AnonymousClass079.A00();
                    C05N A0071 = C05N.A00();
                    if (C0H2.A0B == null) {
                        synchronized (C0H2.class) {
                            if (C0H2.A0B == null) {
                                C0H2.A0B = new C0H2(AnonymousClass012.A00(), C02L.A00(), C0EB.A00(), C05W.A00(), C01R.A02, C01J.A00(), C0EC.A00(), AnonymousClass075.A00(), C05E.A00(), C0F3.A00(), C0FE.A00());
                            }
                        }
                    }
                    C0H2 c0h2 = C0H2.A0B;
                    C0H3 A0072 = C0H3.A00();
                    C03090Ed A0073 = C03090Ed.A00();
                    C07B A0074 = C07B.A00();
                    if (C0H7.A07 == null) {
                        synchronized (C0H7.class) {
                            if (C0H7.A07 == null) {
                                C0H7.A07 = new C0H7(AnonymousClass012.A00(), C01B.A00(), C05W.A00(), C018708s.A00(), C018808t.A00(), AnonymousClass075.A00(), C07A.A01());
                            }
                        }
                    }
                    A1U = new C0C9(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A06, A0023, A01, A0024, A0025, A0026, A0027, A0028, c00a, A0029, A0030, A0031, A0032, A0033, A0034, A0035, c06t, A0036, A0037, c05f, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055, A0056, A012, A013, A0057, A0058, c03340Fh, A014, A0059, A015, A0060, c03770Gz, A0061, A0062, A016, A0063, A0064, A0065, A0066, A0067, A0068, A0069, A0070, A0071, c0h2, A0072, A0073, A0074, C0H7.A07);
                }
            }
        }
        return A1U;
    }

    public static boolean A01(C0IT c0it, AnonymousClass092 anonymousClass092, C01B c01b, C000500h c000500h) {
        byte b;
        boolean z;
        int i;
        int i2;
        int i3;
        if (c0it != null && c0it.A0S && !A02(anonymousClass092) && (b = anonymousClass092.A0m) != 8 && !C0DB.A0T(anonymousClass092) && !C0DB.A0X(anonymousClass092) && !C0DB.A0V(anonymousClass092) && (!(z = anonymousClass092.A0n.A02) || !C0DB.A0F(b, anonymousClass092.A08) || ((C04300Jq) anonymousClass092).A00 != 21)) {
            if (z) {
                boolean A0F = C0DB.A0F(b, anonymousClass092.A08);
                if (A0F && ((C04300Jq) anonymousClass092).A00 == 27) {
                    return false;
                }
                if (A0F && ((C04300Jq) anonymousClass092).A00 == 6) {
                    return false;
                }
            }
            if (!C0DB.A0e(anonymousClass092) && !C0DB.A0S(anonymousClass092)) {
                if (z) {
                    boolean A0F2 = C0DB.A0F(b, anonymousClass092.A08);
                    if (A0F2 && ((i3 = ((C04300Jq) anonymousClass092).A00) == 29 || i3 == 30)) {
                        return false;
                    }
                    if (A0F2 && ((i2 = ((C04300Jq) anonymousClass092).A00) == 31 || i2 == 32)) {
                        return false;
                    }
                    if (A0F2 && ((i = ((C04300Jq) anonymousClass092).A00) == 53 || i == 54)) {
                        return false;
                    }
                    if (A0F2 && ((C04300Jq) anonymousClass092).A00 == 56) {
                        return false;
                    }
                }
                if (!C0DB.A0W(anonymousClass092)) {
                    if (anonymousClass092 instanceof C04300Jq) {
                        long j = ((C04300Jq) anonymousClass092).A00;
                        if (j == 62 || j == 63) {
                            return false;
                        }
                    }
                    if (c01b.A0E(C01C.A0j)) {
                        if (!c000500h.A00.getBoolean("archive_v2_enabled", false)) {
                            Log.i("msgstore/updateChatsListForNewMessage/Enabling archive2.0");
                            c000500h.A0D().putBoolean("archive_v2_enabled", true).apply();
                        }
                        return c000500h.A0l();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A02(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092.A0f) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            if (anonymousClass094.A02 && !C003101m.A0P(anonymousClass094.A00)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(AnonymousClass092 anonymousClass092, boolean z) {
        byte b;
        boolean A0U;
        AbstractC005302j abstractC005302j;
        int i;
        if ((!A02(anonymousClass092) || z) && (((b = anonymousClass092.A0m) != 24 || !anonymousClass092.A0n.A02 || z) && b != 8 && !C0DB.A0T(anonymousClass092) && !C0DB.A0X(anonymousClass092) && !C0DB.A0V(anonymousClass092))) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            if ((!anonymousClass094.A02 || !C0DB.A0F(b, anonymousClass092.A08) || ((i = ((C04300Jq) anonymousClass092).A00) != 50 && i != 49 && i != 47 && i != 48 && i != 46 && i != 55)) && !C0DB.A0e(anonymousClass092) && ((!(A0U = C0DB.A0U(anonymousClass092)) || (A0U && z && (abstractC005302j = anonymousClass094.A00) != null && abstractC005302j.equals(((C04370Jx) anonymousClass092).A01))) && !(anonymousClass092 instanceof C0LW) && !C0DB.A0S(anonymousClass092))) {
                if (anonymousClass092 instanceof C04300Jq) {
                    long j = ((C04300Jq) anonymousClass092).A00;
                    return (j == 62 || j == 63) ? false : true;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean A04(File file) {
        File[] listFiles = file.listFiles();
        boolean z = false;
        if (listFiles != null) {
            boolean z2 = false;
            for (File file2 : listFiles) {
                if (file2.getName().equals(".nomedia")) {
                    z2 = true;
                } else if (file2.isDirectory()) {
                    z2 = A04(file2);
                } else {
                    file2.getPath();
                    AnonymousClass024.A0f(file2);
                }
            }
            z = z2;
        }
        file.getPath();
        if (!z) {
            AnonymousClass024.A0f(file);
        }
        return z;
    }

    public int A05(AnonymousClass092 anonymousClass092) {
        C0H0 c0h0 = this.A13;
        if (c0h0 != null) {
            if (anonymousClass092.A0p <= 0) {
                return 0;
            }
            if (!c0h0.A02()) {
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                if (abstractC005302j != null) {
                    String rawString = abstractC005302j.getRawString();
                    try {
                        C0CE c0ce = c0h0.A00.A03().A02;
                        String[] strArr = {"send_count"};
                        String[] strArr2 = new String[3];
                        strArr2[0] = rawString;
                        strArr2[1] = anonymousClass094.A02 ? "1" : "0";
                        strArr2[2] = anonymousClass094.A01;
                        Cursor A09 = c0ce.A09("messages", strArr, "key_remote_jid = ? AND key_from_me = ? AND key_id = ?", strArr2, null, "getSendCountV1/QUERY_MESSAGES");
                        if (A09.moveToFirst() && !A09.isNull(0)) {
                            r3 = A09.getInt(0);
                        }
                        A09.close();
                        return r3;
                    } finally {
                    }
                } else {
                    throw null;
                }
            } else {
                C0H0.A01(anonymousClass092);
                String[] strArr3 = {Long.toString(anonymousClass092.A0p)};
                C0CD A03 = c0h0.A00.A03();
                try {
                    Cursor A07 = A03.A02.A07("SELECT send_count FROM message_send_count WHERE message_row_id=?", strArr3);
                    r3 = A07.moveToNext() ? A07.getInt(A07.getColumnIndexOrThrow("send_count")) : 0;
                    A07.close();
                    A03.close();
                    return r3;
                } finally {
                    try {
                        throw th;
                    } finally {
                        try {
                            A03.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:577:0x049f, code lost:
        if (r0 == false) goto L235;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x050a: IGET  (r0 I:X.05N) = (r8 I:X.0C9) X.0C9.A0m X.05N, block:B:612:0x0507 */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0C9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A06(X.AnonymousClass092 r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A06(X.092, int, boolean):int");
    }

    public Cursor A07(long j, long j2, long j3) {
        String[] strArr = {String.valueOf(j), String.valueOf(j2), String.valueOf(j3), String.valueOf(5000)};
        C0CD A03 = this.A0n.A03();
        try {
            return A03.A02.A07(C0HD.A1B, strArr);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0015, code lost:
        if (X.C003101m.A0U(r15) != false) goto L37;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C27661Og A08(X.AbstractC005302j r15, long r16, int r18, long r19) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A08(X.02j, long, int, long):X.1Og");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0021, code lost:
        if (X.C003101m.A0U(r19) != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C27661Og A09(X.AbstractC005302j r19, long r20, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A09(X.02j, long, int, long):X.1Og");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(3:98|99|(2:103|(2:105|(23:107|(6:110|111|112|113|114|108)|333|334|335|(1:337)(2:911|(1:913))|338|340|341|(3:356|(1:358)|359)|360|(1:362)(5:(5:395|(2:397|(13:399|(2:401|(3:403|(2:405|406)(1:445)|407)(2:446|447))(2:886|456)|408|409|410|411|(1:413)(1:434)|(1:415)(1:433)|416|(5:(2:419|420)(1:427)|421|(1:423)|424|(1:426))|428|429|430)(2:469|470))|471|(1:478)|479)(4:481|(1:483)|903|(3:487|488|(2:490|(1:(2:891|892)(12:497|498|499|500|(1:502)(1:880)|503|(4:505|(2:507|(1:509))(1:513)|510|(1:512))|514|(4:849|(1:(2:852|853)(1:877))(1:(1:879))|854|(8:856|857|858|(6:861|(1:863)(1:871)|864|(3:866|867|868)(1:870)|869|859)|872|873|874|875)(1:876))(2:518|(2:520|(2:795|(11:797|(1:799)(1:(2:813|814))|800|(1:802)(1:811)|803|804|805|(1:807)|808|809|810)(1:815))(6:524|(2:528|(2:530|(1:532)(3:658|(2:660|(2:662|(7:664|665|666|(1:668)|669|670|671)(1:672))(1:673))|(2:675|(2:677|(9:679|680|681|(1:683)(1:690)|684|(1:686)|687|688|689)(1:691))(1:692))(1:693)))(2:694|(1:(13:697|(1:699)|700|(1:702)(1:(2:736|737))|703|704|705|706|(6:709|(1:711)(1:719)|712|(3:714|715|716)(1:718)|717|707)|720|721|722|723)(1:738))(1:739)))|740|(1:(2:743|744)(1:792))(1:(1:794))|745|(9:747|748|749|750|(8:753|(1:755)(1:775)|756|(4:758|(1:760)|763|762)|764|(3:769|770|771)|772|751)|776|777|778|779)(1:791)))(2:816|(12:818|(1:820)(1:(2:846|847))|821|(1:823)(1:844)|824|825|826|827|(1:829)|830|831|832)(1:848)))|534|535|536)))))|431|471|(3:474|476|478)|479)|363|364|366|367|199|200|(3:203|204|205)|123|(6:125|(2:127|(1:(4:132|(1:141)|136|(1:138)))(2:142|143))|144|(2:150|(1:153))|154|(3:156|13eb|161))|166|167)(2:914|915))))|363|364|366|367|199|200|(3:203|204|205)|123|(0)|166|167) */
    /* JADX WARN: Can't wrap try/catch for region: R(44:1|(2:3|(2:5|6)(2:8|(2:10|(7:12|(2:14|(1:16)(2:23|(1:25)))|26|18|(1:20)|21|22))))|27|(2:29|(5:31|(1:33)|37|35|36)(2:38|(2:40|41)))|42|(1:54)|55|(1:57)|58|(2:64|(2:66|(1:68))(1:69))|70|(1:72)|1164|(2:75|(1:80))(0)|81|(1:85)|(2:1159|(1:1161)(1:1162))|89|90|91|92|93|(2:1127|1128)|95|(3:98|99|(2:103|(2:105|(23:107|(6:110|111|112|113|114|108)|333|334|335|(1:337)(2:911|(1:913))|338|340|341|(3:356|(1:358)|359)|360|(1:362)(5:(5:395|(2:397|(13:399|(2:401|(3:403|(2:405|406)(1:445)|407)(2:446|447))(2:886|456)|408|409|410|411|(1:413)(1:434)|(1:415)(1:433)|416|(5:(2:419|420)(1:427)|421|(1:423)|424|(1:426))|428|429|430)(2:469|470))|471|(1:478)|479)(4:481|(1:483)|903|(3:487|488|(2:490|(1:(2:891|892)(12:497|498|499|500|(1:502)(1:880)|503|(4:505|(2:507|(1:509))(1:513)|510|(1:512))|514|(4:849|(1:(2:852|853)(1:877))(1:(1:879))|854|(8:856|857|858|(6:861|(1:863)(1:871)|864|(3:866|867|868)(1:870)|869|859)|872|873|874|875)(1:876))(2:518|(2:520|(2:795|(11:797|(1:799)(1:(2:813|814))|800|(1:802)(1:811)|803|804|805|(1:807)|808|809|810)(1:815))(6:524|(2:528|(2:530|(1:532)(3:658|(2:660|(2:662|(7:664|665|666|(1:668)|669|670|671)(1:672))(1:673))|(2:675|(2:677|(9:679|680|681|(1:683)(1:690)|684|(1:686)|687|688|689)(1:691))(1:692))(1:693)))(2:694|(1:(13:697|(1:699)|700|(1:702)(1:(2:736|737))|703|704|705|706|(6:709|(1:711)(1:719)|712|(3:714|715|716)(1:718)|717|707)|720|721|722|723)(1:738))(1:739)))|740|(1:(2:743|744)(1:792))(1:(1:794))|745|(9:747|748|749|750|(8:753|(1:755)(1:775)|756|(4:758|(1:760)|763|762)|764|(3:769|770|771)|772|751)|776|777|778|779)(1:791)))(2:816|(12:818|(1:820)(1:(2:846|847))|821|(1:823)(1:844)|824|825|826|827|(1:829)|830|831|832)(1:848)))|534|535|536)))))|431|471|(3:474|476|478)|479)|363|364|366|367|199|200|(3:203|204|205)|123|(6:125|(2:127|(1:(4:132|(1:141)|136|(1:138)))(2:142|143))|144|(2:150|(1:153))|154|(3:156|13eb|161))|166|167)(2:914|915))))|923|(3:926|927|(6:930|931|932|933|(8:935|936|937|938|(4:941|(3:943|944|945)(1:947)|946|939)|948|949|(2:951|(11:953|(3:955|(3:958|(7:960|961|(2:964|962)|965|966|(2:968|969)(1:971)|970)(3:972|973|974)|956)|975)|976|(1:978)|979|(1:981)|982|(1:984)(1:988)|985|986|987)(2:989|990))(2:991|992))|(9:1004|1005|1006|1007|1008|(4:1011|(3:1013|1014|1015)(1:1017)|1016|1009)|1018|1019|(2:1021|(17:1023|1024|(7:1069|1070|(6:1073|(1:1075)(1:1088)|1076|(3:1078|1079|(3:1081|1082|1083)(1:1085))(1:1087)|1084|1071)|1089|1090|(3:1092|1094|1095)|1096)|1026|(6:1028|(4:1031|(3:1033|1034|1035)(1:1037)|1036|1029)|1038|1039|(1:1041)|1042)|1043|(4:1046|(3:1048|1049|1050)(1:1052)|1051|1044)|1053|1054|(1:1056)|1057|(1:1059)(1:1068)|1060|1061|1062|1063|1064)(2:1099|1100))(2:1101|1102))(2:1108|1109)))|340|341|(8:344|348|350|352|354|356|(0)|359)|360|(0)(0)|363|364|366|367|199|200|(3:203|204|205)|123|(0)|166|167|(12:(1:728)|(0)|(1:884)|(1:784)|(1:837)|(1:570)|(1:1113)|(1:1152)|(1:996)|(1:438)|(1:549)|(1:613))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:95|(12:(3:98|99|(2:103|(2:105|(23:107|(6:110|111|112|113|114|108)|333|334|335|(1:337)(2:911|(1:913))|338|340|341|(3:356|(1:358)|359)|360|(1:362)(5:(5:395|(2:397|(13:399|(2:401|(3:403|(2:405|406)(1:445)|407)(2:446|447))(2:886|456)|408|409|410|411|(1:413)(1:434)|(1:415)(1:433)|416|(5:(2:419|420)(1:427)|421|(1:423)|424|(1:426))|428|429|430)(2:469|470))|471|(1:478)|479)(4:481|(1:483)|903|(3:487|488|(2:490|(1:(2:891|892)(12:497|498|499|500|(1:502)(1:880)|503|(4:505|(2:507|(1:509))(1:513)|510|(1:512))|514|(4:849|(1:(2:852|853)(1:877))(1:(1:879))|854|(8:856|857|858|(6:861|(1:863)(1:871)|864|(3:866|867|868)(1:870)|869|859)|872|873|874|875)(1:876))(2:518|(2:520|(2:795|(11:797|(1:799)(1:(2:813|814))|800|(1:802)(1:811)|803|804|805|(1:807)|808|809|810)(1:815))(6:524|(2:528|(2:530|(1:532)(3:658|(2:660|(2:662|(7:664|665|666|(1:668)|669|670|671)(1:672))(1:673))|(2:675|(2:677|(9:679|680|681|(1:683)(1:690)|684|(1:686)|687|688|689)(1:691))(1:692))(1:693)))(2:694|(1:(13:697|(1:699)|700|(1:702)(1:(2:736|737))|703|704|705|706|(6:709|(1:711)(1:719)|712|(3:714|715|716)(1:718)|717|707)|720|721|722|723)(1:738))(1:739)))|740|(1:(2:743|744)(1:792))(1:(1:794))|745|(9:747|748|749|750|(8:753|(1:755)(1:775)|756|(4:758|(1:760)|763|762)|764|(3:769|770|771)|772|751)|776|777|778|779)(1:791)))(2:816|(12:818|(1:820)(1:(2:846|847))|821|(1:823)(1:844)|824|825|826|827|(1:829)|830|831|832)(1:848)))|534|535|536)))))|431|471|(3:474|476|478)|479)|363|364|366|367|199|200|(3:203|204|205)|123|(6:125|(2:127|(1:(4:132|(1:141)|136|(1:138)))(2:142|143))|144|(2:150|(1:153))|154|(3:156|13eb|161))|166|167)(2:914|915))))|363|364|366|367|199|200|(3:203|204|205)|123|(0)|166|167)|923|(3:926|927|(6:930|931|932|933|(8:935|936|937|938|(4:941|(3:943|944|945)(1:947)|946|939)|948|949|(2:951|(11:953|(3:955|(3:958|(7:960|961|(2:964|962)|965|966|(2:968|969)(1:971)|970)(3:972|973|974)|956)|975)|976|(1:978)|979|(1:981)|982|(1:984)(1:988)|985|986|987)(2:989|990))(2:991|992))|(9:1004|1005|1006|1007|1008|(4:1011|(3:1013|1014|1015)(1:1017)|1016|1009)|1018|1019|(2:1021|(17:1023|1024|(7:1069|1070|(6:1073|(1:1075)(1:1088)|1076|(3:1078|1079|(3:1081|1082|1083)(1:1085))(1:1087)|1084|1071)|1089|1090|(3:1092|1094|1095)|1096)|1026|(6:1028|(4:1031|(3:1033|1034|1035)(1:1037)|1036|1029)|1038|1039|(1:1041)|1042)|1043|(4:1046|(3:1048|1049|1050)(1:1052)|1051|1044)|1053|1054|(1:1056)|1057|(1:1059)(1:1068)|1060|1061|1062|1063|1064)(2:1099|1100))(2:1101|1102))(2:1108|1109)))|340|341|(8:344|348|350|352|354|356|(0)|359)|360|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:1352:0x0072, code lost:
        if (r2.A05 < r60.A0C.A05()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1369:0x0105, code lost:
        if (((r61.A02 * 1000) + r2.A0E) >= r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1407:0x01a0, code lost:
        if (r40 != false) goto L1164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1429:0x0206, code lost:
        if (r2 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1767:0x09b2, code lost:
        if (r6.A07(r0) == null) goto L903;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2049:0x0e62, code lost:
        if (r4.A01 == 0) goto L763;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2223:0x1110, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2235:0x1141, code lost:
        r5 = r60.A0V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2236:0x1147, code lost:
        if (r5.A0O() == false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2237:0x1149, code lost:
        r4 = r60.A0x;
        r4.A04("fts_ready", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2238:0x1151, code lost:
        r0 = A0A(r61, 0);
        r5.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2239:0x1158, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2240:0x115b, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2241:0x115c, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2242:0x115d, code lost:
        r4.A04("fts_ready", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2243:0x1163, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2245:0x1165, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2246:0x1166, code lost:
        com.whatsapp.util.Log.e(r2);
        r2 = r60.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2247:0x116d, code lost:
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2249:0x1170, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2251:0x1172, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2253:0x1174, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2255:0x1177, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2257:0x117b, code lost:
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2259:0x117e, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2282:0x11ce, code lost:
        r6 = r60.A0V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2283:0x11d4, code lost:
        if (r6.A0O() == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2284:0x11d6, code lost:
        r5 = r60.A0x;
        r5.A04("fts_ready", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2285:0x11df, code lost:
        r0 = A0A(r61, 0);
        r6.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2286:0x11e6, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2287:0x11e9, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2288:0x11ea, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2289:0x11eb, code lost:
        r5.A04("fts_ready", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2290:0x11ee, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2340:0x12d0, code lost:
        r5 = r60.A0V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2341:0x12d6, code lost:
        if (r5.A0O() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2342:0x12d8, code lost:
        r4 = r60.A0x;
        r4.A04("fts_ready", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2343:0x12e1, code lost:
        r0 = A0A(r61, 0);
        r5.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2344:0x12e8, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2345:0x12eb, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2346:0x12ec, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2347:0x12ed, code lost:
        r4.A04("fts_ready", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2348:0x12f1, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2368:0x133c, code lost:
        r5 = r60.A0V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2369:0x1342, code lost:
        if (r5.A0O() == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2370:0x1344, code lost:
        r4 = r60.A0x;
        r4.A04("fts_ready", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2371:0x134d, code lost:
        r0 = A0A(r61, 0);
        r5.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2372:0x1354, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2373:0x1357, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2374:0x1358, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2375:0x1359, code lost:
        r4.A04("fts_ready", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2376:0x135d, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2445:0x143b, code lost:
        r5 = r60.A0V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2446:0x1441, code lost:
        if (r5.A0O() == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2447:0x1443, code lost:
        r4 = r60.A0x;
        r4.A04("fts_ready", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2448:0x144c, code lost:
        r0 = A0A(r61, 0);
        r5.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2449:0x1453, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2450:0x1456, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2451:0x1457, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2452:0x1458, code lost:
        r4.A04("fts_ready", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2453:0x145c, code lost:
        throw r2;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:1687:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:1691:0x07e1 A[Catch: all -> 0x10ec, Error -> 0x10ef, RuntimeException -> 0x10f2, SQLiteDatabaseCorruptException -> 0x10f5, SQLiteDiskIOException -> 0x10fd, SQLiteConstraintException -> 0x1100, IOException -> 0x1103, TRY_ENTER, TryCatch #116 {Error -> 0x10ef, RuntimeException -> 0x10f2, all -> 0x10ec, blocks: (B:1465:0x0285, B:1473:0x02a5, B:1475:0x02af, B:1476:0x02b1, B:1683:0x0791, B:1685:0x0797, B:1688:0x07aa, B:1691:0x07e1, B:1693:0x07ea, B:1695:0x07f0, B:1697:0x07ff, B:1699:0x080e, B:1701:0x081c, B:1705:0x085d, B:1706:0x085f, B:1725:0x08b6, B:1748:0x097d, B:1758:0x098f, B:1704:0x0856, B:1708:0x0885, B:1709:0x0886, B:1723:0x08b3, B:1760:0x0991, B:1761:0x0992, B:1763:0x0994, B:2198:0x10d5, B:2200:0x10db, B:2202:0x10df, B:1766:0x09aa, B:1771:0x09ba, B:1773:0x09c0, B:1775:0x09cb, B:1778:0x09d3, B:1780:0x09d7, B:2162:0x1088, B:2183:0x10a8, B:2185:0x10aa, B:1477:0x02b7, B:1479:0x02bd, B:1509:0x02f1, B:1512:0x02f7, B:1639:0x073c, B:1669:0x0765), top: B:2587:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:1692:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:2300:0x1201 A[Catch: all -> 0x1404, TRY_ENTER, TRY_LEAVE, TryCatch #165 {all -> 0x1404, blocks: (B:2270:0x118f, B:2300:0x1201, B:2322:0x1266, B:2323:0x126e, B:2326:0x1272, B:2328:0x1295, B:2356:0x1303, B:2266:0x1187, B:2267:0x118a), top: B:2546:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:2322:0x1266 A[Catch: all -> 0x1404, TRY_ENTER, TryCatch #165 {all -> 0x1404, blocks: (B:2270:0x118f, B:2300:0x1201, B:2322:0x1266, B:2323:0x126e, B:2326:0x1272, B:2328:0x1295, B:2356:0x1303, B:2266:0x1187, B:2267:0x118a), top: B:2546:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:2328:0x1295 A[Catch: all -> 0x1404, TRY_LEAVE, TryCatch #165 {all -> 0x1404, blocks: (B:2270:0x118f, B:2300:0x1201, B:2322:0x1266, B:2323:0x126e, B:2326:0x1272, B:2328:0x1295, B:2356:0x1303, B:2266:0x1187, B:2267:0x118a), top: B:2546:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:2385:0x136d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:2392:0x138f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C27671Oh A0A(final X.AnonymousClass092 r61, int r62) {
        /*
            Method dump skipped, instructions count: 5248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A0A(X.092, int):X.1Oh");
    }

    /* JADX WARN: Finally extract failed */
    public C0Hr A0B(C0Hr c0Hr) {
        C04580Kz c04580Kz;
        Cursor A07;
        C000700j.A00();
        C0Hr c0Hr2 = new C0Hr(this.A0C, c0Hr);
        c0Hr2.A03 = 1L;
        c0Hr2.A02 = 1L;
        c0Hr2.A00 = 0;
        c0Hr2.A01 = 0;
        C0CD A03 = this.A0n.A03();
        try {
            UserJid userJid = c0Hr.A0A;
            if (C011405q.A03(userJid)) {
                C0CE c0ce = A03.A02;
                String str = C0HD.A1D;
                C05A c05a = this.A0K;
                c04580Kz = C04580Kz.A00;
                A07 = c0ce.A07(str, new String[]{String.valueOf(c05a.A05(c04580Kz))});
            } else {
                C0CE c0ce2 = A03.A02;
                String str2 = C0HD.A1C;
                C05A c05a2 = this.A0K;
                c04580Kz = C04580Kz.A00;
                A07 = c0ce2.A07(str2, new String[]{String.valueOf(c05a2.A05(c04580Kz)), String.valueOf(this.A0a.A02(userJid)), userJid.getRawString()});
            }
            while (A07.moveToNext()) {
                AnonymousClass092 A04 = this.A0H.A04(A07, c04580Kz, false, true);
                if (A04 != null && A04.A0m != 15 && !C0Ho.A0N(A04)) {
                    c0Hr2.A06 = A04.A0p;
                    c0Hr2.A08 = A04;
                    c0Hr2.A07 = A04.A0E;
                    c0Hr2.A00++;
                    if (!C011405q.A03(c0Hr2.A0A)) {
                        if (A04.A0p <= c0Hr.A04) {
                            c0Hr2.A04 = A04.A0p;
                        } else {
                            int i = c0Hr2.A01 + 1;
                            c0Hr2.A01 = i;
                            if (i == 1) {
                                c0Hr2.A03 = A04.A0p;
                            }
                            if (c0Hr2.A01 <= 2) {
                                c0Hr2.A02 = A04.A0p;
                            }
                        }
                        if (A04.A0p <= c0Hr.A05) {
                            c0Hr2.A05 = A04.A0p;
                        }
                    }
                }
            }
            A07.close();
            A03.close();
            if (c0Hr2.A00 == 0) {
                return null;
            }
            return c0Hr2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public AnonymousClass092 A0C(long j) {
        return this.A0H.A01(j);
    }

    public AnonymousClass092 A0D(Cursor cursor, AbstractC005302j abstractC005302j) {
        return this.A0H.A03(cursor, abstractC005302j);
    }

    public AnonymousClass092 A0E(AnonymousClass093 anonymousClass093) {
        if (anonymousClass093 == null || anonymousClass093.A0A == null || TextUtils.isEmpty(anonymousClass093.A0J)) {
            return null;
        }
        return this.A0H.A05(new AnonymousClass094(anonymousClass093.A0A, anonymousClass093.A0O, anonymousClass093.A0J));
    }

    public AnonymousClass092 A0F(AnonymousClass094 anonymousClass094) {
        return this.A0H.A05(anonymousClass094);
    }

    public Collection A0G(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass092 A05 = this.A0H.A05((AnonymousClass094) it.next());
            if (A05 != null) {
                arrayList.add(A05);
            }
        }
        return arrayList;
    }

    public final void A0H() {
        File A0D = this.A02.A0D();
        A04(A0D);
        Uri contentUri = MediaStore.Files.getContentUri("external");
        ContentResolver A07 = this.A0B.A07();
        if (A07 == null) {
            Log.w("msgstore/delete-all-media cr=null");
            return;
        }
        try {
            A07.delete(contentUri, "_data LIKE ?||'%'", new String[]{A0D.getAbsolutePath()});
        } catch (IllegalArgumentException | SecurityException | UnsupportedOperationException e) {
            Log.e("msgstore/delete-all-media", e);
        }
    }

    public final void A0I(long j) {
        int i;
        C0EJ c0ej = this.A1K;
        if (c0ej.A01(0, j) != null) {
            i = 5;
        } else {
            i = -1;
            if (c0ej.A04(j) != null) {
                i = 4;
            }
        }
        AbstractC05150Nn A02 = c0ej.A02(j);
        if (i == -1 || A02 == null) {
            return;
        }
        A02.A00(i);
    }

    public void A0J(AbstractC005302j abstractC005302j) {
        int A01;
        C05M c05m = this.A0L;
        C0IT A07 = c05m.A07(abstractC005302j);
        if (A07 == null) {
            return;
        }
        long A072 = this.A11.A07(abstractC005302j);
        int nextInt = new Random().nextInt(999999) + 1;
        C0IT A073 = c05m.A07(abstractC005302j);
        if (A073 != null) {
            synchronized (A073) {
                A07.A0I();
                A07.A08 = nextInt;
                if (A072 != 1) {
                    AnonymousClass092 A012 = this.A0H.A01(A072);
                    A07.A0P = A012;
                    if (A012 != null) {
                        if (!C0DB.A0T(A012)) {
                            A07.A0J = A072;
                        } else {
                            A07.A0P = null;
                        }
                        A07.A0H = A072;
                        A07.A0I = A072;
                        A07.A0G = A072;
                        A07.A0O = null;
                    }
                }
            }
            C05A c05a = this.A0K;
            if (!c05a.A0G()) {
                A01 = c05a.A02(A07.A0F(null), A07.A0U);
            } else {
                ContentValues A0G = A07.A0G(null);
                AbstractC005302j abstractC005302j2 = A07.A0U;
                A01 = c05a.A01(A0G, abstractC005302j2);
                if (A01 > 0) {
                    c05a.A02(A07.A0F(null), abstractC005302j2);
                } else {
                    A01 = 0;
                }
            }
            C000200d.A0q("msgstore/updateChatListTable/updated:", A01);
            return;
        }
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void A0K(AbstractC005302j abstractC005302j, UserJid userJid) {
        ArrayList arrayList;
        C0CD A04;
        C0DV c0dv = this.A1N;
        c0dv.A04();
        C013306k c013306k = c0dv.A07;
        GroupJid of = C003101m.A0U(abstractC005302j) ? GroupJid.of(abstractC005302j) : null;
        synchronized (c013306k) {
            List<AnonymousClass093> A0S = c013306k.A0S();
            arrayList = new ArrayList();
            try {
                A04 = c013306k.A04.A04();
            } catch (SQLiteDatabaseCorruptException unused) {
                c013306k.A08.A04("failPendingRequests failed.");
            }
            try {
                C03790Hb A00 = A04.A00();
                for (AnonymousClass093 anonymousClass093 : A0S) {
                    if (of == null || (of.equals(anonymousClass093.A0A) && userJid != null && (userJid.equals(anonymousClass093.A0C) || userJid.equals(anonymousClass093.A0B)))) {
                        C014406v c014406v = c013306k.A08;
                        StringBuilder sb = new StringBuilder();
                        sb.append("mark pending request as failed: ");
                        sb.append(anonymousClass093.A0J);
                        c014406v.A07(null, sb.toString(), null);
                        ContentValues contentValues = new ContentValues();
                        Pair A042 = C013306k.A04(anonymousClass093.A0J, anonymousClass093.A0I);
                        contentValues.put("status", (Integer) 13);
                        contentValues.put("timestamp", Integer.valueOf((int) (c013306k.A02.A05() / 1000)));
                        if (c013306k.A0g()) {
                            A04.A02.A00("pay_transaction", contentValues, "id=?", new String[]{anonymousClass093.A0I});
                        }
                        A04.A02.A00("pay_transactions", contentValues, (String) A042.first, (String[]) A042.second);
                        arrayList.add(new AnonymousClass094(anonymousClass093.A0A, anonymousClass093.A0O, anonymousClass093.A0J));
                    }
                }
                A00.A00();
                A00.close();
                A04.close();
            } finally {
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass092 A05 = this.A0H.A05((AnonymousClass094) it.next());
            if (A05 != null && A05.A0F != null) {
                A05.A0F.A01 = 13;
                A05.A0F.A05 = this.A0C.A05();
                this.A0Z.A01(A05, 16);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x00ba, code lost:
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0L(X.AbstractC005302j r19, X.C0KN r20) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A0L(X.02j, X.0KN):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ac, code lost:
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0040, code lost:
        if (r0.A01 != 1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0M(X.AbstractC005302j r12, java.lang.Long r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            java.lang.String r0 = "msgstore/clearmsgs/service/jid "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = " excludeStarred:"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            X.0EO r0 = r11.A0Z
            android.os.Handler r4 = r0.A01
            java.lang.String r0 = r12.getRawString()
            r7 = 1
            android.os.Message r0 = android.os.Message.obtain(r4, r7, r0)
            r0.sendToTarget()
            X.0Gt r1 = r11.A0P
            r0 = r14 ^ 1
            r6 = 0
            X.0Hl r3 = r1.A05(r12, r0, r13, r15)
            if (r3 == 0) goto Ld0
            X.05M r0 = r11.A0L
            X.0IT r0 = r0.A07(r12)
            r8 = 0
            if (r0 == 0) goto L42
            int r0 = r0.A01
            r10 = 1
            if (r0 == r7) goto L43
        L42:
            r10 = 0
        L43:
            if (r14 == 0) goto Lae
            X.01B r1 = r11.A07
            boolean r0 = X.C003101m.A0U(r12)
            if (r0 != 0) goto Ld4
            boolean r0 = X.C003101m.A0P(r12)
            if (r0 != 0) goto Ld4
            X.03B r0 = X.C01C.A0W
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto Ld4
            X.06O r9 = r11.A19
            X.05E r0 = r9.A03
            X.0CD r5 = r0.A03()
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> La2
            X.05A r0 = r9.A01     // Catch: java.lang.Throwable -> La2
            long r0 = r0.A05(r12)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> La2
            r2[r8] = r0     // Catch: java.lang.Throwable -> La2
            boolean r0 = r9.A03()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L80
            java.lang.String r1 = "SELECT 1 FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND action_type = 61 LIMIT 1"
        L79:
            X.0CE r0 = r5.A02     // Catch: java.lang.Throwable -> La2
            android.database.Cursor r2 = r0.A07(r1, r2)     // Catch: java.lang.Throwable -> La2
            goto L83
        L80:
            java.lang.String r1 = "SELECT 1 FROM message_view WHERE chat_row_id = ? AND message_type = 7 AND media_size = 61 LIMIT 1"
            goto L79
        L83:
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L95
            int r1 = r2.getInt(r8)     // Catch: java.lang.Throwable -> L99
            r0 = 0
            if (r1 != r7) goto L91
            r0 = 1
        L91:
            r2.close()     // Catch: java.lang.Throwable -> La2
            goto La9
        L95:
            r2.close()     // Catch: java.lang.Throwable -> La2
            goto Ld1
        L99:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            if (r2 == 0) goto La1
            r2.close()     // Catch: java.lang.Throwable -> La1
        La1:
            throw r0     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La4
        La4:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> La8
        La8:
            throw r0
        La9:
            r5.close()
            if (r0 == 0) goto Ld4
        Lae:
            r11.A0J(r12)
            if (r10 == 0) goto Lbb
            java.lang.String r0 = "msgstore/clearmsgs/service/ adding plaintext disabled message"
            com.whatsapp.util.Log.i(r0)
            r11.A0g(r12, r6)
        Lbb:
            r1 = 2
            java.lang.String r0 = r12.getRawString()
            android.os.Message r0 = android.os.Message.obtain(r4, r1, r0)
            r0.sendToTarget()
            X.00o r0 = r11.A0D
            android.app.Application r1 = r0.A00
            java.lang.String r0 = "action_clear"
            com.whatsapp.data.ConversationDeleteService.A00(r1, r0, r3)
        Ld0:
            return
        Ld1:
            r5.close()
        Ld4:
            boolean r0 = r11.A0h(r12, r7)
            r0 = r0 ^ r7
            r10 = r10 & r0
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A0M(X.02j, java.lang.Long, boolean, boolean):void");
    }

    public void A0N(AbstractC005302j abstractC005302j, boolean z) {
        C000200d.A0v("msgstore/deletemsgs/service/jid ", abstractC005302j);
        Handler handler = this.A0Z.A01;
        Message.obtain(handler, 1, abstractC005302j.getRawString()).sendToTarget();
        C03870Hl A05 = this.A0P.A05(abstractC005302j, true, null, z);
        if (A05 != null) {
            Message.obtain(handler, 2, abstractC005302j.getRawString()).sendToTarget();
            ConversationDeleteService.A00(this.A0D.A00, "action_delete", A05);
        }
    }

    public void A0O(AnonymousClass094 anonymousClass094, int i, long j) {
        AnonymousClass012 anonymousClass012 = this.A0C;
        long A04 = anonymousClass012.A04();
        C05S c05s = this.A0e;
        C05E c05e = c05s.A05;
        C0CD A042 = c05e.A04();
        try {
            C03790Hb A00 = A042.A00();
            C0CF A01 = c05s.A07.A01("UPDATE message SET status = ? WHERE chat_row_id = ? AND from_me = ? AND key_id = ?");
            String str = anonymousClass094.A01;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            A01.A04(2, c05s.A03.A05(abstractC005302j));
            A01.A04(3, 1L);
            A01.A05(4, str);
            A01.A04(1, i);
            if (A01.A00() != 1) {
                if (c05s.A0A()) {
                    StringBuilder A0P = C000200d.A0P("msgstore/updateMessageStatusV2/update/failed ");
                    A0P.append(str);
                    A0P.append(" ");
                    A0P.append(abstractC005302j);
                    Log.e(A0P.toString());
                }
            } else {
                StringBuilder sb = new StringBuilder("msgstore/updateMessageStatusV2/update/success ");
                sb.append(anonymousClass094);
                sb.append(" ");
                sb.append(i);
                Log.i(sb.toString());
            }
            c05e.A05();
            if (c05e.A06.A0N()) {
                ContentValues contentValues = new ContentValues(2);
                if (i != 4) {
                    if (i == 5) {
                        contentValues.put("receipt_device_timestamp", Long.valueOf(j));
                    } else if (i == 8) {
                        contentValues.put("played_device_timestamp", Long.valueOf(j));
                    } else if (i != 13) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected status ");
                        sb2.append(i);
                        sb2.append(" for message ");
                        sb2.append(str);
                        sb2.append(" ");
                        sb2.append(abstractC005302j);
                        throw new IllegalArgumentException(sb2.toString());
                    } else {
                        contentValues.put("read_device_timestamp", Long.valueOf(j));
                    }
                }
                contentValues.put("status", Integer.valueOf(i));
                String[] strArr = new String[3];
                if (abstractC005302j != null) {
                    strArr[0] = abstractC005302j.getRawString();
                    strArr[1] = String.valueOf(1);
                    strArr[2] = str;
                    int A002 = A042.A02.A00("messages", contentValues, "key_remote_jid = ? AND key_from_me = ? AND key_id = ?", strArr);
                    if (c05s.A0A() || A002 == 1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("MainMessageStore/updateMessageStatusTimestamp/update/success ");
                        sb3.append(anonymousClass094);
                        sb3.append(" ");
                        sb3.append(i);
                        Log.i(sb3.toString());
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("MainMessageStore/updateMessageStatusTimestamp/update/failed ");
                        sb4.append(anonymousClass094);
                        sb4.append(" ");
                        sb4.append(A002);
                        Log.e(sb4.toString());
                    }
                } else {
                    throw null;
                }
            }
            A00.A00();
            A00.close();
            A042.close();
            C000200d.A0e(anonymousClass012, A04, this.A0O, "CoreMessageStore/updateMessageStatusTimestamp");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A042.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A0P(final AnonymousClass094 anonymousClass094, final AnonymousClass093 anonymousClass093) {
        StringBuilder A0P = C000200d.A0P("msgstore/updateMessagePaymentTransaction/PAY transactionStatus:");
        A0P.append(anonymousClass093.A01);
        A0P.append(" for key:");
        A0P.append(anonymousClass094);
        Log.i(A0P.toString());
        this.A0F.A01(new Runnable() { // from class: X.1O5
            {
                C0C9.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:158:0x0111, code lost:
                if (r3 != null) goto L73;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 701
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1O5.run():void");
            }
        }, 28);
    }

    public void A0Q(AnonymousClass092 anonymousClass092) {
        this.A0F.A01(new C1O1(this, anonymousClass092, anonymousClass092.A0w ? 22 : -1), 26);
    }

    /* JADX WARN: Code restructure failed: missing block: B:425:0x0060, code lost:
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0R(X.AnonymousClass092 r28) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A0R(X.092):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:474:0x0234, code lost:
        if (r1.contains(r0) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0244, code lost:
        if (r8.A0A(r28.A0A()) != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x024c, code lost:
        if (r4 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x03ae, code lost:
        if (r0 == false) goto L224;
     */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0S(X.AnonymousClass092 r28) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A0S(X.092):void");
    }

    public void A0T(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092.A0p < 0) {
            StringBuilder A0P = C000200d.A0P("CoreMessageStore/updateMessageAsync/message must have row_id set; key=");
            A0P.append(anonymousClass092.A0n);
            C000700j.A08(false, A0P.toString());
        }
        A0W(anonymousClass092, -1);
    }

    public void A0U(final AnonymousClass092 anonymousClass092) {
        AnonymousClass092 A0C = anonymousClass092.A0C();
        C000700j.A07(A0C != null);
        int i = A0C.A09;
        boolean z = i == 2;
        StringBuilder A0P = C000200d.A0P("coremessagestore/updatemessagequote/quoted message type: ");
        A0P.append(i);
        C000700j.A0A(z, A0P.toString());
        this.A0F.A01(new Runnable() { // from class: X.1OB
            {
                C0C9.this = this;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(17:3|4|5|6|7|8|(3:10|(5:12|13|14|(1:16)|18)|31)|32|(9:34|(3:36|(1:38)|39)|41|42|43|44|45|46|47)|59|41|42|43|44|45|46|47) */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x0094, code lost:
                if (r0 <= (r6 != null ? java.lang.Long.parseLong(r6) : 0)) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x00a8, code lost:
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x00a9, code lost:
                r14 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x00bd, code lost:
                com.whatsapp.util.Log.e(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x00c0, code lost:
                if (r14 == false) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r15 = this;
                    X.0C9 r5 = X.C0C9.this
                    X.092 r4 = r2
                    X.06Y r3 = r5.A0y
                    X.092 r6 = r4.A0C()
                    r14 = 0
                    if (r6 == 0) goto Ld0
                    r2 = 1
                    X.05E r0 = r3.A0B     // Catch: java.io.IOException -> Lbc
                    X.0CD r7 = r0.A04()     // Catch: java.io.IOException -> Lbc
                    X.0Hb r13 = r7.A00()     // Catch: java.lang.Throwable -> Lb5
                    r0.A05()     // Catch: java.lang.Throwable -> Lae
                    X.05J r0 = r0.A06     // Catch: java.lang.Throwable -> Lae
                    boolean r0 = r0.A0N()     // Catch: java.lang.Throwable -> Lae
                    r11 = 0
                    if (r0 == 0) goto L76
                    long r0 = r4.A0B     // Catch: java.lang.Throwable -> Lae
                    int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                    if (r8 > 0) goto L5c
                    X.0CE r10 = r7.A02     // Catch: java.lang.Throwable -> Lae
                    java.lang.String r9 = "SELECT quoted_row_id FROM messages WHERE _id = ?"
                    java.lang.String[] r8 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lae
                    long r0 = r4.A0p     // Catch: java.lang.Throwable -> Lae
                    java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
                    r8[r14] = r0     // Catch: java.lang.Throwable -> Lae
                    android.database.Cursor r8 = r10.A07(r9, r8)     // Catch: java.lang.Throwable -> Lae
                    boolean r0 = r8.moveToLast()     // Catch: java.lang.Throwable -> L50
                    if (r0 == 0) goto L59
                    java.lang.String r0 = "quoted_row_id"
                    int r0 = r8.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L50
                    long r0 = r8.getLong(r0)     // Catch: java.lang.Throwable -> L50
                    r4.A0B = r0     // Catch: java.lang.Throwable -> L50
                    goto L59
                L50:
                    r0 = move-exception
                    throw r0     // Catch: java.lang.Throwable -> L52
                L52:
                    r0 = move-exception
                    if (r8 == 0) goto L58
                    r8.close()     // Catch: java.lang.Throwable -> L58
                L58:
                    throw r0     // Catch: java.lang.Throwable -> Lae
                L59:
                    r8.close()     // Catch: java.lang.Throwable -> Lae
                L5c:
                    X.05L r1 = r3.A0I     // Catch: java.lang.Throwable -> Lae
                    java.lang.String r0 = "UPDATE messages_quotes SET status=?, needs_push=?, data=?, raw_data=?, timestamp=?, media_url=?, media_mime_type=?, media_wa_type=?, media_size=?, media_name=?, media_caption=?, media_hash=?, media_duration=?, origin=?, latitude=?, longitude=?, mentioned_jids=?, thumb_image=?, edit_version=?, media_enc_hash=?, payment_transaction_id=?, forwarded=?, preview_type=?, quoted_row_id=?, lookup_tables = ? WHERE _id=?"
                    X.0CF r9 = r1.A01(r0)     // Catch: java.lang.Throwable -> Lae
                    X.05T r8 = r3.A01     // Catch: java.lang.Throwable -> Lae
                    long r0 = r4.A0B     // Catch: java.lang.Throwable -> Lae
                    r8.A06(r6, r9)     // Catch: java.lang.Throwable -> Lae
                    r8 = 26
                    r9.A04(r8, r0)     // Catch: java.lang.Throwable -> Lae
                    r9.A00()     // Catch: java.lang.Throwable -> Lae
                    r3.A04(r4)     // Catch: java.lang.Throwable -> Lae
                L76:
                    boolean r0 = r3.A07()     // Catch: java.lang.Throwable -> Lae
                    if (r0 != 0) goto L96
                    long r0 = r6.A0p     // Catch: java.lang.Throwable -> Lae
                    int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                    if (r8 <= 0) goto L99
                    long r0 = r6.A0p     // Catch: java.lang.Throwable -> Lae
                    X.05C r8 = r3.A0H     // Catch: java.lang.Throwable -> Lae
                    java.lang.String r6 = "migration_message_quoted_index"
                    java.lang.String r6 = r8.A02(r6)     // Catch: java.lang.Throwable -> Lae
                    if (r6 == 0) goto L92
                    long r11 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> Lae
                L92:
                    int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                    if (r6 > 0) goto L99
                L96:
                    r3.A06(r4, r2)     // Catch: java.lang.Throwable -> Lae
                L99:
                    r13.A00()     // Catch: java.lang.Throwable -> Lae
                    X.06b r0 = r3.A0A     // Catch: java.lang.Throwable -> Lae
                    r0.A04(r4)     // Catch: java.lang.Throwable -> Lae
                    r13.close()     // Catch: java.lang.Throwable -> Lab
                    r7.close()     // Catch: java.io.IOException -> La8
                    goto Lc2
                La8:
                    r0 = move-exception
                    r14 = 1
                    goto Lbd
                Lab:
                    r0 = move-exception
                    r14 = 1
                    goto Lb6
                Lae:
                    r0 = move-exception
                    throw r0     // Catch: java.lang.Throwable -> Lb0
                Lb0:
                    r0 = move-exception
                    r13.close()     // Catch: java.lang.Throwable -> Lb4
                Lb4:
                    throw r0     // Catch: java.lang.Throwable -> Lb5
                Lb5:
                    r0 = move-exception
                Lb6:
                    throw r0     // Catch: java.lang.Throwable -> Lb7
                Lb7:
                    r0 = move-exception
                    r7.close()     // Catch: java.lang.Throwable -> Lbb
                Lbb:
                    throw r0     // Catch: java.io.IOException -> Lbc
                Lbc:
                    r0 = move-exception
                Lbd:
                    com.whatsapp.util.Log.e(r0)
                    if (r14 == 0) goto Ld0
                Lc2:
                    X.0EO r0 = r5.A0Z
                    android.os.Handler r3 = r0.A02
                    r2 = 2
                    r1 = -1
                    r0 = 0
                    android.os.Message r0 = android.os.Message.obtain(r3, r2, r1, r0, r4)
                    r0.sendToTarget()
                Ld0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1OB.run():void");
            }
        }, 21);
    }

    public synchronized void A0V(AnonymousClass092 anonymousClass092) {
        AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
        if (anonymousClass093 != null && !TextUtils.isEmpty(anonymousClass093.A0K)) {
            C0DV c0dv = this.A1N;
            c0dv.A04();
            C013306k c013306k = c0dv.A07;
            AnonymousClass093 A0P = c013306k.A0P(anonymousClass092.A0F.A0K, null);
            if (A0P != null) {
                AnonymousClass092 A0E = A0E(A0P);
                if (anonymousClass092.A0F.A0J()) {
                    int i = A0P.A01;
                    C014006r c014006r = anonymousClass092.A0F.A07;
                    if (i == 18) {
                        return;
                    }
                    C014006r c014006r2 = A0P.A07;
                    if (c014006r2 == null || !c014006r2.equals(c014006r)) {
                        return;
                    }
                    if (A0E == null) {
                        if (anonymousClass092.A0F.A0P()) {
                            A0P.A01 = 17;
                            A0P.A05 = this.A0C.A05();
                        }
                        if (c013306k.A0i(A0P)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                            sb.append(A0P.A0J);
                            Log.i(C014406v.A01("CoreMessageStore", sb.toString()));
                            C03090Ed c03090Ed = this.A1L;
                            c03090Ed.A0A.AS1(new RunnableC27981Po(c03090Ed, A0P));
                        }
                    } else {
                        if (anonymousClass092.A0F.A0P()) {
                            A0P.A01 = 17;
                            A0P.A05 = this.A0C.A05();
                            A0E.A0F = A0P;
                        }
                        AnonymousClass094 anonymousClass094 = A0E.A0n;
                        AnonymousClass093 anonymousClass0932 = A0E.A0F;
                        if (anonymousClass0932 != null) {
                            if (c013306k.A0j(anonymousClass094, anonymousClass0932, i, 0L, 0)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("msgStore/markPaymentRequestMessageFulfilled request message id: ");
                                sb2.append(A0P.A0J);
                                Log.i(C014406v.A01("CoreMessageStore", sb2.toString()));
                                this.A0Z.A01(A0E, 16);
                            }
                            this.A0V.A0N(A0E, null);
                        } else {
                            throw null;
                        }
                    }
                } else if (A0E != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                    sb3.append(A0P.A0J);
                    sb3.append(" status: ");
                    sb3.append(anonymousClass092.A0F.A01);
                    Log.i(C014406v.A01("CoreMessageStore", sb3.toString()));
                    this.A0Z.A01(A0E, 16);
                    this.A0V.A0N(A0E, null);
                }
            }
        }
    }

    public void A0W(final AnonymousClass092 anonymousClass092, final int i) {
        this.A0F.A01(new Runnable() { // from class: X.1O2
            {
                C0C9.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0C9 c0c9 = C0C9.this;
                AnonymousClass092 anonymousClass0922 = anonymousClass092;
                int i2 = i;
                if (c0c9.A0m(anonymousClass0922, i2)) {
                    Message.obtain(c0c9.A0Z.A02, 2, i2, 0, anonymousClass0922).sendToTarget();
                }
            }
        }, 22);
    }

    public final void A0X(final AnonymousClass092 anonymousClass092, final int i) {
        if (AnonymousClass024.A0c()) {
            C00A c00a = this.A0k;
            C000700j.A01();
            Iterator it = c00a.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (!c0g5.hasNext()) {
                    return;
                }
                ((C00T) c0g5.next()).A07(anonymousClass092, i);
            }
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C018508q c018508q = this.A03;
            c018508q.A02.post(new Runnable() { // from class: X.1O8
                {
                    C0C9.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0C9 c0c9 = C0C9.this;
                    AnonymousClass092 anonymousClass0922 = anonymousClass092;
                    int i2 = i;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    C00A c00a2 = c0c9.A0k;
                    C000700j.A01();
                    Iterator it2 = c00a2.A00.iterator();
                    while (true) {
                        C0G5 c0g52 = (C0G5) it2;
                        if (c0g52.hasNext()) {
                            ((C00T) c0g52.next()).A07(anonymousClass0922, i2);
                        } else {
                            countDownLatch2.countDown();
                            return;
                        }
                    }
                }
            });
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Log.e(e);
            }
        }
    }

    public final void A0Y(AnonymousClass092 anonymousClass092, AnonymousClass092 anonymousClass0922) {
        this.A0i.A03(anonymousClass0922.A0n);
        A0d(Collections.singleton(anonymousClass0922), 2);
        if (anonymousClass092.A0I != null) {
            this.A1J.A02(C0Ho.A08(this.A1O, anonymousClass092));
        }
        this.A1J.A02(anonymousClass092);
    }

    public final void A0Z(AnonymousClass092 anonymousClass092, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = anonymousClass092.A0b;
        if (str.equals(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str2) || anonymousClass092.A0b.equals("UNSET")) {
            anonymousClass092.A0b = str;
            if (z) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("payment_transaction_id", str);
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                if (abstractC005302j != null) {
                    String rawString = abstractC005302j.getRawString();
                    C0CD A04 = this.A0n.A04();
                    try {
                        C0CE c0ce = A04.A02;
                        String[] strArr = new String[3];
                        strArr[0] = rawString;
                        strArr[1] = anonymousClass094.A02 ? "1" : "0";
                        strArr[2] = anonymousClass094.A01;
                        int A00 = c0ce.A00("messages", contentValues, "key_remote_jid = ? AND key_from_me = ? AND key_id = ?", strArr);
                        if (A00 > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("msgStore/updateMessagePaymentTransactionId/PAY updating trans id into fmsg: ");
                            sb.append(str);
                            sb.append(" for message: ");
                            sb.append(anonymousClass094);
                            sb.append(" ");
                            sb.append(A00);
                            Log.i(sb.toString());
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("msgStore/updateMessagePaymentTransactionId/PAY could not write trans id into fmsg: ");
                            sb2.append(str);
                            sb2.append(" for message: ");
                            sb2.append(anonymousClass094);
                            sb2.append(" ");
                            sb2.append(A00);
                            Log.w(sb2.toString());
                        }
                        A04.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                A04.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                }
                throw null;
            }
        }
    }

    public void A0a(AnonymousClass097 anonymousClass097, boolean z) {
        File file;
        C09H c09h = anonymousClass097.A02;
        if (c09h != null && (file = c09h.A0F) != null) {
            byte b = anonymousClass097.A0m;
            boolean z2 = true;
            if ((b != 2 || ((AnonymousClass092) anonymousClass097).A04 != 1) && b != 20 && !C0DB.A0E(b)) {
                z2 = false;
            }
            this.A06.A01(file, b, z | z2, 1);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void A0b(C0HC c0hc) {
        C05E c05e = this.A0n;
        C0CD A04 = c05e.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CE c0ce = A04.A02;
            c0ce.A01("receipts", null, null);
            c0ce.A01("receipt_device", null, null);
            c0ce.A01("receipt_user", null, null);
            c0ce.A01("receipt_orphaned", null, null);
            c0hc.A02("receipts tables");
            c0ce.A0C("UPDATE chat_list SET message_table_id=1, mod_tag=0, unseen_message_count=0, unseen_missed_calls_count=0, unseen_row_count=0, unseen_earliest_message_received_time=0");
            c0ce.A0C("UPDATE chat SET display_message_row_id=1, mod_tag=0, unseen_message_count=0, unseen_missed_calls_count=0, unseen_row_count=0, unseen_earliest_message_received_time=0");
            c0ce.A01("media_refs", null, null);
            c0ce.A01("message_streaming_sidecar", null, null);
            c0ce.A01("message_thumbnail", null, null);
            c0ce.A01("message_media", null, null);
            c0hc.A02("media tables");
            c0ce.A01("messages_vcards", null, null);
            c0ce.A01("messages_vcards_jids", null, null);
            c0ce.A01("mms_thumbnail_metadata", null, null);
            c0hc.A02("vcard tables");
            C03730Gv c03730Gv = this.A0U;
            C0CD A042 = c03730Gv.A05.A04();
            try {
                C0CE c0ce2 = A042.A02;
                c0ce2.A01("frequent", null, null);
                c0ce2.A01("frequents", null, null);
                A042.close();
                c0ce.A01("status", null, null);
                if (c03730Gv != null) {
                    c03730Gv.A00 = new ConcurrentHashMap();
                    c0hc.A02("frequent tables");
                    c0ce.A01("message_ftsv2", null, null);
                    c0hc.A02("fts tables");
                    c0ce.A01("message_send_count", null, null);
                    c0ce.A01("message_location", null, null);
                    c0ce.A01("message_template", null, null);
                    c0ce.A01("message_template_button", null, null);
                    c0ce.A01("message_quoted", null, null);
                    c0ce.A01("message_mentions", null, null);
                    c0ce.A01("message_product", null, null);
                    c0ce.A01("message_link", null, null);
                    c0ce.A01("message_future", null, null);
                    c0ce.A01("message_system", null, null);
                    c0ce.A01("message_text", null, null);
                    c0hc.A02("extra data tables");
                    c0ce.A0C("DELETE FROM message WHERE _id!=1");
                    c0hc.A02("message table");
                    c05e.A05();
                    if (c05e.A06.A0N()) {
                        c0ce.A01("message_thumbnails", null, null);
                        c0hc.A02("media deprecated tables");
                        c0ce.A01("messages_fts", null, null);
                        c0hc.A02("fts deprecated tables");
                        c0ce.A01("messages_links", null, null);
                        c0ce.A01("status_list", null, null);
                        c0ce.A01("messages_quotes", null, null);
                        c0hc.A02("message quotes table");
                        c0ce.A0C("DELETE FROM messages WHERE _id!=1 AND media_wa_type != 8");
                        c0hc.A02("message table");
                    }
                    A00.A00();
                    c0hc.A02("set transaction");
                    A00.close();
                    A04.close();
                    return;
                }
                throw null;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A0c(final Collection collection, final int i) {
        StringBuilder A0P = C000200d.A0P("msgstore/deletemessages ");
        A0P.append(collection.size());
        Log.i(A0P.toString());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.A0i.A03(((AnonymousClass092) it.next()).A0n);
        }
        this.A0F.A01(new Runnable() { // from class: X.1O9
            {
                C0C9.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0C9.this.A0d(collection, i);
            }
        }, 20);
    }

    public void A0d(final Collection collection, final int i) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final boolean z = (i & 10) == 10;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            int A06 = A06(anonymousClass092, i, false);
            AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
            hashMap.put(abstractC005302j, Integer.valueOf(A06));
            if (z) {
                Long l = anonymousClass092.A0R;
                if (l != null) {
                    long longValue = l.longValue();
                    Number number = (Number) hashMap2.get(abstractC005302j);
                    if (number != null) {
                        longValue = Math.max(number.longValue(), longValue);
                    }
                    hashMap2.put(abstractC005302j, Long.valueOf(longValue));
                } else {
                    throw null;
                }
            }
        }
        this.A0Z.A01.post(new Runnable() { // from class: X.1Nz
            {
                C0C9.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0C9 c0c9 = C0C9.this;
                int i2 = i;
                Collection collection2 = collection;
                HashMap hashMap3 = hashMap;
                boolean z2 = z;
                HashMap hashMap4 = hashMap2;
                boolean z3 = (i2 & 2) == 2;
                C00A c00a = c0c9.A0k;
                HashMap hashMap5 = z3 ? hashMap3 : null;
                if (!z2) {
                    hashMap4 = null;
                }
                c00a.A08(collection2, hashMap5, hashMap4);
                for (AbstractC005302j abstractC005302j2 : hashMap3.keySet()) {
                    c0c9.A0A.A04(abstractC005302j2, false);
                }
            }
        });
    }

    public final void A0e(List list) {
        AnonymousClass093 anonymousClass093;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass092 A05 = this.A0H.A05((AnonymousClass094) it.next());
            if (A05 != null && (anonymousClass093 = A05.A0F) != null) {
                anonymousClass093.A01 = 0;
                anonymousClass093.A05 = this.A0C.A05();
                this.A0Z.A01(A05, 16);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:315:0x021b, code lost:
        if (r4 > r18) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x027a, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("msgstore/deletemsgs/batches stopped at ref:");
        r1.append(r4);
        com.whatsapp.util.Log.w(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0363, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0367, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0392, code lost:
        r0 = r6.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0394, code lost:
        if (r0 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0396, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0399, code lost:
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0f(X.C03870Hl r36, X.InterfaceC36451kp r37) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A0f(X.0Hl, X.1kp):boolean");
    }

    public boolean A0g(AbstractC005302j abstractC005302j, Long l) {
        String A08;
        int i;
        int i2;
        int i3;
        String str;
        if (C003101m.A0Y(abstractC005302j)) {
            return false;
        }
        C03770Gz c03770Gz = this.A0u;
        C07A c07a = c03770Gz.A04;
        long A05 = c03770Gz.A00.A05();
        C05V c05v = c07a.A05;
        C04380Jy c04380Jy = (C04380Jy) C07A.A00(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), A05, 19, c07a.A00);
        UserJid of = UserJid.of(abstractC005302j);
        if (c07a.A02.A0E(C01C.A0W) && of != null) {
            AnonymousClass075 anonymousClass075 = c07a.A04;
            AnonymousClass060 anonymousClass060 = anonymousClass075.A04;
            C018108l A0E = anonymousClass060.A0E(of);
            if (A0E == null) {
                i3 = 0;
            } else {
                C018108l A0E2 = anonymousClass060.A0E(of);
                int i4 = 0;
                if (A0E2 != null) {
                    i2 = A0E2.A01;
                    i4 = A0E2.A00;
                } else {
                    i2 = 0;
                }
                int A00 = C04620Ld.A00(i2, i4);
                i3 = 4;
                if (A00 != 2) {
                    if (A00 != 3) {
                        if (A00 != 4) {
                            i3 = 0;
                        } else {
                            i3 = 6;
                            if (A0E.A03 == 3) {
                                i3 = 3;
                            }
                        }
                    } else {
                        i3 = 5;
                        if (A0E.A03 == 3) {
                            i3 = 2;
                        }
                    }
                } else if (A0E.A03 == 3) {
                    i3 = 1;
                }
            }
            c04380Jy.A00 = i3;
            if (i3 != 0) {
                C018108l A002 = anonymousClass075.A00(of);
                if (A002 != null) {
                    str = A002.A08;
                } else {
                    str = null;
                }
                c04380Jy.A01 = str;
            }
        }
        c04380Jy.A0U = l;
        A0X(c04380Jy, -1);
        StringBuilder sb = new StringBuilder("added plaintext disabled message; jid=");
        sb.append(abstractC005302j);
        Log.i(sb.toString());
        C0H7 c0h7 = this.A1S;
        AnonymousClass092 anonymousClass092 = null;
        if (!c0h7.A05.A02(abstractC005302j)) {
            C06C A09 = c0h7.A01.A09(abstractC005302j);
            C018108l A003 = c0h7.A02.A00(of);
            if (A09 != null && A09.A0B() && A003 != null) {
                C05200Ns A004 = A003.A00();
                if (C04620Ld.A00(A004.hostStorage, A004.actualActors) == 1) {
                    int i5 = A003.A03;
                    if (i5 == 3) {
                        A08 = A003.A08;
                        i = 47;
                    } else if (i5 != 2 && i5 != 1) {
                        Log.e("verifiedNameManger/createNewChatBizStateSystemMessage unreachable case");
                    } else {
                        A08 = c0h7.A03.A08(A09, false);
                        i = 46;
                    }
                    anonymousClass092 = c0h7.A06.A0A(abstractC005302j, c0h7.A04.A05(), i, A08);
                }
            }
        }
        boolean A0l = A0l(c04380Jy, -1);
        if (anonymousClass092 != null) {
            A0l(anonymousClass092, -1);
        }
        return A0l;
    }

    /* JADX WARN: Finally extract failed */
    public boolean A0h(AbstractC005302j abstractC005302j, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C0CD A04 = this.A0n.A04();
        try {
            C03790Hb A00 = A04.A00();
            long A01 = this.A19.A01(abstractC005302j);
            if (A01 > 1) {
                C05S c05s = this.A0e;
                C05E c05e = c05s.A05;
                C0CD A042 = c05e.A04();
                C03790Hb A002 = A042.A00();
                try {
                    c05e.A05();
                    z2 = false;
                    if (c05e.A06.A0N()) {
                        C0CD A043 = c05e.A04();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("starred", Integer.valueOf(z ? 1 : 0));
                        if (A043.A02.A00("messages", contentValues, "_id=?", new String[]{String.valueOf(A01)}) == 1) {
                            A043.close();
                            z3 = true;
                        } else {
                            A043.close();
                            StringBuilder sb = new StringBuilder("MainMessageStore/updateMessageStarredStatus/did not update; rowId=");
                            sb.append(A01);
                            Log.e(sb.toString());
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                    if (c05s.A09()) {
                        C0CF A012 = c05s.A07.A01("UPDATE message SET starred = ? WHERE _id = ?");
                        A012.A04(1, z ? 1L : 0L);
                        A012.A04(2, A01);
                        if (A012.A00() == 1) {
                            z4 = true;
                        } else {
                            StringBuilder sb2 = new StringBuilder("MainMessageStore/updateMessageStarredStatusV2/update failed; rowId=");
                            sb2.append(A01);
                            Log.e(sb2.toString());
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                    z2 = (z3 || z4) ? true : true;
                    A002.A00();
                    A002.close();
                    A042.close();
                } finally {
                }
            } else {
                z2 = false;
            }
            A00.A00();
            A00.close();
            A04.close();
            return z2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public boolean A0i(AnonymousClass094 anonymousClass094) {
        C05Q c05q = this.A0H;
        AnonymousClass092 A05 = c05q.A05(anonymousClass094);
        return A05 == null || c05q.A07(A05);
    }

    public boolean A0j(AnonymousClass092 anonymousClass092) {
        return A0k(anonymousClass092, anonymousClass092.A0w ? 22 : -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x00eb, code lost:
        if (r0 != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0k(X.AnonymousClass092 r20, int r21) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A0k(X.092, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00bf, code lost:
        if (((r33.A02 * 1000) + r8.A0E) >= r13) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0l(final X.AnonymousClass092 r33, final int r34) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A0l(X.092, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x0030, code lost:
        if (X.C003101m.A0Z(r1) != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x003b, code lost:
        if (r29 == 1) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x01a7, code lost:
        if (r0 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x01c0, code lost:
        if (r17 != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x02d9, code lost:
        if (r0 <= (r14 != null ? java.lang.Long.parseLong(r14) : 0)) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x033f, code lost:
        if ((r0 != null ? java.lang.Long.parseLong(r0) : 0) < r28.A0p) goto L171;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:597:0x03cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:600:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x03ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x040f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0m(X.AnonymousClass092 r28, int r29) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0C9.A0m(X.092, int):boolean");
    }

    public final boolean A0n(AnonymousClass092 anonymousClass092, long j) {
        C011405q c011405q;
        long j2;
        int i;
        AnonymousClass079 anonymousClass079 = this.A0R;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (anonymousClass094.A02) {
            c011405q = C011405q.A00;
        } else {
            c011405q = null;
        }
        if (anonymousClass092.A0m == 36) {
            j2 = anonymousClass092.A0D;
            i = ((C0KU) anonymousClass092).A00;
        } else {
            j2 = anonymousClass092.A0E;
            i = anonymousClass092.A02;
        }
        C07A c07a = anonymousClass079.A04;
        UserJid of = UserJid.of(anonymousClass094.A00);
        if (of != null) {
            C05V c05v = c07a.A05;
            C04330Jt c04330Jt = (C04330Jt) C07A.A00(C05V.A00(c05v.A01, c05v.A00, of, true), j2, 59, c07a.A00);
            c04330Jt.A00 = i;
            c04330Jt.A0d(c011405q);
            return A0q(c04330Jt, j);
        }
        throw null;
    }

    public final boolean A0o(AnonymousClass092 anonymousClass092, AnonymousClass093 anonymousClass093) {
        C02L c02l = this.A04;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid == null) {
            return false;
        }
        if (!C003101m.A0U(anonymousClass092.A0n.A00) || userJid.equals(anonymousClass093.A0C) || userJid.equals(anonymousClass093.A0B)) {
            if (anonymousClass092 instanceof C0LQ) {
                anonymousClass093.A01 = 15;
                return true;
            } else if (anonymousClass092 instanceof C0LS) {
                anonymousClass093.A01 = 18;
                return true;
            } else {
                throw new IllegalStateException(C014406v.A01("CoreMessageStore", "Handled message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled"));
            }
        }
        return false;
    }

    public final boolean A0p(AnonymousClass092 anonymousClass092, AnonymousClass092 anonymousClass0922) {
        C0IT A07;
        C0IT A072;
        anonymousClass092.A0f(anonymousClass0922);
        AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
        if (anonymousClass093 != null && anonymousClass093.A0O()) {
            anonymousClass092.A0F.A0I(true);
        }
        if (A0m(anonymousClass092, 5)) {
            C0EO c0eo = this.A0Z;
            c0eo.A01(anonymousClass092, 5);
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            final AbstractC005302j abstractC005302j = anonymousClass094.A00;
            c0eo.A02.post(new Runnable() { // from class: X.1O4
                {
                    C0C9.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0C9 c0c9 = C0C9.this;
                    c0c9.A0k.A02(abstractC005302j);
                }
            });
            if (!anonymousClass094.A02 && ((((A072 = this.A0L.A07(abstractC005302j)) != null && A072.A0H >= anonymousClass092.A0p) || anonymousClass092.A08 == 13) && this.A1I.A01(abstractC005302j))) {
                if (anonymousClass092.A0I != null) {
                    this.A1J.A04(C0Ho.A08(this.A1O, anonymousClass092), true);
                }
                this.A1J.A04(anonymousClass092, true);
            } else {
                if (anonymousClass092.A0I != null) {
                    this.A1J.A02(C0Ho.A08(this.A1O, anonymousClass092));
                }
                this.A1J.A02(anonymousClass092);
            }
            C02L c02l = this.A04;
            C05M c05m = this.A0L;
            if (C0DB.A0G(c02l, anonymousClass092) && (A07 = c05m.A07(abstractC005302j)) != null) {
                synchronized (A07) {
                    A07.A03++;
                    StringBuilder sb = new StringBuilder();
                    sb.append("chatInfo/incrementUnseenImportantMessageCount/");
                    sb.append(A07.A0H());
                    Log.i(sb.toString());
                }
            }
            return true;
        }
        return false;
    }

    public boolean A0q(C04330Jt c04330Jt, long j) {
        c04330Jt.A0Q = Long.valueOf(j);
        A0X(c04330Jt, -1);
        StringBuilder sb = new StringBuilder("added ephemeral setting message; jid=");
        sb.append(c04330Jt.A0n.A00);
        Log.i(sb.toString());
        return A0l(c04330Jt, -1);
    }
}
