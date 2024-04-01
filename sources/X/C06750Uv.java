package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.0Uv */
/* loaded from: classes.dex */
public class C06750Uv extends C0U1 {
    public Window.Callback A00;
    public InterfaceC08830c9 A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public ArrayList A02 = new ArrayList();
    public final Runnable A07 = new Runnable() { // from class: X.0c5
        {
            C06750Uv.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            C06750Uv c06750Uv = C06750Uv.this;
            if (!c06750Uv.A04) {
                c06750Uv.A01.ATM(new C28281Re(c06750Uv), new C28291Rf(c06750Uv));
                c06750Uv.A04 = true;
            }
            Menu ABD = c06750Uv.A01.ABD();
            C06650Uk c06650Uk = null;
            if ((ABD instanceof C06650Uk) && (c06650Uk = (C06650Uk) ABD) != null) {
                c06650Uk.A07();
            }
            try {
                ABD.clear();
                if (!c06750Uv.A00.onCreatePanelMenu(0, ABD) || !c06750Uv.A00.onPreparePanel(0, null, ABD)) {
                    ABD.clear();
                }
            } finally {
                if (c06650Uk != null) {
                    c06650Uk.A06();
                }
            }
        }
    };
    public final InterfaceC08810c7 A06 = new InterfaceC08810c7() { // from class: X.0c6
        {
            C06750Uv.this = this;
        }

        @Override // X.InterfaceC08810c7
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C06750Uv.this.A00.onMenuItemSelected(0, menuItem);
        }
    };

    public C06750Uv(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C08820c8 c08820c8 = new C08820c8(toolbar, false);
        this.A01 = c08820c8;
        Window$CallbackC06710Ur window$CallbackC06710Ur = new Window$CallbackC06710Ur(callback) { // from class: X.0cD
            {
                C06750Uv.this = this;
            }

            @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
            public View onCreatePanelView(int i) {
                if (i == 0) {
                    return new View(C06750Uv.this.A01.getContext());
                }
                return super.A00.onCreatePanelView(i);
            }

            @Override // android.view.Window.Callback
            public boolean onPreparePanel(int i, View view, Menu menu) {
                boolean onPreparePanel = super.A00.onPreparePanel(i, view, menu);
                if (onPreparePanel) {
                    C06750Uv c06750Uv = C06750Uv.this;
                    if (!c06750Uv.A05) {
                        c06750Uv.A01.ATN();
                        c06750Uv.A05 = true;
                    }
                }
                return onPreparePanel;
            }
        };
        this.A00 = window$CallbackC06710Ur;
        c08820c8.setWindowCallback(window$CallbackC06710Ur);
        toolbar.A0R = this.A06;
        c08820c8.setWindowTitle(charSequence);
    }

    @Override // X.C0U1
    public float A00() {
        return C0AT.A00(this.A01.ADu());
    }

    @Override // X.C0U1
    public int A01() {
        return this.A01.A9o();
    }

    @Override // X.C0U1
    public Context A02() {
        return this.A01.getContext();
    }

    @Override // X.C0U1
    public void A04() {
        this.A01.ADu().removeCallbacks(this.A07);
    }

    @Override // X.C0U1
    public void A05() {
        this.A01.AU8(8);
    }

    @Override // X.C0U1
    public void A06(float f) {
        C0AT.A0P(this.A01.ADu(), f);
    }

    @Override // X.C0U1
    public void A07(int i) {
        InterfaceC08830c9 interfaceC08830c9 = this.A01;
        interfaceC08830c9.ATv(i != 0 ? interfaceC08830c9.getContext().getText(i) : null);
    }

    @Override // X.C0U1
    public void A08(int i) {
        InterfaceC08830c9 interfaceC08830c9 = this.A01;
        interfaceC08830c9.AU0(i != 0 ? interfaceC08830c9.getContext().getText(i) : null);
    }

    @Override // X.C0U1
    public void A0A(Drawable drawable) {
        this.A01.ATR(drawable);
    }

    @Override // X.C0U1
    public void A0B(Drawable drawable) {
        this.A01.ASk(drawable);
    }

    @Override // X.C0U1
    public void A0C(Drawable drawable) {
        this.A01.ATG(null);
    }

    @Override // X.C0U1
    public void A0D(View view) {
        A0E(view, new C0U2(-2, -2));
    }

    @Override // X.C0U1
    public void A0E(View view, C0U2 c0u2) {
        if (view != null) {
            view.setLayoutParams(c0u2);
        }
        this.A01.ASx(view);
    }

    @Override // X.C0U1
    public void A0F(CharSequence charSequence) {
        this.A01.setWindowTitle(charSequence);
    }

    @Override // X.C0U1
    public void A0G(CharSequence charSequence) {
        this.A01.ATv(charSequence);
    }

    @Override // X.C0U1
    public void A0H(CharSequence charSequence) {
        this.A01.AU0(charSequence);
    }

    @Override // X.C0U1
    public void A0I(boolean z) {
        if (z == this.A03) {
            return;
        }
        this.A03 = z;
        ArrayList arrayList = this.A02;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw null;
        }
    }

    @Override // X.C0U1
    public void A0L(boolean z) {
        A0V(z ? 4 : 0, 4);
    }

    @Override // X.C0U1
    public void A0M(boolean z) {
        A0V(z ? 16 : 0, 16);
    }

    @Override // X.C0U1
    public void A0N(boolean z) {
        A0V(z ? 2 : 0, 2);
    }

    @Override // X.C0U1
    public void A0O(boolean z) {
        A0V(z ? 8 : 0, 8);
    }

    @Override // X.C0U1
    public boolean A0P() {
        return this.A01.AEd();
    }

    @Override // X.C0U1
    public boolean A0Q() {
        InterfaceC08830c9 interfaceC08830c9 = this.A01;
        if (interfaceC08830c9.AER()) {
            interfaceC08830c9.A6I();
            return true;
        }
        return false;
    }

    @Override // X.C0U1
    public boolean A0R() {
        ViewGroup ADu = this.A01.ADu();
        Runnable runnable = this.A07;
        ADu.removeCallbacks(runnable);
        this.A01.ADu().postOnAnimation(runnable);
        return true;
    }

    @Override // X.C0U1
    public boolean A0S() {
        return this.A01.AUn();
    }

    @Override // X.C0U1
    public boolean A0T(int i, KeyEvent keyEvent) {
        int i2;
        if (!this.A04) {
            this.A01.ATM(new C28281Re(this), new C28291Rf(this));
            this.A04 = true;
        }
        Menu ABD = this.A01.ABD();
        if (ABD == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        ABD.setQwertyMode(KeyCharacterMap.load(i2).getKeyboardType() != 1);
        return ABD.performShortcut(i, keyEvent, 0);
    }

    @Override // X.C0U1
    public boolean A0U(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.A01.AUn();
        }
        return true;
    }

    public void A0V(int i, int i2) {
        InterfaceC08830c9 interfaceC08830c9 = this.A01;
        interfaceC08830c9.ASz((i & i2) | ((i2 ^ (-1)) & interfaceC08830c9.A9o()));
    }
}
