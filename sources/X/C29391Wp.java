package X;

import android.os.Looper;

/* renamed from: X.1Wp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29391Wp extends AbstractRunnableC18610u1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AbstractC29401Wq A04;
    public final /* synthetic */ C18760uH A05;

    public C29391Wp(AbstractC29401Wq abstractC29401Wq, int i, int i2, int i3, int i4, C18760uH c18760uH) {
        this.A04 = abstractC29401Wq;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A05 = c18760uH;
    }

    @Override // X.AbstractRunnableC18610u1
    public void A00() {
        C18760uH c18760uH = this.A05;
        if (c18760uH != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                c18760uH.A0C = 0;
                if (c18760uH.A08 == null && c18760uH.A09 == null) {
                    c18760uH.A03();
                    return;
                }
                return;
            }
            C18620u2.A02.post(c18760uH.A0A);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r2 != null) goto L5;
     */
    @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r6 = this;
            X.1Wq r0 = r6.A04
            int r5 = r6.A01
            int r4 = r6.A02
            int r3 = r6.A03
            X.0uH r2 = r0.A0D(r5, r4, r3)
            X.0uH r0 = X.InterfaceC18780uJ.A00
            if (r2 == r0) goto L24
            r0 = 0
            if (r2 == 0) goto L19
        L13:
            r2.A02 = r5
            r2.A03 = r4
            r2.A04 = r3
        L19:
            X.1Wo r1 = new X.1Wo
            r1.<init>()
            android.os.Handler r0 = X.C18620u2.A02
            r0.post(r1)
            return
        L24:
            int r1 = r2.A01
            int r0 = r2.A00
            X.0uH r2 = X.C18760uH.A00(r1, r0)
            android.graphics.Bitmap r1 = X.C18760uH.A0F
            monitor-enter(r2)
            android.graphics.Bitmap r0 = r2.A06     // Catch: java.lang.Throwable -> L3b
            if (r0 == r1) goto L36
            r2.A04()     // Catch: java.lang.Throwable -> L3b
        L36:
            r2.A06 = r1     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)
            r0 = 1
            goto L13
        L3b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29391Wp.run():void");
    }
}
