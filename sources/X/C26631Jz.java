package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;

/* renamed from: X.1Jz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26631Jz implements TextWatcher {
    public String A00 = "";
    public boolean A01;
    public boolean A02;
    public final InterfaceC26591Jv A03;
    public final InterfaceC26601Jw A04;
    public final CodeInputField A05;

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C26631Jz(InterfaceC26591Jv interfaceC26591Jv, CodeInputField codeInputField, InterfaceC26601Jw interfaceC26601Jw) {
        this.A03 = interfaceC26591Jv;
        this.A05 = codeInputField;
        this.A04 = interfaceC26601Jw;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int length;
        int length2;
        SpannableStringBuilder ADD;
        InterfaceC26591Jv interfaceC26591Jv;
        Object[] spans;
        CodeInputField codeInputField = this.A05;
        int selectionStart = codeInputField.getSelectionStart();
        String replace = editable.toString().replace(Character.toString(codeInputField.A01), "");
        if (!replace.isEmpty() && replace.charAt(0) != 160) {
            codeInputField.A07 = false;
        }
        int i = codeInputField.A02 >> 1;
        int length3 = replace.length();
        if (length3 > 0 && this.A00.startsWith(replace.substring(0, 1)) && this.A00.indexOf(160) >= 0 && replace.indexOf(160) < 0 && selectionStart == i) {
            StringBuilder sb = new StringBuilder();
            sb.append(replace.substring(0, i - 1));
            sb.append(replace.substring(i));
            replace = sb.toString();
            selectionStart--;
        } else if (length3 > selectionStart && replace.indexOf(160) == selectionStart && selectionStart == i + 1) {
            selectionStart++;
        }
        String replace2 = replace.replace(Character.toString((char) 160), "");
        int length4 = replace2.length();
        if (length4 > i) {
            length4++;
        }
        while (true) {
            length = replace2.length();
            if (length >= i) {
                break;
            }
            StringBuilder A0P = C000200d.A0P(replace2);
            A0P.append(codeInputField.A01);
            replace2 = A0P.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(replace2.substring(0, i));
        sb2.append((char) 160);
        sb2.append(replace2.substring(i, Math.min(codeInputField.A02, length)));
        String obj = sb2.toString();
        while (true) {
            length2 = obj.length();
            if (length2 >= codeInputField.A02 + 1) {
                break;
            }
            StringBuilder A0P2 = C000200d.A0P(obj);
            A0P2.append(codeInputField.A01);
            obj = A0P2.toString();
        }
        if (codeInputField.A07) {
            ADD = new SpannableStringBuilder(obj);
            for (int i2 = 0; i2 < ADD.length(); i2++) {
                if (ADD.charAt(i2) == codeInputField.A01) {
                    int i3 = i2 + 1;
                    ADD.setSpan(new RelativeSizeSpan(0.9f), i2, i3, 33);
                    ADD.setSpan(new C1K0(codeInputField.getContext(), C02160Ac.A00(codeInputField.getContext(), R.color.code_input_error)), i2, i3, 33);
                } else if (ADD.charAt(i2) != 160) {
                    ADD.setSpan(new C1K0(codeInputField.getContext(), C02160Ac.A00(codeInputField.getContext(), R.color.code_input_text)), i2, i2 + 1, 33);
                }
            }
        } else {
            ADD = this.A04.ADD(obj);
        }
        if (ADD.length() > 0) {
            InputFilter[] filters = editable.getFilters();
            codeInputField.removeTextChangedListener(this);
            editable.setFilters(new InputFilter[0]);
            for (Object obj2 : editable.getSpans(0, editable.length(), CharacterStyle.class)) {
                editable.removeSpan(obj2);
            }
            editable.replace(0, editable.length(), ADD.toString());
            for (Object obj3 : ADD.getSpans(0, ADD.length(), CharacterStyle.class)) {
                editable.setSpan(obj3, ADD.getSpanStart(obj3), ADD.getSpanEnd(obj3), 18);
            }
            editable.setFilters(filters);
            codeInputField.addTextChangedListener(this);
        }
        codeInputField.setSelection(Math.min(selectionStart, Math.min(length4, length2)));
        if (!this.A01 && (interfaceC26591Jv = this.A03) != null) {
            String replaceAll = obj.toString().replaceAll("[^0-9]", "");
            if (replaceAll.length() == codeInputField.A02) {
                if (!this.A02) {
                    this.A02 = true;
                    interfaceC26591Jv.AIf(replaceAll);
                    return;
                }
                return;
            }
            this.A02 = false;
            interfaceC26591Jv.AMT(replaceAll);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.A00 = charSequence.toString();
        }
    }
}
