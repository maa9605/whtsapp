package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0N7 */
/* loaded from: classes.dex */
public final class C0N7 extends C0N2 {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2u8
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0N7(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0N7[i];
        }
    };
    public int A00;
    public int A01;

    public static String A06(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "elo" : "discover" : "amex" : "mastercard" : "visa";
    }

    public static String A07(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return "Elo";
                    }
                    return "Discover";
                }
                return "American Express";
            }
            return "MasterCard";
        }
        return "Visa";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0N7(C03650Gn c03650Gn, String str, String str2, int i, int i2, int i3, String str3, int i4) {
        this.A00 = i;
        this.A01 = i4;
        this.A08 = str2;
        if (c03650Gn != null) {
            this.A05 = c03650Gn;
            A06(i2);
            A05(i3);
            this.A07 = str;
            if (str3 != null) {
                this.A0A = str3;
                return;
            }
            return;
        }
        throw null;
    }

    public C0N7(Parcel parcel) {
        A07(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public static int A04(String str) {
        if ("debit".equals(str)) {
            return 1;
        }
        if ("credit".equals(str)) {
            return 4;
        }
        if ("combo".equals(str)) {
            return 6;
        }
        if ("prepaid".equals(str)) {
            return 8;
        }
        return "UNKNOWN".equals(str) ? 7 : 0;
    }

    public static int A05(String str) {
        if ("visa".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("mastercard".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("amex".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("discover".equalsIgnoreCase(str)) {
            return 4;
        }
        return "elo".equalsIgnoreCase(str) ? 5 : 0;
    }

    @Override // X.C0N2
    public int A08() {
        return this.A00;
    }

    @Override // X.C0N2
    public String toString() {
        return C000200d.A0L(C000200d.A0P("[ CARD: "), super.toString(), " ]");
    }

    @Override // X.C0N2, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
