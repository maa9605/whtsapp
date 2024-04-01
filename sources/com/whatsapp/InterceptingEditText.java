package com.whatsapp;

import X.AbstractC08220ax;
import X.InterfaceC26771Kp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.whatsapp.InterceptingEditText;

/* loaded from: classes.dex */
public class InterceptingEditText extends AbstractC08220ax {
    public InterfaceC26771Kp A00;

    public InterceptingEditText(final Context context, final AttributeSet attributeSet) {
        new WaEditText(context, attributeSet) { // from class: X.0ax
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC04840Ma
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A0B((InterceptingEditText) this);
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        InterfaceC26771Kp interfaceC26771Kp;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (interfaceC26771Kp = this.A00) != null) {
            interfaceC26771Kp.AHh();
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setOnBackButtonListener(InterfaceC26771Kp interfaceC26771Kp) {
        this.A00 = interfaceC26771Kp;
    }
}
