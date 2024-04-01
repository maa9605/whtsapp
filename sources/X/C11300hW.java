package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.search.verification.client.R;

/* renamed from: X.0hW */
/* loaded from: classes.dex */
public class C11300hW {
    public InterfaceC11280hU A00;
    public InterfaceC11290hV A01;
    public final C06650Uk A02;
    public final C10860gl A03;

    public C11300hW(Context context, View view) {
        this(context, view, 0, R.attr.popupMenuStyle);
    }

    public C11300hW(Context context, View view, int i, int i2) {
        C06650Uk c06650Uk = new C06650Uk(context);
        this.A02 = c06650Uk;
        c06650Uk.A03 = new C0CO() { // from class: X.1SL
            @Override // X.C0CO
            public void AM2(C06650Uk c06650Uk2) {
            }

            {
                C11300hW.this = this;
            }

            @Override // X.C0CO
            public boolean AM1(C06650Uk c06650Uk2, MenuItem menuItem) {
                InterfaceC11290hV interfaceC11290hV = C11300hW.this.A01;
                if (interfaceC11290hV != null) {
                    return interfaceC11290hV.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        C10860gl c10860gl = new C10860gl(context, c06650Uk, view, false, i2, 0);
        this.A03 = c10860gl;
        c10860gl.A00 = i;
        c10860gl.A02 = new PopupWindow.OnDismissListener() { // from class: X.0hT
            {
                C11300hW.this = this;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                C11300hW c11300hW = C11300hW.this;
                InterfaceC11280hU interfaceC11280hU = c11300hW.A00;
                if (interfaceC11280hU != null) {
                    interfaceC11280hU.AJS(c11300hW);
                }
            }
        };
    }

    public void A00() {
        if (!this.A03.A04()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
