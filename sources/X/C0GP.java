package X;

/* renamed from: X.0GP  reason: invalid class name */
/* loaded from: classes.dex */
public class C0GP implements C0GQ {
    public static final int A04 = Math.max(64, Math.min(512, (int) ((Runtime.getRuntime().maxMemory() / 16) / 16384)));
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public C0GP(int i, int i2, int i3) {
        this.A02 = i != 1 ? i * 3072 : i2;
        this.A01 = i3;
    }

    @Override // X.C0GQ
    public int AAu() {
        return this.A03;
    }

    @Override // X.C0GQ
    public boolean APQ(boolean z, int i) {
        int i2 = this.A02;
        if (i2 == 0) {
            return true;
        }
        int max = this.A00 + (z ? Math.max(1, 3072 / A04) : 1);
        this.A00 = max;
        if (max <= i2 || i >= this.A01 - A04) {
            return true;
        }
        this.A03 = i;
        return false;
    }
}
