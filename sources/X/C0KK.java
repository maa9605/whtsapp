package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;

/* renamed from: X.0KK */
/* loaded from: classes.dex */
public class C0KK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2uC
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0KK(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0KK[i];
        }
    };
    public final C60252uB A00;
    public final Integer A01;
    public final String A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0KK(Parcel parcel) {
        this.A02 = parcel.readString();
        int readInt = parcel.readInt();
        this.A01 = readInt == -1 ? null : Integer.valueOf(readInt);
        this.A00 = (C60252uB) parcel.readParcelable(C60252uB.class.getClassLoader());
    }

    public C0KK(String str, Integer num, C60252uB c60252uB) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = c60252uB;
    }

    public static C0KK A00(C02590Ca c02590Ca) {
        String str;
        Integer num;
        try {
            C04P A0A = c02590Ca.A0A("kyc-state");
            if (A0A != null) {
                str = A0A.A03;
            } else {
                str = null;
            }
            C60252uB A00 = C60252uB.A00(c02590Ca);
            C04P A0A2 = c02590Ca.A0A("kyc-rejection-code");
            if (A0A2 != null && A0A2.A03 != null) {
                num = Integer.valueOf(c02590Ca.A05("kyc-rejection-code", 0));
            } else {
                num = null;
            }
            if (!AnonymousClass024.A0j(str)) {
                return new C0KK(str, num, A00);
            }
        } catch (C0L4 e) {
            Log.e("PAY: PaymentKycInfo/fromProtocolTreeNode ", e);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C0KK A01(java.lang.String r9) {
        /*
            boolean r0 = X.AnonymousClass024.A0j(r9)
            r8 = 0
            if (r0 != 0) goto L63
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5e
            r1.<init>(r9)     // Catch: org.json.JSONException -> L5e
            java.lang.String r0 = "state"
            java.lang.String r6 = r1.getString(r0)     // Catch: org.json.JSONException -> L5e
            java.lang.String r0 = "rejection-code"
            r7 = -1
            int r5 = r1.optInt(r0, r7)     // Catch: org.json.JSONException -> L5e
            java.lang.String r0 = "actions-requested"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L5e
            if (r1 == 0) goto L4e
            java.lang.String r0 = "obligation"
            java.lang.String r4 = r1.getString(r0)     // Catch: org.json.JSONException -> L49
            java.lang.String r0 = "actions"
            org.json.JSONArray r2 = r1.getJSONArray(r0)     // Catch: org.json.JSONException -> L49
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: org.json.JSONException -> L49
            r3.<init>()     // Catch: org.json.JSONException -> L49
            r1 = 0
        L33:
            int r0 = r2.length()     // Catch: org.json.JSONException -> L49
            if (r1 >= r0) goto L43
            java.lang.String r0 = r2.getString(r1)     // Catch: org.json.JSONException -> L49
            r3.add(r0)     // Catch: org.json.JSONException -> L49
            int r1 = r1 + 1
            goto L33
        L43:
            X.2uB r2 = new X.2uB     // Catch: org.json.JSONException -> L49
            r2.<init>(r4, r3)     // Catch: org.json.JSONException -> L49
            goto L4f
        L49:
            java.lang.String r0 = "PAY: PaymentKycActionsRequested fromJsonString threw exception"
            com.whatsapp.util.Log.e(r0)     // Catch: org.json.JSONException -> L5e
        L4e:
            r2 = r8
        L4f:
            if (r5 == r7) goto L52
            goto L54
        L52:
            r1 = r8
            goto L58
        L54:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: org.json.JSONException -> L5e
        L58:
            X.0KK r0 = new X.0KK     // Catch: org.json.JSONException -> L5e
            r0.<init>(r6, r1, r2)     // Catch: org.json.JSONException -> L5e
            return r0
        L5e:
            java.lang.String r0 = "PAY: PaymentKycInfo fromJsonString threw exception"
            com.whatsapp.util.Log.e(r0)
        L63:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KK.A01(java.lang.String):X.0KK");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        Integer num = this.A01;
        parcel.writeInt(num != null ? num.intValue() : -1);
        parcel.writeParcelable(this.A00, i);
    }
}
