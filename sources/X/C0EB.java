package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0EB */
/* loaded from: classes.dex */
public class C0EB {
    public static volatile C0EB A06;
    public final AnonymousClass012 A00;
    public final C05B A01;
    public final C05E A02;
    public final C05C A03;
    public final Object A04 = new Object();
    public volatile ConcurrentHashMap A05;

    public C0EB(AnonymousClass012 anonymousClass012, C05B c05b, C05C c05c, C05E c05e) {
        this.A00 = anonymousClass012;
        this.A01 = c05b;
        this.A03 = c05c;
        this.A02 = c05e;
    }

    public static C0EB A00() {
        if (A06 == null) {
            synchronized (C0EB.class) {
                if (A06 == null) {
                    A06 = new C0EB(AnonymousClass012.A00(), C05B.A00(), C05C.A00(), C05E.A00());
                }
            }
        }
        return A06;
    }

    public static final String A01(String str, boolean z) {
        StringBuilder A0V = C000200d.A0V(str, "_");
        A0V.append((z ? "status_list" : "status").toUpperCase(Locale.ROOT));
        return A0V.toString();
    }

    public static String A02(List list) {
        Collections.sort(list, new Comparator() { // from class: X.1OW
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C0Hr c0Hr = (C0Hr) obj;
                C0Hr c0Hr2 = (C0Hr) obj2;
                UserJid userJid = c0Hr.A0A;
                if (C011405q.A03(userJid)) {
                    return -1;
                }
                UserJid userJid2 = c0Hr2.A0A;
                if (C011405q.A03(userJid2)) {
                    return 1;
                }
                if (C003101m.A0Y(userJid)) {
                    return -1;
                }
                if (C003101m.A0Y(userJid2)) {
                    return 1;
                }
                return -(c0Hr.A07 > c0Hr2.A07 ? 1 : (c0Hr.A07 == c0Hr2.A07 ? 0 : -1));
            }
        });
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0Hr c0Hr = (C0Hr) it.next();
                messageDigest.update(c0Hr.A0A.getRawString().getBytes());
                int i = c0Hr.A01;
                messageDigest.update(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i});
                int i2 = c0Hr.A00;
                messageDigest.update(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2});
                long j = c0Hr.A07;
                messageDigest.update(new byte[]{(byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
                AnonymousClass092 anonymousClass092 = c0Hr.A08;
                if (anonymousClass092 != null) {
                    messageDigest.update(anonymousClass092.A0n.A01.getBytes());
                }
            }
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final void A03(ContentValues contentValues, C0Hr c0Hr) {
        contentValues.put("message_table_id", Long.valueOf(c0Hr.A06));
        contentValues.put("last_read_message_table_id", Long.valueOf(c0Hr.A04));
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(c0Hr.A05));
        contentValues.put("first_unread_message_table_id", Long.valueOf(c0Hr.A03));
        contentValues.put("autodownload_limit_message_table_id", Long.valueOf(c0Hr.A02));
        contentValues.put("timestamp", Long.valueOf(c0Hr.A07));
        contentValues.put("unseen_count", Integer.valueOf(c0Hr.A01));
        contentValues.put("total_count", Integer.valueOf(c0Hr.A00));
    }

    public int A04() {
        String A02 = this.A03.A02("status_distribution");
        if (A02 == null) {
            return 0;
        }
        return Integer.parseInt(A02);
    }

    public final long A05(String str) {
        C0CD A03 = this.A02.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT timestamp FROM status WHERE jid_row_id=?", new String[]{str});
            if (!A07.moveToNext()) {
                A07.close();
                A03.close();
                return 0L;
            }
            long j = A07.getLong(0);
            A07.close();
            A03.close();
            return j;
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

    public C0Hr A06() {
        A0C();
        return (C0Hr) this.A05.get(C011405q.A00);
    }

    public C0Hr A07(UserJid userJid) {
        A0C();
        if (userJid == null) {
            return null;
        }
        return (C0Hr) this.A05.get(userJid);
    }

    public List A08() {
        A0C();
        ConcurrentHashMap concurrentHashMap = this.A05;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (C0Hr c0Hr : concurrentHashMap.values()) {
            if (!c0Hr.A03()) {
                arrayList.add(c0Hr.A01());
            }
        }
        return arrayList;
    }

    public List A09() {
        String A02 = this.A03.A02("status_black_list");
        if (TextUtils.isEmpty(A02)) {
            return new ArrayList();
        }
        return C003101m.A0F(UserJid.class, Arrays.asList(A02.split(",")));
    }

    public List A0A() {
        String A02 = this.A03.A02("status_white_list");
        if (TextUtils.isEmpty(A02)) {
            return new ArrayList();
        }
        return C003101m.A0F(UserJid.class, Arrays.asList(A02.split(",")));
    }

    public final ConcurrentHashMap A0B(C0CD c0cd) {
        UserJid userJid;
        boolean A0I = A0I();
        Cursor A07 = c0cd.A02.A07(A0I ? "SELECT key_remote_jid, message_table_id, last_read_message_table_id, last_read_receipt_sent_message_table_id, first_unread_message_table_id, autodownload_limit_message_table_id, timestamp, unseen_count, total_count FROM status_list" : "SELECT jid_row_id, message_table_id, last_read_message_table_id, last_read_receipt_sent_message_table_id, first_unread_message_table_id, autodownload_limit_message_table_id, timestamp, unseen_count, total_count FROM status", null);
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            if (A07 != null) {
                while (A07.moveToNext()) {
                    if (A0I) {
                        userJid = C003101m.A06(A07.getString(0));
                    } else {
                        userJid = (UserJid) this.A01.A07(UserJid.class, A07.getLong(0));
                    }
                    if (userJid != null) {
                        C0Hr c0Hr = new C0Hr(this.A00, userJid, A07.getLong(A07.getColumnIndexOrThrow("message_table_id")), A07.getLong(A07.getColumnIndexOrThrow("last_read_message_table_id")), A07.getLong(A07.getColumnIndexOrThrow("last_read_receipt_sent_message_table_id")), A07.getLong(A07.getColumnIndexOrThrow("first_unread_message_table_id")), A07.getLong(A07.getColumnIndexOrThrow("autodownload_limit_message_table_id")), A07.getLong(A07.getColumnIndexOrThrow("timestamp")), A07.getInt(A07.getColumnIndexOrThrow("unseen_count")), A07.getInt(A07.getColumnIndexOrThrow("total_count")));
                        concurrentHashMap.put(c0Hr.A0A, c0Hr);
                    }
                }
            }
            if (A07 != null) {
                A07.close();
            }
            if (A0I) {
                C05C c05c = this.A03;
                String A02 = c05c.A02("status_list_ready");
                if ((A02 == null ? 0 : Integer.parseInt(A02)) != 1) {
                    C05B c05b = this.A01;
                    if (c05b.A0C()) {
                        C0CD A04 = this.A02.A04();
                        try {
                            C0HC c0hc = new C0HC();
                            C03790Hb A01 = A04.A01();
                            c0hc.A02 = "StatusStore/convertStatusListToV2";
                            c0hc.A03 = true;
                            c0hc.A03();
                            for (C0Hr c0Hr2 : concurrentHashMap.values()) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("jid_row_id", Long.valueOf(c05b.A02(c0Hr2.A0A)));
                                A03(contentValues, c0Hr2);
                                A04.A02.A02("status", contentValues);
                            }
                            A04.A02.A01("status_list", null, null);
                            c05c.A04("status_list_ready", 1);
                            A01.A00();
                            A01.close();
                            c0hc.A01();
                            return concurrentHashMap;
                        } finally {
                        }
                    }
                }
            }
            return concurrentHashMap;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (A07 != null) {
                    try {
                        A07.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    public final void A0C() {
        if (this.A05 == null) {
            C0CD A03 = this.A02.A03();
            try {
                if (A0I()) {
                    C03790Hb A01 = A03.A01();
                    synchronized (this.A04) {
                        if (this.A05 == null) {
                            this.A05 = A0B(A03);
                        }
                    }
                    A01.A00();
                    A01.close();
                } else {
                    synchronized (this.A04) {
                        if (this.A05 == null) {
                            this.A05 = A0B(A03);
                        }
                    }
                }
                A03.close();
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
    }

    public void A0D(int i, Collection collection) {
        ArrayList A0E = collection == null ? null : C003101m.A0E(collection);
        C05C c05c = this.A03;
        c05c.A04("status_distribution", i);
        if (A0E != null) {
            if (i == 2) {
                c05c.A06("status_black_list", TextUtils.join(",", A0E));
            } else if (i != 1) {
            } else {
                c05c.A06("status_white_list", TextUtils.join(",", A0E));
            }
        }
    }

    public void A0E(UserJid userJid) {
        C0CD A04 = this.A02.A04();
        try {
            boolean A0I = A0I();
            C0CE c0ce = A04.A02;
            String str = A0I ? "status_list" : "status";
            String str2 = A0I ? "key_remote_jid=?" : "jid_row_id=?";
            String[] A0L = A0L(A0I, userJid);
            A01("deleteStatus/DELETE", A0I);
            c0ce.A01(str, str2, A0L);
            A0C();
            this.A05.remove(userJid);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A0F(UserJid userJid, int i, int i2) {
        boolean A0I = A0I();
        C0CD A04 = this.A02.A04();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("unseen_count", Integer.valueOf(i));
            contentValues.put("total_count", Integer.valueOf(i2));
            C0CE c0ce = A04.A02;
            String str = A0I ? "status_list" : "status";
            String str2 = A0I ? "key_remote_jid=?" : "jid_row_id=?";
            String[] A0L = A0L(A0I, userJid);
            A01("updateStatusCount/UPDATE", A0I);
            if (c0ce.A00(str, contentValues, str2, A0L) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/updateStatusCount/update count failed jid=");
                sb.append(userJid);
                sb.append("; shouldUseDeprecatedTable=");
                sb.append(A0I);
                Log.e(sb.toString());
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A0G(UserJid userJid, C0Hr c0Hr) {
        C0CD A04 = this.A02.A04();
        try {
            boolean A0I = A0I();
            ContentValues contentValues = new ContentValues(8);
            A03(contentValues, c0Hr);
            C0CE c0ce = A04.A02;
            String str = A0I ? "status_list" : "status";
            String str2 = A0I ? "key_remote_jid=?" : "jid_row_id=?";
            String[] A0L = A0L(A0I, userJid);
            A01("updateStatus/UPDATE", A0I);
            if (c0ce.A00(str, contentValues, str2, A0L) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/updateStatus/failed jid=");
                sb.append(userJid);
                sb.append("; shouldUseDeprecatedTable=");
                sb.append(A0I);
                Log.e(sb.toString());
            }
            A0C();
            this.A05.put(userJid, c0Hr);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean A0H() {
        return this.A03.A02("status_distribution") != null;
    }

    public boolean A0I() {
        String A02 = this.A03.A02("status_list_ready");
        return A02 == null || Integer.parseInt(A02) == 0;
    }

    public boolean A0J(AnonymousClass092 anonymousClass092) {
        C000700j.A08(C003101m.A0Z(anonymousClass092.A0n.A00), "isStatusExpired should be called for statuses only");
        if (!C003101m.A0Y(anonymousClass092.A0A())) {
            return anonymousClass092.A0E < this.A00.A05() - 86400000;
        }
        C05C c05c = this.A03;
        String A02 = c05c.A02("status_psa_viewed_time");
        long parseLong = A02 == null ? 0L : Long.parseLong(A02);
        String A022 = c05c.A02("status_psa_exipration_time");
        long parseLong2 = A022 == null ? 0L : Long.parseLong(A022);
        return anonymousClass092.A0E < parseLong && parseLong2 != 0 && parseLong2 < this.A00.A05();
    }

    public boolean A0K(AnonymousClass092 anonymousClass092) {
        boolean z;
        if (anonymousClass092.A0n.A02) {
            return false;
        }
        C0Hr A07 = A07((UserJid) anonymousClass092.A0A());
        if (A07 == null) {
            StringBuilder A0P = C000200d.A0P("statusmsgstore/isstatusunseen/no status for ");
            A0P.append(anonymousClass092.A0A());
            Log.w(A0P.toString());
            return false;
        }
        synchronized (A07) {
            z = anonymousClass092.A0p > A07.A04;
        }
        return z;
    }

    public final String[] A0L(boolean z, UserJid userJid) {
        String valueOf;
        String[] strArr = new String[1];
        if (z) {
            valueOf = C003101m.A07(userJid);
        } else {
            valueOf = String.valueOf(userJid != null ? this.A01.A02(userJid) : -1L);
        }
        strArr[0] = valueOf;
        return strArr;
    }
}
