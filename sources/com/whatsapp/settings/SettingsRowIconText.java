package com.whatsapp.settings;

import X.AbstractC51942Yz;
import X.C002301c;
import X.C02180Ae;
import X.C08540bf;
import X.C0We;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* loaded from: classes2.dex */
public class SettingsRowIconText extends AbstractC51942Yz {
    public WaImageView A00;
    public WaTextView A01;
    public WaTextView A02;
    public C002301c A03;

    public SettingsRowIconText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        LinearLayout.inflate(context, R.layout.settings_row_icon_text, this);
        this.A00 = (WaImageView) findViewById(R.id.settings_row_icon);
        this.A02 = (WaTextView) findViewById(R.id.settings_row_text);
        this.A01 = (WaTextView) findViewById(R.id.settings_row_subtext);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A2E);
        try {
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable == null) {
                this.A00.setVisibility(8);
            } else {
                this.A00.setVisibility(0);
                if (z) {
                    drawable = new C0We(this.A03, drawable);
                }
            }
            this.A00.setImageDrawable(drawable);
            int color = obtainStyledAttributes.getColor(0, -1);
            if (color != -1) {
                C02180Ae.A17(this.A00, color);
            }
            setText(this.A03.A0B(4, obtainStyledAttributes));
            setSubText(this.A03.A0B(3, obtainStyledAttributes));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A00;
        if (drawable == null) {
            waImageView.setVisibility(8);
        } else {
            waImageView.setVisibility(0);
            if (0 != 0) {
                drawable = new C0We(this.A03, drawable);
            }
        }
        this.A00.setImageDrawable(drawable);
    }

    public void setSubText(CharSequence charSequence) {
        WaTextView waTextView = this.A01;
        if (charSequence == null) {
            waTextView.setVisibility(8);
        } else {
            waTextView.setVisibility(0);
        }
        this.A01.setText(charSequence);
    }

    public void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A02;
        if (charSequence == null) {
            waTextView.setVisibility(8);
        } else {
            waTextView.setVisibility(0);
        }
        this.A02.setText(charSequence);
    }
}
