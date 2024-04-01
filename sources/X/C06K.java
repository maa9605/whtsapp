package X;

import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.06K */
/* loaded from: classes.dex */
public class C06K {
    public static final long A09 = TimeUnit.HOURS.toMillis(24);
    public static volatile C06K A0A;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C02L A01;
    public final C06M A02;
    public final C06L A03;
    public final C06N A04;
    public final AnonymousClass012 A05;
    public final C000500h A06;
    public final C05Y A07;
    public final InterfaceC002901k A08;

    public C06K(AnonymousClass012 anonymousClass012, C02L c02l, InterfaceC002901k interfaceC002901k, C05Y c05y, AnonymousClass062 anonymousClass062, C000500h c000500h, C06L c06l, C06M c06m) {
        this.A05 = anonymousClass012;
        this.A01 = c02l;
        this.A08 = interfaceC002901k;
        this.A07 = c05y;
        this.A06 = c000500h;
        this.A03 = c06l;
        this.A02 = c06m;
        this.A04 = new C06N(anonymousClass062);
    }

    public static C06K A00() {
        if (A0A == null) {
            synchronized (C06K.class) {
                if (A0A == null) {
                    A0A = new C06K(AnonymousClass012.A00(), C02L.A00(), C002801j.A00(), C05Y.A01(), AnonymousClass062.A00(), C000500h.A00(), C06L.A00(), C06M.A00);
                }
            }
        }
        return A0A;
    }

    public C05220Nu A01(UserJid userJid, String str) {
        return new C05220Nu(this.A03.A01(), userJid, str, this.A07, this, this.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0043, code lost:
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A02(com.whatsapp.jid.UserJid r12) {
        /*
            r11 = this;
            X.06N r0 = r11.A04
            r9 = 0
            if (r0 == 0) goto L53
            java.lang.String r3 = "business_description"
            if (r12 != 0) goto Lf
            java.lang.String r0 = "contact-mgr-db/cannot get business description details by null jid"
            com.whatsapp.util.Log.w(r0)
            return r9
        Lf:
            java.lang.String r2 = X.C003101m.A07(r12)
            X.0CD r4 = r0.A0A()
            java.lang.String r5 = "wa_biz_profiles LEFT JOIN wa_biz_profiles_websites ON (wa_biz_profiles._id = wa_biz_profiles_websites.wa_biz_profile_id)"
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L4c
            r0 = 0
            r6[r0] = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "wa_biz_profiles.jid = ?"
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L4c
            r8[r0] = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.String r10 = "CONTACT_BIZ_PROFILES"
            android.database.Cursor r1 = X.AnonymousClass061.A05(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L43
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L43
            int r0 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r9 = r1.getString(r0)     // Catch: java.lang.Throwable -> L3c
            goto L45
        L3c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L42
        L42:
            throw r0     // Catch: java.lang.Throwable -> L4c
        L43:
            if (r1 == 0) goto L48
        L45:
            r1.close()     // Catch: java.lang.Throwable -> L4c
        L48:
            r4.close()
            return r9
        L4c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L52
        L52:
            throw r0
        L53:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06K.A02(com.whatsapp.jid.UserJid):java.lang.String");
    }

    public Map A03() {
        C06N c06n = this.A04;
        if (c06n != null) {
            HashMap hashMap = new HashMap();
            C0CD A0A2 = c06n.A0A();
            try {
                Cursor A05 = AnonymousClass061.A05(A0A2, "wa_biz_profiles LEFT JOIN wa_biz_profiles_websites ON (wa_biz_profiles._id = wa_biz_profiles_websites.wa_biz_profile_id)", new String[]{"jid", "tag"}, null, null, null, "CONTACT_BIZ_PROFILES");
                if (A05 != null) {
                    while (A05.moveToNext()) {
                        UserJid nullable = UserJid.getNullable(A05.getString(0));
                        if (nullable != null) {
                            hashMap.put(nullable, A05.getString(1));
                        }
                    }
                    A05.close();
                }
                return hashMap;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A0A2.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        throw null;
    }

    public void A04(UserJid userJid, C1N6 c1n6) {
        this.A08.ARy(new C36331kd(this, userJid, c1n6), new Void[0]);
    }

    public void A05(UserJid userJid, C05210Nt c05210Nt) {
        if (this.A01.A0A(userJid)) {
            C000200d.A0h(this.A06, "smb_last_my_business_profile_sync_time", this.A05.A05());
        }
        C06N c06n = this.A04;
        if (c06n != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(userJid, c05210Nt);
            c06n.A0F(hashMap);
            return;
        }
        throw null;
    }
}
