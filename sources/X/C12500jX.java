package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.0jX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12500jX {
    public final C13040kV A01 = new C13040kV(10);
    public final C006802z A00 = new C006802z();
    public final ArrayList A02 = new ArrayList();
    public final HashSet A03 = new HashSet();

    public final void A00(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            AbstractList abstractList = (AbstractList) this.A00.getOrDefault(obj, null);
            if (abstractList != null) {
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    A00(abstractList.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
