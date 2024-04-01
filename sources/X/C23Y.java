package X;

import com.whatsapp.util.Log;

/* renamed from: X.23Y  reason: invalid class name */
/* loaded from: classes2.dex */
public class C23Y {
    public static volatile C23Y A06;
    public final C06T A00;
    public final C05A A01;
    public final C05M A02;
    public final C05B A03;
    public final C05N A04;
    public final C05E A05;

    public C23Y(C05B c05b, C05A c05a, C05M c05m, C06T c06t, C05E c05e, C05N c05n) {
        this.A03 = c05b;
        this.A01 = c05a;
        this.A02 = c05m;
        this.A00 = c06t;
        this.A05 = c05e;
        this.A04 = c05n;
    }

    public static C23Y A00() {
        if (A06 == null) {
            synchronized (C23Y.class) {
                if (A06 == null) {
                    A06 = new C23Y(C05B.A00(), C05A.A00(), C05M.A00(), C06T.A02, C05E.A00(), C05N.A00());
                }
            }
        }
        return A06;
    }

    public void A01(AbstractC005302j abstractC005302j, String str) {
        StringBuilder sb = new StringBuilder("msgstore/updategroupchatsubject/");
        sb.append(abstractC005302j);
        Log.i(sb.toString());
        this.A00.A01(new RunnableEBaseShape0S1200000_I0(this, str, abstractC005302j, 7), 37);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r0 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(X.AbstractC005302j r8, java.lang.String r9, java.lang.Long r10) {
        /*
            r7 = this;
            X.05M r0 = r7.A02
            X.0IT r4 = r0.A07(r8)
            if (r4 != 0) goto L12
            X.0IT r4 = new X.0IT
            r4.<init>(r8)
            r4.A0R = r9
            r0.A0D(r8, r4)
        L12:
            r4.A0R = r9
            X.05E r0 = r7.A05     // Catch: java.lang.Error -> L84 java.lang.RuntimeException -> L86 android.database.sqlite.SQLiteDatabaseCorruptException -> L8b
            X.0CD r6 = r0.A04()     // Catch: java.lang.Error -> L84 java.lang.RuntimeException -> L86 android.database.sqlite.SQLiteDatabaseCorruptException -> L8b
            X.0Hb r5 = r6.A00()     // Catch: java.lang.Throwable -> L7d
            X.05A r3 = r7.A01     // Catch: java.lang.Throwable -> L76
            boolean r0 = r3.A0G()     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L2f
            android.content.ContentValues r0 = r4.A0E(r10)     // Catch: java.lang.Throwable -> L76
            boolean r0 = r3.A0J(r4, r0)     // Catch: java.lang.Throwable -> L76
            goto L53
        L2f:
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L76
            r0 = 3
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L73
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L73
            if (r10 == 0) goto L3d
            java.lang.String r0 = "created_timestamp"
            r2.put(r0, r10)     // Catch: java.lang.Throwable -> L73
        L3d:
            java.lang.String r1 = "subject"
            java.lang.String r0 = r4.A0R     // Catch: java.lang.Throwable -> L73
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L76
            boolean r0 = r3.A0I(r4, r2)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L55
            android.content.ContentValues r0 = r4.A0E(r10)     // Catch: java.lang.Throwable -> L76
            boolean r0 = r3.A0J(r4, r0)     // Catch: java.lang.Throwable -> L76
        L53:
            if (r0 != 0) goto L69
        L55:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r1.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "msgstore/addmsg/chatlist/insert/failed jid="
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            r1.append(r8)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L76
            com.whatsapp.util.Log.e(r0)     // Catch: java.lang.Throwable -> L76
        L69:
            r5.A00()     // Catch: java.lang.Throwable -> L76
            r5.close()     // Catch: java.lang.Throwable -> L7d
            r6.close()     // Catch: java.lang.Error -> L84 java.lang.RuntimeException -> L86 android.database.sqlite.SQLiteDatabaseCorruptException -> L8b
            return
        L73:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L76
            throw r0     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L7c
        L7c:
            throw r0     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L83
        L83:
            throw r0     // Catch: java.lang.Error -> L84 java.lang.RuntimeException -> L86 android.database.sqlite.SQLiteDatabaseCorruptException -> L8b
        L84:
            r0 = move-exception
            goto L87
        L86:
            r0 = move-exception
        L87:
            com.whatsapp.util.Log.e(r0)
            throw r0
        L8b:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
            X.05N r0 = r7.A04
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23Y.A02(X.02j, java.lang.String, java.lang.Long):void");
    }

    public void A03(C011005l c011005l, String str, long j) {
        StringBuilder sb = new StringBuilder("msgstore/updategroupchat/");
        sb.append(c011005l);
        sb.append(" creation=");
        sb.append(j);
        Log.i(sb.toString());
        this.A00.A01(new RunnableEBaseShape0S1200100_I0(this, str, j, c011005l, 2), 38);
    }
}
