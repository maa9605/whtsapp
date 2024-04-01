package X;

import android.text.TextUtils;
import android.util.JsonReader;

/* renamed from: X.2hN */
/* loaded from: classes2.dex */
public class C53702hN extends C2MQ {
    public C53702hN(AnonymousClass012 anonymousClass012, C455822q c455822q, C004902f c004902f, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C002301c c002301c, C50212Qr c50212Qr) {
        super(anonymousClass012, c455822q, c004902f, interfaceC002901k, anonymousClass011, c002301c, c50212Qr);
    }

    public static final C0FK A00(JsonReader jsonReader) {
        int[] iArr = new int[2];
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (true) {
            int i = 0;
            if (!jsonReader.hasNext()) {
                break;
            }
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -318184504) {
                if (hashCode == 116079) {
                    if (nextName.equals("url")) {
                        str = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    if (hashCode == 3083499 && nextName.equals("dims")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            if (i < 2) {
                                iArr[i] = jsonReader.nextInt();
                                i++;
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endArray();
                    }
                    jsonReader.skipValue();
                }
            } else if (nextName.equals("preview")) {
                str2 = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            return new C0FK(new C61422w7(str, i2, i3), new C61422w7(str2, i2, i3));
        }
        return new C0FK(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x00d3, code lost:
        if (r4.equals("results") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0140, code lost:
        if (r7.equals("id") == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x017a, code lost:
        if (r7.equals("tinymp4") == false) goto L83;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x028a: IPUT  (r0v6 ?? I:java.lang.Integer), (r12 I:X.1lW) X.1lW.A01 java.lang.Integer, block:B:291:0x0281 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0298: IPUT  (r0v4 ?? I:java.lang.Integer), (r12 I:X.1lW) X.1lW.A01 java.lang.Integer, block:B:293:0x028e */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x02c3: IPUT  (r0v9 ?? I:java.lang.Long), (r12 I:X.1lW) X.1lW.A05 java.lang.Long, block:B:297:0x02b6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C0FK A01(X.C53702hN r28, java.lang.String r29, X.C36881lW r30) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53702hN.A01(X.2hN, java.lang.String, X.1lW):X.0FK");
    }
}
