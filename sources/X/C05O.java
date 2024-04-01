package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.05O */
/* loaded from: classes.dex */
public class C05O {
    public static volatile C05O A04;
    public final C05A A00;
    public final C05M A01;
    public final C05N A02;
    public final C05E A03;

    public C05O(C05A c05a, C05M c05m, C05E c05e, C05N c05n) {
        this.A00 = c05a;
        this.A01 = c05m;
        this.A03 = c05e;
        this.A02 = c05n;
    }

    public static C05O A00() {
        if (A04 == null) {
            synchronized (C05O.class) {
                if (A04 == null) {
                    C05A A00 = C05A.A00();
                    C05M A002 = C05M.A00();
                    C05E A003 = C05E.A00();
                    C05P.A00();
                    A04 = new C05O(A00, A002, A003, C05N.A00());
                }
            }
        }
        return A04;
    }

    public int A01(AbstractC005302j abstractC005302j, long j) {
        C0CD A03 = this.A03.A03();
        try {
            int i = 0;
            Cursor A07 = A03.A02.A07("SELECT COUNT(*) FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id > ?", new String[]{String.valueOf(this.A00.A05(abstractC005302j)), String.valueOf(j)});
            if (A07.moveToNext()) {
                i = A07.getInt(0);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getnewercount/db no message for ");
                sb.append(abstractC005302j);
                Log.i(sb.toString());
            }
            A07.close();
            return i;
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

    public int A02(AbstractC005302j abstractC005302j, long j) {
        C0CD A03 = this.A03.A03();
        try {
            int i = 0;
            Cursor A07 = A03.A02.A07("SELECT COUNT(*) FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND (message_type = '10') AND _id > ?", new String[]{String.valueOf(this.A00.A05(abstractC005302j)), String.valueOf(j)});
            if (A07.moveToNext()) {
                i = A07.getInt(0);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getnewercount/db no message for ");
                sb.append(abstractC005302j);
                Log.i(sb.toString());
            }
            A07.close();
            return i;
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

    public int A03(AbstractC005302j abstractC005302j, long j, long j2) {
        int i = 0;
        String[] strArr = {String.valueOf(this.A00.A05(abstractC005302j)), Long.toString(j), Long.toString(j2)};
        C0CD A03 = this.A03.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT COUNT(*) FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id>? AND _id<=?", strArr);
            if (A07.moveToNext()) {
                i = A07.getInt(0);
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getmessagesatid/pos:");
                sb.append(i);
                Log.i(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("msgstore/getmessagesatid/db no message for ");
                sb2.append(abstractC005302j);
                Log.i(sb2.toString());
            }
            A07.close();
            return i;
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x003e, code lost:
        if (r2 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A04() {
        /*
            r4 = this;
            X.05E r0 = r4.A03
            X.0CD r3 = r0.A03()
            X.0CE r2 = r3.A02     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = " SELECT _id FROM available_message_view ORDER BY _id DESC LIMIT 1"
            r0 = 0
            android.database.Cursor r2 = r2.A07(r1, r0)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r1.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "msgstore/lastmsgid/count "
            r1.append(r0)     // Catch: java.lang.Throwable -> L35
            int r0 = r2.getCount()     // Catch: java.lang.Throwable -> L35
            r1.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L35
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> L35
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L3c
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L35
            goto L40
        L35:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L3b
        L3b:
            throw r0     // Catch: java.lang.Throwable -> L47
        L3c:
            r0 = 1
            if (r2 == 0) goto L43
        L40:
            r2.close()     // Catch: java.lang.Throwable -> L47
        L43:
            r3.close()
            return r0
        L47:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L4d
        L4d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05O.A04():long");
    }

    /* JADX WARN: Finally extract failed */
    public long A05(long j) {
        C0HC c0hc = new C0HC();
        c0hc.A02 = "rowidstore/getRowIdByTimestamp";
        c0hc.A03 = true;
        c0hc.A03();
        C0CD A03 = this.A03.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT _id FROM available_message_view WHERE timestamp <= ? ORDER BY _id DESC LIMIT 1", new String[]{Long.toString(j)});
            if (A07 != null) {
                r2 = A07.moveToNext() ? A07.getLong(0) : 0L;
                A07.close();
            }
            A03.close();
            StringBuilder sb = new StringBuilder("rowidstore/getRowIdByTimestamp ");
            sb.append(r2);
            sb.append(" | time spent:");
            C000200d.A0m(c0hc, sb);
            return r2;
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

    public long A06(AbstractC005302j abstractC005302j) {
        C0IT A07 = this.A01.A07(abstractC005302j);
        if (A07 == null) {
            return 1L;
        }
        long j = A07.A0E;
        if (j != 1) {
            return j;
        }
        String[] strArr = {String.valueOf(this.A00.A05(abstractC005302j))};
        C0CD A03 = this.A03.A03();
        try {
            Cursor A072 = A03.A02.A07("   SELECT _id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') ORDER BY _id ASC LIMIT 1", strArr);
            if (A072 == null) {
                Log.w("msgstore/getfirstref/cursor is null");
            } else {
                if (A072.moveToFirst()) {
                    A07.A0E = A072.getLong(0);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("msgstore/getfirstref can't get value for ");
                    sb.append(abstractC005302j);
                    Log.w(sb.toString());
                }
                A072.close();
            }
            A03.close();
            return A07.A0E;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x004c, code lost:
        if (r2 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A07(X.AbstractC005302j r6) {
        /*
            r5 = this;
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            X.05A r0 = r5.A00
            long r0 = r0.A05(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = 0
            r2[r4] = r0
            X.05E r0 = r5.A03
            X.0CD r3 = r0.A03()
            X.0CE r1 = r3.A02     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "   SELECT _id FROM available_message_view WHERE chat_row_id = ? ORDER BY _id DESC LIMIT 1"
            android.database.Cursor r2 = r1.A07(r0, r2)     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "msgstore/lastmsgid/count "
            r1.append(r0)     // Catch: java.lang.Throwable -> L43
            int r0 = r2.getCount()     // Catch: java.lang.Throwable -> L43
            r1.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L43
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> L43
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L4a
            long r0 = r2.getLong(r4)     // Catch: java.lang.Throwable -> L43
            goto L4e
        L43:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L49
        L49:
            throw r0     // Catch: java.lang.Throwable -> L55
        L4a:
            r0 = 1
            if (r2 == 0) goto L51
        L4e:
            r2.close()     // Catch: java.lang.Throwable -> L55
        L51:
            r3.close()
            return r0
        L55:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L57
        L57:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05O.A07(X.02j):long");
    }

    public boolean A08(AbstractC005302j abstractC005302j, long j) {
        C0IT A07 = this.A01.A07(abstractC005302j);
        if (A07 == null) {
            return false;
        }
        long j2 = A07.A0E;
        if (j2 == 1) {
            if (abstractC005302j != null) {
                j2 = A06(abstractC005302j);
                A07.A0E = j2;
            } else {
                throw null;
            }
        }
        return j2 != 1 && j2 < j;
    }
}
