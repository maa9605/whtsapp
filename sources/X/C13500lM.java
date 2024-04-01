package X;

/* renamed from: X.0lM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13500lM {
    public final long A00;
    public final long A01;

    public C13500lM(long j, long j2) {
        if (j2 == 0) {
            this.A00 = 1L;
            return;
        }
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append("/");
        sb.append(this.A00);
        return sb.toString();
    }
}
