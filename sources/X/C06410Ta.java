package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Ta  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06410Ta implements Set {
    public final /* synthetic */ C0TZ A00;

    public C06410Ta(C0TZ c0tz) {
        this.A00 = c0tz;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.A00.A07();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.A00.A02(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Map A06 = this.A00.A06();
        for (Object obj : collection) {
            if (!A06.containsKey(obj)) {
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
        C0TZ c0tz = this.A00;
        int i = 0;
        for (int A01 = c0tz.A01() - 1; A01 >= 0; A01--) {
            Object A04 = c0tz.A04(A01, 0);
            i += A04 == null ? 0 : A04.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.A00.A01() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C06440Td(this.A00, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        C0TZ c0tz = this.A00;
        int A02 = c0tz.A02(obj);
        if (A02 >= 0) {
            c0tz.A08(A02);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Map A06 = this.A00.A06();
        int size = A06.size();
        for (Object obj : collection) {
            A06.remove(obj);
        }
        return size != A06.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        return C0TZ.A00(this.A00.A06(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.A00.A01();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        C0TZ c0tz = this.A00;
        int A01 = c0tz.A01();
        Object[] objArr = new Object[A01];
        for (int i = 0; i < A01; i++) {
            objArr[i] = c0tz.A04(i, 0);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.A00.A0A(objArr, 0);
    }
}
