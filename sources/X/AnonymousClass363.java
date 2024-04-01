package X;

/* renamed from: X.363  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass363 implements C2J2 {
    public long A00;
    public String A01;
    public final C44331yt A02;
    public final AnonymousClass012 A03;
    public final AnonymousClass011 A04;
    public final InterfaceC002901k A05;

    public AnonymousClass363(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C44331yt c44331yt) {
        this.A03 = anonymousClass012;
        this.A05 = interfaceC002901k;
        this.A04 = anonymousClass011;
        this.A02 = c44331yt;
    }

    @Override // X.C2J2
    public void AG4(int i) {
        long j = this.A00;
        this.A05.AS1(new RunnableC57522pY(this, this.A01, i, j, -1L));
    }

    @Override // X.C2J2
    public void AG5(int i, long j) {
        long j2 = this.A00;
        this.A05.AS1(new RunnableC57522pY(this, this.A01, i, j2, j));
    }

    @Override // X.C2J2
    public void AG7() {
        long j = this.A00;
        this.A05.AS1(new RunnableC57522pY(this, this.A01, 4, j, 0L));
    }

    @Override // X.C2J2
    public void ANk(String str) {
        this.A00 = this.A03.A05() / 1000;
        this.A01 = str;
    }
}
