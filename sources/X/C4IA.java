package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4IA */
/* loaded from: classes3.dex */
public final class C4IA extends C0N5 {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.47d
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            C4IA c4ia = new C4IA();
            c4ia.A07 = parcel.readString();
            c4ia.A06 = parcel.readString();
            c4ia.A0G = parcel.readByte() == 1;
            c4ia.A02 = parcel.readInt();
            c4ia.A00 = parcel.readInt();
            c4ia.A04 = parcel.readInt();
            c4ia.A0A = parcel.readString();
            ((C0N5) c4ia).A01 = parcel.readString();
            ((C0N5) c4ia).A02 = parcel.readString();
            c4ia.A0D = parcel.readString();
            c4ia.A0E = parcel.readString();
            c4ia.A09 = parcel.readString();
            c4ia.A03 = parcel.readInt();
            c4ia.A0B = parcel.readString();
            c4ia.A0C = parcel.readString();
            ArrayList arrayList = new ArrayList();
            c4ia.A0F = arrayList;
            parcel.readStringList(arrayList);
            int readInt = parcel.readInt();
            if (readInt != 0) {
                byte[] bArr = new byte[readInt];
                ((C0N5) c4ia).A09 = bArr;
                parcel.readByteArray(bArr);
            }
            ((C0N5) c4ia).A04 = parcel.readString();
            ((C0N5) c4ia).A05 = parcel.readString();
            ((C0N5) c4ia).A06 = parcel.readString();
            ((C0N5) c4ia).A00 = parcel.readLong();
            ((C0N5) c4ia).A07 = parcel.readInt() == 1;
            ((C0N5) c4ia).A08 = parcel.readInt() == 1;
            c4ia.A08 = parcel.readString();
            c4ia.A0H = parcel.readInt() == 1;
            return c4ia;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C4IA[i];
        }
    };
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public ArrayList A0F;
    public boolean A0G;
    public boolean A0H;
    public int A05 = 1;
    public int A01 = -1;

    @Override // X.C0N0
    public C0N2 A05() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.C0K9
    public String A01() {
        try {
            JSONObject A0C = A0C();
            A0C.put("v", this.A05);
            String str = this.A07;
            if (str != null) {
                A0C.put("accountProvider", str);
            }
            if (!TextUtils.isEmpty(this.A06)) {
                A0C.put("accountHolderName", this.A06);
            }
            int i = this.A02;
            if (i >= 0) {
                A0C.put("otpLength", i);
            }
            int i2 = this.A00;
            if (i2 >= 0) {
                A0C.put("atmPinLength", i2);
            }
            int i3 = this.A04;
            if (i3 >= 0) {
                A0C.put("upiPinLength", i3);
            }
            String str2 = this.A0A;
            if (str2 != null) {
                A0C.put("miscBankInfo", str2);
            }
            String str3 = this.A0D;
            if (str3 != null) {
                A0C.put("vpaHandle", str3);
            }
            String str4 = this.A0E;
            if (str4 != null) {
                A0C.put("vpaId", str4);
            }
            String str5 = this.A09;
            if (str5 != null) {
                A0C.put("bankCode", str5);
            }
            int i4 = this.A03;
            if (i4 >= 0) {
                A0C.put("pinFormat", i4);
            }
            A0C.put("isMpinSet", this.A0G);
            String str6 = this.A08;
            if (str6 != null) {
                A0C.put("accountType", str6);
            }
            return A0C.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiMethodData toDBString threw: ", e);
            return null;
        }
    }

    @Override // X.C0K9
    public void A02(int i, List list) {
        throw new UnsupportedOperationException("PAY: IndiaUpiMethodData toNetwork is unsupported");
    }

    @Override // X.C0K9
    public void A03(C013606n c013606n, int i, C02590Ca c02590Ca) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        try {
            if (i != 2) {
                C04P A0A = c02590Ca.A0A("provider");
                if (A0A != null) {
                    str9 = A0A.A03;
                } else {
                    str9 = null;
                }
                this.A07 = str9;
                C04P A0A2 = c02590Ca.A0A("account-name");
                if (A0A2 != null) {
                    str10 = A0A2.A03;
                } else {
                    str10 = null;
                }
                this.A06 = str10;
                C04P A0A3 = c02590Ca.A0A("is-mpin-set");
                if (A0A3 != null) {
                    str11 = A0A3.A03;
                } else {
                    str11 = null;
                }
                this.A0G = AnonymousClass024.A01(str11, 0) == 1;
                C04P A0A4 = c02590Ca.A0A("otp-length");
                if (A0A4 != null) {
                    str12 = A0A4.A03;
                } else {
                    str12 = null;
                }
                this.A02 = AnonymousClass024.A01(str12, 0);
                C04P A0A5 = c02590Ca.A0A("atm-pin-length");
                if (A0A5 != null) {
                    str13 = A0A5.A03;
                } else {
                    str13 = null;
                }
                this.A00 = AnonymousClass024.A01(str13, 0);
                C04P A0A6 = c02590Ca.A0A("mpin-length");
                if (A0A6 != null) {
                    str14 = A0A6.A03;
                } else {
                    str14 = null;
                }
                this.A04 = AnonymousClass024.A01(str14, 0);
                C04P A0A7 = c02590Ca.A0A("vpa");
                if (A0A7 != null) {
                    str15 = A0A7.A03;
                } else {
                    str15 = null;
                }
                this.A0D = str15;
                C04P A0A8 = c02590Ca.A0A("vpa-id");
                if (A0A8 != null) {
                    str16 = A0A8.A03;
                } else {
                    str16 = null;
                }
                this.A0E = str16;
                C04P A0A9 = c02590Ca.A0A("code");
                if (A0A9 != null) {
                    str17 = A0A9.A03;
                } else {
                    str17 = null;
                }
                this.A09 = str17;
                C04P A0A10 = c02590Ca.A0A("pin-format-version");
                if (A0A10 != null) {
                    str18 = A0A10.A03;
                } else {
                    str18 = null;
                }
                this.A03 = AnonymousClass024.A01(str18, 0);
                C04P A0A11 = c02590Ca.A0A("upi-bank-info");
                if (A0A11 != null) {
                    str19 = A0A11.A03;
                } else {
                    str19 = null;
                }
                this.A0A = str19;
                C04P A0A12 = c02590Ca.A0A("image");
                if (A0A12 != null) {
                    str20 = A0A12.A03;
                } else {
                    str20 = null;
                }
                super.A01 = str20;
                C04P A0A13 = c02590Ca.A0A("bank-phone-number");
                if (A0A13 != null) {
                    str21 = A0A13.A03;
                } else {
                    str21 = null;
                }
                super.A02 = str21;
                super.A09 = null;
                C04P A0A14 = c02590Ca.A0A("bank-name");
                if (A0A14 != null) {
                    str22 = A0A14.A03;
                } else {
                    str22 = null;
                }
                super.A05 = str22;
                C04P A0A15 = c02590Ca.A0A("credential-id");
                if (A0A15 != null) {
                    str23 = A0A15.A03;
                } else {
                    str23 = null;
                }
                super.A04 = str23;
                C04P A0A16 = c02590Ca.A0A("account-number");
                if (A0A16 != null) {
                    str24 = A0A16.A03;
                } else {
                    str24 = null;
                }
                super.A06 = str24;
                C04P A0A17 = c02590Ca.A0A("created");
                if (A0A17 != null) {
                    str25 = A0A17.A03;
                } else {
                    str25 = null;
                }
                super.A00 = AnonymousClass024.A03(str25, 0L) * 1000;
                C04P A0A18 = c02590Ca.A0A("default-credit");
                if (A0A18 != null) {
                    str26 = A0A18.A03;
                } else {
                    str26 = null;
                }
                super.A07 = AnonymousClass024.A01(str26, 0) == 1;
                C04P A0A19 = c02590Ca.A0A("default-debit");
                if (A0A19 != null) {
                    str27 = A0A19.A03;
                } else {
                    str27 = null;
                }
                super.A08 = AnonymousClass024.A01(str27, 0) == 1;
                C04P A0A20 = c02590Ca.A0A("account-type");
                if (A0A20 != null) {
                    str28 = A0A20.A03;
                } else {
                    str28 = null;
                }
                this.A08 = str28;
            } else {
                C04P A0A21 = c02590Ca.A0A("name");
                if (A0A21 != null) {
                    str = A0A21.A03;
                } else {
                    str = null;
                }
                super.A05 = str;
                C04P A0A22 = c02590Ca.A0A("bank-ref-id");
                if (A0A22 != null) {
                    str2 = A0A22.A03;
                } else {
                    str2 = null;
                }
                this.A07 = str2;
                C04P A0A23 = c02590Ca.A0A("image");
                if (A0A23 != null) {
                    str3 = A0A23.A03;
                } else {
                    str3 = null;
                }
                super.A01 = str3;
                C04P A0A24 = c02590Ca.A0A("code");
                if (A0A24 != null) {
                    str4 = A0A24.A03;
                } else {
                    str4 = null;
                }
                this.A09 = str4;
                C04P A0A25 = c02590Ca.A0A("bank-phone-number");
                if (A0A25 != null) {
                    str5 = A0A25.A03;
                } else {
                    str5 = null;
                }
                super.A02 = str5;
                C04P A0A26 = c02590Ca.A0A("popular-bank");
                if (A0A26 != null) {
                    str6 = A0A26.A03;
                } else {
                    str6 = null;
                }
                this.A0H = "1".equals(str6);
                C04P A0A27 = c02590Ca.A0A("psp-routing");
                if (A0A27 != null) {
                    str7 = A0A27.A03;
                } else {
                    str7 = null;
                }
                if (!TextUtils.isEmpty(str7)) {
                    this.A0F = new ArrayList(Arrays.asList(str7.split(",")));
                }
                if (this.A01 == -1) {
                    C04P A0A28 = c02590Ca.A0A("version");
                    if (A0A28 != null) {
                        str8 = A0A28.A03;
                    } else {
                        str8 = null;
                    }
                    this.A01 = AnonymousClass024.A01(str8, -1);
                }
            }
            C04P A0A29 = c02590Ca.A0A("transaction-prefix");
            String str29 = A0A29 != null ? A0A29.A03 : null;
            if (TextUtils.isEmpty(str29)) {
                return;
            }
            this.A0C = str29;
        } catch (Exception e) {
            Log.e("PAY: IndiaUpiMethodData fromNetwork", e);
        }
    }

    @Override // X.C0K9
    public void A04(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                super.A01 = jSONObject.optString("bankImageURL", null);
                super.A02 = jSONObject.optString("bankPhoneNumber", null);
                this.A05 = jSONObject.optInt("v", 1);
                this.A07 = jSONObject.optString("accountProvider", null);
                this.A06 = jSONObject.optString("accountHolderName", null);
                this.A02 = jSONObject.optInt("otpLength", -1);
                this.A00 = jSONObject.optInt("atmPinLength", -1);
                this.A04 = jSONObject.optInt("upiPinLength", -1);
                this.A0A = jSONObject.optString("miscBankInfo", null);
                this.A0D = jSONObject.optString("vpaHandle", null);
                this.A0E = jSONObject.optString("vpaId", null);
                this.A09 = jSONObject.optString("bankCode", null);
                this.A03 = jSONObject.optInt("pinFormat", 0);
                this.A0G = jSONObject.optBoolean("isMpinSet", false);
                this.A08 = jSONObject.optString("accountType", null);
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiMethodData fromDBString threw: ", e);
            }
        }
    }

    @Override // X.C0N0
    public String A06() {
        if (!TextUtils.isEmpty(this.A06)) {
            return this.A06;
        }
        try {
            return new JSONObject(this.A0A).optString("account_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // X.C0N0
    public LinkedHashSet A08() {
        return new LinkedHashSet(Collections.singletonList(C013806p.A05));
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ accountProvider: ");
        A0P.append(this.A07);
        A0P.append(" issuerName: ");
        A0P.append(super.A05);
        A0P.append(" bankImageUrl: ");
        A0P.append(super.A01);
        A0P.append(" icon length: ");
        byte[] bArr = super.A09;
        A0P.append(bArr != null ? bArr.length : 0);
        A0P.append(" isMpinSet: ");
        A0P.append(this.A0G);
        A0P.append(" otpLength: ");
        A0P.append(this.A02);
        A0P.append(" upiPinLength: ");
        A0P.append(this.A04);
        A0P.append(" atmPinLength: ");
        A0P.append(this.A00);
        A0P.append(" vpaHandle: ");
        A0P.append(C40841sx.A0Q(this.A0D));
        A0P.append(" vpaId: ");
        A0P.append(this.A0E);
        A0P.append(" bankPhoneNumber: ");
        A0P.append(super.A02);
        A0P.append(" bankCode: ");
        A0P.append(this.A09);
        A0P.append(" pinFormat: ");
        A0P.append(this.A03);
        A0P.append(" pspRouting: ");
        A0P.append(this.A0F);
        A0P.append(" supportPhoneNumber: ");
        A0P.append(this.A0B);
        A0P.append(" transactionPrefix: ");
        A0P.append(this.A0C);
        A0P.append(" banksListVersion: ");
        return C000200d.A0K(A0P, this.A01, " ]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0G ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeString(super.A01);
        parcel.writeString(super.A02);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeStringList(this.A0F);
        byte[] bArr = super.A09;
        parcel.writeInt(bArr == null ? 0 : bArr.length);
        byte[] bArr2 = super.A09;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeString(super.A04);
        parcel.writeString(super.A05);
        parcel.writeString(super.A06);
        parcel.writeLong(super.A00);
        parcel.writeInt(super.A07 ? 1 : 0);
        parcel.writeInt(super.A08 ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0H ? 1 : 0);
    }
}
