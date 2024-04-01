package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0EV  reason: invalid class name */
/* loaded from: classes.dex */
public class C0EV {
    public static volatile C0EV A02;
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();

    public static C0EV A00() {
        if (A02 == null) {
            synchronized (C0EV.class) {
                if (A02 == null) {
                    C01B.A00();
                    A02 = new C0EV();
                }
            }
        }
        return A02;
    }

    public void A01() {
        synchronized (this) {
            List list = this.A00;
            list.size();
            List list2 = this.A01;
            list2.size();
            list.clear();
            list2.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2.A01.size() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List r0 = r2.A00     // Catch: java.lang.Throwable -> L15
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L15
            if (r0 > 0) goto L12
            java.util.List r0 = r2.A01     // Catch: java.lang.Throwable -> L15
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L15
            r0 = 0
            if (r1 <= 0) goto L13
        L12:
            r0 = 1
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.A02():boolean");
    }
}
