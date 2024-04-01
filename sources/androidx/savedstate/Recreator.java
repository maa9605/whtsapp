package androidx.savedstate;

import X.C000200d;
import X.C02520Bt;
import X.C0C1;
import X.C0UA;
import X.InterfaceC02360Aw;
import X.InterfaceC02390Az;
import X.InterfaceC09060cZ;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Recreator implements C0UA {
    public final InterfaceC02390Az A00;

    public Recreator(InterfaceC02390Az interfaceC02390Az) {
        this.A00 = interfaceC02390Az;
    }

    @Override // X.C0UA
    public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
        if (c0c1 == C0C1.ON_CREATE) {
            ((C02520Bt) interfaceC02360Aw.AAs()).A01.A01(this);
            InterfaceC02390Az interfaceC02390Az = this.A00;
            Bundle A00 = interfaceC02390Az.ACx().A00("androidx.savedstate.Restarter");
            if (A00 == null) {
                return;
            }
            ArrayList<String> stringArrayList = A00.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    try {
                        Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC09060cZ.class);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                ((InterfaceC09060cZ) declaredConstructor.newInstance(new Object[0])).ANi(interfaceC02390Az);
                            } catch (Exception e) {
                                throw new RuntimeException(C000200d.A0H("Failed to instantiate ", next), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            StringBuilder A0P = C000200d.A0P("Class");
                            A0P.append(asSubclass.getSimpleName());
                            A0P.append(" must have default constructor in order to be automatically recreated");
                            throw new IllegalStateException(A0P.toString(), e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(C000200d.A0I("Class ", next, " wasn't found"), e3);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
