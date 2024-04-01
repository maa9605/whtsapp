package X;

/* renamed from: X.0C7  reason: invalid class name */
/* loaded from: classes.dex */
public class C0C7 {
    public static volatile C0C7 A02;
    public final C05W A00;
    public final C0F0 A01;

    public C0C7(C05W c05w, C0F0 c0f0) {
        this.A00 = c05w;
        this.A01 = c0f0;
    }

    public static C0C7 A00() {
        if (A02 == null) {
            synchronized (C0C7.class) {
                if (A02 == null) {
                    A02 = new C0C7(C05W.A00(), C0F0.A00());
                }
            }
        }
        return A02;
    }

    public C06C A01(C07F c07f, String str) {
        try {
            C06C A09 = this.A00.A09(AbstractC005302j.A01(this.A01.A03(c07f, str)));
            if (A09 != null) {
                return A09;
            }
            throw new SecurityException("Invalid contact ID");
        } catch (C011305p e) {
            throw new SecurityException(e);
        }
    }
}
