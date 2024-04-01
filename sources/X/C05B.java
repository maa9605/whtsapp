package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.05B */
/* loaded from: classes.dex */
public class C05B {
    public static volatile C05B A06;
    public final AbstractC000600i A00;
    public final C05E A01;
    public final C05C A02;
    public final C05L A03;
    public final Map A04 = new ConcurrentHashMap();
    public final Map A05 = new ConcurrentHashMap();

    public C05B(AbstractC000600i abstractC000600i, C05C c05c, C05L c05l, C05E c05e) {
        this.A00 = abstractC000600i;
        this.A02 = c05c;
        this.A03 = c05l;
        this.A01 = c05e;
    }

    public static C05B A00() {
        if (A06 == null) {
            synchronized (C05B.class) {
                if (A06 == null) {
                    A06 = new C05B(AbstractC000600i.A00(), C05C.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A06;
    }

    public static final void A01(String str, String str2, String str3, int i, int i2, int i3, String str4) {
        StringBuilder A0X = C000200d.A0X(str, " user=", str2, " server=", str3);
        A0X.append(" agent=");
        A0X.append(i);
        A0X.append(" device=");
        A0X.append(i2);
        A0X.append(" type=");
        A0X.append(i3);
        A0X.append(" rawString=");
        A0X.append(str4);
        Log.e(A0X.toString());
    }

    public long A02(final Jid jid) {
        Number number = (Number) this.A04.get(jid);
        if (number != null) {
            return number.longValue();
        }
        if (jid.user == null) {
            StringBuilder sb = new StringBuilder("JidStore/getRowIdForJid/Error creating a valid Jid object; jid=");
            sb.append(jid);
            Log.e(sb.toString());
            return -1L;
        }
        C0CD A04 = this.A01.A04();
        try {
            final long A03 = A03(jid);
            if (A03 > 0) {
                if (A04.A02.A00.inTransaction()) {
                    A04.A02(new Runnable() { // from class: X.1OL
                        {
                            C05B.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C05B.this.A0A(A03, jid);
                        }
                    });
                } else {
                    A0A(A03, jid);
                }
                A04.close();
                return A03;
            }
            C03790Hb A01 = A04.A01();
            final long A032 = A03(jid);
            if (A032 <= 0) {
                boolean z = true;
                try {
                    C0CF A012 = this.A03.A01("INSERT INTO jid (user, server, agent, device, type, raw_string) VALUES (?, ?, ?, ?, ?, ?)");
                    A012.A00.bindAllArgsAsStrings(new String[]{jid.user, jid.getServer(), Integer.toString(jid.getAgent()), Integer.toString(jid.getDevice()), Integer.toString(jid.getType()), jid.getRawString()});
                    A032 = A012.A01();
                } catch (SQLiteConstraintException e) {
                    C0CE c0ce = A04.A02;
                    Cursor A07 = c0ce.A07("SELECT _id, user, server, agent, device, type, raw_string FROM jid WHERE raw_string = ?", new String[]{jid.getRawString()});
                    try {
                        if (A07.moveToLast()) {
                            long j = A07.getLong(A07.getColumnIndexOrThrow("_id"));
                            boolean containsKey = this.A05.containsKey(Long.valueOf(j));
                            Jid A042 = A04(j);
                            if (A042 != null) {
                                int columnIndexOrThrow = A07.getColumnIndexOrThrow("device");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("JidStore/getRowIdForJid/raw_string UNIQUE constraint failed; jid=");
                                sb2.append(jid.getRawString());
                                sb2.append("; db.user=");
                                sb2.append(A07.getString(A07.getColumnIndexOrThrow("user")));
                                sb2.append("; db.server=");
                                sb2.append(A07.getString(A07.getColumnIndexOrThrow("server")));
                                sb2.append("; db.agent=");
                                sb2.append(A07.getInt(A07.getColumnIndexOrThrow("agent")));
                                sb2.append("; db.device=");
                                sb2.append(A07.isNull(columnIndexOrThrow) ? "<null>" : Integer.valueOf(A07.getInt(columnIndexOrThrow)));
                                sb2.append("; db.type=");
                                sb2.append(A07.getInt(A07.getColumnIndexOrThrow("type")));
                                sb2.append("; db.raw_string=");
                                sb2.append(A07.getString(A07.getColumnIndexOrThrow("raw_string")));
                                sb2.append("; errorRowId=");
                                sb2.append(j);
                                sb2.append("; inCache=");
                                sb2.append(containsKey);
                                sb2.append("; jidFromDb.user=");
                                sb2.append(A042.user);
                                sb2.append("; jidFromDb.server=");
                                sb2.append(A042.getServer());
                                sb2.append("; jidFromDb.agent=");
                                sb2.append(A042.getAgent());
                                sb2.append("; jidFromDb.device=");
                                sb2.append(A042.getDevice());
                                sb2.append("; jidFromDb.type=");
                                sb2.append(A042.getType());
                                sb2.append("; jidFromDb.raw_string=");
                                sb2.append(A042.getRawString());
                                sb2.append("; matchingJid=");
                                sb2.append(jid.equals(A042));
                                Log.e(sb2.toString());
                                if (jid.equals(A042)) {
                                    A032 = j;
                                }
                                z = false;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by row_id; jid=");
                                sb3.append(jid);
                                sb3.append("; errorRowId=");
                                sb3.append(j);
                                Log.e(sb3.toString());
                                c0ce.A01("jid", "raw_string = ?", new String[]{jid.getRawString()});
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by raw_string; jid=");
                            sb4.append(jid.getRawString());
                            Log.e(sb4.toString());
                            z = false;
                        }
                        A07.close();
                        if (!z) {
                            if (A032 <= 0) {
                                throw e;
                            }
                            AbstractC000600i abstractC000600i = this.A00;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("jid found by raws string; jid=");
                            sb5.append(jid.getRawString());
                            abstractC000600i.A09("JidStore/raw_string-constraint-failed", sb5.toString(), false);
                        }
                    } finally {
                    }
                }
            }
            A01.A00();
            if (A032 > 0) {
                A04.A02(new Runnable() { // from class: X.1OK
                    {
                        C05B.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C05B.this.A0A(A032, jid);
                    }
                });
                A01.close();
                A04.close();
                return A032;
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("JidStore/getRowIdForJid/Error inserting jid; jid=");
            sb6.append(jid);
            sb6.append("; rowId=");
            sb6.append(A032);
            Log.e(sb6.toString());
            A01.close();
            A04.close();
            return -1L;
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

    public final long A03(Jid jid) {
        long j;
        C0CD A04 = this.A01.A04();
        try {
            if (jid instanceof DeviceJid) {
                Cursor A07 = A04.A02.A07("SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND device = ? AND type = ?", new String[]{jid.user, jid.getServer(), Integer.toString(jid.getAgent()), Integer.toString(jid.getDevice()), Integer.toString(jid.getType())});
                j = A07.moveToLast() ? A07.getLong(A07.getColumnIndexOrThrow("_id")) : -1L;
                A07.close();
            } else {
                Cursor A072 = A04.A02.A07("SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND type = ?", new String[]{jid.user, jid.getServer(), Integer.toString(jid.getAgent()), Integer.toString(jid.getType())});
                j = A072.moveToLast() ? A072.getLong(A072.getColumnIndexOrThrow("_id")) : -1L;
                A072.close();
            }
            A04.close();
            return j;
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

    public Jid A04(long j) {
        if (j <= 0) {
            return null;
        }
        Map map = this.A05;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            return (Jid) map.get(valueOf);
        }
        C0CD A03 = this.A01.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", new String[]{Long.toString(j)});
            if (!A07.moveToLast()) {
                A07.close();
                A03.close();
                return null;
            }
            Jid A05 = A05(j, A07, A03, A07.getColumnIndexOrThrow("user"), A07.getColumnIndexOrThrow("server"), A07.getColumnIndexOrThrow("agent"), A07.getColumnIndexOrThrow("device"), A07.getColumnIndexOrThrow("type"), A07.getColumnIndexOrThrow("raw_string"));
            A07.close();
            A03.close();
            return A05;
        } finally {
        }
    }

    public Jid A05(final long j, Cursor cursor, C0CD c0cd, int i, int i2, int i3, int i4, int i5, int i6) {
        if (j <= 0) {
            return null;
        }
        Map map = this.A05;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            final Jid A062 = A06(cursor, i, i2, i3, i4, i5, i6);
            if (A062 != null) {
                if (!c0cd.A02.A00.inTransaction()) {
                    A0A(j, A062);
                    return A062;
                }
                c0cd.A02(new Runnable() { // from class: X.1OJ
                    {
                        C05B.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C05B.this.A0A(j, A062);
                    }
                });
            }
            return A062;
        }
        return (Jid) map.get(valueOf);
    }

    public Jid A06(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6) {
        String A07 = C002501g.A07(cursor, i);
        String A072 = C002501g.A07(cursor, i2);
        int i7 = cursor.getInt(i3);
        int i8 = cursor.isNull(i4) ? 0 : cursor.getInt(i4);
        int i9 = cursor.getInt(i5);
        String A073 = C002501g.A07(cursor, i6);
        try {
            Jid jid = Jid.get(A073);
            if (i9 == 0) {
                if (jid instanceof DeviceJid) {
                    jid = ((DeviceJid) jid).userJid;
                }
            } else if (i9 == 17 && (jid instanceof UserJid) && (jid = DeviceJid.of(jid)) == null) {
                throw null;
            }
            if (AnonymousClass024.A0k(A07, jid.user) && AnonymousClass024.A0k(A072, jid.getServer()) && i7 == jid.getAgent() && i8 == jid.getDevice() && i9 == jid.getType()) {
                return jid;
            }
            A01("jidstore/readjidfromcursor/cursormismatch", A07, A072, i7, i8, i9, A073);
            return null;
        } catch (C011305p unused) {
            if (i9 == 11 && TextUtils.isEmpty(A07) && TextUtils.isEmpty(A072) && i7 == 0 && i8 == 0 && TextUtils.isEmpty(A073)) {
                return C011405q.A00;
            }
            A01("jidstore/readjidfromcursor/invalidjid", A07, A072, i7, i8, i9, A073);
            return null;
        }
    }

    public Jid A07(Class cls, long j) {
        try {
            return (Jid) cls.cast(A04(j));
        } catch (ClassCastException e) {
            StringBuilder A0S = C000200d.A0S("JidStore/readJidByRowId/jid wrong class; rowId=", j, "; db_data=");
            A0S.append(A09(j));
            Log.e(A0S.toString(), e);
            this.A00.A09("JidStore/readJidByRowId", "invalid-jid-in-store", true);
            return null;
        }
    }

    public Jid A08(Class cls, long j, Cursor cursor, C0CD c0cd, int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            return (Jid) cls.cast(A05(j, cursor, c0cd, i, i2, i3, i4, i5, i6));
        } catch (ClassCastException e) {
            StringBuilder A0S = C000200d.A0S("JidStore/readJidByRowId/jid wrong class; rowId=", j, "; db_data=");
            A0S.append(A09(j));
            Log.e(A0S.toString(), e);
            this.A00.A09("invalid-jid-in-store", null, false);
            return null;
        }
    }

    public final String A09(long j) {
        C0CD A03 = this.A01.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", new String[]{Long.toString(j)});
            if (!A07.moveToLast()) {
                A07.close();
                A03.close();
                return null;
            }
            String string = A07.getString(A07.getColumnIndexOrThrow("user"));
            String string2 = A07.getString(A07.getColumnIndexOrThrow("server"));
            int i = A07.getInt(A07.getColumnIndexOrThrow("agent"));
            int columnIndexOrThrow = A07.getColumnIndexOrThrow("device");
            int i2 = A07.isNull(columnIndexOrThrow) ? 0 : A07.getInt(columnIndexOrThrow);
            int i3 = A07.getInt(A07.getColumnIndexOrThrow("type"));
            String string3 = A07.getString(A07.getColumnIndexOrThrow("raw_string"));
            StringBuilder sb = new StringBuilder();
            sb.append("user=");
            sb.append(string);
            sb.append("; server=");
            sb.append(string2);
            sb.append("; agent=");
            sb.append(i);
            sb.append("; device=");
            sb.append(i2);
            sb.append("; type=");
            sb.append(i3);
            sb.append("; rawString=");
            sb.append(string3);
            sb.append("; has_device=");
            sb.append(A07.isNull(columnIndexOrThrow) ? "no" : "yes");
            String obj = sb.toString();
            A07.close();
            A03.close();
            return obj;
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

    public final void A0A(long j, Jid jid) {
        Map map = this.A05;
        Long valueOf = Long.valueOf(j);
        map.put(valueOf, jid);
        this.A04.put(jid, valueOf);
    }

    public final void A0B(Cursor cursor) {
        while (cursor.moveToNext()) {
            String A07 = C002501g.A07(cursor, 0);
            if (!TextUtils.isEmpty(A07)) {
                for (String str : A07.split(",")) {
                    Jid nullable = Jid.getNullable(str);
                    if (nullable != null) {
                        A02(nullable);
                    }
                }
            }
        }
    }

    public boolean A0C() {
        return this.A02.A01("jid_ready", 0L) != 0;
    }
}
