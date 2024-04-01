package X;

/* renamed from: X.2rB */
/* loaded from: classes2.dex */
public class C58462rB {
    public C655237n A00;
    public String A01;
    public final C018708s A02;
    public final InterfaceC58452rA A03;
    public final AbstractC011205o A04;
    public final InterfaceC002901k A05;

    public C58462rB(InterfaceC002901k interfaceC002901k, C018708s c018708s, AbstractC011205o abstractC011205o, InterfaceC58452rA interfaceC58452rA) {
        this.A05 = interfaceC002901k;
        this.A02 = c018708s;
        this.A04 = abstractC011205o;
        this.A03 = interfaceC58452rA;
    }

    public void A00() {
        C655237n c655237n = this.A00;
        boolean z = c655237n == null;
        if (c655237n != null) {
            c655237n.A0A();
            this.A00 = null;
        }
        C655237n c655237n2 = new C655237n(this.A02, this, this.A04, z);
        this.A00 = c655237n2;
        this.A05.ARy(c655237n2, new Void[0]);
    }
}
