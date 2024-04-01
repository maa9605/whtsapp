package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class SignInConfiguration extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13a
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            GoogleSignInOptions googleSignInOptions = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i != 5) {
                    C07K.A1H(parcel, readInt);
                } else {
                    googleSignInOptions = (GoogleSignInOptions) C07K.A0W(parcel, readInt, GoogleSignInOptions.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new SignInConfiguration(str, googleSignInOptions);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SignInConfiguration[i];
        }
    };
    public GoogleSignInOptions A00;
    public final String A01;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C07K.A1T(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignInConfiguration) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.A01.equals(signInConfiguration.A01)) {
                GoogleSignInOptions googleSignInOptions = this.A00;
                GoogleSignInOptions googleSignInOptions2 = signInConfiguration.A00;
                if (googleSignInOptions == null) {
                    if (googleSignInOptions2 == null) {
                        return true;
                    }
                } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = str == null ? 0 : str.hashCode();
        GoogleSignInOptions googleSignInOptions = this.A00;
        return ((hashCode + 31) * 31) + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A01, false);
        AnonymousClass088.A1L(parcel, 5, this.A00, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
