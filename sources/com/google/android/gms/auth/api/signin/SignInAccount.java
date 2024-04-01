package com.google.android.gms.auth.api.signin;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public class SignInAccount extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13f
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = "";
            GoogleSignInAccount googleSignInAccount = null;
            String str2 = "";
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 4) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i == 7) {
                    googleSignInAccount = (GoogleSignInAccount) C07K.A0W(parcel, readInt, GoogleSignInAccount.CREATOR);
                } else if (i != 8) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str2 = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new SignInAccount(str, googleSignInAccount, str2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SignInAccount[i];
        }
    };
    public GoogleSignInAccount A00;
    public String A01;
    public String A02;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.A00 = googleSignInAccount;
        C07K.A1V(str, "8.3 and 8.4 SDKs require non-null email");
        this.A01 = str;
        C07K.A1V(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 4, this.A01, false);
        AnonymousClass088.A1L(parcel, 7, this.A00, i, false);
        AnonymousClass088.A1M(parcel, 8, this.A02, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
