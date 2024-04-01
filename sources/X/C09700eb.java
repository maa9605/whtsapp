package X;

/* renamed from: X.0eb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09700eb {
    public final int A00;
    public final String A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C09700eb(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        this.A00 = i;
        this.A03 = bArr2;
        this.A02 = bArr;
        this.A04 = bArr3;
        this.A01 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[Catch: IllegalArgumentException -> 0x0081, IllegalArgumentException | JSONException -> 0x0083, TryCatch #2 {IllegalArgumentException | JSONException -> 0x0083, blocks: (B:6:0x000a, B:18:0x0027, B:19:0x002b, B:20:0x0030, B:22:0x0036, B:25:0x003e, B:28:0x0046, B:30:0x0049, B:32:0x0052, B:34:0x0056, B:50:0x0074, B:39:0x005d, B:41:0x0061, B:43:0x0064, B:45:0x0068, B:47:0x006b, B:53:0x007b, B:9:0x0016), top: B:60:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[Catch: IllegalArgumentException -> 0x0081, IllegalArgumentException | JSONException -> 0x0083, TryCatch #2 {IllegalArgumentException | JSONException -> 0x0083, blocks: (B:6:0x000a, B:18:0x0027, B:19:0x002b, B:20:0x0030, B:22:0x0036, B:25:0x003e, B:28:0x0046, B:30:0x0049, B:32:0x0052, B:34:0x0056, B:50:0x0074, B:39:0x005d, B:41:0x0061, B:43:0x0064, B:45:0x0068, B:47:0x006b, B:53:0x007b, B:9:0x0016), top: B:60:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C09700eb A00(org.json.JSONArray r11) {
        /*
            int r0 = r11.length()
            r6 = 2
            r5 = 0
            if (r0 >= r6) goto L9
            return r5
        L9:
            r0 = 0
            int r7 = r11.getInt(r0)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            r0 = 1
            java.lang.String r4 = r11.getString(r0)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r7 == 0) goto L16
            goto L1b
        L16:
            java.lang.String r3 = r11.getString(r6)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            goto L1e
        L1b:
            if (r7 == r6) goto L16
            r3 = r5
        L1e:
            r2 = 3
            if (r7 != r6) goto L22
            goto L27
        L22:
            r1 = r5
            if (r7 == r6) goto L2b
            r11 = r5
            goto L30
        L27:
            java.lang.String r1 = r11.getString(r2)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
        L2b:
            r0 = 4
            java.lang.String r11 = r11.getString(r0)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
        L30:
            byte[] r8 = android.util.Base64.decode(r4, r2)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r3 == 0) goto L3b
            byte[] r9 = android.util.Base64.decode(r3, r2)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            goto L3c
        L3b:
            r9 = r5
        L3c:
            if (r1 == 0) goto L43
            byte[] r10 = android.util.Base64.decode(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            goto L44
        L43:
            r10 = r5
        L44:
            if (r8 == 0) goto L7b
            int r0 = r8.length     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r0 <= 0) goto L7b
            X.0eb r6 = new X.0eb     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            int r1 = r6.A00     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r1 != 0) goto L5a
            byte[] r0 = r6.A03     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r0 == 0) goto L74
            int r0 = r0.length     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r0 <= 0) goto L74
            return r6
        L5a:
            r0 = 2
            if (r1 != r0) goto L7a
            byte[] r0 = r6.A03     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r0 == 0) goto L74
            int r0 = r0.length     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r0 <= 0) goto L74
            byte[] r0 = r6.A04     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r0 == 0) goto L74
            int r0 = r0.length     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r0 <= 0) goto L74
            java.lang.String r0 = r6.A01     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            if (r0 != 0) goto L74
            return r6
        L74:
            java.lang.String r0 = "KeyData/failed to parse json/key data not valid"
            com.whatsapp.util.Log.e(r0)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            return r5
        L7a:
            return r6
        L7b:
            java.lang.String r0 = "KeyData/failed to parse json/wrong data"
            com.whatsapp.util.Log.e(r0)     // Catch: java.lang.IllegalArgumentException -> L81 org.json.JSONException -> L83
            return r5
        L81:
            r1 = move-exception
            goto L84
        L83:
            r1 = move-exception
        L84:
            java.lang.String r0 = "KeyData/failed to parse json"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09700eb.A00(org.json.JSONArray):X.0eb");
    }
}
