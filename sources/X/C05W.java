package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.05W */
/* loaded from: classes.dex */
public class C05W {
    public static volatile C05W A0D;
    public final C02L A01;
    public final C05X A02;
    public final C06A A03;
    public final AnonymousClass060 A05;
    public final AnonymousClass008 A06;
    public final C011505r A07;
    public final C012205z A08;
    public final AnonymousClass012 A09;
    public final C02F A0A;
    public final C000500h A0B;
    public final C002301c A0C;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass069 A04 = new AnonymousClass069();

    public C05W(AnonymousClass012 anonymousClass012, C05X c05x, C02L c02l, C002301c c002301c, AnonymousClass008 anonymousClass008, C011505r c011505r, C02F c02f, C000500h c000500h, C012205z c012205z, AnonymousClass060 anonymousClass060) {
        this.A09 = anonymousClass012;
        this.A02 = c05x;
        this.A01 = c02l;
        this.A0C = c002301c;
        this.A06 = anonymousClass008;
        this.A07 = c011505r;
        this.A0A = c02f;
        this.A0B = c000500h;
        this.A08 = c012205z;
        this.A05 = anonymousClass060;
        this.A03 = new C06A(c002301c);
    }

    public static C05W A00() {
        if (A0D == null) {
            synchronized (C05W.class) {
                if (A0D == null) {
                    A0D = new C05W(AnonymousClass012.A00(), C05X.A00(), C02L.A00(), C002301c.A00(), AnonymousClass008.A01, C011505r.A00(), C02F.A00(), C000500h.A00(), C012205z.A00, AnonymousClass060.A00());
                }
            }
        }
        return A0D;
    }

