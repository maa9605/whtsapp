package X;

import java.util.List;

/* renamed from: X.1E1  reason: invalid class name */
/* loaded from: classes.dex */
public class C1E1 {
    public final int A00;
    public final List A01;

    public C1E1(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1E1.class != obj.getClass()) {
            return false;
        }
        C1E1 c1e1 = (C1E1) obj;
        return this.A00 == c1e1.A00 && this.A01.equals(c1e1.A01);
    }

    public int hashCode() {
        return this.A01.hashCode() + ((217 + this.A00) * 31);
    }
}
