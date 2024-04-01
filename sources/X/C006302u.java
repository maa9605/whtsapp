package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.02u  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C006302u {
    public static final C006402v A01 = new C006402v(null);
    public final Map A00 = new HashMap();

    public final C006402v A00(int i) {
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return A01;
        }
        return (C006402v) map.get(valueOf);
    }

    public final void A01(int i, Object obj) {
        if (obj == null) {
            this.A00.remove(Integer.valueOf(i));
            return;
        }
        C006402v c006402v = new C006402v(obj);
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf) && map.get(valueOf).equals(c006402v)) {
            return;
        }
        map.put(valueOf, c006402v);
    }
}
