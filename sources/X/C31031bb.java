package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.1bb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C31031bb extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15U
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            Account account = null;
            GoogleSignInAccount googleSignInAccount = null;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i3 = 65535 & readInt;
                if (i3 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i3 == 2) {
                    account = (Account) C07K.A0W(parcel, readInt, Account.CREATOR);
                } else if (i3 == 3) {
                    i2 = C07K.A0A(parcel, readInt);
                } else if (i3 != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    googleSignInAccount = (GoogleSignInAccount) C07K.A0W(parcel, readInt, GoogleSignInAccount.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31031bb(i, account, i2, googleSignInAccount);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31031bb[i];
        }
    };
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    public C31031bb(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }

    public C31031bb(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this.A00 = 2;
        this.A02 = account;
        this.A01 = i;
        this.A03 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1L(parcel, 2, this.A02, i, false);
        AnonymousClass088.A1G(parcel, 3, this.A01);
        AnonymousClass088.A1L(parcel, 4, this.A03, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
