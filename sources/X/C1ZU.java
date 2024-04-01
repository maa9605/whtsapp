package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.1ZU  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZU implements C10K {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.103
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1ZU(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1ZU[i];
        }
    };
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C1ZU(Parcel parcel) {
        this.A02 = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        this.A03 = bArr;
        parcel.readByteArray(bArr);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public C1ZU(String str, byte[] bArr, int i, int i2) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1ZU.class != obj.getClass()) {
            return false;
        }
        C1ZU c1zu = (C1ZU) obj;
        return this.A02.equals(c1zu.A02) && Arrays.equals(this.A03, c1zu.A03) && this.A00 == c1zu.A00 && this.A01 == c1zu.A01;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.A03) + ((this.A02.hashCode() + 527) * 31)) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("mdta: key=");
        A0P.append(this.A02);
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        byte[] bArr = this.A03;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
