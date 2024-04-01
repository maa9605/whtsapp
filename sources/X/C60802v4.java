package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2v4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60802v4 {
    public final C012005w A00;
    public final C02L A01;
    public final C01B A02;
    public final C03170Ep A03;
    public final C469829b A04;
    public final C05W A05;
    public final C000400f A06;
    public final C0E7 A07;
    public final C02E A08;
    public final C001200o A09;
    public final C02F A0A;
    public final C000500h A0B;
    public final C002301c A0C;
    public final C0GK A0D;
    public final C0GU A0E;
    public final C0H4 A0F;
    public final C42431vj A0G;
    public final C05E A0H;
    public final C003701t A0I;
    public final C0HA A0J;
    public final AnonymousClass011 A0K;
    public final C0DW A0L;
    public final AnonymousClass056 A0M;
    public final C05G A0N;
    public final C2AS A0O;

    public C60802v4(C003701t c003701t, C001200o c001200o, C02L c02l, C012005w c012005w, AnonymousClass011 anonymousClass011, C01B c01b, C0GU c0gu, C03170Ep c03170Ep, C05W c05w, C0GK c0gk, C02E c02e, C002301c c002301c, AnonymousClass056 anonymousClass056, C0HA c0ha, C000400f c000400f, C2AS c2as, C0H4 c0h4, C05E c05e, C0E7 c0e7, C02F c02f, C000500h c000500h, C0DW c0dw, C05G c05g, C42431vj c42431vj, C469829b c469829b) {
        this.A0I = c003701t;
        this.A09 = c001200o;
        this.A01 = c02l;
        this.A00 = c012005w;
        this.A0K = anonymousClass011;
        this.A02 = c01b;
        this.A0E = c0gu;
        this.A03 = c03170Ep;
        this.A05 = c05w;
        this.A0D = c0gk;
        this.A08 = c02e;
        this.A0C = c002301c;
        this.A0M = anonymousClass056;
        this.A0J = c0ha;
        this.A06 = c000400f;
        this.A0O = c2as;
        this.A0F = c0h4;
        this.A0H = c05e;
        this.A07 = c0e7;
        this.A0A = c02f;
        this.A0B = c000500h;
        this.A0L = c0dw;
        this.A0N = c05g;
        this.A0G = c42431vj;
        this.A04 = c469829b;
    }

    public static long[] A00(File file) {
        long[] jArr = {0, 0};
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    jArr[0] = file2.length() + jArr[0];
                    jArr[1] = jArr[1] + 1;
                } else if (file2.isDirectory()) {
                    long[] A00 = A00(file2);
                    jArr[0] = jArr[0] + A00[0];
                    jArr[1] = jArr[1] + A00[1];
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("mediafoldersize listedFiles is null for folder ");
            sb.append(file);
            Log.w(sb.toString());
        }
        return jArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(14:82|83|84|(1:86)|87|88|89|90|91|92|93|94|95|(48:97|98|100|101|102|103|104|(1:106)|107|(1:109)|110|(1:112)|113|(1:115)|116|(1:118)|119|(1:121)|122|(1:124)|125|(1:127)|128|(1:130)|131|(1:133)|134|(1:136)|137|(1:139)|140|(4:143|(3:145|146|147)(1:149)|148|141)|150|151|(4:154|(2:158|159)|160|152)|163|164|(2:166|(1:168))(1:221)|169|(4:171|(1:173)|174|(1:176))|177|(3:179|(1:181)|182)|183|(3:215|216|(1:218))|185|(2:187|(1:189)(1:190))|191|(5:197|670|202|6b1|207)(2:195|196))(49:226|227|228|229|103|104|(0)|107|(0)|110|(0)|113|(0)|116|(0)|119|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|137|(0)|140|(1:141)|150|151|(1:152)|163|164|(0)(0)|169|(0)|177|(0)|183|(0)|185|(0)|191|(1:193)|197|670))|90|91|92|93|94|95|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x043e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0440, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0442, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0444, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0445, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0446, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0447, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x044d, code lost:
        if (r3 == 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x044f, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0452, code lost:
        if (r6 != null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0454, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0457, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0458, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0459, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x045a, code lost:
        if (r3 != 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x045c, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x045f, code lost:
        if (r1 != 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:?, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:?, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c2, code lost:
        if (new java.io.File("/dev/com.genymotion.superuser.daemon").exists() == false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0334, code lost:
        if (r1 == false) goto L271;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03d9 A[LOOP:0: B:108:0x03d7->B:109:0x03d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0433 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x060f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x043a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x045c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0671 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x02fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038b  */
    /* JADX WARN: Type inference failed for: r0v289, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.security.MessageDigest] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x014c -> B:274:0x0158). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0153 -> B:274:0x0158). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01() {
        /*
            Method dump skipped, instructions count: 1757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60802v4.A01():void");
    }
}
