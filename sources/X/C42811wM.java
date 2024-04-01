package X;

/* renamed from: X.1wM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42811wM {
    public static final C42811wM A03 = new C42811wM(0, 0, 0);
    public final long A00;
    public final long A01;
    public final long A02;

    public C42811wM(long j, long j2, long j3) {
        this.A00 = j;
        this.A02 = j2;
        this.A01 = j3;
    }

    public int A00() {
        if (this.A01 > 0) {
            return 8;
        }
        if (this.A02 > 0) {
            return 13;
        }
        return this.A00 > 0 ? 5 : 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
        if (r6 != 13) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A01(int r6) {
        /*
            r5 = this;
            r0 = 5
            r3 = 0
            if (r6 == r0) goto Le
            r0 = 8
            if (r6 == r0) goto L1c
            r0 = 13
            if (r6 == r0) goto L15
        Ld:
            return r3
        Le:
            long r1 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L15
            return r1
        L15:
            long r1 = r5.A02
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1c
            return r1
        L1c:
            long r1 = r5.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto Ld
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42811wM.A01(int):long");
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("(");
        A0P.append(this.A00);
        A0P.append("/");
        A0P.append(this.A02);
        A0P.append("/");
        A0P.append(this.A01);
        A0P.append(")");
        return A0P.toString();
    }
}
