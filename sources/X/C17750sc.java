package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0sc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17750sc {
    public List A00 = null;

    public void A00(C17730sa c17730sa) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        for (int i = 0; i < this.A00.size(); i++) {
            if (((C17730sa) this.A00.get(i)).A00.A00 > c17730sa.A00.A00) {
                this.A00.add(i, c17730sa);
                return;
            }
        }
        this.A00.add(c17730sa);
    }

    public void A01(C17750sc c17750sc) {
        List list = c17750sc.A00;
        if (list == null) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new ArrayList(list.size());
        }
        for (C17730sa c17730sa : c17750sc.A00) {
            A00(c17730sa);
        }
    }

    public String toString() {
        List<Object> list = this.A00;
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : list) {
            sb.append(obj.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
