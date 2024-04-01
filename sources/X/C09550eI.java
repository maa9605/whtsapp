package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.0eI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09550eI extends C0CY<Integer> implements C0O0, RandomAccess {
    public static final C09550eI A02;
    public int A00;
    public int[] A01;

    static {
        C09550eI c09550eI = new C09550eI();
        A02 = c09550eI;
        ((C0CY) c09550eI).A00 = false;
    }

    public C09550eI() {
        this.A01 = new int[10];
        this.A00 = 0;
    }

    public C09550eI(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    @Override // X.C0CX
    /* renamed from: A01 */
    public C0O0 AGZ(int i) {
        if (i >= this.A00) {
            return new C09550eI(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw new IllegalArgumentException();
    }

    public final void A02(int i) {
        if (i < 0 || i >= this.A00) {
            StringBuilder A0Q = C000200d.A0Q("Index:", i, ", Size:");
            A0Q.append(this.A00);
            throw new IndexOutOfBoundsException(A0Q.toString());
        }
    }

    public final void A03(int i, int i2) {
        int i3;
        A00();
        if (i >= 0 && i <= (i3 = this.A00)) {
            int[] iArr = this.A01;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) >> 1) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.A01, i, iArr2, i + 1, this.A00 - i);
                this.A01 = iArr2;
            }
            this.A01[i] = i2;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder A0Q = C000200d.A0Q("Index:", i, ", Size:");
        A0Q.append(this.A00);
        throw new IndexOutOfBoundsException(A0Q.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        A03(i, ((Number) obj).intValue());
    }

    @Override // X.C0CY, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        A00();
        if (collection != null) {
            if (!(collection instanceof C09550eI)) {
                return super.addAll(collection);
            }
            C09550eI c09550eI = (C09550eI) collection;
            int i = c09550eI.A00;
            if (i == 0) {
                return false;
            }
            int i2 = this.A00;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.A01;
                if (i3 > iArr.length) {
                    iArr = Arrays.copyOf(iArr, i3);
                    this.A01 = iArr;
                }
                System.arraycopy(c09550eI.A01, 0, iArr, this.A00, c09550eI.A00);
                this.A00 = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        throw null;
    }

    @Override // X.C0CY, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09550eI)) {
            return super.equals(obj);
        }
        C09550eI c09550eI = (C09550eI) obj;
        int i = this.A00;
        if (i != c09550eI.A00) {
            return false;
        }
        int[] iArr = c09550eI.A01;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A01[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        A02(i);
        return Integer.valueOf(this.A01[i]);
    }

    @Override // X.C0CY, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        A00();
        A02(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, this.A00 - i);
        this.A00--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // X.C0CY, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        A00();
        for (int i = 0; i < this.A00; i++) {
            if (obj.equals(Integer.valueOf(this.A01[i]))) {
                int[] iArr = this.A01;
                System.arraycopy(iArr, i + 1, iArr, i, this.A00 - i);
                this.A00--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        int intValue = ((Number) obj).intValue();
        A00();
        A02(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.A00;
    }
}
