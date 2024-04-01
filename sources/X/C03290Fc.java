package X;

import java.util.HashMap;

/* renamed from: X.0Fc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03290Fc {
    public static volatile C03290Fc A02;
    public final C0EG A00;
    public final HashMap A01 = new HashMap();

    public C03290Fc(C0EG c0eg) {
        this.A00 = c0eg;
    }

    public static C03290Fc A00() {
        if (A02 == null) {
            synchronized (C03290Fc.class) {
                if (A02 == null) {
                    A02 = new C03290Fc(C0EG.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A01(java.util.List r12, final java.lang.Runnable r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03290Fc.A01(java.util.List, java.lang.Runnable):int");
    }
}
