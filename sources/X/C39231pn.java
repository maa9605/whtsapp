package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1pn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39231pn extends C1ZZ {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.10P
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C39231pn(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C39231pn[i];
        }
    };
    public final String A00;
    public final String A01;
    public final String A02;

    public C39231pn(Parcel parcel) {
        super("----");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public C39231pn(String str, String str2, String str3) {
        super("----");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39231pn.class != obj.getClass()) {
            return false;
        }
        C39231pn c39231pn = (C39231pn) obj;
        return C08M.A08(this.A00, c39231pn.A00) && C08M.A08(this.A01, c39231pn.A01) && C08M.A08(this.A02, c39231pn.A02);
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
        sb.append(": domain=");
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
