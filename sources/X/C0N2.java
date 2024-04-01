package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0N2 */
/* loaded from: classes.dex */
public abstract class C0N2 implements Parcelable {
    public int A02;
    public long A03;
    public long A04;
    public C0N0 A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public byte[] A0B;
    public C03650Gn A05 = C03650Gn.A0F;
    public int A00 = 0;
    public int A01 = 0;

    public static String A02(int i) {
        switch (i) {
            case 1:
                return "Debit";
            case 2:
                return "Bank Account";
            case 3:
                return "PaymentWallet";
            case 4:
                return "Credit";
            case 5:
                return "Business Account";
            case 6:
                return "Combo";
            case 7:
            default:
                return null;
            case 8:
                return "Prepaid";
        }
    }

    public abstract int A08();

    public static int A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int hashCode = str.hashCode();
        return hashCode != -1211756856 ? hashCode != 35394935 ? (hashCode == 2066319421 && str.equals("FAILED")) ? 2 : 0 : str.equals("PENDING") ? 1 : 0 : str.equals("VERIFIED") ? 3 : 0;
    }

    public static C0N2 A01(int i, String str, C03650Gn c03650Gn, String str2, String str3) {
        if (i != 1) {
            if (i == 2) {
                C0N6 c0n6 = new C0N6(c03650Gn);
                c0n6.A07 = str2;
                c0n6.A0A = str3;
                c0n6.A08 = str;
                return c0n6;
            } else if (i == 3) {
                C0N4 c0n4 = new C0N4(c03650Gn, str2, 0, 0, str3, BigDecimal.ZERO, c03650Gn.A0A);
                c0n4.A06 = null;
                return c0n4;
            } else if (i != 4 && i != 6 && i != 8) {
                return null;
            }
        }
        return new C0N7(c03650Gn, str2, str, i, 0, 0, str3, C0N7.A05(str));
    }

    public static List A03(List list, C03650Gn c03650Gn) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0N2 c0n2 = (C0N2) it.next();
            if (AnonymousClass029.A1a(c03650Gn.A06, c0n2.A08())) {
                if (c0n2.A01 == 2) {
                    arrayList.add(0, c0n2);
                } else {
                    arrayList.add(c0n2);
                }
            }
        }
        return arrayList;
    }

    public Bitmap A04() {
        byte[] bArr;
        int A08 = A08();
        if ((A08 != 1 && A08 != 2 && A08 != 3 && A08 != 4 && A08 != 6 && A08 != 7) || (bArr = this.A0B) == null) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public void A05(int i) {
        if (this.A01 == 1) {
            int i2 = this.A05.A01;
            int A08 = A08();
            if (i2 != A08) {
                StringBuilder A0P = C000200d.A0P("PAY: ");
                A0P.append(A08);
                A0P.append(" in country cannot be primary account type");
                throw new IllegalArgumentException(A0P.toString());
            }
        }
        this.A00 = i;
    }

    public void A06(int i) {
        if (i == 1) {
            int i2 = this.A05.A00;
            int A08 = A08();
            if (i2 != A08) {
                StringBuilder A0P = C000200d.A0P("PAY: ");
                A0P.append(A08);
                A0P.append(" in country cannot be primary account type");
                throw new IllegalArgumentException(A0P.toString());
            }
        }
        this.A01 = i;
    }

    public void A07(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A05 = C03650Gn.A00(parcel.readString().trim().toUpperCase(Locale.US));
        this.A0A = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        int readInt = parcel.readInt();
        this.A0B = null;
        if (readInt != 0) {
            byte[] bArr = new byte[readInt];
            this.A0B = bArr;
            parcel.readByteArray(bArr);
        }
        this.A06 = null;
        if (parcel.readByte() == 1) {
            this.A06 = (C0N0) parcel.readParcelable(C0K9.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0N2) && (str = ((C0N2) obj).A07) != null && str.equals(this.A07);
    }

    public int hashCode() {
        String str = this.A07;
        if (str == null) {
            return super.hashCode();
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("credential-id: ");
        A0P.append(this.A07);
        A0P.append(" country: ");
        A0P.append(this.A05.A02);
        A0P.append(" issuerName: ");
        A0P.append(this.A08);
        A0P.append(" payment-mode: ");
        A0P.append(this.A01);
        A0P.append(" payout-mode: ");
        A0P.append(this.A00);
        A0P.append(" merchant-credential-id: ");
        A0P.append(this.A09);
        A0P.append(" payout-verification-status: ");
        A0P.append(this.A02);
        A0P.append(" countrydata: ");
        A0P.append(this.A06);
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A05.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        byte[] bArr = this.A0B;
        parcel.writeInt(bArr == null ? 0 : bArr.length);
        byte[] bArr2 = this.A0B;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeByte(this.A06 != null ? (byte) 1 : (byte) 0);
        C0N0 c0n0 = this.A06;
        if (c0n0 != null) {
            parcel.writeParcelable(c0n0, 0);
        }
    }
}
