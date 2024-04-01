package X;

/* renamed from: X.1RU  reason: invalid class name */
/* loaded from: classes.dex */
public class C1RU {
    public final Object A00;
    public final Object A01;

    public C1RU(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1RU) {
            C1RU c1ru = (C1RU) obj;
            Object obj2 = c1ru.A00;
            Object obj3 = this.A00;
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (obj3 == null || !obj2.equals(obj3)) {
                return false;
            }
            Object obj4 = c1ru.A01;
            Object obj5 = this.A01;
            return obj4 == null ? obj5 == null : obj5 != null && obj4.equals(obj5);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }
}
