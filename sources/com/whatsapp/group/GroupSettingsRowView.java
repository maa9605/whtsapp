package com.whatsapp.group;

import X.AbstractC66813Cn;
import X.C08540bf;
import X.C0AT;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class GroupSettingsRowView extends AbstractC66813Cn {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;

    public GroupSettingsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.group_setting_row, this);
        this.A03 = (TextView) C0AT.A0D(this, R.id.group_setting_row_title);
        this.A02 = (TextView) C0AT.A0D(this, R.id.group_setting_row_info);
        this.A00 = C0AT.A0D(this, R.id.group_setting_row_description_container);
        this.A01 = (TextView) C0AT.A0D(this, R.id.group_setting_row_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A1B);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                str = context.getString(resourceId);
            } else {
                str = null;
            }
            setTextOrHideView(this.A03, str);
            int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
            setTextOrHideView(this.A02, resourceId2 != 0 ? context.getString(resourceId2) : null);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public CharSequence getInfoText() {
        return this.A02.getText();
    }

    public CharSequence getTitleText() {
        return this.A03.getText();
    }

    public void setDescriptionText(int i) {
        this.A00.setVisibility(0);
        setTextOrHideView(this.A01, getContext().getString(i));
    }

    public void setInfoText(int i) {
        setTextOrHideView(this.A02, getContext().getString(i));
    }

    public final void setTextOrHideView(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        textView.setText(charSequence);
    }

    public void setTitleText(int i) {
        setTextOrHideView(this.A03, getContext().getString(i));
    }
}
