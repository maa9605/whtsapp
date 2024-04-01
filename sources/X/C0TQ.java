package X;

/* renamed from: X.0TQ  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0TQ extends C0TR {
    public boolean A00 = true;

    public abstract boolean A0A(C0TS c0ts);

    public abstract boolean A0B(C0TS c0ts);

    public abstract boolean A0C(C0TS c0ts, int i, int i2, int i3, int i4);

    public abstract boolean A0D(C0TS c0ts, C0TS c0ts2, int i, int i2, int i3, int i4);

    @Override // X.C0TR
    public boolean A04(C0TS c0ts, C0TS c0ts2, C15140o9 c15140o9, C15140o9 c15140o92) {
        int i;
        int i2;
        int i3 = c15140o9.A00;
        int i4 = c15140o9.A01;
        if (c0ts2.A0B()) {
            i2 = i4;
            i = i3;
        } else {
            i = c15140o92.A00;
            i2 = c15140o92.A01;
        }
        return A0D(c0ts, c0ts2, i3, i4, i, i2);
    }
}
