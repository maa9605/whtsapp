package com.whatsapp.ui.media;

import X.AnonymousClass029;
import X.C002701i;
import X.C02E;
import X.C02O;
import X.C2ZM;
import X.C3ZD;
import X.C40081rY;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.text.ReadMoreTextView;

/* loaded from: classes2.dex */
public class MediaCaptionTextView extends C2ZM {
    public C02E A00;
    public C40081rY A01;
    public C02O A02;

    public MediaCaptionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 43));
        ((ReadMoreTextView) this).A03 = new C3ZD() { // from class: X.3sH
            @Override // X.C3ZD
            public final boolean AIV() {
                return true;
            }
        };
    }

    public void setCaptionText(CharSequence charSequence) {
        float dimensionPixelSize;
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return;
        }
        int A05 = C002701i.A05(charSequence);
        if (A05 > 0 && A05 <= 3) {
            float dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.caption_text_size_large);
            dimensionPixelSize = (((Math.max(dimensionPixelSize2, Math.min(dimensionPixelSize2, (getContext().getResources().getDisplayMetrics().density * dimensionPixelSize2) / getContext().getResources().getDisplayMetrics().scaledDensity) * 1.5f) - dimensionPixelSize2) * (4 - A05)) / 3.0f) + dimensionPixelSize2;
        } else {
            Resources resources = getContext().getResources();
            int length = charSequence.length();
            int i = R.dimen.caption_text_size_small;
            if (length < 96) {
                i = R.dimen.caption_text_size_large;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(i);
        }
        if (charSequence.length() < 96) {
            setGravity(17);
        } else {
            setGravity(8388611);
        }
        setTextSize(0, dimensionPixelSize);
        setText(C002701i.A0d(AnonymousClass029.A0Q(this.A00, this.A02, charSequence), getContext(), getPaint(), this.A01));
        setVisibility(0);
    }
}
