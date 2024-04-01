package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0CA */
/* loaded from: classes.dex */
public class C0CA {
    public static volatile C0CA A03;
    public final C05M A00;
    public final ArrayList A01 = new ArrayList();
    public final Comparator A02 = new Comparator() { // from class: X.1Nx
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C0KM c0km = (C0KM) obj;
            C0KM c0km2 = (C0KM) obj2;
            long j = c0km.A00;
            long j2 = c0km2.A00;
            if (j == j2) {
                return c0km.A01.getRawString().compareTo(c0km2.A01.getRawString());
            }
            return j < j2 ? 1 : -1;
        }
    };

    public C0CA(C05M c05m) {
        this.A00 = c05m;
    }

    public static C0CA A00() {
        if (A03 == null) {
            synchronized (C0CA.class) {
                if (A03 == null) {
                    A03 = new C0CA(C05M.A00());
                }
            }
        }
        return A03;
    }

    public static ArrayList A01(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, C12610jl.A00);
        return arrayList;
    }

    public int A02() {
        C05M c05m = this.A00;
        c05m.A0C();
        int i = 0;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (c05m.A0F(((C0KM) it.next()).A01)) {
                    i++;
                }
            }
        }
        return i;
    }

    public int A03() {
        int size;
        this.A00.A0C();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            size = arrayList.size();
        }
        return size;
    }

    public int A04() {
        C05M c05m = this.A00;
        c05m.A0C();
        int i = 0;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!c05m.A0F(((C0KM) it.next()).A01)) {
                    i++;
                }
            }
        }
        return i;
    }

    public final int A05(AbstractC005302j abstractC005302j) {
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((C0KM) arrayList.get(i)).A01.equals(abstractC005302j)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public ArrayList A06() {
        C05M c05m = this.A00;
        c05m.A0C();
        ArrayList arrayList = this.A01;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0KM c0km = (C0KM) it.next();
                if (c05m.A0F(c0km.A01)) {
                    arrayList2.add(c0km.A01);
                }
            }
        }
        return arrayList2;
    }

    public ArrayList A07() {
        ArrayList arrayList;
        this.A00.A0C();
        ArrayList arrayList2 = this.A01;
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC005302j abstractC005302j = ((C0KM) it.next()).A01;
                if (C003101m.A0U(abstractC005302j) || C003101m.A0P(abstractC005302j)) {
                    arrayList.add((AbstractC011105n) abstractC005302j);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A08() {
        C05M c05m = this.A00;
        c05m.A0C();
        ArrayList arrayList = this.A01;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0KM c0km = (C0KM) it.next();
                if (!c05m.A0F(c0km.A01)) {
                    arrayList2.add(c0km.A01);
                }
            }
        }
        return arrayList2;
    }

    public ArrayList A09(C0CB c0cb) {
        this.A00.A0C();
        ArrayList arrayList = new ArrayList(this.A01.size());
        Set A0F = c0cb.A0F();
        synchronized (this.A01) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                C0KM c0km = (C0KM) it.next();
                if (!((HashSet) A0F).contains(c0km.A01)) {
                    arrayList.add(c0km.A01);
                }
            }
        }
        arrayList.addAll(0, A0F);
        return arrayList;
    }

    public ArrayList A0A(C0CB c0cb) {
        this.A00.A0C();
        ArrayList arrayList = new ArrayList(this.A01.size());
        Set A0F = c0cb.A0F();
        arrayList.addAll(A0F);
        synchronized (this.A01) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                C0KM c0km = (C0KM) it.next();
                if (!this.A00.A0F(c0km.A01) && !((HashSet) A0F).contains(c0km.A01)) {
                    arrayList.add(c0km.A01);
                }
            }
        }
        return arrayList;
    }

    public List A0B() {
        ArrayList arrayList;
        this.A00.A0C();
        ArrayList arrayList2 = this.A01;
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0KM) it.next()).A01);
            }
        }
        return arrayList;
    }

    public Map A0C(Collection collection) {
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C06C c06c = (C06C) it.next();
            hashMap.put(c06c, A0F((AbstractC005302j) c06c.A03(AbstractC005302j.class)) ? Boolean.TRUE : Boolean.FALSE);
        }
        return hashMap;
    }

    public Set A0D() {
        HashSet hashSet;
        this.A00.A0C();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            hashSet = new HashSet(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C0KM) it.next()).A01);
            }
        }
        return hashSet;
    }

    public void A0E(AbstractC005302j abstractC005302j) {
        this.A00.A0C();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            int A05 = A05(abstractC005302j);
            if (A05 >= 0) {
                arrayList.remove(A05);
            }
        }
    }

    public boolean A0F(AbstractC005302j abstractC005302j) {
        this.A00.A0C();
        return A05(abstractC005302j) >= 0;
    }

    public final boolean A0G(AbstractC005302j abstractC005302j, long j, AbstractC005302j abstractC005302j2) {
        C0KM c0km;
        boolean z;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            int A05 = A05(abstractC005302j);
            if (A05 >= 0) {
                c0km = (C0KM) arrayList.remove(A05);
            } else {
                c0km = new C0KM();
            }
            if (abstractC005302j2 != null) {
                c0km.A01 = abstractC005302j2;
                c0km.A00 = j;
                int binarySearch = Collections.binarySearch(arrayList, c0km, this.A02);
                C000700j.A06(binarySearch < 0);
                int i = (-binarySearch) - 1;
                arrayList.add(i, c0km);
                z = i != A05;
            } else {
                throw null;
            }
        }
        return z;
    }
}
