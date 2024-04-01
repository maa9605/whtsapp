package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0G1  reason: invalid class name */
/* loaded from: classes.dex */
public class C0G1 {
    public static volatile C0G1 A01;
    public final C003701t A00;

    public C0G1(C003701t c003701t) {
        this.A00 = c003701t;
    }

    public static C0G1 A00() {
        if (A01 == null) {
            synchronized (C0G1.class) {
                if (A01 == null) {
                    A01 = new C0G1(C003701t.A00());
                }
            }
        }
        return A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set A01(HashMap hashMap) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC005302j abstractC005302j = ((C27861Pb) entry.getKey()).A00;
            AbstractC005302j abstractC005302j2 = ((C27861Pb) entry.getKey()).A01;
            List list = (List) entry.getValue();
            Long[] lArr = new Long[list.size()];
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                lArr[i] = ((C1RU) list.get(i)).A00;
                strArr[i] = ((C1RU) list.get(i)).A01;
            }
            hashSet.add(new C09600eO(abstractC005302j, abstractC005302j2, lArr, strArr));
        }
        return hashSet;
    }

    public static Set A02(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C09600eO c09600eO = (C09600eO) it.next();
            C27861Pb c27861Pb = new C27861Pb(c09600eO.A01, c09600eO.A00);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                Long[] lArr = c09600eO.A02;
                if (i >= lArr.length) {
                    break;
                }
                arrayList.add(new C1RU(lArr[i], c09600eO.A03[i]));
                i++;
            }
            if (hashMap.containsKey(c27861Pb)) {
                ((List) hashMap.get(c27861Pb)).addAll(arrayList);
            } else {
                hashMap.put(c27861Pb, arrayList);
            }
        }
        return A01(hashMap);
    }

    public static boolean A03(AnonymousClass092 anonymousClass092) {
        int i;
        if (anonymousClass092.A0n.A02) {
            return false;
        }
        return ((anonymousClass092.A04 != 1 && !C0DB.A0E(anonymousClass092.A0m)) || (i = anonymousClass092.A08) == 9 || i == 10) ? false : true;
    }
}
