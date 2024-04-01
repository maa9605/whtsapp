package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.05F  reason: invalid class name */
/* loaded from: classes.dex */
public class C05F {
    public static final C05F A01 = new C05F();
    public CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public void A00(int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC05390On) it.next()).AJp(i);
        }
    }
}
