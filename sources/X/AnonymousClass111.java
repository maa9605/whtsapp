package X;

import java.util.Arrays;

/* renamed from: X.111 */
/* loaded from: classes.dex */
public final class AnonymousClass111 {
    public static final AnonymousClass111 A04 = new AnonymousClass111(new long[0]);
    public final int A00;
    public final long A01;
    public final long[] A02;
    public final AnonymousClass110[] A03;

    public AnonymousClass111(long... jArr) {
        int length = jArr.length;
        this.A00 = length;
        this.A02 = Arrays.copyOf(jArr, length);
        AnonymousClass110[] anonymousClass110Arr = new AnonymousClass110[length];
        this.A03 = anonymousClass110Arr;
        for (int i = 0; i < length; i++) {
            anonymousClass110Arr[i] = new AnonymousClass110();
        }
        this.A01 = -9223372036854775807L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass111.class != obj.getClass()) {
            return false;
        }
        AnonymousClass111 anonymousClass111 = (AnonymousClass111) obj;
        return this.A00 == anonymousClass111.A00 && Arrays.equals(this.A02, anonymousClass111.A02) && Arrays.equals(this.A03, anonymousClass111.A03);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A03) + ((Arrays.hashCode(this.A02) + (((((this.A00 * 31) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 31)) * 31);
    }
}
