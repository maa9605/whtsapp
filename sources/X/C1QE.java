package X;

/* renamed from: X.1QE  reason: invalid class name */
/* loaded from: classes.dex */
public class C1QE implements Comparable {
    public final long A00;
    public final String A01;

    public C1QE(String str, long j) {
        this.A00 = j;
        this.A01 = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C1QE c1qe = (C1QE) obj;
        long j = this.A00;
        long j2 = c1qe.A00;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        return this.A01.compareTo(c1qe.A01);
    }
}
