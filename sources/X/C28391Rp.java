package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.1Rp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28391Rp implements InterfaceC11260hS {
    public final /* synthetic */ View$OnKeyListenerC38261np A00;

    public C28391Rp(View$OnKeyListenerC38261np view$OnKeyListenerC38261np) {
        this.A00 = view$OnKeyListenerC38261np;
    }

    @Override // X.InterfaceC11260hS
    public void ALA(final C06650Uk c06650Uk, final MenuItem menuItem) {
        View$OnKeyListenerC38261np view$OnKeyListenerC38261np = this.A00;
        Handler handler = view$OnKeyListenerC38261np.A0J;
        handler.removeCallbacksAndMessages(null);
        List list = view$OnKeyListenerC38261np.A0O;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (c06650Uk == ((C10810gg) list.get(i)).A01) {
                if (i != -1) {
                    int i2 = i + 1;
                    final C10810gg c10810gg = i2 < list.size() ? (C10810gg) list.get(i2) : null;
                    handler.postAtTime(new Runnable() { // from class: X.0gf
                        @Override // java.lang.Runnable
                        public void run() {
                            C10810gg c10810gg2 = c10810gg;
                            if (c10810gg2 != null) {
                                View$OnKeyListenerC38261np view$OnKeyListenerC38261np2 = C28391Rp.this.A00;
                                view$OnKeyListenerC38261np2.A0D = true;
                                c10810gg2.A01.A0F(false);
                                view$OnKeyListenerC38261np2.A0D = false;
                            }
                            MenuItem menuItem2 = menuItem;
                            if (menuItem2.isEnabled() && menuItem2.hasSubMenu()) {
                                c06650Uk.A0J(menuItem2, null, 4);
                            }
                        }
                    }, c06650Uk, SystemClock.uptimeMillis() + 200);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC11260hS
    public void ALB(C06650Uk c06650Uk, MenuItem menuItem) {
        this.A00.A0J.removeCallbacksAndMessages(c06650Uk);
    }
}
