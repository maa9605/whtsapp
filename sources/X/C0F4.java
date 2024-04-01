package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0F4 */
/* loaded from: classes.dex */
public class C0F4 {
    public static volatile C0F4 A07;
    public C05320Of A00;
    public final C02L A01;
    public final C05E A02;
    public final C0F7 A03;
    public final C0F8 A04;
    public final C0F5 A05;
    public volatile String A06;

    public C0F4(C02L c02l, C0F5 c0f5, C05E c05e, C0F7 c0f7, C0F8 c0f8) {
        this.A01 = c02l;
        this.A05 = c0f5;
        this.A02 = c05e;
        this.A03 = c0f7;
        this.A04 = c0f8;
    }

    public static C0F4 A00() {
        if (A07 == null) {
            synchronized (C0F4.class) {
                if (A07 == null) {
                    C02L A00 = C02L.A00();
                    if (C0F5.A04 == null) {
                        synchronized (C0F5.class) {
                            if (C0F5.A04 == null) {
                                C0F5.A04 = new C0F5(C05B.A00(), C05E.A00(), C05L.A00());
                            }
                        }
                    }
                    C0F5 c0f5 = C0F5.A04;
                    C05E A002 = C05E.A00();
                    if (C0F7.A04 == null) {
                        synchronized (C0F7.class) {
                            if (C0F7.A04 == null) {
                                C0F7.A04 = new C0F7(C05B.A00(), C05L.A00(), C05E.A00());
                            }
                        }
                    }
                    A07 = new C0F4(A00, c0f5, A002, C0F7.A04, C0F8.A00());
                }
            }
        }
        return A07;
    }

    public C07E A01() {
        Iterator it = this.A04.A01().A01().iterator();
        HashMap hashMap = new HashMap();
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it;
            if (c04250Jl.hasNext()) {
                Map.Entry entry = (Map.Entry) c04250Jl.next();
                if (!((C0JV) entry.getValue()).A00()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            } else {
                return new C07E(hashMap, null);
            }
        }
    }

    public C07E A02(UserJid userJid) {
        C07E c07e;
        C07E c07e2;
        C02L c02l = this.A01;
        c02l.A05();
        C000700j.A0A(!userJid.equals(c02l.A03), "only get user for others");
        C0F5 c0f5 = this.A05;
        C05B c05b = c0f5.A00;
        if (!c05b.A0C()) {
            return C07E.A01;
        }
        Map map = c0f5.A03.A00;
        if (map.containsKey(userJid) && (c07e2 = (C07E) map.get(userJid)) != null) {
            return c07e2;
        }
        long A02 = c05b.A02(userJid);
        C0CD A03 = c0f5.A01.A03();
        try {
            synchronized (c0f5) {
                Cursor A072 = A03.A02.A07("SELECT device_jid_row_id, key_index FROM user_device WHERE user_jid_row_id = ?", new String[]{Long.toString(A02)});
                HashMap hashMap = new HashMap();
                int columnIndexOrThrow = A072.getColumnIndexOrThrow("device_jid_row_id");
                int columnIndexOrThrow2 = A072.getColumnIndexOrThrow("key_index");
                while (A072.moveToNext()) {
                    long j = A072.getLong(columnIndexOrThrow);
                    long j2 = A072.getLong(columnIndexOrThrow2);
                    DeviceJid of = DeviceJid.of(c05b.A04(j));
                    if (of != null) {
                        hashMap.put(of, Long.valueOf(j2));
                    } else {
                        throw null;
                    }
                }
                c07e = new C07E(hashMap, null);
                map.put(userJid, c07e);
                A072.close();
            }
            A03.close();
            return c07e;
        } finally {
        }
    }

    public void A03() {
        synchronized (this) {
            C02L c02l = this.A01;
            c02l.A05();
            if (c02l.A02 == null) {
                this.A06 = null;
            } else {
                HashSet A02 = this.A04.A01().A02().A02();
                c02l.A05();
                A02.add(c02l.A02);
                this.A06 = C002501g.A0F(A02);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A04(C07D c07d) {
        if (!c07d.A00.isEmpty()) {
            C0CD A04 = this.A02.A04();
            try {
                C03790Hb A00 = A04.A00();
                this.A04.A02(c07d);
                A00.A00();
                A00.close();
                A04.close();
                A03();
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
    }

    public void A05(C07D c07d, boolean z) {
        C02L c02l = this.A01;
        c02l.A05();
        DeviceJid deviceJid = c02l.A02;
        Set set = c07d.A00;
        C000700j.A0A(!set.contains(deviceJid), "never remove my primary device.");
        if (!set.isEmpty()) {
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null) {
                C0CD A04 = this.A02.A04();
                try {
                    C03790Hb A00 = A04.A00();
                    C0F8 c0f8 = this.A04;
                    C07D A02 = c0f8.A01().A02();
                    if (z) {
                        c0f8.A02(c07d);
                    } else {
                        C0CD A002 = c0f8.A02.A00();
                        try {
                            C03790Hb A003 = A002.A00();
                            synchronized (c0f8) {
                                long A05 = c0f8.A01.A05();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("logout_time", Long.valueOf(A05));
                                String[] A0d = C003101m.A0d(c07d.A02());
                                String join = TextUtils.join(", ", Collections.nCopies(A0d.length, "?"));
                                StringBuilder sb = new StringBuilder();
                                sb.append("device_id IN (");
                                sb.append(join);
                                sb.append(")");
                                A002.A02.A00("devices", contentValues, sb.toString(), A0d);
                                A003.A00();
                                c0f8.A00 = null;
                            }
                            A003.close();
                            A002.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    A002.close();
                                } catch (Throwable unused) {
                                }
                                throw th2;
                            }
                        }
                    }
                    C07D c07d2 = C07D.A01;
                    C05320Of c05320Of = this.A00;
                    if (c05320Of != null) {
                        c05320Of.A03(userJid, A02, c07d2, c07d);
                    }
                    A00.A00();
                    A00.close();
                    A04.close();
                    A03();
                    C05320Of c05320Of2 = this.A00;
                    if (c05320Of2 != null) {
                        c05320Of2.A02(userJid, A02, c07d2, c07d);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            A04.close();
                        } catch (Throwable unused2) {
                        }
                        throw th4;
                    }
                }
            }
            throw null;
        }
    }
}
