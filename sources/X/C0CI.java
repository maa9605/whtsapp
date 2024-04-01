package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0CI */
/* loaded from: classes.dex */
public class C0CI implements C0CG {
    public final C0CK A01 = new C0CK();
    public final C0CK A00 = new C0CK();
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public final void A00(Object obj) {
        if (this.A02.compareAndSet(false, true)) {
            this.A01.A04(obj);
        }
    }

    public final void A01(Throwable th) {
        if (this.A02.compareAndSet(false, true)) {
            this.A00.A04(th);
        }
    }

    public void A03() {
        this.A01.A01();
        this.A00.A01();
        if (this.A02.get()) {
            return;
        }
        Log.w("asyncfuture/unsubscribe called before completion, possibly not intended", new Throwable());
    }

    @Override // X.C0CG
    public final void A54(Object obj) {
        A00(obj);
    }
}
