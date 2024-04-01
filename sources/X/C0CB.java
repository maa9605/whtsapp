package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0CB */
/* loaded from: classes.dex */
public class C0CB {
    public static volatile C0CB A0X;
    public C03420Fq A00;
    public C03390Fn A01;
    public final AbstractC000600i A02;
    public final C018508q A03;
    public final C02L A04;
    public final C01B A05;
    public final C03310Fe A06;
    public final C03320Ff A07;
    public final C05W A08;
    public final AnonymousClass008 A09;
    public final C018708s A0A;
    public final AnonymousClass034 A0B;
    public final C000400f A0C;
    public final C02E A0D;
    public final AnonymousClass012 A0E;
    public final C001200o A0F;
    public final C02F A0G;
    public final C000500h A0H;
    public final C03290Fc A0I;
    public final C05M A0J;
    public final C0DK A0K;
    public final C03340Fh A0L;
    public final C04Z A0M;
    public final C003701t A0N;
    public final C03300Fd A0O;
    public final C03360Fk A0P;
    public final C03350Fj A0Q;
    public final C03330Fg A0R;
    public final C0Fi A0S;
    public final C03280Fb A0T;
    public final File A0U;
    public final String A0V;
    public final Map A0W = new ConcurrentHashMap();

    public C0CB(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C03280Fb c03280Fb, C02L c02l, C05M c05m, AnonymousClass034 anonymousClass034, C01B c01b, C04Z c04z, C05W c05w, C02E c02e, C018708s c018708s, C03290Fc c03290Fc, C03300Fd c03300Fd, AnonymousClass008 anonymousClass008, C03310Fe c03310Fe, C000400f c000400f, C03320Ff c03320Ff, C03330Fg c03330Fg, C02F c02f, C000500h c000500h, C03340Fh c03340Fh, C0Fi c0Fi, C03350Fj c03350Fj, C0DK c0dk, C03360Fk c03360Fk, String str) {
        this.A0F = c001200o;
        this.A0E = anonymousClass012;
        this.A0N = c003701t;
        this.A03 = c018508q;
        this.A02 = abstractC000600i;
        this.A0T = c03280Fb;
        this.A04 = c02l;
        this.A0J = c05m;
        this.A0B = anonymousClass034;
        this.A05 = c01b;
        this.A0M = c04z;
        this.A08 = c05w;
        this.A0D = c02e;
        this.A0A = c018708s;
        this.A0I = c03290Fc;
        this.A0O = c03300Fd;
        this.A09 = anonymousClass008;
        this.A06 = c03310Fe;
        this.A0C = c000400f;
        this.A07 = c03320Ff;
        this.A0R = c03330Fg;
        this.A0G = c02f;
        this.A0H = c000500h;
        this.A0L = c03340Fh;
        this.A0S = c0Fi;
        this.A0Q = c03350Fj;
        this.A0K = c0dk;
        this.A0P = c03360Fk;
        this.A0V = str;
        this.A0U = new File(anonymousClass034.A02(), "chatsettingsbackup.db");
        A0I();
    }

    public static C0CB A00() {
        if (A0X == null) {
            synchronized (C0CB.class) {
                if (A0X == null) {
                    A0X = new C0CB(C001200o.A01, AnonymousClass012.A00(), C003701t.A00(), C018508q.A00(), AbstractC000600i.A00(), C03280Fb.A00(), C02L.A00(), C05M.A00(), AnonymousClass034.A00(), C01B.A00(), C04Z.A00(), C05W.A00(), C02E.A00(), C018708s.A00(), C03290Fc.A00(), C03300Fd.A00(), AnonymousClass008.A01, C03310Fe.A00(), C000400f.A00(), C03320Ff.A00, C03330Fg.A00, C02F.A00(), C000500h.A00(), C03340Fh.A00, C0Fi.A00(), C03350Fj.A01(), C0DK.A00(), C03360Fk.A00, "chatsettings.db");
                }
            }
        }
        return A0X;
    }

