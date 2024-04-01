package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.0xR */
/* loaded from: classes.dex */
public class C20380xR {
    public final AbstractC20370xQ A01;
    public final Map A02 = new HashMap();
    public final Set A03 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public boolean A00 = true;

    public C20380xR(AbstractC20370xQ abstractC20370xQ) {
        this.A01 = abstractC20370xQ;
        abstractC20370xQ.A00 = this;
    }

    public void A00(String str) {
        Object obj = this.A02.get(str);
        if (obj != null) {
            this.A03.add(obj);
            if (this.A00) {
                this.A00 = false;
                this.A01.A00();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C000200d.A0I("springId ", str, " does not reference a registered spring"));
    }
}
