package X;

/* renamed from: X.2Ap  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47282Ap {
    public static volatile C47282Ap A03;
    public final C03020Dv A00;
    public final AnonymousClass011 A01;
    public final C010605h A02;

    public C47282Ap(AnonymousClass011 anonymousClass011, C03020Dv c03020Dv, C010605h c010605h) {
        this.A01 = anonymousClass011;
        this.A00 = c03020Dv;
        this.A02 = c010605h;
    }

    public static C47282Ap A00() {
        if (A03 == null) {
            synchronized (C47282Ap.class) {
                if (A03 == null) {
                    A03 = new C47282Ap(AnonymousClass011.A00(), C03020Dv.A00(), C010605h.A03);
                }
            }
        }
        return A03;
    }

    public final void A01(int i, long j, int i2, int i3, boolean z, boolean z2, int i4) {
        C0QQ c0qq = new C0QQ();
        c0qq.A07 = Long.valueOf(j);
        c0qq.A03 = Integer.valueOf(i);
        c0qq.A06 = Long.valueOf(i3);
        c0qq.A04 = Integer.valueOf(i2);
        if (this.A00.A00) {
            c0qq.A02 = 1;
        } else {
            c0qq.A02 = 2;
        }
        c0qq.A01 = Boolean.valueOf(this.A02.A03());
        c0qq.A00 = Boolean.valueOf(z);
        c0qq.A08 = Long.valueOf(i4);
        if (z2) {
            c0qq.A05 = 0;
        } else {
            c0qq.A05 = 1;
        }
        this.A01.A0B(c0qq, null, false);
    }

    public void A02(int i, long j, long j2, long j3) {
        C0QR c0qr = new C0QR();
        c0qr.A02 = Integer.valueOf(i);
        c0qr.A03 = Long.valueOf(j);
        c0qr.A05 = Long.valueOf(j2);
        c0qr.A04 = Long.valueOf(j3);
        if (this.A00.A00) {
            c0qr.A01 = 1;
        } else {
            c0qr.A01 = 2;
        }
        c0qr.A00 = Boolean.valueOf(this.A02.A03());
        this.A01.A0B(c0qr, null, false);
    }
}
