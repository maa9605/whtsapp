package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Jn */
/* loaded from: classes2.dex */
public final class C49302Jn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2w5
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C49302Jn(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C49302Jn[i];
        }
    };
    public final int A00;
    public final C61422w7 A01;
    public final C61422w7 A02;
    public final C61422w7 A03;
    public final String A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C49302Jn(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A02 = (C61422w7) parcel.readParcelable(C61422w7.class.getClassLoader());
        this.A03 = (C61422w7) parcel.readParcelable(C61422w7.class.getClassLoader());
        this.A01 = (C61422w7) parcel.readParcelable(C61422w7.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A05 = parcel.readInt() == 1;
    }

    public C49302Jn(String str, C61422w7 c61422w7, C61422w7 c61422w72, C61422w7 c61422w73, int i, boolean z) {
        this.A04 = str;
        this.A02 = c61422w7;
        this.A03 = c61422w72;
        this.A01 = c61422w73;
        this.A00 = i;
        this.A05 = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C49302Jn.class.getName());
        sb.append("{");
        sb.append("id='");
        C000200d.A1P(sb, this.A04, '\'', ", preview='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", staticPreview='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", content='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
