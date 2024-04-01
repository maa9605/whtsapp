package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.0aP */
/* loaded from: classes.dex */
public class C07980aP {
    public C08020aT A01;
    public C08020aT A02;
    public C08020aT A03;
    public final View A04;
    public int A00 = -1;
    public final C0UV A05 = C0UV.A01();

    public C07980aP(View view) {
        this.A04 = view;
    }

    public ColorStateList A00() {
        C08020aT c08020aT = this.A01;
        if (c08020aT != null) {
            return c08020aT.A00;
        }
        return null;
    }

    public PorterDuff.Mode A01() {
        C08020aT c08020aT = this.A01;
        if (c08020aT != null) {
            return c08020aT.A01;
        }
        return null;
    }

    public void A02() {
        PorterDuff.Mode supportBackgroundTintMode;
        View view = this.A04;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : this.A02 != null) {
                C08020aT c08020aT = this.A03;
                if (c08020aT == null) {
                    c08020aT = new C08020aT();
                    this.A03 = c08020aT;
                }
                c08020aT.A00 = null;
                c08020aT.A02 = false;
                c08020aT.A01 = null;
                c08020aT.A03 = false;
                ColorStateList A08 = C0AT.A08(view);
                if (A08 != null) {
                    c08020aT.A02 = true;
                    c08020aT.A00 = A08;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    supportBackgroundTintMode = view.getBackgroundTintMode();
                } else {
                    if (view instanceof InterfaceC02710Co) {
                        supportBackgroundTintMode = ((InterfaceC02710Co) view).getSupportBackgroundTintMode();
                    }
                    if (!c08020aT.A02 || c08020aT.A03) {
                        C06720Us.A02(background, c08020aT, view.getDrawableState());
                        return;
                    }
                }
                if (supportBackgroundTintMode != null) {
                    c08020aT.A03 = true;
                    c08020aT.A01 = supportBackgroundTintMode;
                }
                if (!c08020aT.A02) {
                }
                C06720Us.A02(background, c08020aT, view.getDrawableState());
                return;
            }
            C08020aT c08020aT2 = this.A01;
            if (c08020aT2 != null) {
                C06720Us.A02(background, c08020aT2, view.getDrawableState());
                return;
            }
            C08020aT c08020aT3 = this.A02;
            if (c08020aT3 == null) {
                return;
            }
            C06720Us.A02(background, c08020aT3, view.getDrawableState());
        }
    }

    public void A03() {
        this.A00 = -1;
        A05(null);
        A02();
    }

    public void A04(int i) {
        ColorStateList colorStateList;
        this.A00 = i;
        C0UV c0uv = this.A05;
        if (c0uv != null) {
            colorStateList = c0uv.A03(this.A04.getContext(), i);
        } else {
            colorStateList = null;
        }
        A05(colorStateList);
        A02();
    }

    public void A05(ColorStateList colorStateList) {
        if (colorStateList != null) {
            C08020aT c08020aT = this.A02;
            if (c08020aT == null) {
                c08020aT = new C08020aT();
                this.A02 = c08020aT;
            }
            c08020aT.A00 = colorStateList;
            c08020aT.A02 = true;
        } else {
            this.A02 = null;
        }
        A02();
    }

    public void A06(ColorStateList colorStateList) {
        C08020aT c08020aT = this.A01;
        if (c08020aT == null) {
            c08020aT = new C08020aT();
            this.A01 = c08020aT;
        }
        c08020aT.A00 = colorStateList;
        c08020aT.A02 = true;
        A02();
    }

    public void A07(PorterDuff.Mode mode) {
        C08020aT c08020aT = this.A01;
        if (c08020aT == null) {
            c08020aT = new C08020aT();
            this.A01 = c08020aT;
        }
        c08020aT.A01 = mode;
        c08020aT.A03 = true;
        A02();
    }

    public void A08(AttributeSet attributeSet, int i) {
        View view = this.A04;
        C0V9 A00 = C0V9.A00(view.getContext(), attributeSet, C0UY.A0e, i);
        try {
            TypedArray typedArray = A00.A02;
            if (typedArray.hasValue(0)) {
                this.A00 = typedArray.getResourceId(0, -1);
                ColorStateList A03 = this.A05.A03(view.getContext(), this.A00);
                if (A03 != null) {
                    A05(A03);
                }
            }
            if (typedArray.hasValue(1)) {
                C0AT.A0Z(view, A00.A01(1));
            }
            if (typedArray.hasValue(2)) {
                C0AT.A0a(view, C0YO.A00(typedArray.getInt(2, -1), null));
            }
            typedArray.recycle();
        } catch (Throwable th) {
            A00.A02.recycle();
            throw th;
        }
    }
}
