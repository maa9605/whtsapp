package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0JT  reason: invalid class name */
/* loaded from: classes.dex */
public class C0JT {
    public final /* synthetic */ C41181tV A00;

    public C0JT(C41181tV c41181tV) {
        this.A00 = c41181tV;
    }

    public Map A00() {
        C41181tV c41181tV = this.A00;
        C05E c05e = c41181tV.A0C;
        c05e.A05();
        if (c05e.A01) {
            try {
                return c41181tV.A06.A0A();
            } catch (IllegalStateException e) {
                Log.e("msgstore-manager/finish", e);
                c05e.A05();
                c05e.A06.close();
                c41181tV.A0E.A02();
                return c41181tV.A06.A0A();
            }
        }
        Log.w("msgstore-manager/finish/db is not ready yet", new Throwable());
        throw new Exception() { // from class: X.0Rd
        };
    }

    public void A01(List list) {
        C0FO c0fo = this.A00.A03;
        C0CA c0ca = c0fo.A06;
        C05M c05m = c0ca.A00;
        c05m.A0C();
        ArrayList arrayList = c0ca.A01;
        synchronized (arrayList) {
            arrayList.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                if (c05m.A0E(abstractC005302j)) {
                    C0KM c0km = new C0KM();
                    c0km.A01 = abstractC005302j;
                    c0km.A00 = c05m.A05(abstractC005302j);
                    arrayList.add(c0km);
                }
            }
            Collections.sort(arrayList, c0ca.A02);
        }
        C018508q c018508q = c0fo.A00;
        final C03340Fh c03340Fh = c0fo.A05;
        c018508q.A0G(new Runnable() { // from class: X.0Re
            @Override // java.lang.Runnable
            public final void run() {
                C03340Fh.this.A02();
            }
        });
        StringBuilder sb = new StringBuilder("msgstore-manager/initialize/chats ");
        sb.append(list.size());
        Log.i(sb.toString());
    }
}
