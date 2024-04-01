package X;

/* renamed from: X.074 */
/* loaded from: classes.dex */
public class AnonymousClass074 {
    public static volatile AnonymousClass074 A05;
    public final C01B A00;
    public final AnonymousClass075 A01;
    public final C05S A02;
    public final C05E A03;
    public final C05L A04;

    public AnonymousClass074(C01B c01b, C05S c05s, C05L c05l, C05E c05e, AnonymousClass075 anonymousClass075) {
        this.A00 = c01b;
        this.A02 = c05s;
        this.A04 = c05l;
        this.A03 = c05e;
        this.A01 = anonymousClass075;
    }

    public static AnonymousClass074 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass074.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass074(C01B.A00(), C05S.A00(), C05L.A00(), C05E.A00(), AnonymousClass075.A00());
                }
            }
        }
        return A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
        if (r8 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C07880aF A01(long r10) {
        /*
            r9 = this;
            X.05E r0 = r9.A03
            X.0CD r7 = r0.A03()
            X.0CE r4 = r7.A02     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "SELECT host_storage, actual_actors, privacy_mode_ts, business_name FROM message_privacy_state WHERE message_row_id=?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L69
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch: java.lang.Throwable -> L69
            r2[r1] = r0     // Catch: java.lang.Throwable -> L69
            android.database.Cursor r8 = r4.A07(r3, r2)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L5f
            java.lang.String r0 = "host_storage"
            int r3 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "actual_actors"
            int r2 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "privacy_mode_ts"
            int r1 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "business_name"
            int r6 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L58
            boolean r0 = r8.moveToNext()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L5f
            X.0aF r5 = new X.0aF     // Catch: java.lang.Throwable -> L58
            r5.<init>()     // Catch: java.lang.Throwable -> L58
            int r4 = r8.getInt(r3)     // Catch: java.lang.Throwable -> L58
            int r3 = r8.getInt(r2)     // Catch: java.lang.Throwable -> L58
            int r0 = r8.getInt(r1)     // Catch: java.lang.Throwable -> L58
            long r1 = (long) r0     // Catch: java.lang.Throwable -> L58
            X.0Ns r0 = new X.0Ns     // Catch: java.lang.Throwable -> L58
            r0.<init>(r4, r3, r1)     // Catch: java.lang.Throwable -> L58
            r5.A00 = r0     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r8.getString(r6)     // Catch: java.lang.Throwable -> L58
            r5.A01 = r0     // Catch: java.lang.Throwable -> L58
            goto L62
        L58:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L5e
        L5e:
            throw r0     // Catch: java.lang.Throwable -> L69
        L5f:
            r5 = 0
            if (r8 == 0) goto L65
        L62:
            r8.close()     // Catch: java.lang.Throwable -> L69
        L65:
            r7.close()
            return r5
        L69:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L6f
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass074.A01(long):X.0aF");
    }

    public void A02(long j) {
        C0CD A04 = this.A03.A04();
        try {
            C0CF A01 = this.A04.A01("DELETE FROM message_privacy_state WHERE message_row_id = ?");
            A01.A04(1, j);
            A01.A00();
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

    public void A03(AnonymousClass092 anonymousClass092) {
        C07880aF A01;
        if (this.A00.A0E(C01C.A0W) && (A01 = A01(anonymousClass092.A0p)) != null) {
            anonymousClass092.A0Y = A01.A01;
            anonymousClass092.A0O = A01.A00;
        }
    }
}
