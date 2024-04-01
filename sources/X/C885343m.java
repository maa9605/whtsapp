package X;

import android.util.SparseArray;

/* renamed from: X.43m */
/* loaded from: classes3.dex */
public class C885343m {
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();
    public final SparseArray A02 = new SparseArray();

    public AnonymousClass455 A00(C44B c44b) {
        SparseArray sparseArray = this.A02;
        c44b.A01();
        return (AnonymousClass455) sparseArray.get(c44b.mCameraId);
    }

    public AbstractC885543o A01(C44B c44b) {
        SparseArray sparseArray = this.A00;
        c44b.A01();
        return (AbstractC885543o) sparseArray.get(c44b.mCameraId);
    }

    public AbstractC886243v A02(C44B c44b) {
        SparseArray sparseArray = this.A01;
        c44b.A01();
        return (AbstractC886243v) sparseArray.get(c44b.mCameraId);
    }
}
