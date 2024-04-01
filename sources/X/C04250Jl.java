package X;

import java.util.Iterator;

/* renamed from: X.0Jl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04250Jl implements Iterator {
    public final Iterator A00;

    public C04250Jl(Iterator it) {
        this.A00 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.A00.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
