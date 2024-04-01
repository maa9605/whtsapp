package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.0NH */
/* loaded from: classes.dex */
public abstract class C0NH extends BasePendingResult implements C0NK {
    public final C227213r A00;
    public final C227413u A01;

    public abstract void A0C(InterfaceC227113q interfaceC227113q);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NH(C227413u c227413u, C0NE c0ne) {
        super(c0ne);
        C07K.A1Q(c0ne, "GoogleApiClient must not be null");
        C07K.A1Q(c227413u, "Api must not be null");
        this.A00 = c227413u.A00();
        this.A01 = c227413u;
    }

    public final void A0B(InterfaceC227113q interfaceC227113q) {
        try {
            A0C(interfaceC227113q);
        } catch (DeadObjectException e) {
            A0D(new Status(1, 8, e.getLocalizedMessage(), null));
            throw e;
        } catch (RemoteException e2) {
            A0D(new Status(1, 8, e2.getLocalizedMessage(), null));
        }
    }

    public final void A0D(Status status) {
        C07K.A1b(!(status.A01 <= 0), "Failed result must not be success");
        A07(A04(status));
    }
}
