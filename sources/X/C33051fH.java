package X;

/* renamed from: X.1fH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33051fH implements C0RM {
    public int A00 = 0;

    @Override // X.C0RM
    public boolean AW1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = (z2 ? 1231 : 1237) + (this.A00 * 53);
        return z2;
    }

    @Override // X.C0RM
    public C0AN AW2(boolean z, C0AN c0an, boolean z2, C0AN c0an2) {
        this.A00 = c0an.hashCode() + (this.A00 * 53);
        return c0an;
    }

    @Override // X.C0RM
    public double AW3(boolean z, double d, boolean z2, double d2) {
        int i = this.A00 * 53;
        long doubleToLongBits = Double.doubleToLongBits(d);
        this.A00 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + i;
        return d;
    }

    @Override // X.C0RM
    public float AW4(boolean z, float f, boolean z2, float f2) {
        this.A00 = Float.floatToIntBits(f) + (this.A00 * 53);
        return f;
    }

    @Override // X.C0RM
    public int AW5(boolean z, int i, boolean z2, int i2) {
        this.A00 = (this.A00 * 53) + i;
        return i;
    }

    @Override // X.C0RM
    public C0O0 AW6(C0O0 c0o0, C0O0 c0o02) {
        this.A00 = c0o0.hashCode() + (this.A00 * 53);
        return c0o0;
    }

    @Override // X.C0RM
    public C0CX AW7(C0CX c0cx, C0CX c0cx2) {
        this.A00 = c0cx.hashCode() + (this.A00 * 53);
        return c0cx;
    }

    @Override // X.C0RM
    public long AW8(boolean z, long j, boolean z2, long j2) {
        this.A00 = ((int) (j ^ (j >>> 32))) + (this.A00 * 53);
        return j;
    }

    @Override // X.C0RM
    public C0AX AW9(C0AX c0ax, C0AX c0ax2) {
        int i;
        if (c0ax == null) {
            i = 37;
        } else if (c0ax instanceof C0AZ) {
            C0AZ c0az = (C0AZ) c0ax;
            i = ((C0Aa) c0az).A00;
            if (i == 0) {
                int i2 = this.A00;
                this.A00 = 0;
                c0az.A0G(this, c0az);
                i = this.A00;
                ((C0Aa) c0az).A00 = i;
                this.A00 = i2;
            }
        } else {
            i = c0ax.hashCode();
        }
        this.A00 = (this.A00 * 53) + i;
        return c0ax;
    }

    @Override // X.C0RM
    public Object AWA(boolean z, Object obj, Object obj2) {
        C0AX c0ax = (C0AX) obj;
        AW9(c0ax, (C0AX) obj2);
        return c0ax;
    }

    @Override // X.C0RM
    public void AWB(boolean z) {
        if (z) {
            throw new IllegalStateException();
        }
    }

    @Override // X.C0RM
    public Object AWC(boolean z, Object obj, Object obj2) {
        this.A00 = obj.hashCode() + (this.A00 * 53);
        return obj;
    }

    @Override // X.C0RM
    public String AWD(boolean z, String str, boolean z2, String str2) {
        this.A00 = str.hashCode() + (this.A00 * 53);
        return str;
    }

    @Override // X.C0RM
    public C0Ab AWE(C0Ab c0Ab, C0Ab c0Ab2) {
        this.A00 = c0Ab.hashCode() + (this.A00 * 53);
        return c0Ab;
    }
}
