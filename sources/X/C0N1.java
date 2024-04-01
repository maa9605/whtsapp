package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0N1 */
/* loaded from: classes.dex */
public final class C0N1 extends C0N2 {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2uD
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0N1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0N1[i];
        }
    };
    public String A00;

    @Override // X.C0N2
    public int A08() {
        return 5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0N1(C03650Gn c03650Gn, String str, String str2, C0N0 c0n0) {
        this.A00 = str2;
        if (c03650Gn != null) {
            this.A05 = c03650Gn;
            this.A07 = str;
            this.A06 = c0n0;
            this.A0A = "";
            return;
        }
        throw null;
    }

    public C0N1(Parcel parcel) {
        A07(parcel);
        this.A00 = parcel.readString();
    }

    @Override // X.C0N2
    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ MERCHANT: ");
        A0P.append(super.toString());
        A0P.append(" merchantId: ");
        return C000200d.A0L(A0P, this.A00, " ]");
    }

    @Override // X.C0N2, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
