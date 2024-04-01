package X;

/* renamed from: X.0Ds  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02990Ds {
    public static volatile C02990Ds A02;
    public final C0C9 A00;
    public final C0F0 A01;

    public C02990Ds(C0C9 c0c9, C0F0 c0f0) {
        this.A00 = c0c9;
        this.A01 = c0f0;
    }

    public static C02990Ds A00() {
        if (A02 == null) {
            synchronized (C02990Ds.class) {
                if (A02 == null) {
                    A02 = new C02990Ds(C0C9.A00(), C0F0.A00());
                }
            }
        }
        return A02;
    }
}
