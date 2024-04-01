package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.1EC  reason: invalid class name */
/* loaded from: classes.dex */
public class C1EC implements TextWatcher {
    public EditText A00;
    public final String A04;
    public boolean A02 = false;
    public boolean A03 = false;
    public ArrayList A01 = new ArrayList();

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C1EC(String str, EditText editText) {
        int i = 0;
        this.A04 = str;
        this.A00 = editText;
        while (true) {
            String str2 = this.A04;
            if (i >= str2.length()) {
                return;
            }
            if (str2.charAt(i) != '#') {
                this.A01.add(Integer.valueOf(i));
            }
            i++;
        }
    }

    public final void A00(Editable editable, int i) {
        StringBuilder sb = new StringBuilder(editable);
        int i2 = 0;
        while (i2 < sb.length()) {
            String str = this.A04;
            if (i2 >= str.length()) {
                break;
            }
            if (str.charAt(i2) == '#') {
                if (!Character.isDigit(sb.charAt(i2))) {
                    sb.replace(i2, i2 + 1, "");
                    if (i2 < i) {
                        i--;
                    }
                    i2--;
                }
            } else if (str.charAt(i2) != sb.charAt(i2)) {
                sb.insert(i2, str.substring(i2, i2 + 1));
                if (i2 <= i) {
                    i++;
                }
            }
            i2++;
        }
        int length = sb.length();
        String str2 = this.A04;
        int length2 = str2.length();
        if (length > length2) {
            sb.delete(i2, sb.length());
            i = i2;
        }
        while (i2 < length2 && str2.charAt(i2) != '#') {
            sb.append(str2.charAt(i2));
            if (i == i2) {
                i++;
            }
            i2++;
        }
        this.A00.setText(sb);
        this.A00.setSelection(i);
        this.A03 = false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        EditText editText = this.A00;
        if (editText == null) {
            return;
        }
        int selectionStart = editText.getSelectionStart();
        if (!this.A02 && !this.A03) {
            this.A03 = true;
            A00(editable, selectionStart);
        } else if (this.A03) {
        } else {
            this.A03 = true;
            if (this.A01.contains(Integer.valueOf(selectionStart))) {
                while (true) {
                    if (selectionStart <= 0) {
                        break;
                    }
                    int i = selectionStart - 1;
                    if (this.A04.charAt(i) != '#') {
                        editable.delete(i, selectionStart);
                        selectionStart--;
                    } else {
                        editable.delete(i, selectionStart);
                        selectionStart = i;
                        break;
                    }
                }
            }
            A00(editable, selectionStart);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A02 = i3 < i2;
    }
}
