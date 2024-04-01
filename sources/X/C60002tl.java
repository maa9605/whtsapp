package X;

/* renamed from: X.2tl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60002tl {
    public static volatile C60002tl A05;
    public final AnonymousClass012 A00;
    public final C05Q A01;
    public final C0C9 A02;
    public final C05E A03;
    public final C07B A04;

    public C60002tl(AnonymousClass012 anonymousClass012, C0C9 c0c9, C05Q c05q, C05E c05e, C07B c07b) {
        this.A00 = anonymousClass012;
        this.A02 = c0c9;
        this.A01 = c05q;
        this.A03 = c05e;
        this.A04 = c07b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00() {
        /*
            r17 = this;
            r8 = r17
            X.012 r0 = r8.A00
            long r15 = r0.A05()
            r0 = 2678400000(0x9fa52400, double:1.323305426E-314)
            long r15 = r15 - r0
            r7 = 1
            r6 = 0
        L10:
            X.05E r0 = r8.A03     // Catch: java.lang.Exception -> Le3
            X.0CD r3 = r0.A04()     // Catch: java.lang.Exception -> Le3
            X.0Hb r14 = r3.A00()     // Catch: java.lang.Throwable -> Ldc
            r2 = 200(0xc8, float:2.8E-43)
            X.0CE r10 = r3.A02     // Catch: java.lang.Throwable -> Ld5
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> Ld5
            r1[r6] = r0     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Ld5
            r1[r7] = r0     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = "SELECT message_row_id FROM mms_thumbnail_metadata WHERE insert_timestamp < ? LIMIT ?"
            android.database.Cursor r4 = r10.A07(r0, r1)     // Catch: java.lang.Throwable -> Ld5
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcc
            r2.<init>()     // Catch: java.lang.Throwable -> Lcc
        L38:
            boolean r0 = r4.moveToNext()     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L4a
            long r0 = r4.getLong(r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lcc
            r2.add(r0)     // Catch: java.lang.Throwable -> Lcc
            goto L38
        L4a:
            r4.close()     // Catch: java.lang.Throwable -> Ld5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
            r1.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan num messages to update:"
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld5
            int r0 = r2.size()     // Catch: java.lang.Throwable -> Ld5
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Ld5
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> Ld5
            int r0 = r2.size()     // Catch: java.lang.Throwable -> Ld5
            r13 = 0
            if (r0 <= 0) goto L6d
            r13 = 1
        L6d:
            java.util.Iterator r12 = r2.iterator()     // Catch: java.lang.Throwable -> Ld5
            r9 = 0
        L72:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> Ld5
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Ld5
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> Ld5
            X.05Q r0 = r8.A01     // Catch: java.lang.Throwable -> Ld5
            X.092 r11 = r0.A01(r4)     // Catch: java.lang.Throwable -> Ld5
            r2 = 0
            if (r11 == 0) goto L94
            r11.A0i(r2)     // Catch: java.lang.Throwable -> Ld5
            X.0C9 r1 = r8.A02     // Catch: java.lang.Throwable -> Ld5
            r0 = -1
            r1.A0m(r11, r0)     // Catch: java.lang.Throwable -> Ld5
        L94:
            X.07B r0 = r8.A04     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto Lcb
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Ld5
            r2[r6] = r0     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = "mms_thumbnail_metadata"
            java.lang.String r0 = "message_row_id = ?"
            int r0 = r10.A01(r1, r0, r2)     // Catch: java.lang.Throwable -> Ld5
            int r9 = r9 + r0
            goto L72
        Laa:
            r14.A00()     // Catch: java.lang.Throwable -> Ld5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
            r1.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan deleting rows:"
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld5
            r1.append(r9)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Ld5
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> Ld5
            r14.close()     // Catch: java.lang.Throwable -> Ldc
            r3.close()     // Catch: java.lang.Exception -> Le3
            if (r13 == 0) goto Le9
            goto L10
        Lcb:
            throw r2     // Catch: java.lang.Throwable -> Ld5
        Lcc:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lce
        Lce:
            r0 = move-exception
            if (r4 == 0) goto Ld4
            r4.close()     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            throw r0     // Catch: java.lang.Throwable -> Ld5
        Ld5:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r0 = move-exception
            r14.close()     // Catch: java.lang.Throwable -> Ldb
        Ldb:
            throw r0     // Catch: java.lang.Throwable -> Ldc
        Ldc:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lde
        Lde:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Le2
        Le2:
            throw r0     // Catch: java.lang.Exception -> Le3
        Le3:
            r1 = move-exception
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60002tl.A00():void");
    }
}
