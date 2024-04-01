package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.02y */
/* loaded from: classes.dex */
public class C006702y<K, V> extends C006802z<K, V> implements Map<K, V> {
    public C0TZ A00;

    public C006702y() {
    }

    public C006702y(int i) {
        super(i);
    }

    public C006702y(C006802z c006802z) {
        if (c006802z != null) {
            A08(c006802z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ih, java.util.Set] */
    @Override // java.util.Map
    public Set entrySet() {
        final C0TZ c0tz = this.A00;
        if (c0tz == null) {
            c0tz = new C28511Sj(this);
            this.A00 = c0tz;
        }
        C12000ih c12000ih = c0tz.A00;
        if (c12000ih == null) {
            ?? r0 = new Set() { // from class: X.0ih
                @Override // java.util.Set, java.util.Collection
                public boolean add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Set, java.util.Collection
                public boolean addAll(Collection collection) {
                    C0TZ c0tz2 = c0tz;
                    int A01 = c0tz2.A01();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        c0tz2.A09(entry.getKey(), entry.getValue());
                    }
                    return A01 != c0tz2.A01();
                }

                @Override // java.util.Set, java.util.Collection
                public void clear() {
                    c0tz.A07();
                }

                @Override // java.util.Set, java.util.Collection
                public boolean contains(Object obj) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        C0TZ c0tz2 = c0tz;
                        int A02 = c0tz2.A02(entry.getKey());
                        if (A02 < 0) {
                            return false;
                        }
                        Object A04 = c0tz2.A04(A02, 1);
                        Object value = entry.getValue();
                        if (A04 != value) {
                            return A04 != null && A04.equals(value);
                        }
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Set, java.util.Collection
                public boolean containsAll(Collection collection) {
                    for (Object obj : collection) {
                        if (!contains(obj)) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // java.util.Set, java.util.Collection
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Set) {
                        Set set = (Set) obj;
                        try {
                            if (size() == set.size()) {
                                return containsAll(set);
                            }
                            return false;
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
                    return false;
                }

                @Override // java.util.Set, java.util.Collection
                public int hashCode() {
                    C0TZ c0tz2 = c0tz;
                    int i = 0;
                    for (int A01 = c0tz2.A01() - 1; A01 >= 0; A01--) {
                        Object A04 = c0tz2.A04(A01, 0);
                        Object A042 = c0tz2.A04(A01, 1);
                        i += (A04 == null ? 0 : A04.hashCode()) ^ (A042 == null ? 0 : A042.hashCode());
                    }
                    return i;
                }

                @Override // java.util.Set, java.util.Collection
                public boolean isEmpty() {
                    return c0tz.A01() == 0;
                }

                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public Iterator iterator() {
                    return new C12010ii(c0tz);
                }

                @Override // java.util.Set, java.util.Collection
                public boolean remove(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Set, java.util.Collection
                public boolean removeAll(Collection collection) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Set, java.util.Collection
                public boolean retainAll(Collection collection) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Set, java.util.Collection
                public int size() {
                    return c0tz.A01();
                }

                @Override // java.util.Set, java.util.Collection
                public Object[] toArray() {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Set, java.util.Collection
                public Object[] toArray(Object[] objArr) {
                    throw new UnsupportedOperationException();
                }
            };
            c0tz.A00 = r0;
            return r0;
        }
        return c12000ih;
    }

    @Override // java.util.Map
    public Set keySet() {
        C0TZ c0tz = this.A00;
        if (c0tz == null) {
            c0tz = new C28511Sj(this);
            this.A00 = c0tz;
        }
        C06410Ta c06410Ta = c0tz.A01;
        if (c06410Ta == null) {
            C06410Ta c06410Ta2 = new C06410Ta(c0tz);
            c0tz.A01 = c06410Ta2;
            return c06410Ta2;
        }
        return c06410Ta;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        A06(map.size() + super.A00);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ij, java.util.Collection] */
    @Override // java.util.Map
    public Collection values() {
        final C0TZ c0tz = this.A00;
        if (c0tz == null) {
            c0tz = new C28511Sj(this);
            this.A00 = c0tz;
        }
        C12020ij c12020ij = c0tz.A02;
        if (c12020ij == null) {
            Collection<V> collection = new Collection<V>() { // from class: X.0ij
                @Override // java.util.Collection
                public boolean add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection
                public boolean addAll(Collection collection2) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection
                public void clear() {
                    c0tz.A07();
                }

                @Override // java.util.Collection
                public boolean contains(Object obj) {
                    return c0tz.A03(obj) >= 0;
                }

                @Override // java.util.Collection
                public boolean containsAll(Collection collection2) {
                    for (Object obj : collection2) {
                        if (!contains(obj)) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // java.util.Collection
                public boolean isEmpty() {
                    return c0tz.A01() == 0;
                }

                @Override // java.util.Collection, java.lang.Iterable
                public Iterator iterator() {
                    return new C06440Td(c0tz, 1);
                }

                @Override // java.util.Collection
                public boolean remove(Object obj) {
                    C0TZ c0tz2 = c0tz;
                    int A03 = c0tz2.A03(obj);
                    if (A03 >= 0) {
                        c0tz2.A08(A03);
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Collection
                public boolean removeAll(Collection collection2) {
                    C0TZ c0tz2 = c0tz;
                    int A01 = c0tz2.A01();
                    int i = 0;
                    boolean z = false;
                    while (i < A01) {
                        if (collection2.contains(c0tz2.A04(i, 1))) {
                            c0tz2.A08(i);
                            i--;
                            A01--;
                            z = true;
                        }
                        i++;
                    }
                    return z;
                }

                @Override // java.util.Collection
                public boolean retainAll(Collection collection2) {
                    C0TZ c0tz2 = c0tz;
                    int A01 = c0tz2.A01();
                    int i = 0;
                    boolean z = false;
                    while (i < A01) {
                        if (!collection2.contains(c0tz2.A04(i, 1))) {
                            c0tz2.A08(i);
                            i--;
                            A01--;
                            z = true;
                        }
                        i++;
                    }
                    return z;
                }

                @Override // java.util.Collection
                public int size() {
                    return c0tz.A01();
                }

                @Override // java.util.Collection
                public Object[] toArray() {
                    C0TZ c0tz2 = c0tz;
                    int A01 = c0tz2.A01();
                    Object[] objArr = new Object[A01];
                    for (int i = 0; i < A01; i++) {
                        objArr[i] = c0tz2.A04(i, 1);
                    }
                    return objArr;
                }

                @Override // java.util.Collection
                public Object[] toArray(Object[] objArr) {
                    return c0tz.A0A(objArr, 1);
                }
            };
            c0tz.A02 = collection;
            return collection;
        }
        return c12020ij;
    }
}
