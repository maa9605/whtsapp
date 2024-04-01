package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1wz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43181wz extends HashMap<AnonymousClass094, AnonymousClass097> {
    public final /* synthetic */ C42451vl this$0;

    public C43181wz(C42451vl c42451vl) {
        this.this$0 = c42451vl;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: A00 */
    public AnonymousClass097 remove(Object obj) {
        C43221x3 A00;
        AnonymousClass097 anonymousClass097 = (AnonymousClass097) super.get(obj);
        if (anonymousClass097 != null && anonymousClass097.A02 != null) {
            C42451vl c42451vl = this.this$0;
            if (c42451vl != null) {
                StringBuilder A0P = C000200d.A0P("MediaDownloadManager/unmarkAsUrgent/download message.key=");
                A0P.append(anonymousClass097.A0n);
                A0P.append(", message.mediaHash=");
                A0P.append(anonymousClass097.A06);
                A0P.toString();
                if (anonymousClass097.A02 != null) {
                    C43221x3 A002 = c42451vl.A0R.A00(anonymousClass097.A02);
                    if (A002 != null) {
                        A002.A0q = false;
                        synchronized (c42451vl.A0h) {
                            for (Map.Entry entry : c42451vl.A0h.entrySet()) {
                                c42451vl.A06((AnonymousClass097) entry.getKey(), 1, null, ((Long) entry.getValue()).longValue(), true, true);
                            }
                            c42451vl.A0h.clear();
                        }
                        synchronized (c42451vl.A0S) {
                            Iterator it = ((ArrayList) c42451vl.A04()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    AnonymousClass097 anonymousClass0972 = (AnonymousClass097) it.next();
                                    if (anonymousClass0972.A02 != null && (A00 = c42451vl.A0R.A00(anonymousClass0972.A02)) != null && A00.A0q) {
                                        break;
                                    }
                                } else {
                                    c42451vl.A00.open();
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return (AnonymousClass097) super.remove(obj);
    }
}
