package com.google.android.material.internal;

import X.C002701i;
import X.C07O;
import X.C0AS;
import X.C0AT;
import X.C28421Rt;
import X.C32691eY;
import X.InterfaceC10870gm;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends C32691eY implements InterfaceC10870gm {
    public static final int[] A0A = {16842912};
    public ColorStateList A00;
    public Drawable A01;
    public FrameLayout A02;
    public C28421Rt A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final CheckedTextView A08;
    public final C0AS A09;

    public NavigationMenuItemView(final Context context, final AttributeSet attributeSet) {
        new LinearLayoutCompat(context, attributeSet, 0) { // from class: X.1eY
            public int A00;
            public Drawable A01;
            public boolean A02;
            public boolean A03;
            public final Rect A04;
            public final Rect A05;

            {
                super(context, attributeSet, 0);
                this.A05 = new Rect();
                this.A04 = new Rect();
                this.A00 = 119;
                this.A03 = true;
                this.A02 = false;
                TypedArray A00 = C08560bh.A00(context, attributeSet, C08550bg.A0Y, 0, 0, new int[0]);
                this.A00 = A00.getInt(1, this.A00);
                Drawable drawable = A00.getDrawable(0);
                if (drawable != null) {
                    setForeground(drawable);
                }
                this.A03 = A00.getBoolean(2, true);
                A00.recycle();
            }

            @Override // android.view.View
            public void draw(Canvas canvas) {
                super.draw(canvas);
                Drawable drawable = this.A01;
                if (drawable != null) {
                    if (this.A02) {
                        this.A02 = false;
                        Rect rect = this.A05;
                        Rect rect2 = this.A04;
                        int right = getRight() - getLeft();
                        int bottom = getBottom() - getTop();
                        if (this.A03) {
                            rect.set(0, 0, right, bottom);
                        } else {
                            rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                        }
                        Gravity.apply(this.A00, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                        drawable.setBounds(rect2);
                    }
                    drawable.draw(canvas);
                }
            }

            @Override // android.view.View
            public void drawableHotspotChanged(float f, float f2) {
                super.drawableHotspotChanged(f, f2);
                Drawable drawable = this.A01;
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void drawableStateChanged() {
                super.drawableStateChanged();
                Drawable drawable = this.A01;
                if (drawable == null || !drawable.isStateful()) {
                    return;
                }
                this.A01.setState(getDrawableState());
            }

            @Override // android.view.View
            public Drawable getForeground() {
                return this.A01;
            }

            @Override // android.view.View
            public int getForegroundGravity() {
                return this.A00;
            }

            @Override // android.view.ViewGroup, android.view.View
            public void jumpDrawablesToCurrentState() {
                super.jumpDrawablesToCurrentState();
                Drawable drawable = this.A01;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                }
            }

            @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                this.A02 = z | this.A02;
            }

            @Override // android.view.View
            public void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                this.A02 = true;
            }

            @Override // android.view.View
            public void setForeground(Drawable drawable) {
                Drawable drawable2 = this.A01;
                if (drawable2 != drawable) {
                    if (drawable2 != null) {
                        drawable2.setCallback(null);
                        unscheduleDrawable(this.A01);
                    }
                    this.A01 = drawable;
                    if (drawable != null) {
                        setWillNotDraw(false);
                        drawable.setCallback(this);
                        if (drawable.isStateful()) {
                            drawable.setState(getDrawableState());
                        }
                        if (this.A00 == 119) {
                            drawable.getPadding(new Rect());
                        }
                    } else {
                        setWillNotDraw(true);
                    }
                    requestLayout();
                    invalidate();
                }
            }

            @Override // android.view.View
            public void setForegroundGravity(int i) {
                if (this.A00 != i) {
                    if ((8388615 & i) == 0) {
                        i |= 8388611;
                    }
                    if ((i & 112) == 0) {
                        i |= 48;
                    }
                    this.A00 = i;
                    if (i == 119 && this.A01 != null) {
                        this.A01.getPadding(new Rect());
                    }
                    requestLayout();
                }
            }

            @Override // android.view.View
            public boolean verifyDrawable(Drawable drawable) {
                return super.verifyDrawable(drawable) || drawable == this.A01;
            }
        };
        this.A09 = new C0AS() { // from class: X.1eZ
            @Override // X.C0AS
            public void A04(View view, C08420bS c08420bS) {
                View.AccessibilityDelegate accessibilityDelegate = this.A01;
                AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.A04);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.A08 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0AT.A0c(this.A08, this.A09);
    }

    @Override // X.InterfaceC10870gm
    public void AEz(C28421Rt c28421Rt, int i) {
        StateListDrawable stateListDrawable;
        this.A03 = c28421Rt;
        setVisibility(c28421Rt.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(A0A, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(c28421Rt.isCheckable());
        setChecked(c28421Rt.isChecked());
        setEnabled(c28421Rt.isEnabled());
        setTitle(c28421Rt.A0I);
        setIcon(c28421Rt.getIcon());
        setActionView(c28421Rt.getActionView());
        setContentDescription(c28421Rt.A0H);
        C07O.A0c(this, c28421Rt.A0K);
        C28421Rt c28421Rt2 = this.A03;
        if (c28421Rt2.A0I == null && c28421Rt2.getIcon() == null && this.A03.getActionView() != null) {
            this.A08.setVisibility(8);
            FrameLayout frameLayout = this.A02;
            if (frameLayout != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                marginLayoutParams.width = -1;
                this.A02.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        this.A08.setVisibility(0);
        FrameLayout frameLayout2 = this.A02;
        if (frameLayout2 == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
        marginLayoutParams2.width = -2;
        this.A02.setLayoutParams(marginLayoutParams2);
    }

    @Override // X.InterfaceC10870gm
    public C28421Rt getItemData() {
        return this.A03;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C28421Rt c28421Rt = this.A03;
        if (c28421Rt != null && c28421Rt.isCheckable() && c28421Rt.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, A0A);
        }
        return onCreateDrawableState;
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.A02;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
                this.A02 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.A02.addView(view);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A04 != z) {
            this.A04 = z;
            this.A09.A01(this.A08, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.A08.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A05) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C07O.A0I(drawable).mutate();
                C07O.A0Z(drawable, this.A00);
            }
            int i = this.A07;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A06) {
            if (this.A01 == null) {
                Drawable A0D = C002701i.A0D(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.A01 = A0D;
                if (A0D != null) {
                    int i2 = this.A07;
                    A0D.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.A01;
        }
        C07O.A0r(this.A08, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.A08.setCompoundDrawablePadding(i);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A00 = colorStateList;
        this.A05 = colorStateList != null;
        C28421Rt c28421Rt = this.A03;
        if (c28421Rt != null) {
            setIcon(c28421Rt.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.A06 = z;
    }

    public void setTextAppearance(int i) {
        C07O.A0o(this.A08, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A08.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A08.setText(charSequence);
    }
}
