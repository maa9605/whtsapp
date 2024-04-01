package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0wy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20180wy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0wv
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C20180wy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C20180wy[i];
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C1YM A06;
    public C20170wx A07;
    public Object A08;
    public Object A09;
    public String A0A;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C20180wy() {
    }

    public C20180wy(long j, String str, C1YM c1ym, int i, Object obj, Object obj2, long j2, int i2, int i3, int i4, C20170wx c20170wx) {
        this.A05 = j;
        this.A0A = str;
        this.A06 = c1ym;
        this.A01 = i;
        this.A09 = obj;
        this.A08 = obj2;
        this.A04 = j2;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A07 = c20170wx;
    }

    public C20180wy(C20180wy c20180wy, int i) {
        this(c20180wy.A05, c20180wy.A0A, c20180wy.A06, c20180wy.A01, c20180wy.A09, c20180wy.A08, c20180wy.A04, c20180wy.A02, c20180wy.A03, i, c20180wy.A07);
    }

    public C20180wy(Parcel parcel) {
        this.A05 = parcel.readLong();
        this.A0A = parcel.readString();
        this.A01 = parcel.readInt();
        this.A09 = null;
        this.A08 = null;
        this.A04 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = (C20170wx) C20170wx.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        this.A07.writeToParcel(parcel, i);
    }
}
