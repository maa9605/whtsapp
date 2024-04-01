package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.12w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C225512w implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.12v
        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C225512w[0];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C225512w(parcel);
        }
    };
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C225512w(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C225512w.class != obj.getClass()) {
            return false;
        }
        C225512w c225512w = (C225512w) obj;
        return this.A02 == c225512w.A02 && this.A01 == c225512w.A01 && this.A03 == c225512w.A03 && Arrays.equals(this.A04, c225512w.A04);
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.A04) + ((((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31);
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("ColorInfo(");
        A0P.append(this.A02);
        A0P.append(", ");
        A0P.append(this.A01);
        A0P.append(", ");
        A0P.append(this.A03);
        A0P.append(", ");
        A0P.append(this.A04 != null);
        A0P.append(")");
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A04;
        parcel.writeInt(bArr != null ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
