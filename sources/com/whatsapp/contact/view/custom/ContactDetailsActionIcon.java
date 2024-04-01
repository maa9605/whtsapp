package com.whatsapp.contact.view.custom;

import X.C08540bf;
import X.C0AT;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;

/* loaded from: classes2.dex */
public class ContactDetailsActionIcon extends LinearLayout {
    public ImageView A00;
    public WaTextView A01;

    public ContactDetailsActionIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.contact_details_action_icon, (ViewGroup) this, true);
        int i = (int) (getResources().getDisplayMetrics().density * 8.0f);
        C0AT.A0D(this, R.id.action_layout).setPadding(i, 16, i, 16);
        this.A00 = (ImageView) C0AT.A0D(this, R.id.action_icon);
        this.A01 = (WaTextView) C0AT.A0D(this, R.id.action_title);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A0m);
            this.A00.setImageResource(obtainStyledAttributes.getResourceId(0, 0));
            this.A01.setText(context.getString(obtainStyledAttributes.getResourceId(1, 0)));
            obtainStyledAttributes.recycle();
        }
    }
}
