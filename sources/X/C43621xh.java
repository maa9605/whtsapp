package X;

import java.security.SecureRandom;

/* renamed from: X.1xh */
/* loaded from: classes2.dex */
public class C43621xh {
    public final long A00;
    public final byte[] A01;

    public C43621xh(byte[] bArr, long j) {
        C000700j.A07(j > 0);
        this.A01 = bArr;
        this.A00 = j;
    }

    public static C43621xh A00(C09H c09h, long j) {
        byte[] bArr = c09h.A0U;
        if (bArr == null) {
            return null;
        }
        long j2 = c09h.A0B;
        if (j2 > 0) {
            j = j2;
        }
        return new C43621xh(bArr, j);
    }

    public static boolean A01(C43621xh c43621xh, long j) {
        return j - c43621xh.A00 < ((long) new SecureRandom().nextInt(86400000)) + 172800000;
    }
}
