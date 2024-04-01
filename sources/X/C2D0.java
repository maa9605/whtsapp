package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2D0  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2D0 {
    public final /* synthetic */ C47892Cz A02;
    public final LinkedHashMap A01 = new LinkedHashMap();
    public final HashSet A00 = new HashSet();

    public C2D0(C47892Cz c47892Cz) {
        this.A02 = c47892Cz;
    }

    public synchronized void A00() {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HashSet hashSet = this.A00;
            if (!hashSet.contains(entry.getKey())) {
                break;
            }
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) entry.getValue();
            it.remove();
            hashSet.remove(entry.getKey());
            C47892Cz c47892Cz = this.A02;
            c47892Cz.A00.A01(anonymousClass092);
            c47892Cz.A02.AS1(new RunnableEBaseShape3S0200000_I0_3(this, anonymousClass092, 16));
        }
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("[pending:");
        sb.append(this.A01.size());
        sb.append(" ready:");
        sb.append(this.A00.size());
        sb.append("]");
        return sb.toString();
    }
}
