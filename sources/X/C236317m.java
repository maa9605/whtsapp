package X;

/* renamed from: X.17m */
/* loaded from: classes.dex */
public final class C236317m {
    public final /* synthetic */ C237517y A00;

    public C236317m(C237517y c237517y) {
        this.A00 = c237517y;
    }

    public final void A00() {
        if (!this.A00.isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
}
