package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Bk  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Bk extends AnonymousClass009 {
    public static volatile C2Bk A01;
    public final C47522Bo A00;

    public C2Bk(C47522Bo c47522Bo) {
        this.A00 = c47522Bo;
    }

    public static C2Bk A00() {
        if (A01 == null) {
            synchronized (C2Bk.class) {
                if (A01 == null) {
                    A01 = new C2Bk(C47522Bo.A00());
                }
            }
        }
        return A01;
    }

    @Override // X.AnonymousClass009
    /* renamed from: A02 */
    public void A01(C25R c25r) {
        super.A01(c25r);
        C47522Bo c47522Bo = this.A00;
        if (c47522Bo != null) {
            HashMap hashMap = new HashMap(c47522Bo.A01);
            for (String str : hashMap.keySet()) {
                A03(str, ((Number) hashMap.get(str)).intValue());
            }
            return;
        }
        throw null;
    }

    public void A03(String str, int i) {
        C461225a c461225a;
        C461325b c461325b;
        List list;
        C000700j.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (c0g5.hasNext()) {
                C25R c25r = (C25R) c0g5.next();
                c25r.toString();
                if ((c25r instanceof C25S) && (c461325b = (c461225a = ((C25S) c25r).A00).A03) != null && (list = c461225a.A04) != null) {
                    HashSet hashSet = c461225a.A0F;
                    HashMap hashMap = c461225a.A0E;
                    HashMap hashMap2 = c461225a.A0D;
                    if (!c461325b.A0E.containsKey(str)) {
                        c461325b.A06(list, hashSet, hashMap, hashMap2, null);
                    } else {
                        C2CF c2cf = (C2CF) c461325b.A0E.get(str);
                        c2cf.A00 = i;
                        c2cf.A05();
                    }
                }
            } else {
                return;
            }
        }
    }
}
