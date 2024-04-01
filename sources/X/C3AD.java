package X;

/* renamed from: X.3AD  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AD extends AbstractC27811Ow {
    public C3AD(C06C c06c) {
        super(c06c);
    }

    @Override // X.AbstractC27811Ow
    public boolean A00(C06C c06c) {
        int i;
        C06C c06c2 = this.A00;
        c06c.A0R = c06c2.A0R;
        int i2 = c06c2.A01;
        boolean z = (i2 > 0 && c06c.A01 != i2) || ((i = c06c2.A02) > 0 && c06c.A02 != i) || ((i2 == 0 && c06c.A01 != 0) || ((i == 0 && c06c.A02 != 0) || ((i2 < 0 && c06c.A01 > 0) || (i < 0 && c06c.A02 > 0))));
        c06c.A01 = i2;
        c06c.A02 = c06c2.A02;
        c06c.A06 = c06c2.A06;
        return z;
    }
}
