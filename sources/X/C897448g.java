package X;

/* renamed from: X.48g */
/* loaded from: classes3.dex */
public class C897448g {
    public static volatile C897448g A02;
    public final C0EU A00;
    public final C48Y A01 = new C48Y();

    public C897448g(C0EU c0eu) {
        this.A00 = c0eu;
    }

    public static C897448g A00() {
        if (A02 == null) {
            synchronized (C897448g.class) {
                if (A02 == null) {
                    A02 = new C897448g(C0EU.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.security.KeyPair A01() {
        /*
            r9 = this;
            X.48Y r4 = r9.A01
            java.lang.String r3 = "alias-payments-br-trusted-device-key"
            r4.A00()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r7 = 0
            if (r1 < r0) goto L49
            X.48x r5 = r4.A00
            if (r5 == 0) goto L49
            r0 = 4
            android.security.keystore.KeyGenParameterSpec$Builder r2 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch: java.lang.Exception -> L68
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = "secp256r1"
            java.security.spec.ECGenParameterSpec r0 = new java.security.spec.ECGenParameterSpec     // Catch: java.lang.Exception -> L68
            r0.<init>(r1)     // Catch: java.lang.Exception -> L68
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r2.setAlgorithmParameterSpec(r0)     // Catch: java.lang.Exception -> L68
            r0 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r1.setKeySize(r0)     // Catch: java.lang.Exception -> L68
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L68
            r1 = 0
            java.lang.String r0 = "SHA-256"
            r2[r1] = r0     // Catch: java.lang.Exception -> L68
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r3.setDigests(r2)     // Catch: java.lang.Exception -> L68
            android.security.keystore.KeyGenParameterSpec r2 = r0.build()     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = "EC"
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r1, r0)     // Catch: java.lang.Exception -> L68
            r0.initialize(r2)     // Catch: java.lang.Exception -> L68
            java.security.KeyPair r2 = r0.generateKeyPair()     // Catch: java.lang.Exception -> L68
            goto L71
        L49:
            r4.A00()
            java.lang.String r0 = "secp256r1"
            java.security.spec.ECGenParameterSpec r1 = new java.security.spec.ECGenParameterSpec
            r1.<init>(r0)
            java.lang.String r0 = "EC"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r0)
            r0.initialize(r1)
            java.security.KeyPair r2 = r0.generateKeyPair()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.0FK r0 = new X.0FK
            r0.<init>(r2, r1)
            goto L7a
        L68:
            r2 = move-exception
            X.06v r1 = r5.A00
            java.lang.String r0 = ""
            r1.A08(r0, r2)
            r2 = r7
        L71:
            if (r2 == 0) goto L49
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.0FK r0 = new X.0FK
            r0.<init>(r2, r1)
        L7a:
            java.lang.Object r6 = r0.A00
            if (r6 != 0) goto L7f
            return r7
        L7f:
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto Le5
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Le2
            r8 = r6
            java.security.KeyPair r8 = (java.security.KeyPair) r8
            java.lang.String r7 = "td"
            X.0EU r5 = r9.A00     // Catch: org.json.JSONException -> Ldb
            java.lang.String r1 = r5.A06()     // Catch: org.json.JSONException -> Ldb
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> Ldb
            if (r0 != 0) goto Le2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ldb
            r4.<init>(r1)     // Catch: org.json.JSONException -> Ldb
            org.json.JSONObject r3 = r4.optJSONObject(r7)     // Catch: org.json.JSONException -> Ldb
            if (r3 != 0) goto Lac
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ldb
            r3.<init>()     // Catch: org.json.JSONException -> Ldb
        Lac:
            java.lang.String r1 = "td_public_key_bytes"
            java.security.PublicKey r0 = r8.getPublic()     // Catch: org.json.JSONException -> Ldb
            byte[] r0 = r0.getEncoded()     // Catch: org.json.JSONException -> Ldb
            r2 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch: org.json.JSONException -> Ldb
            r3.put(r1, r0)     // Catch: org.json.JSONException -> Ldb
            java.lang.String r1 = "td_private_key_bytes"
            java.security.PrivateKey r0 = r8.getPrivate()     // Catch: org.json.JSONException -> Ldb
            byte[] r0 = r0.getEncoded()     // Catch: org.json.JSONException -> Ldb
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch: org.json.JSONException -> Ldb
            r3.put(r1, r0)     // Catch: org.json.JSONException -> Ldb
            r4.put(r7, r3)     // Catch: org.json.JSONException -> Ldb
            java.lang.String r0 = r4.toString()     // Catch: org.json.JSONException -> Ldb
            r5.A0H(r0)     // Catch: org.json.JSONException -> Ldb
            goto Le2
        Ldb:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore store failed"
            com.whatsapp.util.Log.w(r0, r1)
            throw r1
        Le2:
            java.security.KeyPair r6 = (java.security.KeyPair) r6
            return r6
        Le5:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897448g.A01():java.security.KeyPair");
    }
}
