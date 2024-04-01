package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.0Av  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC02350Av extends Activity implements InterfaceC02360Aw, InterfaceC02370Ax {
    public C006802z A00 = new C006802z();
    public C02520Bt A01 = new C02520Bt(this);

    public AbstractC02530Bu AAs() {
        throw null;
    }

    public void A00(C12700ju c12700ju) {
        this.A00.put(c12700ju.getClass(), c12700ju);
    }

    public void A01(Class cls) {
        this.A00.getOrDefault(cls, null);
    }

    @Override // X.InterfaceC02370Ax
    public boolean AVH(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0AT.A0l(decorView, keyEvent)) {
            return C13100kb.A00(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0AT.A0l(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0C3.A00(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.A01.A06(EnumC02560Bx.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
