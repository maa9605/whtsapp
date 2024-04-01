package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.06c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C012506c {
    public final Map A02 = new HashMap();
    public int A00 = 0;
    public final C06F A01 = new C06F() { // from class: X.06d
        {
            super(250);
        }

        @Override // X.C06F
        public void A09(boolean z, Object obj, Object obj2, Object obj3) {
            if (z) {
                C012506c c012506c = C012506c.this;
                Map map = c012506c.A02;
                map.put(obj, new WeakReference(obj2));
                int i = c012506c.A00 + 1;
                c012506c.A00 = i;
                if (i % 200 == 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((Reference) entry.getValue()).get() == null) {
                            arrayList.add(entry.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        map.remove(it.next());
                    }
                }
            }
        }
    };

    public synchronized void A00(C0IV c0iv) {
        for (AnonymousClass092 anonymousClass092 : ((LinkedHashMap) this.A01.A06()).values()) {
            c0iv.AVl(anonymousClass092);
        }
        for (Map.Entry entry : this.A02.entrySet()) {
            AnonymousClass092 anonymousClass0922 = (AnonymousClass092) ((WeakReference) entry.getValue()).get();
            if (anonymousClass0922 != null) {
                c0iv.AVl(anonymousClass0922);
            }
        }
    }

    public synchronized void A01(AnonymousClass094 anonymousClass094, AnonymousClass092 anonymousClass092) {
        this.A02.remove(anonymousClass094);
        this.A01.A08(anonymousClass094, anonymousClass092);
    }
}
