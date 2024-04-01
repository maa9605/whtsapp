package X;

/* renamed from: X.0BG  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0BG {
    public final int A00;
    public final Class A01;

    public C0BG(Class cls, int i) {
        C07K.A1Q(cls, "Null dependency anInterface.");
        this.A01 = cls;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0BG) {
            C0BG c0bg = (C0BG) obj;
            return this.A01 == c0bg.A01 && this.A00 == c0bg.A00;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.A01);
        sb.append(", type=");
        int i = this.A00;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", direct=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
