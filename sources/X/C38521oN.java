package X;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.1oN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38521oN extends C28661Tc {
    public static C38521oN A01;
    public Application A00;

    public C38521oN(Application application) {
        this.A00 = application;
    }

    @Override // X.C28661Tc, X.C0CR
    public C0MU A6e(Class cls) {
        if (C0QY.class.isAssignableFrom(cls)) {
            try {
                return (C0MU) cls.getConstructor(Application.class).newInstance(this.A00);
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (InstantiationException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (NoSuchMethodException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Cannot create an instance of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Cannot create an instance of ");
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e4);
            }
        }
        return super.A6e(cls);
    }
}
