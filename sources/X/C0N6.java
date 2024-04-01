package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0N6 */
/* loaded from: classes.dex */
public final class C0N6 extends C0N2 {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2u7
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0N6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0N6[i];
        }
    };

    @Override // X.C0N2
    public int A08() {
        return 2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0N6(C03650Gn c03650Gn) {
        if (c03650Gn != null) {
            this.A05 = c03650Gn;
            this.A03 = -1L;
            this.A04 = -1L;
            this.A00 = 0;
            this.A01 = 0;
            return;
        }
        throw null;
    }

    public C0N6(C03650Gn c03650Gn, String str, long j, long j2, int i, int i2, String str2, String str3, byte[] bArr, C0N0 c0n0) {
        if (c03650Gn != null) {
            this.A05 = c03650Gn;
            this.A03 = j;
            this.A04 = j2;
            this.A00 = i2;
            this.A01 = i;
            this.A07 = str;
            this.A0A = str2;
            this.A08 = str3;
            this.A0B = bArr;
            this.A06 = c0n0;
            return;
        }
        throw null;
    }

    public C0N6(Parcel parcel) {
        A07(parcel);
    }

    @Override // X.C0N2
    public String toString() {
        return C000200d.A0L(C000200d.A0P("[ BANK:"), super.toString(), " ]");
    }
}
