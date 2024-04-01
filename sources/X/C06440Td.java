package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0Td  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06440Td implements Iterator {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ C0TZ A04;

    public C06440Td(C0TZ c0tz, int i) {
        this.A04 = c0tz;
        this.A03 = i;
        this.A01 = c0tz.A01();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A00 < this.A01;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            C0TZ c0tz = this.A04;
            int i = this.A00;
            Object A04 = c0tz.A04(i, this.A03);
            this.A00 = i + 1;
            this.A02 = true;
            return A04;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.A02) {
            int i = this.A00 - 1;
            this.A00 = i;
            this.A01--;
            this.A02 = false;
            this.A04.A08(i);
            return;
        }
        throw new IllegalStateException();
    }
}
