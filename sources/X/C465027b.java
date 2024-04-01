package X;

/* renamed from: X.27b  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C465027b {
    public int A00;
    public long A01;
    public String A02;
    public boolean A03;

    public C465027b(String str, boolean z, int i, long j) {
        if (str != null && (i == 1 || i == 2 || i == 3 || i == 4)) {
            this.A02 = str;
            this.A00 = i;
            this.A01 = j;
            this.A03 = z;
            return;
        }
        throw new IllegalArgumentException("invalid web status");
    }
}
