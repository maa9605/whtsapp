package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.03R  reason: invalid class name */
/* loaded from: classes.dex */
public class C03R {
    public static final C03R A02 = new C03R();
    public int A00 = 64;
    public final Map A01 = new LinkedHashMap<String, String>() { // from class: X.03S
        {
            super(64, 0.75f, true);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 64;
        }
    };

    public synchronized String A00(String str) {
        String str2;
        Map map = this.A01;
        synchronized (map) {
            str2 = (String) map.get(str);
        }
        return str2;
    }
}
