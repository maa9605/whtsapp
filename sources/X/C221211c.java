package X;

import android.text.TextUtils;

/* renamed from: X.11c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C221211c {
    public final int A00;
    public final int A01;
    public final String A02;

    public C221211c(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C221211c.class != obj.getClass()) {
            return false;
        }
        C221211c c221211c = (C221211c) obj;
        return this.A00 == c221211c.A00 && this.A01 == c221211c.A01 && TextUtils.equals(this.A02, c221211c.A02);
    }

    public int hashCode() {
        int i = ((this.A00 * 31) + this.A01) * 31;
        String str = this.A02;
        return i + (str != null ? str.hashCode() : 0);
    }
}
