package com.whatsapp.conversation.conversationrow.components;

import X.C02160Ac;
import X.C02180Ae;
import X.C0AT;
import X.C41771uU;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaImageView;

/* loaded from: classes2.dex */
public class ViewOnceDownloadProgressView extends FrameLayout {
    public final CircularProgressBar A00;
    public final WaImageView A01;
    public final C41771uU A02;

    public ViewOnceDownloadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A02 = isInEditMode() ? null : C41771uU.A00();
        FrameLayout.inflate(context, R.layout.viewonce_circular_download_progress, this);
        this.A01 = (WaImageView) C0AT.A0D(this, R.id.view_once_control_icon);
        CircularProgressBar circularProgressBar = (CircularProgressBar) C0AT.A0D(this, R.id.view_once_progressbar);
        this.A00 = circularProgressBar;
        circularProgressBar.setMax(100);
        this.A00.A0C = C02160Ac.A00(getContext(), R.color.green_circle_background);
        this.A00.A0B = 0;
    }

    public void A00(int i, int i2, int i3) {
        WaImageView waImageView = this.A01;
        waImageView.setBackgroundDrawable(i2 != -1 ? C02180Ae.A0Q(C02180Ae.A0N(getContext(), i2), getResources().getColor(i3)) : null);
        waImageView.setImageDrawable(C02180Ae.A0Q(C02180Ae.A0N(getContext(), i), getResources().getColor(i3)));
    }
}
