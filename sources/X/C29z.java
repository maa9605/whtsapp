package X;

import java.util.List;

/* renamed from: X.29z  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C29z {
    public int A00;
    public int A01;
    public String A02;
    public final String A03;
    public final List A04;

    public C29z(String str, String str2, int i, int i2, List list) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C29z) {
            C29z c29z = (C29z) obj;
            if (AnonymousClass024.A0k(this.A03, c29z.A03) && AnonymousClass024.A0k(this.A02, c29z.A02) && this.A01 == c29z.A01 && this.A00 == c29z.A00) {
                List list = this.A04;
                int size = list.size();
                List list2 = c29z.A04;
                if (size != list2.size()) {
                    return false;
                }
                if (list != list2) {
                    for (int i = 0; i < list.size(); i++) {
                        if (!list.get(i).equals(list2.get(i))) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.A02.hashCode() + ((this.A03.hashCode() + 217) * 31)) * 31) + this.A00) * 31) + this.A01;
        for (C468628o c468628o : this.A04) {
            hashCode = (hashCode * 31) + c468628o.A09.hashCode();
        }
        return hashCode;
    }
}
