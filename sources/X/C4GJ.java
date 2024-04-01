package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4GJ */
/* loaded from: classes3.dex */
public final class C4GJ extends C0K8 {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.47i
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            C4GJ c4gj = new C4GJ();
            c4gj.A0K(parcel);
            c4gj.A0G = parcel.readString();
            c4gj.A0D = parcel.readString();
            c4gj.A0B = parcel.readString();
            c4gj.A0C = parcel.readString();
            c4gj.A09 = parcel.readString();
            c4gj.A0A = parcel.readString();
            c4gj.A05 = parcel.readLong();
            c4gj.A07 = parcel.readString();
            c4gj.A04 = parcel.readLong();
            c4gj.A01 = parcel.readInt();
            c4gj.A00 = parcel.readInt();
            c4gj.A02 = parcel.readInt();
            c4gj.A0H = parcel.readString();
            c4gj.A0F = parcel.readString();
            c4gj.A08 = parcel.readString();
            c4gj.A0E = parcel.readString();
            String readString = parcel.readString();
            if (readString != null) {
                c4gj.A06 = new C894547b(readString);
            }
            return c4gj;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C4GJ[i];
        }
    };
    public int A00;
    public long A04;
    public C894547b A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public int A03 = 1;
    public long A05 = -1;
    public int A01 = 0;
    public int A02 = 0;

    @Override // X.C0K9
    public String A01() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.C0K9
    public void A02(int i, List list) {
        if (!TextUtils.isEmpty(this.A0G)) {
            list.add(new C04P("mpin", this.A0G, null, (byte) 0));
        }
        if (!TextUtils.isEmpty(this.A0D)) {
            list.add(new C04P("seq-no", this.A0D, null, (byte) 0));
        }
        if (!TextUtils.isEmpty(this.A0B)) {
            list.add(new C04P("sender-vpa", this.A0B, null, (byte) 0));
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            list.add(new C04P("sender-vpa-id", this.A0C, null, (byte) 0));
        }
        if (!TextUtils.isEmpty(this.A09)) {
            list.add(new C04P("receiver-vpa", this.A09, null, (byte) 0));
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            list.add(new C04P("receiver-vpa-id", this.A0A, null, (byte) 0));
        }
        if (!TextUtils.isEmpty(this.A07)) {
            list.add(new C04P("device-id", this.A07, null, (byte) 0));
        }
        if (TextUtils.isEmpty(this.A0F)) {
            return;
        }
        list.add(new C04P("upi-bank-info", this.A0F, null, (byte) 0));
    }

    @Override // X.C0K9
    public void A03(C013606n c013606n, int i, C02590Ca c02590Ca) {
        String str;
        String str2;
        String str3;
        C04P A0A = c02590Ca.A0A("seq-no");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.A0D = str;
        }
        C04P A0A2 = c02590Ca.A0A("ref-url");
        if (A0A2 != null) {
            str2 = A0A2.A03;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.A0H = str2;
        }
        C04P A0A3 = c02590Ca.A0A("sync-status");
        String str4 = A0A3 != null ? A0A3.A03 : null;
        if (!TextUtils.isEmpty(str4)) {
            this.A0E = str4;
        }
        C04P A0A4 = c02590Ca.A0A("upi-bank-info");
        if (A0A4 != null && (str3 = A0A4.A03) != null) {
            this.A0F = str3;
        }
        C02590Ca A0D = c02590Ca.A0D("mandate");
        if (A0D != null) {
            this.A06 = new C894547b(A0D);
        }
    }

    @Override // X.C0K8, X.C0K9
    public void A04(String str) {
        try {
            super.A04(str);
            JSONObject jSONObject = new JSONObject(str);
            this.A03 = jSONObject.optInt("v", 1);
            this.A0D = jSONObject.optString("seqNum", this.A0D);
            this.A00 = jSONObject.optInt("counter", 0);
            this.A07 = jSONObject.optString("deviceId", this.A07);
            this.A0B = jSONObject.optString("senderVpa", this.A0B);
            this.A0C = jSONObject.optString("senderVpaId", this.A0C);
            this.A09 = jSONObject.optString("receiverVpa", this.A09);
            this.A0A = jSONObject.optString("receiverVpaId", this.A0A);
            this.A0G = jSONObject.optString("blob", this.A0G);
            this.A04 = jSONObject.optLong("expiryTs", this.A04);
            this.A01 = jSONObject.optInt("previousStatus", this.A01);
            this.A02 = jSONObject.optInt("previousType", this.A02);
            this.A0H = jSONObject.optString("url", this.A0H);
            this.A0F = jSONObject.optString("upiBankInfo", this.A0F);
            this.A0E = jSONObject.optString("syncStatus", this.A0E);
            if (jSONObject.has("indiaUpiMandateMetadata")) {
                this.A06 = new C894547b(jSONObject.optString("indiaUpiMandateMetadata", null));
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata fromDBString threw: ", e);
        }
    }

    @Override // X.C0K8
    public int A05() {
        return this.A00;
    }

    @Override // X.C0K8
    public int A06() {
        return this.A01;
    }

    @Override // X.C0K8
    public long A07() {
        return this.A04;
    }

    @Override // X.C0K8
    public long A08() {
        return this.A05;
    }

    @Override // X.C0K8
    public String A09() {
        return this.A0D;
    }

    @Override // X.C0K8
    public String A0A() {
        return this.A09;
    }

    @Override // X.C0K8
    public String A0B() {
        return this.A0B;
    }

    @Override // X.C0K8
    public String A0C() {
        try {
            JSONObject A0E = A0E();
            A0E.put("v", this.A03);
            String str = this.A0D;
            if (str != null) {
                A0E.put("seqNum", str);
            }
            String str2 = this.A07;
            if (str2 != null) {
                A0E.put("deviceId", str2);
            }
            long j = this.A04;
            if (j > 0) {
                A0E.put("expiryTs", j);
            }
            int i = this.A01;
            if (i > 0) {
                A0E.put("previousStatus", i);
            }
            String str3 = this.A09;
            if (str3 != null) {
                A0E.put("receiverVpa", str3);
            }
            String str4 = this.A0A;
            if (str4 != null) {
                A0E.put("receiverVpaId", str4);
            }
            String str5 = this.A0B;
            if (str5 != null) {
                A0E.put("senderVpa", str5);
            }
            String str6 = this.A0C;
            if (str6 != null) {
                A0E.put("senderVpaId", str6);
            }
            int i2 = this.A00;
            if (i2 > 0) {
                A0E.put("counter", i2);
            }
            int i3 = this.A02;
            if (i3 > 0) {
                A0E.put("previousType", i3);
            }
            String str7 = this.A0H;
            if (str7 != null) {
                A0E.put("url", str7);
            }
            String str8 = this.A0E;
            if (str8 != null) {
                A0E.put("syncStatus", str8);
            }
            String str9 = this.A0F;
            if (str9 != null) {
                A0E.put("upiBankInfo", str9);
            }
            C894547b c894547b = this.A06;
            if (c894547b != null) {
                A0E.put("indiaUpiMandateMetadata", c894547b.A00());
            }
            return A0E.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e);
            return null;
        }
    }

    @Override // X.C0K8
    public String A0D() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", this.A03);
            String str = this.A0G;
            if (str != null) {
                jSONObject.put("blob", str);
            }
            String str2 = this.A0B;
            if (str2 != null) {
                jSONObject.put("senderVpa", str2);
            }
            String str3 = this.A0C;
            if (str3 != null) {
                jSONObject.put("senderVpaId", str3);
            }
            String str4 = this.A09;
            if (str4 != null) {
                jSONObject.put("receiverVpa", str4);
            }
            String str5 = this.A0A;
            if (str5 != null) {
                jSONObject.put("receiverVpaId", str5);
            }
            String str6 = this.A07;
            if (str6 != null) {
                jSONObject.put("deviceId", str6);
            }
            String str7 = this.A0F;
            if (str7 != null) {
                jSONObject.put("upiBankInfo", str7);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e);
            return null;
        }
    }

    @Override // X.C0K8
    public void A0F(int i) {
        this.A00 = i;
    }

    @Override // X.C0K8
    public void A0G(int i) {
        this.A01 = i;
    }

    @Override // X.C0K8
    public void A0H(int i) {
        this.A02 = i;
    }

    @Override // X.C0K8
    public void A0I(long j) {
        this.A04 = j;
    }

    @Override // X.C0K8
    public void A0J(long j) {
        this.A05 = j;
    }

    @Override // X.C0K8
    public void A0L(C0K8 c0k8) {
        super.A0L(c0k8);
        C4GJ c4gj = (C4GJ) c0k8;
        String str = c4gj.A0D;
        if (str != null) {
            this.A0D = str;
        }
        String str2 = c4gj.A07;
        if (str2 != null) {
            this.A07 = str2;
        }
        String str3 = c4gj.A09;
        if (str3 != null) {
            this.A09 = str3;
        }
        String str4 = c4gj.A0A;
        if (str4 != null) {
            this.A0A = str4;
        }
        String str5 = c4gj.A0B;
        if (str5 != null) {
            this.A0B = str5;
        }
        String str6 = c4gj.A0C;
        if (str6 != null) {
            this.A0C = str6;
        }
        long j = c4gj.A04;
        if (j > 0) {
            this.A04 = j;
        }
        int i = c4gj.A01;
        if (i > 0) {
            this.A01 = i;
        }
        int i2 = c4gj.A00;
        if (i2 > 0) {
            this.A00 = i2;
        }
        int i3 = c4gj.A02;
        if (i3 > 0) {
            this.A02 = i3;
        }
        String str7 = c4gj.A0H;
        if (str7 != null) {
            this.A0H = str7;
        }
        String str8 = c4gj.A0F;
        if (str8 != null) {
            this.A0F = str8;
        }
        String str9 = c4gj.A0E;
        if (str9 != null) {
            this.A0E = str9;
        }
        C894547b c894547b = c4gj.A06;
        if (c894547b != null) {
            C894547b c894547b2 = this.A06;
            if (c894547b2 != null) {
                String str10 = c894547b.A08;
                if (str10 != null) {
                    c894547b2.A08 = str10;
                }
                String str11 = c894547b.A06;
                if (str11 != null) {
                    c894547b2.A06 = str11;
                }
                String str12 = c894547b.A05;
                if (str12 != null) {
                    c894547b2.A05 = str12;
                }
                c894547b2.A0A = c894547b.A0A;
                c894547b2.A0B = c894547b.A0B;
                long j2 = c894547b.A01;
                if (j2 > 0) {
                    c894547b2.A01 = j2;
                }
                long j3 = c894547b.A00;
                if (j3 > 0) {
                    c894547b2.A00 = j3;
                }
                String str13 = c894547b.A09;
                if (str13 != null) {
                    c894547b2.A09 = str13;
                }
                C466327p c466327p = c894547b.A02;
                if (c466327p != null) {
                    c894547b2.A02 = c466327p;
                }
                String str14 = c894547b.A07;
                if (str14 != null) {
                    c894547b2.A07 = str14;
                }
                String str15 = c894547b.A04;
                if (str15 != null) {
                    c894547b2.A04 = str15;
                }
                c894547b2.A03 = c894547b.A03;
                return;
            }
            throw null;
        }
    }

    @Override // X.C0K8
    public void A0M(String str) {
        this.A0D = str;
    }

    @Override // X.C0K8
    public void A0N(String str) {
        this.A09 = str;
    }

    @Override // X.C0K8
    public void A0O(String str) {
        this.A0B = str;
    }

    @Override // X.C0K8
    public boolean A0P(AnonymousClass093 anonymousClass093) {
        if (TextUtils.isEmpty(this.A0B) || TextUtils.isEmpty(this.A09)) {
            return true;
        }
        return !"FULL".equals(this.A0E) && anonymousClass093.A0J() && TextUtils.isEmpty(anonymousClass093.A0D);
    }

    public String toString() {
        int i;
        C894547b c894547b = this.A06;
        String obj = c894547b == null ? "null" : c894547b.toString();
        StringBuilder A0P = C000200d.A0P("[ seq-no: ");
        A0P.append(C40841sx.A0O(this.A0D));
        A0P.append(" timestamp: ");
        A0P.append(this.A05);
        A0P.append(" deviceId: ");
        A0P.append(this.A07);
        A0P.append(" sender: ");
        A0P.append(C40841sx.A0Q(this.A0B));
        A0P.append(" senderVpaId: ");
        A0P.append(this.A0C);
        A0P.append(" receiver: ");
        A0P.append(C40841sx.A0Q(this.A09));
        A0P.append(" receiverVpaId: ");
        A0P.append(C40841sx.A0Q(this.A0A));
        A0P.append(" encryptedKeyLength: ");
        String str = this.A0G;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        A0P.append(i);
        A0P.append(" previousType: ");
        A0P.append(this.A02);
        A0P.append(" previousStatus: ");
        A0P.append(this.A01);
        A0P.append(" url: ");
        A0P.append(C40841sx.A0O(this.A0H));
        A0P.append(" upiBankInfo: ");
        A0P.append(C40841sx.A0O(this.A0F));
        A0P.append(" indiaUpiMandateMetadata: {");
        A0P.append(obj);
        A0P.append("} ]");
        return A0P.toString();
    }

    @Override // X.C0K8, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(super.A01 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(super.A00, 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A07);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0E);
        C894547b c894547b = this.A06;
        parcel.writeString(c894547b == null ? null : c894547b.A00());
    }
}
