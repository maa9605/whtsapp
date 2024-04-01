package com.whatsapp.usernotice;

import X.C2ZS;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class UserNoticeBannerIconView extends C2ZS {
    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C2ZT
    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.user_notice_banner_icon_size);
    }
}
