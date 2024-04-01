package X;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import com.whatsapp.TextStatusComposerActivity;

/* renamed from: X.1jQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35611jQ extends C2JT {
    public boolean A00;
    public final /* synthetic */ TextStatusComposerActivity A01;

    public C35611jQ(TextStatusComposerActivity textStatusComposerActivity) {
        this.A01 = textStatusComposerActivity;
    }

    @Override // X.C2JT, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        for (UnderlineSpan underlineSpan : (UnderlineSpan[]) editable.getSpans(0, editable.length(), UnderlineSpan.class)) {
            editable.removeSpan(underlineSpan);
        }
        TextStatusComposerActivity textStatusComposerActivity = this.A01;
        AnonymousClass029.A18(textStatusComposerActivity, textStatusComposerActivity.A0G, textStatusComposerActivity.A0E, textStatusComposerActivity.A0U, editable, textStatusComposerActivity.A0T.getPaint(), 1.1f);
        String obj = editable.toString();
        boolean z = TextUtils.getTrimmedLength(obj) > 0;
        textStatusComposerActivity.A06.setEnabled(z);
        C02180Ae.A16(textStatusComposerActivity.A06, z, true);
        final String A01 = C04310Jr.A01(obj);
        String str = textStatusComposerActivity.A0Z;
        textStatusComposerActivity.A0Z = A01;
        Handler handler = textStatusComposerActivity.A0b;
        handler.removeCallbacks(textStatusComposerActivity.A0X);
        if (A01 != null && !A01.equals(textStatusComposerActivity.A0Y)) {
            textStatusComposerActivity.A0Y = null;
            if (!TextUtils.equals(str, A01)) {
                textStatusComposerActivity.A1S(C1Lh.A00(A01));
                if (textStatusComposerActivity.A0C == null) {
                    if (this.A00) {
                        C1Lh.A01(((ActivityC02290Ap) textStatusComposerActivity).A0A, textStatusComposerActivity.A0W, textStatusComposerActivity.A09, ((ActivityC02310Ar) textStatusComposerActivity).A01, A01, new InterfaceC26921Lg() { // from class: X.1hZ
                            @Override // X.InterfaceC26921Lg
                            public final void AMf(C05920Qu c05920Qu, boolean z2) {
                                C35611jQ.this.A01.A1S(c05920Qu);
                            }
                        });
                    } else {
                        Runnable runnable = new Runnable() { // from class: X.1Ij
                            @Override // java.lang.Runnable
                            public final void run() {
                                final C35611jQ c35611jQ = C35611jQ.this;
                                String str2 = A01;
                                TextStatusComposerActivity textStatusComposerActivity2 = c35611jQ.A01;
                                C1Lh.A01(((ActivityC02290Ap) textStatusComposerActivity2).A0A, textStatusComposerActivity2.A0W, textStatusComposerActivity2.A09, ((ActivityC02310Ar) textStatusComposerActivity2).A01, str2, new InterfaceC26921Lg() { // from class: X.1hY
                                    @Override // X.InterfaceC26921Lg
                                    public final void AMf(C05920Qu c05920Qu, boolean z2) {
                                        C35611jQ.this.A01.A1S(c05920Qu);
                                    }
                                });
                            }
                        };
                        textStatusComposerActivity.A0X = runnable;
                        handler.postDelayed(runnable, 700L);
                    }
                }
            }
        } else {
            textStatusComposerActivity.A1S(null);
        }
        if (TextStatusComposerActivity.A00(editable, 0, editable.length()) >= 700 && textStatusComposerActivity.A02 == 0) {
            int inputType = textStatusComposerActivity.A0T.getInputType();
            textStatusComposerActivity.A02 = inputType;
            if (inputType != 0) {
                textStatusComposerActivity.A0T.setInputType(inputType | 524288);
                textStatusComposerActivity.A0T.setText(obj);
                textStatusComposerActivity.A0T.setSelection(obj.length());
                return;
            }
            return;
        }
        int i = textStatusComposerActivity.A02;
        if (i == 0) {
            return;
        }
        textStatusComposerActivity.A0T.setInputType(i);
        textStatusComposerActivity.A02 = 0;
    }

    @Override // X.C2JT, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        boolean z = false;
        if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
            z = true;
        }
        this.A00 = z;
    }
}
