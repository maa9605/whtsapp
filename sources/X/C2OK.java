package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.2OK */
/* loaded from: classes2.dex */
public class C2OK implements InterfaceC42341va {
    public static volatile C2OK A08;
    public final C40081rY A00;
    public final C42331vZ A01;
    public final C43811y1 A02;
    public final C2K0 A03;
    public final Map A04;
    public final Map A05;
    public final Map A07 = new HashMap();
    public final Map A06 = new HashMap();

    public C2OK(C40081rY c40081rY, C43811y1 c43811y1, C2K0 c2k0, C42331vZ c42331vZ) {
        C30N[] values;
        this.A00 = c40081rY;
        this.A02 = c43811y1;
        this.A03 = c2k0;
        this.A01 = c42331vZ;
        ArrayList arrayList = new ArrayList();
        for (C30N c30n : C30N.values()) {
            if (c30n == C30N.PEOPLE || c30n == C30N.NATURE || c30n == C30N.FOOD || c30n == C30N.ACTIVITY || c30n == C30N.SYMBOLS || c30n == C30N.OBJECTS) {
                arrayList.addAll(Arrays.asList(c30n.shapeData));
            }
        }
        List A01 = C30O.A01(true);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A01((C3HS) it.next(), this.A07);
        }
        Iterator it2 = ((AbstractCollection) A01).iterator();
        while (it2.hasNext()) {
            A01((C2K1) it2.next(), this.A06);
        }
        this.A04 = new HashMap();
        this.A05 = new HashMap();
    }

    public static C2OK A00() {
        if (A08 == null) {
            synchronized (C2OK.class) {
                if (A08 == null) {
                    A08 = new C2OK(C40081rY.A00(), C43811y1.A00(), C2K0.A00(), C42331vZ.A00());
                }
            }
        }
        return A08;
    }

    public static void A01(C2K1 c2k1, Map map) {
        C2CI[] A9v;
        for (C2CI c2ci : c2k1.A9v()) {
            Collection collection = (Collection) map.get(c2ci);
            if (collection == null) {
                collection = new LinkedHashSet();
                map.put(c2ci, collection);
            }
            collection.add(c2k1);
        }
    }

    public synchronized void A02(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A01((C2K1) it.next(), this.A05);
        }
    }

    @Override // X.InterfaceC42341va
    public void A68() {
        this.A01.A68();
    }

    @Override // X.InterfaceC42341va
    public Collection A7l(String str, int i, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (C2K1 c2k1 : this.A03.A02()) {
            if (c2k1 instanceof C2K2) {
                A01(c2k1, hashMap);
            }
            arrayList.addAll(Arrays.asList(c2k1.A9v()));
        }
        List A02 = this.A01.A02(str, i, arrayList, new ArrayList(), z2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList(4);
        arrayList2.add(hashMap);
        arrayList2.add(this.A04);
        if (!this.A02.A00) {
            arrayList2.add(this.A07);
        }
        arrayList2.add(this.A05);
        arrayList2.add(this.A06);
        synchronized (this) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                Iterator it2 = ((ArrayList) A02).iterator();
                while (it2.hasNext()) {
                    Collection<C2K1> collection = (Collection) map.get((C2CI) it2.next());
                    if (collection != null) {
                        for (C2K1 c2k12 : collection) {
                            if (c2k12 instanceof C2K2) {
                                linkedHashSet2.add(c2k12);
                            } else {
                                linkedHashSet.add(c2k12);
                            }
                        }
                    }
                }
            }
        }
        if (this.A02.A00) {
            Iterator it3 = ((ArrayList) A02).iterator();
            while (it3.hasNext()) {
                linkedHashSet.add(new C3HD((C2CI) it3.next(), this.A00, this.A02));
            }
        }
        LinkedHashSet linkedHashSet3 = linkedHashSet2;
        if (z) {
            linkedHashSet3 = linkedHashSet;
        }
        LinkedHashSet linkedHashSet4 = new LinkedHashSet(linkedHashSet3);
        if (z) {
            linkedHashSet = linkedHashSet2;
        }
        linkedHashSet4.addAll(linkedHashSet);
        return linkedHashSet4;
    }

    @Override // X.InterfaceC42341va
    public void ATC(boolean z) {
        this.A01.A00 = z;
    }

    @Override // X.InterfaceC42341va
    public int getCount() {
        return this.A01.getCount();
    }
}
