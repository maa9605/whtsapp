package X;

import android.os.PowerManager;

/* renamed from: X.0Eg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03120Eg {
    public static volatile C03120Eg A02;
    public C09560eJ A00;
    public C09G A01;

    public static C03120Eg A00() {
        if (A02 == null) {
            synchronized (C03120Eg.class) {
                if (A02 == null) {
                    A02 = new C03120Eg();
                }
            }
        }
        return A02;
    }

    public synchronized C09560eJ A01() {
        return this.A00;
    }

    public void A02() {
        C09560eJ c09560eJ = this.A00;
        if (c09560eJ != null) {
            boolean z = true;
            c09560eJ.A0L = true;
            PowerManager.WakeLock wakeLock = c09560eJ.A0W;
            c09560eJ.A0T = (wakeLock == null || !wakeLock.isHeld()) ? false : false;
            c09560eJ.A0C();
        }
    }

    public void A03() {
        C09560eJ c09560eJ = this.A00;
        if (c09560eJ != null) {
            c09560eJ.A04();
        }
    }

    public void A04() {
        C09560eJ c09560eJ = this.A00;
        if (c09560eJ != null) {
            c09560eJ.A0L = false;
            if (c09560eJ.A0T) {
                c09560eJ.A0A();
            }
        }
    }

    public void A05() {
        C09560eJ c09560eJ = this.A00;
        if (c09560eJ != null) {
            c09560eJ.A05();
        }
    }

    public synchronized void A06() {
        this.A01 = null;
    }

    public synchronized void A07(C09560eJ c09560eJ) {
        this.A00 = c09560eJ;
        if (c09560eJ != null && c09560eJ.A0m) {
            this.A01 = c09560eJ.A0J;
        }
    }

    public boolean A08() {
        C09560eJ c09560eJ = this.A00;
        return c09560eJ != null && c09560eJ.A0K();
    }

    public boolean A09(AnonymousClass092 anonymousClass092) {
        C09560eJ c09560eJ = this.A00;
        return c09560eJ != null && c09560eJ.A0M(anonymousClass092);
    }
}
