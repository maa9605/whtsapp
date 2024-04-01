package com.google.android.gms.maps.model;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import X.C08L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CameraPosition extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18e
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            float f = 0.0f;
            LatLng latLng = null;
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    latLng = (LatLng) C07K.A0W(parcel, readInt, LatLng.CREATOR);
                } else if (i == 3) {
                    f = C07K.A03(parcel, readInt);
                } else if (i == 4) {
                    f2 = C07K.A03(parcel, readInt);
                } else if (i != 5) {
                    C07K.A1H(parcel, readInt);
                } else {
                    f3 = C07K.A03(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new CameraPosition(latLng, f, f2, f3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CameraPosition[i];
        }
    };
    public final float A00;
    public final float A01;
    public final float A02;
    public final LatLng A03;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0014, code lost:
        if (r9 > 90.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CameraPosition(com.google.android.gms.maps.model.LatLng r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "null camera target"
            X.C07K.A1Q(r7, r0)
            r1 = 1
            r4 = 0
            r3 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 > 0) goto L16
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L17
        L16:
            r2 = 0
        L17:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r1[r4] = r0
            java.lang.String r0 = "Tilt needs to be between 0 and 90 inclusive: %s"
            X.C07K.A1d(r2, r0, r1)
            r6.A03 = r7
            r6.A02 = r8
            float r9 = r9 + r3
            r6.A01 = r9
            double r4 = (double) r10
            r2 = 0
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L36
            float r10 = r10 % r1
            float r10 = r10 + r1
        L36:
            float r10 = r10 % r1
            r6.A00 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.CameraPosition.<init>(com.google.android.gms.maps.model.LatLng, float, float, float):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraPosition) {
            CameraPosition cameraPosition = (CameraPosition) obj;
            return this.A03.equals(cameraPosition.A03) && Float.floatToIntBits(this.A02) == Float.floatToIntBits(cameraPosition.A02) && Float.floatToIntBits(this.A01) == Float.floatToIntBits(cameraPosition.A01) && Float.floatToIntBits(this.A00) == Float.floatToIntBits(cameraPosition.A00);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Float.valueOf(this.A02), Float.valueOf(this.A01), Float.valueOf(this.A00)});
    }

    public final String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("target", this.A03);
        A0q.A00("zoom", Float.valueOf(this.A02));
        A0q.A00("tilt", Float.valueOf(this.A01));
        A0q.A00("bearing", Float.valueOf(this.A00));
        return A0q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1L(parcel, 2, this.A03, i, false);
        AnonymousClass088.A1F(parcel, 3, this.A02);
        AnonymousClass088.A1F(parcel, 4, this.A01);
        AnonymousClass088.A1F(parcel, 5, this.A00);
        AnonymousClass088.A1D(parcel, A03);
    }
}
