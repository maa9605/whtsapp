package androidx.appcompat.view.menu;

import X.C0UY;
import X.C0V9;
import X.C28421Rt;
import X.InterfaceC10870gm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC10870gm, AbsListView.SelectionBoundsAdjuster {
    public int A00;
    public Context A01;
    public Drawable A02;
    public Drawable A03;
    public LayoutInflater A04;
    public CheckBox A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public RadioButton A0A;
    public TextView A0B;
    public TextView A0C;
    public C28421Rt A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0V9 A00 = C0V9.A00(getContext(), attributeSet, C0UY.A0S, R.attr.listMenuViewStyle);
        this.A02 = A00.A02(5);
        TypedArray typedArray = A00.A02;
        this.A00 = typedArray.getResourceId(1, -1);
        this.A0G = typedArray.getBoolean(7, false);
        this.A01 = context;
        this.A03 = A00.A02(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.A0F = obtainStyledAttributes.hasValue(0);
        typedArray.recycle();
        obtainStyledAttributes.recycle();
    }

    public final void A00() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.A05 = checkBox;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public final void A01() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.A0A = radioButton;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0030, code lost:
        if ((r1.A0H() ? r3.A00 : r3.A01) == 0) goto L18;
     */
    @Override // X.InterfaceC10870gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AEz(X.C28421Rt r3, int r4) {
        /*
            r2 = this;
            r2.A0D = r3
            boolean r1 = r3.isVisible()
            r0 = 8
            if (r1 == 0) goto Lb
            r0 = 0
        Lb:
            r2.setVisibility(r0)
            r0 = 0
            if (r0 == 0) goto L54
            java.lang.CharSequence r0 = r3.getTitleCondensed()
        L15:
            r2.setTitle(r0)
            boolean r0 = r3.isCheckable()
            r2.setCheckable(r0)
            X.0Uk r1 = r3.A0E
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L32
            boolean r0 = r1.A0H()
            if (r0 == 0) goto L51
            char r1 = r3.A00
        L2f:
            r0 = 1
            if (r1 != 0) goto L33
        L32:
            r0 = 0
        L33:
            r2.setShortcut(r0)
            android.graphics.drawable.Drawable r0 = r3.getIcon()
            r2.setIcon(r0)
            boolean r0 = r3.isEnabled()
            r2.setEnabled(r0)
            boolean r0 = r3.hasSubMenu()
            r2.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r0 = r3.A0H
            r2.setContentDescription(r0)
            return
        L51:
            char r1 = r3.A01
            goto L2f
        L54:
            java.lang.CharSequence r0 = r3.A0I
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.AEz(X.1Rt, int):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A06;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A06.getLayoutParams();
        rect.top = this.A06.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.A04;
        if (layoutInflater == null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            this.A04 = from;
            return from;
        }
        return layoutInflater;
    }

    @Override // X.InterfaceC10870gm
    public C28421Rt getItemData() {
        return this.A0D;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.A02);
        TextView textView = (TextView) findViewById(R.id.title);
        this.A0C = textView;
        int i = this.A00;
        if (i != -1) {
            textView.setTextAppearance(this.A01, i);
        }
        this.A0B = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.A08 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A03);
        }
        this.A06 = (ImageView) findViewById(R.id.group_divider);
        this.A09 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.A07 != null && this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.A07.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CheckBox checkBox;
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.A0A == null && this.A05 == null) {
            return;
        }
        if ((this.A0D.A02 & 4) != 0) {
            if (this.A0A == null) {
                A01();
            }
            CompoundButton compoundButton3 = this.A0A;
            CompoundButton compoundButton4 = this.A05;
            checkBox = compoundButton4;
            compoundButton2 = compoundButton4;
            compoundButton = compoundButton3;
        } else {
            if (this.A05 == null) {
                A00();
            }
            CompoundButton compoundButton5 = this.A05;
            checkBox = compoundButton5;
            compoundButton2 = this.A0A;
            compoundButton = compoundButton5;
        }
        if (z) {
            compoundButton.setChecked(this.A0D.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                compoundButton2.setVisibility(8);
                return;
            }
            return;
        }
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.A0A;
        if (radioButton == null) {
            return;
        }
        radioButton.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.A0D.A02 & 4) != 0) {
            if (this.A0A == null) {
                A01();
            }
            compoundButton = this.A0A;
        } else {
            if (this.A05 == null) {
                A00();
            }
            compoundButton = this.A05;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.A0E = z;
        this.A0G = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0009, code lost:
        if (r3 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setGroupDividerEnabled(boolean r3) {
        /*
            r2 = this;
            android.widget.ImageView r1 = r2.A06
            if (r1 == 0) goto L10
            boolean r0 = r2.A0F
            if (r0 != 0) goto Lb
            r0 = 0
            if (r3 != 0) goto Ld
        Lb:
            r0 = 8
        Ld:
            r1.setVisibility(r0)
        L10:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setGroupDividerEnabled(boolean):void");
    }

    public void setIcon(Drawable drawable) {
        boolean z = true;
        if (!this.A0E) {
            z = false;
            if (!this.A0G) {
                return;
            }
        }
        ImageView imageView = this.A07;
        if (imageView == null && drawable == null && !this.A0G) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.A07 = imageView2;
            LinearLayout linearLayout = this.A09;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.A0G) {
            this.A07.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.A07;
        if (!z) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.A07.getVisibility() != 0) {
            this.A07.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0017, code lost:
        if ((r5.A0H() ? r1.A00 : r1.A01) == 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setShortcut(boolean r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setShortcut(boolean):void");
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.A08;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.A0C.getVisibility() != 8) {
                this.A0C.setVisibility(8);
                return;
            }
            return;
        }
        this.A0C.setText(charSequence);
        if (this.A0C.getVisibility() != 0) {
            this.A0C.setVisibility(0);
        }
    }
}
