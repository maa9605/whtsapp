package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;
import java.util.ArrayList;

/* renamed from: X.2H3  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2H3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2yd
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C2H3(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C2H3[i];
        }
    };
    public int A00;
    public long A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public ArrayList A08;
    public boolean A09;
    public boolean A0A;
    public final double A0B;
    public final double A0C;
    public final int A0D;
    public final int A0E;
    public final String A0F;
    public transient Location A0G;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C2H3() {
        this.A08 = new ArrayList();
        this.A09 = false;
        this.A04 = null;
        this.A0E = 0;
        this.A0B = Double.MAX_VALUE;
        this.A0C = Double.MAX_VALUE;
        this.A0D = 0;
        this.A0F = "";
        this.A09 = false;
        this.A04 = null;
    }

    public C2H3(Location location, int i, String str) {
        this.A08 = new ArrayList();
        this.A09 = false;
        this.A04 = null;
        this.A0E = 3;
        this.A0B = location.getLatitude();
        this.A0C = location.getLongitude();
        this.A0D = i;
        this.A0F = str == null ? "" : str;
        this.A09 = false;
        this.A04 = null;
    }

    public C2H3(Parcel parcel) {
        this.A08 = new ArrayList();
        this.A09 = false;
        this.A04 = null;
        this.A0B = parcel.readDouble();
        this.A0C = parcel.readDouble();
        this.A0D = parcel.readInt();
        this.A0F = parcel.readString();
        this.A0E = parcel.readInt();
        this.A08 = parcel.createTypedArrayList(PlaceInfo.CREATOR);
        this.A03 = parcel.readString();
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0A = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            this.A02 = null;
        } else {
            this.A02 = Integer.valueOf(parcel.readInt());
        }
        this.A06 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A09 = parcel.readByte() != 0;
        this.A04 = parcel.readString();
    }

    public Location A00() {
        double d = this.A0B;
        if (d != Double.MAX_VALUE) {
            double d2 = this.A0C;
            if (d2 != Double.MAX_VALUE) {
                if (this.A0G == null) {
                    Location location = new Location("");
                    this.A0G = location;
                    location.setLatitude(d);
                    this.A0G.setLongitude(d2);
                }
                return this.A0G;
            }
            return null;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A0B);
        parcel.writeDouble(this.A0C);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A0E);
        parcel.writeTypedList(this.A08);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        if (this.A02 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.A02.intValue());
        }
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A04);
    }
}
