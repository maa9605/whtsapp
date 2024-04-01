package androidx.work;

import X.AbstractC16420qN;
import X.C0OF;
import X.C16380qJ;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends AbstractC16420qN {
    @Override // X.AbstractC16420qN
    public C0OF A00(List inputs) {
        Object newInstance;
        C16380qJ c16380qJ = new C16380qJ();
        HashMap hashMap = new HashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(((C0OF) it.next()).A00).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(key);
                if (obj == null) {
                    if (!cls.isArray()) {
                        newInstance = Array.newInstance(cls, 1);
                        Array.set(newInstance, 0, value);
                        value = newInstance;
                        hashMap.put(key, value);
                    } else {
                        hashMap.put(key, value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance2 = Array.newInstance(cls2.getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance2, 0, length);
                            System.arraycopy(value, 0, newInstance2, length, length2);
                            value = newInstance2;
                        } else {
                            newInstance = Array.newInstance(cls2, 2);
                            Array.set(newInstance, 0, obj);
                            Array.set(newInstance, 1, value);
                            value = newInstance;
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        int length3 = Array.getLength(obj);
                        Object newInstance3 = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newInstance3, 0, length3);
                        Array.set(newInstance3, length3, value);
                        value = newInstance3;
                    } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                        int length4 = Array.getLength(value);
                        Object newInstance4 = Array.newInstance(cls2, length4 + 1);
                        System.arraycopy(value, 0, newInstance4, 0, length4);
                        Array.set(newInstance4, length4, obj);
                        value = newInstance4;
                    } else {
                        throw new IllegalArgumentException();
                    }
                    hashMap.put(key, value);
                }
            }
        }
        c16380qJ.A00(hashMap);
        C0OF c0of = new C0OF(c16380qJ.A00);
        C0OF.A01(c0of);
        return c0of;
    }
}
