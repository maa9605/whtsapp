package X;

import android.app.Application;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.29R  reason: invalid class name */
/* loaded from: classes2.dex */
public class C29R {
    public static final String[] A07 = {"com.google", "com.microsoft.office.outlook.USER_ACCOUNT"};
    public static final String[] A08 = {"com.google.android.apps.tachyon"};
    public final C0KQ A00;
    public final C469328v A01;
    public final C02E A02;
    public final C001200o A03;
    public final C02F A04;
    public final C000500h A05;
    public final C002301c A06;

    public C29R(C001200o c001200o, C469328v c469328v, C02E c02e, C002301c c002301c, C02F c02f, C000500h c000500h, C0KQ c0kq) {
        this.A03 = c001200o;
        this.A01 = c469328v;
        this.A02 = c02e;
        this.A06 = c002301c;
        this.A04 = c02f;
        this.A05 = c000500h;
        this.A00 = c0kq;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(X.C06C r4, X.C29U r5, X.C29V r6) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29R.A00(X.06C, X.29U, X.29V):boolean");
    }

    public C29W A01(String str, List list, List list2) {
        MessageDigest messageDigest;
        int i;
        Application application = this.A03.A00;
        C002301c c002301c = this.A06;
        C02E c02e = this.A02;
        C02F c02f = this.A04;
        C000500h c000500h = this.A05;
        C0KQ c0kq = this.A00;
        HashSet<C29U> hashSet = new HashSet();
        int i2 = 3;
        if (c02f.A02("android.permission.READ_CONTACTS") != 0) {
            Log.i("phonebook/getPhones/permission_denied");
        } else {
            try {
                Cursor A00 = C29U.A00(c02e, "phonebook/get_phones/");
                if (A00 == null) {
                    Log.e("phonebook/Cursor is null");
                    int i3 = c000500h.A00.getInt("phonebook_null_cursor_count", 0);
                    boolean z = c0kq.A02().getLong("last_contact_full_sync", -1L) < 0;
                    if (i3 < 10 && !z) {
                        c000500h.A0D().putInt("phonebook_null_cursor_count", i3 + 1).apply();
                        return null;
                    }
                } else {
                    while (A00.moveToNext()) {
                        String stripSeparators = PhoneNumberUtils.stripSeparators(A00.getString(2));
                        if (PhoneNumberUtils.isGlobalPhoneNumber(stripSeparators)) {
                            long j = A00.getLong(0);
                            String string = A00.getString(1);
                            int i4 = A00.getInt(i2);
                            String string2 = A00.getString(4);
                            String string3 = A00.getString(5);
                            String string4 = A00.getString(6);
                            AnonymousClass024.A0J(stripSeparators, 4);
                            hashSet.add(new C29U(j, string, stripSeparators, i4, string2, string3, string4));
                        }
                        i2 = 3;
                    }
                    A00.close();
                    C000200d.A0g(c000500h, "phonebook_null_cursor_count", 0);
                }
            } catch (Exception e) {
                Log.e("phonebook/error in retrieving phone numbers", e);
                return null;
            }
        }
        HashSet hashSet2 = new HashSet();
        if (Build.MANUFACTURER.equalsIgnoreCase("lge")) {
            Log.i("phonebook/get_sim_card_phones/lge");
            ContentResolver A072 = c02e.A07();
            if (A072 == null) {
                Log.e("phonebook/get-sim-card-phones cr=null");
            } else {
                try {
                    Cursor query = A072.query(Uri.parse("content://icc/adn"), null, null, null, null);
                    if (query == null) {
                        Log.e("phonebook/get-sim-card-phones null cursor returned from sim card phones query");
                    } else {
                        int columnIndex = query.getColumnIndex("name");
                        int columnIndex2 = query.getColumnIndex("number");
                        while (query.moveToNext()) {
                            String string5 = query.getString(columnIndex);
                            String string6 = query.getString(columnIndex2);
                            if (string6 != null) {
                                String stripSeparators2 = PhoneNumberUtils.stripSeparators(string6);
                                if (PhoneNumberUtils.isGlobalPhoneNumber(stripSeparators2)) {
                                    hashSet2.add(new C29U(-2L, string5, stripSeparators2, 0, c002301c.A06(R.string.contact_sim), null, null));
                                }
                            }
                        }
                        query.close();
                    }
                } catch (Exception e2) {
                    Log.w("exception while retrieving sim card contacts, will continue without them ", e2);
                }
            }
        }
        hashSet.addAll(hashSet2);
        HashMap hashMap = new HashMap();
        for (C29U c29u : hashSet) {
            C0FK c0fk = new C0FK(c29u.A05, c29u.A03);
            if (!hashMap.containsKey(c0fk)) {
                hashMap.put(c0fk, new ArrayList());
            }
            ((List) hashMap.get(c0fk)).add(c29u);
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C06C c06c = (C06C) it.next();
            C04460Kg c04460Kg = c06c.A08;
            if (c04460Kg != null) {
                hashMap2.put(new C0FK(c04460Kg.A01, c06c.A0F), c06c);
            } else {
                throw null;
            }
        }
        HashMap hashMap3 = new HashMap();
        if (c02f.A02("android.permission.READ_CONTACTS") != 0) {
            Log.w("returning empty name map because contact permissions are denied");
        } else {
            Cursor query2 = application.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id", "mimetype", "data1", "data2", "data3", "data4"}, "mimetype IN (?,?,?)", new String[]{"vnd.android.cursor.item/name", "vnd.android.cursor.item/nickname", "vnd.android.cursor.item/organization"}, null);
            try {
                if (query2 == null) {
                    Log.e("null cursor returned from structured name query");
                } else {
                    int columnIndex3 = query2.getColumnIndex("raw_contact_id");
                    if (columnIndex3 == -1) {
                        Log.e("invalid column index for the raw contact id");
                    } else {
                        int columnIndex4 = query2.getColumnIndex("mimetype");
                        if (columnIndex4 == -1) {
                            Log.e("invalid column index for the mimetype");
                        } else {
                            int columnIndex5 = query2.getColumnIndex("data2");
                            if (columnIndex5 == -1) {
                                Log.e("invalid column index for the given name");
                            } else {
                                int columnIndex6 = query2.getColumnIndex("data3");
                                if (columnIndex6 == -1) {
                                    Log.e("invalid column index for the family name");
                                } else {
                                    int columnIndex7 = query2.getColumnIndex("data1");
                                    if (columnIndex7 == -1) {
                                        Log.e("invalid column index for the nickname");
                                    } else {
                                        int columnIndex8 = query2.getColumnIndex("data1");
                                        if (columnIndex8 == -1) {
                                            Log.e("invalid column index for the company");
                                        } else {
                                            int columnIndex9 = query2.getColumnIndex("data4");
                                            if (columnIndex9 == -1) {
                                                Log.e("invalid column index for the title");
                                            } else {
                                                while (query2.moveToNext()) {
                                                    if (query2.isNull(columnIndex3)) {
                                                        Log.e("null raw contact id for record; skipping");
                                                    } else if (query2.isNull(columnIndex4)) {
                                                        Log.e("null mimetype for record; skipping");
                                                    } else {
                                                        Long valueOf = Long.valueOf(query2.getLong(columnIndex3));
                                                        C29V c29v = (C29V) hashMap3.get(valueOf);
                                                        if (c29v == null) {
                                                            c29v = new C29V();
                                                            hashMap3.put(valueOf, c29v);
                                                        }
                                                        String string7 = query2.getString(columnIndex4);
                                                        if (string7 == null) {
                                                            Log.e("mimetype was returned as null even though cursor said it wasn't null; skipping");
                                                        } else {
                                                            int hashCode = string7.hashCode();
                                                            if (hashCode != -1079224304) {
                                                                if (hashCode == 689862072) {
                                                                    if (string7.equals("vnd.android.cursor.item/organization")) {
                                                                        c29v.A00 = query2.getString(columnIndex8);
                                                                        c29v.A04 = query2.getString(columnIndex9);
                                                                    } else {
                                                                        StringBuilder sb = new StringBuilder();
                                                                        sb.append("unrecognized mimetype; skipping; mimetype=");
                                                                        sb.append(string7);
                                                                        Log.e(sb.toString());
                                                                    }
                                                                } else {
                                                                    if (hashCode == 2034973555 && string7.equals("vnd.android.cursor.item/nickname")) {
                                                                        c29v.A03 = query2.getString(columnIndex7);
                                                                    }
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("unrecognized mimetype; skipping; mimetype=");
                                                                    sb2.append(string7);
                                                                    Log.e(sb2.toString());
                                                                }
                                                            } else if (string7.equals("vnd.android.cursor.item/name")) {
                                                                c29v.A02 = query2.getString(columnIndex5);
                                                                c29v.A01 = query2.getString(columnIndex6);
                                                            } else {
                                                                StringBuilder sb22 = new StringBuilder();
                                                                sb22.append("unrecognized mimetype; skipping; mimetype=");
                                                                sb22.append(string7);
                                                                Log.e(sb22.toString());
                                                            }
                                                        }
                                                    }
                                                }
                                                query2.close();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    query2.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (query2 != null) {
                        try {
                            query2.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        }
        C29W c29w = new C29W();
        HashSet A002 = this.A01.A00();
        if (list2.isEmpty()) {
            messageDigest = null;
        } else {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e3) {
                throw new AssertionError(e3);
            }
        }
        HashSet hashSet3 = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            List<C29U> list3 = (List) entry.getValue();
            C29U c29u2 = (C29U) list3.get(0);
            String[] strArr = A07;
            int length = strArr.length;
            boolean z2 = false;
            for (C29U c29u3 : list3) {
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    } else if (strArr[i5].equals(c29u3.A02)) {
                        z2 = true;
                        c29u2 = c29u3;
                        length = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (!z2) {
                c29u2 = (C29U) list3.get(0);
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C29U c29u4 = (C29U) it2.next();
                    while (true) {
                        String[] strArr2 = A08;
                        if (i >= strArr2.length) {
                            c29u2 = c29u4;
                            break;
                        }
                        i = strArr2[i].equals(c29u4.A02) ? 0 : i + 1;
                    }
                }
            }
            String str2 = c29u2.A05;
            AnonymousClass024.A0J(str2, 4);
            C06C c06c2 = (C06C) hashMap2.get(entry.getKey());
            if (c06c2 != null) {
                if (!list2.isEmpty() && !c06c2.A0X && C23X.A0M(c06c2, list2, messageDigest)) {
                    c29w.A01.add(c06c2);
                } else if (A00(c06c2, c29u2, (C29V) hashMap3.get(Long.valueOf(c29u2.A01)))) {
                    c29w.A05.add(c06c2);
                } else {
                    c29w.A04.add(c06c2);
                }
            } else {
                long j2 = c29u2.A01;
                C06C c06c3 = new C06C(new C04460Kg(j2, str2), c29u2.A03, c29u2.A00, c29u2.A04);
                c06c3.A0K = c29u2.A06;
                if (A002.contains(((C0FK) entry.getKey()).A00)) {
                    c29w.A04.add(c06c3);
                } else {
                    A00(c06c3, c29u2, (C29V) hashMap3.get(Long.valueOf(j2)));
                    c29w.A00.add(c06c3);
                    hashSet3.add(((C0FK) entry.getKey()).A00);
                }
            }
        }
        HashSet hashSet4 = new HashSet();
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                c29w.A02.add(entry2.getValue());
                c29w.A03.add(entry2.getValue());
                Jid A03 = ((C06C) entry2.getValue()).A03(UserJid.class);
                if (A03 != null) {
                    hashSet4.add(A03);
                }
            }
        }
        for (Map.Entry entry3 : hashMap2.entrySet()) {
            if (hashSet3.contains(((C0FK) entry3.getKey()).A00) && !c29w.A02.contains(entry3.getValue())) {
                c29w.A00.add(entry3.getValue());
            }
            Jid A032 = ((C06C) entry3.getValue()).A03(UserJid.class);
            if (A032 != null && hashSet4.contains(A032) && !c29w.A03.contains(entry3.getValue())) {
                hashSet4.remove(A032);
            }
        }
        List<C06C> list4 = c29w.A03;
        if (!list4.isEmpty()) {
            HashSet hashSet5 = new HashSet();
            for (C06C c06c4 : list4) {
                if (c06c4.A03(UserJid.class) != null && !hashSet4.contains(c06c4.A03(UserJid.class))) {
                    hashSet5.add(c06c4);
                }
            }
            list4.removeAll(hashSet5);
        }
        List list5 = c29w.A00;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("add");
        C05W.A02(list5, sb3.toString());
        List list6 = c29w.A05;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("update");
        C05W.A02(list6, sb4.toString());
        List list7 = c29w.A02;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append("remove");
        C05W.A02(list7, sb5.toString());
        List list8 = c29w.A04;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append("unchanged");
        C05W.A02(list8, sb6.toString());
        List list9 = c29w.A01;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str);
        sb7.append("updateContactsMatchingJidHash");
        C05W.A02(list9, sb7.toString());
        return c29w;
    }
}
