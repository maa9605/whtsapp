package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: X.1Rr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterface$OnDismissListenerC28401Rr implements C0VF, DialogInterface.OnDismissListener, DialogInterface.OnClickListener, DialogInterface.OnKeyListener {
    public DialogInterfaceC019408z A00;
    public C0VB A01;
    public C06650Uk A02;

    @Override // X.C0VF
    public boolean AMY(C06650Uk c06650Uk) {
        return false;
    }

    public DialogInterface$OnDismissListenerC28401Rr(C06650Uk c06650Uk) {
        this.A02 = c06650Uk;
    }

    @Override // X.C0VF
    public void AIe(C06650Uk c06650Uk, boolean z) {
        DialogInterfaceC019408z dialogInterfaceC019408z;
        if ((z || c06650Uk == this.A02) && (dialogInterfaceC019408z = this.A00) != null) {
            dialogInterfaceC019408z.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        C06650Uk c06650Uk = this.A02;
        C0VB c0vb = this.A01;
        C0VD c0vd = c0vb.A04;
        if (c0vd == null) {
            c0vd = new C0VD(c0vb);
            c0vb.A04 = c0vd;
        }
        c06650Uk.A0J(c0vd.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C0VB c0vb = this.A01;
        C06650Uk c06650Uk = this.A02;
        C0VF c0vf = c0vb.A06;
        if (c0vf != null) {
            c0vf.AIe(c06650Uk, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0F(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i, keyEvent, 0);
    }
}
