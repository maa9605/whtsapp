package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1cX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31601cX {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public static String A00(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty((String) obj) ? "" : obj.toString();
        } else if (obj instanceof Integer) {
            return ((Number) obj).intValue() == 0 ? "" : obj.toString();
        } else if (obj instanceof Long) {
            return ((Number) obj).longValue() == 0 ? "" : obj.toString();
        } else if (obj instanceof Double) {
            return ((Number) obj).doubleValue() == 0.0d ? "" : obj.toString();
        } else if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue() ? "" : obj.toString();
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object obj2 : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(A00(obj2, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (obj instanceof Map) {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String A00 = A00(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(A00)) {
                    if (i > 0 && !z) {
                        sb2.append("{");
                        i2 = sb2.length();
                        z = true;
                    }
                    if (sb2.length() > i2) {
                        sb2.append(", ");
                    }
                    C000200d.A1P(sb2, (String) entry.getKey(), '=', A00);
                }
            }
            if (z) {
                sb2.append("}");
            }
            return sb2.toString();
        } else {
            return obj.toString();
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.A00);
        hashMap.put("appVersion", this.A01);
        hashMap.put("appId", this.A02);
        hashMap.put("appInstallerId", this.A03);
        return A00(hashMap, 0);
    }
}
