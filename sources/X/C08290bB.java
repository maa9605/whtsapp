package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.search.verification.client.R;

/* renamed from: X.0bB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08290bB extends ImageButton {
    public int A00;

    public C08290bB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.floatingActionButtonStyle);
        this.A00 = getVisibility();
    }

    public final void A00(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.A00 = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.A00;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.A00 = i;
    }
}
