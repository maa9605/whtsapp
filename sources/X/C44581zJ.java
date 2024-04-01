package X;

/* renamed from: X.1zJ */
/* loaded from: classes2.dex */
public class C44581zJ {
    public static volatile C44581zJ A03;
    public final C0C9 A00;
    public final C05B A01;
    public final C05E A02;

    public C44581zJ(C05B c05b, C0C9 c0c9, C05E c05e) {
        this.A01 = c05b;
        this.A00 = c0c9;
        this.A02 = c05e;
    }

    public static C44581zJ A00() {
        if (A03 == null) {
            synchronized (C44581zJ.class) {
                if (A03 == null) {
                    A03 = new C44581zJ(C05B.A00(), C0C9.A00(), C05E.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
        if (r1 > 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C2FF A01(X.AbstractC005302j r11, android.database.Cursor r12, X.C0CD r13) {
        /*
            r10 = this;
            java.lang.String r0 = "key_id"
            int r0 = r12.getColumnIndexOrThrow(r0)
            java.lang.String r7 = r12.getString(r0)
            java.lang.String r0 = "from_me"
            int r0 = r12.getColumnIndexOrThrow(r0)
            int r1 = r12.getInt(r0)
            r0 = 1
            r6 = 0
            if (r1 != r0) goto L19
            r6 = 1
        L19:
            java.lang.String r3 = "timestamp"
            if (r6 != 0) goto L5b
            int r0 = r12.getColumnIndexOrThrow(r3)
            long r4 = r12.getLong(r0)
        L25:
            r8 = r11
            boolean r0 = X.C003101m.A0U(r11)
            if (r0 == 0) goto La4
            if (r6 != 0) goto La4
            X.05E r0 = r10.A02
            r0.A05()
            X.05J r0 = r0.A06
            boolean r0 = r0.A0P(r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L92
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r12.getColumnIndexOrThrow(r0)
            long r0 = r12.getLong(r0)
            X.05B r2 = r10.A01
            com.whatsapp.jid.Jid r0 = r2.A04(r0)
            com.whatsapp.jid.UserJid r9 = com.whatsapp.jid.UserJid.of(r0)
            if (r9 != 0) goto La5
            r0 = 0
            throw r0
        L5b:
            java.lang.String r0 = "status"
            int r0 = r12.getColumnIndexOrThrow(r0)
            int r0 = r12.getInt(r0)
            r4 = 0
            if (r0 == 0) goto L25
            java.lang.String r0 = "receipt_server_timestamp"
            int r0 = r12.getColumnIndexOrThrow(r0)
            long r1 = r12.getLong(r0)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L87
            java.lang.String r0 = "receipt_device_timestamp"
            int r0 = r12.getColumnIndex(r0)
            if (r0 < 0) goto L89
            long r1 = r12.getLong(r0)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L89
        L87:
            r4 = r1
            goto L25
        L89:
            int r0 = r12.getColumnIndexOrThrow(r3)
            long r4 = r12.getLong(r0)
            goto L25
        L92:
            java.lang.String r0 = "sender_jid_raw_string"
            int r0 = r12.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r12.getString(r0)
            com.whatsapp.jid.UserJid r9 = com.whatsapp.jid.UserJid.getNullable(r0)
            if (r9 != 0) goto La5
            r0 = 0
            throw r0
        La4:
            r9 = 0
        La5:
            X.2FF r3 = new X.2FF
            r3.<init>(r4, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44581zJ.A01(X.02j, android.database.Cursor, X.0CD):X.2FF");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f8 A[Catch: all -> 0x0114, LOOP:0: B:150:0x00f8->B:209:0x00f8, LOOP_START, TRY_ENTER, TryCatch #18 {all -> 0x0147, blocks: (B:146:0x00b5, B:148:0x00f3, B:156:0x0110, B:147:0x00eb, B:150:0x00f8, B:152:0x00fe, B:154:0x0108, B:155:0x010c), top: B:197:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C44591zK A02(X.AbstractC005302j r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44581zJ.A02(X.02j, boolean):X.1zK");
    }
}
