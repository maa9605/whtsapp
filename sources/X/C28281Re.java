package X;

import android.view.Window;

/* renamed from: X.1Re  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28281Re implements C0VF {
    public boolean A00;
    public final /* synthetic */ C06750Uv A01;

    public C28281Re(C06750Uv c06750Uv) {
        this.A01 = c06750Uv;
    }

    @Override // X.C0VF
    public void AIe(C06650Uk c06650Uk, boolean z) {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        C06750Uv c06750Uv = this.A01;
        c06750Uv.A01.A7L();
        Window.Callback callback = c06750Uv.A00;
        if (callback != null) {
            callback.onPanelClosed(C0M6.A03, c06650Uk);
        }
        this.A00 = false;
    }

    @Override // X.C0VF
    public boolean AMY(C06650Uk c06650Uk) {
        Window.Callback callback = this.A01.A00;
        if (callback != null) {
            callback.onMenuOpened(C0M6.A03, c06650Uk);
            return true;
        }
        return false;
    }
}
