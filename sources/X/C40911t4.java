package X;

import java.util.Arrays;

/* renamed from: X.1t4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40911t4 {
    public final long A00;
    public final long[] A01;

    public C40911t4(long j, long[] jArr) {
        this.A00 = j;
        this.A01 = jArr;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Duration{staticDurationMillis=");
        A0P.append(this.A00);
        A0P.append(", repeatDurationMills=");
        A0P.append(Arrays.toString(this.A01));
        A0P.append('}');
        return A0P.toString();
    }
}
