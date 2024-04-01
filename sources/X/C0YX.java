package X;

import java.util.Iterator;

/* renamed from: X.0YX  reason: invalid class name */
/* loaded from: classes.dex */
public class C0YX implements Iterator, C0YY {
    public C0UC A00;
    public boolean A01 = true;
    public final /* synthetic */ C02550Bw A02;

    public C0YX(C02550Bw c02550Bw) {
        this.A02 = c02550Bw;
    }

    @Override // X.C0YY
    public void AVI(C0UC c0uc) {
        C0UC c0uc2 = this.A00;
        if (c0uc == c0uc2) {
            C0UC c0uc3 = c0uc2.A01;
            this.A00 = c0uc3;
            this.A01 = c0uc3 == null;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.A01) {
            return this.A02.A02 != null;
        }
        C0UC c0uc = this.A00;
        return (c0uc == null || c0uc.A00 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.A01) {
            this.A01 = false;
            C0UC c0uc = this.A02.A02;
            this.A00 = c0uc;
            return c0uc;
        }
        C0UC c0uc2 = this.A00;
        C0UC c0uc3 = c0uc2 != null ? c0uc2.A00 : null;
        this.A00 = c0uc3;
        return c0uc3;
    }
}
