package X;

import org.json.JSONObject;

/* renamed from: X.48z */
/* loaded from: classes3.dex */
public class C48z {
    public static volatile C48z A05;
    public AnonymousClass012 A00;
    public C001200o A01;
    public C0EU A02;
    public C014406v A03 = C014406v.A00("NetworkDeviceIdManager", "infra", "COMMON");
    public JSONObject A04;

    public C48z(AnonymousClass012 anonymousClass012, C001200o c001200o, C0EU c0eu) {
        this.A00 = anonymousClass012;
        this.A01 = c001200o;
        this.A02 = c0eu;
    }

    public static C48z A00() {
        if (A05 == null) {
            synchronized (C48z.class) {
                if (A05 == null) {
                    A05 = new C48z(AnonymousClass012.A00(), C001200o.A01, C0EU.A00());
                }
            }
        }
        return A05;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A01(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            org.json.JSONObject r1 = r6.A04     // Catch: java.lang.Throwable -> Ldf
            if (r1 != 0) goto L40
            X.0EU r0 = r6.A02     // Catch: org.json.JSONException -> L22 java.lang.Throwable -> Ldf
            android.content.SharedPreferences r2 = r0.A04()     // Catch: org.json.JSONException -> L22 java.lang.Throwable -> Ldf
            java.lang.String r1 = "payments_network_id_map"
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)     // Catch: org.json.JSONException -> L22 java.lang.Throwable -> Ldf
            if (r0 == 0) goto L1c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22 java.lang.Throwable -> Ldf
            r1.<init>(r0)     // Catch: org.json.JSONException -> L22 java.lang.Throwable -> Ldf
        L19:
            r6.A04 = r1     // Catch: org.json.JSONException -> L22 java.lang.Throwable -> Ldf
            goto L40
        L1c:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22 java.lang.Throwable -> Ldf
            r1.<init>()     // Catch: org.json.JSONException -> L22 java.lang.Throwable -> Ldf
            goto L19
        L22:
            r3 = move-exception
            X.06v r2 = r6.A03     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "JSONObject instantiation "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> Ldf
            r1.append(r0)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Ldf
            r2.A04(r0)     // Catch: java.lang.Throwable -> Ldf
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldf
            r1.<init>()     // Catch: java.lang.Throwable -> Ldf
            r6.A04 = r1     // Catch: java.lang.Throwable -> Ldf
        L40:
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> Ldf
            r3 = 0
            java.lang.String r5 = r1.optString(r4, r3)     // Catch: java.lang.Throwable -> Ldf
            monitor-exit(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L6c
            X.06v r2 = r6.A03
            java.lang.String r0 = "getNetworkId with CARD "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = ": from cache: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r2.A03(r0)
            return r5
        L6c:
            X.00o r0 = r6.A01
            android.app.Application r0 = r0.A00
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.ContentResolver r1 = r0.getContentResolver()
            java.lang.String r0 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)
            r2.append(r0)
            X.012 r0 = r6.A00
            long r0 = r0.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            byte[] r2 = r0.getBytes()
            r0 = 1
            r1 = 128(0x80, float:1.794E-43)
            if (r7 == r0) goto Lad
            r0 = 5
            if (r7 != r0) goto Lab
            r0 = 126(0x7e, float:1.77E-43)
            javax.crypto.SecretKey r0 = X.C02A.A05(r2, r2, r1, r0)
        La1:
            byte[] r1 = r0.getEncoded()
            r0 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r1, r0)
        Lab:
            monitor-enter(r6)
            goto Lb4
        Lad:
            r0 = 150(0x96, float:2.1E-43)
            javax.crypto.SecretKey r0 = X.C02A.A05(r2, r2, r1, r0)
            goto La1
        Lb4:
            org.json.JSONObject r0 = r6.A04     // Catch: org.json.JSONException -> Ld3 java.lang.Throwable -> Ldc
            r0.put(r4, r3)     // Catch: org.json.JSONException -> Ld3 java.lang.Throwable -> Ldc
            X.0EU r1 = r6.A02     // Catch: org.json.JSONException -> Ld3 java.lang.Throwable -> Ldc
            org.json.JSONObject r0 = r6.A04     // Catch: org.json.JSONException -> Ld3 java.lang.Throwable -> Ldc
            java.lang.String r2 = r0.toString()     // Catch: org.json.JSONException -> Ld3 java.lang.Throwable -> Ldc
            android.content.SharedPreferences r0 = r1.A04()     // Catch: org.json.JSONException -> Ld3 java.lang.Throwable -> Ldc
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch: org.json.JSONException -> Ld3 java.lang.Throwable -> Ldc
            java.lang.String r0 = "payments_network_id_map"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch: org.json.JSONException -> Ld3 java.lang.Throwable -> Ldc
            r0.apply()     // Catch: org.json.JSONException -> Ld3 java.lang.Throwable -> Ldc
            goto Lda
        Ld3:
            X.06v r1 = r6.A03     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r0 = "setDeviceId :: failed"
            r1.A04(r0)     // Catch: java.lang.Throwable -> Ldc
        Lda:
            monitor-exit(r6)
            return r3
        Ldc:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        Ldf:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48z.A01(int):java.lang.String");
    }
}
