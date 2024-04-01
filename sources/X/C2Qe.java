package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qe  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2Qe {
    public final Map A00 = new LinkedHashMap(3);

    public Map A00() {
        Map map = this.A00;
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(map);
    }
}
