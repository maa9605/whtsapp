package X;

/* renamed from: X.1wK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42791wK {
    public static volatile C42791wK A06;
    public final AbstractC000600i A00;
    public final AnonymousClass012 A01;
    public final C05A A02;
    public final C05D A03;
    public final C05N A04;
    public final C05E A05;

    public C42791wK(AnonymousClass012 anonymousClass012, C05A c05a, AbstractC000600i abstractC000600i, C05D c05d, C05E c05e, C05N c05n) {
        this.A01 = anonymousClass012;
        this.A02 = c05a;
        this.A00 = abstractC000600i;
        this.A03 = c05d;
        this.A05 = c05e;
        this.A04 = c05n;
    }

    public static C42791wK A00() {
        if (A06 == null) {
            synchronized (C42791wK.class) {
                if (A06 == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C05A A002 = C05A.A00();
                    AbstractC000600i A003 = AbstractC000600i.A00();
                    C05D A004 = C05D.A00();
                    C05E A005 = C05E.A00();
                    C05P.A00();
                    A06 = new C42791wK(A00, A002, A003, A004, A005, C05N.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (X.C003101m.A0Z(r2) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C42801wL A01(X.AnonymousClass094 r21) {
        /*
            r20 = this;
            r3 = r20
            X.012 r8 = r3.A01
            long r11 = r8.A04()
            r4 = r21
            X.02j r2 = r4.A00
            boolean r0 = X.C003101m.A0U(r2)
            r7 = 0
            r5 = 1
            if (r0 != 0) goto L1b
            boolean r0 = X.C003101m.A0Z(r2)
            r1 = 0
            if (r0 == 0) goto L1c
        L1b:
            r1 = 1
        L1c:
            java.lang.String r0 = "jid="
            java.lang.StringBuilder r0 = X.C000200d.A0P(r0)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            X.C000700j.A09(r1, r0)
            if (r2 == 0) goto Lb5
            java.lang.String r0 = r2.getRawString()
            X.1wL r2 = new X.1wL
            r2.<init>()
            r1 = 2
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r7] = r0
            java.lang.String r0 = r4.A01
            r9[r5] = r0
            X.05E r0 = r3.A05     // Catch: android.database.sqlite.SQLiteDatabaseCorruptException -> Lab
            X.0CD r4 = r0.A03()     // Catch: android.database.sqlite.SQLiteDatabaseCorruptException -> Lab
            X.0CE r6 = r4.A02     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "SELECT remote_resource, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM receipts WHERE key_remote_jid=? AND key_id=?"
            android.database.Cursor r6 = r6.A07(r0, r9)     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L86
        L50:
            boolean r0 = r6.moveToNext()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L86
            java.lang.String r0 = r6.getString(r7)     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L5f
            X.05q r0 = X.C011405q.A00     // Catch: java.lang.Throwable -> L9b
            goto L63
        L5f:
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch: java.lang.Throwable -> L9b
        L63:
            r10 = 0
            if (r0 == 0) goto L67
            r10 = 1
        L67:
            java.lang.String r9 = "receiptsmsgstore/invalid participant jid when getting receipts for group or status message"
            X.C000700j.A08(r10, r9)     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L50
            long r14 = r6.getLong(r5)     // Catch: java.lang.Throwable -> L9b
            long r16 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L9b
            r9 = 3
            long r18 = r6.getLong(r9)     // Catch: java.lang.Throwable -> L9b
            X.1wM r13 = new X.1wM     // Catch: java.lang.Throwable -> L9b
            r13.<init>(r14, r16, r18)     // Catch: java.lang.Throwable -> L9b
            java.util.concurrent.ConcurrentHashMap r9 = r2.A00     // Catch: java.lang.Throwable -> L9b
            r9.put(r0, r13)     // Catch: java.lang.Throwable -> L9b
            goto L50
        L86:
            X.05D r7 = r3.A03     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = "ReceiptsMessageStore/getMessageReceiptsForGroupOrStatusMessage"
            long r0 = r8.A04()     // Catch: java.lang.Throwable -> L9b
            long r0 = r0 - r11
            r7.A01(r5, r0)     // Catch: java.lang.Throwable -> L9b
            if (r6 == 0) goto L97
            r6.close()     // Catch: java.lang.Throwable -> La4
        L97:
            r4.close()     // Catch: android.database.sqlite.SQLiteDatabaseCorruptException -> Lab
            return r2
        L9b:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            if (r6 == 0) goto La3
            r6.close()     // Catch: java.lang.Throwable -> La3
        La3:
            throw r0     // Catch: java.lang.Throwable -> La4
        La4:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Laa
        Laa:
            throw r0     // Catch: android.database.sqlite.SQLiteDatabaseCorruptException -> Lab
        Lab:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
            X.05N r0 = r3.A04
            r0.A03()
            return r2
        Lb5:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42791wK.A01(X.094):X.1wL");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (X.C003101m.A0Z(r2) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C42801wL A02(X.AnonymousClass092 r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42791wK.A02(X.092):X.1wL");
    }
}
