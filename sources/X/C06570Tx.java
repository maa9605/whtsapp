package X;

import java.util.HashMap;

/* renamed from: X.0Tx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06570Tx {
    public final C0CR A00;
    public final C0VW A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C06570Tx(X.InterfaceC02380Ay r3) {
        /*
            r2 = this;
            X.0VW r1 = r3.ADv()
            boolean r0 = r3 instanceof X.C0B1
            if (r0 == 0) goto L12
            X.0B1 r3 = (X.C0B1) r3
            X.0CR r0 = r3.A9l()
        Le:
            r2.<init>(r1, r0)
            return
        L12:
            X.1Tc r0 = X.C28661Tc.A00
            if (r0 != 0) goto L1d
            X.1Tc r0 = new X.1Tc
            r0.<init>()
            X.C28661Tc.A00 = r0
        L1d:
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06570Tx.<init>(X.0Ay):void");
    }

    public C06570Tx(C0VW c0vw, C0CR c0cr) {
        this.A00 = c0cr;
        this.A01 = c0vw;
    }

    public C0MU A00(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = this.A01.A00;
            C0MU c0mu = (C0MU) hashMap.get(A0H);
            if (cls.isInstance(c0mu)) {
                C0CR c0cr = this.A00;
                if (c0cr instanceof C0VY) {
                    ((C0VY) c0cr).A00(c0mu);
                }
            } else {
                C0CR c0cr2 = this.A00;
                if (c0cr2 instanceof C0VX) {
                    c0mu = ((C0VX) c0cr2).A01(A0H, cls);
                } else {
                    c0mu = c0cr2.A6e(cls);
                }
                C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                if (c0mu2 != null) {
                    c0mu2.A01();
                    return c0mu;
                }
            }
            return c0mu;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
