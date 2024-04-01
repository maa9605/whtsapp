package com.google.android.gms.auth.api.signin;

import X.AnonymousClass088;
import X.C08G;
import X.C31261bz;
import X.InterfaceC232215r;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends C08G implements ReflectedParcelable {
    public long A00;
    public Uri A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public Set A0B = new HashSet();
    public final int A0C;
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13c
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Uri uri = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList = null;
            String str7 = null;
            String str8 = null;
            long j = 0;
            int i = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 1:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 2:
                        str = C07K.A0u(parcel, readInt);
                        break;
                    case 3:
                        str2 = C07K.A0u(parcel, readInt);
                        break;
                    case 4:
                        str3 = C07K.A0u(parcel, readInt);
                        break;
                    case 5:
                        str4 = C07K.A0u(parcel, readInt);
                        break;
                    case 6:
                        uri = (Uri) C07K.A0W(parcel, readInt, Uri.CREATOR);
                        break;
                    case 7:
                        str5 = C07K.A0u(parcel, readInt);
                        break;
                    case 8:
                        j = C07K.A0N(parcel, readInt);
                        break;
                    case 9:
                        str6 = C07K.A0u(parcel, readInt);
                        break;
                    case 10:
                        arrayList = C07K.A0z(parcel, readInt, Scope.CREATOR);
                        break;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        str7 = C07K.A0u(parcel, readInt);
                        break;
                    case 12:
                        str8 = C07K.A0u(parcel, readInt);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GoogleSignInAccount[i];
        }
    };
    public static InterfaceC232215r A0D = C31261bz.A00;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.A0C = i;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = uri;
        this.A06 = str5;
        this.A00 = j;
        this.A07 = str6;
        this.A0A = list;
        this.A08 = str7;
        this.A09 = str8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            if (googleSignInAccount.A07.equals(this.A07)) {
                HashSet hashSet = new HashSet(googleSignInAccount.A0A);
                hashSet.addAll(googleSignInAccount.A0B);
                HashSet hashSet2 = new HashSet(this.A0A);
                hashSet2.addAll(this.A0B);
                if (hashSet.equals(hashSet2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        HashSet hashSet = new HashSet(this.A0A);
        hashSet.addAll(this.A0B);
        return hashSet.hashCode() + ((this.A07.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A0C);
        AnonymousClass088.A1M(parcel, 2, this.A02, false);
        AnonymousClass088.A1M(parcel, 3, this.A03, false);
        AnonymousClass088.A1M(parcel, 4, this.A04, false);
        AnonymousClass088.A1M(parcel, 5, this.A05, false);
        AnonymousClass088.A1L(parcel, 6, this.A01, i, false);
        AnonymousClass088.A1M(parcel, 7, this.A06, false);
        AnonymousClass088.A1I(parcel, 8, this.A00);
        AnonymousClass088.A1M(parcel, 9, this.A07, false);
        AnonymousClass088.A1O(parcel, 10, this.A0A, false);
        AnonymousClass088.A1M(parcel, 11, this.A08, false);
        AnonymousClass088.A1M(parcel, 12, this.A09, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
