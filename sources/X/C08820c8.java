package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;

/* renamed from: X.0c8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08820c8 implements InterfaceC08830c9 {
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public View A06;
    public Window.Callback A07;
    public C38311nu A08;
    public Toolbar A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public boolean A0D;
    public boolean A0E;

    public C08820c8(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.A00 = 0;
        this.A09 = toolbar;
        CharSequence charSequence = toolbar.A0V;
        this.A0C = charSequence;
        this.A0B = toolbar.A0U;
        this.A0E = charSequence != null;
        this.A05 = toolbar.getNavigationIcon();
        C0V9 A00 = C0V9.A00(toolbar.getContext(), null, C0UY.A00, R.attr.actionBarStyle);
        this.A02 = A00.A02(15);
        if (z) {
            TypedArray typedArray = A00.A02;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                AU0(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                ATv(text2);
            }
            Drawable A02 = A00.A02(20);
            if (A02 != null) {
                this.A04 = A02;
                A02();
            }
            Drawable A022 = A00.A02(17);
            if (A022 != null) {
                this.A03 = A022;
                A02();
            }
            if (this.A05 == null && (drawable = this.A02) != null) {
                this.A05 = drawable;
                A01();
            }
            ASz(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                ASx(LayoutInflater.from(this.A09.getContext()).inflate(resourceId, (ViewGroup) this.A09, false));
                ASz(this.A01 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.A09.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.A09.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                Toolbar toolbar2 = this.A09;
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar2.A0A();
                toolbar2.A0P.A00(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar3 = this.A09;
                Context context = toolbar3.getContext();
                toolbar3.A0B = resourceId2;
                TextView textView = toolbar3.mTitleTextView;
                if (textView != null) {
                    textView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar4 = this.A09;
                Context context2 = toolbar4.getContext();
                toolbar4.A06 = resourceId3;
                TextView textView2 = toolbar4.A0K;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                this.A09.setPopupTheme(resourceId4);
            }
        } else {
            int i = 11;
            if (this.A09.getNavigationIcon() != null) {
                i = 15;
                this.A02 = this.A09.getNavigationIcon();
            }
            this.A01 = i;
        }
        A00.A02.recycle();
        if (R.string.abc_action_bar_up_description != this.A00) {
            this.A00 = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.A09.getNavigationContentDescription())) {
                this.A0A = getContext().getString(R.string.abc_action_bar_up_description);
                A00();
            }
        }
        this.A0A = this.A09.getNavigationContentDescription();
        this.A09.setNavigationOnClickListener(new View.OnClickListener() { // from class: X.0cA
            public final C08850cB A00;

            /* JADX WARN: Type inference failed for: r0v2, types: [X.0cB] */
            {
                this.A00 = new InterfaceMenuItemC07810a4(C08820c8.this.A09.getContext(), C08820c8.this.A0C) { // from class: X.0cB
                    public char A00;
                    public char A01;
                    public Context A05;
                    public Intent A06;
                    public Drawable A09;
                    public CharSequence A0A;
                    public CharSequence A0B;
                    public CharSequence A0C;
                    public CharSequence A0D;
                    public int A04 = 4096;
                    public int A03 = 4096;
                    public ColorStateList A07 = null;
                    public PorterDuff.Mode A08 = null;
                    public boolean A0E = false;
                    public boolean A0F = false;
                    public int A02 = 16;
                    public final int A0G = 16908332;

                    @Override // X.InterfaceMenuItemC07810a4
                    public AbstractC13060kX ADM() {
                        return null;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public boolean collapseActionView() {
                        return false;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public boolean expandActionView() {
                        return false;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public View getActionView() {
                        return null;
                    }

                    @Override // android.view.MenuItem
                    public ContextMenu.ContextMenuInfo getMenuInfo() {
                        return null;
                    }

                    @Override // android.view.MenuItem
                    public SubMenu getSubMenu() {
                        return null;
                    }

                    @Override // android.view.MenuItem
                    public boolean hasSubMenu() {
                        return false;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public boolean isActionViewExpanded() {
                        return false;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
                        return this;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public void setShowAsAction(int i2) {
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public MenuItem setShowAsActionFlags(int i2) {
                        return this;
                    }

                    {
                        this.A05 = r3;
                        this.A0B = r4;
                    }

                    public final void A00() {
                        Drawable drawable2 = this.A09;
                        if (drawable2 != null) {
                            if (this.A0E || this.A0F) {
                                Drawable A0I = C07O.A0I(drawable2);
                                this.A09 = A0I;
                                Drawable mutate = A0I.mutate();
                                this.A09 = mutate;
                                if (this.A0E) {
                                    C07O.A0Z(mutate, this.A07);
                                }
                                if (this.A0F) {
                                    C07O.A0a(this.A09, this.A08);
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceMenuItemC07810a4
                    public InterfaceMenuItemC07810a4 ASs(CharSequence charSequence2) {
                        this.A0A = charSequence2;
                        return this;
                    }

                    @Override // X.InterfaceMenuItemC07810a4
                    public InterfaceMenuItemC07810a4 ATw(AbstractC13060kX abstractC13060kX) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // X.InterfaceMenuItemC07810a4
                    public InterfaceMenuItemC07810a4 AU2(CharSequence charSequence2) {
                        this.A0D = charSequence2;
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public ActionProvider getActionProvider() {
                        throw new UnsupportedOperationException();
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public int getAlphabeticModifiers() {
                        return this.A03;
                    }

                    @Override // android.view.MenuItem
                    public char getAlphabeticShortcut() {
                        return this.A00;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public CharSequence getContentDescription() {
                        return this.A0A;
                    }

                    @Override // android.view.MenuItem
                    public int getGroupId() {
                        return 0;
                    }

                    @Override // android.view.MenuItem
                    public Drawable getIcon() {
                        return this.A09;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public ColorStateList getIconTintList() {
                        return this.A07;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public PorterDuff.Mode getIconTintMode() {
                        return this.A08;
                    }

                    @Override // android.view.MenuItem
                    public Intent getIntent() {
                        return this.A06;
                    }

                    @Override // android.view.MenuItem
                    public int getItemId() {
                        return this.A0G;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public int getNumericModifiers() {
                        return this.A04;
                    }

                    @Override // android.view.MenuItem
                    public char getNumericShortcut() {
                        return this.A01;
                    }

                    @Override // android.view.MenuItem
                    public int getOrder() {
                        return 0;
                    }

                    @Override // android.view.MenuItem
                    public CharSequence getTitle() {
                        return this.A0B;
                    }

                    @Override // android.view.MenuItem
                    public CharSequence getTitleCondensed() {
                        CharSequence charSequence2 = this.A0C;
                        return charSequence2 == null ? this.A0B : charSequence2;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public CharSequence getTooltipText() {
                        return this.A0D;
                    }

                    @Override // android.view.MenuItem
                    public boolean isCheckable() {
                        return (this.A02 & 1) != 0;
                    }

                    @Override // android.view.MenuItem
                    public boolean isChecked() {
                        return (this.A02 & 2) != 0;
                    }

                    @Override // android.view.MenuItem
                    public boolean isEnabled() {
                        return (this.A02 & 16) != 0;
                    }

                    @Override // android.view.MenuItem
                    public boolean isVisible() {
                        return (this.A02 & 8) == 0;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setActionProvider(ActionProvider actionProvider) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public MenuItem setActionView(int i2) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public MenuItem setActionView(View view) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setAlphabeticShortcut(char c) {
                        this.A00 = Character.toLowerCase(c);
                        return this;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public MenuItem setAlphabeticShortcut(char c, int i2) {
                        this.A00 = Character.toLowerCase(c);
                        this.A03 = KeyEvent.normalizeMetaState(i2);
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setCheckable(boolean z2) {
                        this.A02 = (z2 ? 1 : 0) | (this.A02 & (-2));
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setChecked(boolean z2) {
                        this.A02 = (z2 ? 2 : 0) | (this.A02 & (-3));
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setContentDescription(CharSequence charSequence2) {
                        this.A0A = charSequence2;
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setEnabled(boolean z2) {
                        this.A02 = (z2 ? 16 : 0) | (this.A02 & (-17));
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setIcon(int i2) {
                        this.A09 = C02160Ac.A03(this.A05, i2);
                        A00();
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setIcon(Drawable drawable2) {
                        this.A09 = drawable2;
                        A00();
                        return this;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public MenuItem setIconTintList(ColorStateList colorStateList) {
                        this.A07 = colorStateList;
                        this.A0E = true;
                        A00();
                        return this;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
                        this.A08 = mode;
                        this.A0F = true;
                        A00();
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setIntent(Intent intent) {
                        this.A06 = intent;
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setNumericShortcut(char c) {
                        this.A01 = c;
                        return this;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public MenuItem setNumericShortcut(char c, int i2) {
                        this.A01 = c;
                        this.A04 = KeyEvent.normalizeMetaState(i2);
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setShortcut(char c, char c2) {
                        this.A01 = c;
                        this.A00 = Character.toLowerCase(c2);
                        return this;
                    }

                    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
                    public MenuItem setShortcut(char c, char c2, int i2, int i3) {
                        this.A01 = c;
                        this.A04 = KeyEvent.normalizeMetaState(i2);
                        this.A00 = Character.toLowerCase(c2);
                        this.A03 = KeyEvent.normalizeMetaState(i3);
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setTitle(int i2) {
                        this.A0B = this.A05.getResources().getString(i2);
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setTitle(CharSequence charSequence2) {
                        this.A0B = charSequence2;
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setTitleCondensed(CharSequence charSequence2) {
                        this.A0C = charSequence2;
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setTooltipText(CharSequence charSequence2) {
                        this.A0D = charSequence2;
                        return this;
                    }

                    @Override // android.view.MenuItem
                    public MenuItem setVisible(boolean z2) {
                        this.A02 = (this.A02 & 8) | (z2 ? 0 : 8);
                        return this;
                    }
                };
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C08820c8 c08820c8 = C08820c8.this;
                Window.Callback callback = c08820c8.A07;
                if (callback == null || !c08820c8.A0D) {
                    return;
                }
                callback.onMenuItemSelected(0, this.A00);
            }
        });
    }

    public final void A00() {
        if ((this.A01 & 4) != 0) {
            if (TextUtils.isEmpty(this.A0A)) {
                this.A09.setNavigationContentDescription(this.A00);
            } else {
                this.A09.setNavigationContentDescription(this.A0A);
            }
        }
    }

    public final void A01() {
        if ((this.A01 & 4) == 0) {
            this.A09.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.A09;
        Drawable drawable = this.A05;
        if (drawable == null) {
            drawable = this.A02;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void A02() {
        Drawable drawable;
        int i = this.A01;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.A04;
            if (drawable == null) {
                drawable = this.A03;
            }
        } else {
            drawable = this.A03;
        }
        this.A09.setLogo(drawable);
    }

    @Override // X.InterfaceC08830c9
    public boolean A5x() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.A09;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.A0O) != null && actionMenuView.A0B;
    }

    @Override // X.InterfaceC08830c9
    public void A6I() {
        C28421Rt c28421Rt;
        C1SN c1sn = this.A09.A0Q;
        if (c1sn == null || (c28421Rt = c1sn.A01) == null) {
            return;
        }
        c28421Rt.collapseActionView();
    }

    @Override // X.InterfaceC08830c9
    public void A7L() {
        C38311nu c38311nu;
        ActionMenuView actionMenuView = this.A09.A0O;
        if (actionMenuView != null && (c38311nu = actionMenuView.A08) != null) {
            c38311nu.A01();
            C1S0 c1s0 = c38311nu.A06;
            if (c1s0 != null) {
                c1s0.A01();
            }
        }
    }

    @Override // X.InterfaceC08830c9
    public int A9o() {
        return this.A01;
    }

    @Override // X.InterfaceC08830c9
    public Menu ABD() {
        return this.A09.getMenu();
    }

    @Override // X.InterfaceC08830c9
    public int ABY() {
        return 0;
    }

    @Override // X.InterfaceC08830c9
    public ViewGroup ADu() {
        return this.A09;
    }

    @Override // X.InterfaceC08830c9
    public boolean AER() {
        C1SN c1sn = this.A09.A0Q;
        return (c1sn == null || c1sn.A01 == null) ? false : true;
    }

    @Override // X.InterfaceC08830c9
    public boolean AEd() {
        C38311nu c38311nu;
        ActionMenuView actionMenuView = this.A09.A0O;
        return (actionMenuView == null || (c38311nu = actionMenuView.A08) == null || !c38311nu.A01()) ? false : true;
    }

    @Override // X.InterfaceC08830c9
    public void AEu() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // X.InterfaceC08830c9
    public void AEv() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // X.InterfaceC08830c9
    public boolean AFa() {
        C38311nu c38311nu;
        ActionMenuView actionMenuView = this.A09.A0O;
        if (actionMenuView == null || (c38311nu = actionMenuView.A08) == null) {
            return false;
        }
        return c38311nu.A08 != null || c38311nu.A02();
    }

    @Override // X.InterfaceC08830c9
    public boolean AFb() {
        C38311nu c38311nu;
        ActionMenuView actionMenuView = this.A09.A0O;
        return (actionMenuView == null || (c38311nu = actionMenuView.A08) == null || !c38311nu.A02()) ? false : true;
    }

    @Override // X.InterfaceC08830c9
    public void ASk(Drawable drawable) {
        this.A09.setBackground(drawable);
    }

    @Override // X.InterfaceC08830c9
    public void ASp(boolean z) {
        this.A09.setCollapsible(z);
    }

    @Override // X.InterfaceC08830c9
    public void ASx(View view) {
        View view2 = this.A06;
        if (view2 != null && (this.A01 & 16) != 0) {
            this.A09.removeView(view2);
        }
        this.A06 = view;
        if (view == null || (this.A01 & 16) == 0) {
            return;
        }
        this.A09.addView(view);
    }

    @Override // X.InterfaceC08830c9
    public void ASz(int i) {
        View view;
        int i2 = this.A01 ^ i;
        this.A01 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    A00();
                }
                A01();
            }
            if ((i2 & 3) != 0) {
                A02();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.A09.setTitle(this.A0C);
                    this.A09.setSubtitle(this.A0B);
                } else {
                    this.A09.setTitle((CharSequence) null);
                    this.A09.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.A06) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.A09.addView(view);
            } else {
                this.A09.removeView(view);
            }
        }
    }

    @Override // X.InterfaceC08830c9
    public void AT1(C11310hX c11310hX) {
    }

    @Override // X.InterfaceC08830c9
    public void AT7(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C09L.A01(getContext(), i);
        } else {
            drawable = null;
        }
        this.A03 = drawable;
        A02();
    }

    @Override // X.InterfaceC08830c9
    public void AT8(Drawable drawable) {
        this.A03 = drawable;
        A02();
    }

    @Override // X.InterfaceC08830c9
    public void ATF(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C09L.A01(getContext(), i);
        } else {
            drawable = null;
        }
        this.A04 = drawable;
        A02();
    }

    @Override // X.InterfaceC08830c9
    public void ATG(Drawable drawable) {
        this.A04 = drawable;
        A02();
    }

    @Override // X.InterfaceC08830c9
    public void ATM(C0VF c0vf, C0CO c0co) {
        Toolbar toolbar = this.A09;
        toolbar.A0M = c0vf;
        toolbar.A0L = c0co;
        ActionMenuView actionMenuView = toolbar.A0O;
        if (actionMenuView != null) {
            actionMenuView.A07 = c0vf;
            actionMenuView.A05 = c0co;
        }
    }

    @Override // X.InterfaceC08830c9
    public void ATN() {
        this.A0D = true;
    }

    @Override // X.InterfaceC08830c9
    public void ATR(Drawable drawable) {
        this.A05 = drawable;
        A01();
    }

    @Override // X.InterfaceC08830c9
    public void ATv(CharSequence charSequence) {
        this.A0B = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setSubtitle(charSequence);
        }
    }

    @Override // X.InterfaceC08830c9
    public void AU0(CharSequence charSequence) {
        this.A0E = true;
        this.A0C = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setTitle(charSequence);
        }
    }

    @Override // X.InterfaceC08830c9
    public void AU8(int i) {
        this.A09.setVisibility(i);
    }

    @Override // X.InterfaceC08830c9
    public C0TT AUI(final int i, long j) {
        C0TT A0E = C0AT.A0E(this.A09);
        A0E.A02(i == 0 ? 1.0f : 0.0f);
        A0E.A04(j);
        C06680Un c06680Un = new C06680Un() { // from class: X.1nz
            public boolean A00 = false;

            @Override // X.C06680Un, X.C0TU
            public void AH6(View view) {
                this.A00 = true;
            }

            @Override // X.C0TU
            public void AH8(View view) {
                if (this.A00) {
                    return;
                }
                C08820c8.this.A09.setVisibility(i);
            }

            @Override // X.C06680Un, X.C0TU
            public void AHC(View view) {
                C08820c8.this.A09.setVisibility(0);
            }
        };
        View view = (View) A0E.A01.get();
        if (view != null) {
            A0E.A05(view, c06680Un);
        }
        return A0E;
    }

    @Override // X.InterfaceC08830c9
    public boolean AUn() {
        C38311nu c38311nu;
        ActionMenuView actionMenuView = this.A09.A0O;
        return (actionMenuView == null || (c38311nu = actionMenuView.A08) == null || !c38311nu.A03()) ? false : true;
    }

    @Override // X.InterfaceC08830c9
    public Context getContext() {
        return this.A09.getContext();
    }

    @Override // X.InterfaceC08830c9
    public CharSequence getTitle() {
        return this.A09.A0V;
    }

    @Override // X.InterfaceC08830c9
    public void setMenu(Menu menu, C0VF c0vf) {
        C28421Rt c28421Rt;
        C38311nu c38311nu = this.A08;
        if (c38311nu == null) {
            c38311nu = new C38311nu(this.A09.getContext());
            this.A08 = c38311nu;
        }
        ((AbstractC28381Ro) c38311nu).A06 = c0vf;
        Toolbar toolbar = this.A09;
        C06650Uk c06650Uk = (C06650Uk) menu;
        if (c06650Uk == null && toolbar.A0O == null) {
            return;
        }
        toolbar.A0C();
        C06650Uk c06650Uk2 = toolbar.A0O.A06;
        if (c06650Uk2 == c06650Uk) {
            return;
        }
        if (c06650Uk2 != null) {
            c06650Uk2.A0B(toolbar.A0N);
            c06650Uk2.A0B(toolbar.A0Q);
        }
        if (toolbar.A0Q == null) {
            toolbar.A0Q = new C1SN(toolbar);
        }
        c38311nu.A0B = true;
        if (c06650Uk != null) {
            c06650Uk.A0C(c38311nu, toolbar.A0C);
            c06650Uk.A0C(toolbar.A0Q, toolbar.A0C);
        } else {
            c38311nu.AEt(toolbar.A0C, null);
            C1SN c1sn = toolbar.A0Q;
            C06650Uk c06650Uk3 = c1sn.A00;
            if (c06650Uk3 != null && (c28421Rt = c1sn.A01) != null) {
                c06650Uk3.A0L(c28421Rt);
            }
            c1sn.A00 = null;
            c38311nu.AVo(true);
            toolbar.A0Q.AVo(true);
        }
        toolbar.A0O.setPopupTheme(toolbar.A05);
        toolbar.A0O.setPresenter(c38311nu);
        toolbar.A0N = c38311nu;
    }

    @Override // X.InterfaceC08830c9
    public void setWindowCallback(Window.Callback callback) {
        this.A07 = callback;
    }

    @Override // X.InterfaceC08830c9
    public void setWindowTitle(CharSequence charSequence) {
        if (this.A0E) {
            return;
        }
        this.A0C = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setTitle(charSequence);
        }
    }
}
