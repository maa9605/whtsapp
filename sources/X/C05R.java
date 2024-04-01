package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.05R */
/* loaded from: classes.dex */
public class C05R {
    public static volatile C05R A03;
    public final C05B A00;
    public final C05E A01;
    public final C05C A02;

    public C05R(C05B c05b, C05C c05c, C05E c05e) {
        this.A00 = c05b;
        this.A02 = c05c;
        this.A01 = c05e;
    }

    public static C05R A00() {
        if (A03 == null) {
            synchronized (C05R.class) {
                if (A03 == null) {
                    A03 = new C05R(C05B.A00(), C05C.A00(), C05E.A00());
                }
            }
        }
        return A03;
    }

    public final ContentValues A01(C0D3 c0d3, C07950aM c07950aM) {
        ContentValues contentValues = new ContentValues();
        C05B c05b = this.A00;
        contentValues.put("jid_row_id", Long.valueOf(c05b.A02(c07950aM.A01)));
        contentValues.put("from_me", Integer.valueOf(c07950aM.A03 ? 1 : 0));
        contentValues.put("call_id", c07950aM.A02);
        contentValues.put("transaction_id", Integer.valueOf(c07950aM.A00));
        contentValues.put("timestamp", Long.valueOf(c0d3.A08));
        contentValues.put("video_call", Boolean.valueOf(c0d3.A0E));
        contentValues.put("duration", Integer.valueOf(c0d3.A01));
        contentValues.put("call_result", Integer.valueOf(c0d3.A00));
        contentValues.put("bytes_transferred", Long.valueOf(c0d3.A02));
        GroupJid groupJid = c0d3.A05;
        long j = 0;
        contentValues.put("group_jid_row_id", Long.valueOf(groupJid != null ? c05b.A02(groupJid) : 0L));
        contentValues.put("is_joinable_group_call", Boolean.valueOf(c0d3.A0D));
        DeviceJid deviceJid = c0d3.A04;
        if (deviceJid != null) {
            j = c05b.A02(deviceJid);
        }
        contentValues.put("call_creator_device_jid_row_id", Long.valueOf(j));
        contentValues.put("call_random_id", c0d3.A07);
        return contentValues;
    }

