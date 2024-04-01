package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.24g  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C459224g {
    public final C006802z A00 = new C006802z();

    public final void A00(Object obj, List list, Set set) {
        if (list.contains(obj)) {
            return;
        }
        if (!set.contains(obj)) {
            set.add(obj);
            List<Object> list2 = (List) this.A00.getOrDefault(obj, null);
            if (list2 != null) {
                for (Object obj2 : list2) {
                    A00(obj2, list, set);
                }
            }
            set.remove(obj);
            list.add(obj);
            return;
        }
        throw new Exception() { // from class: X.2t5
        };
    }

    public boolean A01(Object obj, Object obj2) {
        C006802z c006802z = this.A00;
        if (c006802z.A02(obj) >= 0 && c006802z.A02(obj2) >= 0) {
            List list = (List) c006802z.getOrDefault(obj, null);
            if (list == null) {
                list = new ArrayList();
                c006802z.put(obj, list);
            }
            return list.add(obj2);
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }
}
