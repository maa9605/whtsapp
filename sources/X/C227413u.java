package X;

/* renamed from: X.13u */
/* loaded from: classes.dex */
public final class C227413u {
    public final AbstractC30501ag A00;
    public final C30521ai A01;
    public final String A02;

    public C227413u(String str, AbstractC30501ag abstractC30501ag, C30521ai c30521ai) {
        C07K.A1Q(abstractC30501ag, "Cannot construct an Api with a null ClientBuilder");
        C07K.A1Q(c30521ai, "Cannot construct an Api with a null ClientKey");
        this.A02 = str;
        this.A00 = abstractC30501ag;
        this.A01 = c30521ai;
    }

    public final C227213r A00() {
        C30521ai c30521ai = this.A01;
        if (c30521ai != null) {
            return c30521ai;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
