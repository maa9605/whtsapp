package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2A2  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2A2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2to
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C2A2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C2A2[i];
        }
    };
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C2A2(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public C2A2(String str, String str2, String str3, int i, int i2) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof C2A2) && this.A02.equals(((C2A2) obj).A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
