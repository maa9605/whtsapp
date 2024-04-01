package com.whatsapp.mediacomposer.doodle.titlebar;

import X.C002301c;
import X.C02160Ac;
import X.C0We;
import X.C2Y5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class TitleBarViewWave1 extends C2Y5 {
    public C002301c A00;

    public TitleBarViewWave1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.AbstractC48762Go
    public View getStartingViewFromToolbarExtra() {
        return this.A02;
    }

    @Override // X.AbstractC48762Go
    public void setBackButtonDrawable(int i) {
        this.A02.setImageDrawable(new C0We(this.A00, C02160Ac.A03(getContext(), i)));
    }
}
