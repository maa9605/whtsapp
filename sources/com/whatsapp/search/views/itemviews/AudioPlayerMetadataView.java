package com.whatsapp.search.views.itemviews;

import X.C002301c;
import X.C08540bf;
import X.C0AT;
import X.C0LX;
import X.C2Ye;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class AudioPlayerMetadataView extends C2Ye {
    public TextView A00;
    public C002301c A01;

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup viewGroup;
        LinearLayout.inflate(context, R.layout.message_audio_metadata, this);
        setOrientation(0);
        setGravity(17);
        View A0D = C0AT.A0D(this, R.id.date_wrapper);
        View A0D2 = C0AT.A0D(this, R.id.status);
        this.A00 = (TextView) C0AT.A0D(this, R.id.description);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A0K);
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            C0LX.A06(this.A01, A0D, A0D.getPaddingLeft(), dimensionPixelSize2);
            C0LX.A05(this.A01, A0D, dimensionPixelSize, ((LinearLayout.LayoutParams) A0D.getLayoutParams()).rightMargin);
            if (z || (viewGroup = (ViewGroup) A0D2.getParent()) == null) {
                return;
            }
            viewGroup.removeView(A0D2);
        }
    }

    public void setDescription(String str) {
        this.A00.setText(str);
    }
}
