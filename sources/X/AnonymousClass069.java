package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.069  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass069 extends AnonymousClass038 {
    public void A02(Collection collection) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C1NI) c0g5.next()).onJidsRemoved(collection);
                }
            }
        }
    }
}
