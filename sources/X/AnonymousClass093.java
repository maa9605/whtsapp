package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.093 */
/* loaded from: classes.dex */
public class AnonymousClass093 implements Parcelable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public InterfaceC013706o A06;
    public C014006r A07;
    public C466327p A08;
    public C0K8 A09;
    public AbstractC005302j A0A;
    public UserJid A0B;
    public UserJid A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public ArrayList A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public byte[] A0P;
    public static final String A0Q = C03650Gn.A0E.A02;
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2uF
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            AnonymousClass093 A03;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            UserJid nullable = UserJid.getNullable(parcel.readString());
            UserJid nullable2 = UserJid.getNullable(parcel.readString());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            ArrayList readArrayList = parcel.readArrayList(C468128j.class.getClassLoader());
            UserJid nullable3 = UserJid.getNullable(parcel.readString());
            boolean z = parcel.readInt() != 0;
            long readLong2 = parcel.readLong();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            int readInt4 = parcel.readInt();
            boolean z2 = parcel.readInt() == 1;
            int readInt5 = parcel.readInt();
            byte[] bArr = new byte[readInt5];
            if (readInt5 > 0) {
                parcel.readByteArray(bArr);
            }
            int readInt6 = parcel.readInt();
            C0K8 c0k8 = (C0K8) parcel.readParcelable(C0K8.class.getClassLoader());
            InterfaceC013706o A00 = C013606n.A00(parcel);
            if (readInt == 5) {
                AnonymousClass093 A04 = AnonymousClass093.A04(readLong2, readString9, readInt4, bArr);
                A04.A0J = readString4;
                A04.A0A = nullable3;
                A04.A0O = z;
                A04.A0N = z2;
                A04.A06 = A00;
                return A04;
            }
            C014006r A002 = C014006r.A00(readString2, readInt3);
            if (readInt != 4) {
                A03 = new AnonymousClass093(readInt, nullable, nullable2, readString, A002, A00, readLong2, readString3, readInt2, readLong, readString5, readString6, readString7, null, readString9, readInt4, readInt6);
                A03.A0J = readString4;
                A03.A0L = readArrayList;
                A03.A0A = nullable3;
                A03.A0O = z;
                A03.A09 = c0k8;
                A03.A06 = A00;
            } else {
                A03 = AnonymousClass093.A03(readLong2);
            }
            A03.A0K = readString8;
            A03.A0N = z2;
            return A03;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new AnonymousClass093[i];
        }
    };
    public static final int[] A0T = {401, 402, 403, 404, 410, 411, 413, 601, 602, 603};
    public static final int[] A0R = {101, 102, 103, 104};
    public static final int[] A0S = {11, 12, 608};

    public static String A05(int i) {
        return i != 6 ? i != 7 ? i != 8 ? (i == 100 || i == 200) ? "p2m" : "p2p" : "withdrawal" : "refund" : "deposit";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AnonymousClass093(int i, long j, String str, int i2) {
        this.A0M = true;
        this.A02 = i;
        this.A04 = j;
        this.A0E = str;
        this.A03 = i2;
        this.A00 = 0;
        this.A0G = "XXX";
        this.A06 = C013806p.A06;
    }

    public AnonymousClass093(int i, UserJid userJid, UserJid userJid2, String str, C014006r c014006r, InterfaceC013706o interfaceC013706o, long j, String str2, int i2, long j2, String str3, String str4, String str5, String str6, String str7, int i3, int i4) {
        this.A0M = true;
        C000700j.A07(i != 0);
        this.A02 = i;
        this.A0C = userJid;
        this.A0B = userJid2;
        this.A0G = str;
        this.A07 = c014006r;
        this.A04 = j;
        this.A0E = str7;
        this.A03 = i3;
        this.A00 = i4;
        this.A06 = interfaceC013706o;
        if (!TextUtils.isEmpty(str2)) {
            A0G(str2);
        } else if (!TextUtils.isEmpty(str6) && (i == 10 || i == 20 || i == 40)) {
            A0G(str6);
        }
        A0C(i2, j2, str3, str4, str5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x0042, code lost:
        if (r14 != 200) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0044 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass093.A00(int, java.lang.String):int");
    }

    public static int A01(String str) {
        Number number;
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        HashMap hashMap = C60312uH.A00;
        if (!hashMap.containsKey(str) || (number = (Number) hashMap.get(str)) == null) {
            return 1;
        }
        return number.intValue();
    }

    public static AnonymousClass093 A02(int i, int i2, UserJid userJid, UserJid userJid2, String str, C014006r c014006r, InterfaceC013706o interfaceC013706o, long j, String str2, String str3, int i3, int i4) {
        return new AnonymousClass093(i, userJid, userJid2, str, c014006r, interfaceC013706o, j, null, i2, 0L, null, null, null, str2, str3, i3, i4);
    }

    public static AnonymousClass093 A03(long j) {
        return new AnonymousClass093(4, j, C03650Gn.A0F.A02, 1);
    }

    public static AnonymousClass093 A04(long j, String str, int i, byte[] bArr) {
        AnonymousClass093 anonymousClass093 = new AnonymousClass093(5, j, str, i);
        anonymousClass093.A0P = bArr;
        return anonymousClass093;
    }

    public static String A06(List list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C468128j) it.next()).A00(false));
        }
        return jSONArray.toString();
    }

    public static ArrayList A07(String str, InterfaceC013706o interfaceC013706o) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int optInt = jSONObject.optInt("t", 0);
                String optString = jSONObject.optString("st", null);
                String optString2 = jSONObject.optString("cc", null);
                String optString3 = jSONObject.optString("c", null);
                String optString4 = jSONObject.optString("n", null);
                String optString5 = jSONObject.optString("a", null);
                int optInt2 = jSONObject.optInt("sd", 1);
                if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString5)) {
                    C014006r A00 = C014006r.A00(optString5, interfaceC013706o.A9i());
                    if (A00 != null && A00.A02()) {
                        C0N2 A01 = C0N2.A01(optInt, optString, C03650Gn.A00(optString2), optString3, optString4);
                        if (A01 instanceof C0N7) {
                            ((C0N7) A01).A01 = jSONObject.optInt("ci", 0);
                        }
                        arrayList.add(new C468128j(A01, A00, optInt2));
                    } else {
                        Log.w("PAY: PaymentTransaction:Source:fromJsonString could not parse string amount");
                        return null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("PAY: PaymentTransaction:Source:fromJsonString could not parse string: ");
                    sb.append(str);
                    Log.w(sb.toString());
                    return null;
                }
            }
            arrayList.size();
            return arrayList;
        } catch (JSONException e) {
            Log.w("PAY: PaymentTransaction:Source:fromJsonString threw json exception in response: ", e);
            return null;
        }
    }

    public static boolean A08(AnonymousClass093 anonymousClass093) {
        C014006r c014006r;
        BigDecimal bigDecimal;
        if (anonymousClass093 == null) {
            return true;
        }
        int i = anonymousClass093.A02;
        if (i == 1000) {
            return false;
        }
        return i == 4 || (c014006r = anonymousClass093.A07) == null || (bigDecimal = c014006r.A00) == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0;
    }

    public static boolean A09(C02590Ca c02590Ca) {
        String str;
        String str2 = A0Q;
        C04P A0A = c02590Ca.A0A("country");
        if (A0A != null) {
            str2 = A0A.A03;
        }
        C04P A0A2 = c02590Ca.A0A("version");
        if (A0A2 != null) {
            str = A0A2.A03;
        } else {
            str = null;
        }
        return A01(str2) >= AnonymousClass024.A01(str, 1);
    }

    public static boolean A0A(String str) {
        return (TextUtils.isEmpty(str) || "UNSET".equals(str)) ? false : true;
    }

    public synchronized InterfaceC013706o A0B() {
        return this.A06;
    }

    public synchronized void A0C(int i, long j, String str, String str2, String str3) {
        this.A01 = i;
        if (j >= 0) {
            this.A05 = j;
            this.A0M = true;
            this.A0F = str;
            this.A0H = str2;
            this.A0D = str3;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: PaymentTransaction update called with invalid timestamp: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public synchronized void A0D(C0K8 c0k8, int i) {
        if (i > 0) {
            C0K8 c0k82 = this.A09;
            if (c0k82 == null) {
                this.A09 = c0k8;
                c0k82 = c0k8;
            }
            c0k82.A0F(i);
        }
    }

    public synchronized void A0E(C0K8 c0k8, long j) {
        if (j > 0) {
            C0K8 c0k82 = this.A09;
            if (c0k82 == null) {
                this.A09 = c0k8;
                c0k82 = c0k8;
            }
            c0k82.A0I(j);
        }
    }

    public synchronized void A0F(AnonymousClass093 anonymousClass093) {
        if (!TextUtils.isEmpty(anonymousClass093.A0I)) {
            A0G(anonymousClass093.A0I);
        }
        this.A04 = anonymousClass093.A04;
        this.A0C = anonymousClass093.A0C;
        this.A0B = anonymousClass093.A0B;
        this.A07 = anonymousClass093.A07;
        this.A0G = anonymousClass093.A0G;
        this.A02 = anonymousClass093.A02;
        this.A0E = anonymousClass093.A0E;
        this.A06 = anonymousClass093.A06;
        this.A03 = anonymousClass093.A03;
        this.A0P = anonymousClass093.A0P;
        this.A0J = anonymousClass093.A0J;
        this.A0O = anonymousClass093.A0O;
        this.A0A = anonymousClass093.A0A;
        this.A0K = anonymousClass093.A0K;
        this.A09 = anonymousClass093.A09;
        A0C(this.A01, this.A05, this.A0F, this.A0H, this.A0D);
    }

    public synchronized void A0G(String str) {
        C000700j.A03(str);
        this.A0I = str;
        this.A0M = true;
    }

    public synchronized void A0H(ArrayList arrayList) {
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                this.A0L = arrayList;
            }
        }
    }

    public synchronized void A0I(boolean z) {
        this.A0M = z;
    }

    public synchronized boolean A0J() {
        int i = this.A02;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return true;
                }
                if (i != 6) {
                    if (i != 7) {
                        if (i == 8 || i == 10 || i == 20) {
                            for (int i2 : A0S) {
                                if (i2 == this.A01) {
                                    return false;
                                }
                            }
                            return true;
                        } else if (i != 100) {
                            if (i != 200) {
                                return false;
                            }
                        }
                    }
                }
            }
            for (int i3 : A0R) {
                if (i3 == this.A01) {
                    return false;
                }
            }
            return true;
        }
        for (int i4 : A0T) {
            if (i4 == this.A01) {
                return false;
            }
        }
        return true;
    }

    public synchronized boolean A0K() {
        return this.A0M;
    }

    public synchronized boolean A0L() {
        boolean z;
        if (this.A02 == 10) {
            int i = this.A01;
            z = i == 12 || i == 19;
        }
        return z;
    }

    public synchronized boolean A0M() {
        boolean z;
        if (A0O()) {
            int i = this.A01;
            z = i == 12 || i == 19;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0010, code lost:
        if (r2 == 602) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A0N() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A0M()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L12
            int r2 = r3.A01     // Catch: java.lang.Throwable -> L15
            r0 = 608(0x260, float:8.52E-43)
            if (r2 == r0) goto L12
            r1 = 602(0x25a, float:8.44E-43)
            r0 = 0
            if (r2 != r1) goto L13
        L12:
            r0 = 1
        L13:
            monitor-exit(r3)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass093.A0N():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0012, code lost:
        if (r2 == 30) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A0O() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r2 = r3.A02     // Catch: java.lang.Throwable -> L17
            r0 = 20
            if (r2 == r0) goto L14
            r0 = 40
            if (r2 == r0) goto L14
            r0 = 10
            if (r2 == r0) goto L14
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r3)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass093.A0O():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0014, code lost:
        if (r3.A02 == 30) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A0P() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A01     // Catch: java.lang.Throwable -> L19
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L16
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L16
            r0 = 604(0x25c, float:8.46E-43)
            if (r1 == r0) goto L16
            int r2 = r3.A02     // Catch: java.lang.Throwable -> L19
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L17
        L16:
            r0 = 1
        L17:
            monitor-exit(r3)
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass093.A0P():boolean");
    }

    public synchronized boolean A0Q() {
        return A01(this.A0E) >= this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x000e, code lost:
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A0R() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.06r r0 = r2.A07     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            X.0K8 r0 = r2.A09     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            boolean r1 = r0.A0P(r2)     // Catch: java.lang.Throwable -> L13
            r0 = 0
            if (r1 == 0) goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass093.A0R():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0026, code lost:
        if (r3 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0028, code lost:
        if (r9 <= r3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A0S(int r6, long r7, int r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            X.0K8 r0 = r5.A09     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            if (r0 == 0) goto L10
            int r3 = r0.A05()     // Catch: java.lang.Throwable -> L2d
        La:
            int r1 = r5.A02     // Catch: java.lang.Throwable -> L2d
            r0 = 5
            if (r1 != r0) goto L14
            goto L12
        L10:
            r3 = 0
            goto La
        L12:
            if (r1 != r6) goto L2a
        L14:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L1a
            if (r1 != r6) goto L2a
        L1a:
            long r1 = r5.A05     // Catch: java.lang.Throwable -> L2d
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L2a
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L2b
            if (r9 != 0) goto L28
            if (r3 == 0) goto L2a
        L28:
            if (r9 <= r3) goto L2b
        L2a:
            r4 = 1
        L2b:
            monitor-exit(r5)
            return r4
        L2d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass093.A0S(int, long, int):boolean");
    }

    public synchronized boolean A0T(AnonymousClass093 anonymousClass093) {
        int i;
        C0K8 c0k8 = anonymousClass093.A09;
        if (c0k8 != null) {
            i = c0k8.A05();
        } else {
            i = 0;
        }
        return A0S(anonymousClass093.A02, anonymousClass093.A05, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0016, code lost:
        if (r1.equals(r2.A0B) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A0U(X.AnonymousClass092 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.whatsapp.jid.UserJid r1 = r3.A0B()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L18
            com.whatsapp.jid.UserJid r0 = r2.A0C     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L18
            com.whatsapp.jid.UserJid r0 = r2.A0B     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            if (r1 == 0) goto L19
        L18:
            r0 = 1
        L19:
            monitor-exit(r2)
            return r0
        L1b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass093.A0U(X.092):boolean");
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("id: ");
        sb.append(this.A0I);
        sb.append(" key_remote_id: ");
        sb.append(this.A0A);
        sb.append(" key_from_me: ");
        sb.append(this.A0O);
        sb.append(" key_id: ");
        sb.append(this.A0J);
        sb.append(" status: ");
        sb.append(this.A01);
        sb.append(" type: ");
        sb.append(this.A02);
        sb.append(" updateTs: ");
        sb.append(this.A05);
        sb.append(" initTs: ");
        sb.append(this.A04);
        sb.append(" error_code: ");
        sb.append(this.A0H);
        sb.append(" sender: ");
        sb.append(this.A0C);
        sb.append(" receiver: ");
        sb.append(this.A0B);
        sb.append(" credential_id: ");
        sb.append(this.A0F);
        sb.append(" methods: ");
        sb.append(this.A0L);
        sb.append(" reqMsgKeyId: ");
        sb.append(this.A0K);
        sb.append(" metadata: ");
        sb.append(this.A09);
        sb.append(" country: ");
        sb.append(this.A0E);
        sb.append(" version: ");
        sb.append(this.A03);
        sb.append(" interop: ");
        sb.append(this.A0N);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public synchronized void writeToParcel(Parcel parcel, int i) {
        int i2;
        String str;
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0G);
        C014006r c014006r = this.A07;
        if (c014006r != null) {
            i2 = c014006r.A00.scale();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        C014006r c014006r2 = this.A07;
        if (c014006r2 != null) {
            str = c014006r2.A00.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(this.A0I);
        UserJid userJid = this.A0C;
        parcel.writeString(userJid == null ? null : userJid.getRawString());
        UserJid userJid2 = this.A0B;
        parcel.writeString(userJid2 != null ? userJid2.getRawString() : null);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0D);
        parcel.writeList(this.A0L);
        parcel.writeString(C003101m.A07(this.A0A));
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0N ? 1 : 0);
        byte[] bArr = this.A0P;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.A0P);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A09, 0);
        this.A06.writeToParcel(parcel, i);
    }
}
