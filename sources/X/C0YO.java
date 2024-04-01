package X;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.lang.reflect.Field;

/* renamed from: X.0YO  reason: invalid class name */
/* loaded from: classes.dex */
public class C0YO {
    public static Class A00;
    public static final int[] A02 = {16842912};
    public static final int[] A03 = new int[0];
    public static final Rect A01 = new Rect();

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                A00 = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static PorterDuff.Mode A00(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static Rect A01(Drawable drawable) {
        Field[] fields;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (A00 != null) {
            try {
                if (drawable instanceof C0Y5) {
                    drawable = ((C0Y5) drawable).AE4();
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : A00.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                            continue;
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                            continue;
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                            continue;
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                            continue;
                        } else {
                            continue;
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return A01;
    }

    public static void A02(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(A03);
            } else {
                drawable.setState(A02);
            }
            drawable.setState(state);
        }
    }

    public static boolean A03(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 17 || !(drawable instanceof LayerDrawable)) {
            if (drawable instanceof DrawableContainer) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState instanceof DrawableContainer.DrawableContainerState) {
                    Drawable[] children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                    for (Drawable drawable2 : children) {
                        if (!A03(drawable2)) {
                            return false;
                        }
                    }
                    return true;
                }
                return true;
            } else if (drawable instanceof C0Y5) {
                return A03(((C0Y5) drawable).AE4());
            } else {
                if (drawable instanceof C08780c3) {
                    return A03(((C08780c3) drawable).A00);
                }
                if (drawable instanceof ScaleDrawable) {
                    return A03(((ScaleDrawable) drawable).getDrawable());
                }
                return true;
            }
        }
        return false;
    }
}
