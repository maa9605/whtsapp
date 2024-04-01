package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4GI */
/* loaded from: classes3.dex */
public final class C4GI extends C0TN {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.47a
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C4GI(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C4GI[i];
        }
    };
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    @Override // X.C0TN
    public int A05() {
        return 1;
    }

    @Override // X.C0TN
    public void A0A(int i) {
    }

    @Override // X.C0TN
    public void A0D(boolean z) {
    }

    @Override // X.C0TN
    public boolean A0E() {
        return false;
    }

    public C4GI() {
        this.A00 = 1;
    }

    public C4GI(Parcel parcel) {
        super(parcel);
        this.A00 = 1;
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    @Override // X.C0TN, X.C0K9
    public String A01() {
        JSONObject jSONObject;
        try {
            String A01 = super.A01();
            if (A01 != null) {
                jSONObject = new JSONObject(A01);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("v", this.A00);
            String str = this.A01;
            if (str != null) {
                jSONObject.put("vpaHandle", str);
            }
            String str2 = this.A02;
            if (str2 != null) {
                jSONObject.put("vpaId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiContactData toDBString threw: ", e);
            return null;
        }
    }

    @Override // X.C0TN, X.C0K9
    public void A02(int i, List list) {
        throw new UnsupportedOperationException("IndiaUpiContactData toNetwork not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x003d, code lost:
        if (r1.equals("1") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0053, code lost:
        if (r1 != false) goto L33;
     */
    @Override // X.C0TN, X.C0K9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(X.C013606n r5, int r6, X.C02590Ca r7) {
        /*
            r4 = this;
            java.lang.String r0 = "user"
            X.04P r0 = r7.A0A(r0)
            r1 = 0
            if (r0 == 0) goto L72
            java.lang.String r0 = r0.A03
        Lb:
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)
            r4.A03 = r0
            java.lang.String r0 = "vpa"
            X.04P r0 = r7.A0A(r0)
            if (r0 == 0) goto L70
            java.lang.String r0 = r0.A03
        L1b:
            r4.A01 = r0
            java.lang.String r0 = "vpa-id"
            X.04P r0 = r7.A0A(r0)
            if (r0 == 0) goto L6e
            java.lang.String r0 = r0.A03
        L27:
            r4.A02 = r0
            java.lang.String r0 = "nodal"
            X.04P r0 = r7.A0A(r0)
            if (r0 == 0) goto L33
            java.lang.String r1 = r0.A03
        L33:
            r3 = 1
            java.lang.String r2 = "1"
            if (r1 == 0) goto L3f
            boolean r1 = r1.equals(r2)
            r0 = 1
            if (r1 != 0) goto L40
        L3f:
            r0 = 0
        L40:
            r4.A03 = r0
            java.lang.String r0 = "nodal-allowed"
            X.04P r0 = r7.A0A(r0)
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L55
            boolean r1 = r0.equals(r2)
            r0 = 0
            if (r1 == 0) goto L56
        L55:
            r0 = 1
        L56:
            r4.A04 = r0
            java.lang.String r0 = "notif-allowed"
            X.04P r0 = r7.A0A(r0)
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L6b
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L6b
            r3 = 0
        L6b:
            r4.A05 = r3
            return
        L6e:
            r0 = r1
            goto L27
        L70:
            r0 = r1
            goto L1b
        L72:
            r0 = r1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GI.A03(X.06n, int, X.0Ca):void");
    }

    @Override // X.C0TN, X.C0K9
    public void A04(String str) {
        super.A04(str);
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A01 = jSONObject.optString("vpaHandle", null);
                    this.A02 = jSONObject.optString("vpaId", null);
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiContactData fromDBString threw: ", e);
            }
        }
    }

    @Override // X.C0TN
    public int A06(int i) {
        return TextUtils.isEmpty(this.A01) ? 2 : 3;
    }

    @Override // X.C0TN
    public String A09() {
        return this.A01;
    }

    @Override // X.C0TN
    public void A0C(String str) {
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ ver: ");
        A0P.append(this.A00);
        A0P.append(" jid: ");
        A0P.append(super.A03);
        A0P.append(" vpaHandle: ");
        A0P.append(C40841sx.A0Q(this.A01));
        A0P.append(" nodal: ");
        A0P.append(this.A03);
        A0P.append(" nodalAllowed: ");
        A0P.append(this.A04);
        A0P.append(" notifAllowed: ");
        A0P.append(this.A05);
        A0P.append(" ]");
        return A0P.toString();
    }

    @Override // X.C0TN, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
