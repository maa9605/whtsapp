package X;

/* renamed from: X.0FK */
/* loaded from: classes.dex */
public class C0FK {
    public final Object A00;
    public final Object A01;

    public C0FK(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0FK) {
            C0FK c0fk = (C0FK) obj;
            return C07O.A18(c0fk.A00, this.A00) && C07O.A18(c0fk.A01, this.A01);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.A00;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.A01;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Pair{");
        A0P.append(String.valueOf(this.A00));
        A0P.append(" ");
        A0P.append(String.valueOf(this.A01));
        A0P.append("}");
        return A0P.toString();
    }
}
