package com.whatsapp.payments.pin.ui;

import X.AbstractC08940cM;
import X.ActivityC02330At;
import X.AnonymousClass012;
import X.AnonymousClass499;
import X.C002301c;
import X.C02160Ac;
import X.C49D;
import X.C90834Cp;
import X.InterfaceC26591Jv;
import X.View$OnClickListenerC69313Ny;
import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.components.Button;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* loaded from: classes3.dex */
public class PinBottomSheetDialogFragment extends Hilt_PinBottomSheetDialogFragment {
    public long A00;
    public CountDownTimer A01;
    public View A02;
    public ProgressBar A03;
    public TextView A04;
    public CodeInputField A05;
    public Button A06;
    public AnonymousClass012 A07;
    public C002301c A08;
    public AnonymousClass499 A09;
    public C90834Cp A0A;
    public C49D A0B;
    public boolean A0C;

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            A09.setRequestedOrientation(10);
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        View inflate = layoutInflater.inflate(R.layout.pin_bottom_sheet, viewGroup, false);
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(3);
        }
        this.A02 = inflate.findViewById(R.id.pin_text_container);
        this.A03 = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.A04 = (TextView) inflate.findViewById(R.id.error_text);
        View findViewById = inflate.findViewById(R.id.forgot_pin_button);
        if (findViewById != null) {
            Button button = (Button) findViewById;
            this.A06 = button;
            String A06 = this.A08.A06(R.string.payment_pin_term_default);
            if (this.A0A != null) {
                String A062 = this.A08.A06(R.string.payment_pin_term_default);
                if (!TextUtils.isEmpty(A062)) {
                    A06 = A062;
                }
            }
            button.setText(this.A08.A0D(R.string.payment_forgot_pin, A06));
            this.A06.setOnClickListener(new View$OnClickListenerC69313Ny(this));
            boolean z = this.A0C;
            this.A0C = z;
            Button button2 = this.A06;
            if (button2 != null) {
                if (z) {
                    button2.setVisibility(8);
                } else {
                    button2.setVisibility(0);
                }
            }
            CodeInputField codeInputField = (CodeInputField) inflate.findViewById(R.id.code);
            this.A05 = codeInputField;
            codeInputField.A05(6, new InterfaceC26591Jv() { // from class: X.4Cn
                {
                    PinBottomSheetDialogFragment.this = this;
                }

                @Override // X.InterfaceC26591Jv
                public void AIf(String str) {
                    if (str.length() == 6) {
                        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = PinBottomSheetDialogFragment.this;
                        if (pinBottomSheetDialogFragment.A0B == null || pinBottomSheetDialogFragment.A00 > pinBottomSheetDialogFragment.A07.A05()) {
                            return;
                        }
                        pinBottomSheetDialogFragment.A0B.AIo(str);
                    }
                }

                @Override // X.InterfaceC26591Jv
                public void AMT(String str) {
                    if (str.length() == 6) {
                        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = PinBottomSheetDialogFragment.this;
                        if (pinBottomSheetDialogFragment.A0B == null || pinBottomSheetDialogFragment.A00 > pinBottomSheetDialogFragment.A07.A05()) {
                            return;
                        }
                        pinBottomSheetDialogFragment.A0B.AIo(str);
                    }
                }
            }, A01().getColor(R.color.fb_pay_input_color));
            ((NumberEntryKeyboard) inflate.findViewById(R.id.number_entry_keyboard)).A06 = this.A05;
            if (this.A0A != null) {
                ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.title_view);
                if (this.A0A != null) {
                    layoutInflater.inflate(R.layout.pay_header, viewGroup2, true);
                    TextView textView = (TextView) inflate.findViewById(R.id.header_text);
                    C90834Cp c90834Cp = this.A0A;
                    C002301c c002301c = this.A08;
                    if (c90834Cp != null) {
                        textView.setText(c002301c.A06(R.string.payment_pin_bottom_sheet_title));
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            return inflate;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        long A01 = this.A09.A01() * 1000;
        if (A01 > this.A07.A05() || this.A01 != null) {
            A1F(A01, false);
        }
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            A09.setRequestedOrientation(1);
        }
    }

    @Override // com.whatsapp.RoundedBottomSheetDialogFragment
    public void A1A(View view) {
        super.A1A(view);
        final BottomSheetBehavior A00 = BottomSheetBehavior.A00(view);
        A00.A0E = new AbstractC08940cM() { // from class: X.4Co
            @Override // X.AbstractC08940cM
            public void A00(View view2, float f) {
            }

            @Override // X.AbstractC08940cM
            public void A01(View view2, int i) {
                if (i == 1) {
                    A00.A0O(3);
                }
            }
        };
    }

    public void A1B() {
        this.A05.setText((CharSequence) null);
    }

    public void A1C() {
        A15(true);
        this.A02.setVisibility(0);
        this.A03.setVisibility(8);
        this.A05.setEnabled(true);
    }

    public void A1D() {
        A15(false);
        this.A02.setVisibility(4);
        this.A04.setVisibility(4);
        this.A03.setVisibility(0);
        this.A05.setEnabled(false);
    }

    public void A1E(int i) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A05.setErrorState(true);
        this.A05.A04();
        this.A04.setText(this.A08.A0A(R.plurals.payment_pin_retry_attempts, i, Integer.valueOf(i)));
        TextView textView = this.A04;
        textView.setTextColor(C02160Ac.A00(textView.getContext(), R.color.code_input_error));
        this.A04.setVisibility(0);
    }

    public final void A1F(long j, boolean z) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A00 = j;
        TextView textView = this.A04;
        textView.setTextColor(C02160Ac.A00(textView.getContext(), R.color.secondary_text));
        this.A04.setVisibility(0);
        this.A05.setErrorState(true);
        this.A05.setEnabled(false);
        if (z) {
            this.A05.A04();
        }
        this.A01 = new CountDownTimer(j - this.A07.A05()) { // from class: X.49C
            {
                PinBottomSheetDialogFragment.this = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                PinBottomSheetDialogFragment pinBottomSheetDialogFragment = PinBottomSheetDialogFragment.this;
                pinBottomSheetDialogFragment.A01 = null;
                pinBottomSheetDialogFragment.A04.setVisibility(4);
                pinBottomSheetDialogFragment.A05.setErrorState(false);
                pinBottomSheetDialogFragment.A05.setEnabled(true);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                PinBottomSheetDialogFragment pinBottomSheetDialogFragment = PinBottomSheetDialogFragment.this;
                pinBottomSheetDialogFragment.A04.setText(pinBottomSheetDialogFragment.A0G(R.string.payment_pin_timeout, AnonymousClass029.A0g(pinBottomSheetDialogFragment.A08, j2 / 1000)));
            }
        }.start();
    }

    public /* synthetic */ void A1G(View view) {
        C49D c49d = this.A0B;
        if (c49d != null) {
            c49d.AKa(view);
        }
    }
}
