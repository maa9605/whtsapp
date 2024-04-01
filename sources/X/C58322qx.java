package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2qx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58322qx {
    public final Map A00 = new HashMap();
    public volatile Class A01;

    public C58322qx(List list) {
        for (Object obj : list) {
            if (obj != null) {
                Map map = this.A00;
                Class<?> cls = obj.getClass();
                if (!map.containsKey(cls)) {
                    this.A00.put(cls, obj);
                }
            }
            StringBuilder sb = new StringBuilder("Invalid banner ");
            sb.append(obj);
            throw new RuntimeException(sb.toString());
        }
    }
}
