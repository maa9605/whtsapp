package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1po  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39241po extends C1ZZ {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.10Q
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C39241po(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C39241po[i];
        }
    };
    public final String A00;
    public final String A01;

    public C39241po(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C39241po(String str, String str2) {
        super(str);
        this.A00 = null;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39241po.class != obj.getClass()) {
            return false;
        }
        C39241po c39241po = (C39241po) obj;
        return super.A00.equals(((C1ZZ) c39241po).A00) && C08M.A08(this.A00, c39241po.A00) && C08M.A08(this.A01, c39241po.A01);
    }

    public int hashCode() {
        int hashCode = (super.A00.hashCode() + 527) * 31;
        String str = this.A00;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A01;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.A00);
        sb.append(": value=");
        sb.append(this.A01);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
