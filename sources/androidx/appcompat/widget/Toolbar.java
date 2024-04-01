package androidx.appcompat.widget;

import X.AbstractC13390lB;
import X.C02700Cn;
import X.C04860Me;
import X.C06650Uk;
import X.C07O;
import X.C08460bW;
import X.C08490bZ;
import X.C08820c8;
import X.C08860cC;
import X.C09L;
import X.C0AT;
import X.C0CO;
import X.C0S5;
import X.C0U2;
import X.C0UW;
import X.C0UY;
import X.C0Ux;
import X.C0V9;
import X.C0VF;
import X.C1SN;
import X.C1SO;
import X.C28421Rt;
import X.C38311nu;
import X.InterfaceC08470bX;
import X.InterfaceC08810c7;
import X.InterfaceC08830c9;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Context A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public Drawable A0F;
    public View A0G;
    public ImageButton A0H;
    public ImageButton A0I;
    public ImageView A0J;
    public TextView A0K;
    public C0CO A0L;
    public C0VF A0M;
    public C38311nu A0N;
    public ActionMenuView A0O;
    public C08490bZ A0P;
    public C1SN A0Q;
    public InterfaceC08810c7 A0R;
    public C08820c8 A0S;
    public CharSequence A0T;
    public CharSequence A0U;
    public CharSequence A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final InterfaceC08470bX A0Z;
    public final Runnable A0a;
    public final ArrayList A0b;
    public final ArrayList A0c;
    public final int[] A0d;
    public TextView mTitleTextView;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.A03 = 8388627;
        this.A0c = new ArrayList();
        this.A0b = new ArrayList();
        this.A0d = new int[2];
        this.A0Z = new C08460bW(this);
        this.A0a = new Runnable() { // from class: X.0bY
            {
                Toolbar.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                C38311nu c38311nu;
                ActionMenuView actionMenuView = Toolbar.this.A0O;
                if (actionMenuView == null || (c38311nu = actionMenuView.A08) == null) {
                    return;
                }
                c38311nu.A03();
            }
        };
        C0V9 A00 = C0V9.A00(getContext(), attributeSet, C0UY.A0c, R.attr.toolbarStyle);
        TypedArray typedArray = A00.A02;
        this.A0B = typedArray.getResourceId(28, 0);
        this.A06 = typedArray.getResourceId(19, 0);
        this.A03 = typedArray.getInteger(0, 8388627);
        this.A00 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.A07 = dimensionPixelOffset;
        this.A0A = dimensionPixelOffset;
        this.A08 = dimensionPixelOffset;
        this.A09 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.A09 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.A08 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.A0A = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.A07 = dimensionPixelOffset5;
        }
        this.A04 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        A0A();
        C08490bZ c08490bZ = this.A0P;
        c08490bZ.A06 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c08490bZ.A01 = dimensionPixelSize;
            c08490bZ.A03 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c08490bZ.A02 = dimensionPixelSize2;
            c08490bZ.A04 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c08490bZ.A00(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.A02 = typedArray.getDimensionPixelOffset(10, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.A01 = typedArray.getDimensionPixelOffset(6, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.A0F = A00.A02(4);
        this.A0T = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.A0C = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable A02 = A00.A02(16);
        if (A02 != null) {
            setNavigationIcon(A02);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable A022 = A00.A02(11);
        if (A022 != null) {
            setLogo(A022);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(A00.A01(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(A00.A01(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        typedArray.recycle();
    }

    public static final int A00(View view) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 17) {
            i = marginLayoutParams.getMarginStart();
        } else {
            i = marginLayoutParams.leftMargin;
        }
        return C07O.A09(marginLayoutParams) + i;
    }

    public static final int A01(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static C08860cC A02(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C08860cC) {
            return new C08860cC((C08860cC) layoutParams);
        }
        if (layoutParams instanceof C0U2) {
            return new C08860cC((C0U2) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C08860cC((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C08860cC(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0028, code lost:
        if (r0 != 80) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A03(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r5 = r9.getLayoutParams()
            X.0U2 r5 = (X.C0U2) r5
            int r7 = r9.getMeasuredHeight()
            r6 = 0
            int r0 = r7 - r10
            int r4 = r0 >> 1
            if (r10 > 0) goto L12
            r4 = 0
        L12:
            int r0 = r5.A00
            r3 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            r2 = 80
            r1 = 48
            if (r3 == r0) goto L2a
            if (r3 == r1) goto L61
            if (r3 == r2) goto L52
            int r0 = r8.A03
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 == r1) goto L61
            if (r0 == r2) goto L52
        L2a:
            int r4 = r8.getPaddingTop()
            int r3 = r8.getPaddingBottom()
            int r2 = r8.getHeight()
            int r0 = r2 - r4
            int r0 = r0 - r3
            int r0 = r0 - r7
            int r1 = r0 >> 1
            int r0 = r5.topMargin
            if (r1 >= r0) goto L43
            r1 = r0
        L41:
            int r4 = r4 + r1
            return r4
        L43:
            int r2 = r2 - r3
            int r2 = r2 - r7
            int r2 = r2 - r1
            int r2 = r2 - r4
            int r0 = r5.bottomMargin
            if (r2 >= r0) goto L41
            int r0 = r0 - r2
            int r1 = r1 - r0
            int r1 = java.lang.Math.max(r6, r1)
            goto L41
        L52:
            int r1 = r8.getHeight()
            int r0 = r8.getPaddingBottom()
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r0 = r5.bottomMargin
            int r1 = r1 - r0
            int r1 = r1 - r4
            return r1
        L61:
            int r0 = r8.getPaddingTop()
            int r0 = r0 - r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A03(android.view.View, int):int");
    }

    public final int A04(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final int A05(View view, int i, int[] iArr, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int A03 = A03(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, A03, max + measuredWidth, view.getMeasuredHeight() + A03);
        return measuredWidth + marginLayoutParams.rightMargin + max;
    }

    public final int A06(View view, int i, int[] iArr, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int A03 = A03(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, A03, max, view.getMeasuredHeight() + A03);
        return max - (measuredWidth + marginLayoutParams.leftMargin);
    }

    public void A07() {
        if (this.A0H == null) {
            C04860Me c04860Me = new C04860Me(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.A0H = c04860Me;
            c04860Me.setImageDrawable(this.A0F);
            this.A0H.setContentDescription(this.A0T);
            C08860cC c08860cC = new C08860cC();
            ((C0U2) c08860cC).A00 = 8388611 | (this.A00 & 112);
            c08860cC.A00 = 2;
            this.A0H.setLayoutParams(c08860cC);
            this.A0H.setOnClickListener(new View.OnClickListener() { // from class: X.0hr
                {
                    Toolbar.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C28421Rt c28421Rt;
                    C1SN c1sn = Toolbar.this.A0Q;
                    if (c1sn == null || (c28421Rt = c1sn.A01) == null) {
                        return;
                    }
                    c28421Rt.collapseActionView();
                }
            });
        }
    }

    public void A08() {
        getMenuInflater().inflate(R.menu.bloks_navigation_menu, getMenu());
    }

    public void A09() {
        A0A();
        C08490bZ c08490bZ = this.A0P;
        c08490bZ.A06 = false;
        c08490bZ.A01 = 0;
        c08490bZ.A03 = 0;
        c08490bZ.A02 = 0;
        c08490bZ.A04 = 0;
    }

    public final void A0A() {
        if (this.A0P == null) {
            this.A0P = new C08490bZ();
        }
    }

    public final void A0B() {
        A0C();
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView.A06 == null) {
            C06650Uk c06650Uk = (C06650Uk) actionMenuView.getMenu();
            C1SN c1sn = this.A0Q;
            if (c1sn == null) {
                c1sn = new C1SN(this);
                this.A0Q = c1sn;
            }
            this.A0O.setExpandedActionViewsExclusive(true);
            c06650Uk.A0C(c1sn, this.A0C);
        }
    }

    public final void A0C() {
        if (this.A0O == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.A0O = actionMenuView;
            actionMenuView.setPopupTheme(this.A05);
            ActionMenuView actionMenuView2 = this.A0O;
            actionMenuView2.A09 = this.A0Z;
            C0VF c0vf = this.A0M;
            C0CO c0co = this.A0L;
            actionMenuView2.A07 = c0vf;
            actionMenuView2.A05 = c0co;
            C08860cC c08860cC = new C08860cC();
            ((C0U2) c08860cC).A00 = 8388613 | (this.A00 & 112);
            this.A0O.setLayoutParams(c08860cC);
            A0F(this.A0O, false);
        }
    }

    public final void A0D() {
        if (this.A0I == null) {
            this.A0I = new C04860Me(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C08860cC c08860cC = new C08860cC();
            ((C0U2) c08860cC).A00 = 8388611 | (this.A00 & 112);
            this.A0I.setLayoutParams(c08860cC);
        }
    }

    public final void A0E(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void A0F(View view, boolean z) {
        C08860cC c08860cC;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c08860cC = new C08860cC();
        } else if (!checkLayoutParams(layoutParams)) {
            c08860cC = A02(layoutParams);
        } else {
            c08860cC = (C08860cC) layoutParams;
        }
        c08860cC.A00 = 1;
        if (z && this.A0G != null) {
            view.setLayoutParams(c08860cC);
            this.A0b.add(view);
            return;
        }
        addView(view, c08860cC);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0G(java.util.List r10, int r11) {
        /*
            r9 = this;
            int r0 = X.C0AT.A05(r9)
            r7 = 0
            r2 = 1
            r1 = 0
            if (r0 != r2) goto La
            r1 = 1
        La:
            int r6 = r9.getChildCount()
            int r0 = X.C0AT.A05(r9)
            int r8 = X.C07O.A01(r11, r0)
            r10.clear()
            if (r1 == 0) goto L53
            int r6 = r6 - r2
        L1c:
            if (r6 < 0) goto L8a
            android.view.View r5 = r9.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            X.0cC r1 = (X.C08860cC) r1
            int r0 = r1.A00
            if (r0 != 0) goto L4e
            boolean r0 = r9.A0I(r5)
            if (r0 == 0) goto L4e
            int r0 = r1.A00
            int r4 = X.C0AT.A05(r9)
            int r0 = X.C07O.A01(r0, r4)
            r3 = r0 & 7
            if (r3 == r2) goto L51
            r1 = 3
            if (r3 == r1) goto L51
            r0 = 5
            if (r3 == r0) goto L51
            if (r4 != r2) goto L49
            r1 = 5
        L49:
            if (r1 != r8) goto L4e
            r10.add(r5)
        L4e:
            int r6 = r6 + (-1)
            goto L1c
        L51:
            r1 = r3
            goto L49
        L53:
            if (r7 >= r6) goto L8a
            android.view.View r5 = r9.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            X.0cC r1 = (X.C08860cC) r1
            int r0 = r1.A00
            if (r0 != 0) goto L85
            boolean r0 = r9.A0I(r5)
            if (r0 == 0) goto L85
            int r0 = r1.A00
            int r4 = X.C0AT.A05(r9)
            int r0 = X.C07O.A01(r0, r4)
            r3 = r0 & 7
            if (r3 == r2) goto L88
            r1 = 3
            if (r3 == r1) goto L88
            r0 = 5
            if (r3 == r0) goto L88
            if (r4 != r2) goto L80
            r1 = 5
        L80:
            if (r1 != r8) goto L85
            r10.add(r5)
        L85:
            int r7 = r7 + 1
            goto L53
        L88:
            r1 = r3
            goto L80
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0G(java.util.List, int):void");
    }

    public final boolean A0H(View view) {
        return view.getParent() == this || this.A0b.contains(view);
    }

    public final boolean A0I(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C08860cC);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C08860cC();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C08860cC(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A02(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C08490bZ c08490bZ = this.A0P;
        if (c08490bZ != null) {
            return c08490bZ.A07 ? c08490bZ.A03 : c08490bZ.A04;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A01;
        return i == Integer.MIN_VALUE ? getContentInsetEnd() : i;
    }

    public int getContentInsetLeft() {
        C08490bZ c08490bZ = this.A0P;
        if (c08490bZ != null) {
            return c08490bZ.A03;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C08490bZ c08490bZ = this.A0P;
        if (c08490bZ != null) {
            return c08490bZ.A04;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C08490bZ c08490bZ = this.A0P;
        if (c08490bZ != null) {
            return c08490bZ.A07 ? c08490bZ.A04 : c08490bZ.A03;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.A02;
        return i == Integer.MIN_VALUE ? getContentInsetStart() : i;
    }

    public int getCurrentContentInsetEnd() {
        C06650Uk c06650Uk;
        ActionMenuView actionMenuView = this.A0O;
        return (actionMenuView == null || (c06650Uk = actionMenuView.A06) == null || !c06650Uk.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A01, 0));
    }

    public int getCurrentContentInsetLeft() {
        return C0AT.A05(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0AT.A05(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.A02, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.A0J;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.A0J;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        A0B();
        return this.A0O.getMenu();
    }

    private MenuInflater getMenuInflater() {
        return new C0UW(getContext());
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C38311nu getOuterActionMenuPresenter() {
        return this.A0N;
    }

    public Drawable getOverflowIcon() {
        A0B();
        return this.A0O.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.A0C;
    }

    public int getPopupTheme() {
        return this.A05;
    }

    public CharSequence getSubtitle() {
        return this.A0U;
    }

    public final TextView getSubtitleTextView() {
        return this.A0K;
    }

    public CharSequence getTitle() {
        return this.A0V;
    }

    public int getTitleMarginBottom() {
        return this.A07;
    }

    public int getTitleMarginEnd() {
        return this.A08;
    }

    public int getTitleMarginStart() {
        return this.A09;
    }

    public int getTitleMarginTop() {
        return this.A0A;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public InterfaceC08830c9 getWrapper() {
        C08820c8 c08820c8 = this.A0S;
        if (c08820c8 == null) {
            C08820c8 c08820c82 = new C08820c8(this, true);
            this.A0S = c08820c82;
            return c08820c82;
        }
        return c08820c8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.A0a);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0X = false;
        }
        if (!this.A0X) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0X = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0X = false;
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01a2 A[LOOP:0: B:192:0x01a0->B:193:0x01a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x028e A[LOOP:1: B:229:0x028c->B:230:0x028e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ac A[LOOP:2: B:232:0x02aa->B:233:0x02ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f6 A[LOOP:3: B:240:0x02f4->B:241:0x02f6, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.A0d;
        int i9 = 0;
        char c = 0;
        char c2 = 1;
        if (C0Ux.A01(this)) {
            c = 1;
            c2 = 0;
        }
        if (A0I(this.A0I)) {
            A0E(this.A0I, i, 0, i2, this.A04);
            i3 = A00(this.A0I) + this.A0I.getMeasuredWidth();
            i4 = Math.max(0, A01(this.A0I) + this.A0I.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.A0I.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (A0I(this.A0H)) {
            A0E(this.A0H, i, 0, i2, this.A04);
            i3 = A00(this.A0H) + this.A0H.getMeasuredWidth();
            i4 = Math.max(i4, A01(this.A0H) + this.A0H.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A0H.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (A0I(this.A0O)) {
            A0E(this.A0O, i, max, i2, this.A04);
            i6 = A00(this.A0O) + this.A0O.getMeasuredWidth();
            i4 = Math.max(i4, A01(this.A0O) + this.A0O.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A0O.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (A0I(this.A0G)) {
            max2 += A04(this.A0G, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, A01(this.A0G) + this.A0G.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A0G.getMeasuredState());
        }
        if (A0I(this.A0J)) {
            max2 += A04(this.A0J, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, A01(this.A0J) + this.A0J.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A0J.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((C08860cC) childAt.getLayoutParams()).A00 == 0 && A0I(childAt)) {
                max2 += A04(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, A01(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.A0A + this.A07;
        int i12 = this.A09 + this.A08;
        if (A0I(this.mTitleTextView)) {
            A04(this.mTitleTextView, i, max2 + i12, i2, i11, iArr);
            i7 = A00(this.mTitleTextView) + this.mTitleTextView.getMeasuredWidth();
            i8 = A01(this.mTitleTextView) + this.mTitleTextView.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (A0I(this.A0K)) {
            i7 = Math.max(i7, A04(this.A0K, i, max2 + i12, i2, i8 + i11, iArr));
            i8 += A01(this.A0K) + this.A0K.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, this.A0K.getMeasuredState());
        }
        int i13 = max2 + i7;
        int max3 = Math.max(i4, i8);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(getPaddingRight() + paddingLeft + i13, getSuggestedMinimumWidth()), i, (-16777216) & i5);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + max3, getSuggestedMinimumHeight()), i2, i5 << 16);
        if (this.A0W) {
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!A0I(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i9);
        }
        i9 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i9);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C06650Uk c06650Uk;
        MenuItem findItem;
        if (!(parcelable instanceof C1SO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1SO c1so = (C1SO) parcelable;
        super.onRestoreInstanceState(((AbstractC13390lB) c1so).A00);
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView != null) {
            c06650Uk = actionMenuView.A06;
        } else {
            c06650Uk = null;
        }
        int i = c1so.A00;
        if (i != 0 && this.A0Q != null && c06650Uk != null && (findItem = c06650Uk.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c1so.A01) {
            Runnable runnable = this.A0a;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        A0A();
        C08490bZ c08490bZ = this.A0P;
        boolean z = i == 1;
        if (z != c08490bZ.A07) {
            c08490bZ.A07 = z;
            if (!c08490bZ.A06) {
                c08490bZ.A03 = c08490bZ.A01;
                c08490bZ.A04 = c08490bZ.A02;
            } else if (z) {
                int i2 = c08490bZ.A00;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = c08490bZ.A01;
                }
                c08490bZ.A03 = i2;
                int i3 = c08490bZ.A05;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = c08490bZ.A02;
                }
                c08490bZ.A04 = i3;
            } else {
                int i4 = c08490bZ.A05;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = c08490bZ.A01;
                }
                c08490bZ.A03 = i4;
                int i5 = c08490bZ.A00;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = c08490bZ.A02;
                }
                c08490bZ.A04 = i5;
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C38311nu c38311nu;
        C28421Rt c28421Rt;
        C1SO c1so = new C1SO(super.onSaveInstanceState());
        C1SN c1sn = this.A0Q;
        if (c1sn != null && (c28421Rt = c1sn.A01) != null) {
            c1so.A00 = c28421Rt.A0R;
        }
        ActionMenuView actionMenuView = this.A0O;
        boolean z = true;
        c1so.A01 = (actionMenuView == null || (c38311nu = actionMenuView.A08) == null || !c38311nu.A02()) ? false : false;
        return c1so;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0Y = false;
        }
        if (!this.A0Y) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0Y = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0Y = false;
            return true;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A07();
        }
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C09L.A01(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            A07();
            this.A0H.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.A0H;
        if (imageButton == null) {
            return;
        }
        imageButton.setImageDrawable(this.A0F);
    }

    public void setCollapsible(boolean z) {
        this.A0W = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i != this.A01) {
            this.A01 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i != this.A02) {
            this.A02 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C09L.A01(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        ImageView imageView = this.A0J;
        if (drawable != null) {
            if (imageView == null) {
                imageView = new C0S5(getContext(), null);
                this.A0J = imageView;
            }
            if (!A0H(imageView)) {
                A0F(this.A0J, true);
            }
        } else if (imageView != null && A0H(imageView)) {
            removeView(this.A0J);
            this.A0b.remove(this.A0J);
        }
        ImageView imageView2 = this.A0J;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A0J == null) {
            this.A0J = new C0S5(getContext(), null);
        }
        ImageView imageView = this.A0J;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A0D();
        }
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C09L.A01(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            A0D();
            if (!A0H(this.A0I)) {
                A0F(this.A0I, true);
            }
        } else {
            ImageButton imageButton = this.A0I;
            if (imageButton != null && A0H(imageButton)) {
                removeView(this.A0I);
                this.A0b.remove(this.A0I);
            }
        }
        ImageButton imageButton2 = this.A0I;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        A0D();
        this.A0I.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC08810c7 interfaceC08810c7) {
        this.A0R = interfaceC08810c7;
    }

    public void setOverflowIcon(Drawable drawable) {
        A0B();
        this.A0O.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.A05 != i) {
            this.A05 = i;
            if (i == 0) {
                this.A0C = getContext();
            } else {
                this.A0C = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.A0K == null) {
                Context context = getContext();
                C02700Cn c02700Cn = new C02700Cn(context, null);
                this.A0K = c02700Cn;
                c02700Cn.setSingleLine();
                this.A0K.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A06;
                if (i != 0) {
                    this.A0K.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0D;
                if (colorStateList != null) {
                    this.A0K.setTextColor(colorStateList);
                }
            }
            if (!A0H(this.A0K)) {
                A0F(this.A0K, true);
            }
        } else {
            TextView textView = this.A0K;
            if (textView != null && A0H(textView)) {
                removeView(this.A0K);
                this.A0b.remove(this.A0K);
            }
        }
        TextView textView2 = this.A0K;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0U = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        TextView textView = this.A0K;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                C02700Cn c02700Cn = new C02700Cn(context, null);
                this.mTitleTextView = c02700Cn;
                c02700Cn.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A0B;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0E;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!A0H(this.mTitleTextView)) {
                A0F(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && A0H(textView)) {
                removeView(this.mTitleTextView);
                this.A0b.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0V = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.A07 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.A08 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A09 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.A0A = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A0E = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
