package X;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.1V5  reason: invalid class name */
/* loaded from: classes.dex */
public class C1V5 extends C16230q3 {
    public static Method A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    @Override // X.C16230q3
    public void A01(View view) {
    }

    @Override // X.C16230q3
    public void A02(View view) {
    }

    @Override // X.C16230q3
    public float A00(View view) {
        if (!A02) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                A00 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            A02 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                return ((Number) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.A00(view);
    }

    @Override // X.C16230q3
    public void A03(View view, float f) {
        if (!A03) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                A01 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            A03 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(f));
                return;
            } catch (IllegalAccessException unused) {
                return;
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        view.setAlpha(f);
    }
}
