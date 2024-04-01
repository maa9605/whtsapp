package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.1pl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39211pl extends C1ZZ {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.10N
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C39211pl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C39211pl[i];
        }
    };
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public C39211pl(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public C39211pl(String str, byte[] bArr) {
        super("APIC");
        this.A02 = str;
        this.A01 = null;
        this.A00 = 3;
        this.A03 = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39211pl.class != obj.getClass()) {
            return false;
        }
        C39211pl c39211pl = (C39211pl) obj;
        return this.A00 == c39211pl.A00 && C08M.A08(this.A02, c39211pl.A02) && C08M.A08(this.A01, c39211pl.A01) && Arrays.equals(this.A03, c39211pl.A03);
    }

    public int hashCode() {
        int i = (527 + this.A00) * 31;
        String str = this.A02;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A01;
        return Arrays.hashCode(this.A03) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.A00);
        sb.append(": mimeType=");
        sb.append(this.A02);
        sb.append(", description=");
        sb.append(this.A01);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
