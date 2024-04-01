package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.0cp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09190cp implements InputFilter {
    public final int A00;

    public C09190cp(int i) {
        this.A00 = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int A02 = C43981yK.A02(spanned, 0, spanned.length());
        int A022 = C43981yK.A02(spanned, i3, i4);
        int A023 = C43981yK.A02(charSequence, i, i2);
        int i5 = (this.A00 - A02) + A022;
        if (i5 <= 0) {
            return "";
        }
        if (i5 >= A023) {
            return null;
        }
        return C002701i.A0c(charSequence, i, i2, i5);
    }
}
