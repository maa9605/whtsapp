package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.07p */
/* loaded from: classes.dex */
public abstract class AbstractC016307p implements C07T {
    public List A00;
    public List A01;
    public Map A02;
    public Map A03;
    public final EnumC20560xj A04;

    public abstract long A04();

    public abstract Object A07(Context context);

    public AbstractC016307p(EnumC20560xj enumC20560xj) {
        List<C08D> emptyList = Collections.emptyList();
        List<C08D> emptyList2 = Collections.emptyList();
        this.A04 = enumC20560xj;
        for (C08D c08d : emptyList) {
            A06(c08d);
        }
        for (C08D c08d2 : emptyList2) {
            List list = this.A00;
            if (list == null) {
                list = new ArrayList();
                this.A00 = list;
                if (this.A02 == null) {
                    this.A02 = new HashMap();
                } else {
                    throw new IllegalStateException("Extension Map and Extension List out of sync!");
                }
            }
            A03(this.A02, list, c08d2);
        }
    }

    public static void A00(List list, Context context, Object obj, Object obj2) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C08D c08d = (C08D) it.next();
            c08d.A00.A5g(context, obj, c08d.A01, obj2);
        }
    }

    public static void A01(List list, Context context, Object obj, Object obj2) {
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            C08D c08d = (C08D) list.get(size);
            c08d.A00.AVh(context, obj, c08d.A01, obj2);
        }
    }

    public static void A02(List list, List list2, Map map, Object obj, Object obj2, List list3, List list4) {
        if (list == null || list.isEmpty()) {
            if (list2 != null) {
                list3.addAll(list2);
            }
        } else if (list2 != null && !list2.isEmpty()) {
            HashMap hashMap = new HashMap(list2.size());
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C08D c08d = (C08D) it.next();
                C08C c08c = c08d.A00;
                Class<?> cls = c08c.getClass();
                C08D c08d2 = (C08D) map.get(cls);
                if (c08d2 == null) {
                    list3.add(c08d);
                } else {
                    boolean AUY = c08c.AUY(c08d2.A01, c08d.A01, obj, obj2);
                    hashMap.put(cls, Boolean.valueOf(AUY));
                    if (AUY) {
                        list3.add(c08d);
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C08D c08d3 = (C08D) it2.next();
                Class<?> cls2 = c08d3.A00.getClass();
                if (!hashMap.containsKey(cls2) || ((Boolean) hashMap.get(cls2)).booleanValue()) {
                    list4.add(c08d3);
                }
            }
        } else {
            list4.addAll(list);
        }
    }

    public static void A03(Map map, List list, C08D c08d) {
        Class<?> cls = c08d.A00.getClass();
        if (map.put(cls, c08d) != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((C08D) list.get(size)).A00.getClass() == cls) {
                    list.remove(size);
                }
            }
            throw new IllegalStateException("Extension Map and Extension List out of sync!");
        }
        list.add(c08d);
    }

    @Override // X.C07T
    /* renamed from: A05 */
    public AbstractC016307p AGA() {
        try {
            AbstractC016307p abstractC016307p = (AbstractC016307p) super.clone();
            List list = this.A01;
            if (list != null) {
                abstractC016307p.A01 = new ArrayList(list);
                abstractC016307p.A03 = new HashMap(this.A03);
            }
            List list2 = this.A00;
            if (list2 != null) {
                abstractC016307p.A00 = new ArrayList(list2);
                abstractC016307p.A02 = new HashMap(this.A02);
            }
            return abstractC016307p;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void A06(C08D c08d) {
        List list = this.A01;
        if (list == null) {
            list = new ArrayList();
            this.A01 = list;
            if (this.A03 == null) {
                this.A03 = new HashMap();
            } else {
                throw new IllegalStateException("Extension Map and Extension List out of sync!");
            }
        }
        A03(this.A03, list, c08d);
    }
}
