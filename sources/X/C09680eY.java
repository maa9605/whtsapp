package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0eY */
/* loaded from: classes.dex */
public class C09680eY {
    public static C09680eY A02 = new C09680eY();
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public static final void A00(Map map, C09710ec c09710ec, C0C1 c0c1, Class cls) {
        Object obj = map.get(c09710ec);
        if (obj == null) {
            map.put(c09710ec, c0c1);
        } else if (c0c1 != obj) {
            Method method = c09710ec.A01;
            StringBuilder A0P = C000200d.A0P("Method ");
            A0P.append(method.getName());
            A0P.append(" in ");
            A0P.append(cls.getName());
            A0P.append(" already declared with different @OnLifecycleEvent value: previous value ");
            A0P.append(obj);
            A0P.append(", new value ");
            A0P.append(c0c1);
            throw new IllegalArgumentException(A0P.toString());
        }
    }

    public final C09690ea A01(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C09690ea c09690ea = (C09690ea) this.A00.get(superclass);
            if (c09690ea == null) {
                c09690ea = A01(superclass, null);
            }
            hashMap.putAll(c09690ea.A01);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C09690ea c09690ea2 = (C09690ea) this.A00.get(cls2);
            if (c09690ea2 == null) {
                c09690ea2 = A01(cls2, null);
            }
            for (Map.Entry entry : c09690ea2.A01.entrySet()) {
                A00(hashMap, (C09710ec) entry.getKey(), (C0C1) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length > 0) {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC02360Aw.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                } else {
                    i = 0;
                }
                C0C1 value = onLifecycleEvent.value();
                if (length > 1) {
                    if (parameterTypes[1].isAssignableFrom(C0C1.class)) {
                        if (value != C0C1.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (length <= 2) {
                    A00(hashMap, new C09710ec(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C09690ea c09690ea3 = new C09690ea(hashMap);
        this.A00.put(cls, c09690ea3);
        this.A01.put(cls, Boolean.valueOf(z));
        return c09690ea3;
    }
}
