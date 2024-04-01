package X;

import android.util.SparseIntArray;

/* renamed from: X.0vo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19670vo {
    public static final SparseIntArray A00 = new SparseIntArray(0);

    public static C19770vy A00() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min >> 2) * 3;
        } else {
            i = min >> 1;
        }
        return new C19770vy(0, i, A00, -1);
    }
}
