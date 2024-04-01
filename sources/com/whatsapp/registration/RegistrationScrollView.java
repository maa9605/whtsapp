package com.whatsapp.registration;

import X.AbstractC79723m7;
import X.C0AT;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.registration.RegistrationScrollView;

/* loaded from: classes2.dex */
public class RegistrationScrollView extends AbstractC79723m7 {
    public View A00;
    public View A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public LinearLayout A03;
    public WaTextView A04;
    public boolean A05;
    public final float A06;
    public final ViewTreeObserver.OnScrollChangedListener A07;

    public RegistrationScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = getResources().getDimension(R.dimen.actionbar_elevation);
        this.A07 = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3UU
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                RegistrationScrollView registrationScrollView = RegistrationScrollView.this;
                boolean canScrollVertically = registrationScrollView.canScrollVertically(1);
                if (registrationScrollView.canScrollVertically(-1) || canScrollVertically) {
                    int bottom = registrationScrollView.getChildAt(registrationScrollView.getChildCount() - 1).getBottom();
                    int height = registrationScrollView.getHeight();
                    int scrollY = registrationScrollView.getScrollY();
                    float height2 = registrationScrollView.getChildAt(0).getHeight() - height;
                    registrationScrollView.A00(scrollY / height2, false, registrationScrollView.A03, registrationScrollView.A04, registrationScrollView.A01, registrationScrollView.A00);
                    registrationScrollView.A00((bottom - (height + scrollY)) / height2, true, registrationScrollView.A03, registrationScrollView.A04, registrationScrollView.A01, registrationScrollView.A00);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(float f, boolean z, LinearLayout linearLayout, WaTextView waTextView, View view, View view2) {
        if (z) {
            view = view2;
        }
        if (f < 0.1f) {
            if (Build.VERSION.SDK_INT < 21) {
                view.setVisibility(0);
                view.setAlpha(f * 10.0f);
            }
            if (!z) {
                linearLayout = waTextView;
            }
            C0AT.A0P(linearLayout, f * 10.0f * this.A06);
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            view.setVisibility(0);
        }
        if (!z) {
            linearLayout = waTextView;
        }
        C0AT.A0P(linearLayout, this.A06);
    }

    public /* synthetic */ void A01(View view, View view2, LinearLayout linearLayout, WaTextView waTextView) {
        if (!this.A05) {
            getViewTreeObserver().addOnScrollChangedListener(this.A07);
            this.A05 = true;
        }
        boolean canScrollVertically = canScrollVertically(1);
        boolean canScrollVertically2 = canScrollVertically(-1);
        if (!canScrollVertically2 && !canScrollVertically) {
            if (Build.VERSION.SDK_INT < 21) {
                view.setVisibility(8);
                view2.setVisibility(8);
            }
            C0AT.A0P(linearLayout, 0.0f);
            C0AT.A0P(waTextView, 0.0f);
            return;
        }
        if (canScrollVertically) {
            if (Build.VERSION.SDK_INT < 21) {
                view.setVisibility(0);
            }
            C0AT.A0P(waTextView, this.A06);
        }
        if (!canScrollVertically2) {
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            view2.setVisibility(0);
        }
        C0AT.A0P(linearLayout, this.A06);
    }
}
