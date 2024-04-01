package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.05c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C010105c {
    public static volatile C010105c A04;
    public C0KL A00;
    public final AbstractC000600i A01;
    public final Map A03 = new HashMap();
    public final Map A02 = new HashMap();

    public C010105c(AbstractC000600i abstractC000600i) {
        this.A01 = abstractC000600i;
    }

    public static C010105c A00() {
        if (A04 == null) {
            synchronized (C010105c.class) {
                if (A04 == null) {
                    A04 = new C010105c(AbstractC000600i.A00());
                }
            }
        }
        return A04;
    }

    public void A01(Exception exc) {
        Map map = this.A03;
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                ((C0Ml) entry.getValue()).A00(exc);
            }
            map.clear();
        }
    }
}
