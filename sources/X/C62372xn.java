package X;

/* renamed from: X.2xn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C62372xn {
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public C62372xn(String str, String str2, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = null;
    }

    public C62372xn(String str, String str2, int i, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C62372xn.class == obj.getClass()) {
            C62372xn c62372xn = (C62372xn) obj;
            String str = this.A01;
            if (str == null) {
                if (c62372xn.A01 != null) {
                    return false;
                }
            } else if (!str.equals(c62372xn.A01)) {
                return false;
            }
            String str2 = this.A02;
            if (str2 == null) {
                if (c62372xn.A02 != null) {
                    return false;
                }
            } else if (!str2.equals(c62372xn.A02)) {
                return false;
            }
            if (this.A00 != c62372xn.A00) {
                return false;
            }
            String str3 = this.A03;
            String str4 = c62372xn.A03;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.A01;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.A02;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A00) * 31;
        String str3 = this.A03;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
