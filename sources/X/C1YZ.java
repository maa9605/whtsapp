package X;

/* renamed from: X.1YZ  reason: invalid class name */
/* loaded from: classes.dex */
public class C1YZ {
    public C20540xh A00;
    public C08T A01;
    public boolean A02;
    public final C08P A03;
    public final C1YW A04;

    public C1YZ(C08P c08p) {
        this.A03 = c08p;
        this.A04 = new C1YW(c08p);
    }

    public void A00(C08T c08t) {
        if (this.A01 == c08t) {
            return;
        }
        if (c08t == null) {
            this.A04.A01();
        }
        this.A01 = c08t;
        this.A03.requestLayout();
    }
}
