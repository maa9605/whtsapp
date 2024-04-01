package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1Ry  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Ry extends AbstractC10770gc implements Menu {
    public final InterfaceMenuC06660Ul A00;

    public C1Ry(Context context, InterfaceMenuC06660Ul interfaceMenuC06660Ul) {
        super(context);
        if (interfaceMenuC06660Ul != null) {
            this.A00 = interfaceMenuC06660Ul;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return A00(this.A00.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return A00(this.A00.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A00(this.A00.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return A00(this.A00.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.A00.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = A00(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return this.A00.addSubMenu(i);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.A00.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.A00.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.A00.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public void clear() {
        Map map = super.A00;
        if (map != null) {
            map.clear();
        }
        this.A00.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.A00.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return A00(this.A00.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return A00(this.A00.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.A00.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.A00.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.A00.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.A00.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        Map map = super.A00;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        this.A00.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        Map map = super.A00;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        this.A00.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.A00.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.A00.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.A00.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.A00.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.A00.size();
    }
}