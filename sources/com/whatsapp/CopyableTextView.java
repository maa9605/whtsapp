package com.whatsapp;

import X.AbstractC08170aq;
import X.C002301c;
import X.C018508q;
import X.C02E;
import X.C49582Lf;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.CopyableTextView;

/* loaded from: classes.dex */
public class CopyableTextView extends AbstractC08170aq implements View.OnClickListener {
    public C018508q A00;
    public C02E A01;
    public C002301c A02;
    public String A03;

    public CopyableTextView(final Context context, final AttributeSet attributeSet) {
        new WaTextView(context, attributeSet) { // from class: X.0aq
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC02690Cm
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A06((CopyableTextView) this);
            }
        };
        setClickable(true);
        setTextIsSelectable(true);
        setOnClickListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A0j);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                this.A03 = this.A02.A06(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ClipboardManager A06;
        if (TextUtils.isEmpty(this.A03) || (A06 = this.A01.A06()) == null) {
            return;
        }
        A06.setPrimaryClip(ClipData.newPlainText(getText(), getText()));
        this.A00.A0E(this.A03, 0);
    }

    public void setToastString(String str) {
        this.A03 = str;
    }
}
