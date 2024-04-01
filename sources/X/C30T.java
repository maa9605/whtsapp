package X;

/* renamed from: X.30T  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C30T {
    public boolean A01 = false;
    public float A00 = 1.0f;

    public float A00() {
        if (this.A01) {
            return (Math.abs(this.A00) / 4.0f) + 0.75f;
        }
        return 1.0f;
    }

    public void A01() {
        this.A01 = false;
        this.A00 = 1.0f;
    }
}
