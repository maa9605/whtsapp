package X;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

/* renamed from: X.3ZC  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3ZC implements TextWatcher {
    public int A00;
    public C1CZ A01;
    public boolean A02 = false;
    public boolean A03;

    public C3ZC(String str) {
        C000700j.A06(str != null);
        if (C0DZ.A00() != null) {
            this.A01 = new C1CZ(str);
            return;
        }
        throw null;
    }

    public static final boolean A00(CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public synchronized void afterTextChanged(Editable editable) {
        int i;
        if (this.A03) {
            this.A03 = editable.length() != 0;
        } else if (!this.A02) {
            int selectionEnd = Selection.getSelectionEnd(editable) - 1;
            this.A01.A07();
            int length = editable.length();
            String str = null;
            char c = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = editable.charAt(i2);
                if (PhoneNumberUtils.isNonSeparator(charAt)) {
                    if (c != 0) {
                        if (z) {
                            C1CZ c1cz = this.A01;
                            str = c1cz.A05(c, true);
                            c1cz.A07 = str;
                        } else {
                            C1CZ c1cz2 = this.A01;
                            str = c1cz2.A05(c, false);
                            c1cz2.A07 = str;
                        }
                        z = false;
                    }
                    c = charAt;
                }
                if (i2 == selectionEnd) {
                    z = true;
                }
            }
            if (c != 0) {
                if (z) {
                    C1CZ c1cz3 = this.A01;
                    str = c1cz3.A05(c, true);
                    c1cz3.A07 = str;
                } else {
                    C1CZ c1cz4 = this.A01;
                    str = c1cz4.A05(c, false);
                    c1cz4.A07 = str;
                }
            }
            if (str != null) {
                C1CZ c1cz5 = this.A01;
                if (!c1cz5.A0G) {
                    i = c1cz5.A01;
                } else {
                    i = 0;
                    int i3 = 0;
                    while (i3 < c1cz5.A02 && i < c1cz5.A07.length()) {
                        if (c1cz5.A0B.charAt(i3) == c1cz5.A07.charAt(i)) {
                            i3++;
                        }
                        i++;
                    }
                }
                this.A02 = true;
                editable.replace(0, editable.length(), str, 0, str.length());
                if (str.equals(editable.toString())) {
                    Selection.setSelection(editable, i);
                }
                this.A02 = false;
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A02 && !this.A03) {
            if (i2 == 0 && charSequence.length() == i) {
                this.A00 = 1;
                return;
            }
            if (i3 == 0 && i + i2 == charSequence.length()) {
                if (i2 > 0) {
                    this.A00 = 0;
                    return;
                }
            } else if (i2 > 0 && !A00(charSequence, i, i2)) {
                this.A00 = 2;
                return;
            }
            this.A00 = 3;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A02 && !this.A03) {
            if (this.A00 == 3 && i3 > 0 && !A00(charSequence, i, i3)) {
                this.A00 = 2;
            }
            if (this.A00 == 1 && i3 > 0 && A00(charSequence, i, i3)) {
                this.A03 = true;
                this.A01.A07();
            } else if (this.A00 != 3) {
            } else {
                this.A03 = true;
                this.A01.A07();
            }
        }
    }
}
