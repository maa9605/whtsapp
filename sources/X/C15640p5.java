package X;

import java.util.List;

/* renamed from: X.0p5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15640p5 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C15640p5(String str, boolean z, List list) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15640p5.class != obj.getClass()) {
            return false;
        }
        C15640p5 c15640p5 = (C15640p5) obj;
        if (this.A02 == c15640p5.A02 && this.A01.equals(c15640p5.A01)) {
            String str = this.A00;
            boolean startsWith = str.startsWith("index_");
            String str2 = c15640p5.A00;
            if (startsWith) {
                return str2.startsWith("index_");
            }
            return str.equals(str2);
        }
        return false;
    }

    public int hashCode() {
        String str = this.A00;
        return this.A01.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.A02 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Index{name='");
        C000200d.A1P(A0P, this.A00, '\'', ", unique=");
        A0P.append(this.A02);
        A0P.append(", columns=");
        A0P.append(this.A01);
        A0P.append('}');
        return A0P.toString();
    }
}
