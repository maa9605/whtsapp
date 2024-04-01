package X;

/* renamed from: X.0rM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16990rM {
    public C07M A00;
    public String A01;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof C16990rM) {
            C16990rM c16990rM = (C16990rM) o;
            if (this.A00 != c16990rM.A00) {
                return false;
            }
            return this.A01.equals(c16990rM.A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
