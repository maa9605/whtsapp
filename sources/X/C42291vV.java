package X;

import java.util.Iterator;

/* renamed from: X.1vV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42291vV extends AnonymousClass038 {
    public void A02(int i) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C3MM) c0g5.next()).ANO(i, 100);
                }
            }
        }
    }
}
