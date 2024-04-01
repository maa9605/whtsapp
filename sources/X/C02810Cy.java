package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0Cy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02810Cy {
    public final ArrayList A00 = new ArrayList();
    public final HashMap A01 = new HashMap();

    public C0BA A00(String str) {
        C09400dD c09400dD = (C09400dD) this.A01.get(str);
        if (c09400dD != null) {
            return c09400dD.A01;
        }
        return null;
    }

    public C0BA A01(String str) {
        if (str != null) {
            ArrayList arrayList = this.A00;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0BA c0ba = (C0BA) arrayList.get(size);
                if (c0ba != null && str.equals(c0ba.A0Q)) {
                    return c0ba;
                }
            }
            for (C09400dD c09400dD : this.A01.values()) {
                if (c09400dD != null) {
                    C0BA c0ba2 = c09400dD.A01;
                    if (str.equals(c0ba2.A0Q)) {
                        return c0ba2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public C0BA A02(String str) {
        for (C09400dD c09400dD : this.A01.values()) {
            if (c09400dD != null) {
                C0BA c0ba = c09400dD.A01;
                if (str.equals(c0ba.A0S) || (c0ba = c0ba.A0G.A0Q.A02(str)) != null) {
                    return c0ba;
                }
            }
        }
        return null;
    }

    public List A03() {
        ArrayList arrayList = new ArrayList();
        for (C09400dD c09400dD : this.A01.values()) {
            if (c09400dD != null) {
                arrayList.add(c09400dD.A01);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List A04() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A00;
        if (arrayList2.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    public void A05(C0BA c0ba) {
        ArrayList arrayList = this.A00;
        if (!arrayList.contains(c0ba)) {
            synchronized (arrayList) {
                arrayList.add(c0ba);
            }
            c0ba.A0T = true;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment already added: ");
        sb.append(c0ba);
        throw new IllegalStateException(sb.toString());
    }
}
