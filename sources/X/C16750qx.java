package X;

/* renamed from: X.0qx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16750qx {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public C16750qx(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming) {
        this.A00 = isConnected;
        this.A03 = isValidated;
        this.A01 = isMetered;
        this.A02 = isNotRoaming;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof C16750qx) {
            C16750qx c16750qx = (C16750qx) o;
            return this.A00 == c16750qx.A00 && this.A03 == c16750qx.A03 && this.A01 == c16750qx.A01 && this.A02 == c16750qx.A02;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00 ? 1 : 0;
        if (this.A03) {
            i += 16;
        }
        if (this.A01) {
            i += 256;
        }
        return this.A02 ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.A00), Boolean.valueOf(this.A03), Boolean.valueOf(this.A01), Boolean.valueOf(this.A02));
    }
}
