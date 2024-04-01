package X;

/* renamed from: X.1xK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43391xK {
    public static volatile C43391xK A08;
    public final AbstractC000600i A00;
    public final C01B A01;
    public final C003701t A02;
    public final C04000Ia A03;
    public final C0J3 A04;
    public final C43371xI A05;
    public final C0HW A06;
    public final C05Y A07;

    public C43391xK(C003701t c003701t, AbstractC000600i abstractC000600i, C0HW c0hw, C01B c01b, C05Y c05y, C43371xI c43371xI, C04000Ia c04000Ia, C0J3 c0j3) {
        this.A02 = c003701t;
        this.A00 = abstractC000600i;
        this.A06 = c0hw;
        this.A01 = c01b;
        this.A07 = c05y;
        this.A05 = c43371xI;
        this.A03 = c04000Ia;
        this.A04 = c0j3;
    }

    public static C43391xK A00() {
        if (A08 == null) {
            synchronized (C43391xK.class) {
                if (A08 == null) {
                    A08 = new C43391xK(C003701t.A00(), AbstractC000600i.A00(), C0HW.A00(), C01B.A00(), C05Y.A01(), C43371xI.A00(), C04000Ia.A00(), C0J3.A00());
                }
            }
        }
        return A08;
    }

    public C43721xr A01(C0J7 c0j7, String str, C43711xq c43711xq, byte b, int i, int i2) {
        return new C43721xr(this.A02, this.A00, this.A06, this.A01, this.A07, this.A05, this.A03, this.A04, c0j7, str, c43711xq, b, i, i2);
    }
}
