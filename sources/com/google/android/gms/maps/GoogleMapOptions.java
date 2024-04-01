package com.google.android.gms.maps;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import X.C08L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* loaded from: classes.dex */
public final class GoogleMapOptions extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18k
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            CameraPosition cameraPosition = null;
            Float f = null;
            Float f2 = null;
            LatLngBounds latLngBounds = null;
            byte b = -1;
            byte b2 = -1;
            int i = 0;
            byte b3 = -1;
            byte b4 = -1;
            byte b5 = -1;
            byte b6 = -1;
            byte b7 = -1;
            byte b8 = -1;
            byte b9 = -1;
            byte b10 = -1;
            byte b11 = -1;
            byte b12 = -1;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 2:
                        b = C07K.A00(parcel, readInt);
                        break;
                    case 3:
                        b2 = C07K.A00(parcel, readInt);
                        break;
                    case 4:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 5:
                        cameraPosition = (CameraPosition) C07K.A0W(parcel, readInt, CameraPosition.CREATOR);
                        break;
                    case 6:
                        b3 = C07K.A00(parcel, readInt);
                        break;
                    case 7:
                        b4 = C07K.A00(parcel, readInt);
                        break;
                    case 8:
                        b5 = C07K.A00(parcel, readInt);
                        break;
                    case 9:
                        b6 = C07K.A00(parcel, readInt);
                        break;
                    case 10:
                        b7 = C07K.A00(parcel, readInt);
                        break;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        b8 = C07K.A00(parcel, readInt);
                        break;
                    case 12:
                        b9 = C07K.A00(parcel, readInt);
                        break;
                    case 13:
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                    case 14:
                        b10 = C07K.A00(parcel, readInt);
                        break;
                    case 15:
                        b11 = C07K.A00(parcel, readInt);
                        break;
                    case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                        f = C07K.A0r(parcel, readInt);
                        break;
                    case 17:
                        f2 = C07K.A0r(parcel, readInt);
                        break;
                    case 18:
                        latLngBounds = (LatLngBounds) C07K.A0W(parcel, readInt, LatLngBounds.CREATOR);
                        break;
                    case 19:
                        b12 = C07K.A00(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GoogleMapOptions[i];
        }
    };
    public int A00;
    public CameraPosition A01;
    public LatLngBounds A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Float A0F;
    public Float A0G;

    public GoogleMapOptions() {
        this.A00 = -1;
        this.A0F = null;
        this.A0G = null;
        this.A02 = null;
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12) {
        this.A00 = -1;
        this.A0F = null;
        this.A0G = null;
        this.A02 = null;
        this.A03 = AnonymousClass088.A0k(b);
        this.A04 = AnonymousClass088.A0k(b2);
        this.A00 = i;
        this.A01 = cameraPosition;
        this.A05 = AnonymousClass088.A0k(b3);
        this.A06 = AnonymousClass088.A0k(b4);
        this.A07 = AnonymousClass088.A0k(b5);
        this.A08 = AnonymousClass088.A0k(b6);
        this.A09 = AnonymousClass088.A0k(b7);
        this.A0A = AnonymousClass088.A0k(b8);
        this.A0B = AnonymousClass088.A0k(b9);
        this.A0C = AnonymousClass088.A0k(b10);
        this.A0D = AnonymousClass088.A0k(b11);
        this.A0F = f;
        this.A0G = f2;
        this.A02 = latLngBounds;
        this.A0E = AnonymousClass088.A0k(b12);
    }

    public final String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("MapType", Integer.valueOf(this.A00));
        A0q.A00("LiteMode", this.A0B);
        A0q.A00("Camera", this.A01);
        A0q.A00("CompassEnabled", this.A06);
        A0q.A00("ZoomControlsEnabled", this.A05);
        A0q.A00("ScrollGesturesEnabled", this.A07);
        A0q.A00("ZoomGesturesEnabled", this.A08);
        A0q.A00("TiltGesturesEnabled", this.A09);
        A0q.A00("RotateGesturesEnabled", this.A0A);
        A0q.A00("ScrollGesturesEnabledDuringRotateOrZoom", this.A0E);
        A0q.A00("MapToolbarEnabled", this.A0C);
        A0q.A00("AmbientEnabled", this.A0D);
        A0q.A00("MinZoomPreference", this.A0F);
        A0q.A00("MaxZoomPreference", this.A0G);
        A0q.A00("LatLngBoundsForCameraTarget", this.A02);
        A0q.A00("ZOrderOnTop", this.A03);
        A0q.A00("UseViewLifecycleInFragment", this.A04);
        return A0q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1E(parcel, 2, AnonymousClass088.A00(this.A03));
        AnonymousClass088.A1E(parcel, 3, AnonymousClass088.A00(this.A04));
        AnonymousClass088.A1G(parcel, 4, this.A00);
        AnonymousClass088.A1L(parcel, 5, this.A01, i, false);
        AnonymousClass088.A1E(parcel, 6, AnonymousClass088.A00(this.A05));
        AnonymousClass088.A1E(parcel, 7, AnonymousClass088.A00(this.A06));
        AnonymousClass088.A1E(parcel, 8, AnonymousClass088.A00(this.A07));
        AnonymousClass088.A1E(parcel, 9, AnonymousClass088.A00(this.A08));
        AnonymousClass088.A1E(parcel, 10, AnonymousClass088.A00(this.A09));
        AnonymousClass088.A1E(parcel, 11, AnonymousClass088.A00(this.A0A));
        AnonymousClass088.A1E(parcel, 12, AnonymousClass088.A00(this.A0B));
        AnonymousClass088.A1E(parcel, 14, AnonymousClass088.A00(this.A0C));
        AnonymousClass088.A1E(parcel, 15, AnonymousClass088.A00(this.A0D));
        Float f = this.A0F;
        if (f != null) {
            AnonymousClass088.A1H(parcel, 16, 4);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.A0G;
        if (f2 != null) {
            AnonymousClass088.A1H(parcel, 17, 4);
            parcel.writeFloat(f2.floatValue());
        }
        AnonymousClass088.A1L(parcel, 18, this.A02, i, false);
        AnonymousClass088.A1E(parcel, 19, AnonymousClass088.A00(this.A0E));
        AnonymousClass088.A1D(parcel, A03);
    }
}
