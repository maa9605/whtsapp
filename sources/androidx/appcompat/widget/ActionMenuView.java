package androidx.appcompat.widget;

import X.AbstractC28381Ro;
import X.C06650Uk;
import X.C0CO;
import X.C0Ux;
import X.C0VF;
import X.C11190hL;
import X.C1S0;
import X.C1S6;
import X.C28421Rt;
import X.C38301nt;
import X.C38311nu;
import X.InterfaceC06620Uh;
import X.InterfaceC06630Ui;
import X.InterfaceC08470bX;
import X.InterfaceC10980gy;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements InterfaceC06620Uh, InterfaceC06630Ui {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Context A04;
    public C0CO A05;
    public C06650Uk A06;
    public C0VF A07;
    public C38311nu A08;
    public InterfaceC08470bX A09;
    public boolean A0A;
    public boolean A0B;

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.A0B = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.A02 = (int) (56.0f * f);
        this.A01 = (int) (f * 4.0f);
        this.A04 = context;
        this.A03 = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public /* bridge */ /* synthetic */ C11190hL A00() {
        C1S6 c1s6 = new C1S6();
        ((C11190hL) c1s6).A01 = 16;
        return c1s6;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public C11190hL A01(AttributeSet attributeSet) {
        return new C1S6(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: A06 */
    public C1S6 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            C1S6 c1s6 = layoutParams instanceof C1S6 ? new C1S6((C1S6) layoutParams) : new C1S6(layoutParams);
            if (((C11190hL) c1s6).A01 <= 0) {
                ((C11190hL) c1s6).A01 = 16;
            }
            return c1s6;
        }
        C1S6 c1s62 = new C1S6();
        ((C11190hL) c1s62).A01 = 16;
        return c1s62;
    }

    public boolean A07(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC10980gy)) {
            z = false | ((InterfaceC10980gy) childAt).AGb();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC10980gy)) ? z : z | ((InterfaceC10980gy) childAt2).AGc();
    }

    @Override // X.InterfaceC06630Ui
    public void AEy(C06650Uk c06650Uk) {
        this.A06 = c06650Uk;
    }

    @Override // X.InterfaceC06620Uh
    public boolean AF3(C28421Rt c28421Rt) {
        return this.A06.A0J(c28421Rt, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1S6;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C1S6 c1s6 = new C1S6();
        ((C11190hL) c1s6).A01 = 16;
        return c1s6;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1S6(getContext(), attributeSet);
    }

    public Menu getMenu() {
        C06650Uk c06650Uk = this.A06;
        if (c06650Uk == null) {
            Context context = getContext();
            C06650Uk c06650Uk2 = new C06650Uk(context);
            this.A06 = c06650Uk2;
            c06650Uk2.A03 = new C0CO() { // from class: X.1S7
                {
                    ActionMenuView.this = this;
                }

                @Override // X.C0CO
                public boolean AM1(C06650Uk c06650Uk3, MenuItem menuItem) {
                    InterfaceC08810c7 interfaceC08810c7;
                    InterfaceC08470bX interfaceC08470bX = ActionMenuView.this.A09;
                    return (interfaceC08470bX == null || (interfaceC08810c7 = ((C08460bW) interfaceC08470bX).A00.A0R) == null || !interfaceC08810c7.onMenuItemClick(menuItem)) ? false : true;
                }

                @Override // X.C0CO
                public void AM2(C06650Uk c06650Uk3) {
                    C0CO c0co = ActionMenuView.this.A05;
                    if (c0co != null) {
                        c0co.AM2(c06650Uk3);
                    }
                }
            };
            C38311nu c38311nu = new C38311nu(context);
            this.A08 = c38311nu;
            c38311nu.A0D = true;
            c38311nu.A0E = true;
            C0VF c0vf = this.A07;
            if (c0vf == null) {
                c0vf = new C0VF() { // from class: X.1S5
                    @Override // X.C0VF
                    public void AIe(C06650Uk c06650Uk3, boolean z) {
                    }

                    @Override // X.C0VF
                    public boolean AMY(C06650Uk c06650Uk3) {
                        return false;
                    }
                };
            }
            ((AbstractC28381Ro) c38311nu).A06 = c0vf;
            this.A06.A0C(c38311nu, this.A04);
            C38311nu c38311nu2 = this.A08;
            ((AbstractC28381Ro) c38311nu2).A07 = this;
            C06650Uk c06650Uk3 = ((AbstractC28381Ro) c38311nu2).A05;
            this.A06 = c06650Uk3;
            return c06650Uk3;
        }
        return c06650Uk;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C38311nu c38311nu = this.A08;
        C38301nt c38301nt = c38311nu.A09;
        if (c38301nt != null) {
            return c38301nt.getDrawable();
        }
        if (c38311nu.A0C) {
            return c38311nu.A05;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.A03;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C38311nu c38311nu = this.A08;
        if (c38311nu != null) {
            c38311nu.AVo(false);
            if (this.A08.A02()) {
                this.A08.A01();
                this.A08.A03();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C38311nu c38311nu = this.A08;
        if (c38311nu != null) {
            c38311nu.A01();
            C1S0 c1s0 = c38311nu.A06;
            if (c1s0 != null) {
                c1s0.A01();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.A0A) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) >> 1;
        int i8 = super.A05;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean A01 = C0Ux.A01(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C1S6 c1s6 = (C1S6) childAt.getLayoutParams();
                if (c1s6.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A07(i12)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (A01) {
                        i6 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1s6).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1s6).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i13 = i7 - (measuredHeight >> 1);
                    childAt.layout(i6, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1s6).leftMargin) + ((ViewGroup.MarginLayoutParams) c1s6).rightMargin;
                    A07(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 >> 1) - (measuredWidth2 >> 1);
            int i15 = i7 - (measuredHeight2 >> 1);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (A01) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C1S6 c1s62 = (C1S6) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1s62.A04) {
                    int i18 = width2 - ((ViewGroup.MarginLayoutParams) c1s62).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i7 - (measuredHeight3 >> 1);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1s62).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C1S6 c1s63 = (C1S6) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1s63.A04) {
                int i21 = paddingLeft + ((ViewGroup.MarginLayoutParams) c1s63).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i7 - (measuredHeight4 >> 1);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c1s63).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x00b8, code lost:
        if ((!android.text.TextUtils.isEmpty(((X.C02700Cn) r14).getText())) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x00ed, code lost:
        if ((!android.text.TextUtils.isEmpty(r0.getText())) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x015a, code lost:
        if (r22 != 2) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x01da, code lost:
        if (r22 != 1) goto L188;
     */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v97 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A08.A0B = z;
    }

    public void setOnMenuItemClickListener(InterfaceC08470bX interfaceC08470bX) {
        this.A09 = interfaceC08470bX;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C38311nu c38311nu = this.A08;
        C38301nt c38301nt = c38311nu.A09;
        if (c38301nt != null) {
            c38301nt.setImageDrawable(drawable);
            return;
        }
        c38311nu.A0C = true;
        c38311nu.A05 = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.A0B = z;
    }

    public void setPopupTheme(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            if (i == 0) {
                this.A04 = getContext();
            } else {
                this.A04 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C38311nu c38311nu) {
        this.A08 = c38311nu;
        ((AbstractC28381Ro) c38311nu).A07 = this;
        this.A06 = ((AbstractC28381Ro) c38311nu).A05;
    }
}
