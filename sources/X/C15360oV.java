package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.0oV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15360oV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0oU
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C15360oV(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C15360oV[i];
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int[] A08;
    public int[] A09;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C15360oV() {
    }

    public C15360oV(C15360oV c15360oV) {
        this.A02 = c15360oV.A02;
        this.A00 = c15360oV.A00;
        this.A03 = c15360oV.A03;
        this.A09 = c15360oV.A09;
        this.A01 = c15360oV.A01;
        this.A08 = c15360oV.A08;
        this.A07 = c15360oV.A07;
        this.A05 = c15360oV.A05;
        this.A06 = c15360oV.A06;
        this.A04 = c15360oV.A04;
    }

    public C15360oV(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        int readInt = parcel.readInt();
        this.A02 = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.A09 = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.A01 = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.A08 = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.A07 = parcel.readInt() == 1;
        this.A05 = parcel.readInt() == 1;
        this.A06 = parcel.readInt() == 1;
        this.A04 = parcel.readArrayList(C15330oS.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        if (this.A02 > 0) {
            parcel.writeIntArray(this.A09);
        }
        parcel.writeInt(this.A01);
        if (this.A01 > 0) {
            parcel.writeIntArray(this.A08);
        }
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeList(this.A04);
    }
}
