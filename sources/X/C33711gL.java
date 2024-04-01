package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: X.1gL */
/* loaded from: classes.dex */
public class C33711gL implements InterfaceC017307z {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A06;
    public ColorStateList A07;
    public Parcelable A09;
    public TextWatcher A0A;
    public TextWatcher A0B;
    public EditText A0C;
    public C1E3 A0D;
    public String A0E;
    public int A05 = -1;
    public Rect A08 = new Rect();

    public C33711gL(String str) {
        this.A0E = str;
    }

    @Override // X.InterfaceC017307z
    public boolean ASi(AnonymousClass087 anonymousClass087, AnonymousClass084 anonymousClass084, InterfaceC020509l interfaceC020509l) {
        if (AnonymousClass088.A20(anonymousClass084, C25151Eg.A0F)) {
            String str = (String) AnonymousClass088.A0q(interfaceC020509l);
            this.A0E = str;
            EditText editText = this.A0C;
            if (editText != null) {
                TextWatcher textWatcher = this.A0B;
                if (textWatcher != null) {
                    editText.removeTextChangedListener(textWatcher);
                }
                TextWatcher textWatcher2 = this.A0A;
                if (textWatcher2 != null) {
                    this.A0C.removeTextChangedListener(textWatcher2);
                }
                int length = this.A0C.getText().length() - this.A0C.getSelectionEnd();
                boolean z = this.A0C.getSelectionEnd() == 0;
                this.A0C.setText(str);
                if (!z) {
                    EditText editText2 = this.A0C;
                    int length2 = str.length();
                    editText2.setSelection(Math.min(length2 - length, length2));
                }
                TextWatcher textWatcher3 = this.A0B;
                if (textWatcher3 != null) {
                    this.A0C.addTextChangedListener(textWatcher3);
                }
                TextWatcher textWatcher4 = this.A0A;
                if (textWatcher4 != null) {
                    this.A0C.addTextChangedListener(textWatcher4);
                }
            }
            return true;
        }
        return false;
    }
}
