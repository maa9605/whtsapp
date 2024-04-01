package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0Jf  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Jf implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final Object[] A02;

    public C0Jf(Object[] objArr, int i) {
        this.A02 = objArr;
        this.A01 = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A00 < this.A02.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            int i = this.A00;
            int i2 = this.A01;
            Object[] objArr = this.A02;
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i, Math.min(i + i2, objArr.length));
            this.A00 += i2;
            return copyOfRange;
        }
        throw new NoSuchElementException("There are no more chunks to provide.");
    }
}
