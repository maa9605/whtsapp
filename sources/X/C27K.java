package X;

import java.util.Arrays;

/* renamed from: X.27K  reason: invalid class name */
/* loaded from: classes2.dex */
public class C27K extends C451920u {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public C27K(AbstractC000600i abstractC000600i, C01B c01b, int i, boolean z, int i2) {
        super(abstractC000600i, c01b);
        this.A00 = i;
        this.A02 = z;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27K) {
            C27K c27k = (C27K) obj;
            return this.A00 == c27k.A00 && this.A02 == c27k.A02 && this.A01 == c27k.A01;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A02), Integer.valueOf(this.A01)});
    }
}
