package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.06N */
/* loaded from: classes.dex */
public class C06N extends AnonymousClass061 {
    public static final String[] A00 = {"wa_biz_profiles._id", "wa_biz_profiles.jid", "websites", "email", "business_description", "address", "tag", "latitude", "longitude", "vertical", "has_catalog", "address_postal_code", "address_city_id", "address_city_name", "commerce_experience", "shop_url", "cart_enabled"};

    public C06N(AnonymousClass062 anonymousClass062) {
        super(anonymousClass062);
    }

    public C05210Nt A0D(UserJid userJid) {
        int i;
        UserJid nullable;
        Double valueOf;
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot get business profile details by null jid");
            return null;
        }
        String A07 = C003101m.A07(userJid);
        C0CD A0A = A0A();
        try {
            C03790Hb A01 = A0A.A01();
            Cursor A05 = AnonymousClass061.A05(A0A, "wa_biz_profiles LEFT JOIN wa_biz_profiles_websites ON (wa_biz_profiles._id = wa_biz_profiles_websites.wa_biz_profile_id)", A00, "wa_biz_profiles.jid = ?", new String[]{A07}, "wa_biz_profiles_websites._id ASC", "CONTACT_BIZ_PROFILES");
            try {
                Cursor A052 = AnonymousClass061.A05(A0A, "wa_biz_profiles INNER JOIN wa_biz_profiles_hours ON (wa_biz_profiles._id = wa_biz_profiles_hours.wa_biz_profile_id)", C05210Nt.A0E, "wa_biz_profiles.jid = ?", new String[]{A07}, null, "CONTACT_BIZ_PROFILES_HOURS");
                Cursor A053 = AnonymousClass061.A05(A0A, "wa_biz_profiles LEFT JOIN wa_biz_profiles_categories ON (wa_biz_profiles._id = wa_biz_profiles_categories.wa_biz_profile_id)", C05210Nt.A0D, "wa_biz_profiles.jid = ?", new String[]{A07}, "wa_biz_profiles_categories._id ASC", "CONTACT_BIZ_PROFILES_CATEGORIES");
                A01.A00();
                if (A05 == null || A05.getCount() == 0) {
                    if (A053 != null) {
                        A053.close();
                    }
                    if (A052 != null) {
                        A052.close();
                    }
                    if (A05 != null) {
                        A05.close();
                    }
                    A01.close();
                    A0A.close();
                    return null;
                }
                Integer num = null;
                C05210Nt c05210Nt = null;
                while (true) {
                    i = 2;
                    if (!A05.moveToNext()) {
                        break;
                    }
                    if (A05.isFirst() && (nullable = UserJid.getNullable(A05.getString(1))) != null) {
                        c05210Nt = new C05210Nt(nullable);
                        c05210Nt.A04 = A05.getString(3);
                        c05210Nt.A03 = A05.getString(4);
                        c05210Nt.A06 = A05.getString(6);
                        String string = A05.getString(5);
                        String string2 = A05.getString(11);
                        String string3 = A05.getString(12);
                        String string4 = A05.getString(13);
                        if (A05.isNull(7)) {
                            valueOf = null;
                        } else {
                            valueOf = Double.valueOf(A05.getDouble(7));
                        }
                        c05210Nt.A01 = new C09510eD(string, string2, new C09500eC(string3, string4, valueOf, A05.isNull(8) ? null : Double.valueOf(A05.getDouble(8))));
                        c05210Nt.A07 = A05.isNull(9) ? null : A05.getString(9);
                        c05210Nt.A09 = A05.getInt(10) == 1;
                        c05210Nt.A02 = A05.getString(14);
                        c05210Nt.A05 = A05.getString(15);
                        c05210Nt.A08 = A05.getInt(16) == 1;
                    } else if (c05210Nt != null) {
                    }
                    c05210Nt.A0C.add(A05.getString(2));
                }
                if (c05210Nt != null) {
                    if (A052 != null && A052.getCount() > 0) {
                        ArrayList arrayList = new ArrayList(A052.getCount());
                        String str = null;
                        String str2 = null;
                        while (A052.moveToNext()) {
                            if (A052.isFirst()) {
                                str = A052.getString(0);
                                str2 = A052.getString(1);
                            }
                            int i2 = A052.getInt(i);
                            int i3 = A052.getInt(3);
                            Integer valueOf2 = A052.isNull(4) ? num : Integer.valueOf(A052.getInt(4));
                            if (!A052.isNull(5)) {
                                num = Integer.valueOf(A052.getInt(5));
                            }
                            arrayList.add(new C09490eB(i2, i3, valueOf2, num));
                            num = null;
                            i = 2;
                        }
                        if (arrayList.size() > 0) {
                            c05210Nt.A00 = new C09480eA(str, str2, arrayList);
                        }
                    }
                    if (A053 != null && A053.getCount() > 0) {
                        List list = c05210Nt.A0B;
                        list.clear();
                        while (A053.moveToNext()) {
                            String string5 = A053.getString(0);
                            String string6 = A053.getString(1);
                            if (string5 != null && string6 != null) {
                                list.add(new C1NH(string5, string6));
                            }
                        }
                    }
                }
                if (A053 != null) {
                    A053.close();
                }
                if (A052 != null) {
                    A052.close();
                }
                A05.close();
                A01.close();
                A0A.close();
                return c05210Nt;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A0A.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A0E(UserJid userJid) {
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot delete business profile details by null jid");
            return;
        }
        C0CD A0B = A0B();
        try {
            AnonymousClass061.A09(A0B, "wa_biz_profiles", "wa_biz_profiles.jid = ?", new String[]{userJid.getRawString()});
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A0B.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0040 A[Catch: all -> 0x01a6, TryCatch #4 {all -> 0x01ad, blocks: (B:89:0x0009, B:130:0x019f, B:90:0x000d, B:91:0x0015, B:93:0x001b, B:101:0x0040, B:103:0x0045, B:105:0x00ba, B:106:0x00ca, B:109:0x00f3, B:110:0x00f7, B:112:0x00fd, B:113:0x0118, B:115:0x0120, B:116:0x0124, B:118:0x012a, B:120:0x0132, B:121:0x0150, B:123:0x0154, B:124:0x015a, B:126:0x0160, B:128:0x019b, B:98:0x0038, B:129:0x019c), top: B:147:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x019a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06N.A0F(java.util.Map):void");
    }
}
