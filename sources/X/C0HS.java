package X;

import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* renamed from: X.0HS */
/* loaded from: classes.dex */
public abstract class C0HS {
    public C0UA A00;
    public InterfaceC02360Aw A01;
    public final C2C1 A02 = new C2C1(this);

    public void A01(Object obj) {
    }

    public void A03(Object... objArr) {
    }

    public void A06() {
    }

    public abstract Object A07(Object... objArr);

    public void A08() {
    }

    public void A09(Object obj) {
    }

    public final AsyncTask.Status A00() {
        return this.A02.getStatus();
    }

    public final void A02(Executor executor, Object... objArr) {
        this.A02.executeOnExecutor(executor, objArr);
    }

    public final boolean A04() {
        return this.A02.isCancelled();
    }

    public final boolean A05(boolean z) {
        return this.A02.cancel(z);
    }
}
