package X;

/* renamed from: X.0nC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14550nC {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    public C14550nC(int i, int i2, int i3, Object obj) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14550nC.class != obj.getClass()) {
            return false;
        }
        C14550nC c14550nC = (C14550nC) obj;
        int i = this.A00;
        if (i != c14550nC.A00) {
            return false;
        }
        if (i == 8) {
            int i2 = this.A01;
            int i3 = this.A02;
            if (Math.abs(i2 - i3) == 1 && i2 == c14550nC.A02 && i3 == c14550nC.A01) {
                return true;
            }
        }
        if (this.A01 == c14550nC.A01 && this.A02 == c14550nC.A02) {
            Object obj2 = this.A03;
            Object obj3 = c14550nC.A03;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.A00;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.A02);
        sb.append("c:");
        sb.append(this.A01);
        sb.append(",p:");
        sb.append(this.A03);
        sb.append("]");
        return sb.toString();
    }
}
