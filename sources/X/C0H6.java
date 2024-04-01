package X;

import java.util.Iterator;

/* renamed from: X.0H6 */
/* loaded from: classes.dex */
public class C0H6 extends AnonymousClass038 {
    public static volatile C0H6 A00;

    public void A02() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C0H6) c0g5.next()).A02();
                }
            }
        }
    }

    public void A03(long j, long j2) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C0H6) c0g5.next()).A03(j, j2);
                }
            }
        }
    }
}
