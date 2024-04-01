package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.04i */
/* loaded from: classes.dex */
public class C04i {
    public final List A00 = new CopyOnWriteArrayList();

    public void A00(C0SP c0sp) {
        List list = this.A00;
        if (!list.contains(c0sp)) {
            list.add(c0sp);
            return;
        }
        StringBuilder sb = new StringBuilder("Observer ");
        sb.append(c0sp);
        sb.append(" is already registered.");
        throw new IllegalStateException(sb.toString());
    }

    public void A01(Object obj) {
        for (C0SP c0sp : this.A00) {
            c0sp.AK4(obj);
        }
    }
}
