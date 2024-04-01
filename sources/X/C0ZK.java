package X;

import java.util.List;

/* renamed from: X.0ZK  reason: invalid class name */
/* loaded from: classes.dex */
public class C0ZK {
    public final String A00;
    public final String A01;
    public final List A02;

    public C0ZK(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0ZK.class != obj.getClass()) {
            return false;
        }
        C0ZK c0zk = (C0ZK) obj;
        if (this.A01.equals(c0zk.A01) && this.A00.equals(c0zk.A00)) {
            List list = this.A02;
            List list2 = c0zk.A02;
            return list != null ? list.equals(list2) : list2 == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.A00.hashCode() + (this.A01.hashCode() * 31)) * 31;
        List list = this.A02;
        return hashCode + (list != null ? list.hashCode() : 0);
    }
}