    public static final boolean A01(C03370Fl c03370Fl) {
        String str = c03370Fl.A0C;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str) || c03370Fl.A02 != 0 || c03370Fl.A0H || c03370Fl.A0G) {
            return false;
        }
        C03370Fl A02 = c03370Fl.A02();
        return TextUtils.equals(c03370Fl.A07(), A02.A07()) && TextUtils.equals(c03370Fl.A08(), A02.A08()) && TextUtils.equals(c03370Fl.A06(), A02.A06()) && TextUtils.equals(c03370Fl.A05(), A02.A05()) && TextUtils.equals(c03370Fl.A03(), A02.A03()) && TextUtils.equals(c03370Fl.A04(), A02.A04()) && c03370Fl.A0B() == A02.A0B() && c03370Fl.A00 == 0 && c03370Fl.A05 == null && c03370Fl.A04 == null && !c03370Fl.A0E;
    }

    public long A02(AbstractC005302j abstractC005302j) {
        C03370Fl A07 = A07(abstractC005302j);
        if (A07.A0E) {
            return A07.A03;
        }
        return 0L;
    }

    public C03370Fl A03() {
        C03370Fl A08 = A08("group_chat_defaults");
        if (A08.A0A == null) {
            A08.A0A = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A08.A0B)) {
            A08.A0B = "1";
        }
        if (TextUtils.isEmpty(A08.A09)) {
            A08.A09 = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A08.A08)) {
            A08.A08 = "FFFFFF";
        }
        return A08;
    }

    public C03370Fl A04() {
        C03370Fl A08 = A08("individual_chat_defaults");
        if (A08.A0A == null) {
            A08.A0A = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A08.A0B)) {
            A08.A0B = "1";
        }
        if (TextUtils.isEmpty(A08.A09)) {
            A08.A09 = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A08.A08)) {
            A08.A08 = "FFFFFF";
        }
        if (A08.A06 == null) {
            A08.A06 = Settings.System.DEFAULT_RINGTONE_URI.toString();
        }
        if (TextUtils.isEmpty(A08.A07)) {
            A08.A07 = "1";
        }
        return A08;
    }

    public final C03370Fl A05() {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C03400Fo(this.A0E, this.A05, this.A0D, this, this.A0G, this.A01);
        }
        return new C03370Fl(this.A0E, this.A05, this.A0D, this, this.A0G, this.A01);
    }

    public final C03370Fl A06(Cursor cursor) {
        C03370Fl A05 = A05();
        A05.A0C = cursor.getString(0);
        A05.A02 = cursor.getLong(1);
        A05.A0F = cursor.getInt(2) == 1;
        A05.A0H = cursor.getInt(3) == 1;
        A05.A0A = cursor.getString(4);
        A05.A0B = cursor.getString(5);
        A05.A09 = cursor.getString(6);
        A05.A08 = cursor.getString(7);
        A05.A06 = cursor.getString(8);
        A05.A07 = cursor.getString(9);
        A05.A0G = cursor.getInt(10) == 1;
        A05.A0E = cursor.getInt(11) == 1;
        A05.A03 = cursor.getLong(12);
        A05.A0D = cursor.getInt(13) == 1;
        A05.A00 = cursor.getInt(14);
        if ("0".equals(A05.A08)) {
            A05.A08 = "000000";
        }
        if (C03410Fp.A08(this.A05)) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_light_type"));
            if (string != null) {
                A05.A05 = new C03380Fm(string, cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_light_value")), 0);
            }
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_dark_type"));
            if (string2 != null) {
                A05.A04 = new C03380Fm(string2, cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_dark_value")), Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("wallpaper_dark_opacity"))));
            }
        }
        return A05;
    }

    public C03370Fl A07(AbstractC005302j abstractC005302j) {
        return A08(abstractC005302j.getRawString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x005c, code lost:
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C03370Fl A08(java.lang.String r12) {
        /*
            r11 = this;
            java.util.Map r3 = r11.A0W
            java.lang.Object r0 = r3.get(r12)
            X.0Fl r0 = (X.C03370Fl) r0
            if (r0 != 0) goto L67
            X.0Fq r0 = r11.A09()     // Catch: android.database.sqlite.SQLiteDatabaseCorruptException -> L50 java.lang.Throwable -> L5a
            X.0CD r2 = r0.A01()     // Catch: android.database.sqlite.SQLiteDatabaseCorruptException -> L50 java.lang.Throwable -> L5a
            X.0CE r4 = r2.A02     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "settings"
            java.lang.String[] r6 = X.C03440Fs.A00     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = "jid = ?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L49
            r0 = 0
            r8[r0] = r12     // Catch: java.lang.Throwable -> L49
            r9 = 0
            java.lang.String r10 = "getSettings/QUERY_CHAT_SETTINGS"
            android.database.Cursor r1 = r4.A09(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L45
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3a
            X.0Fl r0 = r11.A06(r1)     // Catch: java.lang.Throwable -> L3e
            r1.close()     // Catch: java.lang.Throwable -> L49
            r2.close()     // Catch: android.database.sqlite.SQLiteDatabaseCorruptException -> L50 java.lang.Throwable -> L5a
            goto L5c
        L3a:
            r1.close()     // Catch: java.lang.Throwable -> L49
            goto L45
        L3e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L40
        L40:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L44
        L44:
            throw r0     // Catch: java.lang.Throwable -> L49
        L45:
            r2.close()     // Catch: android.database.sqlite.SQLiteDatabaseCorruptException -> L50 java.lang.Throwable -> L5a
            goto L5e
        L49:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L4f
        L4f:
            throw r0     // Catch: android.database.sqlite.SQLiteDatabaseCorruptException -> L50 java.lang.Throwable -> L5a
        L50:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/get"
            com.whatsapp.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L5a
            r11.A0H()     // Catch: java.lang.Throwable -> L5a
            throw r1     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            throw r0
        L5c:
            if (r0 != 0) goto L62
        L5e:
            X.0Fl r0 = r11.A05()
        L62:
            r0.A0C = r12
            r3.put(r12, r0)
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CB.A08(java.lang.String):X.0Fl");
    }

    public final synchronized C03420Fq A09() {
        C03420Fq c03420Fq;
        c03420Fq = this.A00;
        if (c03420Fq == null) {
            c03420Fq = new C03420Fq(this.A0F.A00, this.A0V, this.A02, this.A0M, this.A01);
            this.A00 = c03420Fq;
        }
        return c03420Fq;
    }

    public Long A0A(AbstractC005302j abstractC005302j, long j) {
        C000700j.A08(j > 0, "Pinned time should be strictly positive");
        return A0B(abstractC005302j, true, j);
    }

    public final Long A0B(AbstractC005302j abstractC005302j, boolean z, long j) {
        if (z) {
            this.A0O.A01(7, abstractC005302j);
        }
        C03370Fl A07 = A07(abstractC005302j);
        boolean z2 = A07.A0E;
        long j2 = A07.A03;
        try {
            C0CD A02 = A09().A02();
            A07.A0E = z;
            if (z) {
                A07.A03 = j;
            } else {
                A07.A03 = 0L;
            }
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("pinned", Boolean.valueOf(A07.A0E));
            contentValues.put("pinned_time", Long.valueOf(A07.A03));
            C0CE c0ce = A02.A02;
            boolean z3 = true;
            if (c0ce.A00("settings", contentValues, "jid =?", new String[]{abstractC005302j.getRawString()}) == 0) {
                contentValues.put("jid", abstractC005302j.getRawString());
                c0ce.A02("settings", contentValues);
            }
            if (z2 == z && j2 == A07.A03) {
                z3 = false;
            }
            A02.close();
            this.A0L.A02();
            if (z3) {
                return Long.valueOf(j2);
            }
            return null;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/set-pin", e);
            A0H();
            throw e;
        }
    }

    public final ArrayList A0C() {
        List A05 = C03460Fu.A05(EnumC03450Ft.CRYPT13, EnumC03450Ft.A00());
        ((AbstractCollection) A05).add(".crypt1");
        File file = this.A0U;
        ArrayList A04 = C03460Fu.A04(file, A05);
        C03460Fu.A0C(A04, file);
        return A04;
    }

    public List A0D() {
        ArrayList arrayList = new ArrayList();
        C0CD A01 = A09().A01();
        try {
            Cursor A09 = A01.A02.A09("settings", new String[]{"jid", "mute_end"}, "muted_notifications = ? AND (mute_end > ? OR mute_end = ? )", new String[]{String.valueOf(0), String.valueOf(this.A0E.A01()), String.valueOf(-1)}, "jid ASC", "GET_MUTED_CHAT_JID_WITH_END_TIME_SORTED");
            int columnIndex = A09.getColumnIndex("jid");
            int columnIndex2 = A09.getColumnIndex("mute_end");
            while (A09.moveToNext()) {
                AbstractC005302j A02 = AbstractC005302j.A02(A09.getString(columnIndex));
                if (A02 != null && (A02 instanceof GroupJid)) {
                    arrayList.add(new C03470Fv(A02, Long.valueOf(A09.getLong(columnIndex2))));
                }
            }
            A09.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public Set A0E() {
        String str;
        String str2;
        HashSet hashSet = new HashSet();
        if (C03410Fp.A08(this.A05)) {
            C03370Fl A04 = A04();
            C03380Fm c03380Fm = A04.A04;
            if (c03380Fm != null && "USER_PROVIDED".equalsIgnoreCase(c03380Fm.A01) && (str2 = c03380Fm.A02) != null) {
                hashSet.add(str2);
            }
            C03380Fm c03380Fm2 = A04.A05;
            if (c03380Fm2 != null && "USER_PROVIDED".equalsIgnoreCase(c03380Fm2.A01) && (str = c03380Fm2.A02) != null) {
                hashSet.add(str);
            }
            try {
                C0CD A01 = A09().A01();
                Cursor A09 = A01.A02.A09("settings", new String[]{"wallpaper_light_value"}, "wallpaper_light_type = ?", new String[]{"USER_PROVIDED"}, null, "getSettings/QUERY_WALLPAPER");
                if (A09 != null) {
                    while (A09.moveToNext()) {
                        try {
                            hashSet.add(A09.getString(A09.getColumnIndexOrThrow("wallpaper_light_value")));
                        } finally {
                        }
                    }
                }
                if (A09 != null) {
                }
                A01.close();
                return hashSet;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e("chat-settings-store/get-wallpaper-files", e);
                throw e;
            }
        }
        return hashSet;
    }

    public Set A0F() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(3);
        try {
            C0CD A01 = A09().A01();
            Cursor A09 = A01.A02.A09("settings", new String[]{"jid"}, "pinned != 0", null, "pinned_time DESC", "getPinnedJids/QUERY_CHAT_SETTINGS");
            while (A09 != null && A09.moveToNext()) {
                AbstractC005302j A02 = AbstractC005302j.A02(A09.getString(0));
                if (A02 != null) {
                    linkedHashSet.add(A02);
                }
            }
            if (A09 != null) {
                A09.close();
            }
            A01.close();
            return linkedHashSet;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/get-pinned-jids", e);
            A0H();
            throw e;
        }
    }

    public final Set A0G() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            C0CD A01 = A09().A01();
            Cursor A09 = A01.A02.A09("settings", new String[]{"jid"}, "use_custom_notifications != 0", null, null, "getCustomNotificationJids/QUERY_CHAT_SETTINGS");
            while (A09 != null) {
                try {
                    if (!A09.moveToNext()) {
                        break;
                    }
                    AbstractC005302j A02 = AbstractC005302j.A02(A09.getString(0));
                    if (A02 != null) {
                        linkedHashSet.add(A02);
                    }
                } finally {
                }
            }
            if (A09 != null) {
            }
            A01.close();
            return linkedHashSet;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/get-pinned-jids", e);
            A0H();
            throw e;
        }
    }

    public void A0H() {
        this.A0W.clear();
        A09().A04();
        synchronized (this) {
            C03420Fq c03420Fq = this.A00;
            if (c03420Fq != null) {
                c03420Fq.close();
                this.A00 = null;
            }
        }
        A0I();
    }

    public final void A0I() {
        this.A01 = new C03390Fn(this.A0E, this.A03, this.A0F, this.A0J, this.A05, this.A0D, this.A0A, this.A09, this.A07, this.A0G, this.A0H, this.A0L, this.A0K, this.A0P);
    }

    public final void A0J(C03370Fl c03370Fl) {
        ContentValues contentValues = new ContentValues(8);
        contentValues.put("use_custom_notifications", Integer.valueOf(c03370Fl.A0H ? 1 : 0));
        contentValues.put("message_tone", c03370Fl.A07());
        contentValues.put("message_vibrate", c03370Fl.A08());
        contentValues.put("message_popup", c03370Fl.A06());
        contentValues.put("message_light", c03370Fl.A05());
        contentValues.put("call_tone", c03370Fl.A03());
        contentValues.put("call_vibrate", c03370Fl.A04());
        contentValues.put("pinned", Boolean.valueOf(c03370Fl.A0E));
        contentValues.put("pinned_time", Long.valueOf(c03370Fl.A03));
        contentValues.put("status_muted", Integer.valueOf(c03370Fl.A0G ? 1 : 0));
        contentValues.put("low_pri_notifications", Boolean.valueOf(c03370Fl.A0B()));
        contentValues.put("media_visibility", Integer.valueOf(c03370Fl.A00));
        if (C03410Fp.A08(this.A05)) {
            C03380Fm c03380Fm = c03370Fl.A05;
            if (c03380Fm != null) {
                contentValues.put("wallpaper_light_type", c03380Fm.A01);
                contentValues.put("wallpaper_light_value", c03370Fl.A05.A02);
            } else {
                contentValues.put("wallpaper_light_type", (String) null);
                contentValues.put("wallpaper_light_value", (String) null);
            }
            C03380Fm c03380Fm2 = c03370Fl.A04;
            if (c03380Fm2 != null) {
                contentValues.put("wallpaper_dark_type", c03380Fm2.A01);
                contentValues.put("wallpaper_dark_value", c03370Fl.A04.A02);
                contentValues.put("wallpaper_dark_opacity", c03370Fl.A04.A00);
            } else {
                contentValues.put("wallpaper_dark_type", (String) null);
                contentValues.put("wallpaper_dark_value", (String) null);
                contentValues.put("wallpaper_dark_opacity", (Integer) null);
            }
        }
        if (c03370Fl.A01() != 0) {
            contentValues.put("mute_end", Long.valueOf(c03370Fl.A01()));
            boolean z = true;
            if (!c03370Fl.A0F && c03370Fl.A01() != 0) {
                z = false;
            }
            contentValues.put("muted_notifications", Boolean.valueOf(z));
        }
        try {
            C0CD A02 = A09().A02();
            if (A01(c03370Fl)) {
                StringBuilder sb = new StringBuilder();
                sb.append("chat-settings-store/save-chat-settings deleting row for id:");
                sb.append(C003101m.A0A(c03370Fl.A0C));
                Log.i(sb.toString());
                A02.A02.A01("settings", "jid = ?", new String[]{c03370Fl.A0C});
                if (C03480Fw.A00) {
                    this.A01.A0E(c03370Fl.A0C);
                }
            } else {
                C0CE c0ce = A02.A02;
                if (c0ce.A00("settings", contentValues, "jid = ?", new String[]{c03370Fl.A0C}) == 0) {
                    contentValues.put("jid", c03370Fl.A0C);
                    c0ce.A02("settings", contentValues);
                }
                if (C03480Fw.A00) {
                    String str = c03370Fl.A0C;
                    if (!"individual_chat_defaults".equals(str) && !"group_chat_defaults".equals(str) && !c03370Fl.A0H) {
                        C003101m.A0A(str);
                        this.A01.A0E(c03370Fl.A0C);
                    } else {
                        C03390Fn c03390Fn = this.A01;
                        c03390Fn.A0F(str, c03390Fn.A08(str), c03370Fl.A05(), c03370Fl.A08(), Uri.parse(c03370Fl.A07()), c03370Fl.A0B(), c03370Fl.A0H);
                    }
                }
            }
            this.A0W.remove(c03370Fl.A0C);
            A02.close();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/save", e);
            A0H();
            throw e;
        }
    }

    public final void A0K(String str, String str2) {
        C03370Fl A08 = A08(str);
        if (TextUtils.equals(str2, A08.A08)) {
            return;
        }
        A08.A08 = str2;
        A0J(A08);
    }

    public final void A0L(String str, String str2) {
        C03370Fl A08 = A08(str);
        if (TextUtils.equals(str2, A08.A09)) {
            return;
        }
        A08.A09 = str2;
        A0J(A08);
    }

    public final void A0M(String str, String str2) {
        C03370Fl A08 = A08(str);
        if (TextUtils.equals(str2, A08.A0A)) {
            return;
        }
        A08.A0A = str2;
        A0J(A08);
    }

    public final void A0N(String str, String str2) {
        C03370Fl A08 = A08(str);
        if (TextUtils.equals(str2, A08.A0B)) {
            return;
        }
        A08.A0B = str2;
        A0J(A08);
    }

    public boolean A0O() {
        int i = A04().A00;
        return i == 0 || i == 2;
    }

    public boolean A0P(AbstractC005302j abstractC005302j) {
        boolean z;
        NotificationChannel A04;
        C03370Fl A07 = A07(abstractC005302j);
        if (!C03480Fw.A00 || !A07.A0H || (A04 = this.A01.A04(abstractC005302j.getRawString())) == null || A04.getImportance() >= 3) {
            z = false;
        } else {
            Log.i("chat-settings-store//cancelMute unmuting channel");
            C03390Fn c03390Fn = this.A01;
            String rawString = abstractC005302j.getRawString();
            int A00 = C03390Fn.A00(A07.A0B());
            synchronized (c03390Fn) {
                C000500h c000500h = c03390Fn.A0F;
                int i = c000500h.A00.getInt("num_notification_channels_created", 0) + 1;
                StringBuilder sb = new StringBuilder();
                sb.append(rawString);
                sb.append("_");
                sb.append(String.valueOf(i));
                String obj = sb.toString();
                NotificationChannel notificationChannel = new NotificationChannel(obj, c03390Fn.A08(rawString), A00);
                notificationChannel.setGroup("channel_group_chats");
                notificationChannel.enableLights(A04.shouldShowLights());
                notificationChannel.setLightColor(A04.getLightColor());
                notificationChannel.enableVibration(A04.shouldVibrate());
                notificationChannel.setVibrationPattern(A04.getVibrationPattern());
                notificationChannel.setSound(A04.getSound(), A04.getAudioAttributes());
                notificationChannel.setLockscreenVisibility(A04.getLockscreenVisibility());
                notificationChannel.setShowBadge(A04.canShowBadge());
                notificationChannel.setBypassDnd(A04.canBypassDnd());
                C03490Fx c03490Fx = C03390Fn.A0N;
                c03490Fx.A03(rawString, A04.getId());
                C03500Fy.A03(c03390Fn.A05(), A04.getId());
                C03500Fy.A02(c03390Fn.A05(), notificationChannel);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("chat-settings-store/unMuteChannelBySettingsId creating new channel:");
                sb2.append(notificationChannel);
                Log.i(sb2.toString());
                c03490Fx.A02(rawString, obj);
                c000500h.A0D().putInt("num_notification_channels_created", i).apply();
            }
            z = true;
        }
        boolean A0R = A0R(abstractC005302j, 0L, A07.A0F);
        StringBuilder sb3 = new StringBuilder("chat-settings-store//cancelMute for jid:");
        sb3.append(abstractC005302j);
        sb3.append(" channelChanged:");
        sb3.append(z);
        sb3.append(" dbchanged:");
        C000200d.A1V(sb3, A0R);
        return z || A0R;
    }

    public boolean A0Q(AbstractC005302j abstractC005302j) {
        return A07(abstractC005302j).A09();
    }

    public boolean A0R(final AbstractC005302j abstractC005302j, long j, boolean z) {
        C03370Fl A07 = A07(abstractC005302j);
        if (j == A07.A02 && z == A07.A0F) {
            return false;
        }
        try {
            C0CD A02 = A09().A02();
            A07.A02 = j;
            if (A01(A07)) {
                A02.A02.A01("settings", "jid = ?", new String[]{abstractC005302j.getRawString()});
                this.A0W.remove(abstractC005302j.getRawString());
            } else {
                A07.A0F = z;
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("mute_end", Long.valueOf(j));
                contentValues.put("muted_notifications", Boolean.valueOf(z));
                C0CE c0ce = A02.A02;
                if (c0ce.A00("settings", contentValues, "jid = ?", new String[]{abstractC005302j.getRawString()}) == 0) {
                    contentValues.put("jid", abstractC005302j.getRawString());
                    c0ce.A02("settings", contentValues);
                }
            }
            A02.close();
            this.A03.A02.post(new Runnable() { // from class: X.1QM
                {
                    C0CB.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0CB c0cb = C0CB.this;
                    c0cb.A0L.A05(abstractC005302j);
                }
            });
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/setmute", e);
            A0H();
            throw e;
        }
    }

    public boolean A0S(String str) {
        int i = Build.VERSION.SDK_INT;
        return i < 30 && (i < 28 || !"xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) && AnonymousClass024.A0e(this.A0D, this.A0G, Uri.parse(str), true);
    }

    public final boolean A0T(String str) {
        if (C03480Fw.A00) {
            C0CD A02 = A09().A02();
            try {
                C03490Fx c03490Fx = C03390Fn.A0N;
                String A00 = c03490Fx.A00(str);
                if (A00 != null) {
                    NotificationManager notificationManager = (NotificationManager) this.A0F.A00.getSystemService("notification");
                    if (notificationManager != null) {
                        if (this.A01.A0G(A02, C03500Fy.A00(notificationManager, A00))) {
                            this.A0W.remove(c03490Fx.A01(A00));
                            A02.close();
                            return true;
                        }
                    } else {
                        throw null;
                    }
                }
                A02.close();
                return false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A02.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
        return false;
    }
}
