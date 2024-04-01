package X;

import android.view.MenuItem;

/* renamed from: X.1Rf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28291Rf implements C0CO {
    public final /* synthetic */ C06750Uv A00;

    @Override // X.C0CO
    public boolean AM1(C06650Uk c06650Uk, MenuItem menuItem) {
        return false;
    }

    public C28291Rf(C06750Uv c06750Uv) {
        this.A00 = c06750Uv;
    }

    @Override // X.C0CO
    public void AM2(C06650Uk c06650Uk) {
        C06750Uv c06750Uv = this.A00;
        if (c06750Uv.A00 != null) {
            if (c06750Uv.A01.AFb()) {
                c06750Uv.A00.onPanelClosed(C0M6.A03, c06650Uk);
            } else if (!c06750Uv.A00.onPreparePanel(0, null, c06650Uk)) {
            } else {
                c06750Uv.A00.onMenuOpened(C0M6.A03, c06650Uk);
            }
        }
    }
}
