package X;

import java.util.Arrays;

/* renamed from: X.1Pb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27861Pb {
    public final AbstractC005302j A00;
    public final AbstractC005302j A01;

    public C27861Pb(AbstractC005302j abstractC005302j, AbstractC005302j abstractC005302j2) {
        this.A00 = abstractC005302j;
        this.A01 = abstractC005302j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C27861Pb)) {
            C27861Pb c27861Pb = (C27861Pb) obj;
            return AnonymousClass024.A0l(this.A00, c27861Pb.A00) && AnonymousClass024.A0l(this.A01, c27861Pb.A01);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }
}
