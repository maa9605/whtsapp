package com.google.android.gms.common.api;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import X.C08H;
import X.C08L;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends C08G implements C08H, ReflectedParcelable {
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;
    public static final Status A07 = new Status(1, 0, null, null);
    public static final Status A06 = new Status(1, 14, null, null);
    public static final Status A05 = new Status(1, 8, null, null);
    public static final Status A08 = new Status(1, 15, null, null);
    public static final Status A04 = new Status(1, 16, null, null);
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.14l
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            PendingIntent pendingIntent = null;
            int i = 0;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i3 = 65535 & readInt;
                if (i3 == 1) {
                    i2 = C07K.A0A(parcel, readInt);
                } else if (i3 == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i3 == 3) {
                    pendingIntent = (PendingIntent) C07K.A0W(parcel, readInt, PendingIntent.CREATOR);
                } else if (i3 != 1000) {
                    C07K.A1H(parcel, readInt);
                } else {
                    i = C07K.A0A(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new Status(i, i2, str, pendingIntent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new Status[i];
        }
    };

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A02 = pendingIntent;
    }

    @Override // X.C08H
    public final Status ADG() {
        return this;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.A00 == status.A00 && this.A01 == status.A01 && C07K.A1k(this.A03, status.A03) && C07K.A1k(this.A02, status.A02);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A03, this.A02});
    }

    public final String toString() {
        C08L A0q = C07K.A0q(this);
        String str = this.A03;
        if (str == null) {
            str = C07K.A0t(this.A01);
        }
        A0q.A00("statusCode", str);
        A0q.A00("resolution", this.A02);
        return A0q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A01);
        AnonymousClass088.A1M(parcel, 2, this.A03, false);
        AnonymousClass088.A1L(parcel, 3, this.A02, i, false);
        AnonymousClass088.A1G(parcel, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A00);
        AnonymousClass088.A1D(parcel, A03);
    }
}