    public static ArrayList A01(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C06C c06c = (C06C) it.next();
            if (c06c != null && !(c06c.A02() instanceof C08060aX) && !c06c.A0C()) {
                arrayList.add(c06c);
            }
        }
        return arrayList;
    }

    public static void A02(Collection collection, String str) {
        int size = collection.size();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/count ");
        sb.append(size);
        Log.i(sb.toString());
    }

    public int A03() {
        int i;
        AnonymousClass060 anonymousClass060 = this.A05;
        synchronized (anonymousClass060.A06) {
            if (anonymousClass060.A00 == null) {
                C02L c02l = anonymousClass060.A01;
                c02l.A05();
                UserJid userJid = c02l.A03;
                if (userJid != null) {
                    C0HC A06 = AnonymousClass061.A06();
                    String[] strArr = {userJid.getRawString()};
                    C0CD A0A = anonymousClass060.A0A();
                    Cursor A05 = AnonymousClass061.A05(A0A, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", AnonymousClass060.A08, "is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1 AND wa_contacts.jid != ?", strArr, null, "CONTACTS");
                    try {
                        if (A05 == null) {
                            C000700j.A08(false, "contact-mgr-db/unable to get individual contact count");
                            anonymousClass060.A00 = 0;
                        } else {
                            if (A05.moveToNext()) {
                                int i2 = A05.getInt(0);
                                A06.A00();
                                anonymousClass060.A00 = Integer.valueOf(i2);
                            } else {
                                Log.w("contact-mgr-db/individual contact count missing cursor");
                                anonymousClass060.A00 = null;
                            }
                            A05.close();
                        }
                        A0A.close();
                    } finally {
                    }
                }
            }
            Integer num = anonymousClass060.A00;
            i = num != null ? num.intValue() : -1;
        }
        C000200d.A0q("indivcount/count ", i);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.net.Uri A04(X.C06C r7, android.content.ContentResolver r8) {
        /*
            r6 = this;
            r5 = 0
            if (r7 != 0) goto L4
            return r5
        L4:
            X.02F r1 = r6.A0A
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            int r0 = r1.A02(r0)
            if (r0 == 0) goto Lf
            return r5
        Lf:
            X.0Kg r0 = r7.A08
            if (r0 == 0) goto L2a
            long r1 = r0.A00
            r3 = -2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L2a
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L2a
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r1)
        L27:
            if (r0 != 0) goto L2c
            return r5
        L2a:
            r0 = r5
            goto L27
        L2c:
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.getContactLookupUri(r8, r0)     // Catch: java.lang.NullPointerException -> L31 java.lang.SecurityException -> L38
            return r0
        L31:
            r1 = move-exception
            java.lang.String r0 = "contactmanager/NPE"
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        L38:
            r2 = move-exception
            java.lang.String r1 = "contactmanager/permission problem:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05W.A04(X.06C, android.content.ContentResolver):android.net.Uri");
    }

    public C06C A05(long j) {
        C06A c06a = this.A03;
        C06B c06b = c06a.A00;
        if (c06b != null) {
            if (j != -2) {
                Map map = c06a.A01;
                synchronized (map) {
                    for (C06C c06c : map.values()) {
                        if (j == c06c.A01()) {
                            return c06c;
                        }
                    }
                    AnonymousClass060 anonymousClass060 = this.A05;
                    if (anonymousClass060 != null) {
                        C0HC A06 = AnonymousClass061.A06();
                        C0CD A0A = anonymousClass060.A0A();
                        Cursor A05 = AnonymousClass061.A05(A0A, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", AnonymousClass060.A07, "wa_contacts._id = ?", new String[]{String.valueOf(j)}, null, "CONTACT");
                        if (A05 == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("contact-mgr-db/unable to get contact by id ");
                            sb.append(j);
                            C000700j.A08(false, sb.toString());
                            A0A.close();
                            return null;
                        }
                        C06C A04 = A05.moveToNext() ? C002501g.A04(A05) : null;
                        A05.getCount();
                        A05.close();
                        A0A.close();
                        anonymousClass060.A0P(A04, anonymousClass060.A05.A0I());
                        A06.A00();
                        return A04;
                    }
                    throw null;
                }
            }
            return c06b;
        }
        throw null;
    }

    public C06C A06(C0I1 c0i1, String str, long j) {
        return A0B(c0i1, str, j, C04410Kb.A04, false, false, false, false, 0, null);
    }

    public C06C A07(AbstractC005302j abstractC005302j) {
        C02L c02l = this.A01;
        if (c02l.A0A(abstractC005302j)) {
            c02l.A05();
            return c02l.A01;
        }
        boolean A0Y = C003101m.A0Y(abstractC005302j);
        if (A0Y) {
            return this.A03.A00;
        }
        C06A c06a = this.A03;
        if (c06a != null) {
            if (A0Y) {
                return c06a.A00;
            }
            return (C06C) c06a.A01.get(abstractC005302j);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x00d8, code lost:
        if (r8.A04 >= r6.A01()) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C06C A08(X.AbstractC005302j r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05W.A08(X.02j):X.06C");
    }

    public C06C A09(AbstractC005302j abstractC005302j) {
        C02L c02l = this.A01;
        if (c02l.A0A(abstractC005302j)) {
            c02l.A05();
            return c02l.A01;
        } else if (C003101m.A0Y(abstractC005302j)) {
            return this.A03.A00;
        } else {
            return A08(abstractC005302j);
        }
    }

    public C06C A0A(AbstractC005302j abstractC005302j) {
        C06C A09 = A09(abstractC005302j);
        if (A09 != null) {
            return A09;
        }
        C06C c06c = new C06C(abstractC005302j);
        AnonymousClass060 anonymousClass060 = this.A05;
        if (anonymousClass060 != null) {
            C0HC A06 = AnonymousClass061.A06();
            Jid A02 = c06c.A02();
            if (A02 == null) {
                Log.w("contact-mgr-db/unable to add unknown contact with null jid");
                return c06c;
            }
            C02L c02l = anonymousClass060.A01;
            c02l.A05();
            if (c02l.A03 == null) {
                Log.w("contact-mgr-db/unable to add unknown contact due to null me record");
                return c06c;
            } else if (!c06c.A0C() && c02l.A0A(A02)) {
                Log.i("contact-mgr-db/unable to add unknown contact due to matching jid prefix");
                return c06c;
            } else {
                ContentValues contentValues = new ContentValues(4);
                contentValues.put("jid", A02.getRawString());
                contentValues.put("is_whatsapp_user", Boolean.TRUE);
                contentValues.put("status", c06c.A0L);
                contentValues.put("status_timestamp", Long.valueOf(c06c.A07));
                try {
                    C0CD A0B = anonymousClass060.A0B();
                    c06c.A07(AnonymousClass061.A03(A0B, "wa_contacts", contentValues));
                    A0B.close();
                    anonymousClass060.A02.A02(Collections.singletonList(c06c));
                    A06.A00();
                    return c06c;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder("contact-mgr-db/unable to add unknown contact ");
                    sb.append(c06c);
                    String obj = sb.toString();
                    if (obj != null) {
                        Log.e(obj, e);
                        return c06c;
                    }
                    throw null;
                }
            }
        }
        throw null;
    }

    public C06C A0B(AbstractC011105n abstractC011105n, String str, long j, C04410Kb c04410Kb, boolean z, boolean z2, boolean z3, boolean z4, int i, UserJid userJid) {
        Log.i("addGroupChatContact");
        C06C c06c = new C06C(abstractC011105n);
        c06c.A0F = str;
        c06c.A0J = Long.toString(j);
        c06c.A0S = z;
        c06c.A0Z = z2;
        c06c.A0Q = z3;
        c06c.A0Y = z4;
        c06c.A00 = i;
        c06c.A0A = userJid;
        if (c04410Kb.A02 != null) {
            c06c.A0B = c04410Kb;
        }
        AnonymousClass060 anonymousClass060 = this.A05;
        if (anonymousClass060 != null) {
            C0HC A06 = AnonymousClass061.A06();
            Jid A02 = c06c.A02();
            if (A02 == null) {
                Log.w("contact-mgr-db/unable to add group chat with null jid");
                return c06c;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("jid", A02.getRawString());
            contentValues.put("is_whatsapp_user", Boolean.TRUE);
            contentValues.put("status", c06c.A0L);
            contentValues.put("status_timestamp", Long.valueOf(c06c.A07));
            contentValues.put("display_name", c06c.A0F);
            contentValues.put("phone_label", c06c.A0J);
            try {
                C0CD A0B = anonymousClass060.A0B();
                c06c.A07(AnonymousClass061.A03(A0B, "wa_contacts", contentValues));
                anonymousClass060.A0O(c06c, (C011005l) c06c.A03(C011005l.class));
                A0B.close();
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("contact-mgr-db/unable to add group chat ");
                sb.append(c06c);
                String obj = sb.toString();
                if (obj != null) {
                    Log.e(obj, e);
                } else {
                    throw null;
                }
            }
            A06.A00();
            return c06c;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    public C06C A0C(String str) {
        String obj;
        ArrayList<C06C> arrayList;
        if (str != null) {
            String stripSeparators = PhoneNumberUtils.stripSeparators(str.trim());
            if (stripSeparators.length() > 0 && !Character.isDigit(stripSeparators.charAt(0))) {
                stripSeparators = stripSeparators.substring(1);
            }
            if (!stripSeparators.isEmpty()) {
                AnonymousClass060 anonymousClass060 = this.A05;
                if (anonymousClass060 != null) {
                    C0HC A06 = AnonymousClass061.A06();
                    int length = stripSeparators.length();
                    if (length < 5) {
                        obj = stripSeparators;
                    } else {
                        StringBuilder A0P = C000200d.A0P("%");
                        A0P.append(length <= 5 ? stripSeparators : stripSeparators.substring(Math.min(length - 5, 3)));
                        obj = A0P.toString();
                    }
                    C0CD A0A = anonymousClass060.A0A();
                    try {
                        String[] strArr = AnonymousClass060.A07;
                        StringBuilder sb = new StringBuilder();
                        sb.append(obj);
                        sb.append("@");
                        sb.append("s.whatsapp.net");
                        int i = 0;
                        Cursor A05 = AnonymousClass061.A05(A0A, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", strArr, "wa_contacts.jid LIKE ?", new String[]{sb.toString()}, null, "CONTACTS");
                        if (A05 == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("contact-mgr-db/unable to get contacts by phone number ");
                            sb2.append(stripSeparators);
                            Log.e(sb2.toString());
                            ?? emptyList = Collections.emptyList();
                            A0A.close();
                            arrayList = emptyList;
                        } else {
                            ArrayList arrayList2 = new ArrayList(A05.getCount());
                            while (A05.moveToNext()) {
                                arrayList2.add(C002501g.A04(A05));
                            }
                            A05.close();
                            A0A.close();
                            anonymousClass060.A0U(arrayList2);
                            arrayList2.size();
                            A06.A00();
                            arrayList = arrayList2;
                        }
                        C06C c06c = null;
                        for (C06C c06c2 : arrayList) {
                            Jid A03 = c06c2.A03(UserJid.class);
                            if (A03 != null && c06c2.A0X) {
                                if (stripSeparators.equals(A03.user)) {
                                    return c06c2;
                                }
                                i++;
                                c06c = c06c2;
                            }
                        }
                        if (i == 1) {
                            return c06c;
                        }
                    } finally {
                    }
                } else {
                    throw null;
                }
            }
        }
        return null;
    }

    public UserJid A0D(GroupJid groupJid) {
        UserJid userJid;
        String str;
        int indexOf;
        String substring;
        C06C A09;
        if (groupJid == null || (A09 = A09(groupJid)) == null || (userJid = A09.A0A) == null) {
            userJid = null;
            if (groupJid != null && (str = groupJid.user) != null && (indexOf = str.indexOf("-")) != -1 && (substring = str.substring(0, indexOf)) != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.append("@");
                    sb.append("s.whatsapp.net");
                    userJid = UserJid.get(sb.toString());
                    return userJid;
                } catch (C011305p unused) {
                    StringBuilder A0P = C000200d.A0P("jids/failed to get group creator jid from group jid: ");
                    A0P.append(C003101m.A07(groupJid));
                    Log.w(A0P.toString());
                    return userJid;
                }
            }
        }
        return userJid;
    }

    public ArrayList A0E() {
        AnonymousClass060 anonymousClass060 = this.A05;
        if (anonymousClass060 != null) {
            C0HC A06 = AnonymousClass061.A06();
            ArrayList arrayList = new ArrayList();
            C02L c02l = anonymousClass060.A01;
            c02l.A05();
            String A07 = C003101m.A07(c02l.A03);
            String[] strArr = new String[5];
            strArr[0] = "broadcast";
            strArr[1] = "%@broadcast";
            strArr[2] = "%@g.us";
            strArr[3] = "%@temp";
            if (A07 == null) {
                A07 = C04260Jm.A00.getRawString();
            }
            strArr[4] = A07;
            C0CD A0A = anonymousClass060.A0A();
            try {
                Cursor A05 = AnonymousClass061.A05(A0A, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", AnonymousClass060.A07, "is_whatsapp_user = 1 AND wa_contacts.jid != ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid != ?", strArr, null, "CONTACT");
                if (A05 == null) {
                    C000700j.A08(false, "contact-mgr-db/unable to get all individual chats");
                    A0A.close();
                    return arrayList;
                }
                while (A05.moveToNext()) {
                    arrayList.add(C002501g.A04(A05));
                }
                A05.close();
                A0A.close();
                anonymousClass060.A0U(arrayList);
                arrayList.size();
                A06.A00();
                return arrayList;
            } finally {
            }
        } else {
            throw null;
        }
    }

    public Collection A0F(Set set) {
        long currentTimeMillis = System.currentTimeMillis();
        Collection<C06C> A0H = this.A05.A0H(false);
        ArrayList arrayList = new ArrayList();
        for (C06C c06c : A0H) {
            if (c06c.A0B() || set.contains(c06c.A02())) {
                arrayList.add(c06c);
            }
        }
        StringBuilder A0P = C000200d.A0P("returned ");
        A0P.append(arrayList.size());
        A0P.append(" sidelist sync pending contacts | time: ");
        A0P.append(System.currentTimeMillis() - currentTimeMillis);
        Log.i(A0P.toString());
        return arrayList;
    }

    public void A0G() {
        byte[] bArr = new byte[12];
        new Random().nextBytes(bArr);
        C000200d.A0i(this.A0B, "web_contact_checksum", Base64.encodeToString(bArr, 8));
    }

    public void A0H(C06C c06c) {
        AnonymousClass060 anonymousClass060 = this.A05;
        if (anonymousClass060 != null) {
            C0HC A06 = AnonymousClass061.A06();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("status_autodownload_disabled", Integer.valueOf(c06c.A0a ? 1 : 0));
            anonymousClass060.A0I(contentValues, c06c.A02());
            StringBuilder sb = new StringBuilder("updated contact status autodownload jid=");
            sb.append(c06c.A02());
            sb.append(' ');
            sb.append(contentValues);
            sb.append(" | time: ");
            sb.append(A06.A00());
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A0I(final C06C c06c) {
        AnonymousClass060 anonymousClass060 = this.A05;
        if (anonymousClass060 != null) {
            C0HC A06 = AnonymousClass061.A06();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("wa_name", c06c.A0O);
            anonymousClass060.A0I(contentValues, c06c.A02());
            StringBuilder sb = new StringBuilder("updated whatsapp name for contact jid=");
            sb.append(c06c.A02());
            sb.append(' ');
            sb.append(contentValues);
            sb.append(" | time: ");
            sb.append(A06.A00());
            Log.i(sb.toString());
            this.A03.A00(c06c);
            A0G();
            this.A00.post(new Runnable() { // from class: X.1NG
                {
                    C05W.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C05W.this.A06.A05((UserJid) c06c.A03(UserJid.class));
                }
            });
            return;
        }
        throw null;
    }

    public void A0J(C06C c06c) {
        this.A05.A0N(c06c);
        this.A03.A00(c06c);
        Handler handler = this.A00;
        final AnonymousClass008 anonymousClass008 = this.A06;
        handler.post(new Runnable() { // from class: X.1N7
            @Override // java.lang.Runnable
            public final void run() {
                anonymousClass008.A02();
            }
        });
    }

    public void A0K(C06C c06c) {
        AnonymousClass060 anonymousClass060 = this.A05;
        if (anonymousClass060 != null) {
            C0HC A06 = AnonymousClass061.A06();
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("photo_ts", Integer.valueOf(c06c.A01));
            contentValues.put("thumb_ts", Integer.valueOf(c06c.A02));
            contentValues.put("photo_id_timestamp", Long.valueOf(c06c.A06));
            anonymousClass060.A0I(contentValues, c06c.A02());
            StringBuilder sb = new StringBuilder("updated photo id for contact jid=");
            sb.append(c06c.A02());
            sb.append(' ');
            sb.append(contentValues);
            sb.append(" | time: ");
            sb.append(A06.A00());
            Log.i(sb.toString());
            this.A03.A00(c06c);
            return;
        }
        throw null;
    }

    public void A0L(final UserJid userJid, long j, String str) {
        this.A05.A0R(userJid, j, str);
        this.A03.A01.remove(userJid);
        this.A00.post(new Runnable() { // from class: X.1NF
            {
                C05W.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C05W c05w = C05W.this;
                c05w.A06.A06(userJid);
            }
        });
    }

    public void A0M(Collection collection) {
        AnonymousClass060 anonymousClass060 = this.A05;
        if (anonymousClass060 != null) {
            if (collection.isEmpty()) {
                Log.i("contact-mgr-db/add contacts called without any contacts");
                return;
            }
            C0HC A06 = AnonymousClass061.A06();
            ContentValues contentValues = new ContentValues();
            try {
                C0CD A0B = anonymousClass060.A0B();
                C03790Hb A00 = A0B.A00();
                try {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        C06C c06c = (C06C) it.next();
                        if (c06c.A02() != null) {
                            if (c06c.A08 != null) {
                                Iterator it2 = anonymousClass060.A0G((AbstractC005302j) c06c.A03(AbstractC005302j.class)).iterator();
                                while (it2.hasNext()) {
                                    C06C c06c2 = (C06C) it2.next();
                                    if (AnonymousClass060.A02(c06c2)) {
                                        C04460Kg c04460Kg = c06c2.A08;
                                        if (c04460Kg == null) {
                                            throw null;
                                        }
                                        if (c04460Kg.A01.equals(c06c.A08.A01)) {
                                        }
                                    }
                                    C000700j.A07(A00.A01());
                                    C0HC A062 = AnonymousClass061.A06();
                                    anonymousClass060.A0J(A0B, A00, c06c2);
                                    A062.A00();
                                }
                                continue;
                            } else {
                                throw null;
                            }
                        }
                    }
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        C06C c06c3 = (C06C) it3.next();
                        Jid A02 = c06c3.A02();
                        if (A02 == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("contact-mgr-db/skipped adding contact due to empty jid: ");
                            sb.append(c06c3);
                            Log.i(sb.toString());
                        } else {
                            contentValues.put("jid", A02.getRawString());
                            contentValues.put("is_whatsapp_user", Boolean.valueOf(c06c3.A0X));
                            contentValues.put("status", c06c3.A0L);
                            contentValues.put("status_timestamp", Long.valueOf(c06c3.A07));
                            contentValues.put("number", c06c3.A08.A01);
                            contentValues.put("raw_contact_id", Long.valueOf(c06c3.A08.A00));
                            contentValues.put("display_name", c06c3.A0F);
                            contentValues.put("phone_type", c06c3.A0C);
                            contentValues.put("phone_label", c06c3.A0J);
                            contentValues.put("given_name", c06c3.A0H);
                            contentValues.put("family_name", c06c3.A0G);
                            contentValues.put("sort_name", c06c3.A0K);
                            contentValues.put("nickname", c06c3.A0I);
                            contentValues.put("company", c06c3.A0E);
                            contentValues.put("title", c06c3.A0M);
                            contentValues.put("is_spam_reported", Boolean.valueOf(c06c3.A0U));
                            AnonymousClass061.A03(A0B, "wa_contacts", contentValues);
                            if (c06c3.A02() instanceof C011005l) {
                                anonymousClass060.A0K(A0B, A00, (C011005l) c06c3.A03(C011005l.class), c06c3.A0B);
                            }
                        }
                    }
                    A00.A00();
                    A00.close();
                    A0B.close();
                    anonymousClass060.A02.A02(collection);
                    collection.size();
                    A06.A00();
                } finally {
                }
            } catch (IllegalArgumentException e) {
                StringBuilder A0P = C000200d.A0P("contact-mgr-db/unable to add ");
                A0P.append(collection.size());
                A0P.append(" contacts ");
                String obj = A0P.toString();
                if (obj != null) {
                    Log.e(obj, e);
                    return;
                }
                throw null;
            }
        } else {
            throw null;
        }
    }

    public void A0N(Collection collection) {
        C06C c06c;
        AnonymousClass060 anonymousClass060 = this.A05;
        if (anonymousClass060 != null) {
            if (!collection.isEmpty()) {
                C0HC A06 = AnonymousClass061.A06();
                ContentValues contentValues = new ContentValues(1);
                try {
                    C0CD A0B = anonymousClass060.A0B();
                    C03790Hb A00 = A0B.A00();
                    try {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            C06C c06c2 = (C06C) it.next();
                            Jid A02 = c06c2.A02();
                            if (A02 == null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("contact-mgr-db/update contact skipped for jid=");
                                sb.append(A02);
                                Log.i(sb.toString());
                            } else {
                                contentValues.put("keep_timestamp", Long.valueOf(c06c2.A05));
                                AnonymousClass061.A04(A0B, "wa_contacts", contentValues, "_id = ?", new String[]{String.valueOf(c06c2.A01())});
                            }
                        }
                        A00.A00();
                        A0B.close();
                    } finally {
                    }
                } catch (IllegalArgumentException e) {
                    Log.e("contact-mgr-db/unable to update keep timestamp ", e);
                }
                collection.size();
                A06.A00();
            }
            C06A c06a = this.A03;
            if (c06a != null) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    C06C c06c3 = (C06C) it2.next();
                    Jid A03 = c06c3.A03(AbstractC005302j.class);
                    if (A03 != null && (c06c = (C06C) c06a.A01.get(A03)) != null) {
                        c06c.A05 = c06c3.A05;
                    }
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public void A0O(Collection collection) {
        C0CD A0B;
        C03790Hb A01;
        Long l;
        AnonymousClass060 anonymousClass060 = this.A05;
        if (anonymousClass060 != null) {
            C0HC A06 = AnonymousClass061.A06();
            ArrayList arrayList = new ArrayList();
            ContentValues contentValues = new ContentValues();
            try {
                A0B = anonymousClass060.A0B();
                A01 = A0B.A01();
            } catch (IllegalArgumentException e) {
                Log.e("contact-mgr-db/unable to update or add contacts ", e);
            }
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C06C c06c = (C06C) it.next();
                    Jid A02 = c06c.A02();
                    if (A02 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("contact-mgr-db/update or add contact skipped for jid=");
                        sb.append(A02);
                        Log.i(sb.toString());
                    } else {
                        String rawString = A02.getRawString();
                        arrayList.add(c06c);
                        contentValues.clear();
                        long A012 = c06c.A01();
                        if (A012 > 0) {
                            contentValues.put("_id", Long.valueOf(A012));
                        }
                        contentValues.put("jid", rawString);
                        contentValues.put("is_whatsapp_user", Boolean.valueOf(c06c.A0X));
                        contentValues.put("status", c06c.A0L);
                        contentValues.put("status_timestamp", Long.valueOf(c06c.A07));
                        C04460Kg c04460Kg = c06c.A08;
                        contentValues.put("number", c04460Kg != null ? c04460Kg.A01 : null);
                        C04460Kg c04460Kg2 = c06c.A08;
                        if (c04460Kg2 != null) {
                            l = Long.valueOf(c04460Kg2.A00);
                        } else {
                            l = null;
                        }
                        contentValues.put("raw_contact_id", l);
                        contentValues.put("display_name", c06c.A0F);
                        contentValues.put("phone_type", c06c.A0C);
                        contentValues.put("phone_label", c06c.A0J);
                        contentValues.put("given_name", c06c.A0H);
                        contentValues.put("family_name", c06c.A0G);
                        contentValues.put("sort_name", c06c.A0K);
                        contentValues.put("photo_ts", Integer.valueOf(c06c.A01));
                        contentValues.put("thumb_ts", Integer.valueOf(c06c.A02));
                        contentValues.put("photo_id_timestamp", Long.valueOf(c06c.A06));
                        contentValues.put("wa_name", c06c.A0O);
                        contentValues.put("nickname", c06c.A0I);
                        contentValues.put("company", c06c.A0E);
                        contentValues.put("title", c06c.A0M);
                        contentValues.put("is_spam_reported", Boolean.valueOf(c06c.A0U));
                        AnonymousClass061.A08(A0B, "wa_contacts", contentValues);
                        if (A02 instanceof C011005l) {
                            anonymousClass060.A0K(A0B, A01, (C011005l) A02, c06c.A0B);
                        }
                    }
                }
                A01.A00();
                A0B.close();
                anonymousClass060.A02.A02(arrayList);
                collection.size();
                A06.A00();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    this.A03.A00((C06C) it2.next());
                }
            } finally {
            }
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x00a6, code lost:
        if (r1 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0P(java.util.List r16) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05W.A0P(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Q(java.util.Map r29) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05W.A0Q(java.util.Map):void");
    }

    public boolean A0R(UserJid userJid) {
        C04460Kg c04460Kg;
        C06C A09 = A09(userJid);
        return (A09 == null || (c04460Kg = A09.A08) == null || TextUtils.isEmpty(c04460Kg.A01)) ? false : true;
    }
}
