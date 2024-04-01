package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: X.3aY */
/* loaded from: classes2.dex */
public class C72763aY {
    public final C02L A00;
    public final C05W A01;
    public final C05Q A02;
    public final C06S A03;

    public C72763aY(C02L c02l, C05W c05w, C06S c06s, C05Q c05q) {
        this.A00 = c02l;
        this.A01 = c05w;
        this.A03 = c06s;
        this.A02 = c05q;
    }

    public ArrayList A00(UserJid userJid) {
        ArrayList arrayList;
        C0CD A03;
        boolean z;
        List<Number> arrayList2;
        C28211Qs c28211Qs;
        UserJid A0B;
        if (userJid == null) {
            return new ArrayList();
        }
        C06S c06s = this.A03;
        if (c06s.A0A()) {
            if (!c06s.A0A()) {
                arrayList2 = Collections.emptyList();
            } else {
                TreeSet treeSet = new TreeSet(Collections.reverseOrder());
                long A02 = c06s.A08.A02(userJid);
                A03 = c06s.A0A.A03();
                try {
                    C0CE c0ce = A03.A02;
                    String l = Long.toString(A02);
                    Cursor A07 = c0ce.A07("SELECT message_row_id FROM message_vcard WHERE _id IN (SELECT vcard_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?) ORDER BY message_row_id DESC", new String[]{l});
                    int columnIndexOrThrow = A07.getColumnIndexOrThrow("message_row_id");
                    while (A07.moveToNext()) {
                        treeSet.add(Long.valueOf(A07.getLong(columnIndexOrThrow)));
                    }
                    A07.close();
                    Cursor A072 = c0ce.A07("SELECT message_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?", new String[]{l});
                    int columnIndexOrThrow2 = A072.getColumnIndexOrThrow("message_row_id");
                    while (A072.moveToNext()) {
                        long j = A072.getLong(columnIndexOrThrow2);
                        if (j > 0) {
                            treeSet.add(Long.valueOf(j));
                        }
                    }
                    A072.close();
                    A03.close();
                    arrayList2 = new ArrayList(treeSet);
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
            arrayList = new ArrayList();
            for (Number number : arrayList2) {
                long longValue = number.longValue();
                AnonymousClass092 A01 = this.A02.A01(longValue);
                if (A01 != null && (A0B = A01.A0B()) != null) {
                    c28211Qs = new C28211Qs(userJid.getRawString(), A0B.getRawString(), longValue);
                } else {
                    c28211Qs = null;
                }
                if (c28211Qs != null) {
                    arrayList.add(c28211Qs);
                }
            }
        } else if (c06s != null) {
            arrayList = new ArrayList();
            A03 = c06s.A0A.A03();
            try {
                Cursor A073 = A03.A02.A07("SELECT sender_jid, message_row_id FROM messages_vcards WHERE _id IN (SELECT vcard_row_id FROM messages_vcards_jids WHERE vcard_jid = ?) ORDER BY message_row_id DESC", new String[]{userJid.getRawString()});
                int columnIndexOrThrow3 = A073.getColumnIndexOrThrow("sender_jid");
                int columnIndexOrThrow4 = A073.getColumnIndexOrThrow("message_row_id");
                while (A073.moveToNext()) {
                    arrayList.add(new C28211Qs(userJid.getRawString(), A073.getString(columnIndexOrThrow3), A073.getLong(columnIndexOrThrow4)));
                }
                A073.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                    try {
                        A03.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
        } else {
            throw null;
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C28211Qs c28211Qs2 = (C28211Qs) it.next();
            UserJid nullable = UserJid.getNullable(c28211Qs2.A02);
            if (nullable != null) {
                if (hashMap.containsKey(nullable)) {
                    Object obj = hashMap.get(nullable);
                    if (obj == null) {
                        throw null;
                    }
                    z = ((Boolean) obj).booleanValue();
                } else {
                    C06C A09 = this.A01.A09(nullable);
                    z = A09 != null && (this.A00.A0A(A09.A02()) || A09.A08 != null);
                    hashMap.put(nullable, Boolean.valueOf(z));
                }
                if (z) {
                    arrayList3.add(c28211Qs2);
                }
            }
        }
        return arrayList3;
    }
}
