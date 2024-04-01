package X;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.0UB  reason: invalid class name */
/* loaded from: classes.dex */
public class C0UB {
    public EnumC02560Bx A00;
    public C0UA A01;

    public C0UB(C0MW c0mw, EnumC02560Bx enumC02560Bx) {
        C0UA reflectiveGenericLifecycleObserver;
        if (c0mw instanceof C0UA) {
            reflectiveGenericLifecycleObserver = (C0UA) c0mw;
        } else {
            Class<?> cls = c0mw.getClass();
            if (C09670eX.A00(cls) == 2) {
                List list = (List) C09670eX.A01.get(cls);
                if (list.size() == 1) {
                    C09670eX.A01((Constructor) list.get(0), c0mw);
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver();
                } else {
                    InterfaceC13890lz[] interfaceC13890lzArr = new InterfaceC13890lz[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        interfaceC13890lzArr[i] = C09670eX.A01((Constructor) list.get(i), c0mw);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC13890lzArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(c0mw);
            }
        }
        this.A01 = reflectiveGenericLifecycleObserver;
        this.A00 = enumC02560Bx;
    }

    public void A00(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
        EnumC02560Bx A01 = C02520Bt.A01(c0c1);
        EnumC02560Bx enumC02560Bx = this.A00;
        if (A01 != null && A01.compareTo(enumC02560Bx) < 0) {
            enumC02560Bx = A01;
        }
        this.A00 = enumC02560Bx;
        this.A01.AOy(interfaceC02360Aw, c0c1);
        this.A00 = A01;
    }
}
