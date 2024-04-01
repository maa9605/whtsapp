package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.0p3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15620p3 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public C15620p3(String str, String str2, String str3, List list, List list2) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = Collections.unmodifiableList(list);
        this.A04 = Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15620p3.class != obj.getClass()) {
            return false;
        }
        C15620p3 c15620p3 = (C15620p3) obj;
        if (this.A02.equals(c15620p3.A02) && this.A00.equals(c15620p3.A00) && this.A01.equals(c15620p3.A01) && this.A03.equals(c15620p3.A03)) {
            return this.A04.equals(c15620p3.A04);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        int hashCode2 = this.A01.hashCode();
        return this.A04.hashCode() + ((this.A03.hashCode() + ((hashCode2 + ((this.A00.hashCode() + hashCode) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("ForeignKey{referenceTable='");
        C000200d.A1P(A0P, this.A02, '\'', ", onDelete='");
        C000200d.A1P(A0P, this.A00, '\'', ", onUpdate='");
        C000200d.A1P(A0P, this.A01, '\'', ", columnNames=");
        A0P.append(this.A03);
        A0P.append(", referenceColumnNames=");
        A0P.append(this.A04);
        A0P.append('}');
        return A0P.toString();
    }
}
