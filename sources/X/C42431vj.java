package X;

/* renamed from: X.1vj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42431vj {
    public static volatile C42431vj A01;
    public C05E A00;

    public C42431vj(C05E c05e) {
        this.A00 = c05e;
    }

    public static C42431vj A00() {
        if (A01 == null) {
            synchronized (C42431vj.class) {
                if (A01 == null) {
                    A01 = new C42431vj(C05E.A00());
                }
            }
        }
        return A01;
    }

    public Long A01() {
        C05E c05e = this.A00;
        c05e.A05();
        if (c05e.A07.exists()) {
            return Long.valueOf(this.A00.A02());
        }
        return null;
    }
}
