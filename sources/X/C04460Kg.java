package X;

import android.text.TextUtils;

/* renamed from: X.0Kg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04460Kg {
    public final long A00;
    public final String A01;

    public C04460Kg(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C04460Kg.class) {
            return false;
        }
        C04460Kg c04460Kg = (C04460Kg) obj;
        return this.A00 == c04460Kg.A00 && TextUtils.equals(this.A01, c04460Kg.A01);
    }

    public int hashCode() {
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.A01;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(":");
        sb.append(AnonymousClass024.A0J(this.A01, 4));
        return sb.toString();
    }
}
