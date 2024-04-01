package com.whatsapp.mediacomposer.doodle.titlebar;

import X.C0AT;
import X.C2Y3;
import X.C48752Gn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class TitleBarViewLegacy extends C2Y3 {
    public ImageView A00;

    @Override // X.AbstractC48762Go
    public void setBackButtonDrawable(int i) {
    }

    public TitleBarViewLegacy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.AbstractC48762Go
    public void A01() {
        this.A05.setAlpha(0.5f);
        this.A07.setAlpha(0.5f);
        this.A03.setAlpha(0.5f);
        setProfilePhotoAlpha(0.5f);
    }

    @Override // X.AbstractC48762Go
    public void A02() {
        this.A05.setAlpha(1.0f);
        this.A07.setAlpha(1.0f);
        this.A03.setAlpha(1.0f);
        setProfilePhotoAlpha(1.0f);
    }

    @Override // X.AbstractC48762Go
    public void A03(C48752Gn c48752Gn) {
        super.A03(c48752Gn);
        this.A00 = (ImageView) C0AT.A0D(this, R.id.profile_picture);
    }

    @Override // X.AbstractC48762Go
    public View getStartingViewFromToolbarExtra() {
        return this.A00.getVisibility() == 0 ? this.A00 : this.A02;
    }

    private void setProfilePhotoAlpha(float f) {
        ImageView imageView = this.A00;
        if (imageView != null) {
            imageView.setAlpha(f);
        }
    }
}
