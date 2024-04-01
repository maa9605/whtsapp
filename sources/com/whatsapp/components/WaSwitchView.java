package com.whatsapp.components;

import X.AbstractC54582j0;
import X.C02180Ae;
import X.C0AT;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;

/* loaded from: classes2.dex */
public class WaSwitchView extends AbstractC54582j0 {
    public final SwitchCompat A00;
    public final WaTextView A01;
    public final WaTextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        int i3;
        int paddingRight;
        int i4 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C49582Lf.A2P, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                i2 = obtainStyledAttributes.getResourceId(0, 0);
                i3 = obtainStyledAttributes.getResourceId(3, 0);
                i = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                i4 = resourceId;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        LinearLayout.inflate(context, R.layout.wa_switch_view, this);
        C02180Ae.A11(this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.info_screen_padding);
        int paddingLeft = getPaddingLeft() == 0 ? dimensionPixelOffset : getPaddingLeft();
        int paddingTop = getPaddingTop() == 0 ? dimensionPixelOffset : getPaddingTop();
        if (getPaddingRight() == 0) {
            paddingRight = getResources().getDimensionPixelOffset(R.dimen.info_screen_right_padding);
        } else {
            paddingRight = getPaddingRight();
        }
        setPadding(paddingLeft, paddingTop, paddingRight, getPaddingBottom() != 0 ? getPaddingBottom() : dimensionPixelOffset);
        setMinimumHeight(getResources().getDimensionPixelOffset(R.dimen.info_screen_row));
        WaTextView waTextView = (WaTextView) C0AT.A0D(this, R.id.switch_view_title);
        this.A02 = waTextView;
        if (i4 != 0) {
            waTextView.setText(context.getString(i4));
        }
        if (i3 != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                this.A02.setTextAppearance(i3);
            } else {
                this.A02.setTextAppearance(getContext(), i3);
            }
        }
        WaTextView waTextView2 = (WaTextView) C0AT.A0D(this, R.id.switch_view_description);
        this.A01 = waTextView2;
        if (i2 != 0) {
            waTextView2.setText(context.getString(i2));
        }
        if (i != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                this.A01.setTextAppearance(i);
            } else {
                this.A01.setTextAppearance(getContext(), i);
            }
        }
        this.A00 = (SwitchCompat) C0AT.A0D(this, R.id.switch_view_toggle);
    }

    public void setChecked(boolean z) {
        this.A00.setChecked(z);
    }

    public void setDescription(CharSequence charSequence) {
        this.A01.setText(charSequence);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setSwitchClickable(boolean z) {
        this.A00.setClickable(z);
    }

    public void setTitle(CharSequence charSequence) {
        this.A02.setText(charSequence);
    }
}
