package X;

/* renamed from: X.021  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass021 implements AnonymousClass005 {
    public final AnonymousClass020 A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public AnonymousClass021(AnonymousClass020 componentCreator) {
        this.A00 = componentCreator;
    }

    @Override // X.AnonymousClass005
    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C02950Dn(new C02940Dm(this.A00.A00));
                }
            }
        }
        return this.A02;
    }
}
