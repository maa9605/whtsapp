package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.036 */
/* loaded from: classes.dex */
public final class AnonymousClass036<E> implements Collection<E>, Set<E> {
    public static int A04;
    public static int A05;
    public static Object[] A06;
    public static Object[] A07;
    public static final int[] A08 = new int[0];
    public static final Object[] A09 = new Object[0];
    public int A00;
    public C0TZ A01;
    public int[] A02;
    public Object[] A03;

    public AnonymousClass036() {
        this(0);
    }

    public AnonymousClass036(int i) {
        if (i == 0) {
            this.A02 = A08;
            this.A03 = A09;
        } else {
            A04(i);
        }
        this.A00 = 0;
    }

    public static void A00(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (AnonymousClass036.class) {
                int i2 = A05;
                if (i2 < 10) {
                    objArr[0] = A07;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A07 = objArr;
                    A05 = i2 + 1;
                }
            }
        } else if (length == 4) {
            synchronized (AnonymousClass036.class) {
                int i4 = A04;
                if (i4 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i5 = i - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    A06 = objArr;
                    A04 = i4 + 1;
                }
            }
        }
    }

    public final int A01() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        int[] iArr = this.A02;
        int A00 = AnonymousClass030.A00(iArr, i, 0);
        if (A00 < 0) {
            return A00;
        }
        Object[] objArr = this.A03;
        if (objArr[A00] == null) {
            return A00;
        }
        int i2 = A00 + 1;
        while (i2 < i && iArr[i2] == 0) {
            if (objArr[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = A00 - 1; i3 >= 0 && iArr[i3] == 0; i3--) {
            if (objArr[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public final int A02(Object obj, int i) {
        int i2 = this.A00;
        if (i2 == 0) {
            return -1;
        }
        int A00 = AnonymousClass030.A00(this.A02, i2, i);
        if (A00 >= 0 && !obj.equals(this.A03[A00])) {
            int i3 = A00 + 1;
            while (i3 < i2 && this.A02[i3] == i) {
                if (obj.equals(this.A03[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = A00 - 1; i4 >= 0 && this.A02[i4] == i; i4--) {
                if (obj.equals(this.A03[i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return A00;
    }

    public void A03(int i) {
        Object[] objArr = this.A03;
        int i2 = this.A00;
        if (i2 <= 1) {
            A00(this.A02, objArr, i2);
            this.A02 = A08;
            this.A03 = A09;
            this.A00 = 0;
            return;
        }
        int[] iArr = this.A02;
        int length = iArr.length;
        if (length > 8 && i2 < length / 3) {
            A04(i2 > 8 ? i2 + (i2 >> 1) : 8);
            this.A00--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.A02, 0, i);
                System.arraycopy(objArr, 0, this.A03, 0, i);
            }
            int i3 = this.A00;
            if (i >= i3) {
                return;
            }
            int i4 = i + 1;
            System.arraycopy(iArr, i4, this.A02, i, i3 - i);
            System.arraycopy(objArr, i4, this.A03, i, this.A00 - i);
            return;
        }
        int i5 = i2 - 1;
        this.A00 = i5;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, iArr, i, i5 - i);
            Object[] objArr2 = this.A03;
            System.arraycopy(objArr2, i6, objArr2, i, this.A00 - i);
        }
        this.A03[this.A00] = null;
    }

    public final void A04(int i) {
        if (i == 8) {
            synchronized (AnonymousClass036.class) {
                Object[] objArr = A07;
                if (objArr != null) {
                    this.A03 = objArr;
                    A07 = (Object[]) objArr[0];
                    this.A02 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A05--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (AnonymousClass036.class) {
                Object[] objArr2 = A06;
                if (objArr2 != null) {
                    this.A03 = objArr2;
                    A06 = (Object[]) objArr2[0];
                    this.A02 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A04--;
                    return;
                }
            }
        }
        this.A02 = new int[i];
        this.A03 = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int hashCode;
        int A02;
        if (obj == null) {
            A02 = A01();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A02 = A02(obj, hashCode);
        }
        if (A02 >= 0) {
            return false;
        }
        int i = A02 ^ (-1);
        int i2 = this.A00;
        int[] iArr = this.A02;
        if (i2 >= iArr.length) {
            int i3 = 4;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i3 = 8;
            }
            Object[] objArr = this.A03;
            A04(i3);
            int[] iArr2 = this.A02;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.A03, 0, objArr.length);
            }
            A00(iArr, objArr, this.A00);
        }
        int i4 = this.A00;
        if (i < i4) {
            int[] iArr3 = this.A02;
            int i5 = i + 1;
            System.arraycopy(iArr3, i, iArr3, i5, i4 - i);
            Object[] objArr2 = this.A03;
            System.arraycopy(objArr2, i, objArr2, i5, this.A00 - i);
        }
        this.A02[i] = hashCode;
        this.A03[i] = obj;
        this.A00++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        int size = collection.size() + this.A00;
        int[] iArr = this.A02;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.A03;
            A04(size);
            int i = this.A00;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.A02, 0, i);
                System.arraycopy(objArr, 0, this.A03, 0, this.A00);
            }
            A00(iArr, objArr, this.A00);
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.A00;
        if (i != 0) {
            A00(this.A02, this.A03, i);
            this.A02 = A08;
            this.A03 = A09;
            this.A00 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int A02;
        if (obj == null) {
            A02 = A01();
        } else {
            A02 = A02(obj, obj.hashCode());
        }
        return A02 >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.A00 != set.size()) {
                return false;
            }
            for (int i = 0; i < this.A00; i++) {
                try {
                    if (!set.contains(this.A03[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.A02;
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.A00 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        C0TZ c0tz = this.A01;
        if (c0tz == null) {
            c0tz = new C0TZ() { // from class: X.0TW
                {
                    AnonymousClass036.this = this;
                }

                @Override // X.C0TZ
                public int A01() {
                    return AnonymousClass036.this.A00;
                }

                @Override // X.C0TZ
                public int A02(Object obj) {
                    AnonymousClass036 anonymousClass036 = AnonymousClass036.this;
                    if (obj == null) {
                        return anonymousClass036.A01();
                    }
                    return anonymousClass036.A02(obj, obj.hashCode());
                }

                @Override // X.C0TZ
                public int A03(Object obj) {
                    AnonymousClass036 anonymousClass036 = AnonymousClass036.this;
                    if (obj == null) {
                        return anonymousClass036.A01();
                    }
                    return anonymousClass036.A02(obj, obj.hashCode());
                }

                @Override // X.C0TZ
                public Object A04(int i, int i2) {
                    return AnonymousClass036.this.A03[i];
                }

                @Override // X.C0TZ
                public Object A05(int i, Object obj) {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // X.C0TZ
                public Map A06() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // X.C0TZ
                public void A07() {
                    AnonymousClass036.this.clear();
                }

                @Override // X.C0TZ
                public void A08(int i) {
                    AnonymousClass036.this.A03(i);
                }

                @Override // X.C0TZ
                public void A09(Object obj, Object obj2) {
                    AnonymousClass036.this.add(obj);
                }
            };
            this.A01 = c0tz;
        }
        C06410Ta c06410Ta = c0tz.A01;
        if (c06410Ta == null) {
            c06410Ta = new C06410Ta(c0tz);
            c0tz.A01 = c06410Ta;
        }
        return c06410Ta.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int A02;
        if (obj == null) {
            A02 = A01();
        } else {
            A02 = A02(obj, obj.hashCode());
        }
        if (A02 >= 0) {
            A03(A02);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator<E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.A00 - 1; i >= 0; i--) {
            if (!collection.contains(this.A03[i])) {
                A03(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.A00;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.A00;
        Object[] objArr = new Object[i];
        System.arraycopy(this.A03, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.A00) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.A00);
        }
        System.arraycopy(this.A03, 0, objArr, 0, this.A00);
        int length = objArr.length;
        int i = this.A00;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 14);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.A03[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
