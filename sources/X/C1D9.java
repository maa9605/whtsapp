package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.1D9  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1D9 {
    public Map A00;
    public final String A01;

    public C1D9(String str) {
        System.currentTimeMillis();
        this.A01 = str;
        this.A00 = null;
    }

    public void A00(C1DA c1da, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = new EnumMap(C1DA.class);
            this.A00 = map;
        }
        map.put(c1da, obj);
    }

    public String toString() {
        return this.A01;
    }
}
