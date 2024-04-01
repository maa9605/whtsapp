package X;

/* renamed from: X.00R  reason: invalid class name */
/* loaded from: classes.dex */
public class C00R extends C00S {
    public final AnonymousClass008 A00;
    public final C00A A01;
    public final C00B A02;
    public final C00C A03;
    public final C00D A04;

    @Override // X.C00U
    public void ALb() {
    }

    public C00R(AnonymousClass008 anonymousClass008, C00A c00a, C00B c00b, C00C c00c, C00D c00d) {
        this.A00 = anonymousClass008;
        this.A01 = c00a;
        this.A02 = c00b;
        this.A03 = c00c;
        this.A04 = c00d;
    }

    @Override // X.C00T
    public void A08(AnonymousClass092 anonymousClass092, int i) {
        if (this.A03.A01() && anonymousClass092.A0n.A02 && !anonymousClass092.A0g && !this.A02.A04()) {
            for (C07G c07g : this.A04.A00()) {
                c07g.A00();
            }
        }
    }

    @Override // X.C00T
    public void A0C(AnonymousClass092 anonymousClass092, int i) {
        if (this.A03.A01()) {
            for (C07G c07g : this.A04.A00()) {
                c07g.A04(anonymousClass092);
            }
        }
    }

    @Override // X.C00U
    public void ALc() {
        if (this.A03.A01()) {
            this.A04.A01();
        }
    }
}
