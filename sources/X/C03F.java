package X;

import java.util.Iterator;

/* renamed from: X.03F  reason: invalid class name */
/* loaded from: classes.dex */
public class C03F extends AnonymousClass038 {
    public static volatile C03F A00;

    public static C03F A00() {
        if (A00 == null) {
            synchronized (C03F.class) {
                if (A00 == null) {
                    A00 = new C03F();
                }
            }
        }
        return A00;
    }

    public void A02() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((AbstractC05360Ok) c0g5.next()).A01();
                }
            }
        }
    }

    public void A03() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((AbstractC05360Ok) c0g5.next()).A02();
                }
            }
        }
    }
}
