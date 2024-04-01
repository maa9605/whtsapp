package X;

/* renamed from: X.0SH  reason: invalid class name */
/* loaded from: classes.dex */
public class C0SH {
    public final String A00;
    public final String A01;

    public C0SH(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String A00() {
        String str = this.A00;
        String str2 = this.A01;
        if (str.compareTo(str2) <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0SH.class != obj.getClass()) {
            return false;
        }
        C0SH c0sh = (C0SH) obj;
        if (this.A00.equals(c0sh.A00)) {
            return this.A01.equals(c0sh.A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }
}
