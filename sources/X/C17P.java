package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.17P  reason: invalid class name */
/* loaded from: classes.dex */
public final class C17P {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Map A03;
    public final boolean A04;

    public C17P(AnonymousClass174 anonymousClass174, Map map, long j, boolean z, long j2, int i) {
        String A00;
        C07K.A1P(anonymousClass174);
        C07K.A1P(map);
        this.A02 = j;
        this.A04 = z;
        this.A01 = j2;
        this.A00 = i;
        TextUtils.isEmpty(null);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key != null && key.toString().startsWith("&") && (A00 = A00(anonymousClass174, entry.getKey())) != null) {
                hashMap.put(A00, A01(anonymousClass174, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key2 = entry2.getKey();
            if (key2 == null || !key2.toString().startsWith("&")) {
                String A002 = A00(anonymousClass174, entry2.getKey());
                if (A002 != null) {
                    hashMap.put(A002, A01(anonymousClass174, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.A03 = Collections.unmodifiableMap(hashMap);
    }

    public static String A00(AnonymousClass174 anonymousClass174, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            anonymousClass174.A0A("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    public static String A01(AnonymousClass174 anonymousClass174, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length > 8192) {
            String substring = obj2.substring(0, 8192);
            anonymousClass174.A0A("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
            return substring;
        }
        return obj2;
    }

    public final String toString() {
        StringBuilder A0P = C000200d.A0P("ht=");
        A0P.append(this.A02);
        long j = this.A01;
        if (j != 0) {
            A0P.append(", dbId=");
            A0P.append(j);
        }
        int i = this.A00;
        if (i != 0) {
            A0P.append(", appUID=");
            A0P.append(i);
        }
        Map map = this.A03;
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            C000200d.A1T(A0P, ", ", str, "=");
            A0P.append((String) map.get(str));
        }
        return A0P.toString();
    }
}
