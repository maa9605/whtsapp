package X;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* renamed from: X.0kX */
/* loaded from: classes.dex */
public abstract class AbstractC13060kX {
    public InterfaceC13050kW A00;

    public boolean A02() {
        return true;
    }

    public boolean A03() {
        return false;
    }

    public View A00(MenuItem menuItem) {
        return ((C28431Ru) this).A00.onCreateActionView();
    }

    public void A01(InterfaceC13050kW interfaceC13050kW) {
        if (this.A00 != null) {
            StringBuilder A0P = C000200d.A0P("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            A0P.append(getClass().getSimpleName());
            A0P.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", A0P.toString());
        }
        this.A00 = interfaceC13050kW;
    }
}
