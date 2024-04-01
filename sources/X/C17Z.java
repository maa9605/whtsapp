package X;

import android.os.SystemClock;

/* renamed from: X.17Z  reason: invalid class name */
/* loaded from: classes.dex */
public final class C17Z {
    public long A00;
    public final InterfaceC232215r A01;

    public C17Z(InterfaceC232215r interfaceC232215r) {
        C07K.A1P(interfaceC232215r);
        this.A01 = interfaceC232215r;
    }

    public final void A00() {
        if (this.A01 != null) {
            this.A00 = SystemClock.elapsedRealtime();
            return;
        }
        throw null;
    }

    public final boolean A01(long j) {
        long j2 = this.A00;
        if (j2 == 0) {
            return true;
        }
        if (this.A01 != null) {
            return SystemClock.elapsedRealtime() - j2 > j;
        }
        throw null;
    }
}
