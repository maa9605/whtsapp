package com.whatsapp.payments.ui.widget;

import X.C002301c;
import X.C013606n;
import X.C014006r;
import X.C014406v;
import X.C01B;
import X.C01C;
import X.C0AT;
import X.C0GR;
import X.C0SG;
import X.C28E;
import X.C4FP;
import X.C90204Ab;
import X.C91504Fe;
import X.C91544Fi;
import X.InterfaceC013706o;
import X.InterfaceC26771Kp;
import X.RunnableC70313Ru;
import X.View$OnClickListenerC70303Rt;
import X.View$OnClickListenerC70333Rw;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.QrImageView;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public class IndiaUpiDisplaySecureQrCodeView extends C4FP {
    public View A00;
    public FrameLayout A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C0SG A09;
    public QrImageView A0A;
    public C01B A0B;
    public C002301c A0C;
    public C013606n A0D;
    public C0GR A0E;
    public PaymentAmountInputField A0F;
    public C91544Fi A0G;
    public final C014406v A0H;

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0H = C014406v.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");
        LayoutInflater.from(getContext()).inflate(R.layout.india_upi_display_qr_code_view, (ViewGroup) this, true);
        setOrientation(1);
        this.A0A = (QrImageView) findViewById(R.id.qr_code);
        this.A05 = (TextView) C0AT.A0D(this, R.id.add_amount);
        this.A06 = (TextView) C0AT.A0D(this, R.id.display_payment_amount);
        this.A07 = (TextView) C0AT.A0D(this, R.id.amount_input_error_text);
        this.A02 = (ImageView) C0AT.A0D(this, R.id.dashed_underline);
        PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) C0AT.A0D(this, R.id.user_payment_amount);
        this.A0F = paymentAmountInputField;
        InterfaceC013706o A01 = C013606n.A01("INR");
        paymentAmountInputField.A0F = A01;
        paymentAmountInputField.A03 = 1;
        C014006r c014006r = new C014006r(new BigDecimal(this.A0B.A07(C01C.A3j)), A01.A9i());
        this.A0F.A0H = new C91504Fe(A01, this.A0C, c014006r, c014006r);
        this.A03 = (LinearLayout) C0AT.A0D(this, R.id.add_or_display_amount);
        this.A00 = C0AT.A0D(this, R.id.user_amount_input);
        this.A04 = (LinearLayout) findViewById(R.id.qr_code_signing_secure_title_container);
        this.A08 = (TextView) findViewById(R.id.qr_code_signing_retry_text);
        this.A01 = (FrameLayout) findViewById(R.id.progress_container);
    }

    public /* synthetic */ void A02() {
        C91544Fi c91544Fi = this.A0G;
        c91544Fi.A03.A0B(this.A0F.getText().toString());
    }

    public /* synthetic */ void A03(int i) {
        C91544Fi c91544Fi = this.A0G;
        c91544Fi.A02.A0B(new C90204Ab(3, i));
    }

    public void A04(boolean z) {
        if (z) {
            this.A05.setVisibility(8);
            this.A02.setVisibility(8);
            this.A08.setVisibility(8);
            return;
        }
        if (this.A06.getVisibility() == 8) {
            this.A05.setVisibility(0);
        } else {
            this.A02.setVisibility(0);
        }
        if (!this.A0B.A0E(C01C.A1w)) {
            this.A08.setVisibility(8);
        } else {
            this.A08.setVisibility(this.A04.getVisibility() != 0 ? 0 : 8);
        }
    }

    public final void A05(boolean z) {
        if (!this.A0B.A0E(C01C.A1w)) {
            this.A04.setVisibility(8);
            this.A08.setVisibility(8);
        } else if (!z) {
            this.A04.setVisibility(8);
            this.A08.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.A0G.A02().A08)) {
            this.A08.setVisibility(8);
            this.A04.setVisibility(0);
        } else {
            this.A08.setVisibility(0);
            this.A04.setVisibility(8);
        }
    }

    public /* synthetic */ void A06(boolean z) {
        if (!z || TextUtils.isEmpty(this.A0F.getText())) {
            return;
        }
        PaymentAmountInputField paymentAmountInputField = this.A0F;
        paymentAmountInputField.setSelection(paymentAmountInputField.getText().length());
    }

    public /* synthetic */ boolean A07(int i) {
        if (i == 6) {
            C91544Fi c91544Fi = this.A0G;
            c91544Fi.A03.A0B(this.A0F.getText().toString());
            return true;
        }
        return false;
    }

    public C0SG getQrCode() {
        return this.A09;
    }

    public String getUserInputAmount() {
        return this.A0F.getText().toString();
    }

    public void setup(C91544Fi c91544Fi) {
        this.A0G = c91544Fi;
        this.A03.setOnClickListener(new View$OnClickListenerC70333Rw(c91544Fi));
        this.A08.setText(C28E.A06(this.A0C.A06(R.string.upi_signing_qr_code_failed_retry_message), "try-again", RunnableC70313Ru.A00));
        this.A08.setOnClickListener(new View$OnClickListenerC70303Rt(c91544Fi));
        this.A0F.A08 = findViewById(R.id.send_payment_amount_container);
        this.A0F.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.3Rv
            {
                IndiaUpiDisplaySecureQrCodeView.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                IndiaUpiDisplaySecureQrCodeView.this.A06(z);
            }
        });
        this.A0F.setErrorTextView(this.A07);
        this.A0F.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.3Rx
            {
                IndiaUpiDisplaySecureQrCodeView.this = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return IndiaUpiDisplaySecureQrCodeView.this.A07(i);
            }
        });
        ((InterceptingEditText) this.A0F).A00 = new InterfaceC26771Kp() { // from class: X.3k0
            {
                IndiaUpiDisplaySecureQrCodeView.this = this;
            }

            @Override // X.InterfaceC26771Kp
            public final void AHh() {
                IndiaUpiDisplaySecureQrCodeView.this.A02();
            }
        };
    }
}
