package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4CE  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4CE extends C48B {
    public C48E A00;
    public final Context A01;
    public final C018508q A02;
    public final C02L A03;
    public final C0E7 A04;
    public final C013606n A05;
    public final C90564Bm A06;
    public final C0GZ A07;
    public final C28S A08;
    public final C0GR A09;
    public final C0DV A0A;
    public final C4CV A0B;
    public final C49682Lx A0C;

    public C4CE(Context context, C018508q c018508q, C02L c02l, C49682Lx c49682Lx, C0DV c0dv, C0E7 c0e7, C0GZ c0gz, C894947f c894947f, C463026g c463026g, C013606n c013606n, C0GR c0gr, C4CV c4cv, C28S c28s, C90564Bm c90564Bm, C48E c48e) {
        super(c463026g, c894947f.A04);
        this.A01 = context;
        this.A02 = c018508q;
        this.A03 = c02l;
        this.A0C = c49682Lx;
        this.A0A = c0dv;
        this.A04 = c0e7;
        this.A07 = c0gz;
        this.A05 = c013606n;
        this.A09 = c0gr;
        this.A0B = c4cv;
        this.A08 = c28s;
        this.A06 = c90564Bm;
        this.A00 = c48e;
    }

    public void A00() {
        this.A0B.A03.A04();
        Log.i("PAY: IndiaUpiPaymentSetup sendGetListKeys called");
        String A06 = this.A06.A06();
        if (!TextUtils.isEmpty(A06)) {
            StringBuilder A0P = C000200d.A0P("PAY: IndiaUpiPaymentSetup got cached listkeys; callback: ");
            A0P.append(this.A00);
            Log.i(A0P.toString());
            C48E c48e = this.A00;
            if (c48e != null) {
                c48e.ALJ(A06, null);
                return;
            }
            return;
        }
        final C3NV c3nv = super.A00;
        c3nv.A04("upi-list-keys");
        Log.i("PAY: IndiaUPIPaymentBankSetup sendGetListKeys");
        C463026g c463026g = super.A01;
        C02590Ca c02590Ca = new C02590Ca("account", new C04P[]{new C04P("action", "upi-list-keys", null, (byte) 0)}, null, null);
        final Context context = this.A01;
        final C018508q c018508q = this.A02;
        final C0E7 c0e7 = this.A04;
        final C28S c28s = this.A08;
        c463026g.A0F("get", c02590Ca, new C91754Gd(context, c018508q, c0e7, c28s, c3nv) { // from class: X.4IS
            @Override // X.C91754Gd, X.C28V
            public void A02(C28Q c28q) {
                super.A02(c28q);
                C48E c48e2 = C4CE.this.A00;
                if (c48e2 != null) {
                    c48e2.ALJ(null, c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A03(C28Q c28q) {
                super.A03(c28q);
                C48E c48e2 = C4CE.this.A00;
                if (c48e2 != null) {
                    c48e2.ALJ(null, c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A04(C02590Ca c02590Ca2) {
                String str;
                super.A04(c02590Ca2);
                C02590Ca A0D = c02590Ca2.A0D("account");
                if (A0D == null) {
                    Log.w("PAY: IndiaUpiPinActions sendGetListKeys: empty account node");
                    C48E c48e2 = C4CE.this.A00;
                    if (c48e2 != null) {
                        c48e2.ALJ(null, new C28Q());
                        return;
                    }
                    return;
                }
                C04P A0A = A0D.A0A("keys");
                if (A0A != null) {
                    str = A0A.A03;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    Log.w("PAY: IndiaUpiPinActions sendGetListKeys: missing keys");
                    C48E c48e3 = C4CE.this.A00;
                    if (c48e3 != null) {
                        c48e3.ALJ(null, new C28Q());
                        return;
                    }
                    return;
                }
                C4CE c4ce = C4CE.this;
                c4ce.A06.A0E(str);
                C48E c48e4 = c4ce.A00;
                if (c48e4 != null) {
                    c48e4.ALJ(str, null);
                }
            }
        }, 0L);
    }

    public void A01(String str, UserJid userJid, String str2, String str3, String str4, String str5, HashMap hashMap, String str6, C014006r c014006r, String str7) {
        C02590Ca c02590Ca;
        String A01;
        this.A0B.A03.A04();
        Log.i("PAY: IndiaUpiPaymentSetup sendCheckPin called");
        final C3NV c3nv = super.A00;
        c3nv.A04("upi-check-mpin");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("action", "upi-check-mpin", null, (byte) 0));
        C000200d.A1A("credential-id", str, arrayList);
        if (userJid != null) {
            C000200d.A0y("receiver", userJid, arrayList);
        }
        C000200d.A1A("sender-vpa", str2, arrayList);
        if (!TextUtils.isEmpty(str3)) {
            C000200d.A1A("sender-vpa-id", str3, arrayList);
        }
        C000200d.A1A("receiver-vpa", str4, arrayList);
        if (!TextUtils.isEmpty(str5)) {
            C000200d.A1A("receiver-vpa-id", str5, arrayList);
        }
        arrayList.add(new C04P("device-id", this.A0C.A02(), null, (byte) 0));
        C000200d.A1A("seq-no", str6, arrayList);
        if (hashMap != null && (A01 = C894947f.A01(hashMap, "MPIN")) != null) {
            C000200d.A1A("mpin", A01, arrayList);
        }
        if (c014006r != null) {
            c02590Ca = super.A01.A03(c014006r, this.A09.A01());
        } else {
            c02590Ca = null;
        }
        if (!TextUtils.isEmpty(str7)) {
            C000200d.A1A("request-id", str7, arrayList);
        }
        if (!TextUtils.isEmpty(null)) {
            C000200d.A1A("upi-bank-info", null, arrayList);
        }
        C463026g c463026g = super.A01;
        C02590Ca c02590Ca2 = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), c02590Ca);
        final Context context = this.A01;
        final C018508q c018508q = this.A02;
        final C0E7 c0e7 = this.A04;
        final C28S c28s = this.A08;
        c463026g.A0F("get", c02590Ca2, new C91754Gd(context, c018508q, c0e7, c28s, c3nv) { // from class: X.4IU
            @Override // X.C91754Gd, X.C28V
            public void A02(C28Q c28q) {
                super.A02(c28q);
                C48E c48e = C4CE.this.A00;
                if (c48e != null) {
                    c48e.AIO(false, false, null, null, null, null, c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A03(C28Q c28q) {
                super.A03(c28q);
                C48E c48e = C4CE.this.A00;
                if (c48e != null) {
                    c48e.AIO(false, false, null, null, null, null, c28q);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
                if (r10.A01 != null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
                if ("1".equals(r1.getString("valid")) == false) goto L68;
             */
            @Override // X.C91754Gd, X.C28V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A04(X.C02590Ca r14) {
                /*
                    Method dump skipped, instructions count: 335
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4IU.A04(X.0Ca):void");
            }
        }, 0L);
    }

    public final void A02(String str, String str2, String str3, String str4, HashMap hashMap, String str5) {
        this.A0B.A03.A04();
        Log.i("PAY: IndiaUpiPaymentSetup sendChangePin called");
        final C3NV c3nv = super.A00;
        c3nv.A04("upi-change-mpin");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("action", "upi-change-mpin", null, (byte) 0));
        arrayList.add(new C04P("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new C04P("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new C04P("upi-bank-info", str3, null, (byte) 0));
        arrayList.add(new C04P("credential-id", str4, null, (byte) 0));
        arrayList.add(new C04P("device-id", this.A0C.A02(), null, (byte) 0));
        arrayList.add(new C04P("seq-no", str5, null, (byte) 0));
        if (hashMap != null) {
            String A01 = C894947f.A01(hashMap, "MPIN");
            if (A01 != null) {
                arrayList.add(new C04P("old-mpin", A01, null, (byte) 0));
            }
            String A012 = C894947f.A01(hashMap, "NMPIN");
            if (A012 != null) {
                arrayList.add(new C04P("new-mpin", A012, null, (byte) 0));
            }
        }
        C463026g c463026g = super.A01;
        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
        final Context context = this.A01;
        final C018508q c018508q = this.A02;
        final C0E7 c0e7 = this.A04;
        final C28S c28s = this.A08;
        c463026g.A0F("set", c02590Ca, new C91754Gd(context, c018508q, c0e7, c28s, c3nv) { // from class: X.4IV
            @Override // X.C91754Gd, X.C28V
            public void A02(C28Q c28q) {
                super.A02(c28q);
                C48E c48e = C4CE.this.A00;
                if (c48e != null) {
                    c48e.AOZ(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A03(C28Q c28q) {
                super.A03(c28q);
                C48E c48e = C4CE.this.A00;
                if (c48e != null) {
                    c48e.AOZ(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A04(C02590Ca c02590Ca2) {
                super.A04(c02590Ca2);
                C48E c48e = C4CE.this.A00;
                if (c48e != null) {
                    c48e.AOZ(null);
                }
            }
        }, 0L);
    }

    public final void A03(String str, String str2, String str3, String str4, HashMap hashMap, String str5, String str6, String str7, String str8, final C49F c49f) {
        this.A0B.A03.A04();
        Log.i("PAY: IndiaUpiPaymentSetup sendSetPin called");
        final C3NV c3nv = super.A00;
        c3nv.A04("upi-set-mpin");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("action", "upi-set-mpin", null, (byte) 0));
        arrayList.add(new C04P("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new C04P("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new C04P("upi-bank-info", str3, null, (byte) 0));
        arrayList.add(new C04P("credential-id", str4, null, (byte) 0));
        arrayList.add(new C04P("device-id", this.A0C.A02(), null, (byte) 0));
        if (hashMap != null) {
            String A01 = C894947f.A01(hashMap, "SMS");
            if (A01 != null) {
                arrayList.add(new C04P("otp", A01, null, (byte) 0));
            }
            String A012 = C894947f.A01(hashMap, "MPIN");
            if (A012 != null) {
                arrayList.add(new C04P("mpin", A012, null, (byte) 0));
            }
            String A013 = C894947f.A01(hashMap, "ATMPIN");
            if (A013 != null) {
                arrayList.add(new C04P("atm-pin", A013, null, (byte) 0));
            }
        }
        arrayList.add(new C04P("debit-last-6", str5, null, (byte) 0));
        arrayList.add(new C04P("debit-exp-month", str6, null, (byte) 0));
        arrayList.add(new C04P("debit-exp-year", str7, null, (byte) 0));
        arrayList.add(new C04P("default-debit", "1", null, (byte) 0));
        arrayList.add(new C04P("default-credit", "1", null, (byte) 0));
        arrayList.add(new C04P("seq-no", str8, null, (byte) 0));
        C463026g c463026g = super.A01;
        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
        final Context context = this.A01;
        final C018508q c018508q = this.A02;
        final C0E7 c0e7 = this.A04;
        final C28S c28s = this.A08;
        c463026g.A0F("set", c02590Ca, new C91754Gd(context, c018508q, c0e7, c28s, c3nv) { // from class: X.4IT
            @Override // X.C91754Gd, X.C28V
            public void A02(C28Q c28q) {
                super.A02(c28q);
                C48E c48e = C4CE.this.A00;
                if (c48e != null) {
                    c48e.AOZ(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A03(C28Q c28q) {
                super.A03(c28q);
                C48E c48e = C4CE.this.A00;
                if (c48e != null) {
                    c48e.AOZ(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A04(C02590Ca c02590Ca2) {
                super.A04(c02590Ca2);
                C4CE c4ce = C4CE.this;
                C0GZ c0gz = c4ce.A07;
                List A02 = c0gz.A02();
                C03680Gq A014 = c0gz.A01("2fa");
                if (!((AbstractCollection) A02).contains(A014)) {
                    c0gz.A05(A014);
                }
                c49f.AGP();
                C48E c48e = c4ce.A00;
                if (c48e != null) {
                    c48e.AOZ(null);
                }
            }
        }, 0L);
    }
}
