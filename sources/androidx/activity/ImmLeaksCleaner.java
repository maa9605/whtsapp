package androidx.activity;

import X.C0C1;
import X.C0UA;
import X.InterfaceC02360Aw;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements C0UA {
    public static int A01;
    public static Field A02;
    public static Field A03;
    public static Field A04;
    public Activity A00;

    public ImmLeaksCleaner(Activity activity) {
        this.A00 = activity;
    }

    @Override // X.C0UA
    public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
        if (c0c1 != C0C1.ON_DESTROY) {
            return;
        }
        if (A01 == 0) {
            try {
                A01 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                A04 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                A03 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                A02 = declaredField3;
                declaredField3.setAccessible(true);
                A01 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (A01 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.A00.getSystemService("input_method");
            try {
                Object obj = A02.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        View view = (View) A04.get(inputMethodManager);
                        if (view == null) {
                            return;
                        }
                        if (view.isAttachedToWindow()) {
                            return;
                        }
                        try {
                            A03.set(inputMethodManager, null);
                            inputMethodManager.isActive();
                        } catch (IllegalAccessException unused2) {
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
