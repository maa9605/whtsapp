package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.0Cs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC02750Cs extends CharacterStyle implements InterfaceC02760Ct, UpdateAppearance {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;

    public AbstractC02750Cs(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public AbstractC02750Cs(Context context, int i) {
        this.A01 = C02160Ac.A00(context, i);
        int A00 = C02160Ac.A00(context, i);
        this.A02 = A00;
        this.A00 = C09990f7.A03(A00, 72);
    }

    public void APh(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A03 > 1000) {
                this.A03 = elapsedRealtime;
                if (this.A04) {
                    onClick(view);
                }
            }
        }
        this.A04 = motionEvent.getAction() == 0;
        view.invalidate();
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (this.A04) {
            textPaint.setColor(this.A02);
            textPaint.bgColor = this.A00;
            textPaint.setUnderlineText(true);
            return;
        }
        int i = this.A01;
        if (i == 0) {
            textPaint.setColor(textPaint.linkColor);
        } else {
            textPaint.setColor(i);
        }
        textPaint.setUnderlineText(false);
        textPaint.bgColor = 0;
    }
}
