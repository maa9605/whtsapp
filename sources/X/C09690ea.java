package X;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0ea  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09690ea {
    public final Map A00 = new HashMap();
    public final Map A01;

    public C09690ea(Map map) {
        this.A01 = map;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            List list = (List) this.A00.get(value);
            if (list == null) {
                list = new ArrayList();
                this.A00.put(value, list);
            }
            list.add(entry.getKey());
        }
    }

    public static void A00(List list, InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C09710ec c09710ec = (C09710ec) list.get(size);
                if (c09710ec != null) {
                    try {
                        int i = c09710ec.A00;
                        if (i == 0) {
                            c09710ec.A01.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            c09710ec.A01.invoke(obj, interfaceC02360Aw);
                        } else if (i == 2) {
                            c09710ec.A01.invoke(obj, interfaceC02360Aw, c0c1);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                } else {
                    throw null;
                }
            }
        }
    }
}
