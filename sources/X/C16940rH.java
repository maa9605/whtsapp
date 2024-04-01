package X;

/* renamed from: X.0rH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16940rH {
    public final int A00;
    public final String A01;

    public C16940rH(String workSpecId, int systemId) {
        this.A01 = workSpecId;
        this.A00 = systemId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof C16940rH) {
            C16940rH c16940rH = (C16940rH) o;
            if (this.A00 != c16940rH.A00) {
                return false;
            }
            return this.A01.equals(c16940rH.A01);
        }
        return false;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }
}
