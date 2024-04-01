package com.whatsapp.usernotice;

import X.C2ZW;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class UserNoticeModalIconView extends C2ZW {
    public ImageView A00;

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C2ZT
    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.user_notice_modal_server_icon_size);
    }

    public void setDefaultIconView(ImageView imageView) {
        this.A00 = imageView;
    }
}
