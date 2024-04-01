package X;

import android.os.SystemClock;

/* renamed from: X.3ST  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3ST {
    public long A00;
    public long A01;
    public boolean A02;

    public void A00() {
        if (this.A02) {
            this.A00 = (SystemClock.elapsedRealtime() - this.A01) + this.A00;
            this.A01 = 0L;
            this.A02 = false;
        }
    }

    public void A01() {
        this.A00 = 0L;
        this.A01 = 0L;
        this.A02 = false;
    }

    public void A02() {
        this.A01 = SystemClock.elapsedRealtime();
        this.A02 = true;
    }

    public String toString() {
        return String.valueOf(this.A00);
    }
}
