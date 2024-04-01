package X;

/* renamed from: X.09o  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C020809o {
    public final C0A2 A00;
    public final Object[] A01;

    public C020809o(C0A2 c0a2, Object[] objArr) {
        if (c0a2 != null) {
            this.A00 = c0a2;
            this.A01 = objArr;
            if (objArr != null && objArr.length <= 0) {
                throw new IllegalArgumentException("boundArgs must not be empty; use null");
            }
            return;
        }
        throw null;
    }
}
