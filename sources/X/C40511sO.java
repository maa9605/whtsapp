package X;

import android.app.Application;
import android.os.Bundle;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1sO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40511sO {
    public final Application A00;
    public final C0CR A01;
    public final C0CR A02;
    public final C06840Vf A03;
    public final Set A04;

    public C40511sO(Application application, Set keySet, C06840Vf viewModelComponentBuilder, Set defaultActivityFactorySet, Set defaultFragmentFactorySet) {
        this.A00 = application;
        this.A04 = keySet;
        this.A03 = viewModelComponentBuilder;
        this.A01 = A00(defaultActivityFactorySet);
        this.A02 = A00(defaultFragmentFactorySet);
    }

    public static C0CR A00(Set set) {
        if (set.isEmpty()) {
            return null;
        }
        if (set.size() <= 1) {
            C0CR c0cr = (C0CR) set.iterator().next();
            if (c0cr != null) {
                return c0cr;
            }
            throw new IllegalStateException("Default view model factory must not be null.");
        }
        StringBuilder sb = new StringBuilder("At most one default view model factory is expected. Found ");
        sb.append(set);
        throw new IllegalStateException(sb.toString());
    }

    public final C0CR A01(final InterfaceC02390Az owner, final Bundle defaultArgs, C0CR extensionDelegate) {
        final C0CR c0cr = extensionDelegate;
        if (extensionDelegate == null) {
            c0cr = new C38511oL(this.A00, owner, defaultArgs);
        }
        final Set set = this.A04;
        final C06840Vf c06840Vf = this.A03;
        return new C0CR(owner, defaultArgs, set, c0cr, c06840Vf) { // from class: X.3vI
            public final C0Zo A00;
            public final C0CR A01;
            public final Set A02;

            {
                this.A02 = set;
                this.A01 = c0cr;
                this.A00 = new C0Zo(owner, defaultArgs) { // from class: X.3yr
                    @Override // X.C0Zo
                    public C0MU A02(String key, Class modelClass, C07750Zs handle) {
                        C06840Vf c06840Vf2 = c06840Vf;
                        if (handle != null) {
                            c06840Vf2.A00 = handle;
                            Map A00 = ((AbstractC34641hr) C02180Ae.A0f(new C29611Xo(c06840Vf2.A01), AbstractC34641hr.class)).A00();
                            String name = modelClass.getName();
                            InterfaceC007103c interfaceC007103c = (InterfaceC007103c) A00.get(name);
                            if (interfaceC007103c != null) {
                                return (C0MU) interfaceC007103c.get();
                            }
                            StringBuilder A0P = C000200d.A0P("Expected the @HiltViewModel-annotated class '");
                            A0P.append(name);
                            A0P.append("' to be available in the multi-binding of @HiltViewModelMap but none was found.");
                            throw new IllegalStateException(A0P.toString());
                        }
                        throw null;
                    }
                };
            }

            @Override // X.C0CR
            public C0MU A6e(Class modelClass) {
                if (this.A02.contains(modelClass.getName())) {
                    return this.A00.A6e(modelClass);
                }
                return this.A01.A6e(modelClass);
            }
        };
    }
}
