package X;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* renamed from: X.0Rw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC06190Rw extends BinderC06200Rx {
    public final Object A00;

    public BinderC06190Rw(Object obj) {
        this.A00 = obj;
    }

    public static Object A00(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof BinderC06190Rw) {
            return ((BinderC06190Rw) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int length = declaredFields.length;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(C000200d.A07(64, "Unexpected number of IObjectWrapper declared fields: ", length));
    }
}
