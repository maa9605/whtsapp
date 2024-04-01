package com.whatsapp.mediacomposer.doodle;

import X.C2HO;
import X.InterfaceC63472zq;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.whatsapp.WaEditText;
import com.whatsapp.mediacomposer.doodle.DoodleEditText;

/* loaded from: classes2.dex */
public class DoodleEditText extends C2HO {
    public int A00;
    public InterfaceC63472zq A01;

    public DoodleEditText(final Context context, final AttributeSet attributeSet) {
        new WaEditText(context, attributeSet) { // from class: X.2HO
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
                ((AbstractC07960aN) generatedComponent()).A1r((DoodleEditText) this);
            }
        };
        this.A00 = 0;
        setLayerType(1, null);
    }

    @Override // com.whatsapp.WaEditText, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.A00 != 3) {
            super.onDraw(canvas);
            return;
        }
        setTextColor(-16777216);
        getPaint().setStrokeWidth(getTextSize() / 12.0f);
        getPaint().setStyle(Paint.Style.STROKE);
        super.onDraw(canvas);
        setTextColor(-1);
        getPaint().setStrokeWidth(0.0f);
        getPaint().setStyle(Paint.Style.FILL);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        InterfaceC63472zq interfaceC63472zq = this.A01;
        if (interfaceC63472zq != null) {
            interfaceC63472zq.ALE(i, keyEvent);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r4 == 3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setFontStyle(int r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            if (r0 != r4) goto L5
            return
        L5:
            r3.A00 = r4
            r2 = 1
            r1 = 3
            if (r4 != r1) goto L1a
            android.content.Context r0 = r3.getContext()
            android.graphics.Typeface r0 = X.C67883Hf.A00(r0)
            r3.setTypeface(r0)
        L16:
            r3.setAllCaps(r2)
            return
        L1a:
            r0 = 2
            if (r4 != r0) goto L2d
            android.content.Context r0 = r3.getContext()
            android.graphics.Typeface r0 = X.C67883Hf.A01(r0)
            r3.setTypeface(r0)
        L28:
            r0 = 0
            r3.setAllCaps(r0)
            return
        L2d:
            if (r4 != r2) goto L35
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r0)
            goto L28
        L35:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r3.setTypeface(r0)
            if (r4 != r1) goto L28
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleEditText.setFontStyle(int):void");
    }

    public void setOnKeyPreImeListener(InterfaceC63472zq interfaceC63472zq) {
        this.A01 = interfaceC63472zq;
    }
}
