package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1qF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39511qF extends C16Y implements C13Y {
    public final /* synthetic */ C18330tZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC39511qF(C18330tZ c18330tZ) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.A00 = c18330tZ;
    }

    @Override // X.C16Y
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                Parcelable.Creator creator = GoogleSignInAccount.CREATOR;
                if (parcel.readInt() != 0) {
                    creator.createFromParcel(parcel);
                }
                Parcelable.Creator creator2 = Status.CREATOR;
                if (parcel.readInt() != 0) {
                    creator2.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 102:
                Parcelable.Creator creator3 = Status.CREATOR;
                if (parcel.readInt() != 0) {
                    creator3.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            case 103:
                A07((Status) (parcel.readInt() == 0 ? null : (Parcelable) Status.CREATOR.createFromParcel(parcel)));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
