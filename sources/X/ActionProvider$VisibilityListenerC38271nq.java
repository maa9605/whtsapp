package X;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: X.1nq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ActionProvider$VisibilityListenerC38271nq extends C28431Ru implements ActionProvider.VisibilityListener {
    public InterfaceC13050kW A00;

    public ActionProvider$VisibilityListenerC38271nq(C1Rw c1Rw, ActionProvider actionProvider) {
        super(c1Rw, actionProvider);
    }

    @Override // X.AbstractC13060kX
    public View A00(MenuItem menuItem) {
        return ((C28431Ru) this).A00.onCreateActionView(menuItem);
    }

    @Override // X.AbstractC13060kX
    public void A01(InterfaceC13050kW interfaceC13050kW) {
        this.A00 = interfaceC13050kW;
        ((C28431Ru) this).A00.setVisibilityListener(this);
    }

    @Override // X.AbstractC13060kX
    public boolean A02() {
        return ((C28431Ru) this).A00.isVisible();
    }

    @Override // X.AbstractC13060kX
    public boolean A03() {
        return ((C28431Ru) this).A00.overridesItemVisibility();
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z) {
        InterfaceC13050kW interfaceC13050kW = this.A00;
        if (interfaceC13050kW != null) {
            C06650Uk c06650Uk = ((C28411Rs) interfaceC13050kW).A00.A0E;
            c06650Uk.A0F = true;
            c06650Uk.A0E(true);
        }
    }
}
