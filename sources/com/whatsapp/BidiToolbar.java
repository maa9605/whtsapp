package com.whatsapp;

import X.AbstractC08110ae;
import X.C002301c;
import X.C0AT;
import X.C0LX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.BidiToolbar;
import com.whatsapp.util.MarqueeToolbar;

/* loaded from: classes.dex */
public class BidiToolbar extends AbstractC08110ae {
    public C002301c A00;

    public BidiToolbar(final Context context, final AttributeSet attributeSet) {
        new MarqueeToolbar(context, attributeSet) { // from class: X.0ae
            public boolean A00;

            {
                A0J();
            }

            @Override // X.AbstractC49052If
            public void A0J() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A02((BidiToolbar) this);
            }
        };
        if (isInEditMode()) {
            return;
        }
        C0AT.A0W(this, this.A00.A0N() ? 1 : 0);
    }

    public final void A0L(View view, int i) {
        if (!(view instanceof ViewGroup) || view.getId() == R.id.custom_view) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.layout(i - childAt.getRight(), childAt.getTop(), i - childAt.getLeft(), childAt.getBottom());
            A0L(childAt, childAt.getRight() - childAt.getLeft());
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (isInEditMode() || C0LX.A01 || !this.A00.A0N()) {
            return;
        }
        A0L(this, i3 - i);
    }
}
