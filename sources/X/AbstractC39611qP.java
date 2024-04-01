package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1qP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39611qP extends AbstractC30791bB {
    public final C0NR A00;

    public AbstractC39611qP(C0NR c0nr) {
        this.A00 = c0nr;
    }

    public abstract void A07(C39561qK c39561qK);

    @Override // X.C14J
    public void A01(Status status) {
        this.A00.A00(new C08K(status));
    }

    @Override // X.C14J
    public final void A02(C39561qK c39561qK) {
        try {
            A07(c39561qK);
        } catch (DeadObjectException e) {
            this.A00.A00(new C08K(C14J.A00(e)));
            throw e;
        } catch (RemoteException e2) {
            this.A00.A00(new C08K(C14J.A00(e2)));
        } catch (RuntimeException e3) {
            this.A00.A00(e3);
        }
    }

    @Override // X.C14J
    public void A04(RuntimeException runtimeException) {
        this.A00.A00(runtimeException);
    }
}
