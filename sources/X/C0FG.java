package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0FG  reason: invalid class name */
/* loaded from: classes.dex */
public class C0FG {
    public static volatile C0FG A05;
    public final C05B A00;
    public final C05E A01;
    public final C05L A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();

    public C0FG(C05B c05b, C05L c05l, C05E c05e) {
        this.A00 = c05b;
        this.A02 = c05l;
        this.A01 = c05e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:5:0x0004, B:15:0x0052, B:17:0x005b, B:18:0x005d, B:21:0x0060, B:6:0x0019, B:14:0x004f, B:27:0x0069), top: B:38:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x0071, TryCatch #2 {, blocks: (B:5:0x0004, B:15:0x0052, B:17:0x005b, B:18:0x005d, B:21:0x0060, B:6:0x0019, B:14:0x004f, B:27:0x0069), top: B:38:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C05130Nl A00(X.C011005l r9) {
        /*
            r8 = this;
            java.util.Map r4 = r8.A03
            monitor-enter(r4)
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L71
            r2 = 0
            X.05B r0 = r8.A00     // Catch: java.lang.Throwable -> L71
            long r0 = r0.A02(r9)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch: java.lang.Throwable -> L71
            r3[r2] = r0     // Catch: java.lang.Throwable -> L71
            X.05E r0 = r8.A01     // Catch: java.lang.Throwable -> L71
            X.0CD r6 = r0.A03()     // Catch: java.lang.Throwable -> L71
            X.0CE r1 = r6.A02     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "SELECT subject_timestamp, announcement_version FROM group_notification_version WHERE group_jid_row_id = ?"
            android.database.Cursor r7 = r1.A07(r0, r3)     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto L43
            boolean r0 = r7.moveToNext()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L43
            java.lang.String r0 = "subject_timestamp"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L61
            long r2 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "announcement_version"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L61
            long r0 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L61
            X.0Nl r5 = new X.0Nl     // Catch: java.lang.Throwable -> L61
            r5.<init>(r2, r0)     // Catch: java.lang.Throwable -> L61
            goto L4a
        L43:
            r0 = 0
            X.0Nl r5 = new X.0Nl     // Catch: java.lang.Throwable -> L61
            r5.<init>(r0, r0)     // Catch: java.lang.Throwable -> L61
        L4a:
            r4.put(r9, r5)     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L52
            r7.close()     // Catch: java.lang.Throwable -> L6a
        L52:
            r6.close()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r4.get(r9)     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L5f
            X.0Nl r0 = (X.C05130Nl) r0     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return r0
        L5f:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L71
        L61:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
            if (r7 == 0) goto L69
            r7.close()     // Catch: java.lang.Throwable -> L69
        L69:
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L70
        L70:
            throw r0     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FG.A00(X.05l):X.0Nl");
    }

    public void A01(final C011005l c011005l, long j) {
        C0CD A04 = this.A01.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CF A01 = this.A02.A01("UPDATE group_notification_version SET announcement_version = ? WHERE group_jid_row_id = ?");
            A01.A04(1, j);
            A01.A04(2, this.A00.A02(c011005l));
            if (A01.A00() != 1) {
                A03(c011005l, 0L, j, 0L);
            }
            A00.A00();
            A04.A02(new Runnable() { // from class: X.1OG
                @Override // java.lang.Runnable
                public final void run() {
                    C0FG c0fg = C0FG.this;
                    C011005l c011005l2 = c011005l;
                    Map map = c0fg.A03;
                    synchronized (map) {
                        map.remove(c011005l2);
                    }
                }
            });
            A00.close();
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

    public void A02(final C011005l c011005l, long j) {
        C0CD A04 = this.A01.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CF A01 = this.A02.A01("UPDATE group_notification_version SET subject_timestamp = ? WHERE group_jid_row_id = ?");
            A01.A04(1, j);
            A01.A04(2, this.A00.A02(c011005l));
            if (A01.A00() != 1) {
                A03(c011005l, j, 0L, 0L);
            }
            A00.A00();
            A04.A02(new Runnable() { // from class: X.1OH
                @Override // java.lang.Runnable
                public final void run() {
                    C0FG c0fg = C0FG.this;
                    C011005l c011005l2 = c011005l;
                    Map map = c0fg.A03;
                    synchronized (map) {
                        map.remove(c011005l2);
                    }
                }
            });
            A00.close();
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

    public final void A03(C011005l c011005l, long j, long j2, long j3) {
        C0CF A01 = this.A02.A01("INSERT INTO group_notification_version(group_jid_row_id, subject_timestamp, announcement_version, participant_version) VALUES (?, ?, ?, ?)");
        A01.A04(1, this.A00.A02(c011005l));
        A01.A04(2, j);
        A01.A04(3, j2);
        A01.A04(4, j3);
        A01.A01();
    }
}
