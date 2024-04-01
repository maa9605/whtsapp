package androidx.appcompat.view.menu;

import X.AbstractC10760gb;
import X.AbstractView$OnTouchListenerC11180hK;
import X.C02700Cn;
import X.C06650Uk;
import X.C07O;
import X.C0UY;
import X.C28421Rt;
import X.InterfaceC06620Uh;
import X.InterfaceC10870gm;
import X.InterfaceC10980gy;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C02700Cn implements View.OnClickListener, InterfaceC10870gm, InterfaceC10980gy {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public AbstractC10760gb A04;
    public InterfaceC06620Uh A05;
    public C28421Rt A06;
    public AbstractView$OnTouchListenerC11180hK A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.A09 = A01();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0UY.A02, 0, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.A00 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.A02 = -1;
        setSaveEnabled(false);
    }

    public final void A00() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A08);
        if (this.A03 != null && ((this.A06.A06 & 4) != 4 || (!this.A09 && !this.A0A))) {
            z = false;
        }
        boolean z3 = z2 & z;
        if (z3) {
            charSequence = this.A08;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence2 = this.A06.A0H;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(z3 ? null : this.A06.A0I);
        } else {
            setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.A06.A0K;
        if (TextUtils.isEmpty(charSequence3)) {
            C07O.A0c(this, z3 ? null : this.A06.A0I);
        } else {
            C07O.A0c(this, charSequence3);
        }
    }

    public final boolean A01() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // X.InterfaceC10870gm
    public void AEz(C28421Rt c28421Rt, int i) {
        CharSequence charSequence;
        this.A06 = c28421Rt;
        setIcon(c28421Rt.getIcon());
        if (1 != 0) {
            charSequence = c28421Rt.getTitleCondensed();
        } else {
            charSequence = c28421Rt.A0I;
        }
        setTitle(charSequence);
        setId(c28421Rt.A0R);
        setVisibility(c28421Rt.isVisible() ? 0 : 8);
        setEnabled(c28421Rt.isEnabled());
        if (c28421Rt.hasSubMenu() && this.A07 == null) {
            this.A07 = new AbstractView$OnTouchListenerC11180hK() { // from class: X.1Rn
                {
                    super(ActionMenuItemView.this);
                }

                @Override // X.AbstractView$OnTouchListenerC11180hK
                public InterfaceC10880gn A00() {
                    C1S0 c1s0;
                    AbstractC10760gb abstractC10760gb = ActionMenuItemView.this.A04;
                    if (abstractC10760gb == null || (c1s0 = ((C1S1) abstractC10760gb).A00.A06) == null) {
                        return null;
                    }
                    return c1s0.A00();
                }

                @Override // X.AbstractView$OnTouchListenerC11180hK
                public boolean A03() {
                    InterfaceC10880gn A00;
                    ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
                    InterfaceC06620Uh interfaceC06620Uh = actionMenuItemView.A05;
                    return interfaceC06620Uh != null && interfaceC06620Uh.AF3(actionMenuItemView.A06) && (A00 = A00()) != null && A00.AFo();
                }
            };
        }
    }

    @Override // X.InterfaceC10980gy
    public boolean AGb() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // X.InterfaceC10980gy
    public boolean AGc() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.A06.getIcon() == null;
    }

    @Override // X.InterfaceC10870gm
    public C28421Rt getItemData() {
        return this.A06;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC06620Uh interfaceC06620Uh = this.A05;
        if (interfaceC06620Uh != null) {
            interfaceC06620Uh.AF3(this.A06);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A09 = A01();
        A00();
    }

    @Override // X.C02700Cn, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i5 = this.A02) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = this.A01;
            i3 = Math.min(size, i4);
        } else {
            i3 = this.A01;
            i4 = i3;
        }
        if (mode != 1073741824 && i4 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (z || this.A03 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.A03.getBounds().width()) >> 1, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC11180hK abstractView$OnTouchListenerC11180hK;
        if (this.A06.hasSubMenu() && (abstractView$OnTouchListenerC11180hK = this.A07) != null && abstractView$OnTouchListenerC11180hK.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            C28421Rt c28421Rt = this.A06;
            if (c28421Rt != null) {
                C06650Uk c06650Uk = c28421Rt.A0E;
                c06650Uk.A0D = true;
                c06650Uk.A0E(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A03 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.A00;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
                intrinsicHeight = i;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        A00();
    }

    public void setItemInvoker(InterfaceC06620Uh interfaceC06620Uh) {
        this.A05 = interfaceC06620Uh;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.A02 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC10760gb abstractC10760gb) {
        this.A04 = abstractC10760gb;
    }

    public void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A00();
    }
}
