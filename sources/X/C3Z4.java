package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Z4 */
/* loaded from: classes2.dex */
public final class C3Z4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3Z3
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C3Z4(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C3Z4[i];
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C3Z5 A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C3Z4(C3Z5 c3z5) {
        this.A01 = 0;
        this.A05 = c3z5;
    }

    public C3Z4(Parcel parcel) {
        this.A01 = 0;
        this.A05 = C3Z5.values()[parcel.readInt()];
        this.A08 = parcel.readString();
        this.A0B = parcel.readString();
        this.A01 = parcel.readInt();
        this.A07 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A0G = parcel.readByte() != 0;
        this.A0A = parcel.readString();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        this.A0E = parcel.readString();
        this.A04 = parcel.readLong();
        this.A09 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A06 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05.ordinal());
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A02);
        parcel.writeByte(this.A0G ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
    }
}
