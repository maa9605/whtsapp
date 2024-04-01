package com.whatsapp.mediacomposer.bottombar;

import X.C0AT;
import X.C3LY;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class BottomBarViewOld extends C3LY {
    public final View A00;
    public final View A01;
    public final View A02;

    public BottomBarViewOld(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = C0AT.A0D(this, R.id.privacy_divider);
        this.A00 = C0AT.A0D(this, R.id.add_btn_separator);
        this.A01 = C0AT.A0D(this, R.id.caption_privacy);
    }

    @Override // com.whatsapp.mediacomposer.bottombar.BottomBarView
    public View getAddButtonSeparator() {
        return this.A00;
    }

    @Override // com.whatsapp.mediacomposer.bottombar.BottomBarView
    public View getCaptionAndPrivacyLayout() {
        return this.A01;
    }

    @Override // com.whatsapp.mediacomposer.bottombar.BottomBarView
    public int getLayout() {
        return R.layout.media_composer_bottom_bar_old;
    }

    @Override // com.whatsapp.mediacomposer.bottombar.BottomBarView
    public View getPrivacyDivider() {
        return this.A02;
    }
}
