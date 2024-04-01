package X;

/* renamed from: X.0R9 */
/* loaded from: classes.dex */
public abstract class C0R9 extends C0L1 {
    public final C01B A00;
    public final C0EL A01;
    public final C000400f A02;
    public final C04000Ia A03;
    public final C0IY A04;

    public C0R9(C0EL c0el, C01B c01b, C0IY c0iy, C000400f c000400f, C04000Ia c04000Ia) {
        super(null);
        this.A01 = c0el;
        this.A00 = c01b;
        this.A04 = c0iy;
        this.A02 = c000400f;
        this.A03 = c04000Ia;
    }

    @Override // X.C0L1
    public InterfaceC63142zC A02(Object obj, C0L2 c0l2) {
        C63172zG c63172zG = (C63172zG) obj;
        return new C3GA(this.A01, this.A00, this.A04, this.A03, new C63162zF(c63172zG.A01, new C3GC(this.A02, c63172zG.A02)), c0l2, new C63132zB(c63172zG.A00.A00));
    }
}
