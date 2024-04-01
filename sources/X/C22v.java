package X;

import android.os.SystemClock;

/* renamed from: X.22v */
/* loaded from: classes2.dex */
public class C22v {
    public C0KY A03;
    public C456422x A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C04140Is A0C;
    public final C43121wt A0D;
    public final InterfaceC002901k A0E;
    public final boolean A0F;
    public long A01 = -1;
    public long A02 = -1;
    public int A00 = 0;
    public final long A0B = SystemClock.uptimeMillis();

    public C22v(InterfaceC002901k interfaceC002901k, C43121wt c43121wt, C04140Is c04140Is, boolean z) {
        this.A0E = interfaceC002901k;
        this.A0D = c43121wt;
        this.A0C = c04140Is;
        this.A0F = z;
    }

    public synchronized int A00() {
        return this.A00;
    }

    public final void A01() {
        C04140Is c04140Is = this.A0C;
        long j = this.A01;
        c04140Is.A06 += j - this.A0B;
        long j2 = this.A02;
        if (j2 != -1) {
            c04140Is.A07 += j - j2;
        }
        this.A0E.AS1(new RunnableEBaseShape3S0100000_I0_3(this, 45));
    }

    public synchronized void A02() {
        this.A02 = SystemClock.uptimeMillis();
    }

    public synchronized void A03(int i) {
        this.A00 = i;
    }
}
