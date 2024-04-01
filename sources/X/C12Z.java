package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.12Z  reason: invalid class name */
/* loaded from: classes.dex */
public final class C12Z {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public void A00(Object obj) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A00;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C12Y c12y = (C12Y) it.next();
            if (c12y.A02 == obj) {
                c12y.A00 = true;
                copyOnWriteArrayList.remove(c12y);
            }
        }
    }
}
