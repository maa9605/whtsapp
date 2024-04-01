package com.whatsapp.payments.ui;

import X.AnonymousClass011;
import X.C000200d;
import X.C003301p;
import X.C014406v;
import X.C0N2;
import X.C0U1;
import X.C2Lw;
import X.C2MB;
import X.C37011lj;
import X.C37311mD;
import X.C3PD;
import X.C40841sx;
import X.C4CV;
import X.C4CW;
import X.C4L9;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerifActivity;
import com.whatsapp.payments.ui.widget.DebitCardInputText;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class IndiaUpiDebitCardVerifActivity extends C4L9 {
    public int A00;
    public int A01;
    public EditText A02;
    public EditText A03;
    public EditText A04;
    public EditText A05;
    public TextView A06;
    public AnonymousClass011 A07;
    public C37011lj A08;
    public C37311mD A09;
    public C4CV A0A;
    public C4CW A0B;
    public C2MB A0C;
    public final C014406v A0D = C014406v.A00("IndiaUpiDebitCardVerifActivity", "onboarding", "IN");

    public final void A1a() {
        this.A06.startAnimation(C000200d.A03(0.0f, 1.0f, 250L));
        this.A06.setVisibility(0);
    }

    public final void A1b() {
        if (A1d(this.A00, this.A01, true)) {
            Intent intent = getIntent();
            StringBuilder sb = new StringBuilder();
            sb.append(C000200d.A0A(this.A02));
            sb.append(C000200d.A0A(this.A03));
            intent.putExtra("extra_india_upi_debit_card_last6", sb.toString());
            intent.putExtra("extra_india_upi_debit_card_expiry_month", C000200d.A0A(this.A04));
            intent.putExtra("extra_india_upi_debit_card_expiry_year", C000200d.A0A(this.A05));
            setResult(101, intent);
            finish();
        }
        this.A07.A07(this.A08);
        C37311mD c37311mD = this.A09;
        c37311mD.A04 = 5;
        c37311mD.A0P = "add_debit_card_detail";
        this.A07.A07(c37311mD);
    }

    public /* synthetic */ boolean A1c(int i) {
        if (i == 6) {
            A1b();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0053, code lost:
        if (r8 > 12) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00e5, code lost:
        if (r8 > 12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00fa, code lost:
        if (r8 > 12) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0119, code lost:
        if (r6 > r5) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x012c, code lost:
        if (r8 > 12) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A1d(int r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDebitCardVerifActivity.A1d(int, int, boolean):boolean");
    }

    public /* synthetic */ void lambda$onCreate$74$IndiaUpiDebitCardVerifActivity(View view) {
        A1b();
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        C37011lj c37011lj = this.A08;
        c37011lj.A02 = null;
        c37011lj.A00 = Boolean.TRUE;
        this.A07.A07(c37011lj);
        C37311mD c37311mD = this.A09;
        c37311mD.A09 = null;
        c37311mD.A04 = 1;
        this.A07.A07(c37311mD);
    }

    @Override // X.C4L9, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String A0M;
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        setContentView(R.layout.india_upi_payments_bank_card_verif);
        C4CV c4cv = this.A0A;
        C2Lw c2Lw = c4cv.A03;
        String str = c2Lw.A02;
        if (str == null) {
            str = c2Lw.A02();
        }
        C37011lj c37011lj = new C37011lj();
        c37011lj.A01 = c4cv.A00;
        c37011lj.A03 = str;
        this.A08 = c37011lj;
        this.A09 = this.A0B.A00();
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.payments_verify_debit_card_activity_title);
            A0c.A0L(true);
        }
        C0N2 c0n2 = (C0N2) getIntent().getParcelableExtra("extra_bank_account");
        if (c0n2 != null && (A0M = C40841sx.A0M(c0n2.A0A)) != null) {
            ((TextView) findViewById(R.id.add_card_number_label)).setText(getString(R.string.payments_debit_card_verification_title, A0M));
        }
        EditText editText = (EditText) findViewById(R.id.add_card_number1);
        this.A02 = editText;
        C003301p.A06(editText);
        EditText editText2 = (EditText) findViewById(R.id.add_card_number2);
        this.A03 = editText2;
        C003301p.A06(editText2);
        this.A04 = (EditText) findViewById(R.id.add_card_month);
        this.A05 = (EditText) findViewById(R.id.add_card_year);
        C003301p.A06(this.A04);
        C003301p.A06(this.A05);
        this.A06 = (TextView) findViewById(R.id.payments_send_payment_error_text);
        Calendar calendar = Calendar.getInstance();
        this.A00 = calendar.get(2) + 1;
        this.A01 = calendar.get(1) % 100;
        this.A02.addTextChangedListener(new TextWatcher(2, this.A03) { // from class: X.49P
            public final int A00;
            public final EditText A01;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                IndiaUpiDebitCardVerifActivity.this = this;
                this.A00 = r2;
                this.A01 = r3;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int parseInt;
                if (i3 != 0) {
                    IndiaUpiDebitCardVerifActivity.this.A06.setVisibility(4);
                }
                if (charSequence.length() >= this.A00) {
                    EditText editText3 = this.A01;
                    if (editText3 != null) {
                        editText3.requestFocus();
                        IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity = IndiaUpiDebitCardVerifActivity.this;
                        if (editText3 == indiaUpiDebitCardVerifActivity.A05) {
                            EditText editText4 = indiaUpiDebitCardVerifActivity.A04;
                            if (TextUtils.isEmpty(C000200d.A0A(editText4)) || (parseInt = Integer.parseInt(C000200d.A0A(editText4))) == -1) {
                                return;
                            }
                            if (parseInt < 1 || parseInt > 12) {
                                indiaUpiDebitCardVerifActivity.A06.setText(R.string.debit_card_expiration_verification_month_error_text);
                                indiaUpiDebitCardVerifActivity.A1a();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity2 = IndiaUpiDebitCardVerifActivity.this;
                    indiaUpiDebitCardVerifActivity2.A1d(indiaUpiDebitCardVerifActivity2.A00, indiaUpiDebitCardVerifActivity2.A01, false);
                }
            }
        });
        this.A02.setOnKeyListener(new View.OnKeyListener(null, this.A03) { // from class: X.49Q
            public final EditText A00;
            public final EditText A01;

            {
                this.A01 = r1;
                this.A00 = r2;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                EditText editText3;
                DebitCardInputText debitCardInputText = (DebitCardInputText) view;
                if (debitCardInputText != null && keyEvent.getAction() == 0 && debitCardInputText.isFocused()) {
                    if (i == 67 && (editText3 = this.A01) != null && TextUtils.isEmpty(debitCardInputText.getText())) {
                        debitCardInputText.clearFocus();
                        editText3.requestFocus();
                        return true;
                    }
                    EditText editText4 = this.A00;
                    if (editText4 != null && i != 67 && debitCardInputText.getText() != null && debitCardInputText.getText().length() == debitCardInputText.A05) {
                        debitCardInputText.clearFocus();
                        editText4.requestFocus();
                        return true;
                    }
                }
                return false;
            }
        });
        this.A03.addTextChangedListener(new TextWatcher(4, this.A04) { // from class: X.49P
            public final int A00;
            public final EditText A01;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                IndiaUpiDebitCardVerifActivity.this = this;
                this.A00 = r2;
                this.A01 = r3;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int parseInt;
                if (i3 != 0) {
                    IndiaUpiDebitCardVerifActivity.this.A06.setVisibility(4);
                }
                if (charSequence.length() >= this.A00) {
                    EditText editText3 = this.A01;
                    if (editText3 != null) {
                        editText3.requestFocus();
                        IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity = IndiaUpiDebitCardVerifActivity.this;
                        if (editText3 == indiaUpiDebitCardVerifActivity.A05) {
                            EditText editText4 = indiaUpiDebitCardVerifActivity.A04;
                            if (TextUtils.isEmpty(C000200d.A0A(editText4)) || (parseInt = Integer.parseInt(C000200d.A0A(editText4))) == -1) {
                                return;
                            }
                            if (parseInt < 1 || parseInt > 12) {
                                indiaUpiDebitCardVerifActivity.A06.setText(R.string.debit_card_expiration_verification_month_error_text);
                                indiaUpiDebitCardVerifActivity.A1a();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity2 = IndiaUpiDebitCardVerifActivity.this;
                    indiaUpiDebitCardVerifActivity2.A1d(indiaUpiDebitCardVerifActivity2.A00, indiaUpiDebitCardVerifActivity2.A01, false);
                }
            }
        });
        this.A03.setOnKeyListener(new View.OnKeyListener(this.A02, this.A04) { // from class: X.49Q
            public final EditText A00;
            public final EditText A01;

            {
                this.A01 = r1;
                this.A00 = r2;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                EditText editText3;
                DebitCardInputText debitCardInputText = (DebitCardInputText) view;
                if (debitCardInputText != null && keyEvent.getAction() == 0 && debitCardInputText.isFocused()) {
                    if (i == 67 && (editText3 = this.A01) != null && TextUtils.isEmpty(debitCardInputText.getText())) {
                        debitCardInputText.clearFocus();
                        editText3.requestFocus();
                        return true;
                    }
                    EditText editText4 = this.A00;
                    if (editText4 != null && i != 67 && debitCardInputText.getText() != null && debitCardInputText.getText().length() == debitCardInputText.A05) {
                        debitCardInputText.clearFocus();
                        editText4.requestFocus();
                        return true;
                    }
                }
                return false;
            }
        });
        this.A04.addTextChangedListener(new TextWatcher(2, this.A05) { // from class: X.49P
            public final int A00;
            public final EditText A01;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                IndiaUpiDebitCardVerifActivity.this = this;
                this.A00 = r2;
                this.A01 = r3;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int parseInt;
                if (i3 != 0) {
                    IndiaUpiDebitCardVerifActivity.this.A06.setVisibility(4);
                }
                if (charSequence.length() >= this.A00) {
                    EditText editText3 = this.A01;
                    if (editText3 != null) {
                        editText3.requestFocus();
                        IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity = IndiaUpiDebitCardVerifActivity.this;
                        if (editText3 == indiaUpiDebitCardVerifActivity.A05) {
                            EditText editText4 = indiaUpiDebitCardVerifActivity.A04;
                            if (TextUtils.isEmpty(C000200d.A0A(editText4)) || (parseInt = Integer.parseInt(C000200d.A0A(editText4))) == -1) {
                                return;
                            }
                            if (parseInt < 1 || parseInt > 12) {
                                indiaUpiDebitCardVerifActivity.A06.setText(R.string.debit_card_expiration_verification_month_error_text);
                                indiaUpiDebitCardVerifActivity.A1a();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity2 = IndiaUpiDebitCardVerifActivity.this;
                    indiaUpiDebitCardVerifActivity2.A1d(indiaUpiDebitCardVerifActivity2.A00, indiaUpiDebitCardVerifActivity2.A01, false);
                }
            }
        });
        this.A04.setOnKeyListener(new View.OnKeyListener(this.A03, this.A05) { // from class: X.49Q
            public final EditText A00;
            public final EditText A01;

            {
                this.A01 = r1;
                this.A00 = r2;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                EditText editText3;
                DebitCardInputText debitCardInputText = (DebitCardInputText) view;
                if (debitCardInputText != null && keyEvent.getAction() == 0 && debitCardInputText.isFocused()) {
                    if (i == 67 && (editText3 = this.A01) != null && TextUtils.isEmpty(debitCardInputText.getText())) {
                        debitCardInputText.clearFocus();
                        editText3.requestFocus();
                        return true;
                    }
                    EditText editText4 = this.A00;
                    if (editText4 != null && i != 67 && debitCardInputText.getText() != null && debitCardInputText.getText().length() == debitCardInputText.A05) {
                        debitCardInputText.clearFocus();
                        editText4.requestFocus();
                        return true;
                    }
                }
                return false;
            }
        });
        this.A05.addTextChangedListener(new TextWatcher(2, null) { // from class: X.49P
            public final int A00;
            public final EditText A01;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                IndiaUpiDebitCardVerifActivity.this = this;
                this.A00 = r2;
                this.A01 = r3;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int parseInt;
                if (i3 != 0) {
                    IndiaUpiDebitCardVerifActivity.this.A06.setVisibility(4);
                }
                if (charSequence.length() >= this.A00) {
                    EditText editText3 = this.A01;
                    if (editText3 != null) {
                        editText3.requestFocus();
                        IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity = IndiaUpiDebitCardVerifActivity.this;
                        if (editText3 == indiaUpiDebitCardVerifActivity.A05) {
                            EditText editText4 = indiaUpiDebitCardVerifActivity.A04;
                            if (TextUtils.isEmpty(C000200d.A0A(editText4)) || (parseInt = Integer.parseInt(C000200d.A0A(editText4))) == -1) {
                                return;
                            }
                            if (parseInt < 1 || parseInt > 12) {
                                indiaUpiDebitCardVerifActivity.A06.setText(R.string.debit_card_expiration_verification_month_error_text);
                                indiaUpiDebitCardVerifActivity.A1a();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity2 = IndiaUpiDebitCardVerifActivity.this;
                    indiaUpiDebitCardVerifActivity2.A1d(indiaUpiDebitCardVerifActivity2.A00, indiaUpiDebitCardVerifActivity2.A01, false);
                }
            }
        });
        this.A05.setOnKeyListener(new View.OnKeyListener(this.A04, null) { // from class: X.49Q
            public final EditText A00;
            public final EditText A01;

            {
                this.A01 = r1;
                this.A00 = r2;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                EditText editText3;
                DebitCardInputText debitCardInputText = (DebitCardInputText) view;
                if (debitCardInputText != null && keyEvent.getAction() == 0 && debitCardInputText.isFocused()) {
                    if (i == 67 && (editText3 = this.A01) != null && TextUtils.isEmpty(debitCardInputText.getText())) {
                        debitCardInputText.clearFocus();
                        editText3.requestFocus();
                        return true;
                    }
                    EditText editText4 = this.A00;
                    if (editText4 != null && i != 67 && debitCardInputText.getText() != null && debitCardInputText.getText().length() == debitCardInputText.A05) {
                        debitCardInputText.clearFocus();
                        editText4.requestFocus();
                        return true;
                    }
                }
                return false;
            }
        });
        this.A05.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.3PC
            {
                IndiaUpiDebitCardVerifActivity.this = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return IndiaUpiDebitCardVerifActivity.this.A1c(i);
            }
        });
        findViewById(R.id.verify_card).setOnClickListener(new C3PD(this));
        this.A02.requestFocus();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A0C.A01(findViewById(R.id.add_card_year));
    }
}
