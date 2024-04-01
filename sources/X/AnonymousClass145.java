package X;

import java.util.Arrays;

/* renamed from: X.145  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass145 {
    public final C30461ac A00;
    public final C228114c A01;

    public AnonymousClass145(C228114c c228114c, C30461ac c30461ac) {
        this.A01 = c228114c;
        this.A00 = c30461ac;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof AnonymousClass145)) {
            AnonymousClass145 anonymousClass145 = (AnonymousClass145) obj;
            if (C07K.A1k(this.A01, anonymousClass145.A01) && C07K.A1k(this.A00, anonymousClass145.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("key", this.A01);
        A0q.A00("feature", this.A00);
        return A0q.toString();
    }
}
