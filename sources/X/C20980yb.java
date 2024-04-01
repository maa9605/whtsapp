package X;

/* renamed from: X.0yb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20980yb implements Comparable {
    public int A00;
    public long A01;
    public Object A02;
    public final C21160yt A03;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C20980yb c20980yb = (C20980yb) obj;
        Object obj2 = this.A02;
        if ((obj2 == null) != (c20980yb.A02 == null)) {
            return obj2 != null ? -1 : 1;
        } else if (obj2 != null) {
            int i = this.A00 - c20980yb.A00;
            if (i != 0) {
                return i;
            }
            long j = this.A01;
            long j2 = c20980yb.A01;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        } else {
            return 0;
        }
    }
}
