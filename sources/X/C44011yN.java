package X;

import android.app.Application;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.1yN */
/* loaded from: classes2.dex */
public class C44011yN extends AbstractC43881y9 {
    public static volatile C44011yN A01;
    public final HashMap A00;

    public C44011yN(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C0EL c0el, C43911yC c43911yC, AnonymousClass035 anonymousClass035, C0E7 c0e7, C41451tw c41451tw, C000500h c000500h) {
        super(c001200o, anonymousClass012, abstractC000600i, interfaceC002901k, c0el, c43911yC, anonymousClass035, c0e7, c41451tw, c000500h);
        this.A00 = new HashMap();
    }

    public final File A0K(String str, boolean z) {
        Application application = this.A09.A00;
        if (!z) {
            return new File(application.getFilesDir(), C000200d.A0H("downloadable/filter_", str));
        }
        return new File(application.getCacheDir(), C000200d.A0I("downloadable/filter_", str, "_tmp"));
    }

    public synchronized HashMap A0L() {
        HashMap hashMap = this.A00;
        if (hashMap.isEmpty()) {
            C44001yM A012 = A01();
            if (A012 == null) {
                return hashMap;
            }
            File A0K = A0K(A012.A01(0), false);
            if (!A0K.exists()) {
                A0D(null, null, 0);
                return hashMap;
            }
            String[] list = A0K.list();
            if (list == null) {
                A0D(null, null, 0);
                return hashMap;
            }
            String absolutePath = A0K.getAbsolutePath();
            for (String str : list) {
                hashMap.put(str, new File(absolutePath, str));
            }
            return hashMap;
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x007f A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #2 {, blocks: (B:62:0x0012, B:64:0x0034, B:91:0x007f, B:65:0x0038, B:71:0x004a, B:74:0x0052, B:77:0x0063, B:80:0x0068, B:86:0x0074, B:89:0x007a, B:83:0x006e, B:68:0x0044), top: B:97:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void A0M(X.InterfaceC44051yR r4, int r5, int r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            r1 = 5
            r2 = 1
            if (r5 == 0) goto L4a
            if (r5 == r2) goto L38
            r0 = 2
            if (r5 == r0) goto L4a
            r0 = 3
            if (r5 == r0) goto L38
            r0 = 4
            if (r5 == r0) goto L4a
            if (r5 == r1) goto L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r2.<init>()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "FilterManager/getFilesAsync/Unexpected state "
            r2.append(r0)     // Catch: java.lang.Throwable -> L8f
            java.util.HashMap r1 = X.AbstractC43891yA.A0G     // Catch: java.lang.Throwable -> L8f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L8f
            r2.append(r0)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L8f
            com.whatsapp.util.Log.e(r0)     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L8d
            r4.AJo()     // Catch: java.lang.Throwable -> L8f
            goto L8d
        L38:
            java.util.HashMap r1 = X.AbstractC43891yA.A0G     // Catch: java.lang.Throwable -> L8f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L8f
            r1.get(r0)     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L8d
            r0 = 0
            r3.A09(r4, r0)     // Catch: java.lang.Throwable -> L48
            goto L8d
        L48:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L8f
        L4a:
            boolean r0 = r3.A0I()     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L7a
            if (r6 != 0) goto L68
            X.00h r1 = r3.A0A     // Catch: java.lang.Throwable -> L8f
            X.0E7 r0 = r3.A07     // Catch: java.lang.Throwable -> L8f
            int r0 = r0.A03(r2)     // Catch: java.lang.Throwable -> L8f
            int r0 = X.C23X.A01(r1, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = r0 & r2
            if (r0 != 0) goto L68
            if (r4 == 0) goto L66
            r4.AJo()     // Catch: java.lang.Throwable -> L8f
        L66:
            monitor-exit(r3)
            return
        L68:
            r3.A0H(r2)     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L74
            r0 = 0
            r3.A09(r4, r0)     // Catch: java.lang.Throwable -> L72
            goto L74
        L72:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L8f
        L74:
            r0 = 0
            r3.A07(r6, r0)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r3)
            return
        L7a:
            r3.A0H(r1)     // Catch: java.lang.Throwable -> L8f
        L7d:
            if (r4 == 0) goto L8d
            boolean r0 = r3.A0I()     // Catch: java.lang.Throwable -> L8f
            X.C000700j.A07(r0)     // Catch: java.lang.Throwable -> L8f
            java.util.HashMap r0 = r3.A0L()     // Catch: java.lang.Throwable -> L8f
            r4.ANc(r0)     // Catch: java.lang.Throwable -> L8f
        L8d:
            monitor-exit(r3)
            return
        L8f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44011yN.A0M(X.1yR, int, int):void");
    }
}
