package X;

/* renamed from: X.2Dk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48002Dk implements InterfaceC47992Dj {
    public final C0G2 A03;
    public final AnonymousClass012 A04;
    public boolean A01 = false;
    public long A00 = 0;
    public final long A02 = 5000;

    public C48002Dk(C0G2 c0g2, AnonymousClass012 anonymousClass012) {
        this.A04 = anonymousClass012;
        this.A03 = c0g2;
    }

    @Override // X.InterfaceC47992Dj
    public Integer A7B() {
        return 1;
    }

    @Override // X.InterfaceC47992Dj
    public synchronized boolean isValid() {
        boolean z;
        C0G3 c0g3;
        int i;
        long A04 = this.A04.A04();
        if (A04 - this.A00 < this.A02) {
            return this.A01;
        }
        this.A00 = A04;
        try {
            c0g3 = this.A03.A00;
            i = c0g3.A00;
        } catch (Exception unused) {
            this.A01 = false;
            z = false;
        }
        if ((i != 1 || c0g3.A01 > 0 || c0g3.A03 > 0 || c0g3.A02 != Integer.MIN_VALUE) && (!c0g3.A02() || i != 2)) {
            z = false;
            this.A01 = z;
            return z;
        }
        z = true;
        this.A01 = z;
        return z;
    }
}
