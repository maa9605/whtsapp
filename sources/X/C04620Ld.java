package X;

import java.util.Arrays;

/* renamed from: X.0Ld  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04620Ld {
    public static final int[] A00 = {1, 2, 3};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0016, code lost:
        if (r3 == 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        if (r4 != 1) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(int r3, int r4) {
        /*
            r2 = 1
            if (r3 != r2) goto Lb
            if (r4 == r2) goto Lf
        L5:
            r0 = 2
            if (r3 != r2) goto L10
            if (r4 != r0) goto L1c
            return r0
        Lb:
            if (r3 != 0) goto L5
            if (r4 != 0) goto L1c
        Lf:
            return r2
        L10:
            if (r3 != r0) goto L16
            if (r4 != r2) goto L18
            r0 = 3
            return r0
        L16:
            if (r3 != r0) goto L1c
        L18:
            if (r4 != r0) goto L1c
            r0 = 4
            return r0
        L1c:
            java.lang.String r0 = "getProviderCategory unexpected arguments hostStorage: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ". actualActors:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04620Ld.A00(int, int):int");
    }

    public static boolean A01(C05200Ns c05200Ns, C05200Ns c05200Ns2, C01B c01b) {
        if (c01b.A0E(C01C.A0W) && c05200Ns2 != null) {
            if ((c05200Ns == null ? 1 : A00(c05200Ns.hostStorage, c05200Ns.actualActors)) != A00(c05200Ns2.hostStorage, c05200Ns2.actualActors)) {
                Arrays.toString(Thread.currentThread().getStackTrace());
                return true;
            }
            return false;
        }
        return false;
    }
}
