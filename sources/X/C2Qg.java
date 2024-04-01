package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.2Qg */
/* loaded from: classes2.dex */
public class C2Qg {
    public final Map A00 = new HashMap();
    public final Map A01 = new WeakHashMap();

    public synchronized void A00(C2Qi c2Qi) {
        String.format("UIObserver.fire: %s", c2Qi);
        Map map = (Map) this.A00.get(c2Qi.getClass());
        if (map == null) {
            return;
        }
        for (Object obj : map.keySet()) {
            C2Qk c2Qk = (C2Qk) map.get(obj);
            if (c2Qk != null) {
                c2Qk.AK4(c2Qi);
            }
        }
    }

    public synchronized void A01(Class cls, Object obj, C2Qk c2Qk) {
        Map map = this.A00;
        Map map2 = (Map) map.get(cls);
        if (map2 == null) {
            map2 = new WeakHashMap();
            map.put(cls, map2);
        }
        map2.put(obj, c2Qk);
        Map map3 = this.A01;
        Set set = (Set) map3.get(obj);
        if (set == null) {
            set = new HashSet();
            map3.put(obj, set);
        }
        set.add(cls);
    }

    public synchronized void A02(Object obj) {
        Map map = this.A01;
        Set<Class> set = (Set) map.get(obj);
        if (set != null) {
            for (Class cls : set) {
                Map map2 = (Map) this.A00.get(cls);
                if (map2 != null) {
                    map2.remove(obj);
                }
                Set set2 = (Set) map.get(obj);
                if (set2 != null) {
                    set2.remove(cls);
                }
            }
        }
    }
}
