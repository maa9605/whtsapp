package com.google.android.gms.wearable.internal;

import X.AnonymousClass088;
import X.C000200d;
import X.C07K;
import X.C08G;
import X.C19S;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;

@KeepName
/* loaded from: classes.dex */
public class DataItemAssetParcelable extends C08G implements C19S, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19b
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            String str2 = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str2 = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new DataItemAssetParcelable(str, str2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new DataItemAssetParcelable[i];
        }
    };
    public final String A00;
    public final String A01;

    public DataItemAssetParcelable(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public DataItemAssetParcelable(C19S c19s) {
        String id = c19s.getId();
        C07K.A1P(id);
        this.A00 = id;
        String A9e = c19s.A9e();
        C07K.A1P(A9e);
        this.A01 = A9e;
    }

    @Override // X.C19S
    public String A9e() {
        return this.A01;
    }

    @Override // X.C19S
    public String getId() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0V = C000200d.A0V("DataItemAssetParcelable[", "@");
        A0V.append(Integer.toHexString(hashCode()));
        String str = this.A00;
        if (str == null) {
            A0V.append(",noid");
        } else {
            A0V.append(",");
            A0V.append(str);
        }
        A0V.append(", key=");
        return C000200d.A0L(A0V, this.A01, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A00, false);
        AnonymousClass088.A1M(parcel, 3, this.A01, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
