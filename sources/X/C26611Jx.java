package X;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.whatsapp.CodeInputField;

/* renamed from: X.1Jx */
/* loaded from: classes.dex */
public class C26611Jx extends PasswordTransformationMethod {
    public C26621Jy A01;
    public Runnable A02;
    public final CodeInputField A04;
    public String A03 = "";
    public int A00 = -1;

    public C26611Jx(CodeInputField codeInputField) {
        this.A04 = codeInputField;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        if (this.A02 == null) {
            this.A02 = new Runnable() { // from class: X.1Fl
                {
                    C26611Jx.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C26611Jx c26611Jx = C26611Jx.this;
                    CodeInputField codeInputField = c26611Jx.A04;
                    codeInputField.setCode(codeInputField.getCode());
                    if (codeInputField.getHandler() != null && c26611Jx.A02 != null) {
                        codeInputField.getHandler().removeCallbacks(c26611Jx.A02);
                    }
                }
            };
        }
        if (this.A03.equals(editable.toString().replaceAll("[^0-9, ]", ""))) {
            return;
        }
        this.A03 = editable.toString().replaceAll("[^0-9, ]", "");
        this.A01.A00(editable);
        CodeInputField codeInputField = this.A04;
        if (codeInputField.getHandler() != null) {
            codeInputField.getHandler().removeCallbacks(this.A02);
            codeInputField.getHandler().postDelayed(this.A02, 1500L);
        }
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.beforeTextChanged(charSequence, i, i2, i3);
        CodeInputField codeInputField = this.A04;
        if (codeInputField.getHandler() != null && this.A02 != null) {
            codeInputField.getHandler().removeCallbacks(this.A02);
        }
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        C26621Jy c26621Jy = new C26621Jy(charSequence, this);
        this.A01 = c26621Jy;
        return c26621Jy;
    }
}
