package com.whatsapp.components;

import X.AbstractC57602ph;
import X.AnonymousClass031;
import X.C02E;
import X.C08540bf;
import X.C0AT;
import X.C0LX;
import X.C1LY;
import X.C2JT;
import X.C2Vf;
import X.C3ZC;
import X.C57622pj;
import X.InterfaceC07020Wd;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class PhoneNumberEntry extends C2Vf implements InterfaceC07020Wd {
    public TextWatcher A00;
    public AnonymousClass031 A01;
    public WaEditText A02;
    public WaEditText A03;
    public AbstractC57602ph A04;
    public C02E A05;
    public String A06;

    public PhoneNumberEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSaveEnabled(true);
        C0AT.A0W(this, 0);
        LinearLayout.inflate(context, R.layout.phone_number_entry, this);
        this.A02 = (WaEditText) findViewById(R.id.registration_cc);
        WaEditText waEditText = (WaEditText) findViewById(R.id.registration_phone);
        this.A03 = waEditText;
        waEditText.setSaveEnabled(false);
        this.A02.setSaveEnabled(false);
        this.A02.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
        this.A03.setFilters(new InputFilter[]{new InputFilter.LengthFilter(17)});
        C0LX.A03(this.A03);
        C1LY c1ly = new C1LY() { // from class: X.36D
            {
                PhoneNumberEntry.this = this;
            }

            @Override // X.C1LY
            public final boolean APa(int i) {
                ClipboardManager A06;
                ClipData primaryClip;
                PhoneNumberEntry phoneNumberEntry = PhoneNumberEntry.this;
                if ((i != 16908322 && i != 16908337) || (A06 = phoneNumberEntry.A05.A06()) == null || (primaryClip = A06.getPrimaryClip()) == null || primaryClip.getItemCount() == 0) {
                    return false;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                String charSequence = (itemAt == null || itemAt.getText() == null) ? "" : itemAt.getText().toString();
                if (charSequence.startsWith("+")) {
                    try {
                        C10090fH A0F = C0DZ.A00().A0F(charSequence, null);
                        String num = Integer.toString(A0F.countryCode_);
                        String A01 = C0DZ.A01(A0F);
                        if (C26L.A02(phoneNumberEntry.A01, num, A01) != 1) {
                            return false;
                        }
                        phoneNumberEntry.A02.setText(num);
                        phoneNumberEntry.A03.setText(A01);
                        return true;
                    } catch (C24581Cb unused) {
                        return false;
                    }
                }
                return false;
            }
        };
        WaEditText waEditText2 = this.A02;
        waEditText2.A01 = c1ly;
        this.A03.A01 = c1ly;
        waEditText2.addTextChangedListener(new C2JT() { // from class: X.36H
            {
                PhoneNumberEntry.this = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:78:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0054  */
            @Override // X.C2JT, android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void afterTextChanged(android.text.Editable r8) {
                /*
                    Method dump skipped, instructions count: 318
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C36H.afterTextChanged(android.text.Editable):void");
            }
        });
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A1m);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            C0AT.A0Z(this.A03, colorStateList);
            C0AT.A0Z(this.A02, colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    public void A00(String str) {
        this.A06 = str;
        TextWatcher textWatcher = this.A00;
        if (textWatcher != null) {
            this.A03.removeTextChangedListener(textWatcher);
        }
        try {
            C3ZC c3zc = new C3ZC(str) { // from class: X.36I
                {
                    PhoneNumberEntry.this = this;
                }

                @Override // X.C3ZC, android.text.TextWatcher
                public synchronized void afterTextChanged(Editable editable) {
                    super.afterTextChanged(editable);
                    AbstractC57602ph abstractC57602ph = PhoneNumberEntry.this.A04;
                    if (abstractC57602ph != null && (abstractC57602ph instanceof C79783mD)) {
                        ((C79783mD) abstractC57602ph).A00.A1T();
                    }
                }
            };
            this.A00 = c3zc;
            this.A03.addTextChangedListener(c3zc);
        } catch (NullPointerException unused) {
            Log.e("PhoneNumberEntry/formatter exception");
        }
    }

    public WaEditText getCountryCodeField() {
        return this.A02;
    }

    public WaEditText getPhoneNumberField() {
        return this.A03;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C57622pj c57622pj = (C57622pj) parcelable;
        super.onRestoreInstanceState(c57622pj.getSuperState());
        this.A02.setText(c57622pj.A00);
        this.A03.setText(c57622pj.A01);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Editable text = this.A02.getText();
        if (text != null) {
            String obj = text.toString();
            Editable text2 = this.A03.getText();
            if (text2 != null) {
                return new C57622pj(onSaveInstanceState, obj, text2.toString());
            }
            throw null;
        }
        throw null;
    }

    public void setOnPhoneNumberChangeListener(AbstractC57602ph abstractC57602ph) {
        this.A04 = abstractC57602ph;
    }
}
