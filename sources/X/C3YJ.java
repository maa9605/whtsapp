package X;

/* renamed from: X.3YJ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3YJ {
    public final int A00;
    public final String A01;

    public C3YJ(int i, AbstractC461525e abstractC461525e) {
        this.A00 = i;
        this.A01 = abstractC461525e.getId();
    }

    public C3YJ(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public boolean A00(int i) {
        if (!(this instanceof C82913rH)) {
            return i == this.A00;
        }
        int i2 = this.A00;
        return i >= i2 && i < i2 + 4;
    }
}
