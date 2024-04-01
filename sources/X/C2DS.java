package X;

import android.text.TextUtils;

/* renamed from: X.2DS  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2DS {
    public final CharSequence A00;
    public final CharSequence A01;

    public C2DS(CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2DS.class != obj.getClass()) {
            return false;
        }
        C2DS c2ds = (C2DS) obj;
        return TextUtils.equals(this.A00, c2ds.A00) && TextUtils.equals(this.A01, c2ds.A01);
    }

    public int hashCode() {
        CharSequence charSequence = this.A00;
        int hashCode = ((charSequence != null ? charSequence.hashCode() : 0) + 0) * 31;
        CharSequence charSequence2 = this.A01;
        return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }
}
