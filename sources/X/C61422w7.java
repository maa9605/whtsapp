package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2w7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61422w7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2w6
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C61422w7(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C61422w7[i];
        }
    };
    public final int A00;
    public final int A01;
    public final String A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C61422w7(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public C61422w7(String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C61422w7.class.getName());
        sb.append("{url='");
        C000200d.A1P(sb, this.A02, '\'', ", width=");
        sb.append(this.A01);
        sb.append(", height=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
