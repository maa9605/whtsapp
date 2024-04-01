package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.07D  reason: invalid class name */
/* loaded from: classes.dex */
public final class C07D implements Iterable {
    public static final C07D A01 = new C07D(Collections.emptySet());
    public final Set A00;

    public C07D(Set set) {
        this.A00 = set;
    }

    public C07D(Set set, C04270Jn c04270Jn) {
        this.A00 = set;
    }

    public static C07D A00(Object obj) {
        HashSet hashSet = new HashSet();
        hashSet.add(obj);
        return new C07D(hashSet, null);
    }

    public static C07D A01(Collection collection) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(collection);
        return new C07D(hashSet, null);
    }

    public HashSet A02() {
        return new HashSet(this.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C07D.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C07D) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C04250Jl(this.A00.iterator());
    }

    public String toString() {
        C04250Jl c04250Jl = (C04250Jl) iterator();
        if (!c04250Jl.hasNext()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        while (true) {
            Object next = c04250Jl.next();
            if (next == this) {
                next = "(this Collection)";
            }
            sb.append(next);
            if (!c04250Jl.hasNext()) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
        }
    }
}
