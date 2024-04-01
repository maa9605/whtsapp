package X;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.14J */
/* loaded from: classes.dex */
public abstract class C14J {
    public abstract void A01(Status status);

    public abstract void A02(C39561qK c39561qK);

    public abstract void A03(C14G c14g, boolean z);

    public abstract void A04(RuntimeException runtimeException);

    public static Status A00(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
