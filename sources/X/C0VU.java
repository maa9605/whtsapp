package X;

/* renamed from: X.0VU */
/* loaded from: classes.dex */
public final class C0VU extends C0VS {
    public volatile Object A00 = new C41111tO();
    public final /* synthetic */ C02950Dn A01;

    public C0VU(C02950Dn c02950Dn) {
        this.A01 = c02950Dn;
    }

    @Override // X.C0VS
    public C0VT A00() {
        return new C0VT(this);
    }

    @Override // X.C0VS
    public C2Lm A01() {
        Object obj;
        Object obj2 = this.A00;
        if (obj2 instanceof C41111tO) {
            synchronized (obj2) {
                obj = this.A00;
                if (obj instanceof C41111tO) {
                    obj = new C2Lm();
                    C41161tT.A01(this.A00, obj);
                    this.A00 = obj;
                }
            }
            obj2 = obj;
        }
        return (C2Lm) obj2;
    }
}
