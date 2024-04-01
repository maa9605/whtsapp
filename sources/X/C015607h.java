package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.07h  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C015607h {
    public final Set A00 = new HashSet();

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || C015607h.class != o.getClass()) {
            return false;
        }
        return this.A00.equals(((C015607h) o).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