    public final C0D3 A02(Cursor cursor, Cursor cursor2) {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("call_id"));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("jid_row_id"));
        C05B c05b = this.A00;
        UserJid of = UserJid.of(c05b.A04(j2));
        if (!C003101m.A0b(of)) {
            StringBuilder sb = new StringBuilder("CallLogStore/readCallLogFromCursors/error getting jid; log jidRowId=");
            sb.append(j2);
            Log.e(sb.toString());
            return null;
        }
        C07950aM c07950aM = new C07950aM(of, cursor.getInt(cursor.getColumnIndexOrThrow("from_me")) > 0, string, cursor.getInt(cursor.getColumnIndexOrThrow("transaction_id")));
        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
        boolean z = cursor.getInt(cursor.getColumnIndexOrThrow("video_call")) > 0;
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("duration"));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("call_result"));
        long j4 = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_transferred"));
        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("group_jid_row_id"));
        boolean z2 = cursor.getInt(cursor.getColumnIndexOrThrow("is_joinable_group_call")) > 0;
        long j5 = cursor.getLong(cursor.getColumnIndexOrThrow("call_creator_device_jid_row_id"));
        ArrayList arrayList = new ArrayList();
        while (cursor2.moveToNext()) {
            long j6 = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"));
            int i4 = cursor2.getInt(cursor2.getColumnIndexOrThrow("jid_row_id"));
            UserJid of2 = UserJid.of(c05b.A04(i4));
            if (C003101m.A0b(of2)) {
                arrayList.add(new C0D4(j6, of2, cursor2.getInt(cursor2.getColumnIndexOrThrow("call_result"))));
            } else {
                C000200d.A0p("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=", i4);
            }
        }
        return new C0D3(c07950aM, null, j, j3, z, i, i2, j4, false, false, GroupJid.of(c05b.A04(i3)), z2, arrayList, DeviceJid.of(c05b.A04(j5)), cursor.getString(cursor.getColumnIndexOrThrow("call_random_id")));
    }

    public C0D3 A03(C07950aM c07950aM) {
        C0CD A032 = this.A01.A03();
        try {
            C0CE c0ce = A032.A02;
            String[] strArr = new String[4];
            strArr[0] = c07950aM.A02;
            C05B c05b = this.A00;
            strArr[1] = Long.toString(c05b.A02(c07950aM.A01));
            strArr[2] = c07950aM.A03 ? "1" : "0";
            strArr[3] = Integer.toString(c07950aM.A00);
            Cursor A07 = c0ce.A07("SELECT _id, timestamp, video_call, duration, call_result, bytes_transferred, group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id FROM call_log WHERE call_id = ? AND jid_row_id = ? AND from_me = ? AND transaction_id = ?", strArr);
            if (A07.moveToLast()) {
                Cursor A072 = c0ce.A07("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", new String[]{Long.toString(A07.getLong(A07.getColumnIndexOrThrow("_id")))});
                try {
                    long j = A07.getLong(A07.getColumnIndexOrThrow("_id"));
                    long j2 = A07.getLong(A07.getColumnIndexOrThrow("timestamp"));
                    boolean z = A07.getInt(A07.getColumnIndexOrThrow("video_call")) > 0;
                    int i = A07.getInt(A07.getColumnIndexOrThrow("duration"));
                    int i2 = A07.getInt(A07.getColumnIndexOrThrow("call_result"));
                    long j3 = A07.getLong(A07.getColumnIndexOrThrow("bytes_transferred"));
                    int i3 = A07.getInt(A07.getColumnIndexOrThrow("group_jid_row_id"));
                    boolean z2 = A07.getInt(A07.getColumnIndexOrThrow("is_joinable_group_call")) > 0;
                    long j4 = A07.getLong(A07.getColumnIndexOrThrow("call_creator_device_jid_row_id"));
                    ArrayList arrayList = new ArrayList();
                    while (A072.moveToNext()) {
                        long j5 = A072.getLong(A072.getColumnIndexOrThrow("_id"));
                        int i4 = A072.getInt(A072.getColumnIndexOrThrow("jid_row_id"));
                        UserJid of = UserJid.of(c05b.A04(i4));
                        if (C003101m.A0b(of)) {
                            arrayList.add(new C0D4(j5, of, A072.getInt(A072.getColumnIndexOrThrow("call_result"))));
                        } else {
                            C000200d.A0p("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=", i4);
                        }
                    }
                    C0D3 c0d3 = new C0D3(c07950aM, null, j, j2, z, i, i2, j3, false, false, GroupJid.of(c05b.A04(i3)), z2, arrayList, DeviceJid.of(c05b.A04(j4)), A07.getString(A07.getColumnIndexOrThrow("call_random_id")));
                    A072.close();
                    A07.close();
                    A032.close();
                    return c0d3;
                } finally {
                }
            } else {
                A07.close();
                A032.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A032.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public List A04(C10050fD c10050fD) {
        if (((AbstractC04290Jp) c10050fD).A00) {
            ArrayList arrayList = new ArrayList();
            C0D3 A18 = c10050fD.A18();
            if (A18 != null) {
                arrayList.add(A18);
            }
            return arrayList;
        }
        String[] strArr = {Long.toString(c10050fD.A0p)};
        ArrayList arrayList2 = new ArrayList();
        C05E c05e = this.A01;
        C0CD A032 = c05e.A03();
        try {
            c05e.A05();
            if (c05e.A06.A0R("call_logs")) {
                C0CE c0ce = A032.A02;
                Cursor A07 = c0ce.A07("SELECT _id, transaction_id, timestamp, video_call, duration, call_result, bytes_transferred FROM call_logs WHERE message_row_id = ?", strArr);
                int columnIndex = A07.getColumnIndex("_id");
                while (A07.moveToNext()) {
                    Cursor A072 = c0ce.A07("SELECT _id, jid, call_result FROM call_log_participant WHERE call_logs_row_id = ? ORDER BY _id", new String[]{Long.toString(A07.getLong(columnIndex))});
                    try {
                        long j = A07.getLong(A07.getColumnIndexOrThrow("_id"));
                        int i = A07.getInt(A07.getColumnIndexOrThrow("transaction_id"));
                        long j2 = A07.getLong(A07.getColumnIndexOrThrow("timestamp"));
                        boolean z = A07.getInt(A07.getColumnIndexOrThrow("video_call")) > 0;
                        int i2 = A07.getInt(A07.getColumnIndexOrThrow("duration"));
                        int i3 = A07.getInt(A07.getColumnIndexOrThrow("call_result"));
                        long j3 = A07.getLong(A07.getColumnIndexOrThrow("bytes_transferred"));
                        ArrayList arrayList3 = new ArrayList();
                        while (A072.moveToNext()) {
                            long j4 = A072.getLong(A072.getColumnIndexOrThrow("_id"));
                            UserJid nullable = UserJid.getNullable(A072.getString(A072.getColumnIndexOrThrow("jid")));
                            if (C003101m.A0b(nullable)) {
                                arrayList3.add(new C0D4(j4, nullable, A072.getInt(A072.getColumnIndexOrThrow("call_result"))));
                            }
                        }
                        C0D3 A00 = C0D3.A00(c10050fD, j, i, j2, z, i2, i3, j3, false, null, false, arrayList3);
                        if (A00 != null) {
                            arrayList2.add(A00);
                        }
                        A072.close();
                    } finally {
                    }
                }
                A07.close();
            }
            A032.close();
            return arrayList2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A032.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final void A05(C0D3 c0d3) {
        C000700j.A09(c0d3.A02() != -1, "CallLog row_id is not set");
        C0CD A04 = this.A01.A04();
        try {
            C03790Hb A00 = A04.A00();
            Iterator it = ((AbstractCollection) c0d3.A04()).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C0D4 c0d4 = (C0D4) next;
                if (c0d4.A01()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("call_log_row_id", Long.valueOf(c0d3.A02()));
                    contentValues.put("jid_row_id", Long.valueOf(this.A00.A02(c0d4.A02)));
                    contentValues.put("call_result", Integer.valueOf(c0d4.A00));
                    if (c0d4.A00() != -1) {
                        A04.A02.A00("call_log_participant_v2", contentValues, "_id=?", new String[]{Long.toString(c0d4.A00())});
                    } else {
                        long A05 = A04.A02.A05("call_log_participant_v2", contentValues);
                        synchronized (next) {
                            c0d4.A01 = A05;
                        }
                    }
                    synchronized (next) {
                        c0d4.A03 = false;
                    }
                }
            }
            c0d3.A02();
            A00.A00();
            A00.close();
            A04.close();
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

    public synchronized void A06(C0D3 c0d3) {
        C0CD A04 = this.A01.A04();
        C0CE c0ce = A04.A02;
        String[] strArr = new String[4];
        C05B c05b = this.A00;
        C07950aM c07950aM = c0d3.A09;
        strArr[0] = Long.toString(c05b.A02(c07950aM.A01));
        strArr[1] = c07950aM.A03 ? "1" : "0";
        strArr[2] = c07950aM.A02;
        strArr[3] = Integer.toString(c07950aM.A00);
        int A01 = c0ce.A01("call_log", "jid_row_id = ? AND from_me = ? AND call_id = ? AND transaction_id = ?", strArr);
        StringBuilder sb = new StringBuilder();
        sb.append("CallLogStore/deleteCallLog/rowId=");
        sb.append(c0d3.A02());
        sb.append("; count=");
        sb.append(A01);
        Log.i(sb.toString());
        A04.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x000e, code lost:
        if (r6.A0G() == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void A07(X.C0D3 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.A0C     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L10
            boolean r0 = r6.A0B     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L10
            boolean r0 = r6.A0G()     // Catch: java.lang.Throwable -> L50
            r1 = 1
            if (r0 != 0) goto L11
        L10:
            r1 = 0
        L11:
            java.lang.String r0 = "Only regular call log is stored here"
            X.C000700j.A09(r1, r0)     // Catch: java.lang.Throwable -> L50
            X.05E r0 = r5.A01     // Catch: java.lang.Throwable -> L50
            X.0CD r4 = r0.A04()     // Catch: java.lang.Throwable -> L50
            X.0Hb r3 = r4.A00()     // Catch: java.lang.Throwable -> L49
            X.0aM r0 = r6.A09     // Catch: java.lang.Throwable -> L42
            android.content.ContentValues r2 = r5.A01(r6, r0)     // Catch: java.lang.Throwable -> L42
            X.0CE r1 = r4.A02     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "call_log"
            long r0 = r1.A03(r0, r2)     // Catch: java.lang.Throwable -> L42
            r6.A09(r0)     // Catch: java.lang.Throwable -> L42
            r6.A05()     // Catch: java.lang.Throwable -> L42
            r5.A05(r6)     // Catch: java.lang.Throwable -> L42
            r3.A00()     // Catch: java.lang.Throwable -> L42
            r3.close()     // Catch: java.lang.Throwable -> L49
            r4.close()     // Catch: java.lang.Throwable -> L50
            monitor-exit(r5)
            return
        L42:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L44
        L44:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L48
        L48:
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L4f
        L4f:
            throw r0     // Catch: java.lang.Throwable -> L50
        L50:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05R.A07(X.0D3):void");
    }

    public boolean A08() {
        String A02 = this.A02.A02("call_log_ready");
        return A02 != null && Integer.parseInt(A02) == 1;
    }
}
