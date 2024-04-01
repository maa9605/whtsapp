package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.0UV  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UV {
    public static C0UV A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public C06720Us A00;

    public static synchronized PorterDuffColorFilter A00(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter A00;
        synchronized (C0UV.class) {
            A00 = C06720Us.A00(i, mode);
        }
        return A00;
    }

    public static synchronized C0UV A01() {
        C0UV c0uv;
        synchronized (C0UV.class) {
            if (A01 == null) {
                A02();
            }
            c0uv = A01;
        }
        return c0uv;
    }

    public static synchronized void A02() {
        synchronized (C0UV.class) {
            if (A01 == null) {
                C0UV c0uv = new C0UV();
                A01 = c0uv;
                c0uv.A00 = C06720Us.A01();
                C06720Us c06720Us = A01.A00;
                C0VP c0vp = new C0VP();
                synchronized (c06720Us) {
                    c06720Us.A01 = c0vp;
                }
            }
        }
    }

    public synchronized ColorStateList A03(Context context, int i) {
        return this.A00.A03(context, i);
    }

    public synchronized Drawable A04(Context context, int i) {
        return this.A00.A04(context, i);
    }
}
