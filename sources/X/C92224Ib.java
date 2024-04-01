package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Ib */
/* loaded from: classes3.dex */
public class C92224Ib extends C0N8 {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.48l
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            C92224Ib c92224Ib = new C92224Ib();
            c92224Ib.A0X = parcel.readByte() == 1;
            c92224Ib.A0A = parcel.readString();
            c92224Ib.A0B = parcel.readString();
            c92224Ib.A09 = parcel.readString();
            c92224Ib.A0O = parcel.readString();
            c92224Ib.A0T = parcel.readByte() == 1;
            ((C0N8) c92224Ib).A03 = parcel.readInt();
            c92224Ib.A0V = parcel.readByte() == 1;
            c92224Ib.A0U = parcel.readByte() == 1;
            ((C0N8) c92224Ib).A06 = parcel.readLong();
            ((C0N8) c92224Ib).A04 = parcel.readInt();
            c92224Ib.A0G = parcel.readString();
            c92224Ib.A0H = parcel.readString();
            ((C0N8) c92224Ib).A00 = parcel.readInt();
            c92224Ib.A0Q = parcel.readByte() == 1;
            c92224Ib.A0P = parcel.readByte() == 1;
            c92224Ib.A0J = parcel.readString();
            ((C0N8) c92224Ib).A05 = parcel.readLong();
            ((C0N8) c92224Ib).A01 = parcel.readInt();
            c92224Ib.A07 = parcel.readByte() == 1;
            c92224Ib.A03 = parcel.readString();
            c92224Ib.A06 = parcel.readString();
            c92224Ib.A00 = parcel.readInt();
            c92224Ib.A04 = parcel.readString();
            c92224Ib.A01 = parcel.readInt();
            c92224Ib.A0C = parcel.readString();
            c92224Ib.A0E = parcel.readString();
            c92224Ib.A0D = parcel.readString();
            ((C0N8) c92224Ib).A07 = Long.valueOf(parcel.readLong());
            c92224Ib.A05 = parcel.readString();
            c92224Ib.A0F = parcel.readString();
            c92224Ib.A0I = parcel.readString();
            c92224Ib.A0S = parcel.readByte() == 1;
            c92224Ib.A0W = parcel.readByte() == 1;
            c92224Ib.A0R = parcel.readByte() == 1;
            c92224Ib.A0N = parcel.readString();
            c92224Ib.A0M = parcel.readString();
            c92224Ib.A0L = parcel.readString();
            c92224Ib.A0K = parcel.readString();
            return c92224Ib;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C92224Ib[i];
        }
    };
    public int A01;
    public String A04;
    public String A05;
    public boolean A07;
    public int A02 = 1;
    public String A03 = null;
    public String A06 = null;
    public int A00 = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.C0K9
    public String A01() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("verified", this.A0X);
                String str = this.A0A;
                if (str != null) {
                    jSONObject.put("bankName", str);
                }
                String str2 = this.A08;
                if (str2 != null) {
                    jSONObject.put("bankCode", str2);
                }
                String str3 = this.A0B;
                if (str3 != null) {
                    jSONObject.put("bankPhoneNumber", str3);
                }
                String str4 = this.A09;
                if (str4 != null) {
                    jSONObject.put("bankLogoUrl", str4);
                }
                long j = super.A06;
                if (j >= 0) {
                    jSONObject.put("timeLastAdded", j);
                }
                String str5 = this.A0O;
                if (str5 != null) {
                    jSONObject.put("verificationType", str5);
                }
                if ("otp".equals(this.A0O)) {
                    jSONObject.put("otpNumberMatch", this.A0T);
                }
                int i = super.A02;
                if (i >= 0) {
                    jSONObject.put("otpLength", i);
                }
                String str6 = this.A0I;
                if (str6 != null) {
                    jSONObject.put("displayState", str6);
                }
                try {
                    jSONObject.put("editable", this.A0S);
                    jSONObject.put("verifiable", this.A0W);
                    jSONObject.put("defaultEligible", this.A0R);
                    jSONObject.put("p2pSend", this.A0N);
                    jSONObject.put("p2pReceive", this.A0M);
                    jSONObject.put("p2mSend", this.A0L);
                    jSONObject.put("p2mReceive", this.A0K);
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder("PAY: PaymentMethodCardCountryData/addCapabilitiesToJson threw: ");
                    sb.append(e);
                    Log.w(sb.toString());
                }
            } catch (JSONException e2) {
                StringBuilder sb2 = new StringBuilder("PAY: PaymentMethodCardCountryData toJSONObject threw: ");
                sb2.append(e2);
                Log.w(sb2.toString());
            }
            jSONObject.put("v", this.A02);
            jSONObject.put("paymentRails", super.A03);
            jSONObject.put("needsDeviceBinding", this.A07);
            String str7 = this.A03;
            if (str7 != null) {
                jSONObject.put("bindingType", str7);
            }
            String str8 = this.A06;
            if (str8 != null) {
                jSONObject.put("tokenId", str8);
            }
            String str9 = this.A0C;
            if (str9 != null) {
                jSONObject.put("cardImageContentId", str9);
            }
            String str10 = this.A0E;
            if (str10 != null) {
                jSONObject.put("cardImageUrl", str10);
            }
            String str11 = this.A0D;
            if (str11 != null) {
                jSONObject.put("cardImageLabelColor", str11);
            }
            String str12 = this.A0J;
            if (str12 != null) {
                jSONObject.put("lastFour", str12);
            }
            Long l = super.A07;
            if (l != null) {
                jSONObject.put("cardDataUpdatedTimeMillis", l);
            }
            jSONObject.put("notificationType", this.A05);
            jSONObject.put("cardState", this.A0F);
            jSONObject.put("p2pEligible", this.A0V);
            jSONObject.put("p2mEligible", this.A0U);
            jSONObject.put("verificationStatus", this.A01);
            return jSONObject.toString();
        } catch (JSONException e3) {
            StringBuilder sb3 = new StringBuilder("PAY: BrazilCardMethodData toDBString threw: ");
            sb3.append(e3);
            Log.w(sb3.toString());
            return null;
        }
    }

    @Override // X.C0K9
    public void A02(int i, List list) {
        throw new UnsupportedOperationException("PAY: BrazilCardMethodData toNetwork unsupported");
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
        String str29;
        String str30;
        String str31;
        C04P A0A = c02590Ca.A0A("verified");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        this.A0X = "1".equals(str);
        C04P A0A2 = c02590Ca.A0A("bank-name");
        if (A0A2 != null) {
            str2 = A0A2.A03;
        } else {
            str2 = null;
        }
        this.A0A = str2;
        C04P A0A3 = c02590Ca.A0A("bank-phone-number");
        if (A0A3 != null) {
            str3 = A0A3.A03;
        } else {
            str3 = null;
        }
        this.A0B = str3;
        C04P A0A4 = c02590Ca.A0A("image");
        if (A0A4 != null) {
            str4 = A0A4.A03;
        } else {
            str4 = null;
        }
        this.A09 = str4;
        C04P A0A5 = c02590Ca.A0A("time-last-added");
        if (A0A5 != null) {
            str5 = A0A5.A03;
        } else {
            str5 = null;
        }
        super.A06 = AnonymousClass024.A03(str5, -1L);
        C04P A0A6 = c02590Ca.A0A("pending-verification-type");
        if (A0A6 != null) {
            str6 = A0A6.A03;
        } else {
            str6 = null;
        }
        this.A0O = str6;
        C04P A0A7 = c02590Ca.A0A("country");
        if (A0A7 != null) {
            str7 = A0A7.A03;
        } else {
            str7 = null;
        }
        this.A0G = str7;
        C04P A0A8 = c02590Ca.A0A("credential-id");
        if (A0A8 != null) {
            str8 = A0A8.A03;
        } else {
            str8 = null;
        }
        this.A0H = str8;
        C04P A0A9 = c02590Ca.A0A("type");
        if (A0A9 != null) {
            str9 = A0A9.A03;
        } else {
            str9 = null;
        }
        super.A00 = C0N7.A04(str9);
        C04P A0A10 = c02590Ca.A0A("created");
        if (A0A10 != null) {
            str10 = A0A10.A03;
        } else {
            str10 = null;
        }
        super.A05 = AnonymousClass024.A03(str10, 0L);
        C04P A0A11 = c02590Ca.A0A("network-type");
        if (A0A11 != null) {
            str11 = A0A11.A03;
        } else {
            str11 = null;
        }
        super.A01 = C0N7.A05(str11);
        C04P A0A12 = c02590Ca.A0A("last4");
        if (A0A12 != null) {
            str12 = A0A12.A03;
        } else {
            str12 = null;
        }
        this.A0J = str12;
        C04P A0A13 = c02590Ca.A0A("default-debit");
        if (A0A13 != null) {
            str13 = A0A13.A03;
        } else {
            str13 = null;
        }
        this.A0Q = "1".equals(str13);
        C04P A0A14 = c02590Ca.A0A("default-credit");
        if (A0A14 != null) {
            str14 = A0A14.A03;
        } else {
            str14 = null;
        }
        this.A0P = "1".equals(str14);
        C04P A0A15 = c02590Ca.A0A("needs-device-binding");
        if (A0A15 != null) {
            str15 = A0A15.A03;
        } else {
            str15 = null;
        }
        this.A07 = "1".equals(str15);
        C04P A0A16 = c02590Ca.A0A("binding-type");
        if (A0A16 != null) {
            str16 = A0A16.A03;
        } else {
            str16 = null;
        }
        this.A03 = str16;
        C04P A0A17 = c02590Ca.A0A("token-id");
        if (A0A17 != null) {
            str17 = A0A17.A03;
        } else {
            str17 = null;
        }
        this.A06 = str17;
        C04P A0A18 = c02590Ca.A0A("p2p-eligible");
        if (A0A18 != null) {
            str18 = A0A18.A03;
        } else {
            str18 = null;
        }
        this.A0V = "1".equals(str18);
        C04P A0A19 = c02590Ca.A0A("p2m-eligible");
        if (A0A19 != null) {
            str19 = A0A19.A03;
        } else {
            str19 = null;
        }
        this.A0U = "1".equals(str19);
        C04P A0A20 = c02590Ca.A0A("state");
        if (A0A20 != null) {
            str20 = A0A20.A03;
        } else {
            str20 = "UNSET";
        }
        this.A0F = str20;
        C04P A0A21 = c02590Ca.A0A("display-state");
        if (A0A21 != null) {
            str21 = A0A21.A03;
        } else {
            str21 = null;
        }
        if (TextUtils.isEmpty(str21)) {
            str21 = "ACTIVE";
        }
        this.A0I = str21;
        C02590Ca A0D = c02590Ca.A0D("capabilities");
        if (A0D != null) {
            C04P A0A22 = A0D.A0A("editable");
            if (A0A22 != null) {
                str25 = A0A22.A03;
            } else {
                str25 = null;
            }
            this.A0S = "1".equals(str25);
            C04P A0A23 = A0D.A0A("verifiable");
            if (A0A23 != null) {
                str26 = A0A23.A03;
            } else {
                str26 = null;
            }
            this.A0W = "1".equals(str26);
            C04P A0A24 = A0D.A0A("default-eligible");
            if (A0A24 != null) {
                str27 = A0A24.A03;
            } else {
                str27 = null;
            }
            this.A0R = "1".equals(str27);
            C04P A0A25 = A0D.A0A("p2p-send");
            if (A0A25 != null) {
                str28 = A0A25.A03;
            } else {
                str28 = null;
            }
            String A00 = C0N8.A00(str28);
            if (A00 == null) {
                A00 = A0C();
            }
            this.A0N = A00;
            C04P A0A26 = A0D.A0A("p2p-receive");
            if (A0A26 != null) {
                str29 = A0A26.A03;
            } else {
                str29 = null;
            }
            String A002 = C0N8.A00(str29);
            if (A002 == null) {
                A002 = A0B();
            }
            this.A0M = A002;
            C04P A0A27 = A0D.A0A("p2m-send");
            if (A0A27 != null) {
                str30 = A0A27.A03;
            } else {
                str30 = null;
            }
            String A003 = C0N8.A00(str30);
            if (A003 == null) {
                A003 = A0A();
            }
            this.A0L = A003;
            C04P A0A28 = A0D.A0A("p2m-receive");
            if (A0A28 != null) {
                str31 = A0A28.A03;
            } else {
                str31 = null;
            }
            String A004 = C0N8.A00(str31);
            if (A004 == null) {
                A004 = "DISABLED";
            }
            this.A0K = A004;
        }
        C04P A0A29 = c02590Ca.A0A("verification-status");
        if (A0A29 != null) {
            str22 = A0A29.A03;
        } else {
            str22 = null;
        }
        this.A01 = C0N2.A00(str22);
        C02590Ca A0D2 = c02590Ca.A0D("image");
        if (A0D2 != null) {
            C04P A0A30 = A0D2.A0A("image-content-id");
            if (A0A30 != null) {
                str23 = A0A30.A03;
            } else {
                str23 = null;
            }
            this.A0C = str23;
            C04P A0A31 = A0D2.A0A("image-url");
            if (A0A31 != null) {
                str24 = A0A31.A03;
            } else {
                str24 = null;
            }
            this.A0E = str24;
            C04P A0A32 = A0D2.A0A("image-label-color");
            this.A0D = A0A32 != null ? A0A32.A03 : null;
            return;
        }
        C04P A0A33 = c02590Ca.A0A("image-content-id");
        this.A0C = A0A33 != null ? A0A33.A03 : null;
    }

    @Override // X.C0K9
    public void A04(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.A0X = jSONObject.optBoolean("verified", false);
                this.A0A = jSONObject.optString("bankName", null);
                this.A08 = jSONObject.optString("bankCode", null);
                this.A0B = jSONObject.optString("bankPhoneNumber", null);
                this.A09 = jSONObject.optString("bankLogoUrl", this.A09);
                super.A06 = jSONObject.optLong("timeLastAdded", -1L);
                this.A0O = jSONObject.optString("verificationType", null);
                this.A0T = jSONObject.optBoolean("otpNumberMatch", false);
                super.A02 = jSONObject.optInt("otpLength", 8);
                String optString = jSONObject.optString("displayState", null);
                if (TextUtils.isEmpty(optString)) {
                    optString = "ACTIVE";
                }
                this.A0I = optString;
                this.A0S = jSONObject.optBoolean("editable", false);
                this.A0W = jSONObject.optBoolean("verifiable", false);
                this.A0R = jSONObject.optBoolean("defaultEligible", false);
                this.A0N = jSONObject.optString("p2pSend", A0C());
                this.A0M = jSONObject.optString("p2pReceive", A0B());
                this.A0L = jSONObject.optString("p2mSend", A0A());
                this.A0K = jSONObject.optString("p2mReceive", "DISABLED");
                this.A02 = jSONObject.optInt("v", 1);
                super.A03 = jSONObject.optInt("paymentRails", 0);
                this.A0V = jSONObject.optBoolean("p2pEligible", false);
                this.A0U = jSONObject.optBoolean("p2mEligible", false);
                this.A07 = jSONObject.optBoolean("needsDeviceBinding", false);
                this.A03 = jSONObject.optString("bindingType", null);
                this.A06 = jSONObject.optString("tokenId", null);
                this.A0C = jSONObject.optString("cardImageContentId", null);
                this.A0E = jSONObject.optString("cardImageUrl", null);
                this.A0D = jSONObject.optString("cardImageLabelColor", null);
                this.A0J = jSONObject.optString("lastFour", null);
                super.A07 = Long.valueOf(jSONObject.optLong("cardDataUpdatedTimeMillis", 0L));
                this.A05 = jSONObject.optString("notificationType", null);
                this.A0F = jSONObject.optString("cardState", "UNSET");
                this.A01 = jSONObject.optInt("verificationStatus");
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("PAY: BrazilCardMethodData fromDBString threw: ");
                sb.append(e);
                Log.w(sb.toString());
            }
        }
    }

    @Override // X.C0N0
    public C0N2 A05() {
        C03650Gn A00 = C03650Gn.A00("BR");
        String str = this.A0H;
        int i = super.A00;
        int i2 = this.A0Q ? 2 : 0;
        int i3 = this.A0P ? 2 : 0;
        String str2 = this.A0J;
        long j = super.A05;
        C0N7 c0n7 = new C0N7(A00, str, this.A0A, i, i2, i3, str2, super.A01);
        c0n7.A03 = j;
        c0n7.A06 = this;
        c0n7.A02 = this.A01;
        return c0n7;
    }

    @Override // X.C0N0
    public LinkedHashSet A08() {
        return new LinkedHashSet(Collections.singletonList(C013806p.A04));
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ verified: ");
        A0P.append(this.A0X);
        A0P.append(" accountType: ");
        A0P.append(super.A00);
        A0P.append(" bankName: ");
        A0P.append(this.A0A);
        A0P.append(" bankPhoneNumber: ");
        A0P.append(this.A0B);
        A0P.append(" bankLogoUrl: ");
        A0P.append(this.A09);
        A0P.append(" verificationType: ");
        A0P.append(this.A0O);
        A0P.append(" otpNumberMatch: ");
        A0P.append(this.A0T);
        A0P.append(" paymentRails: ");
        A0P.append(super.A03);
        A0P.append(" p2pEligible: ");
        A0P.append(this.A0V);
        A0P.append(" p2mEligible: ");
        A0P.append(this.A0U);
        A0P.append(" timeLastAdded: ");
        A0P.append(super.A06);
        A0P.append(" needsDeviceBinding: ");
        A0P.append(this.A07);
        A0P.append(" bindingType: ");
        A0P.append(this.A03);
        A0P.append(" cardImageContentId: ");
        A0P.append(this.A0C);
        A0P.append(" cardImageUrl: ");
        A0P.append(this.A0E);
        A0P.append(" cardImageLabelColor: ");
        A0P.append(this.A0D);
        A0P.append(" notificationType: ");
        A0P.append(this.A05);
        A0P.append(" lastFour: ");
        A0P.append(this.A0J);
        A0P.append("payoutVerificationStatus: ");
        A0P.append(this.A01);
        A0P.append(" displayState: ");
        A0P.append(this.A0I);
        StringBuilder sb = new StringBuilder(" capabilities { editable: ");
        sb.append(this.A0S);
        sb.append(", verifiable: ");
        sb.append(this.A0W);
        sb.append(", defaultEligible: ");
        sb.append(this.A0R);
        sb.append(", p2pSend: ");
        sb.append(this.A0N);
        sb.append(", p2pReceive: ");
        sb.append(this.A0M);
        sb.append(", p2mSend: ");
        sb.append(this.A0L);
        sb.append(", p2mReceive: ");
        sb.append(this.A0K);
        sb.append("}");
        A0P.append(sb.toString());
        A0P.append(" ]");
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A0X ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0O);
        parcel.writeByte(this.A0T ? (byte) 1 : (byte) 0);
        parcel.writeInt(super.A03);
        parcel.writeByte(this.A0V ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0U ? (byte) 1 : (byte) 0);
        parcel.writeLong(super.A06);
        parcel.writeInt(super.A04);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(super.A00);
        parcel.writeByte(this.A0Q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0P ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0J);
        parcel.writeLong(super.A05);
        parcel.writeInt(super.A01);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeLong(super.A07.longValue());
        parcel.writeString(this.A05);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0S ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0W ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0R ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
    }
}
