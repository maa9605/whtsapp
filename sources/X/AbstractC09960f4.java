package X;

import java.util.Iterator;

/* renamed from: X.0f4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09960f4 implements Iterator, C0YY {
    public C0UC A00;
    public C0UC A01;

    public abstract C0UC A00(C0UC c0uc);

    public abstract C0UC A01(C0UC c0uc);

    public AbstractC09960f4(C0UC c0uc, C0UC c0uc2) {
        this.A00 = c0uc2;
        this.A01 = c0uc;
    }

    @Override // X.C0YY
    public void AVI(C0UC c0uc) {
        C0UC c0uc2 = this.A00;
        C0UC c0uc3 = c0uc2;
        C0UC c0uc4 = null;
        if (c0uc2 == c0uc && c0uc == this.A01) {
            this.A01 = null;
            this.A00 = null;
            c0uc2 = null;
            c0uc3 = null;
        }
        if (c0uc2 == c0uc) {
            c0uc3 = A00(c0uc2);
            this.A00 = c0uc3;
        }
        C0UC c0uc5 = this.A01;
        if (c0uc5 == c0uc) {
            if (c0uc5 != c0uc3 && c0uc3 != null) {
                c0uc4 = A01(c0uc5);
            }
            this.A01 = c0uc4;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A01 != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        C0UC c0uc;
        C0UC c0uc2 = this.A01;
        C0UC c0uc3 = this.A00;
        if (c0uc2 != c0uc3 && c0uc3 != null) {
            c0uc = A01(c0uc2);
        } else {
            c0uc = null;
        }
        this.A01 = c0uc;
        return c0uc2;
    }
}
