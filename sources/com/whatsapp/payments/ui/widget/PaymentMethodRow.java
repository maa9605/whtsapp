package com.whatsapp.payments.ui.widget;

import X.C02160Ac;
import X.C0AT;
import X.C4FU;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.CopyableTextView;
import com.whatsapp.WaImageView;

/* loaded from: classes3.dex */
public class PaymentMethodRow extends C4FU {
    public ImageView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public ShimmerFrameLayout A05;
    public CopyableTextView A06;
    public WaImageView A07;

    public PaymentMethodRow(Context context) {
        super(context);
        A00();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        LayoutInflater.from(getContext()).inflate(R.layout.payment_method_row, (ViewGroup) this, true);
        setOrientation(1);
        this.A00 = (ImageView) C0AT.A0D(this, R.id.payment_method_provider_icon);
        this.A04 = (TextView) C0AT.A0D(this, R.id.payment_method_bank_name);
        this.A06 = (CopyableTextView) C0AT.A0D(this, R.id.payment_method_account_id);
        this.A03 = (TextView) C0AT.A0D(this, R.id.payment_method_provider_name);
        this.A02 = (TextView) C0AT.A0D(this, R.id.payment_method_decorate);
        this.A07 = (WaImageView) C0AT.A0D(this, R.id.payment_method_decorate_icon);
        this.A01 = (TextView) C0AT.A0D(this, R.id.payment_branding);
        this.A05 = (ShimmerFrameLayout) C0AT.A0D(this, R.id.payment_method_name_shimmer);
        this.A06.setVisibility(8);
        this.A03.setVisibility(8);
        this.A02.setVisibility(8);
        this.A07.setVisibility(8);
        this.A01.setVisibility(8);
        ShimmerFrameLayout shimmerFrameLayout = this.A05;
        if (shimmerFrameLayout.A00) {
            shimmerFrameLayout.A01();
            shimmerFrameLayout.A00 = false;
            shimmerFrameLayout.invalidate();
        }
    }

    public void A01(String str) {
        this.A03.setText(str);
        this.A03.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void A02(boolean z) {
        if (z) {
            this.A04.setTextColor(C02160Ac.A00(getContext(), R.color.list_item_title));
        } else {
            this.A04.setTextColor(C02160Ac.A00(getContext(), R.color.payments_status_gray));
        }
    }

    public ImageView getMethodIconView() {
        return this.A00;
    }

    public void setNameShimmer(boolean z) {
        if (z) {
            ShimmerFrameLayout shimmerFrameLayout = this.A05;
            if (!shimmerFrameLayout.A00) {
                shimmerFrameLayout.A00 = true;
                shimmerFrameLayout.A00();
                return;
            }
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout2 = this.A05;
        if (!shimmerFrameLayout2.A00) {
            return;
        }
        shimmerFrameLayout2.A01();
        shimmerFrameLayout2.A00 = false;
        shimmerFrameLayout2.invalidate();
    }
}
