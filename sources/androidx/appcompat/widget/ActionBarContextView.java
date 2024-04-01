package androidx.appcompat.widget;

import X.AbstractC28381Ro;
import X.C06650Uk;
import X.C09L;
import X.C0U0;
import X.C0UY;
import X.C0Ud;
import X.C0Ux;
import X.C1S0;
import X.C38311nu;
import X.InterfaceC06630Ui;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class ActionBarContextView extends C0Ud {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public CharSequence A08;
    public CharSequence A09;
    public boolean A0A;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0UY.A04, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = C09L.A01(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.A02 = obtainStyledAttributes.getResourceId(5, 0);
        this.A01 = obtainStyledAttributes.getResourceId(4, 0);
        super.A00 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.A00 = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public final void A04() {
        if (this.A05 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A05 = linearLayout;
            this.A07 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.A06 = (TextView) this.A05.findViewById(R.id.action_bar_subtitle);
            if (this.A02 != 0) {
                this.A07.setTextAppearance(getContext(), this.A02);
            }
            if (this.A01 != 0) {
                this.A06.setTextAppearance(getContext(), this.A01);
            }
        }
        this.A07.setText(this.A09);
        this.A06.setText(this.A08);
        boolean z = !TextUtils.isEmpty(this.A09);
        boolean z2 = !TextUtils.isEmpty(this.A08);
        int i = 0;
        this.A06.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.A05;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.A05.getParent() == null) {
            addView(this.A05);
        }
    }

    public void A05(final C0U0 c0u0) {
        View view = this.A03;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.A00, (ViewGroup) this, false);
            this.A03 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.A03);
        }
        this.A03.findViewById(R.id.action_mode_close_button).setOnClickListener(new View.OnClickListener() { // from class: X.0gs
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                c0u0.A05();
            }
        });
        C06650Uk c06650Uk = (C06650Uk) c0u0.A00();
        C38311nu c38311nu = super.A01;
        if (c38311nu != null) {
            c38311nu.A01();
            C1S0 c1s0 = c38311nu.A06;
            if (c1s0 != null) {
                c1s0.A01();
            }
        }
        C38311nu c38311nu2 = new C38311nu(getContext());
        super.A01 = c38311nu2;
        c38311nu2.A0D = true;
        c38311nu2.A0E = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c06650Uk.A0C(super.A01, super.A06);
        C38311nu c38311nu3 = super.A01;
        InterfaceC06630Ui interfaceC06630Ui = ((AbstractC28381Ro) c38311nu3).A07;
        if (interfaceC06630Ui == null) {
            InterfaceC06630Ui interfaceC06630Ui2 = (InterfaceC06630Ui) ((AbstractC28381Ro) c38311nu3).A04.inflate(((AbstractC28381Ro) c38311nu3).A01, (ViewGroup) this, false);
            ((AbstractC28381Ro) c38311nu3).A07 = interfaceC06630Ui2;
            interfaceC06630Ui2.AEy(((AbstractC28381Ro) c38311nu3).A05);
            c38311nu3.AVo(true);
        }
        InterfaceC06630Ui interfaceC06630Ui3 = ((AbstractC28381Ro) c38311nu3).A07;
        if (interfaceC06630Ui != interfaceC06630Ui3) {
            ((ActionMenuView) interfaceC06630Ui3).setPresenter(c38311nu3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC06630Ui3;
        super.A02 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(super.A02, layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public CharSequence getSubtitle() {
        return this.A08;
    }

    public CharSequence getTitle() {
        return this.A09;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C38311nu c38311nu = super.A01;
        if (c38311nu != null) {
            c38311nu.A01();
            C1S0 c1s0 = super.A01.A06;
            if (c1s0 != null) {
                c1s0.A01();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(ActionBarContextView.class.getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.A09);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean A01 = C0Ux.A01(this);
        if (A01) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.A03;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
            if (A01) {
                int i7 = marginLayoutParams.rightMargin;
                i5 = marginLayoutParams.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = marginLayoutParams.leftMargin;
                i5 = marginLayoutParams.rightMargin;
                i6 = paddingLeft + i8;
            }
            int A00 = i6 + C0Ud.A00(this.A03, i6, paddingTop, paddingTop2, A01);
            paddingLeft = A01 ? A00 - i5 : A00 + i5;
        }
        LinearLayout linearLayout = this.A05;
        if (linearLayout != null && this.A04 == null && linearLayout.getVisibility() != 8) {
            paddingLeft += C0Ud.A00(this.A05, paddingLeft, paddingTop, paddingTop2, A01);
        }
        View view2 = this.A04;
        if (view2 != null) {
            C0Ud.A00(view2, paddingLeft, paddingTop, paddingTop2, A01);
        }
        if (A01) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = super.A02;
        if (actionMenuView != null) {
            C0Ud.A00(actionMenuView, paddingRight, paddingTop, paddingTop2, !A01);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i4 = super.A00;
                if (i4 <= 0) {
                    i4 = View.MeasureSpec.getSize(i2);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i5 = i4 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                View view = this.A03;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, EditorInfoCompat.IME_FLAG_FORCE_ASCII), makeMeasureSpec);
                    int max = Math.max(0, (paddingLeft - view.getMeasuredWidth()) - 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
                    paddingLeft = max - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = super.A02;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    ActionMenuView actionMenuView2 = super.A02;
                    actionMenuView2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, EditorInfoCompat.IME_FLAG_FORCE_ASCII), makeMeasureSpec);
                    paddingLeft = Math.max(0, (paddingLeft - actionMenuView2.getMeasuredWidth()) - 0);
                }
                LinearLayout linearLayout = this.A05;
                if (linearLayout != null && this.A04 == null) {
                    if (this.A0A) {
                        this.A05.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.A05.getMeasuredWidth();
                        boolean z = false;
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                            paddingLeft -= measuredWidth;
                        }
                        this.A05.setVisibility(z ? 0 : 8);
                    } else {
                        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, EditorInfoCompat.IME_FLAG_FORCE_ASCII), makeMeasureSpec);
                        paddingLeft = Math.max(0, (paddingLeft - linearLayout.getMeasuredWidth()) - 0);
                    }
                }
                View view2 = this.A04;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i6 = layoutParams.width;
                    int i7 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    if (i6 != -2) {
                        i7 = 1073741824;
                    }
                    if (i6 >= 0) {
                        paddingLeft = Math.min(i6, paddingLeft);
                    }
                    int i8 = layoutParams.height;
                    if (i8 != -2) {
                        if (i8 >= 0) {
                            i5 = Math.min(i8, i5);
                        }
                    } else {
                        i3 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    }
                    this.A04.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
                }
                if (super.A00 > 0) {
                    setMeasuredDimension(size, i4);
                    return;
                }
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ActionBarContextView");
            sb.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActionBarContextView");
        sb2.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        throw new IllegalStateException(sb2.toString());
    }

    @Override // X.C0Ud
    public void setContentHeight(int i) {
        super.A00 = i;
    }

    public void setCustomView(View view) {
        View view2 = this.A04;
        if (view2 != null) {
            removeView(view2);
        }
        this.A04 = view;
        if (view != null) {
            LinearLayout linearLayout = this.A05;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.A05 = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A04();
    }

    public void setTitle(CharSequence charSequence) {
        this.A09 = charSequence;
        A04();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.A0A) {
            requestLayout();
        }
        this.A0A = z;
    }
}
