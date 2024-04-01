package X;

import java.util.Arrays;

/* renamed from: X.14c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C228114c {
    public final int A00;
    public final C227413u A01;
    public final boolean A02 = false;

    public C228114c(C227413u c227413u, InterfaceC227313s interfaceC227313s) {
        this.A01 = c227413u;
        this.A00 = Arrays.hashCode(new Object[]{c227413u, null});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C228114c) {
            C228114c c228114c = (C228114c) obj;
            return !this.A02 && !c228114c.A02 && C07K.A1k(this.A01, c228114c.A01) && C07K.A1k(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }
}
