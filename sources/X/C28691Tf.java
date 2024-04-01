package X;

/* renamed from: X.1Tf */
/* loaded from: classes.dex */
public class C28691Tf extends C0MU {
    public static final C0CR A02 = new C28681Te();
    public C07270Xo A00 = new C07270Xo(10);
    public boolean A01 = false;

    @Override // X.C0MU
    public void A01() {
        int A00 = this.A00.A00();
        for (int i = 0; i < A00; i++) {
            C07270Xo c07270Xo = this.A00;
            if (c07270Xo.A01) {
                c07270Xo.A03();
            }
            ((C38531oO) c07270Xo.A03[i]).A0C(true);
        }
        C07270Xo c07270Xo2 = this.A00;
        int i2 = c07270Xo2.A00;
        Object[] objArr = c07270Xo2.A03;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        c07270Xo2.A00 = 0;
        c07270Xo2.A01 = false;
    }
}
