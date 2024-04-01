package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.25a */
/* loaded from: classes2.dex */
public class C461225a {
    public InterfaceC70513So A00;
    public InterfaceC70513So A01;
    public C2C0 A02;
    public C461325b A03;
    public List A04;
    public final C000500h A07;
    public final C2AM A08;
    public final C2Bk A0A;
    public final C2AS A0B;
    public final InterfaceC002901k A0C;
    public boolean A05 = false;
    public boolean A06 = false;
    public final C25R A09 = new C25S(this);
    public final HashSet A0F = new HashSet();
    public final HashMap A0E = new HashMap();
    public final HashMap A0D = new HashMap();

    public C461225a(C2AS c2as, InterfaceC002901k interfaceC002901k, C2AM c2am, C2Bk c2Bk, C000500h c000500h) {
        this.A0B = c2as;
        this.A0C = interfaceC002901k;
        this.A08 = c2am;
        this.A0A = c2Bk;
        this.A07 = c000500h;
    }

    public static void A00(C461225a c461225a, List list, String str) {
        HashSet hashSet = c461225a.A0F;
        hashSet.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42531vt c42531vt = (C42531vt) it.next();
            if (c42531vt.A0N) {
                hashSet.add(c42531vt.A0D);
            }
        }
        if (str == null) {
            c461225a.A04(list, null);
        } else {
            c461225a.A04(list, str);
        }
    }

    public List A01(List list, List list2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0JM c0jm = (C0JM) it.next();
                arrayList.add(c0jm);
                hashSet.add(c0jm.A0B);
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C0JM c0jm2 = (C0JM) it2.next();
                if (hashSet.add(c0jm2.A0B)) {
                    arrayList.add(c0jm2);
                }
            }
        }
        List<C42531vt> list3 = this.A04;
        if (list3 != null) {
            for (C42531vt c42531vt : list3) {
                for (C0JM c0jm3 : c42531vt.A04) {
                    if (hashSet.add(c0jm3.A0B)) {
                        arrayList.add(c0jm3);
                    }
                }
            }
        }
        return arrayList;
    }

    public void A02() {
        C2C0 c2c0 = this.A02;
        if (c2c0 != null) {
            c2c0.A05(true);
        }
        C86483xc c86483xc = new C86483xc(this, this.A0B, this.A07, true);
        this.A02 = c86483xc;
        this.A0C.ARy(c86483xc, new Void[0]);
    }

    public void A03() {
        C2C0 c2c0 = this.A02;
        if (c2c0 != null) {
            c2c0.A05(true);
        }
        C86483xc c86483xc = new C86483xc(this, this.A0B, this.A07, false);
        this.A02 = c86483xc;
        this.A0C.ARy(c86483xc, new Void[0]);
    }

    public final void A04(List list, String str) {
        this.A04 = list;
        C461325b c461325b = this.A03;
        if (c461325b != null) {
            c461325b.A06(list, this.A0F, this.A0E, this.A0D, str);
        }
    }
}
