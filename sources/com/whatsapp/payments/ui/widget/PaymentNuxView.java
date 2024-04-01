package com.whatsapp.payments.ui.widget;

import X.C0AT;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class PaymentNuxView extends FrameLayout {
    public Button A00;
    public ImageButton A01;
    public ImageView A02;
    public TextView A03;

    public PaymentNuxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.payment_nux_view, (ViewGroup) this, true);
        this.A02 = (ImageView) C0AT.A0D(inflate, R.id.nux_icon);
        this.A03 = (TextView) C0AT.A0D(inflate, R.id.nux_description);
        this.A00 = (Button) C0AT.A0D(inflate, R.id.nux_cta);
        this.A01 = (ImageButton) C0AT.A0D(inflate, R.id.nux_close);
    }

    public void setCloseButtonOnClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setCtaButtonOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setOnClickListener(onClickListener);
    }

    public void setCtaButtonText(String str) {
        this.A00.setText(str);
    }

    public void setDescription(String str) {
        this.A03.setText(str);
    }

    public void setIcon(Drawable drawable) {
        this.A02.setImageDrawable(drawable);
    }
}
