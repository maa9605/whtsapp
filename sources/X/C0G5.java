package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0G5 */
/* loaded from: classes.dex */
public class C0G5 implements Iterator {
    public int A00;
    public boolean A01;
    public final int A02;
    public final /* synthetic */ AnonymousClass023 A03;

    public C0G5(AnonymousClass023 anonymousClass023) {
        this.A03 = anonymousClass023;
        C000700j.A0A(!anonymousClass023.A00, "Nested iterations not allowed");
        anonymousClass023.A00 = true;
        this.A02 = anonymousClass023.A01.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.A00 < this.A02) {
            return true;
        }
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass023 anonymousClass023 = this.A03;
            C000700j.A0A(anonymousClass023.A00, "Unexpected iteration state");
            anonymousClass023.A00 = false;
            return false;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.A00;
        if (i < this.A02) {
            AnonymousClass023 anonymousClass023 = this.A03;
            this.A00 = i + 1;
            return anonymousClass023.A01.get(i);
        }
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass023 anonymousClass0232 = this.A03;
            C000700j.A0A(anonymousClass0232.A00, "Unexpected iteration state");
            anonymousClass0232.A00 = false;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
