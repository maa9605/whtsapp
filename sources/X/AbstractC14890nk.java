package X;

import android.util.SparseIntArray;

/* renamed from: X.0nk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14890nk {
    public final SparseIntArray A00 = new SparseIntArray();

    public abstract int A00(int i);

    public int A01(int i, int i2) {
        int A00 = A00(i);
        if (A00 == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int A002 = A00(i4);
            i3 += A002;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = A002;
            }
        }
        if (A00 + i3 <= i2) {
            return i3;
        }
        return 0;
    }
}
