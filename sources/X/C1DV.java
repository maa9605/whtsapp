package X;

/* renamed from: X.1DV  reason: invalid class name */
/* loaded from: classes.dex */
public enum C1DV {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final C1DV[] A00;
    public final int bits;

    static {
        C1DV c1dv = L;
        C1DV c1dv2 = M;
        C1DV c1dv3 = Q;
        A00 = new C1DV[]{c1dv2, c1dv, H, c1dv3};
    }

    C1DV(int i) {
        this.bits = i;
    }
}
