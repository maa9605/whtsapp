package com.whatsapp.authentication;

import X.AbstractC09660eW;
import X.AbstractC27261Mr;
import X.C02160Ac;
import X.C0b8;
import X.C38801p0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintView;

/* loaded from: classes.dex */
public class FingerprintView extends C0b8 {
    public AbstractC27261Mr A00;
    public final ImageView A01;
    public final TextView A02;
    public final C38801p0 A03;
    public final C38801p0 A04;
    public final C38801p0 A05;
    public final C38801p0 A06;
    public final Runnable A07;

    public FingerprintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, R.style.FingerprintView);
    }

    public FingerprintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        setOrientation(1);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.fingerprint_view, (ViewGroup) this, true);
        this.A02 = (TextView) findViewById(R.id.fingerprint_prompt);
        this.A01 = (ImageView) findViewById(R.id.fingerprint_icon);
        C38801p0 A00 = C38801p0.A00(contextThemeWrapper, R.drawable.fingerprint_icon);
        if (A00 != null) {
            this.A04 = A00;
            this.A01.setImageDrawable(A00);
            this.A04.start();
            C38801p0 A002 = C38801p0.A00(contextThemeWrapper, R.drawable.fingerprint_icon_to_success);
            if (A002 != null) {
                this.A06 = A002;
                C38801p0 A003 = C38801p0.A00(contextThemeWrapper, R.drawable.fingerprint_icon_to_error);
                if (A003 != null) {
                    this.A05 = A003;
                    C38801p0 A004 = C38801p0.A00(contextThemeWrapper, R.drawable.error_to_fingerprint_icon);
                    if (A004 != null) {
                        this.A03 = A004;
                        this.A07 = new Runnable() { // from class: X.1Mf
                            {
                                FingerprintView.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FingerprintView.this.A02();
                            }
                        };
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void A00() {
        A05(getContext().getString(R.string.fingerprint_not_recognized));
    }

    public void A01() {
        this.A02.setText("");
        ImageView imageView = this.A01;
        imageView.removeCallbacks(this.A07);
        C38801p0 c38801p0 = this.A06;
        imageView.setImageDrawable(c38801p0);
        c38801p0.start();
        c38801p0.A02(new AbstractC09660eW() { // from class: X.1jv
            {
                FingerprintView.this = this;
            }

            @Override // X.AbstractC09660eW
            public void A00(Drawable drawable) {
                AbstractC27261Mr abstractC27261Mr = FingerprintView.this.A00;
                if (abstractC27261Mr != null) {
                    abstractC27261Mr.A00();
                }
            }
        });
    }

    public /* synthetic */ void A02() {
        A03(this.A03);
    }

    public final void A03(C38801p0 c38801p0) {
        String string = getContext().getString(R.string.fingerprint_locked_fingerprint_prompt);
        if (getContext() != null) {
            TextView textView = this.A02;
            textView.setText(string);
            textView.setTextColor(C02160Ac.A00(getContext(), R.color.settings_item_subtitle_text));
            textView.announceForAccessibility(string);
        }
        this.A01.setImageDrawable(c38801p0);
        c38801p0.start();
    }

    public void A04(CharSequence charSequence) {
        setError(charSequence.toString());
        ImageView imageView = this.A01;
        imageView.removeCallbacks(this.A07);
        Drawable drawable = imageView.getDrawable();
        C38801p0 c38801p0 = this.A05;
        if (!drawable.equals(c38801p0)) {
            imageView.setImageDrawable(c38801p0);
            c38801p0.start();
            c38801p0.A02(new AbstractC09660eW() { // from class: X.1jw
                {
                    FingerprintView.this = this;
                }
            });
        }
    }

    public void A05(String str) {
        setError(str);
        ImageView imageView = this.A01;
        Drawable drawable = imageView.getDrawable();
        C38801p0 c38801p0 = this.A05;
        if (!drawable.equals(c38801p0)) {
            imageView.setImageDrawable(c38801p0);
            c38801p0.start();
        }
        Runnable runnable = this.A07;
        imageView.removeCallbacks(runnable);
        imageView.postDelayed(runnable, 1000L);
    }

    private void setError(String str) {
        if (getContext() != null) {
            TextView textView = this.A02;
            textView.setText(str);
            textView.setTextColor(C02160Ac.A00(getContext(), R.color.red_error));
            textView.announceForAccessibility(str);
        }
    }

    public void setListener(AbstractC27261Mr abstractC27261Mr) {
        this.A00 = abstractC27261Mr;
    }
}
