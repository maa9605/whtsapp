package X;

import android.text.TextUtils;

/* renamed from: X.10D  reason: invalid class name */
/* loaded from: classes.dex */
public final class C10D {
    public final String A00;
    public final boolean A01;

    public C10D(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C10D.class) {
            return false;
        }
        C10D c10d = (C10D) obj;
        return TextUtils.equals(this.A00, c10d.A00) && this.A01 == c10d.A01;
    }

    public int hashCode() {
        String str = this.A00;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.A01 ? 1231 : 1237);
    }
}
