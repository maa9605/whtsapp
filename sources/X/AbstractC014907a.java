package X;

/* renamed from: X.07a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC014907a implements C07X {
    public final C0Wq A00;

    public abstract boolean A00();

    public AbstractC014907a(C0Wq c0Wq) {
        this.A00 = c0Wq;
    }

    public boolean A01(CharSequence charSequence, int i) {
        if (i >= 0 && charSequence.length() - i >= 0) {
            C0Wq c0Wq = this.A00;
            if (c0Wq == null) {
                return A00();
            }
            int A65 = c0Wq.A65(charSequence, 0, i);
            if (A65 != 0) {
                if (A65 != 1) {
                    return A00();
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException();
    }
}
