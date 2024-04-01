package X;

import java.lang.ref.WeakReference;

/* renamed from: X.3YD  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3YD implements Comparable {
    public final int A00;
    public final long A01;
    public final C3YB A02;
    public final WeakReference A03;

    public C3YD(C3YB c3yb, int i, long j, C44111yX c44111yX) {
        this.A02 = c3yb;
        this.A01 = j;
        this.A00 = i;
        this.A03 = new WeakReference(c44111yX);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C3YD c3yd = (C3YD) obj;
        if (c3yd != null) {
            long j = this.A01;
            long j2 = c3yd.A01;
            if (j >= j2) {
                return j == j2 ? 0 : 1;
            }
            return -1;
        }
        return -1;
    }
}
