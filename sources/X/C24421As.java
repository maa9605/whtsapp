package X;

/* renamed from: X.1As  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24421As extends C39321pw implements Comparable {
    public long A00;

    public C24421As() {
    }

    public C24421As(C11C c11c) {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C24421As c24421As = (C24421As) obj;
        boolean A01 = A01();
        if (A01 != c24421As.A01()) {
            return A01 ? 1 : -1;
        }
        long j = ((C1ZK) this).A00 - ((C1ZK) c24421As).A00;
        if (j == 0) {
            j = this.A00 - c24421As.A00;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
