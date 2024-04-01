package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3b0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C73043b0 extends ViewOutlineProvider {
    public boolean A00;

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        if (this.A00) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 10.0f);
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }
}
