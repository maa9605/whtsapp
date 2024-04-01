package X;

/* renamed from: X.1v8 */
/* loaded from: classes2.dex */
public class C42121v8 {
    public static volatile C42121v8 A0E;
    public final C01B A00;
    public final C470029d A01;
    public final AnonymousClass012 A02;
    public final C001200o A03;
    public final C000500h A04;
    public final C003701t A05;
    public final AnonymousClass011 A06;
    public final C41461tx A07;
    public final C26X A08;
    public final C40291rx A09;
    public final C47872Cx A0A;
    public final C2Aa A0B;
    public final C462526a A0C;
    public final C41901uh A0D;

    public C42121v8(AnonymousClass012 anonymousClass012, C003701t c003701t, C001200o c001200o, AnonymousClass011 anonymousClass011, C01B c01b, C40291rx c40291rx, C470029d c470029d, C26X c26x, C47872Cx c47872Cx, C462526a c462526a, C2Aa c2Aa, C000500h c000500h, C41461tx c41461tx, C41901uh c41901uh) {
        this.A02 = anonymousClass012;
        this.A05 = c003701t;
        this.A03 = c001200o;
        this.A06 = anonymousClass011;
        this.A00 = c01b;
        this.A09 = c40291rx;
        this.A01 = c470029d;
        this.A08 = c26x;
        this.A0A = c47872Cx;
        this.A0C = c462526a;
        this.A0B = c2Aa;
        this.A04 = c000500h;
        this.A07 = c41461tx;
        this.A0D = c41901uh;
    }

    public synchronized void A00(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, int i) {
        A01(str, str2, str3, str4, str5, str6, z, str7, str8, i, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0259, code lost:
        if (r35 == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023c A[Catch: all -> 0x035a, TryCatch #3 {, blocks: (B:116:0x0003, B:122:0x001d, B:126:0x00a5, B:130:0x00b1, B:132:0x00ba, B:134:0x00c7, B:135:0x00d7, B:137:0x00ec, B:138:0x012d, B:147:0x0152, B:151:0x0167, B:153:0x0174, B:154:0x0185, B:156:0x018d, B:157:0x0190, B:172:0x01ef, B:174:0x01fc, B:176:0x0204, B:177:0x0221, B:178:0x0225, B:179:0x022c, B:181:0x022e, B:183:0x0235, B:185:0x023c, B:186:0x0247, B:188:0x024d, B:193:0x025d, B:195:0x0282, B:197:0x028a, B:198:0x0290, B:201:0x02ed, B:202:0x02f1, B:210:0x032d, B:207:0x030f, B:209:0x0328, B:211:0x0337, B:160:0x0199, B:162:0x019f, B:165:0x01aa, B:166:0x01bc, B:170:0x01c5, B:171:0x01da), top: B:221:0x0003, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0282 A[Catch: all -> 0x035a, TryCatch #3 {, blocks: (B:116:0x0003, B:122:0x001d, B:126:0x00a5, B:130:0x00b1, B:132:0x00ba, B:134:0x00c7, B:135:0x00d7, B:137:0x00ec, B:138:0x012d, B:147:0x0152, B:151:0x0167, B:153:0x0174, B:154:0x0185, B:156:0x018d, B:157:0x0190, B:172:0x01ef, B:174:0x01fc, B:176:0x0204, B:177:0x0221, B:178:0x0225, B:179:0x022c, B:181:0x022e, B:183:0x0235, B:185:0x023c, B:186:0x0247, B:188:0x024d, B:193:0x025d, B:195:0x0282, B:197:0x028a, B:198:0x0290, B:201:0x02ed, B:202:0x02f1, B:210:0x032d, B:207:0x030f, B:209:0x0328, B:211:0x0337, B:160:0x0199, B:162:0x019f, B:165:0x01aa, B:166:0x01bc, B:170:0x01c5, B:171:0x01da), top: B:221:0x0003, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ed A[Catch: all -> 0x035a, TryCatch #3 {, blocks: (B:116:0x0003, B:122:0x001d, B:126:0x00a5, B:130:0x00b1, B:132:0x00ba, B:134:0x00c7, B:135:0x00d7, B:137:0x00ec, B:138:0x012d, B:147:0x0152, B:151:0x0167, B:153:0x0174, B:154:0x0185, B:156:0x018d, B:157:0x0190, B:172:0x01ef, B:174:0x01fc, B:176:0x0204, B:177:0x0221, B:178:0x0225, B:179:0x022c, B:181:0x022e, B:183:0x0235, B:185:0x023c, B:186:0x0247, B:188:0x024d, B:193:0x025d, B:195:0x0282, B:197:0x028a, B:198:0x0290, B:201:0x02ed, B:202:0x02f1, B:210:0x032d, B:207:0x030f, B:209:0x0328, B:211:0x0337, B:160:0x0199, B:162:0x019f, B:165:0x01aa, B:166:0x01bc, B:170:0x01c5, B:171:0x01da), top: B:221:0x0003, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void A01(java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, java.lang.String r36, java.lang.String r37, int r38, java.lang.Integer r39, java.lang.Integer r40) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42121v8.A01(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.Integer):void");
    }
}
