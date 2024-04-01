package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.2Dr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48072Dr {
    public static volatile C48072Dr A02;
    public final C003701t A00;
    public final Set A01;

    public C48072Dr(C003701t c003701t, Set set) {
        this.A00 = c003701t;
        this.A01 = Collections.unmodifiableSet(new HashSet(set));
    }

    public static C48072Dr A00() {
        if (A02 == null) {
            synchronized (C48072Dr.class) {
                if (A02 == null) {
                    A02 = new C48072Dr(C003701t.A00(), Collections.unmodifiableSet(new HashSet()));
                }
            }
        }
        return A02;
    }

    public static boolean A01(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (!str2.equals("all") && !str2.equals("none")) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            String lowerCase2 = str2.toLowerCase(locale);
            String trim = lowerCase.trim();
            if (TextUtils.isEmpty(trim) || trim.equals("none")) {
                return false;
            }
            boolean z = false;
            for (String str3 : trim.split(";")) {
                String trim2 = str3.trim();
                if (!TextUtils.isEmpty(trim2)) {
                    if (trim2.equals("all")) {
                        z = true;
                    }
                    if (trim2.equals(lowerCase2)) {
                        z = true;
                    }
                    if (trim2.startsWith("-") && lowerCase2.equals(trim2.substring(1))) {
                        return false;
                    }
                }
            }
            return z;
        }
        throw new IllegalArgumentException("Name 'none' and 'all' are not supported");
    }

    public int A02(String str) {
        C003701t c003701t = this.A00;
        if (A01(c003701t.A05(207), str)) {
            return 1;
        }
        return (!A01(c003701t.A05(208), str) && A01(c003701t.A05(209), str)) ? 3 : 2;
    }

    public long A03() {
        return this.A00.A03(261);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject A04(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L67
            java.lang.String r7 = "all"
            boolean r0 = r10.equals(r7)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "none"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L5f
            X.01t r1 = r9.A00
            r0 = 277(0x115, float:3.88E-43)
            org.json.JSONObject r2 = r1.A06(r0)
            java.lang.String r1 = "config"
            boolean r0 = r2.has(r1)
            r6 = 0
            if (r0 == 0) goto L52
            org.json.JSONArray r5 = r2.getJSONArray(r1)     // Catch: org.json.JSONException -> L54
            int r4 = r5.length()     // Catch: org.json.JSONException -> L54
            r3 = 0
            r8 = r6
            goto L35
        L32:
            r8 = r2
        L33:
            int r3 = r3 + 1
        L35:
            if (r3 >= r4) goto L5b
            org.json.JSONObject r2 = r5.getJSONObject(r3)     // Catch: org.json.JSONException -> L50
            java.lang.String r0 = "name"
            java.lang.String r1 = r2.getString(r0)     // Catch: org.json.JSONException -> L50
            boolean r0 = r7.equalsIgnoreCase(r1)     // Catch: org.json.JSONException -> L50
            if (r0 == 0) goto L48
            goto L32
        L48:
            boolean r0 = r10.equalsIgnoreCase(r1)     // Catch: org.json.JSONException -> L50
            if (r0 == 0) goto L33
            r6 = r2
            goto L5b
        L50:
            r1 = move-exception
            goto L56
        L52:
            r8 = r6
            goto L5b
        L54:
            r1 = move-exception
            r8 = r6
        L56:
            java.lang.String r0 = "failed to parse config for ab prop DB_VERIFICATION_CONTROLS_CODE"
            com.whatsapp.util.Log.e(r0, r1)
        L5b:
            if (r6 != 0) goto L5e
            return r8
        L5e:
            return r6
        L5f:
            java.lang.String r1 = "Name 'none' and 'all' are not supported"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L67:
            java.lang.String r1 = "Name should not be empty or null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48072Dr.A04(java.lang.String):org.json.JSONObject");
    }
}
