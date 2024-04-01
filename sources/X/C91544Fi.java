package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Fi */
/* loaded from: classes3.dex */
public class C91544Fi extends C0MU {
    public InterfaceC02360Aw A00;
    public final C018508q A04;
    public final C01B A05;
    public final C0E7 A06;
    public final AnonymousClass012 A07;
    public final C001200o A08;
    public final C000500h A09;
    public final C90564Bm A0A;
    public final C28S A0B;
    public final C463026g A0C;
    public final C0GR A0D;
    public C04880Mg A02 = new C04880Mg();
    public C04880Mg A01 = new C04880Mg();
    public C0HK A03 = new C0HK();

    public C91544Fi(InterfaceC02360Aw interfaceC02360Aw, AnonymousClass012 anonymousClass012, C018508q c018508q, C001200o c001200o, C01B c01b, C000500h c000500h, C0E7 c0e7, C463026g c463026g, C0GR c0gr, C28S c28s, C90564Bm c90564Bm) {
        this.A00 = interfaceC02360Aw;
        this.A07 = anonymousClass012;
        this.A04 = c018508q;
        this.A08 = c001200o;
        this.A05 = c01b;
        this.A09 = c000500h;
        this.A06 = c0e7;
        this.A0C = c463026g;
        this.A0D = c0gr;
        this.A0B = c28s;
        this.A0A = c90564Bm;
        this.A02.A0B(new C90204Ab(0, -1));
        this.A01.A0B(new C49E());
        this.A01.A0C(this.A03, new InterfaceC05620Pl() { // from class: X.3k9
            {
                C91544Fi.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C91544Fi.this.A06((String) obj);
            }
        });
    }

    public C49E A02() {
        Object A01 = this.A01.A01();
        if (A01 != null) {
            return (C49E) A01;
        }
        throw null;
    }

    public final void A03(int i) {
        if (this.A05.A0E(C01C.A1w)) {
            this.A02.A0B(new C90204Ab(2, -1));
            C90564Bm c90564Bm = this.A0A;
            synchronized (c90564Bm) {
                String[] strArr = {"signedQrCode", "signedQrCodeTs"};
                try {
                    C0EU c0eu = c90564Bm.A02;
                    String A06 = c0eu.A06();
                    if (!TextUtils.isEmpty(A06)) {
                        JSONObject jSONObject = new JSONObject(A06);
                        int i2 = 0;
                        do {
                            jSONObject.remove(strArr[i2]);
                            i2++;
                        } while (i2 < 2);
                        c0eu.A0H(jSONObject.toString());
                    }
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteFromPaymentInfo for keys threw: ", e);
                }
            }
            C49E A02 = A02();
            A02.A08 = null;
            A02.A00 = "02";
            this.A01.A0B(A02);
            C4CF c4cf = new C4CF(this.A08.A00, this.A06, this.A0C, new C3NV(), this.A04, this.A0B);
            String A05 = A02().A05();
            final C78553k8 c78553k8 = new C78553k8(this, i);
            ((C48B) c4cf).A01.A0F("get", new C02590Ca("account", new C04P[]{new C04P("action", "upi-sign-qr-code", null, (byte) 0), new C04P("qr-code", A05, null, (byte) 0)}, null, null), new C91754Gd(c4cf.A00, c4cf.A01, c4cf.A02, c4cf.A03, ((C48B) c4cf).A00) { // from class: X.4IW
                @Override // X.C91754Gd, X.C28V
                public void A02(C28Q c28q) {
                    super.A02(c28q);
                    C78553k8 c78553k82 = c78553k8;
                    c78553k82.A01.A05(c78553k82.A00, null, c28q);
                }

                @Override // X.C91754Gd, X.C28V
                public void A03(C28Q c28q) {
                    super.A03(c28q);
                    C78553k8 c78553k82 = c78553k8;
                    c78553k82.A01.A05(c78553k82.A00, null, c28q);
                }

                @Override // X.C91754Gd, X.C28V
                public void A04(C02590Ca c02590Ca) {
                    String str;
                    super.A04(c02590Ca);
                    C02590Ca A0D = c02590Ca.A0D("account");
                    if (A0D != null) {
                        C78553k8 c78553k82 = c78553k8;
                        C04P A0A = A0D.A0A("signed-qr-code");
                        if (A0A != null) {
                            str = A0A.A03;
                        } else {
                            str = null;
                        }
                        c78553k82.A01.A05(c78553k82.A00, str, null);
                    }
                }
            }, 0L);
            return;
        }
        this.A02.A0B(new C90204Ab(0, i));
    }

    public void A04(int i, C90194Aa c90194Aa) {
        String str;
        if (i == 0) {
            String[] A0L = this.A0A.A0L();
            if (this.A05.A0E(C01C.A1w) && (TextUtils.isEmpty(A0L[0]) || TextUtils.isEmpty(A0L[1]) || this.A07.A05() - Long.parseLong(A0L[1]) > 259200000)) {
                A03(-1);
                return;
            }
            this.A02.A0B(new C90204Ab(0, -1));
        } else if (i == 1) {
            this.A02.A0B(new C90204Ab(1, -1));
        } else if (i == 2 || i == 3) {
            A03(-1);
        } else if (i == 4) {
            if (c90194Aa != null) {
                str = c90194Aa.A00;
            } else {
                str = "";
            }
            A07(str, 0);
        }
    }

    public void A05(int i, String str, C28Q c28q) {
        C49E A00;
        if (c28q == null) {
            if (!TextUtils.isEmpty(str) && (A00 = C49E.A00(Uri.parse(str), true)) != null && A00.A08 != null) {
                this.A01.A0B(A00);
                if (A00.A04 == null) {
                    C90564Bm c90564Bm = this.A0A;
                    synchronized (c90564Bm) {
                        try {
                            C0EU c0eu = c90564Bm.A02;
                            String A06 = c0eu.A06();
                            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
                            jSONObject.put("signedQrCode", str);
                            jSONObject.put("signedQrCodeTs", c90564Bm.A00.A05());
                            c0eu.A0H(jSONObject.toString());
                        } catch (JSONException e) {
                            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeQrSignature threw: ", e);
                        }
                    }
                }
            }
        } else {
            C49E A02 = A02();
            A02.A00 = "01";
            this.A01.A0B(A02);
        }
        this.A02.A0B(new C90204Ab(0, i));
    }

    public /* synthetic */ void A06(String str) {
        A07(str, -1);
    }

    public final void A07(String str, int i) {
        C49E c49e = (C49E) this.A01.A01();
        if (str.equals(c49e.A04)) {
            this.A02.A0B(new C90204Ab(3, i));
            return;
        }
        C0GR c0gr = this.A0D;
        C014006r ABR = c0gr.A01().ABR();
        C014006r A00 = C014006r.A00(str, c0gr.A01().A9i());
        if (A00 != null && A00.A00.compareTo(ABR.A00) >= 0) {
            c49e.A04 = str;
            this.A01.A0B(c49e);
            A03(i);
            return;
        }
        c49e.A04 = null;
        this.A01.A0B(c49e);
        this.A02.A0B(new C90204Ab(0, i));
    }
}
