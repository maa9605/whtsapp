package com.google.android.gms.common.api;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.14k
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            String str = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new Scope(i, str);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new Scope[i];
        }
    };
    public final int A00;
    public final String A01;

    public Scope(int i, String str) {
        C07K.A1V(str, "scopeUri must not be null or empty");
        this.A00 = i;
        this.A01 = str;
    }

    public Scope(String str) {
        C07K.A1V(str, "scopeUri must not be null or empty");
        this.A00 = 1;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.A01.equals(((Scope) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1M(parcel, 2, this.A01, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
