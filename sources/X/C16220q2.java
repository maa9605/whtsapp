package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.WindowId;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0q2 */
/* loaded from: classes.dex */
public class C16220q2 {
    public static Field A00;
    public static boolean A01;
    public static final Property A02;
    public static final Property A03;
    public static final C16230q3 A04;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            A04 = new C38791oz() { // from class: X.1F9
                public static Method A00;
                public static boolean A01;

                @Override // X.C16230q3
                public void A04(View view, int i2, int i3, int i4, int i5) {
                    if (!A01) {
                        try {
                            Class cls = Integer.TYPE;
                            Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", cls, cls, cls, cls);
                            A00 = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
                        }
                        A01 = true;
                    }
                    Method method = A00;
                    if (method != null) {
                        try {
                            method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
                        } catch (IllegalAccessException unused) {
                        } catch (InvocationTargetException e2) {
                            throw new RuntimeException(e2.getCause());
                        }
                    }
                }
            };
        } else if (i >= 21) {
            A04 = new C38791oz();
        } else if (i >= 19) {
            A04 = new C1V5();
        } else {
            A04 = new C16230q3();
        }
        A03 = new Property() { // from class: X.0q0
            @Override // android.util.Property
            public Object get(Object obj) {
                return Float.valueOf(C16220q2.A04.A00((View) obj));
            }

            @Override // android.util.Property
            public void set(Object obj, Object obj2) {
                float floatValue = ((Number) obj2).floatValue();
                C16220q2.A04.A03((View) obj, floatValue);
            }
        };
        A02 = new Property() { // from class: X.0q1
            @Override // android.util.Property
            public Object get(Object obj) {
                return C0AT.A0A((View) obj);
            }

            @Override // android.util.Property
            public void set(Object obj, Object obj2) {
                C0AT.A0b((View) obj, (Rect) obj2);
            }
        };
    }

    public static InterfaceC16260q6 A00(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new InterfaceC16260q6(view) { // from class: X.1V9
                public final WindowId A00;

                {
                    this.A00 = view.getWindowId();
                }

                public boolean equals(Object obj) {
                    return (obj instanceof C1V9) && ((C1V9) obj).A00.equals(this.A00);
                }

                public int hashCode() {
                    return this.A00.hashCode();
                }
            };
        }
        return new InterfaceC16260q6(view.getWindowToken()) { // from class: X.1V8
            public final IBinder A00;

            {
                this.A00 = r1;
            }

            public boolean equals(Object obj) {
                return (obj instanceof C1V8) && ((C1V8) obj).A00.equals(this.A00);
            }

            public int hashCode() {
                return this.A00.hashCode();
            }
        };
    }

    public static void A01(View view, int i) {
        if (!A01) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            A01 = true;
        }
        Field field = A00;
        if (field != null) {
            try {
                A00.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void A02(View view, int i, int i2, int i3, int i4) {
        A04.A04(view, i, i2, i3, i4);
    }
}
