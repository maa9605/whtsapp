package com.whatsapp;

import X.AbstractC08250b2;
import X.C002301c;
import X.C02160Ac;
import X.C0AT;
import X.C0We;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class ListItemWithRightIcon extends AbstractC08250b2 {
    public WaImageView A00;
    public WaTextView A01;
    public WaTextView A02;
    public C002301c A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemWithRightIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        int i3 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C49582Lf.A19, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                i2 = obtainStyledAttributes.getResourceId(0, 0);
                i = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                i3 = resourceId;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.list_item_with_right_icon, (ViewGroup) this, true);
        this.A02 = (WaTextView) C0AT.A0D(inflate, R.id.list_item_title);
        this.A01 = (WaTextView) C0AT.A0D(inflate, R.id.list_item_description);
        this.A00 = (WaImageView) C0AT.A0D(inflate, R.id.list_item_icon);
        if (i3 != 0) {
            this.A02.setText(i3);
        }
        if (i2 != 0) {
            this.A01.setText(i2);
        }
        if (i != 0) {
            this.A00.setImageDrawable(new C0We(this.A03, C02160Ac.A03(getContext(), i)));
        }
    }

    public void setDescription(String str) {
        this.A01.setText(str);
    }

    public void setIcon(int i) {
        this.A00.setImageDrawable(new C0We(this.A03, C02160Ac.A03(getContext(), i)));
    }

    public void setIconVisible(boolean z) {
        this.A00.setVisibility(z ? 0 : 8);
    }

    public void setTitle(String str) {
        this.A02.setText(str);
    }
}
