package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.2wr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61872wr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2wq
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C61872wr(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C61872wr[i];
        }
    };
    public final C61852wp A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final ArrayList A05;
    public final boolean A06;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C61872wr(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A05 = parcel.createTypedArrayList(CREATOR);
        this.A06 = parcel.readByte() != 0;
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (C61852wp) parcel.readParcelable(C61852wp.class.getClassLoader());
    }

    public C61872wr(String str, String str2, ArrayList arrayList, boolean z, String str3, String str4, C61852wp c61852wp) {
        this.A02 = str;
        this.A03 = str2;
        this.A05 = arrayList;
        this.A06 = z;
        this.A01 = str3;
        this.A04 = str4;
        this.A00 = c61852wp;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C61872wr) {
            C61872wr c61872wr = (C61872wr) obj;
            if (c61872wr.A02.equals(this.A02) && c61872wr.A03.equals(this.A03) && c61872wr.A06 == this.A06) {
                ArrayList arrayList = this.A05;
                ArrayList arrayList2 = c61872wr.A05;
                if (arrayList != null) {
                    if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                        return false;
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (!arrayList.get(i).equals(arrayList2.get(i))) {
                            return false;
                        }
                    }
                    return true;
                } else if (arrayList2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeTypedList(this.A05);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
    }
}
