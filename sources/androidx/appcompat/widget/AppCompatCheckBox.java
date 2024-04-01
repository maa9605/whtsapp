package androidx.appcompat.widget;

import X.C07970aO;
import X.C07980aP;
import X.C07990aQ;
import X.C09L;
import X.C11000h1;
import X.InterfaceC02710Co;
import X.InterfaceC08340bJ;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements InterfaceC02710Co, InterfaceC08340bJ {
    public final C07980aP A00;
    public final C11000h1 A01;
    public final C07990aQ A02;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C07970aO.A00(context), attributeSet, i);
        C11000h1 c11000h1 = new C11000h1(this);
        this.A01 = c11000h1;
        c11000h1.A02(attributeSet, i);
        C07980aP c07980aP = new C07980aP(this);
        this.A00 = c07980aP;
        c07980aP.A08(attributeSet, i);
        C07990aQ c07990aQ = new C07990aQ(this);
        this.A02 = c07990aQ;
        c07990aQ.A07(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A02();
        }
        C07990aQ c07990aQ = this.A02;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C11000h1 c11000h1 = this.A01;
        return c11000h1 != null ? c11000h1.A00(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // X.InterfaceC02710Co
    public ColorStateList getSupportBackgroundTintList() {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            return c07980aP.A00();
        }
        return null;
    }

    @Override // X.InterfaceC02710Co
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            return c07980aP.A01();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C11000h1 c11000h1 = this.A01;
        if (c11000h1 != null) {
            return c11000h1.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C11000h1 c11000h1 = this.A01;
        if (c11000h1 != null) {
            return c11000h1.A01;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A04(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C09L.A01(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C11000h1 c11000h1 = this.A01;
        if (c11000h1 != null) {
            if (c11000h1.A04) {
                c11000h1.A04 = false;
                return;
            }
            c11000h1.A04 = true;
            c11000h1.A01();
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A06(colorStateList);
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A07(mode);
        }
    }

    @Override // X.InterfaceC08340bJ
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C11000h1 c11000h1 = this.A01;
        if (c11000h1 != null) {
            c11000h1.A00 = colorStateList;
            c11000h1.A02 = true;
            c11000h1.A01();
        }
    }

    @Override // X.InterfaceC08340bJ
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C11000h1 c11000h1 = this.A01;
        if (c11000h1 != null) {
            c11000h1.A01 = mode;
            c11000h1.A03 = true;
            c11000h1.A01();
        }
    }
}
