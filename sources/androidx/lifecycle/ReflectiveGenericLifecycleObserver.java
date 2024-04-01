package androidx.lifecycle;

import X.C09680eY;
import X.C09690ea;
import X.C0C1;
import X.C0UA;
import X.InterfaceC02360Aw;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements C0UA {
    public final C09690ea A00;
    public final Object A01;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.A01 = obj;
        C09680eY c09680eY = C09680eY.A02;
        Class<?> cls = obj.getClass();
        C09690ea c09690ea = (C09690ea) c09680eY.A00.get(cls);
        this.A00 = c09690ea == null ? c09680eY.A01(cls, null) : c09690ea;
    }

    @Override // X.C0UA
    public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
        C09690ea c09690ea = this.A00;
        Object obj = this.A01;
        Map map = c09690ea.A00;
        C09690ea.A00((List) map.get(c0c1), interfaceC02360Aw, c0c1, obj);
        C09690ea.A00((List) map.get(C0C1.ON_ANY), interfaceC02360Aw, c0c1, obj);
    }
}
