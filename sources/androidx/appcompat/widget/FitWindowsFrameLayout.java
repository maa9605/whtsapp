package androidx.appcompat.widget;

import X.C0V6;
import X.C0V7;
import X.C0V8;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements C0V6 {
    public C0V8 A00;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        C0V8 c0v8 = this.A00;
        if (c0v8 != null) {
            rect.top = ((C0V7) c0v8).A00.A0S(rect.top);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // X.C0V6
    public void setOnFitSystemWindowsListener(C0V8 c0v8) {
        this.A00 = c0v8;
    }
}
