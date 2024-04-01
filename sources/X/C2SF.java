package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2SF */
/* loaded from: classes2.dex */
public final class C2SF extends Handler implements C0KS {
    public final /* synthetic */ C27F A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2SF(C27F c27f) {
        super(c27f.getLooper());
        this.A00 = c27f;
    }

    @Override // X.C0KS
    public boolean AEU() {
        return hasMessages(4) || this.A00.A04.AEU();
    }

    @Override // X.C0KS
    public void ASQ() {
        obtainMessage(5).sendToTarget();
    }

    @Override // X.C0KS
    public void ASR(UserJid userJid, String str, boolean z, boolean z2) {
        String obj;
        StringBuilder A0P = C000200d.A0P("xmpp/connection/send/connect/");
        if (z2) {
            obj = "active";
        } else {
            StringBuilder A0P2 = C000200d.A0P("passive ");
            A0P2.append(this.A00.A0w.A01());
            obj = A0P2.toString();
        }
        A0P.append(obj);
        Log.i(A0P.toString());
        removeMessages(0);
        Message obtainMessage = obtainMessage(0);
        Bundle data = obtainMessage.getData();
        data.putString("jid", userJid.getRawString());
        data.putString("ipaddress", str);
        data.putBoolean("available", z);
        data.putBoolean("active_connection", z2);
        obtainMessage.sendToTarget();
    }

    @Override // X.C0KS
    public void AST(boolean z) {
        int i = z ? 2 : 1;
        hasMessages(0);
        hasMessages(i);
        removeMessages(i);
        removeMessages(0);
        Message obtainMessage = obtainMessage(i);
        obtainMessage.getData().putLong("requestTime", this.A00.A0I.A04());
        obtainMessage.sendToTarget();
    }

    @Override // X.C0KS
    public void ASW() {
        obtainMessage(8).sendToTarget();
    }

    @Override // X.C0KS
    public void ASX() {
        obtainMessage(3).sendToTarget();
    }

    @Override // X.C0KS
    public void ASY() {
        obtainMessage(7).sendToTarget();
    }

    @Override // X.C0KS
    public void ASZ() {
        obtainMessage(6).sendToTarget();
    }

    @Override // X.C0KS
    public void ASc(Message message) {
        message.what = 4;
        sendMessage(message);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1333:0x0325, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1357:0x041b, code lost:
        if (r22 != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2163:0x11a7, code lost:
        r8 = 3;
        r9 = 0;
        r7 = 8;
        r1 = 6;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2165:0x11b3, code lost:
        if (r0.A00 != false) goto L994;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2166:0x11b5, code lost:
        X.C000200d.A0g(r0, "connection_sequence_attempts", r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2167:0x11bd, code lost:
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2169:0x11c0, code lost:
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2171:0x11c3, code lost:
        X.C000200d.A0f(r0, "connection_sequence_state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2172:0x11cf, code lost:
        if (r0.A00 == false) goto L997;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2173:0x11d1, code lost:
        r24 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2174:0x11d3, code lost:
        r5.A02(r24, r19 - 1, r6 - 1, r74, r16, r25, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2175:0x11e9, code lost:
        if (r0.A00 == false) goto L1006;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2176:0x11eb, code lost:
        r0.obtainMessage(3, r4, r26).sendToTarget();
        r5.A04.ASS(r5.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2177:0x1201, code lost:
        if (r5.A0N.A00 == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2179:0x120b, code lost:
        if (X.C03460Fu.A0D(r5.A0J.A00) == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2180:0x120d, code lost:
        r4 = X.C02A.A0C(16);
        r3 = X.C03460Fu.A0F(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2181:0x1217, code lost:
        if (r3 == null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2182:0x1219, code lost:
        r0 = r5.A09;
        X.C03460Fu.A08(r0, r3);
        X.C03460Fu.A09(r0, r4);
        r5.A04.ASc(X.C003101m.A02(r3, r4, null));
        java.util.Arrays.toString(r4);
        java.util.Arrays.toString(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2183:0x1232, code lost:
        r0.obtainMessage(4, 1, 0).sendToTarget();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2184:0x123e, code lost:
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2186:0x1241, code lost:
        r11 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1931:0x0f28 A[Catch: all -> 0x1243, 2Ac -> 0x1247, TRY_ENTER, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1932:0x0f2e A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1933:0x0f34 A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1937:0x0f47 A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1940:0x0f5c A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1941:0x0f64 A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1945:0x0f7e A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1949:0x0f96 A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1950:0x0f9e A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1951:0x0fa5 A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1957:0x0fcc A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:1958:0x0fd2 A[Catch: all -> 0x1243, 2Ac -> 0x1247, TryCatch #172 {2Ac -> 0x1247, all -> 0x1243, blocks: (B:1310:0x0260, B:1311:0x026f, B:1312:0x0272, B:1931:0x0f28, B:1932:0x0f2e, B:1933:0x0f34, B:1935:0x0f3a, B:1936:0x0f41, B:1937:0x0f47, B:1939:0x0f56, B:1940:0x0f5c, B:1941:0x0f64, B:1943:0x0f6e, B:1944:0x0f76, B:1945:0x0f7e, B:1947:0x0f88, B:1948:0x0f8e, B:1949:0x0f96, B:1950:0x0f9e, B:1951:0x0fa5, B:1953:0x0fb4, B:1955:0x0fbe, B:1956:0x0fc6, B:1957:0x0fcc, B:1958:0x0fd2, B:1960:0x0fdc, B:1961:0x0fe2, B:1963:0x0fec, B:1964:0x0ff2), top: B:2303:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:2144:0x1170 A[Catch: 2Ac -> 0x1191, all -> 0x1332, TryCatch #180 {2Ac -> 0x1191, all -> 0x1332, blocks: (B:2142:0x116a, B:2144:0x1170, B:2146:0x1174, B:2148:0x117c, B:2153:0x118b, B:2149:0x1182, B:2151:0x1186, B:2154:0x1190), top: B:2297:0x116a }] */
    /* JADX WARN: Removed duplicated region for block: B:2201:0x1299  */
    /* JADX WARN: Removed duplicated region for block: B:2202:0x129b  */
    /* JADX WARN: Removed duplicated region for block: B:2209:0x12b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:2213:0x12c2  */
    /* JADX WARN: Removed duplicated region for block: B:2216:0x12dc  */
    /* JADX WARN: Removed duplicated region for block: B:2234:0x1341  */
    /* JADX WARN: Removed duplicated region for block: B:2237:0x135d  */
    /* JADX WARN: Removed duplicated region for block: B:2246:0x13a7  */
    /* JADX WARN: Removed duplicated region for block: B:2280:0x0b16 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2319:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2389:0x11a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2396:0x0ec4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2403:0x0e88 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2405:0x0f06 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2411:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2414:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2416:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.ClassNotFoundException] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v4 */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleMessage(android.os.Message r82) {
        /*
            Method dump skipped, instructions count: 5176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2SF.handleMessage(android.os.Message):void");
    }
}
