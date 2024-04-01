package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1pm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39221pm extends C1ZZ {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.10O
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C39221pm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C39221pm[i];
        }
    };
    public final String A00;
    public final String A01;
    public final String A02;

    public C39221pm(Parcel parcel) {
        super("COMM");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public C39221pm(String str, String str2) {
        super("COMM");
        this.A01 = "und";
        this.A00 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39221pm.class != obj.getClass()) {
            return false;
        }
        C39221pm c39221pm = (C39221pm) obj;
        return C08M.A08(this.A00, c39221pm.A00) && C08M.A08(this.A01, c39221pm.A01) && C08M.A08(this.A02, c39221pm.A02);
    }

    public int hashCode() {
        String str = this.A01;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A00;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A02;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.A00);
        sb.append(": language=");
        sb.append(this.A01);
        sb.append(", description=");
        sb.append(this.A00);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
