package X;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: X.0mq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14370mq {
    public int A00;
    public int A01;
    public String A02;

    public C14370mq(Preference preference) {
        this.A02 = preference.getClass().getName();
        this.A00 = preference.A01;
        this.A01 = preference.A03;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14370mq) {
            C14370mq c14370mq = (C14370mq) obj;
            return this.A00 == c14370mq.A00 && this.A01 == c14370mq.A01 && TextUtils.equals(this.A02, c14370mq.A02);
        }
        return false;
    }

    public int hashCode() {
        return this.A02.hashCode() + ((((527 + this.A00) * 31) + this.A01) * 31);
    }
}
