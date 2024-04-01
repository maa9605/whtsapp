package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.1ns  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class SubMenuC38291ns extends C06650Uk implements SubMenu {
    public C06650Uk A00;
    public C28421Rt A01;

    public SubMenuC38291ns(Context context, C06650Uk c06650Uk, C28421Rt c28421Rt) {
        super(context);
        this.A00 = c06650Uk;
        this.A01 = c28421Rt;
    }

    @Override // X.C06650Uk
    public C06650Uk A01() {
        return this.A00.A01();
    }

    @Override // X.C06650Uk
    public String A03() {
        int i;
        C28421Rt c28421Rt = this.A01;
        if (c28421Rt != null && (i = c28421Rt.A0R) != 0) {
            StringBuilder sb = new StringBuilder("android:menu:actionviewstates");
            sb.append(":");
            sb.append(i);
            return sb.toString();
        }
        return null;
    }

    @Override // X.C06650Uk
    public boolean A0G() {
        return this.A00.A0G();
    }

    @Override // X.C06650Uk
    public boolean A0H() {
        return this.A00.A0H();
    }

    @Override // X.C06650Uk
    public boolean A0I() {
        return this.A00.A0I();
    }

    @Override // X.C06650Uk
    public boolean A0K(C06650Uk c06650Uk, MenuItem menuItem) {
        return super.A0K(c06650Uk, menuItem) || this.A00.A0K(c06650Uk, menuItem);
    }

    @Override // X.C06650Uk
    public boolean A0L(C28421Rt c28421Rt) {
        return this.A00.A0L(c28421Rt);
    }

    @Override // X.C06650Uk
    public boolean A0M(C28421Rt c28421Rt) {
        return this.A00.A0M(c28421Rt);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.A01;
    }

    @Override // X.C06650Uk, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.A00.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        A08(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        A08(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        A08(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        A08(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        A08(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }

    @Override // X.C06650Uk, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.A00.setQwertyMode(z);
    }
}
