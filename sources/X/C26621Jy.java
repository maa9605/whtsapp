package X;

import android.text.Spannable;
import com.whatsapp.CodeInputField;

/* renamed from: X.1Jy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C26621Jy implements CharSequence, Spannable {
    public Spannable A00;
    public long[] A01;
    public final C26611Jx A02;

    public C26621Jy(CharSequence charSequence, C26611Jx c26611Jx) {
        this.A02 = c26611Jx;
        this.A00 = (Spannable) charSequence;
        A00(charSequence);
    }

    public void A00(CharSequence charSequence) {
        long[] jArr;
        int i;
        this.A01 = new long[charSequence.length()];
        int i2 = 0;
        int i3 = -1;
        while (true) {
            jArr = this.A01;
            if (i2 >= jArr.length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            CodeInputField codeInputField = this.A02.A04;
            if (charAt == codeInputField.A01 || charSequence.charAt(i2) == 160) {
                this.A01[i2] = -1;
            } else {
                long[] jArr2 = this.A01;
                jArr2[i2] = System.currentTimeMillis();
                int i4 = i2 + 1;
                if (i4 < jArr2.length) {
                    if (charSequence.charAt(i4) == 160) {
                        i4++;
                    }
                    if (i4 < this.A01.length && charSequence.charAt(i4) == codeInputField.A01) {
                        i3 = i2;
                    }
                }
            }
            i2++;
        }
        if (i3 != -1 && (((i = this.A02.A00) != -1 && i < i3) || (i3 == 0 && i == -1))) {
            jArr[i3] = -1;
        }
        this.A02.A00 = i3;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        long[] jArr = this.A01;
        if (i < jArr.length && jArr[i] == -1) {
            jArr[i] = System.currentTimeMillis() + 1500;
        }
        char charAt = this.A00.charAt(i);
        long[] jArr2 = this.A01;
        if (i >= jArr2.length || System.currentTimeMillis() >= jArr2[i]) {
            CodeInputField codeInputField = this.A02.A04;
            return (charAt == codeInputField.A01 || charAt == 160) ? charAt : codeInputField.A00;
        }
        return charAt;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.A00.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.A00.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.A00.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        return this.A00.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.A00.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.A00.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        this.A00.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        this.A00.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.A00.subSequence(i, i2);
    }
}
