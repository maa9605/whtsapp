package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1yC */
/* loaded from: classes2.dex */
public class C43911yC {
    public static final HashMap A0E = new HashMap<Integer, String>() { // from class: X.1yS
        {
            put(0, "LOADING");
            put(1, "LOAD_FAILED");
            put(2, "MANIFEST_STALE");
            put(3, "NO_MANIFEST");
            put(4, "READ_NEEDED");
            put(5, "UP_TO_DATE");
        }
    };
    public static volatile C43911yC A0F;
    public C44041yQ A03;
    public final AbstractC000600i A04;
    public final C0EL A05;
    public final AnonymousClass012 A06;
    public final C001200o A07;
    public final C000500h A08;
    public final C002301c A09;
    public final C41451tw A0A;
    public final AnonymousClass035 A0B;
    public final InterfaceC002901k A0C;
    public long A02 = 0;
    public long A01 = 0;
    public int A00 = 3;
    public final HashMap A0D = new HashMap();

    public C43911yC(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C0EL c0el, C002301c c002301c, AnonymousClass035 anonymousClass035, C41451tw c41451tw, C000500h c000500h) {
        this.A07 = c001200o;
        this.A06 = anonymousClass012;
        this.A04 = abstractC000600i;
        this.A0C = interfaceC002901k;
        this.A05 = c0el;
        this.A09 = c002301c;
        this.A0B = anonymousClass035;
        this.A0A = c41451tw;
        this.A08 = c000500h;
    }

    public static C43911yC A00() {
        if (A0F == null) {
            synchronized (C43911yC.class) {
                if (A0F == null) {
                    A0F = new C43911yC(C001200o.A01, AnonymousClass012.A00(), AbstractC000600i.A00(), C002801j.A00(), C0EL.A00(), C002301c.A00(), AnonymousClass035.A00(), C41451tw.A00(), C000500h.A00());
                }
            }
        }
        return A0F;
    }

    public final synchronized int A01() {
        return this.A00;
    }

    public final synchronized int A02(int i) {
        int i2 = this.A00;
        if (i2 == 0 && i == 0) {
            Log.e("ManifestManager/setState/State change ERROR - loading to loading!");
            return this.A00;
        }
        HashMap hashMap = A0E;
        hashMap.get(Integer.valueOf(i2));
        hashMap.get(Integer.valueOf(i));
        this.A00 = i;
        return i;
    }

    public final synchronized long A03() {
        long j;
        j = this.A01;
        if (j == 0) {
            j = this.A08.A00.getLong("downloadable_manifest_last_fetched_time_millis", 0L);
            this.A01 = j;
        }
        return j;
    }

    public final synchronized void A04(long j) {
        this.A01 = j;
        this.A08.A0D().putLong("downloadable_manifest_last_fetched_time_millis", j).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:327:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x03c1  */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(X.C44001yM r22, boolean r23, X.C0J5 r24) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43911yC.A05(X.1yM, boolean, X.0J5):void");
    }

    public final synchronized void A06(C44041yQ c44041yQ, boolean z) {
        C000700j.A00();
        if (z && c44041yQ == null) {
            throw null;
        }
        HashMap hashMap = this.A0D;
        for (Map.Entry entry : hashMap.entrySet()) {
            entry.getKey();
            Iterator it = ((ArrayList) entry.getValue()).iterator();
            while (it.hasNext()) {
                C44031yP c44031yP = (C44031yP) it.next();
                if (z) {
                    c44031yP.A01((C44001yM) c44041yQ.A01.get((String) entry.getKey()));
                } else {
                    c44031yP.A00();
                }
            }
        }
        hashMap.clear();
    }

    public final synchronized void A07(String str, C44031yP c44031yP) {
        int i = this.A00;
        if (i == 0) {
            HashMap hashMap = this.A0D;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList.add(c44031yP);
                hashMap.put(str, arrayList);
            } else {
                hashMap.put(str, new ArrayList(Collections.singletonList(c44031yP)));
            }
        } else if (i == 5) {
            C44041yQ c44041yQ = this.A03;
            if (c44041yQ != null) {
                c44031yP.A01((C44001yM) c44041yQ.A01.get(str));
            } else {
                throw null;
            }
        } else if (i == 1) {
            c44031yP.A00();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("ManifestManager/registerCallback/Invalid state encountered when trying to register category : ");
            sb.append(str);
            sb.append(" state : ");
            sb.append((String) A0E.get(Integer.valueOf(i)));
            Log.e(sb.toString());
        }
    }

    public final synchronized void A08(boolean z, String str, C44001yM c44001yM, C44031yP c44031yP, int i) {
        A02(0);
        if (i == 0 && this.A02 + 3600000 > this.A06.A05()) {
            A02(1);
            c44031yP.A00();
            return;
        }
        A07(str, c44031yP);
        this.A0C.AS1(new RunnableEBaseShape0S0210000_I0(this, c44001yM, z, 8));
    }
}
