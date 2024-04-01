package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.search.verification.client.R;

/* renamed from: X.1SA */
/* loaded from: classes.dex */
public class C1SA extends Button implements InterfaceC02710Co, InterfaceC02730Cq {
    public final C07980aP A00;
    public final C07990aQ A01;

    public C1SA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public C1SA(Context context, AttributeSet attributeSet, int i) {
        super(C07970aO.A00(context), attributeSet, i);
        C07980aP c07980aP = new C07980aP(this);
        this.A00 = c07980aP;
        c07980aP.A08(attributeSet, i);
        C07990aQ c07990aQ = new C07990aQ(this);
        this.A01 = c07990aQ;
        c07990aQ.A07(attributeSet, i);
        this.A01.A01();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C07980aP c07980aP = this.A00;
        if (c07980aP != null) {
            c07980aP.A02();
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ != null) {
            return Math.round(c07990aQ.A0C.A00);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeMinTextSize();
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ != null) {
            return Math.round(c07990aQ.A0C.A01);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeStepGranularity();
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ != null) {
            return Math.round(c07990aQ.A0C.A02);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C07990aQ c07990aQ = this.A01;
        return c07990aQ != null ? c07990aQ.A0C.A07 : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ != null) {
            return c07990aQ.A0C.A03;
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ == null || InterfaceC02730Cq.A00) {
            return;
        }
        c07990aQ.A0C.A03();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ == null || InterfaceC02730Cq.A00 || !c07990aQ.A09()) {
            return;
        }
        c07990aQ.A0C.A03();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC02730Cq.A00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ == null) {
            return;
        }
        c07990aQ.A03(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC02730Cq.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ == null) {
            return;
        }
        c07990aQ.A08(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC02730Cq.A00) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ == null) {
            return;
        }
        c07990aQ.A02(i);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C07O.A0K(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ != null) {
            c07990aQ.A0B.setAllCaps(z);
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ != null) {
            c07990aQ.A04(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC02730Cq.A00) {
            super.setTextSize(i, f);
            return;
        }
        C07990aQ c07990aQ = this.A01;
        if (c07990aQ == null || c07990aQ.A09()) {
            return;
        }
        c07990aQ.A0C.A05(i, f);
    }
}
