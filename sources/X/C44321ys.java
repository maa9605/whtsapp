package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1ys  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44321ys {
    public static volatile C44321ys A04;
    public final C41831ua A00;
    public final AnonymousClass202 A01;
    public final C44351yv A02;
    public final Map A03 = new HashMap();

    public C44321ys(C44351yv c44351yv, AnonymousClass202 anonymousClass202, C41831ua c41831ua) {
        this.A02 = c44351yv;
        this.A01 = anonymousClass202;
        this.A00 = c41831ua;
    }

    public static C44321ys A00() {
        if (A04 == null) {
            synchronized (C44321ys.class) {
                if (A04 == null) {
                    A04 = new C44321ys(C44351yv.A00(), AnonymousClass202.A00(), C41831ua.A00());
                }
            }
        }
        return A04;
    }

    public final AbstractC44571zI A01(AbstractC44611zM abstractC44611zM) {
        AbstractC44571zI abstractC44571zI;
        String A03 = abstractC44611zM.A03();
        synchronized (this) {
            abstractC44571zI = (AbstractC44571zI) A02(A03);
        }
        return abstractC44571zI;
    }

    public Object A02(String str) {
        Object obj;
        if (this.A01.A03(str)) {
            synchronized (this) {
                obj = this.A03.get(str);
            }
            return obj;
        }
        return null;
    }

    public synchronized List A03() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.A03.keySet()) {
            AbstractC44571zI abstractC44571zI = (AbstractC44571zI) A02(str);
            if (abstractC44571zI != null) {
                arrayList.add(abstractC44571zI);
            }
        }
        return arrayList;
    }

    public synchronized Set A04(Collection collection) {
        return this.A02.A0C(collection);
    }

    public void A05(AbstractC44611zM abstractC44611zM) {
        if (abstractC44611zM.A05() && (abstractC44611zM instanceof InterfaceC44621zN)) {
            String A03 = abstractC44611zM.A03();
            if ("clearChat".equals(A03) || "deleteChat".equals(A03) || "deleteMessageForMe".equals(A03)) {
                C41831ua c41831ua = this.A00;
                AbstractC005302j A8o = ((InterfaceC44621zN) abstractC44611zM).A8o();
                synchronized (c41831ua) {
                    Set set = c41831ua.A00;
                    if (set != null) {
                        set.add(A8o);
                    }
                }
            }
        }
    }

    public synchronized void A06(AbstractC005302j abstractC005302j) {
        Iterator it = ((ArrayList) this.A02.A0A("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch FROM syncd_mutations WHERE chat_jid == ? AND are_dependencies_missing = 1 AND mutation_version <= ? ORDER BY _id ASC", new String[]{abstractC005302j.getRawString(), String.valueOf(3)}, new AnonymousClass203() { // from class: X.36A
            @Override // X.AnonymousClass203
            public final boolean A7O(String str) {
                return !C41831ua.A01(str);
            }
        })).iterator();
        while (it.hasNext()) {
            AbstractC44611zM abstractC44611zM = (AbstractC44611zM) it.next();
            AbstractC44571zI A01 = A01(abstractC44611zM);
            if (A01 != null) {
                A01.A02(abstractC44611zM);
            }
        }
    }

    public synchronized void A07(String str, AbstractC44571zI abstractC44571zI) {
        Map map = this.A03;
        if (!map.containsKey(str)) {
            map.put(str, abstractC44571zI);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("mutation-handlers/add-handler handler exists with key: ");
            sb.append(str);
            Log.w(sb.toString());
        }
    }

    public synchronized void A08(Collection collection) {
        this.A02.A0G(collection);
    }
}
