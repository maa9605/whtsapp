package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.060 */
/* loaded from: classes.dex */
public class AnonymousClass060 extends AnonymousClass061 {
    public static volatile AnonymousClass060 A0B;
    public Integer A00;
    public final C02L A01;
    public final AnonymousClass065 A02;
    public final C02E A03;
    public final AnonymousClass012 A04;
    public final C002301c A05;
    public final Object A06;
    public static final String[] A08 = {"count(wa_contacts._id) AS _count"};
    public static final String[] A07 = {"wa_contacts._id", "wa_contacts.jid", "is_whatsapp_user", "status", "number", "raw_contact_id", "display_name", "phone_type", "phone_label", "unseen_msg_count", "photo_ts", "thumb_ts", "photo_id_timestamp", "given_name", "family_name", "wa_name", "sort_name", "status_timestamp", "nickname", "company", "title", "status_autodownload_disabled", "keep_timestamp", "is_spam_reported", "is_sidelist_synced", "is_business_synced", "verified_name", "expires", "verified_level", "description", "identity_unconfirmed_since", "description_id_string", "description_time", "description_setter_jid", "restrict_mode", "announcement_group", "no_frequently_forwarded", "ephemeral_duration", "creator_jid", "in_app_support"};
    public static final String[] A0A = {"_id", "jid", "serial", "issuer", "expires", "verified_name", "industry", "city", "country", "verified_level", "cert_blob", "identity_unconfirmed_since", "host_storage", "actual_actors", "privacy_mode_ts"};
    public static final String[] A09 = {"wa_contacts.jid", "number"};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass060(AnonymousClass012 anonymousClass012, final C02L c02l, C02E c02e, C002301c c002301c, AnonymousClass062 anonymousClass062) {
        super(anonymousClass062);
        AnonymousClass065 anonymousClass065 = new AnonymousClass065();
        this.A06 = new Object();
        this.A04 = anonymousClass012;
        this.A01 = c02l;
        this.A03 = c02e;
        this.A05 = c002301c;
        this.A02 = anonymousClass065;
        anonymousClass065.A00(new AnonymousClass068() { // from class: X.067
            {
                AnonymousClass060.this = this;
            }

            @Override // X.AnonymousClass068
            public void A00(C06C c06c) {
                AnonymousClass060 anonymousClass060 = AnonymousClass060.this;
                synchronized (anonymousClass060.A06) {
                    Integer num = anonymousClass060.A00;
                    if (num != null) {
                        anonymousClass060.A00 = Integer.valueOf(num.intValue() - 1);
                    }
                }
            }

            @Override // X.AnonymousClass068
            public void A01(Collection collection) {
                AnonymousClass060 anonymousClass060 = AnonymousClass060.this;
                synchronized (anonymousClass060.A06) {
                    int A04 = A04(collection);
                    Integer num = anonymousClass060.A00;
                    if (num == null) {
                        anonymousClass060.A00 = Integer.valueOf(A04);
                    } else {
                        anonymousClass060.A00 = Integer.valueOf(num.intValue() + A04);
                    }
                }
            }

            @Override // X.AnonymousClass068
            public void A02(Collection collection) {
                AnonymousClass060 anonymousClass060 = AnonymousClass060.this;
                synchronized (anonymousClass060.A06) {
                    int A04 = A04(collection);
                    Integer num = anonymousClass060.A00;
                    if (num != null) {
                        anonymousClass060.A00 = Integer.valueOf(num.intValue() - A04);
                    }
                }
            }

            public final int A04(Collection collection) {
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C06C c06c = (C06C) it.next();
                    if (c06c != null && c06c.A0X && c06c.A08 != null && !c02l.A0A(c06c.A02())) {
                        i++;
                    }
                }
                return i;
            }
        });
    }

    public static AnonymousClass060 A00() {
        if (A0B == null) {
            synchronized (AnonymousClass060.class) {
                if (A0B == null) {
                    A0B = new AnonymousClass060(AnonymousClass012.A00(), C02L.A00(), C02E.A00(), C002301c.A00(), AnonymousClass062.A00());
                }
            }
        }
        return A0B;
    }

    public static List A01(Set set, Cursor cursor) {
        HashSet hashSet = new HashSet(set);
        while (cursor.moveToNext()) {
            AbstractC005302j A02 = AbstractC005302j.A02(cursor.getString(0));
            if (A02 != null) {
                hashSet.remove(A02);
            }
        }
        return new ArrayList(hashSet);
    }

    public static boolean A02(C06C c06c) {
        C04460Kg c04460Kg;
        return (c06c.A02() == null || (c04460Kg = c06c.A08) == null || TextUtils.isEmpty(c04460Kg.A01)) ? false : true;
    }

    @Override // X.AnonymousClass061
    public void A0C() {
        synchronized (this.A06) {
            this.A00 = 0;
        }
    }

    public Cursor A0D() {
        C0CD A0A2 = A0A();
        try {
            return AnonymousClass061.A05(A0A2, "wa_contact_storage_usage", new String[]{"jid", "conversation_size", "conversation_message_count"}, "jid != ?", new String[]{C04580Kz.A00.getRawString()}, "conversation_size DESC, conversation_message_count DESC", "CONTACT_STORAGE_USAGES");
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

    public C018108l A0E(UserJid userJid) {
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot get verified name details by null jid");
            return null;
        }
        C0CD A0A2 = A0A();
        try {
            Cursor A05 = AnonymousClass061.A05(A0A2, "wa_vnames", A0A, "jid = ?", new String[]{userJid.getRawString()}, null, "CONTACT_VNAMES");
            C018108l A0O = A05.moveToNext() ? C002701i.A0O(A05) : null;
            A05.close();
            return A0O;
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

    public ArrayList A0F() {
        C0HC A06 = AnonymousClass061.A06();
        ArrayList arrayList = new ArrayList();
        C0CD A0A2 = A0A();
        try {
            Cursor A05 = AnonymousClass061.A05(A0A2, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", A07, "wa_contacts.jid LIKE '%@g.us' OR wa_contacts.jid LIKE '%@temp'", null, null, "CONTACTS");
            if (A05 == null) {
                Log.e("contact-mgr-db/unable to get all group chats");
                A0A2.close();
                return arrayList;
            }
            while (A05.moveToNext()) {
                C06C A04 = C002501g.A04(A05);
                if (A04.A09 != null) {
                    arrayList.add(A04);
                }
            }
            A05.close();
            A0A2.close();
            arrayList.size();
            A06.A00();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A0A2.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public ArrayList A0G(AbstractC005302j abstractC005302j) {
        C0HC A06 = AnonymousClass061.A06();
        ArrayList arrayList = new ArrayList();
        C0CD A0A2 = A0A();
        try {
            Cursor A05 = AnonymousClass061.A05(A0A2, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", A07, "wa_contacts.jid = ?", new String[]{abstractC005302j.getRawString()}, null, "CONTACTS");
            if (A05 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("contact-mgr-db/unable to get contacts by jid ");
                sb.append(abstractC005302j);
                C000700j.A08(false, sb.toString());
                A0A2.close();
                return arrayList;
            }
            while (A05.moveToNext()) {
                C06C A04 = C002501g.A04(A05);
                if (A04.A09 != null) {
                    arrayList.add(A04);
                }
            }
            A05.close();
            A0A2.close();
            A0U(arrayList);
            arrayList.size();
            A06.A00();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A0A2.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final Collection A0H(boolean z) {
        String A0H = C000200d.A0H("is_whatsapp_user = 1 AND wa_contacts.jid != ? AND wa_contacts.jid IS NOT NULL AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid != ? AND wa_contacts.jid != ? AND (raw_contact_id IS NULL OR raw_contact_id<0) AND (", z ? "is_sidelist_synced= 1)" : "is_sidelist_synced= 0 OR is_sidelist_synced IS NULL)");
        ArrayList arrayList = new ArrayList();
        C02L c02l = this.A01;
        c02l.A05();
        String A072 = C003101m.A07(c02l.A03);
        String[] strArr = new String[6];
        int i = 0;
        strArr[0] = "broadcast";
        strArr[1] = "%@broadcast";
        strArr[2] = "%@g.us";
        strArr[3] = "%@temp";
        if (A072 == null) {
            A072 = C04260Jm.A00.getRawString();
        }
        strArr[4] = A072;
        strArr[5] = C06D.A00.getRawString();
        C0CD A0A2 = A0A();
        try {
            Cursor A05 = AnonymousClass061.A05(A0A2, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", A07, A0H, strArr, null, "CONTACTS");
            if (A05 == null) {
                C000700j.A08(false, "contact-mgr-db/unable to get sidelist sync pending list");
                List emptyList = Collections.emptyList();
                A0A2.close();
                return emptyList;
            }
            try {
                i = A05.getCount();
                while (A05.moveToNext()) {
                    C06C A04 = C002501g.A04(A05);
                    if (A04.A09 != null) {
                        arrayList.add(A04);
                    }
                }
            } catch (IllegalStateException e) {
                if (e.getMessage() != null && e.getMessage().contains("Make sure the Cursor is initialized correctly before accessing data from it")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("contactmanagerdb/getSideListContacts/illegal-state-exception/cursor count=");
                    sb.append(i);
                    sb.append("; ");
                    sb.append("partial list size=");
                    sb.append(arrayList.size());
                    String obj = sb.toString();
                    if (obj != null) {
                        Log.e(obj, e);
                    } else {
                        throw null;
                    }
                } else {
                    throw e;
                }
            }
            A05.close();
            A0A2.close();
            return arrayList;
        } finally {
        }
    }

    public final void A0I(ContentValues contentValues, Jid jid) {
        try {
            C0CD A0B2 = A0B();
            AnonymousClass061.A04(A0B2, "wa_contacts", contentValues, "jid = ?", new String[]{C003101m.A07(jid)});
            A0B2.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("contact-mgr-db/unable to update contact by jid ");
            sb.append(jid);
            String obj = sb.toString();
            if (obj != null) {
                Log.e(obj, e);
                return;
            }
            throw null;
        }
    }

    public final void A0J(C0CD c0cd, C03790Hb c03790Hb, C06C c06c) {
        C000700j.A07(c03790Hb.A01());
        Jid A02 = c06c.A02();
        String A072 = C003101m.A07(A02);
        AnonymousClass061.A09(c0cd, "wa_contacts", "_id = ?", new String[]{String.valueOf(c06c.A01())});
        AnonymousClass061.A09(c0cd, "wa_contact_storage_usage", "jid = ? AND NOT EXISTS (SELECT 1 FROM wa_contacts WHERE jid = ?)", new String[]{A072, A072});
        if (A02 instanceof C011005l) {
            A0K(c0cd, c03790Hb, (C011005l) A02, null);
        }
        AnonymousClass061.A09(c0cd, "wa_group_admin_settings", "jid = ?", new String[]{A072});
    }

    public final void A0K(C0CD c0cd, C03790Hb c03790Hb, C011005l c011005l, C04410Kb c04410Kb) {
        C000700j.A07(c03790Hb.A01());
        if (c011005l == null) {
            return;
        }
        String A072 = C003101m.A07(c011005l);
        if (c04410Kb == null) {
            AnonymousClass061.A09(c0cd, "wa_group_descriptions", "jid = ?", new String[]{A072});
            return;
        }
        String str = c04410Kb.A02;
        if (str == null) {
            return;
        }
        AnonymousClass061.A09(c0cd, "wa_group_descriptions", "jid = ?", new String[]{A072});
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("jid", A072);
        contentValues.put("description", str);
        String str2 = c04410Kb.A03;
        if (str2 == null) {
            str2 = "";
        }
        contentValues.put("description_id_string", str2);
        contentValues.put("description_time", Long.valueOf(c04410Kb.A00));
        UserJid userJid = c04410Kb.A01;
        contentValues.put("description_setter_jid", userJid != null ? C003101m.A07(userJid) : "");
        AnonymousClass061.A03(c0cd, "wa_group_descriptions", contentValues);
    }

    public final void A0L(C03790Hb c03790Hb, UserJid userJid) {
        C000700j.A07(c03790Hb.A01());
        String A072 = C003101m.A07(userJid);
        C0CD A0B2 = A0B();
        try {
            AnonymousClass061.A09(A0B2, "wa_vnames", "jid = ?", new String[]{A072});
            AnonymousClass061.A09(A0B2, "wa_vnames_localized", "jid = ?", new String[]{A072});
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A0B2.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A0M(C27791Ou c27791Ou) {
        try {
            C0CD A0B2 = A0B();
            C03790Hb A00 = A0B2.A00();
            try {
                String rawString = c27791Ou.A01().getRawString();
                ContentValues contentValues = new ContentValues();
                contentValues.put("conversation_size", Long.valueOf(c27791Ou.A00.A0G));
                contentValues.put("conversation_message_count", Integer.valueOf(c27791Ou.A00.A06));
                if (AnonymousClass061.A04(A0B2, "wa_contact_storage_usage", contentValues, "jid = ?", new String[]{rawString}) == 0) {
                    contentValues.put("jid", rawString);
                    AnonymousClass061.A08(A0B2, "wa_contact_storage_usage", contentValues);
                }
                A00.A00();
                A0B2.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A00.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            Log.e("contact-mgr-db/unable to update batch on storage usage table", e);
        }
    }

    public void A0N(C06C c06c) {
        C0HC A06 = AnonymousClass061.A06();
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("display_name", c06c.A0F);
        contentValues.put("phone_label", c06c.A0J);
        contentValues.put("is_whatsapp_user", Boolean.valueOf(c06c.A0X));
        A0I(contentValues, c06c.A02());
        A0O(c06c, (C011005l) c06c.A03(C011005l.class));
        StringBuilder sb = new StringBuilder("updated group info for jid=");
        sb.append(c06c.A02());
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(A06.A00());
        Log.i(sb.toString());
        this.A02.A02(Collections.singleton(c06c));
    }

    public final void A0O(C06C c06c, C011005l c011005l) {
        if (c011005l == null) {
            return;
        }
        try {
            C0CD A0B2 = A0B();
            C03790Hb A00 = A0B2.A00();
            A0K(A0B2, A00, c011005l, c06c.A0B);
            boolean z = c06c.A0Z;
            boolean z2 = c06c.A0Q;
            boolean z3 = c06c.A0Y;
            int i = c06c.A00;
            UserJid userJid = c06c.A0A;
            boolean z4 = c06c.A0S;
            ContentValues contentValues = new ContentValues();
            contentValues.put("jid", C003101m.A07(c011005l));
            contentValues.put("restrict_mode", Boolean.valueOf(z));
            contentValues.put("announcement_group", Boolean.valueOf(z2));
            contentValues.put("no_frequently_forwarded", Boolean.valueOf(z3));
            contentValues.put("ephemeral_duration", Integer.valueOf(i));
            contentValues.put("creator_jid", C003101m.A07(userJid));
            contentValues.put("in_app_support", Boolean.valueOf(z4));
            AnonymousClass061.A08(A0B2, "wa_group_admin_settings", contentValues);
            A00.A00();
            A00.close();
            A0B2.close();
        } catch (IllegalArgumentException e) {
            Log.e("contact-mgr-db/unable to update group settings ", e);
        }
    }

    public final void A0P(C06C c06c, Locale locale) {
        if (c06c == null || !c06c.A0E()) {
            return;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        Jid A02 = c06c.A02();
        C0CD A0A2 = A0A();
        try {
            Cursor A05 = AnonymousClass061.A05(A0A2, "wa_vnames_localized", new String[]{"lc", "verified_name"}, "jid = ? AND lg = ?", new String[]{C003101m.A07(A02), language}, null, "CONTACT_VNAMES_LOCALIZED");
            if (A05 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("contact-mgr-db/unable to get localized vname by jid ");
                sb.append(A02);
                C000700j.A08(false, sb.toString());
                A0A2.close();
                return;
            }
            String str = null;
            while (true) {
                if (!A05.moveToNext()) {
                    break;
                }
                String string = A05.getString(0);
                String string2 = A05.getString(1);
                if (TextUtils.isEmpty(string)) {
                    str = string2;
                } else if (string.equals(country)) {
                    str = string2;
                    break;
                }
            }
            if (str != null) {
                c06c.A08(str);
            }
            c06c.A0P = locale;
            A05.close();
            A0A2.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A0A2.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A0Q(UserJid userJid, int i) {
        ArrayList arrayList;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("verified_level", Integer.valueOf(i));
        try {
            C0CD A0B2 = A0B();
            arrayList = AnonymousClass061.A04(A0B2, "wa_vnames", contentValues, "jid = ?", new String[]{C003101m.A07(userJid)}) > 0 ? A0G(userJid) : null;
            try {
                A0B2.close();
            } catch (IllegalArgumentException e) {
                e = e;
                StringBuilder sb = new StringBuilder("wadbhelper/update-verified-level/unable to update verified level");
                sb.append(userJid);
                sb.append(", ");
                sb.append(i);
                String obj = sb.toString();
                if (obj != null) {
                    Log.e(obj, e);
                    if (arrayList == null) {
                    }
                    return;
                }
                throw null;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            arrayList = null;
        }
        if (arrayList == null && !arrayList.isEmpty()) {
            this.A02.A02(arrayList);
        }
    }

    public void A0R(UserJid userJid, long j, String str) {
        C0HC A06 = AnonymousClass061.A06();
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("status", str);
        contentValues.put("status_timestamp", Long.valueOf(j));
        try {
            C0CD A0B2 = A0B();
            AnonymousClass061.A04(A0B2, "wa_contacts", contentValues, "jid = ?", new String[]{userJid.getRawString()});
            A0B2.close();
        } catch (IllegalArgumentException e) {
            StringBuilder A0U = C000200d.A0U("contact-mgr-db/unable to update contact status ", userJid, ", statusNull=");
            A0U.append(str == null);
            String obj = A0U.toString();
            if (obj != null) {
                Log.e(obj, e);
            } else {
                throw null;
            }
        }
        A06.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x001f, code lost:
        if (r25 == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0S(com.whatsapp.jid.UserJid r15, long r16, java.lang.String r18, java.lang.String r19, java.util.List r20, int r21, X.C05200Ns r22, byte[] r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass060.A0S(com.whatsapp.jid.UserJid, long, java.lang.String, java.lang.String, java.util.List, int, X.0Ns, byte[], boolean, boolean):void");
    }

    public void A0T(List list) {
        ContentValues contentValues = new ContentValues();
        try {
            C0CD A0B2 = A0B();
            try {
                C03790Hb A00 = A0B2.A00();
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                            if (abstractC005302j != null) {
                                contentValues.put("jid", abstractC005302j.getRawString());
                                contentValues.put("conversation_size", (Integer) 0);
                                contentValues.put("conversation_message_count", (Integer) 0);
                                AnonymousClass061.A08(A0B2, "wa_contact_storage_usage", contentValues);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    A00.A00();
                    try {
                        A00.close();
                        try {
                            A0B2.close();
                        } catch (IllegalArgumentException e) {
                            e = e;
                            Log.e("contact-mgr-db/unable to insert batch to storage usage table", e);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
        }
    }

    public final void A0U(List list) {
        Locale A0I = this.A05.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0P((C06C) it.next(), A0I);
        }
    }

    public final void A0V(List list, int i, boolean z, boolean z2) {
        C0CD A0B2;
        C03790Hb A01;
        Cursor A05;
        boolean z3;
        C0HC A06 = AnonymousClass061.A06();
        StringBuilder A0P = C000200d.A0P("is_whatsapp_user");
        A0P.append(z ? " = 0" : " = 1");
        C02L c02l = this.A01;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            C000200d.A1T(A0P, " AND ", "wa_contacts.jid", " != ?");
        }
        if (i == 1 || i == 2) {
            C000200d.A1U(A0P, " AND (", "raw_contact_id", " > 0 OR ", "raw_contact_id");
            A0P.append(" = ");
            A0P.append(-2L);
            A0P.append(')');
        }
        HashMap hashMap = new HashMap();
        String[] strArr = userJid == null ? new String[0] : new String[]{userJid.getRawString()};
        ArrayList arrayList = new ArrayList();
        try {
            A0B2 = A0B();
            try {
                try {
                    A01 = z2 ? A0B2.A01() : A0B2.A00();
                    try {
                        try {
                            A05 = AnonymousClass061.A05(A0B2, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", A07, A0P.toString(), strArr, "display_name, wa_contacts.jid, phone_type ASC", "CONTACTS");
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } catch (IllegalArgumentException e) {
                    e = e;
                    Log.e("contact-mgr-db/unable to apply contact picker list de-dupe batch ", e);
                    list.size();
                    A06.A00();
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
        }
        if (A05 == null) {
            C000700j.A08(false, "contact-mgr-db/get-picker-list/unable to get contact picker list");
            A01.close();
            A0B2.close();
            return;
        }
        while (A05.moveToNext()) {
            C06C A04 = C002501g.A04(A05);
            Jid jid = A04.A09;
            if (jid != null && !C003101m.A0Z(jid) && !C003101m.A0a(jid) && jid.getType() != 11 && (i != 3 || !C003101m.A0Q(jid))) {
                if (hashMap.containsKey(jid)) {
                    Object obj = hashMap.get(jid);
                    if (obj != null) {
                        List<C06C> list2 = (List) obj;
                        ArrayList arrayList2 = new ArrayList();
                        boolean z4 = true;
                        if (A04.A08 == null) {
                            if (!list2.isEmpty()) {
                                C06C c06c = (C06C) list2.get(0);
                                if (c06c.A08 == null) {
                                    if (c06c.A05 >= A04.A05) {
                                        arrayList2.add(A04);
                                    } else {
                                        list2.remove(c06c);
                                        arrayList2.add(c06c);
                                        list2.add(A04);
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("contact-mgr-db/process-contact/removing duplicate contact with null key ");
                                    sb.append(A04);
                                    Log.i(sb.toString());
                                    arrayList2.add(A04);
                                }
                                z3 = true;
                            } else {
                                throw new IllegalStateException("same jid contacts must not be empty");
                            }
                        } else {
                            z3 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z3) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C06C c06c2 = (C06C) it.next();
                                    if (c06c2.A08 == null) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("contact-mgr-db/process-contact/removing duplicate contact with null key ");
                                        sb2.append(c06c2);
                                        Log.i(sb2.toString());
                                        arrayList3.add(c06c2);
                                        arrayList2.add(c06c2);
                                        list2.add(A04);
                                        z3 = true;
                                        break;
                                    }
                                } else {
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (A04.A08.equals(((C06C) it2.next()).A08)) {
                                                StringBuilder sb3 = new StringBuilder("contact-mgr-db/process-contact/removing duplicate contact with matching key ");
                                                sb3.append(A04);
                                                Log.i(sb3.toString());
                                                arrayList2.add(A04);
                                                z3 = true;
                                                break;
                                            }
                                        } else {
                                            for (C06C c06c3 : list2) {
                                                if (A04.A08.A00 != -2) {
                                                    C04460Kg c04460Kg = c06c3.A08;
                                                    if (c04460Kg == null) {
                                                        throw null;
                                                    }
                                                    if (c04460Kg.A00 == -2) {
                                                        StringBuilder sb4 = new StringBuilder("contact-mgr-db/process-contact/removing sim card duplicate contact ");
                                                        sb4.append(c06c3);
                                                        Log.i(sb4.toString());
                                                        arrayList3.add(c06c3);
                                                        arrayList2.add(c06c3);
                                                        z3 = true;
                                                    }
                                                }
                                            }
                                            if (z3) {
                                                list2.add(A04);
                                            } else {
                                                for (C06C c06c4 : list2) {
                                                    String str = c06c4.A0F;
                                                    if ((str == null && A04.A0F != null) || (TextUtils.isEmpty(str) && !TextUtils.isEmpty(A04.A0F))) {
                                                        StringBuilder sb5 = new StringBuilder("contact-mgr-db/process-contact/deduping null/empty display name contact ");
                                                        sb5.append(c06c4);
                                                        Log.i(sb5.toString());
                                                        arrayList3.add(c06c4);
                                                        z3 = true;
                                                    }
                                                }
                                                if (z3) {
                                                    list2.add(A04);
                                                } else {
                                                    if (TextUtils.isEmpty(A04.A0F)) {
                                                        for (C06C c06c5 : list2) {
                                                            if (!TextUtils.isEmpty(c06c5.A0F)) {
                                                                Log.i("contact-mgr-db/process-contact/ignoring empty name since we have non-empty one");
                                                                z3 = true;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    for (C06C c06c6 : list2) {
                                                        String str2 = c06c6.A0F;
                                                        if (str2 != null && str2.equals(A04.A0F) && A04.A01() < c06c6.A01()) {
                                                            arrayList3.add(c06c6);
                                                            z3 = true;
                                                        }
                                                    }
                                                    if (z3) {
                                                        list2.add(A04);
                                                    } else if (A04.A0F != null) {
                                                        for (C06C c06c7 : list2) {
                                                            if (A04.A0F.equals(c06c7.A0F)) {
                                                            }
                                                        }
                                                        list2.add(A04);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z4 = z3;
                        list2.removeAll(arrayList3);
                        if (!z4) {
                            StringBuilder sb6 = new StringBuilder("existing_contacts: ");
                            for (Object obj2 : list2) {
                                sb6.append(obj2);
                                sb6.append(", ");
                            }
                            StringBuilder sb7 = new StringBuilder("contact-mgr-db/process-contact/contacts are identical, yet not (");
                            sb7.append((Object) sb6);
                            sb7.append(" and ");
                            sb7.append(A04);
                            sb7.append(')');
                            Log.w(sb7.toString());
                        }
                        arrayList.addAll(arrayList2);
                    } else {
                        throw null;
                    }
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(A04);
                    hashMap.put(jid, arrayList4);
                }
            }
        }
        A05.close();
        for (Map.Entry entry : hashMap.entrySet()) {
            list.addAll((Collection) entry.getValue());
        }
        A0U(list);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            A0J(A0B2, A01, (C06C) it3.next());
        }
        A01.A00();
        A01.close();
        A0B2.close();
        list.size();
        A06.A00();
    }
}
