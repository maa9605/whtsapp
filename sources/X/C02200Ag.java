package X;

import com.google.firebase.iid.Registrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.0Ag  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02200Ag extends AbstractC02210Ah {
    public static final C0BJ A04 = new C0BJ() { // from class: X.0BI
        @Override // X.C0BJ
        public Object get() {
            return Collections.emptySet();
        }
    };
    public final C0BK A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public C02200Ag(Executor executor, Iterable iterable, C017408c... c017408cArr) {
        C0BK c0bk = new C0BK(executor);
        this.A00 = c0bk;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C017408c.A00(c0bk, C0BK.class, C0BK.class, C0BL.class));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Registrar) it.next()).getComponents());
        }
        Collections.addAll(arrayList, c017408cArr);
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C017408c c017408c = (C017408c) it2.next();
            C0BQ c0bq = new C0BQ(c017408c);
            for (Class cls : c017408c.A04) {
                C0BR c0br = new C0BR(cls, !(c017408c.A01 == 0));
                if (!hashMap.containsKey(c0br)) {
                    hashMap.put(c0br, new HashSet());
                }
                Set set = (Set) hashMap.get(c0br);
                if (!set.isEmpty() && !c0br.A01) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set.add(c0bq);
            }
        }
        for (Set<C0BQ> set2 : hashMap.values()) {
            for (C0BQ c0bq2 : set2) {
                for (C0BG c0bg : c0bq2.A00.A03) {
                    Set<C0BQ> set3 = (Set) hashMap.get(new C0BR(c0bg.A01, c0bg.A00 == 2));
                    if (set3 != null) {
                        for (C0BQ c0bq3 : set3) {
                            c0bq2.A01.add(c0bq3);
                            c0bq3.A02.add(c0bq2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Collection collection : hashMap.values()) {
            hashSet.addAll(collection);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            C0BQ c0bq4 = (C0BQ) it3.next();
            if (c0bq4.A02.isEmpty()) {
                hashSet2.add(c0bq4);
            }
        }
        int i = 0;
        while (!hashSet2.isEmpty()) {
            C0BQ c0bq5 = (C0BQ) hashSet2.iterator().next();
            hashSet2.remove(c0bq5);
            i++;
            for (C0BQ c0bq6 : c0bq5.A01) {
                Set set4 = c0bq6.A02;
                set4.remove(c0bq5);
                if (set4.isEmpty()) {
                    hashSet2.add(c0bq6);
                }
            }
        }
        if (i == arrayList.size()) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                final C017408c c017408c2 = (C017408c) it4.next();
                this.A01.put(c017408c2, new C0BT(new C0BJ(this, c017408c2) { // from class: X.0BS
                    public final C017408c A00;
                    public final C02200Ag A01;

                    {
                        this.A01 = this;
                        this.A00 = c017408c2;
                    }

                    @Override // X.C0BJ
                    public Object get() {
                        final C02200Ag c02200Ag = this.A01;
                        final C017408c c017408c3 = this.A00;
                        return c017408c3.A02.A6i(new AbstractC02210Ah(c017408c3, c02200Ag) { // from class: X.0BV
                            public final AbstractC02210Ah A00;
                            public final Set A01;
                            public final Set A02;
                            public final Set A03;
                            public final Set A04;
                            public final Set A05;

                            {
                                HashSet hashSet3 = new HashSet();
                                HashSet hashSet4 = new HashSet();
                                HashSet hashSet5 = new HashSet();
                                HashSet hashSet6 = new HashSet();
                                for (C0BG c0bg2 : c017408c3.A03) {
                                    int i2 = c0bg2.A00;
                                    Class cls2 = c0bg2.A01;
                                    if (i2 == 2) {
                                        hashSet5.add(cls2);
                                    } else {
                                        hashSet3.add(cls2);
                                    }
                                }
                                Set set5 = c017408c3.A05;
                                if (!set5.isEmpty()) {
                                    hashSet3.add(C0BL.class);
                                }
                                this.A01 = Collections.unmodifiableSet(hashSet3);
                                this.A02 = Collections.unmodifiableSet(hashSet4);
                                this.A04 = Collections.unmodifiableSet(hashSet5);
                                this.A05 = Collections.unmodifiableSet(hashSet6);
                                this.A03 = set5;
                                this.A00 = c02200Ag;
                            }

                            @Override // X.AbstractC02210Ah
                            public C0BJ A00(Class cls2) {
                                if (this.A02.contains(cls2)) {
                                    return this.A00.A00(cls2);
                                }
                                throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls2));
                            }

                            @Override // X.AbstractC02210Ah
                            public C0BJ A01(Class cls2) {
                                if (this.A05.contains(cls2)) {
                                    return this.A00.A01(cls2);
                                }
                                throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls2));
                            }

                            @Override // X.AbstractC02210Ah
                            public Object A02(Class cls2) {
                                if (this.A01.contains(cls2)) {
                                    return !cls2.equals(C0BL.class) ? this.A00.A02(cls2) : new C0BL() { // from class: X.1ew
                                    };
                                }
                                throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls2));
                            }

                            @Override // X.AbstractC02210Ah
                            public Set A03(Class cls2) {
                                if (this.A04.contains(cls2)) {
                                    return this.A00.A03(cls2);
                                }
                                throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls2));
                            }
                        });
                    }
                }));
            }
            for (Map.Entry entry : this.A01.entrySet()) {
                C017408c c017408c3 = (C017408c) entry.getKey();
                if (c017408c3.A01 == 0) {
                    Object value = entry.getValue();
                    for (Object obj : c017408c3.A04) {
                        this.A02.put(obj, value);
                    }
                }
            }
            for (C017408c c017408c4 : this.A01.keySet()) {
                for (C0BG c0bg2 : c017408c4.A03) {
                    if (c0bg2.A00 == 1) {
                        Map map = this.A02;
                        Class cls2 = c0bg2.A01;
                        if (!map.containsKey(cls2)) {
                            final String format = String.format("Unsatisfied dependency for component %s: %s", c017408c4, cls2);
                            throw new C24541Bx(format) { // from class: X.1ev
                            };
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : this.A01.entrySet()) {
                C017408c c017408c5 = (C017408c) entry2.getKey();
                if (c017408c5.A01 != 0) {
                    Object value2 = entry2.getValue();
                    for (Object obj2 : c017408c5.A04) {
                        if (!hashMap2.containsKey(obj2)) {
                            hashMap2.put(obj2, new HashSet());
                        }
                        ((Set) hashMap2.get(obj2)).add(value2);
                    }
                }
            }
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                final Set set5 = (Set) entry3.getValue();
                this.A03.put(entry3.getKey(), new C0BT(new C0BJ(set5) { // from class: X.0BU
                    public final Set A00;

                    {
                        this.A00 = set5;
                    }

                    @Override // X.C0BJ
                    public Object get() {
                        Set<C0BT> set6 = this.A00;
                        HashSet hashSet3 = new HashSet();
                        for (C0BT c0bt : set6) {
                            hashSet3.add(c0bt.get());
                        }
                        return Collections.unmodifiableSet(hashSet3);
                    }
                }));
            }
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            C0BQ c0bq7 = (C0BQ) it5.next();
            if (!c0bq7.A02.isEmpty() && !c0bq7.A01.isEmpty()) {
                arrayList2.add(c0bq7.A00);
            }
        }
        throw new C24541Bx(arrayList2) { // from class: X.1eu
            public final List componentsInCycle;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r2 = this;
                    java.lang.String r0 = "Dependency cycle detected: "
                    java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
                    java.lang.Object[] r0 = r3.toArray()
                    java.lang.String r0 = java.util.Arrays.toString(r0)
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    r2.<init>(r0)
                    r2.componentsInCycle = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C32851eu.<init>(java.util.List):void");
            }
        };
    }

    @Override // X.AbstractC02210Ah
    public C0BJ A00(Class cls) {
        C07K.A1Q(cls, "Null interface requested.");
        return (C0BJ) this.A02.get(cls);
    }

    @Override // X.AbstractC02210Ah
    public C0BJ A01(Class cls) {
        C0BT c0bt = (C0BT) this.A03.get(cls);
        return c0bt != null ? c0bt : A04;
    }
}
