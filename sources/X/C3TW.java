package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3TW  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3TW {
    public String A00;
    public final List A02 = new ArrayList();
    public final List A01 = new ArrayList();

    public C3TW(String str) {
        this.A00 = str;
    }

    public C02590Ca A00() {
        C04P[] c04pArr;
        C02590Ca[] c02590CaArr;
        List list = this.A01;
        if (!list.isEmpty()) {
            c04pArr = (C04P[]) list.toArray(new C04P[0]);
        } else {
            c04pArr = null;
        }
        List list2 = this.A02;
        if (!list2.isEmpty() && (c02590CaArr = (C02590Ca[]) list2.toArray(new C02590Ca[0])) != null) {
            return new C02590Ca(this.A00, c04pArr, c02590CaArr, null);
        }
        return new C02590Ca(this.A00, c04pArr, null, null);
    }
}
