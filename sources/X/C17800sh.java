package X;

/* renamed from: X.0sh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17800sh {
    public int A00;
    public long A01;

    public C17800sh(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public static C17800sh A00(String str, int i, int i2) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + (charAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C17800sh(j, i3);
    }
}
