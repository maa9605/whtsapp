package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Gv */
/* loaded from: classes.dex */
public class C03730Gv {
    public static volatile C03730Gv A08;
    public Map A00;
    public final AnonymousClass012 A01;
    public final C05A A02;
    public final C05M A03;
    public final C05B A04;
    public final C05E A05;
    public final C05C A06;
    public final C05L A07;

    public C03730Gv(AnonymousClass012 anonymousClass012, C05B c05b, C05A c05a, C05M c05m, C05C c05c, C05L c05l, C05E c05e) {
        this.A01 = anonymousClass012;
        this.A04 = c05b;
        this.A02 = c05a;
        this.A03 = c05m;
        this.A06 = c05c;
        this.A07 = c05l;
        this.A05 = c05e;
    }

    public static C03730Gv A00() {
        if (A08 == null) {
            synchronized (C03730Gv.class) {
                if (A08 == null) {
                    A08 = new C03730Gv(AnonymousClass012.A00(), C05B.A00(), C05A.A00(), C05M.A00(), C05C.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A08;
    }

    public static final void A01(C0CD c0cd, AbstractC005302j abstractC005302j, byte b, int i) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("jid", abstractC005302j.getRawString());
        contentValues.put("type", Byte.valueOf(b));
        contentValues.put("message_count", Integer.valueOf(i));
        if (c0cd.A02.A02("frequents", contentValues) == -1) {
            StringBuilder sb = new StringBuilder("frequentMessageStore/insertFrequents/failed jid=");
            sb.append(abstractC005302j);
            sb.append(" type=");
            sb.append((int) b);
            Log.e(sb.toString());
        }
    }

    public List A02(InterfaceC03930Ht interfaceC03930Ht) {
        if (this.A00 == null) {
            if (A08()) {
                A04();
            } else {
                A03();
            }
        }
        Map map = this.A00;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            AbstractC005302j abstractC005302j = ((C27721Om) entry.getKey()).A01;
            byte b = ((C27721Om) entry.getKey()).A00;
            int intValue = ((Number) entry.getValue()).intValue();
            if (interfaceC03930Ht != null) {
                intValue *= interfaceC03930Ht.AE1(b);
            }
            if (intValue != 0) {
                C27711Ol c27711Ol = (C27711Ol) hashMap.get(abstractC005302j);
                if (c27711Ol == null) {
                    c27711Ol = new C27711Ol(null);
                    c27711Ol.A01 = this.A03.A05(abstractC005302j);
                }
                c27711Ol.A00 += intValue;
                hashMap.put(abstractC005302j, c27711Ol);
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: X.1OE
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C27711Ol) ((Map.Entry) obj2).getValue()).compareTo((C27711Ol) ((Map.Entry) obj).getValue());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList2.add(entry2.getKey());
            entry2.getKey();
            entry2.getValue();
            entry2.getValue();
        }
        return arrayList2;
    }

    public void A03() {
        this.A00 = new ConcurrentHashMap();
        C0CD A03 = this.A05.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT jid, type, message_count FROM frequents", null);
            if (A07 != null) {
                int columnIndexOrThrow = A07.getColumnIndexOrThrow("jid");
                int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("type");
                int columnIndexOrThrow3 = A07.getColumnIndexOrThrow("message_count");
                while (A07.moveToNext()) {
                    AbstractC005302j A02 = AbstractC005302j.A02(A07.getString(columnIndexOrThrow));
                    if (A02 != null) {
                        this.A00.put(new C27721Om(A02, (byte) A07.getInt(columnIndexOrThrow2)), Integer.valueOf(A07.getInt(columnIndexOrThrow3)));
                    }
                }
                A07.close();
            }
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

    public void A04() {
        this.A00 = new ConcurrentHashMap();
        C0CD A03 = this.A05.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT jid_row_id, type, message_count FROM frequent", null);
            if (A07 != null) {
                int columnIndexOrThrow = A07.getColumnIndexOrThrow("jid_row_id");
                int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("type");
                int columnIndexOrThrow3 = A07.getColumnIndexOrThrow("message_count");
                while (A07.moveToNext()) {
                    AbstractC005302j abstractC005302j = (AbstractC005302j) this.A04.A07(AbstractC005302j.class, A07.getLong(columnIndexOrThrow));
                    if (abstractC005302j != null) {
                        this.A00.put(new C27721Om(abstractC005302j, (byte) A07.getInt(columnIndexOrThrow2)), Integer.valueOf(A07.getInt(columnIndexOrThrow3)));
                    }
                }
                A07.close();
            }
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

    /* JADX WARN: Finally extract failed */
    public void A05() {
        int i;
        int valueOf;
        C0HC c0hc = new C0HC();
        c0hc.A02 = "frequentmsgstore/updateFrequents";
        c0hc.A03 = true;
        c0hc.A03();
        C0CD A04 = this.A05.A04();
        try {
            C0CE c0ce = A04.A02;
            long currentTimeMillis = System.currentTimeMillis() - 691200000;
            long j = 0;
            Cursor A07 = c0ce.A07("SELECT _id, received_timestamp FROM available_message_view ORDER BY _id DESC LIMIT 4096", null);
            if (A07 != null) {
                int columnIndexOrThrow = A07.getColumnIndexOrThrow("received_timestamp");
                int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("_id");
                i = 0;
                while (A07.moveToNext()) {
                    long j2 = A07.getLong(columnIndexOrThrow);
                    j = A07.getLong(columnIndexOrThrow2);
                    i++;
                    if (j2 <= currentTimeMillis) {
                        break;
                    }
                }
                A07.close();
            } else {
                i = 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("frequentmsgstore/updateFrequents/start row:");
            sb.append(j);
            sb.append(" ");
            sb.append(i);
            Log.i(sb.toString());
            String[] strArr = {Long.toString(j), Integer.toString(6)};
            HashMap hashMap = new HashMap();
            Cursor A072 = c0ce.A07("SELECT chat_row_id, message_type FROM available_message_view WHERE _id >= ? AND from_me = 1 AND status != ?", strArr);
            if (A072 != null) {
                int columnIndexOrThrow3 = A072.getColumnIndexOrThrow("message_type");
                while (A072.moveToNext()) {
                    AbstractC005302j A09 = this.A02.A09(A072);
                    if (A09 != null && !C003101m.A0Z(A09)) {
                        C27721Om c27721Om = new C27721Om(A09, (byte) A072.getInt(columnIndexOrThrow3));
                        Integer num = (Integer) hashMap.get(c27721Om);
                        if (num == null) {
                            valueOf = 1;
                        } else {
                            valueOf = Integer.valueOf(num.intValue() + 1);
                        }
                        hashMap.put(c27721Om, valueOf);
                    }
                }
                A072.close();
            } else {
                Log.e("frequentmsgstore/updateFrequents/cursor is null");
            }
            hashMap.size();
            C03790Hb A00 = A04.A00();
            c0ce.A01("frequents", null, null);
            if (A09()) {
                c0ce.A01("frequent", null, null);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                A01(A04, ((C27721Om) entry.getKey()).A01, ((C27721Om) entry.getKey()).A00, ((Integer) entry.getValue()).intValue());
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                A07(((C27721Om) entry2.getKey()).A01, ((C27721Om) entry2.getKey()).A00, ((Integer) entry2.getValue()).intValue(), true);
            }
            A00.A00();
            A00.close();
            this.A00 = new ConcurrentHashMap(hashMap);
            this.A06.A05("frequents", this.A01.A05());
            A04.close();
            c0hc.A01();
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

    /* JADX WARN: Finally extract failed */
    public void A06(AbstractC005302j abstractC005302j) {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("frequents", "jid = ?", new String[]{abstractC005302j.getRawString()});
            if (A09()) {
                long A02 = this.A04.A02(abstractC005302j);
                C0CF A01 = this.A07.A01("DELETE FROM frequent WHERE jid_row_id = ?");
                A01.A04(1, A02);
                A01.A00();
            }
            A00.A00();
            A00.close();
            A04.close();
            Map map = this.A00;
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                for (C27721Om c27721Om : map.keySet()) {
                    if (abstractC005302j.equals(c27721Om.A01)) {
                        arrayList.add(c27721Om);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.A00.remove(it.next());
                }
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

    public final void A07(AbstractC005302j abstractC005302j, byte b, int i, boolean z) {
        if (A09()) {
            long A02 = this.A04.A02(abstractC005302j);
            if (!z) {
                C0CF A01 = this.A07.A01("UPDATE frequent   SET message_count = ? WHERE jid_row_id = ? AND type = ?");
                A01.A04(2, A02);
                A01.A04(3, b);
                A01.A04(1, i);
                if (A01.A00() == 1) {
                    return;
                }
            }
            if (A08()) {
                C0CF A012 = this.A07.A01("INSERT INTO frequent(jid_row_id, type, message_count) VALUES (?, ?, ?)");
                A012.A04(1, A02);
                A012.A04(2, b);
                A012.A04(3, i);
                if (A012.A01() == -1) {
                    StringBuilder sb = new StringBuilder("frequentMessageStore/insertOrUpdateFrequent/failed jid=");
                    sb.append(abstractC005302j);
                    sb.append(" type=");
                    sb.append((int) b);
                    Log.e(sb.toString());
                }
            }
        }
    }

    public boolean A08() {
        String A02;
        return this.A04.A0C() && (A02 = this.A06.A02("frequent_ready")) != null && Long.parseLong(A02) == 1;
    }

    public final boolean A09() {
        if (A08()) {
            return true;
        }
        String A02 = this.A06.A02("migration_frequent_index");
        return A02 != null && Long.parseLong(A02) > 0;
    }
}
