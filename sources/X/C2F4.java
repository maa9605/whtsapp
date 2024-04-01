package X;

import java.io.File;

/* renamed from: X.2F4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2F4 extends C0R9 {
    public final C2F5 A00;
    public final File A01;

    public C2F4(C0EL c0el, C01B c01b, C0IY c0iy, C000400f c000400f, C04000Ia c04000Ia, C2F5 c2f5, File file) {
        super(c0el, c01b, c0iy, c000400f, c04000Ia);
        this.A00 = c2f5;
        this.A01 = file;
    }

    @Override // X.C0L1
    public C43211x2 A00(C04020Ic c04020Ic) {
        return new C43211x2();
    }

    @Override // X.C0L1
    public Object A03() {
        C2F5 c2f5 = this.A00;
        return new C63172zG(new C38011nP(c2f5.A01, c2f5.A00), this.A01, C0DC.A07);
    }
}
