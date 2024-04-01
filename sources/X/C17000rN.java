package X;

import java.util.List;

/* renamed from: X.0rN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17000rN {
    public int A00;
    public C0OF A01;
    public C07M A02;
    public String A03;
    public List A04;
    public List A05;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof C17000rN) {
            C17000rN c17000rN = (C17000rN) o;
            if (this.A00 != c17000rN.A00) {
                return false;
            }
            String str = this.A03;
            if (str != null) {
                if (!str.equals(c17000rN.A03)) {
                    return false;
                }
            } else if (c17000rN.A03 != null) {
                return false;
            }
            if (this.A02 != c17000rN.A02) {
                return false;
            }
            C0OF c0of = this.A01;
            if (c0of != null) {
                if (!c0of.equals(c17000rN.A01)) {
                    return false;
                }
            } else if (c17000rN.A01 != null) {
                return false;
            }
            List list = this.A05;
            if (list != null) {
                if (!list.equals(c17000rN.A05)) {
                    return false;
                }
            } else if (c17000rN.A05 != null) {
                return false;
            }
            List list2 = this.A04;
            List list3 = c17000rN.A04;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.A03;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C07M c07m = this.A02;
        int hashCode2 = (hashCode + (c07m != null ? c07m.hashCode() : 0)) * 31;
        C0OF c0of = this.A01;
        int hashCode3 = (((hashCode2 + (c0of != null ? c0of.hashCode() : 0)) * 31) + this.A00) * 31;
        List list = this.A05;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.A04;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }
}
