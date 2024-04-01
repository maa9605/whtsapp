package X;

/* renamed from: X.1uc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41851uc {
    public static volatile C41851uc A09;
    public boolean A00;
    public final C0EL A01;
    public final AnonymousClass012 A02;
    public final C0XZ A03;
    public final C03Y A04;
    public final C03X A05;
    public final C03Z A06;
    public final AnonymousClass035 A07;
    public final C004902f A08;

    public C41851uc(AnonymousClass012 anonymousClass012, C004902f c004902f, C0EL c0el, C03Z c03z, C03X c03x, AnonymousClass035 anonymousClass035, C0XZ c0xz, C03Y c03y) {
        this.A08 = c004902f;
        this.A06 = c03z;
        this.A01 = c0el;
        this.A02 = anonymousClass012;
        this.A05 = c03x;
        this.A07 = anonymousClass035;
        this.A03 = c0xz;
        this.A04 = c03y;
    }

    public static C41851uc A00() {
        if (A09 == null) {
            synchronized (C41851uc.class) {
                if (A09 == null) {
                    A09 = new C41851uc(AnonymousClass012.A00(), C004902f.A00(), C0EL.A00(), C03Z.A00(), C03W.A00(), AnonymousClass035.A00(), C0XZ.A00(), C03Y.A00());
                }
            }
        }
        return A09;
    }
}
