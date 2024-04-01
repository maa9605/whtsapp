package com.google.android.gms.location;

import X.AnonymousClass088;
import X.C000200d;
import X.C08G;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationRequest extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.187
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new LocationRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            long j = 3600000;
            long j2 = 600000;
            long j3 = Long.MAX_VALUE;
            long j4 = 0;
            int i = 102;
            boolean z = false;
            int i2 = Integer.MAX_VALUE;
            float f = 0.0f;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 1:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 2:
                        j = C07K.A0N(parcel, readInt);
                        break;
                    case 3:
                        j2 = C07K.A0N(parcel, readInt);
                        break;
                    case 4:
                        z = C07K.A1i(parcel, readInt);
                        break;
                    case 5:
                        j3 = C07K.A0N(parcel, readInt);
                        break;
                    case 6:
                        i2 = C07K.A0A(parcel, readInt);
                        break;
                    case 7:
                        f = C07K.A03(parcel, readInt);
                        break;
                    case 8:
                        j4 = C07K.A0N(parcel, readInt);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        }
    };
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;

    public LocationRequest() {
        this.A01 = 102;
        this.A04 = 3600000L;
        this.A05 = 600000L;
        this.A07 = false;
        this.A03 = Long.MAX_VALUE;
        this.A02 = Integer.MAX_VALUE;
        this.A00 = 0.0f;
        this.A06 = 0L;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.A01 = i;
        this.A04 = j;
        this.A05 = j2;
        this.A07 = z;
        this.A03 = j3;
        this.A02 = i2;
        this.A00 = f;
        this.A06 = j4;
    }

    public static void A00(long j) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        StringBuilder A0P = C000200d.A0P("Request[");
        int i = this.A01;
        A0P.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (i != 105) {
            A0P.append(" requested=");
            A0P.append(this.A04);
            A0P.append("ms");
        }
        A0P.append(" fastest=");
        A0P.append(this.A05);
        A0P.append("ms");
        long j = this.A06;
        if (j > this.A04) {
            A0P.append(" maxWait=");
            A0P.append(j);
            A0P.append("ms");
        }
        float f = this.A00;
        if (f > 0.0f) {
            A0P.append(" smallestDisplacement=");
            A0P.append(f);
            A0P.append("m");
        }
        long j2 = this.A03;
        if (j2 != Long.MAX_VALUE) {
            A0P.append(" expireIn=");
            A0P.append(j2 - SystemClock.elapsedRealtime());
            A0P.append("ms");
        }
        int i2 = this.A02;
        if (i2 != Integer.MAX_VALUE) {
            A0P.append(" num=");
            A0P.append(i2);
        }
        A0P.append(']');
        return A0P.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.A01 == locationRequest.A01) {
                long j = this.A04;
                long j2 = locationRequest.A04;
                if (j == j2 && this.A05 == locationRequest.A05 && this.A07 == locationRequest.A07 && this.A03 == locationRequest.A03 && this.A02 == locationRequest.A02 && this.A00 == locationRequest.A00) {
                    long j3 = this.A06;
                    if (j3 >= j) {
                        j = j3;
                    }
                    long j4 = locationRequest.A06;
                    if (j4 < j2) {
                        j4 = j2;
                    }
                    if (j == j4) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Long.valueOf(this.A04), Float.valueOf(this.A00), Long.valueOf(this.A06)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A01);
        AnonymousClass088.A1I(parcel, 2, this.A04);
        AnonymousClass088.A1I(parcel, 3, this.A05);
        AnonymousClass088.A1P(parcel, 4, this.A07);
        AnonymousClass088.A1I(parcel, 5, this.A03);
        AnonymousClass088.A1G(parcel, 6, this.A02);
        AnonymousClass088.A1F(parcel, 7, this.A00);
        AnonymousClass088.A1I(parcel, 8, this.A06);
        AnonymousClass088.A1D(parcel, A03);
    }
}
