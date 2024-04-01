package X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.1nx */
/* loaded from: classes.dex */
public class C38331nx extends C1SJ implements InterfaceC11260hS {
    public static Method A01;
    public InterfaceC11260hS A00;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                A01 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C38331nx(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // X.C1SJ
    public C11150hH A00(Context context, boolean z) {
        C1SK c1sk = new C1SK(context, z);
        c1sk.A01 = this;
        return c1sk;
    }

    @Override // X.InterfaceC11260hS
    public void ALA(C06650Uk c06650Uk, MenuItem menuItem) {
        InterfaceC11260hS interfaceC11260hS = this.A00;
        if (interfaceC11260hS != null) {
            interfaceC11260hS.ALA(c06650Uk, menuItem);
        }
    }

    @Override // X.InterfaceC11260hS
    public void ALB(C06650Uk c06650Uk, MenuItem menuItem) {
        InterfaceC11260hS interfaceC11260hS = this.A00;
        if (interfaceC11260hS != null) {
            interfaceC11260hS.ALB(c06650Uk, menuItem);
        }
    }
}
