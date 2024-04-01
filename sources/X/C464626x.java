package X;

/* renamed from: X.26x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C464626x {
    public static volatile C464626x A08;
    public final C0E6 A00;
    public final AnonymousClass012 A01;
    public final C0C9 A02;
    public final C0GZ A03;
    public final C0EU A04;
    public final C463026g A05;
    public final C0DW A06;
    public final C07A A07;

    public C464626x(AnonymousClass012 anonymousClass012, C0E6 c0e6, C0C9 c0c9, C0EU c0eu, C0GZ c0gz, C07A c07a, C463026g c463026g, C0DW c0dw) {
        this.A01 = anonymousClass012;
        this.A00 = c0e6;
        this.A02 = c0c9;
        this.A04 = c0eu;
        this.A03 = c0gz;
        this.A07 = c07a;
        this.A05 = c463026g;
        this.A06 = c0dw;
    }

    public static C464626x A00() {
        if (A08 == null) {
            synchronized (C464626x.class) {
                if (A08 == null) {
                    A08 = new C464626x(AnonymousClass012.A00(), C0E6.A00(), C0C9.A00(), C0EU.A00(), C0GZ.A00(), C07A.A01(), C463026g.A00(), C0DW.A00());
                }
            }
        }
        return A08;
    }
}
