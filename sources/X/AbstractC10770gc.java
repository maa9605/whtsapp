package X;

import android.content.Context;
import android.view.MenuItem;
import java.util.Map;

/* renamed from: X.0gc */
/* loaded from: classes.dex */
public abstract class AbstractC10770gc {
    public Map A00;
    public final Context A01;

    public AbstractC10770gc(Context context) {
        this.A01 = context;
    }

    public final MenuItem A00(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC07810a4) {
            InterfaceMenuItemC07810a4 interfaceMenuItemC07810a4 = (InterfaceMenuItemC07810a4) menuItem;
            Map map = this.A00;
            if (map == null) {
                map = new C006702y();
                this.A00 = map;
            }
            MenuItem menuItem2 = (MenuItem) map.get(menuItem);
            if (menuItem2 == null) {
                C1Rw c1Rw = new C1Rw(this.A01, interfaceMenuItemC07810a4);
                this.A00.put(interfaceMenuItemC07810a4, c1Rw);
                return c1Rw;
            }
            return menuItem2;
        }
        return menuItem;
    }
}
