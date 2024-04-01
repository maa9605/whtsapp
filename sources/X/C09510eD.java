package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0eD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09510eD implements Parcelable {
    public static final C09510eD A04 = new C09510eD(null, null, C09500eC.A04);
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2pu
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C09510eD(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C09510eD[i];
        }
    };
    public final C09500eC A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C09510eD(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A01 = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A03 = readString2;
                String readString3 = parcel.readString();
                if (readString3 != null) {
                    this.A02 = readString3;
                    C09500eC c09500eC = (C09500eC) parcel.readParcelable(C09500eC.class.getClassLoader());
                    if (c09500eC == null) {
                        throw null;
                    }
                    this.A00 = c09500eC;
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public C09510eD(String str, String str2, C09500eC c09500eC) {
        this.A01 = "";
        this.A03 = str == null ? "" : str;
        this.A02 = str2 == null ? "" : str2;
        this.A00 = c09500eC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C09510eD.class != obj.getClass()) {
            return false;
        }
        C09510eD c09510eD = (C09510eD) obj;
        if (this.A01.equals(c09510eD.A01) && this.A03.equals(c09510eD.A03) && this.A02.equals(c09510eD.A02)) {
            return this.A00.equals(c09510eD.A00);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int hashCode2 = this.A02.hashCode();
        return this.A00.hashCode() + ((hashCode2 + ((this.A03.hashCode() + hashCode) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append(" ");
        sb.append(this.A02);
        sb.append(" ");
        sb.append(this.A00);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
