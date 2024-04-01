package X;

import java.util.Iterator;

/* renamed from: X.04v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C009404v extends AnonymousClass038 {
    public void A02() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC27421Nh) c0g5.next()).onSignalStoreCreated();
                }
            }
        }
    }
}
