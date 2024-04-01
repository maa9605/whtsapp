package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.0AD */
/* loaded from: classes.dex */
public final class C0AD extends C0AC {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public volatile boolean A05;
    public final Object A04 = new Object();
    public final C19D A03 = new C19D();

    @Override // X.C0AC
    public final C0AC A00(Executor executor, C0AF c0af) {
        this.A03.A01(new C32051dN(executor, c0af));
        A07();
        return this;
    }

    @Override // X.C0AC
    public final C0AC A01(Executor executor, C0AG c0ag) {
        this.A03.A01(new C32071dP(executor, c0ag));
        A07();
        return this;
    }

    @Override // X.C0AC
    public final C0AC A02(Executor executor, C0AH c0ah) {
        this.A03.A01(new C32081dQ(executor, c0ah));
        A07();
        return this;
    }

    @Override // X.C0AC
    public final Exception A03() {
        Exception exc;
        synchronized (this.A04) {
            exc = this.A00;
        }
        return exc;
    }

    @Override // X.C0AC
    public final Object A04() {
        Object obj;
        synchronized (this.A04) {
            C07K.A1c(this.A02, "Task is not yet complete");
            if (!this.A05) {
                Exception exc = this.A00;
                if (exc == null) {
                    obj = this.A01;
                } else {
                    throw new AnonymousClass193(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x000e, code lost:
        if (r3.A00 != null) goto L14;
     */
    @Override // X.C0AC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A04
            monitor-enter(r2)
            boolean r0 = r3.A02     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            boolean r0 = r3.A05     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            java.lang.Exception r1 = r3.A00     // Catch: java.lang.Throwable -> L13
            r0 = 1
            if (r1 == 0) goto L11
        L10:
            r0 = 0
        L11:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0AD.A05():boolean");
    }

    public final void A06() {
        synchronized (this.A04) {
            if (this.A02) {
                return;
            }
            this.A02 = true;
            this.A05 = true;
            this.A03.A00(this);
        }
    }

    public final void A07() {
        boolean z;
        synchronized (this.A04) {
            z = this.A02;
        }
        if (!z) {
            return;
        }
        this.A03.A00(this);
    }

    public final void A08(Exception exc) {
        C07K.A1Q(exc, "Exception must not be null");
        synchronized (this.A04) {
            C07K.A1c(!this.A02, "Task is already complete");
            this.A02 = true;
            this.A00 = exc;
        }
        this.A03.A00(this);
    }

    public final void A09(Object obj) {
        synchronized (this.A04) {
            C07K.A1c(!this.A02, "Task is already complete");
            this.A02 = true;
            this.A01 = obj;
        }
        this.A03.A00(this);
    }
}
