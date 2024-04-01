package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1dH */
/* loaded from: classes.dex */
public abstract class AbstractBinderC31991dH extends BinderC234216o implements InterfaceC239218u {
    public AbstractBinderC31991dH() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // X.BinderC234216o
    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            C234316p.A00(parcel, C30451ab.CREATOR);
            C234316p.A00(parcel, C31981dG.CREATOR);
        } else if (i == 4) {
            C234316p.A00(parcel, Status.CREATOR);
        } else if (i == 6) {
            C234316p.A00(parcel, Status.CREATOR);
        } else if (i == 7) {
            C234316p.A00(parcel, Status.CREATOR);
            C234316p.A00(parcel, GoogleSignInAccount.CREATOR);
        } else if (i != 8) {
            return false;
        } else {
            AWU((C32021dK) C234316p.A00(parcel, C32021dK.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
