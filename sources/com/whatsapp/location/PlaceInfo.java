package com.whatsapp.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;

/* loaded from: classes.dex */
public class PlaceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2yc
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new PlaceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new PlaceInfo[i];
        }
    };
    public double A00;
    public double A01;
    public double A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public transient Location A0C;
    public transient Object A0D;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PlaceInfo() {
    }

    public PlaceInfo(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A0B = parcel.readString();
        this.A08 = parcel.readString();
        this.A01 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        this.A0A = parcel.readString();
        this.A07 = parcel.readString();
        this.A04 = parcel.readString();
        this.A09 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A03 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A03);
    }
}
