package X;

import android.os.SystemClock;

/* renamed from: X.03d  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C007203d implements C00J, InterfaceC007103c {
    public long A00 = -1;
    public InterfaceC007103c A01;
    public volatile Object A02;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C007203d(X.InterfaceC007103c r3, java.lang.Object r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.A00 = r0
            if (r3 != 0) goto Lc
            r1 = 0
            if (r4 == 0) goto Ld
        Lc:
            r1 = 1
        Ld:
            java.lang.String r0 = "Either a provider or instance must be specified."
            X.C000700j.A09(r1, r0)
            r2.A01 = r3
            r2.A02 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007203d.<init>(X.03c, java.lang.Object):void");
    }

    public static C007203d A00(InterfaceC007103c interfaceC007103c) {
        return new C007203d(interfaceC007103c, null);
    }

    @Override // X.C00J
    public Object get() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    InterfaceC007103c interfaceC007103c = this.A01;
                    C000700j.A07(interfaceC007103c != null);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Object obj = interfaceC007103c.get();
                    if (obj == null) {
                        throw null;
                    }
                    this.A02 = obj;
                    this.A00 = Math.max(0L, SystemClock.uptimeMillis() - uptimeMillis);
                    this.A01 = null;
                }
            }
        }
        return this.A02;
    }
}
