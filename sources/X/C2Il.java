package X;

import android.os.SystemClock;

/* renamed from: X.2Il */
/* loaded from: classes2.dex */
public class C2Il implements InterfaceC49112In {
    public final /* synthetic */ C2L4 A00;
    public final /* synthetic */ C29X A01;

    public C2Il(C29X c29x, C2L4 c2l4) {
        this.A01 = c29x;
        this.A00 = c2l4;
    }

    @Override // X.InterfaceC49112In
    public void AHd(float f, float f2) {
        C018508q c018508q = this.A01.A0s;
        c018508q.A02.post(new RunnableEBaseShape0S0100002_I0(this, f, f2, 0));
    }

    @Override // X.InterfaceC49112In
    public void AHe(boolean z) {
        C018508q c018508q = this.A01.A0s;
        c018508q.A02.post(new RunnableEBaseShape0S0110000_I0(this, z, 0));
    }

    @Override // X.InterfaceC49112In
    public void AI9(int i) {
        C018508q c018508q = this.A01.A0s;
        c018508q.A02.post(new RunnableEBaseShape0S0101000_I0(this, i, 1));
    }

    @Override // X.InterfaceC49112In
    public void ANK() {
        long j;
        C29X c29x = this.A01;
        if (c29x.A0i) {
            C2Lp c2Lp = c29x.A0x;
            InterfaceC471629w interfaceC471629w = c29x.A0N;
            Integer valueOf = Integer.valueOf(interfaceC471629w.getCameraApi());
            int cameraType = interfaceC471629w.getCameraType();
            if (c2Lp != null) {
                C36671lB c36671lB = new C36671lB();
                c36671lB.A02 = Long.valueOf(SystemClock.elapsedRealtime() - c2Lp.A03);
                c36671lB.A01 = Integer.valueOf(cameraType);
                c36671lB.A00 = valueOf;
                c2Lp.A00(c36671lB);
                c29x.A0i = false;
            } else {
                throw null;
            }
        } else {
            C2Lp c2Lp2 = c29x.A0x;
            boolean z = c29x.A0h;
            InterfaceC471629w interfaceC471629w2 = c29x.A0N;
            Integer valueOf2 = Integer.valueOf(interfaceC471629w2.getCameraApi());
            int cameraType2 = interfaceC471629w2.getCameraType();
            if (c2Lp2 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (z) {
                    j = c2Lp2.A01;
                } else {
                    j = c2Lp2.A02;
                }
                c2Lp2.A01 = 0L;
                c2Lp2.A02 = 0L;
                if (j != 0) {
                    int intValue = valueOf2.intValue();
                    int i = !z ? 1 : 0;
                    C36691lD c36691lD = new C36691lD();
                    c36691lD.A02 = Integer.valueOf(i);
                    c36691lD.A03 = Long.valueOf(elapsedRealtime - j);
                    c36691lD.A01 = Integer.valueOf(cameraType2);
                    c36691lD.A00 = Integer.valueOf(intValue);
                    c2Lp2.A00(c36691lD);
                }
            } else {
                throw null;
            }
        }
        c29x.A0h = false;
        C018508q c018508q = c29x.A0s;
        c018508q.A02.post(new RunnableEBaseShape0S0200000_I0_0(this, this.A00, 32));
    }

    @Override // X.InterfaceC49112In
    public void ANU(C1D9 c1d9) {
        String str = c1d9.A01;
        C29X c29x = this.A01;
        if (c29x.A0X.A02(str, true, 1)) {
            return;
        }
        C018508q c018508q = c29x.A0s;
        c018508q.A02.post(new RunnableEBaseShape1S0100000_I0_1(this, 0));
    }

    @Override // X.InterfaceC49112In
    public void AQI() {
        C2Lp c2Lp = this.A01.A0x;
        if (c2Lp == null) {
            throw null;
        }
        c2Lp.A04 = SystemClock.elapsedRealtime() - c2Lp.A05;
    }
}
