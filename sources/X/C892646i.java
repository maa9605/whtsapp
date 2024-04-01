package X;

import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;

/* renamed from: X.46i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C892646i implements InterfaceC017307z {
    public int A00;
    public int A01 = -1;
    public TextWatcher A02;
    public TextWatcher A03;
    public TextInputEditText A04;
    public String A05;
    public final C002301c A06;

    public C892646i(C002301c c002301c, String str) {
        this.A06 = c002301c;
        this.A05 = str;
    }

    @Override // X.InterfaceC017307z
    public boolean ASi(AnonymousClass087 anonymousClass087, AnonymousClass084 anonymousClass084, InterfaceC020509l interfaceC020509l) {
        int length;
        if (AnonymousClass088.A20(anonymousClass084, AnonymousClass466.A0I)) {
            this.A05 = (String) AnonymousClass088.A0q(interfaceC020509l);
            TextInputEditText textInputEditText = this.A04;
            if (textInputEditText != null) {
                TextWatcher textWatcher = this.A03;
                if (textWatcher != null) {
                    textInputEditText.removeTextChangedListener(textWatcher);
                }
                TextWatcher textWatcher2 = this.A02;
                if (textWatcher2 != null) {
                    this.A04.removeTextChangedListener(textWatcher2);
                }
                int length2 = this.A04.getText().length() - this.A04.getSelectionEnd();
                boolean z = this.A04.getSelectionEnd() == 0;
                this.A04.setText(this.A05);
                if (!z) {
                    if (length2 > 0 && length2 <= (length = this.A05.length())) {
                        this.A04.setSelection(Math.min(length - length2, length));
                    } else {
                        this.A04.setSelection(this.A05.length());
                    }
                }
                TextWatcher textWatcher3 = this.A03;
                if (textWatcher3 != null) {
                    this.A04.addTextChangedListener(textWatcher3);
                }
                TextWatcher textWatcher4 = this.A02;
                if (textWatcher4 != null) {
                    this.A04.addTextChangedListener(textWatcher4);
                }
            }
            return true;
        }
        return false;
    }
}
