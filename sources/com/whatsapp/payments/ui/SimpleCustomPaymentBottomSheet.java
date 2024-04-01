package com.whatsapp.payments.ui;

import X.C3OU;
import X.C3OV;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public abstract class SimpleCustomPaymentBottomSheet extends Hilt_SimpleCustomPaymentBottomSheet {
    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.simple_custom_payment_buttom_sheet, viewGroup, false);
        BrazilSmbMerchantNuxUpSellBottomSheet brazilSmbMerchantNuxUpSellBottomSheet = (BrazilSmbMerchantNuxUpSellBottomSheet) this;
        String A0F = brazilSmbMerchantNuxUpSellBottomSheet.A0F(R.string.payment_get_started_button_text);
        C3OV c3ov = new C3OV(brazilSmbMerchantNuxUpSellBottomSheet);
        String A0F2 = brazilSmbMerchantNuxUpSellBottomSheet.A0F(R.string.not_now);
        C3OU c3ou = new C3OU(brazilSmbMerchantNuxUpSellBottomSheet);
        View inflate2 = LayoutInflater.from(((Hilt_BrazilSmbMerchantNuxUpSellBottomSheet) brazilSmbMerchantNuxUpSellBottomSheet).A00).inflate(R.layout.collect_request_upgrade_nudge_bottom_sheet_content, (ViewGroup) null, false);
        if (!TextUtils.isEmpty(A0F)) {
            TextView textView = (TextView) inflate.findViewById(R.id.primary_button);
            textView.setText(A0F);
            textView.setOnClickListener(c3ov);
            textView.setVisibility(0);
        }
        if (!TextUtils.isEmpty(A0F2)) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.secondary_button);
            textView2.setText(A0F2);
            textView2.setOnClickListener(c3ou);
            textView2.setVisibility(0);
        }
        ((ViewGroup) inflate.findViewById(R.id.ui_container)).addView(inflate2);
        return inflate;
    }
}
