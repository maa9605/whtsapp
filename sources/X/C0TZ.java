package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0TZ */
/* loaded from: classes.dex */
public abstract class C0TZ {
    public C12000ih A00;
    public C06410Ta A01;
    public C12020ij A02;

    public abstract int A01();

    public abstract int A02(Object obj);

    public abstract int A03(Object obj);

    public abstract Object A04(int i, int i2);

    public abstract Object A05(int i, Object obj);

    public abstract Map A06();

    public abstract void A07();

    public abstract void A08(int i);

    public abstract void A09(Object obj, Object obj2);

    public static boolean A00(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] A0A(Object[] objArr, int i) {
        int A01 = A01();
        if (objArr.length < A01) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), A01);
        }
        for (int i2 = 0; i2 < A01; i2++) {
            objArr[i2] = A04(i2, i);
        }
        if (objArr.length > A01) {
            objArr[A01] = null;
        }
        return objArr;
    }
}
