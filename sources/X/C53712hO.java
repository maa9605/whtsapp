package X;

import android.util.JsonReader;

/* renamed from: X.2hO */
/* loaded from: classes2.dex */
public class C53712hO extends C2MQ {
    public C53712hO(AnonymousClass012 anonymousClass012, C455822q c455822q, C004902f c004902f, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C002301c c002301c, C50212Qr c50212Qr) {
        super(anonymousClass012, c455822q, c004902f, interfaceC002901k, anonymousClass011, c002301c, c50212Qr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:384:0x00c4, code lost:
        if (r2.equals("data") == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x012a, code lost:
        if (r2.equals("images") == false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0185, code lost:
        if (r4.equals("fixed_width_still") == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x01db, code lost:
        if (r5.equals("height") == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0263, code lost:
        if (r13.equals("height") == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x02b5, code lost:
        if (r21 != null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x02b7, code lost:
        r28 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x02c1, code lost:
        if (r20 != null) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x02c3, code lost:
        r28 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x031e, code lost:
        if (r0 == false) goto L89;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0440: IPUT  (r0v7 ?? I:java.lang.Integer), (r10 I:X.1lW) X.1lW.A01 java.lang.Integer, block:B:597:0x0439 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x044c: IPUT  (r0v4 ?? I:java.lang.Integer), (r10 I:X.1lW) X.1lW.A01 java.lang.Integer, block:B:599:0x0444 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0477: IPUT  (r0v11 ?? I:java.lang.Long), (r10 I:X.1lW) X.1lW.A05 java.lang.Long, block:B:603:0x046a */
    /* JADX WARN: Removed duplicated region for block: B:658:0x02c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x00ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C0FK A00(X.C53712hO r32, java.lang.String r33, X.C36881lW r34) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53712hO.A00(X.2hO, java.lang.String, X.1lW):X.0FK");
    }

    public static final C61422w7 A01(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        int i = -1;
        int i2 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1221029593) {
                if (hashCode == 116079) {
                    if (nextName.equals("url")) {
                        str = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    if (hashCode == 113126854 && nextName.equals("width")) {
                        i = Integer.parseInt(jsonReader.nextString());
                    }
                    jsonReader.skipValue();
                }
            } else if (nextName.equals("height")) {
                i2 = Integer.parseInt(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new C61422w7(str, i, i2);
        }
        return null;
    }
}
