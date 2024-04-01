package X;

/* renamed from: X.0kV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13040kV {
    public int A00;
    public final Object[] A01;

    public C13040kV(int i) {
        if (i > 0) {
            this.A01 = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object A00() {
        int i = this.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.A01;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.A00 = i2;
            return obj;
        }
        return null;
    }

    public boolean A01(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.A00;
            if (i < i2) {
                if (this.A01[i] == obj) {
                    throw new IllegalStateException("Already in the pool!");
                }
                i++;
            } else {
                Object[] objArr = this.A01;
                if (i2 < objArr.length) {
                    objArr[i2] = obj;
                    this.A00 = i2 + 1;
                    return true;
                }
                return false;
            }
        }
    }
}
