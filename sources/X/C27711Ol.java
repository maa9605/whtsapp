package X;

/* renamed from: X.1Ol  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27711Ol implements Comparable {
    public int A00;
    public long A01;

    public C27711Ol() {
    }

    public C27711Ol(C27701Ok c27701Ok) {
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public int compareTo(C27711Ol c27711Ol) {
        if (c27711Ol == this) {
            return 0;
        }
        long j = this.A00 - c27711Ol.A00;
        if (j == 0) {
            j = this.A01 - c27711Ol.A01;
        }
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A01);
        return sb.toString();
    }
}
