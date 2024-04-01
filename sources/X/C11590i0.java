package X;

import java.util.Arrays;

/* renamed from: X.0i0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11590i0 {
    public final int A00;
    public final CharSequence A01;

    public C11590i0(int i, CharSequence charSequence) {
        this.A00 = i;
        this.A01 = charSequence;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj instanceof C11590i0) {
            C11590i0 c11590i0 = (C11590i0) obj;
            if (this.A00 == c11590i0.A00) {
                CharSequence charSequence = c11590i0.A01;
                CharSequence charSequence2 = this.A01;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                } else {
                    str = null;
                }
                if (charSequence != null) {
                    str2 = charSequence.toString();
                } else {
                    str2 = null;
                }
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.A00);
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        objArr[1] = str;
        return Arrays.hashCode(objArr);
    }
}
