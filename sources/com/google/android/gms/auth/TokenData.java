package com.google.android.gms.auth;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class TokenData extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13i
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            Long l = null;
            ArrayList arrayList = null;
            String str2 = null;
            int i = 0;
            boolean z = false;
            boolean z2 = false;
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
                        int A0B = C07K.A0B(parcel, readInt);
                        if (A0B != 0) {
                            C07K.A1J(parcel, A0B, 8);
                            l = Long.valueOf(parcel.readLong());
                            break;
                        } else {
                            l = null;
                            break;
                        }
                    case 4:
                        z = C07K.A1i(parcel, readInt);
                        break;
                    case 5:
                        z2 = C07K.A1i(parcel, readInt);
                        break;
                    case 6:
                        arrayList = C07K.A0y(parcel, readInt);
                        break;
                    case 7:
                        str2 = C07K.A0u(parcel, readInt);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new TokenData(i, str, l, z, z2, arrayList, str2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TokenData[i];
        }
    };
    public final int A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.A00 = i;
        C07K.A1T(str);
        this.A03 = str;
        this.A01 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            return TextUtils.equals(this.A03, tokenData.A03) && C07K.A1k(this.A01, tokenData.A01) && this.A05 == tokenData.A05 && this.A06 == tokenData.A06 && C07K.A1k(this.A04, tokenData.A04) && C07K.A1k(this.A02, tokenData.A02);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A01, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), this.A04, this.A02});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1M(parcel, 2, this.A03, false);
        Long l = this.A01;
        if (l != null) {
            AnonymousClass088.A1H(parcel, 3, 8);
            parcel.writeLong(l.longValue());
        }
        AnonymousClass088.A1P(parcel, 4, this.A05);
        AnonymousClass088.A1P(parcel, 5, this.A06);
        AnonymousClass088.A1N(parcel, 6, this.A04);
        AnonymousClass088.A1M(parcel, 7, this.A02, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
