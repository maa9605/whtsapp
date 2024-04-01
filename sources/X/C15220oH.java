package X;

import android.util.SparseArray;

/* renamed from: X.0oH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15220oH {
    public SparseArray A01 = new SparseArray();
    public int A00 = 0;

    public final C15210oG A00(int i) {
        SparseArray sparseArray = this.A01;
        C15210oG c15210oG = (C15210oG) sparseArray.get(i);
        if (c15210oG == null) {
            C15210oG c15210oG2 = new C15210oG();
            sparseArray.put(i, c15210oG2);
            return c15210oG2;
        }
        return c15210oG;
    }
}
