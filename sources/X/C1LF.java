package X;

import android.text.GetChars;
import android.text.Spannable;
import android.text.SpannableString;

/* renamed from: X.1LF  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LF implements CharSequence, Spannable, GetChars {
    public SpannableString A00;

    public C1LF(CharSequence charSequence) {
        this.A00 = new SpannableString(charSequence);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        if (i >= 0 && i < length()) {
            return this.A00.charAt(i);
        }
        return ' ';
    }

    @Override // android.text.GetChars
    public void getChars(int i, int i2, char[] cArr, int i3) {
        int length;
        if (i2 >= i && i <= (length = length()) && i2 <= length && i >= 0 && i2 >= 0) {
            this.A00.getChars(i, i2, cArr, i3);
        }
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

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.A00.toString();
    }
}
