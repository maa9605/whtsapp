package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.110  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass110 {
    public final int A00 = -1;
    public final int[] A01 = new int[0];
    public final Uri[] A03 = new Uri[0];
    public final long[] A02 = new long[0];

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass110.class != obj.getClass()) {
            return false;
        }
        AnonymousClass110 anonymousClass110 = (AnonymousClass110) obj;
        return Arrays.equals(this.A03, anonymousClass110.A03) && Arrays.equals(this.A01, anonymousClass110.A01) && Arrays.equals(this.A02, anonymousClass110.A02);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A02) + ((Arrays.hashCode(this.A01) + (((-31) + Arrays.hashCode(this.A03)) * 31)) * 31);
    }
}
