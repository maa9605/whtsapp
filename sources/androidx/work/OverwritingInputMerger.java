package androidx.work;

import X.AbstractC16420qN;
import X.C0OF;
import X.C16380qJ;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC16420qN {
    @Override // X.AbstractC16420qN
    public C0OF A00(List inputs) {
        C16380qJ c16380qJ = new C16380qJ();
        HashMap hashMap = new HashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((C0OF) it.next()).A00));
        }
        c16380qJ.A00(hashMap);
        C0OF c0of = new C0OF(c16380qJ.A00);
        C0OF.A01(c0of);
        return c0of;
    }
}
