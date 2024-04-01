package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;

/* renamed from: X.1eT */
/* loaded from: classes.dex */
public class C32651eT extends C1B3 {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC24381Ao A03;
    public ViewGroup$OnHierarchyChangeListenerC24391Ap A04;
    public boolean A05;
    public boolean A06;
    public final C24361Am A07;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Am] */
    public C32651eT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A07 = new CompoundButton.OnCheckedChangeListener() { // from class: X.1Am
            {
                C32651eT.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C32651eT c32651eT = C32651eT.this;
                if (c32651eT.A05) {
                    return;
                }
                int id = compoundButton.getId();
                int i = c32651eT.A00;
                if (z) {
                    if (i != -1 && i != id && c32651eT.A06) {
                        c32651eT.A00(i, false);
                    }
                    c32651eT.A00 = id;
                } else if (i != id) {
                } else {
                    c32651eT.A00 = -1;
                }
            }
        };
        this.A04 = new ViewGroup$OnHierarchyChangeListenerC24391Ap(this);
        this.A00 = -1;
        this.A05 = false;
        TypedArray A00 = C08560bh.A00(context, attributeSet, C08550bg.A0K, R.attr.chipGroupStyle, 2131952474, new int[0]);
        int dimensionPixelOffset = A00.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(A00.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(A00.getDimensionPixelOffset(3, dimensionPixelOffset));
        super.A02 = A00.getBoolean(4, false);
        setSingleSelection(A00.getBoolean(5, false));
        int resourceId = A00.getResourceId(0, -1);
        if (resourceId != -1) {
            this.A00 = resourceId;
        }
        A00.recycle();
        super.setOnHierarchyChangeListener(this.A04);
    }

    public final void A00(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.A05 = true;
            ((CompoundButton) findViewById).setChecked(z);
            this.A05 = false;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            CompoundButton compoundButton = (CompoundButton) view;
            if (compoundButton.isChecked()) {
                int i2 = this.A00;
                if (i2 != -1 && this.A06) {
                    A00(i2, false);
                }
                this.A00 = compoundButton.getId();
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C24371An);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C24371An();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C24371An(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C24371An(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.A06) {
            return this.A00;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.A01;
    }

    public int getChipSpacingVertical() {
        return this.A02;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A00;
        if (i != -1) {
            A00(i, true);
            this.A00 = this.A00;
        }
    }

    public static void setCheckedId(C32651eT c32651eT, int i) {
        c32651eT.A00 = i;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            super.A00 = i;
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            super.A01 = i;
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC24381Ao interfaceC24381Ao) {
        this.A03 = interfaceC24381Ao;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A04.A00 = onHierarchyChangeListener;
    }

    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        super.A02 = getResources().getBoolean(i);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            this.A05 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((CompoundButton) childAt).setChecked(false);
                }
            }
            this.A05 = false;
            this.A00 = -1;
        }
    }
}
