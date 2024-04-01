package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.1Rt */
/* loaded from: classes.dex */
public final class C28421Rt implements InterfaceMenuItemC07810a4 {
    public char A00;
    public char A01;
    public int A06;
    public Intent A07;
    public Drawable A0A;
    public MenuItem.OnActionExpandListener A0B;
    public MenuItem.OnMenuItemClickListener A0C;
    public View A0D;
    public C06650Uk A0E;
    public SubMenuC38291ns A0F;
    public AbstractC13060kX A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public int A05 = 4096;
    public int A04 = 4096;
    public int A03 = 0;
    public ColorStateList A08 = null;
    public PorterDuff.Mode A09 = null;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0O = false;
    public int A02 = 16;
    public boolean A0N = false;

    public C28421Rt(C06650Uk c06650Uk, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.A06 = 0;
        this.A0E = c06650Uk;
        this.A0R = i2;
        this.A0Q = i;
        this.A0P = i3;
        this.A0S = i4;
        this.A0I = charSequence;
        this.A06 = i5;
    }

    public final Drawable A00(Drawable drawable) {
        if (drawable != null && this.A0O && (this.A0L || this.A0M)) {
            drawable = C07O.A0I(drawable).mutate();
            if (this.A0L) {
                C07O.A0Z(drawable, this.A08);
            }
            if (this.A0M) {
                C07O.A0a(drawable, this.A09);
            }
            this.A0O = false;
        }
        return drawable;
    }

    public void A01(View view) {
        int i;
        this.A0D = view;
        this.A0G = null;
        if (view != null && view.getId() == -1 && (i = this.A0R) > 0) {
            view.setId(i);
        }
        C06650Uk c06650Uk = this.A0E;
        c06650Uk.A0D = true;
        c06650Uk.A0E(true);
    }

    public boolean A02() {
        AbstractC13060kX abstractC13060kX;
        if ((this.A06 & 8) != 0) {
            View view = this.A0D;
            if (view == null && (abstractC13060kX = this.A0G) != null) {
                view = abstractC13060kX.A00(this);
                this.A0D = view;
            }
            return view != null;
        }
        return false;
    }

    @Override // X.InterfaceMenuItemC07810a4
    public AbstractC13060kX ADM() {
        return this.A0G;
    }

    @Override // X.InterfaceMenuItemC07810a4
    public InterfaceMenuItemC07810a4 ASs(CharSequence charSequence) {
        this.A0H = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4
    public InterfaceMenuItemC07810a4 ATw(AbstractC13060kX abstractC13060kX) {
        AbstractC13060kX abstractC13060kX2 = this.A0G;
        if (abstractC13060kX2 != null) {
            abstractC13060kX2.A00 = null;
        }
        this.A0D = null;
        this.A0G = abstractC13060kX;
        this.A0E.A0E(true);
        AbstractC13060kX abstractC13060kX3 = this.A0G;
        if (abstractC13060kX3 != null) {
            abstractC13060kX3.A01(new C28411Rs(this));
        }
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4
    public InterfaceMenuItemC07810a4 AU2(CharSequence charSequence) {
        this.A0K = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.A06 & 8) == 0) {
            return false;
        }
        if (this.A0D == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A0B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.A0E.A0L(this);
        }
        return false;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public boolean expandActionView() {
        if (A02()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.A0B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.A0E.A0M(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public View getActionView() {
        View view = this.A0D;
        if (view != null) {
            return view;
        }
        AbstractC13060kX abstractC13060kX = this.A0G;
        if (abstractC13060kX != null) {
            View A00 = abstractC13060kX.A00(this);
            this.A0D = A00;
            return A00;
        }
        return null;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.A04;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.A00;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.A0H;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.A0Q;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.A0A;
        if (drawable != null) {
            return A00(drawable);
        }
        int i = this.A03;
        if (i != 0) {
            Drawable A01 = C09L.A01(this.A0E.A0M, i);
            this.A03 = 0;
            this.A0A = A01;
            return A00(A01);
        }
        return null;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.A08;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.A09;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.A07;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.A0R;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public int getNumericModifiers() {
        return this.A05;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.A01;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.A0P;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.A0F;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.A0I;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0J;
        if (charSequence == null) {
            charSequence = this.A0I;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.A0K;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.A0F != null;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.A0N;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.A02 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.A02 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.A02 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC13060kX abstractC13060kX = this.A0G;
        return (abstractC13060kX == null || !abstractC13060kX.A03()) ? (this.A02 & 8) == 0 : (this.A02 & 8) == 0 && this.A0G.A02();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.A0E.A0M;
        A01(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        A01(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.A00 == c) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.A00 == c && this.A04 == i) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A04 = KeyEvent.normalizeMetaState(i);
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.A02;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.A02 = i2;
        if (i != i2) {
            this.A0E.A0E(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        int i = this.A02;
        if ((i & 4) != 0) {
            C06650Uk c06650Uk = this.A0E;
            if (c06650Uk != null) {
                int groupId = getGroupId();
                int size = c06650Uk.A07.size();
                c06650Uk.A07();
                for (int i2 = 0; i2 < size; i2++) {
                    C28421Rt c28421Rt = (C28421Rt) c06650Uk.A07.get(i2);
                    if (c28421Rt.A0Q == groupId) {
                        int i3 = c28421Rt.A02;
                        if ((i3 & 4) != 0 && c28421Rt.isCheckable()) {
                            int i4 = (c28421Rt == this ? 2 : 0) | (i3 & (-3));
                            c28421Rt.A02 = i4;
                            if (i3 != i4) {
                                c28421Rt.A0E.A0E(false);
                            }
                        }
                    }
                }
                c06650Uk.A06();
                return this;
            }
            throw null;
        }
        int i5 = (z ? 2 : 0) | (i & (-3));
        this.A02 = i5;
        if (i != i5) {
            this.A0E.A0E(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.A0H = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.A02 |= 16;
        } else {
            this.A02 &= -17;
        }
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.A0A = null;
        this.A03 = i;
        this.A0O = true;
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.A03 = 0;
        this.A0A = drawable;
        this.A0O = true;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A08 = colorStateList;
        this.A0L = true;
        this.A0O = true;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A09 = mode;
        this.A0M = true;
        this.A0O = true;
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.A07 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.A01 == c) {
            return this;
        }
        this.A01 = c;
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.A01 == c && this.A05 == i) {
            return this;
        }
        this.A01 = c;
        this.A05 = KeyEvent.normalizeMetaState(i);
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A0B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0C = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A05 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A04 = KeyEvent.normalizeMetaState(i2);
        this.A0E.A0E(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.A06 = i;
        C06650Uk c06650Uk = this.A0E;
        c06650Uk.A0D = true;
        c06650Uk.A0E(true);
    }

    @Override // X.InterfaceMenuItemC07810a4, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.A0E.A0M.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.A0I = charSequence;
        this.A0E.A0E(false);
        SubMenuC38291ns subMenuC38291ns = this.A0F;
        if (subMenuC38291ns != null) {
            subMenuC38291ns.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0J = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.A0K = charSequence;
        this.A0E.A0E(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i = this.A02;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.A02 = i2;
        if (i != i2) {
            C06650Uk c06650Uk = this.A0E;
            c06650Uk.A0F = true;
            c06650Uk.A0E(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
