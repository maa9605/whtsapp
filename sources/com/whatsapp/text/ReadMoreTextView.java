package com.whatsapp.text;

import X.C002301c;
import X.C02770Cu;
import X.C2ZK;
import X.C3ZD;
import X.C3ZE;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* loaded from: classes2.dex */
public class ReadMoreTextView extends C2ZK {
    public static final C3ZE A0C;
    public int A00;
    public int A01;
    public C002301c A02;
    public C3ZD A03;
    public CharSequence A04;
    public CharSequence A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final Runnable A0B;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            A0C = new C3ZE() { // from class: X.3s6
                @Override // X.C3ZE
                public Layout A6r(CharSequence charSequence, TextView textView, int i) {
                    Layout layout = textView.getLayout();
                    return StaticLayout.Builder.obtain(AnonymousClass024.A09(charSequence), 0, charSequence.length(), textView.getPaint(), i).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
                }

                @Override // X.C3ZE
                public void ATu(TextView textView) {
                    textView.setBreakStrategy(0);
                }
            };
        } else {
            A0C = new C3ZE() { // from class: X.3s7
                @Override // X.C3ZE
                public void ATu(TextView textView) {
                }

                @Override // X.C3ZE
                public Layout A6r(CharSequence charSequence, TextView textView, int i) {
                    Layout layout = textView.getLayout();
                    return new StaticLayout(AnonymousClass024.A09(charSequence), textView.getPaint(), i, layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), true);
                }
            };
        }
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet) {
        new TextEmojiLabel(context, attributeSet) { // from class: X.2ZK
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC02680Ck, X.AbstractC02690Cm
            public void A00() {
                if (!(this instanceof C2ZM)) {
                    if (this.A00) {
                        return;
                    }
                    this.A00 = true;
                    ((AbstractC07960aN) generatedComponent()).A2o((ReadMoreTextView) this);
                    return;
                }
                C2ZM c2zm = (C2ZM) this;
                if (c2zm.A00) {
                    return;
                }
                c2zm.A00 = true;
                ((AbstractC07960aN) c2zm.generatedComponent()).A2p((MediaCaptionTextView) c2zm);
            }
        };
        this.A0A = new Handler(Looper.getMainLooper());
        this.A0B = new RunnableEBaseShape0S0102000_I0(this);
        A0C.ATu(this);
        super.A07 = new C02770Cu();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A1e);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                this.A04 = this.A02.A06(resourceId);
            }
            this.A01 = obtainStyledAttributes.getResourceId(2, R.color.link_color);
            this.A08 = obtainStyledAttributes.getBoolean(1, false);
            int i = obtainStyledAttributes.getInt(0, 0);
            this.A00 = i;
            if (i > 0) {
                setMaxLines(i);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0A.removeCallbacks(this.A0B);
    }

    @Override // X.C02700Cn, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Handler handler = this.A0A;
        Runnable runnable = this.A0B;
        handler.removeCallbacks(runnable);
        if (this.A00 != 0) {
            handler.post(runnable);
        }
    }

    public void setExpanded(boolean z) {
        if (this.A06 == z) {
            return;
        }
        this.A06 = z;
        setMaxLines((z || (r0 = this.A00) == 0) ? Integer.MAX_VALUE : Integer.MAX_VALUE);
        setText(this.A05);
    }

    public void setLinesLimit(int i) {
        this.A00 = i;
        setMaxLines((this.A06 || i == 0) ? Integer.MAX_VALUE : Integer.MAX_VALUE);
        requestLayout();
        invalidate();
    }

    public void setReadMoreClickListener(C3ZD c3zd) {
        this.A03 = c3zd;
    }

    @Override // com.whatsapp.TextEmojiLabel, com.whatsapp.WaTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.A09) {
            return;
        }
        this.A05 = charSequence;
    }

    public static void setVisibleText(ReadMoreTextView readMoreTextView, CharSequence charSequence) {
        readMoreTextView.A09 = true;
        readMoreTextView.setText(charSequence);
        readMoreTextView.A09 = false;
    }
}
