package X;

/* renamed from: X.1TY  reason: invalid class name */
/* loaded from: classes.dex */
public class C1TY implements InterfaceC13610lX {
    public int A00;
    public final C02820Cz A01;
    public final boolean A02;

    public C1TY(C02820Cz c02820Cz, boolean z) {
        this.A02 = z;
        this.A01 = c02820Cz;
    }

    public void A00() {
        C0XM c0xm;
        boolean z = this.A00 > 0;
        C02820Cz c02820Cz = this.A01;
        AbstractC02800Cx abstractC02800Cx = c02820Cz.A02;
        for (C0BA c0ba : abstractC02800Cx.A0Q.A04()) {
            c0ba.A0R(null);
            if (z && (c0xm = c0ba.A0C) != null && c0xm.A0C) {
                c0ba.A0K();
            }
        }
        abstractC02800Cx.A0P(c02820Cz, this.A02, !z, true);
    }
}
