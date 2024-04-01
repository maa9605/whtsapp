package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0eC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09500eC implements Parcelable {
    public static final C09500eC A04 = new C09500eC(null, null, null, null);
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2ps
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C09500eC(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C09500eC[i];
        }
    };
    public final Double A00;
    public final Double A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C09500eC(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A02 = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A03 = readString2;
                if (parcel.readByte() == 0) {
                    this.A00 = null;
                } else {
                    this.A00 = Double.valueOf(parcel.readDouble());
                }
                if (parcel.readByte() == 0) {
                    this.A01 = null;
                    return;
                } else {
                    this.A01 = Double.valueOf(parcel.readDouble());
                    return;
                }
            }
            throw null;
        }
        throw null;
    }

    public C09500eC(String str, String str2, Double d, Double d2) {
        this.A02 = str == null ? "" : str;
        this.A03 = str2 == null ? "" : str2;
        this.A00 = d;
        this.A01 = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C09500eC.class != obj.getClass()) {
            return false;
        }
        C09500eC c09500eC = (C09500eC) obj;
        if (this.A02.equals(c09500eC.A02) && this.A03.equals(c09500eC.A03)) {
            Double d = this.A00;
            if (d != null) {
                if (!d.equals(c09500eC.A00)) {
                    return false;
                }
            } else if (c09500eC.A00 != null) {
                return false;
            }
            Double d2 = this.A01;
            Double d3 = c09500eC.A01;
            return d2 != null ? d2.equals(d3) : d3 == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.A03.hashCode() + (this.A02.hashCode() * 31)) * 31;
        Double d = this.A00;
        int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.A01;
        return hashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        Double d = this.A00;
        if (d == null) {
            d = "";
        }
        objArr[2] = d;
        Double d2 = this.A01;
        objArr[3] = d2 != null ? d2 : "";
        return String.format("%s, %s, %s, %s", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Double d = this.A00;
        if (d == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.A01;
        if (d2 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeDouble(d2.doubleValue());
    }
}
