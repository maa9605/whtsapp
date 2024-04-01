package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.npci.commonlibrary.GetCredential;

/* renamed from: X.4Li */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC92484Li extends C4LI implements C48E {
    public static final HashMap A0O;
    public int A00;
    public C02L A01;
    public C002301c A02;
    public C013606n A03;
    public C894947f A04;
    public C90564Bm A05;
    public C895147h A07;
    public C28S A08;
    public C3NV A09;
    public C0EU A0A;
    public C0GR A0B;
    public C0DV A0C;
    public C0GS A0D;
    public C4CE A0E;
    public C4CV A0F;
    public C4CW A0G;
    public C49682Lx A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public final C014406v A0N = C014406v.A00("IndiaUpiPinHandlerActivity", "payment-settings", "IN");
    public InterfaceC895047g A06 = new InterfaceC895047g() { // from class: X.4Dm
        {
            AbstractActivityC92484Li.this = this;
        }

        @Override // X.InterfaceC895047g
        public void AKi() {
            AbstractActivityC92484Li abstractActivityC92484Li = AbstractActivityC92484Li.this;
            abstractActivityC92484Li.A0N.A08("onGetChallengeFailure got; showErrorAndFinish", null);
            abstractActivityC92484Li.A1g();
        }

        @Override // X.InterfaceC895047g
        public void AKo(boolean z, C28Q c28q) {
            AbstractActivityC92484Li abstractActivityC92484Li = AbstractActivityC92484Li.this;
            abstractActivityC92484Li.ARS();
            if (!z) {
                C014406v c014406v = abstractActivityC92484Li.A0N;
                c014406v.A08("onGetToken got; failure", null);
                if (!abstractActivityC92484Li.A09.A07("upi-get-token")) {
                    if (c28q != null) {
                        StringBuilder sb = new StringBuilder("onGetToken showErrorAndFinish error: ");
                        sb.append(c28q);
                        c014406v.A08(sb.toString(), null);
                        if (!C90944Da.A03(abstractActivityC92484Li, "upi-get-token", c28q.A00, true)) {
                            abstractActivityC92484Li.A1g();
                            return;
                        }
                        return;
                    }
                    c014406v.A08("onGetToken showErrorAndFinish", null);
                    abstractActivityC92484Li.A1g();
                    return;
                }
                c014406v.A08("retry get token", null);
                C90564Bm c90564Bm = abstractActivityC92484Li.A05;
                synchronized (c90564Bm) {
                    try {
                        C0EU c0eu = c90564Bm.A02;
                        String A06 = c0eu.A06();
                        JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
                        jSONObject.remove("token");
                        jSONObject.remove("tokenTs");
                        c0eu.A0H(jSONObject.toString());
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
                    }
                }
                if (abstractActivityC92484Li instanceof IndiaUpiResetPinActivity) {
                    IndiaUpiResetPinActivity indiaUpiResetPinActivity = (IndiaUpiResetPinActivity) abstractActivityC92484Li;
                    indiaUpiResetPinActivity.A02.setText(indiaUpiResetPinActivity.getString(R.string.payments_still_working));
                } else if (abstractActivityC92484Li instanceof IndiaUpiPaymentActivity) {
                    abstractActivityC92484Li.A12(R.string.payments_still_working);
                } else if (!(abstractActivityC92484Li instanceof IndiaUpiMandatePaymentActivity) && !(abstractActivityC92484Li instanceof IndiaUpiCheckBalanceActivity)) {
                    ((IndiaUpiChangePinActivity) abstractActivityC92484Li).A01.setText(R.string.payments_still_working);
                }
                abstractActivityC92484Li.A07.A00();
            }
        }

        @Override // X.InterfaceC895047g
        public void ANj(boolean z) {
            if (z) {
                AbstractActivityC92484Li abstractActivityC92484Li = AbstractActivityC92484Li.this;
                abstractActivityC92484Li.A09.A03("upi-register-app");
                boolean z2 = abstractActivityC92484Li.A0M;
                C014406v c014406v = abstractActivityC92484Li.A0N;
                if (z2) {
                    c014406v.A08("internal error ShowPinError", null);
                    int i = abstractActivityC92484Li.A00;
                    if (i < 3) {
                        C4CE c4ce = abstractActivityC92484Li.A0E;
                        if (c4ce != null) {
                            c4ce.A00();
                            return;
                        }
                        return;
                    }
                    StringBuilder A0P = C000200d.A0P("startShowPinFlow at count: ");
                    A0P.append(i);
                    A0P.append(" max: ");
                    A0P.append(3);
                    A0P.append("; showErrorAndFinish");
                    c014406v.A07(null, A0P.toString(), null);
                    abstractActivityC92484Li.A1g();
                    return;
                }
                c014406v.A07(null, "onRegisterApp registered ShowMainPane", null);
                abstractActivityC92484Li.A1h();
                return;
            }
            AbstractActivityC92484Li abstractActivityC92484Li2 = AbstractActivityC92484Li.this;
            abstractActivityC92484Li2.A0N.A08("onRegisterApp not registered; showErrorAndFinish", null);
            abstractActivityC92484Li2.A1g();
        }
    };

    static {
        HashMap hashMap = new HashMap();
        A0O = hashMap;
        hashMap.put("karur vysya bank", 8);
        A0O.put("dena bank", 4);
    }

    public static final JSONObject A00(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("payerBankName", str);
            jSONObject.put("backgroundColor", "#FFFFFF");
            jSONObject.put("color", "#00FF00");
            if (z) {
                jSONObject.put("resendOTPFeature", "true");
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public Dialog A1a(final int i, String str, int i2, int i3, final Runnable runnable) {
        C014406v c014406v = this.A0N;
        StringBuilder sb = new StringBuilder("IndiaUpiPinHandlerActivity showMessageDialog id:");
        sb.append(i);
        sb.append(" message:");
        sb.append(str);
        c014406v.A07(null, sb.toString(), null);
        C019208x c019208x = new C019208x(this);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = str;
        c019208x.A06(i2, new DialogInterface.OnClickListener() { // from class: X.3Pz
            {
                AbstractActivityC92484Li.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                AbstractActivityC92484Li abstractActivityC92484Li = AbstractActivityC92484Li.this;
                int i5 = i;
                Runnable runnable2 = runnable;
                C002701i.A18(abstractActivityC92484Li, i5);
                if (runnable2 != null) {
                    new Handler(abstractActivityC92484Li.getMainLooper()).post(runnable2);
                }
            }
        });
        c019208x.A04(i3, new DialogInterface.OnClickListener() { // from class: X.3Q2
            {
                AbstractActivityC92484Li.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                AbstractActivityC92484Li.this.A1j(i);
            }
        });
        c019308y.A0J = true;
        c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3Px
            {
                AbstractActivityC92484Li.this = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AbstractActivityC92484Li.this.A1k(i);
            }
        };
        return c019208x.A00();
    }

    public final String A1b(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (i <= 0) {
                i = 4;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "PIN");
            jSONObject2.put("subtype", "MPIN");
            jSONObject2.put("dType", "NUM");
            jSONObject2.put("dLength", i);
            jSONArray.put(jSONObject2);
            jSONObject.put("CredAllowed", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            this.A0N.A08("createCredRequired threw: ", e);
            return null;
        }
    }

    public final JSONArray A1c(String str, String str2, C014006r c014006r, String str3, String str4, String str5) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONArray.put(new JSONObject().putOpt("name", getString(R.string.payinfo_payeename)).putOpt("value", str));
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONArray.put(new JSONObject().putOpt("name", getString(R.string.payinfo_account)).putOpt("value", str2));
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONArray.put(new JSONObject().putOpt("name", getString(R.string.payinfo_refid)).putOpt("value", str4));
            }
            if (c014006r != null) {
                jSONArray.put(new JSONObject().putOpt("name", getString(R.string.payinfo_txnamount)).putOpt("value", c014006r.toString()));
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONArray.put(new JSONObject().putOpt("name", getString(R.string.payinfo_mobilenumber)).putOpt("value", str3));
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONArray.put(new JSONObject().putOpt("name", getString(R.string.payinfo_refurl)).putOpt("value", str5));
            }
            return jSONArray;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final JSONObject A1d(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("txnId", str);
            jSONObject.put("deviceId", this.A0I);
            jSONObject.put("appId", "com.whatsapp");
            jSONObject.put("mobileNumber", this.A0K);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void A1e() {
        A12(R.string.register_wait_message);
        this.A0L = true;
        C002701i.A18(this, 19);
        this.A0M = true;
        this.A00++;
        this.A0N.A07(null, "showUPIAppErrorAndConfirmRetry got yes; deleting tokens and keys", null);
        this.A05.A0C();
        this.A07.A00();
    }

    public void A1f() {
        if (this instanceof IndiaUpiResetPinActivity) {
            C002701i.A19(this, 19);
        } else if (this instanceof IndiaUpiPaymentActivity) {
            this.A0L = false;
            C002701i.A19(this, 19);
        } else if (this instanceof IndiaUpiMandatePaymentActivity) {
            ARS();
            C002701i.A19(this, 19);
        } else if (this instanceof IndiaUpiCheckBalanceActivity) {
        } else {
            C002701i.A19(this, 19);
        }
    }

    public void A1g() {
        PaymentView paymentView;
        if (this instanceof IndiaUpiResetPinActivity) {
            IndiaUpiResetPinActivity indiaUpiResetPinActivity = (IndiaUpiResetPinActivity) this;
            indiaUpiResetPinActivity.A1v(C90944Da.A00(0, ((AbstractActivityC92484Li) indiaUpiResetPinActivity).A09));
        } else if (this instanceof IndiaUpiPaymentActivity) {
            IndiaUpiPaymentActivity indiaUpiPaymentActivity = (IndiaUpiPaymentActivity) this;
            indiaUpiPaymentActivity.ARS();
            int A00 = C90944Da.A00(0, ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A09);
            if (A00 == R.string.payments_bank_generic_error && (paymentView = indiaUpiPaymentActivity.A0W) != null && paymentView.A00 != 1) {
                A00 = R.string.payments_bank_error_when_pay;
            }
            indiaUpiPaymentActivity.A26(A00, new Object[0]);
        } else if (this instanceof IndiaUpiMandatePaymentActivity) {
            int A002 = C90944Da.A00(0, this.A09);
            A1X();
            if (A002 == 0) {
                A002 = R.string.payments_generic_error;
            }
            overridePendingTransition(0, 0);
            AUj(A002);
        } else if (!(this instanceof IndiaUpiCheckBalanceActivity)) {
            int A003 = C90944Da.A00(0, this.A09);
            A1X();
            if (A003 == 0) {
                A003 = R.string.payments_change_pin_error;
            }
            AUj(A003);
        } else {
            finish();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.4Dp] */
    public void A1h() {
        UserJid userJid;
        if (this instanceof IndiaUpiResetPinActivity) {
            final IndiaUpiResetPinActivity indiaUpiResetPinActivity = (IndiaUpiResetPinActivity) this;
            if (((AbstractActivityC92484Li) indiaUpiResetPinActivity).A09.A06.contains("pin-entry-ui")) {
                return;
            }
            C014406v c014406v = indiaUpiResetPinActivity.A0G;
            StringBuilder A0P = C000200d.A0P("showMainPaneAfterPayAppRegistered: bankAccount: ");
            A0P.append(indiaUpiResetPinActivity.A04);
            A0P.append(" inSetup: ");
            A0P.append(((AbstractActivityC92444Kp) indiaUpiResetPinActivity).A0G);
            c014406v.A07(null, A0P.toString(), null);
            if (indiaUpiResetPinActivity.A04 == null) {
                C91094Dp c91094Dp = indiaUpiResetPinActivity.A08;
                C91094Dp c91094Dp2 = c91094Dp;
                if (c91094Dp == null) {
                    ?? r2 = new C0HS() { // from class: X.4Dp
                        @Override // X.C0HS
                        public Object A07(Object[] objArr) {
                            C0DV c0dv = ((AbstractActivityC92484Li) indiaUpiResetPinActivity).A0C;
                            c0dv.A04();
                            return c0dv.A08.A0B();
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            IndiaUpiResetPinActivity indiaUpiResetPinActivity2;
                            C0N2 c0n2;
                            List list = (List) obj;
                            if (list != null && list.size() > 0) {
                                indiaUpiResetPinActivity2 = indiaUpiResetPinActivity;
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c0n2 = (C0N2) it.next();
                                        if (c0n2.A01 == 2) {
                                            break;
                                        }
                                    } else {
                                        c0n2 = null;
                                        break;
                                    }
                                }
                                indiaUpiResetPinActivity2.A04 = (C0N6) c0n2;
                                indiaUpiResetPinActivity2.A1r();
                            } else {
                                indiaUpiResetPinActivity2 = indiaUpiResetPinActivity;
                                indiaUpiResetPinActivity2.A1g();
                            }
                            indiaUpiResetPinActivity2.A08 = null;
                        }
                    };
                    indiaUpiResetPinActivity.A08 = r2;
                    c91094Dp2 = r2;
                }
                ((AbstractActivityC92444Kp) indiaUpiResetPinActivity).A06.ARy(c91094Dp2, new Void[0]);
                return;
            }
            indiaUpiResetPinActivity.A1r();
        } else if (!(this instanceof IndiaUpiPaymentActivity)) {
            if ((this instanceof IndiaUpiMandatePaymentActivity) || (this instanceof IndiaUpiCheckBalanceActivity)) {
                return;
            }
            final IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
            if (!((AbstractActivityC92484Li) indiaUpiChangePinActivity).A09.A06.contains("pin-entry-ui")) {
                if (indiaUpiChangePinActivity.getIntent() != null && indiaUpiChangePinActivity.getIntent().getExtras() != null) {
                    indiaUpiChangePinActivity.A02 = (C0N6) indiaUpiChangePinActivity.getIntent().getExtras().get("extra_bank_account");
                }
                if (indiaUpiChangePinActivity.A02 == null) {
                    ((AbstractActivityC92444Kp) indiaUpiChangePinActivity).A06.ARy(new C0HS() { // from class: X.4DV
                        @Override // X.C0HS
                        public Object A07(Object[] objArr) {
                            C0DV c0dv = ((AbstractActivityC92484Li) indiaUpiChangePinActivity).A0C;
                            c0dv.A04();
                            return c0dv.A08.A0B();
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            C0N2 c0n2;
                            List list = (List) obj;
                            if (list != null && list.size() == 1) {
                                IndiaUpiChangePinActivity indiaUpiChangePinActivity2 = indiaUpiChangePinActivity;
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c0n2 = (C0N2) it.next();
                                        if (c0n2.A08() == 2) {
                                            break;
                                        }
                                    } else {
                                        c0n2 = null;
                                        break;
                                    }
                                }
                                indiaUpiChangePinActivity2.A02 = (C0N6) c0n2;
                            }
                            indiaUpiChangePinActivity.A1o();
                        }
                    }, new Void[0]);
                } else {
                    indiaUpiChangePinActivity.A1o();
                }
            }
        } else {
            final IndiaUpiPaymentActivity indiaUpiPaymentActivity = (IndiaUpiPaymentActivity) this;
            AbstractC005302j abstractC005302j = ((C4KG) indiaUpiPaymentActivity).A08;
            boolean A0U = C003101m.A0U(abstractC005302j);
            if (A0U && ((C4KG) indiaUpiPaymentActivity).A0A == null) {
                indiaUpiPaymentActivity.A1S();
                return;
            }
            indiaUpiPaymentActivity.A0I = A0U ? ((C4KG) indiaUpiPaymentActivity).A0A : UserJid.of(abstractC005302j);
            indiaUpiPaymentActivity.A0C = indiaUpiPaymentActivity.AFm() ? null : indiaUpiPaymentActivity.A09.A02(indiaUpiPaymentActivity.A0I);
            if (TextUtils.isEmpty(((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0E) && indiaUpiPaymentActivity.A0I != null) {
                C91044Dk c91044Dk = new C91044Dk(indiaUpiPaymentActivity);
                indiaUpiPaymentActivity.A0T = c91044Dk;
                ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A06.ARy(c91044Dk, new Void[0]);
                indiaUpiPaymentActivity.A12(R.string.register_wait_message);
            } else if ((!TextUtils.isEmpty(((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0E) && indiaUpiPaymentActivity.A0J.A07(((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0E)) || ((userJid = indiaUpiPaymentActivity.A0I) != null && indiaUpiPaymentActivity.A00.A0H(UserJid.of(userJid)))) {
                indiaUpiPaymentActivity.A0P.A01(indiaUpiPaymentActivity, indiaUpiPaymentActivity.A0I, ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0E, true, false, new InterfaceC40271rs() { // from class: X.3j4
                    @Override // X.InterfaceC40271rs
                    public final void AOE(boolean z) {
                        indiaUpiPaymentActivity.A2L(z);
                    }
                });
            } else {
                indiaUpiPaymentActivity.A1w();
            }
        }
    }

    public /* synthetic */ void A1i() {
        C002701i.A18(this, 19);
        this.A0M = false;
        A1W();
        finish();
    }

    public /* synthetic */ void A1j(int i) {
        C002701i.A18(this, i);
        A1W();
        finish();
    }

    public /* synthetic */ void A1k(int i) {
        C002701i.A18(this, i);
        A1W();
        finish();
    }

    public void A1l(String str, String str2, int i, C4GJ c4gj, C014006r c014006r, String str3, String str4, String str5) {
        C014406v c014406v = this.A0N;
        c014406v.A07(null, "getCredentials for pin check called", null);
        byte[] A0K = this.A05.A0K();
        String A1b = A1b(i);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(A1b) && A0K != null) {
            JSONObject A00 = A00(str2, false);
            String str6 = c4gj.A0D;
            String obj = c014006r.toString();
            String str7 = c4gj.A0B;
            String str8 = c4gj.A09;
            JSONObject A1d = A1d(str6);
            try {
                A1d.put("txnAmount", obj);
                A1d.put("payerAddr", str7);
                A1d.put("payeeAddr", str8);
                c014406v.A03("getKeySaltWithTransactionDetails");
                String A002 = C4B3.A00(c4gj.A0D, c014006r.toString(), "com.whatsapp", this.A0I, this.A0K, c4gj.A0B, c4gj.A09);
                c014406v.A03("decrypted trust params");
                try {
                    byte[] A1i = C02180Ae.A1i(C02180Ae.A1e(A002), A0K);
                    String encodeToString = Base64.encodeToString(A1i, 2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("getKeyTrustWithTransactionDetails: trust: ");
                    sb.append(A1i);
                    c014406v.A03(sb.toString());
                    Intent putExtra = new Intent(getApplicationContext(), GetCredential.class).putExtra("keyCode", "NPCI").putExtra("keyXmlPayload", str).putExtra("controls", A1b).putExtra("configuration", A00.toString()).putExtra("salt", A1d.toString()).putExtra("payInfo", A1c(str4, str3, c014006r, str5, ((AbstractActivityC92444Kp) this).A0D, ((AbstractActivityC92444Kp) this).A0C).toString()).putExtra("trust", encodeToString).putExtra("languagePref", this.A02.A0I().toString());
                    putExtra.setFlags(536870912);
                    A15(putExtra, 200);
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
        c014406v.A07(null, "getCredentials for set got empty xml or controls or token", null);
        A1f();
    }

    public void A1m(String str, String str2, String str3, C4IA c4ia, int i, String str4) {
        C014406v c014406v = this.A0N;
        c014406v.A07(null, "getCredentials for pin setup called.", null);
        byte[] A0K = this.A05.A0K();
        String str5 = "createCredRequired threw: ";
        if (i == 1) {
            int i2 = c4ia.A02;
            int i3 = c4ia.A04;
            int i4 = c4ia.A00;
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (i2 == 0) {
                        try {
                            String optString = new JSONObject(c4ia.A0A).optString("bank_name");
                            if (optString != null) {
                                try {
                                    Number number = (Number) A0O.get(optString.toLowerCase(Locale.US));
                                    if (number != null) {
                                        i2 = number.intValue();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("createCredRequired otpLength override: ");
                                        sb.append(i2);
                                        c014406v.A07(null, sb.toString(), null);
                                    }
                                } catch (JSONException e) {
                                    e = e;
                                    c014406v.A08(str5, e);
                                    str5 = null;
                                    if (TextUtils.isEmpty(str)) {
                                    }
                                    c014406v.A07(null, "getCredentials for set got empty xml or controls or token", null);
                                    A1f();
                                }
                            }
                            i2 = 6;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("createCredRequired otpLength override: ");
                            sb2.append(i2);
                            c014406v.A07(null, sb2.toString(), null);
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    }
                    if (i2 > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", "OTP");
                        jSONObject2.put("subtype", "SMS");
                        jSONObject2.put("dType", "NUM");
                        jSONObject2.put("dLength", i2);
                        jSONArray.put(jSONObject2);
                    }
                    if (i3 <= 0) {
                        i3 = 4;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("type", "PIN");
                    jSONObject3.put("subtype", "MPIN");
                    jSONObject3.put("dType", "NUM");
                    jSONObject3.put("dLength", i3);
                    jSONArray.put(jSONObject3);
                    if (c4ia.A03 == 2 && i4 > 0) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("type", "PIN");
                        jSONObject4.put("subtype", "ATMPIN");
                        jSONObject4.put("dType", "NUM");
                        jSONObject4.put("dLength", i4);
                        jSONArray.put(jSONObject4);
                    }
                    jSONObject.put("CredAllowed", jSONArray);
                    str5 = jSONObject.toString();
                } catch (JSONException e3) {
                    e = e3;
                }
            } catch (JSONException e4) {
                e = e4;
            }
        } else if (i != 2) {
            if (i == 3) {
                str5 = A1b(c4ia.A04);
            }
            str5 = null;
        } else {
            int i5 = c4ia.A04;
            try {
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                if (i5 <= 0) {
                    i5 = 4;
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("type", "PIN");
                jSONObject6.put("subtype", "MPIN");
                jSONObject6.put("dType", "NUM");
                jSONObject6.put("dLength", i5);
                jSONArray2.put(jSONObject6);
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("type", "PIN");
                jSONObject7.put("subtype", "NMPIN");
                jSONObject7.put("dType", "NUM");
                jSONObject7.put("dLength", i5);
                jSONArray2.put(jSONObject7);
                jSONObject5.put("CredAllowed", jSONArray2);
                str5 = jSONObject5.toString();
            } catch (JSONException e5) {
                c014406v.A08(str5, e5);
            }
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str5) && A0K != null) {
            JSONObject A00 = A00(str2, true);
            JSONObject A1d = A1d(str3);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append("|");
            sb3.append("com.whatsapp");
            sb3.append("|");
            sb3.append(this.A0K);
            sb3.append("|");
            sb3.append(this.A0I);
            try {
                String encodeToString = Base64.encodeToString(C02180Ae.A1i(C02180Ae.A1e(sb3.toString()), A0K), 2);
                Intent putExtra = new Intent(getApplicationContext(), GetCredential.class).putExtra("keyCode", "NPCI").putExtra("keyXmlPayload", str).putExtra("controls", str5).putExtra("configuration", A00.toString()).putExtra("salt", A1d.toString()).putExtra("payInfo", A1c(null, str4, null, null, ((AbstractActivityC92444Kp) this).A0D, ((AbstractActivityC92444Kp) this).A0C).toString()).putExtra("trust", encodeToString).putExtra("languagePref", this.A02.A0I().toString());
                putExtra.setFlags(536870912);
                A15(putExtra, 200);
                return;
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
        c014406v.A07(null, "getCredentials for set got empty xml or controls or token", null);
        A1f();
    }

    @Override // X.AbstractActivityC92444Kp, X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            boolean z = false;
            if (i2 == 250) {
                final HashMap hashMap = (HashMap) intent.getSerializableExtra("credBlocks");
                C014406v c014406v = this.A0N;
                StringBuilder sb = new StringBuilder("onLibraryResult for credentials: ");
                sb.append(hashMap);
                c014406v.A05(sb.toString());
                if (hashMap != null && !hashMap.isEmpty()) {
                    z = true;
                }
                C000700j.A07(z);
                if (this instanceof IndiaUpiResetPinActivity) {
                    final IndiaUpiResetPinActivity indiaUpiResetPinActivity = (IndiaUpiResetPinActivity) this;
                    indiaUpiResetPinActivity.A03.setText(indiaUpiResetPinActivity.getString(R.string.payments_upi_pin_setup_wait_message));
                    indiaUpiResetPinActivity.A0E = hashMap;
                    C0N6 c0n6 = indiaUpiResetPinActivity.A04;
                    C4IA c4ia = (C4IA) c0n6.A06;
                    C000700j.A04(c4ia, "could not cast country data to IndiaUpiMethodData");
                    final C4CE c4ce = ((AbstractActivityC92484Li) indiaUpiResetPinActivity).A0E;
                    String str = c4ia.A0D;
                    String str2 = c4ia.A0E;
                    final String str3 = c4ia.A0A;
                    final String str4 = c0n6.A07;
                    final String str5 = indiaUpiResetPinActivity.A0B;
                    final String str6 = indiaUpiResetPinActivity.A09;
                    final String str7 = indiaUpiResetPinActivity.A0A;
                    final String str8 = indiaUpiResetPinActivity.A0D;
                    final C49F c49f = new C49F() { // from class: X.3jL
                        @Override // X.C49F
                        public final void AGP() {
                            indiaUpiResetPinActivity.A1u();
                        }
                    };
                    if (c4ce != null) {
                        if (TextUtils.isEmpty(str)) {
                            C4C4 c4c4 = new C4C4(c4ce.A01, c4ce.A02, c4ce.A03, c4ce.A0A, c4ce.A04, ((C48B) c4ce).A01, c4ce.A05, c4ce.A0B, c4ce.A08, c4ce.A06, null);
                            AnonymousClass486 anonymousClass486 = new AnonymousClass486() { // from class: X.4CC
                                @Override // X.AnonymousClass486
                                public void AIz(C4GI c4gi) {
                                    c4ce.A03(c4gi.A01, c4gi.A02, str3, str4, hashMap, str5, str6, str7, str8, c49f);
                                }

                                @Override // X.AnonymousClass486
                                public void AJs(C28Q c28q) {
                                    Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to set pin");
                                    C48E c48e = c4ce.A00;
                                    if (c48e != null) {
                                        c48e.AOZ(c28q);
                                    }
                                }
                            };
                            C02L c02l = c4c4.A02;
                            c02l.A05();
                            c4c4.A00(c02l.A03, new C4C3(c4c4, anonymousClass486));
                            return;
                        }
                        c4ce.A03(str, str2, str3, str4, hashMap, str5, str6, str7, str8, c49f);
                        return;
                    }
                    throw null;
                } else if (this instanceof IndiaUpiPaymentActivity) {
                    IndiaUpiPaymentActivity indiaUpiPaymentActivity = (IndiaUpiPaymentActivity) this;
                    if (indiaUpiPaymentActivity.A0G == null) {
                        return;
                    }
                    ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A04.A08 = hashMap;
                    indiaUpiPaymentActivity.A1u();
                    indiaUpiPaymentActivity.ARS();
                    indiaUpiPaymentActivity.A12(R.string.register_wait_message);
                    C4CE c4ce2 = ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0E;
                    String str9 = indiaUpiPaymentActivity.A0G.A07;
                    UserJid userJid = indiaUpiPaymentActivity.A0I;
                    C4GJ c4gj = indiaUpiPaymentActivity.A0K;
                    c4ce2.A01(str9, userJid, c4gj.A0B, c4gj.A0C, c4gj.A09, c4gj.A0A, hashMap, c4gj.A0D, indiaUpiPaymentActivity.A0E, ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0J);
                } else if (this instanceof IndiaUpiMandatePaymentActivity) {
                    IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) this;
                    indiaUpiMandatePaymentActivity.A06.A07(null, "onGetCredentials called", null);
                    C901049r c901049r = new C901049r(2);
                    c901049r.A02 = hashMap;
                    indiaUpiMandatePaymentActivity.A04.A08(c901049r);
                } else if (this instanceof IndiaUpiCheckBalanceActivity) {
                    IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = (IndiaUpiCheckBalanceActivity) this;
                    indiaUpiCheckBalanceActivity.A08.A07(null, "onGetCredentials called", null);
                    C900749o c900749o = new C900749o(2);
                    c900749o.A02 = hashMap;
                    indiaUpiCheckBalanceActivity.A03.A03(c900749o);
                } else {
                    IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
                    C4IA c4ia2 = (C4IA) indiaUpiChangePinActivity.A02.A06;
                    C014406v c014406v2 = indiaUpiChangePinActivity.A04;
                    C000700j.A04(c4ia2, c014406v2.A02(c014406v2.A02, "IndiaUpiChangePinActivity could not cast country data to IndiaUpiMethodData").toString());
                    final C4CE c4ce3 = ((AbstractActivityC92484Li) indiaUpiChangePinActivity).A0E;
                    String str10 = c4ia2.A0D;
                    String str11 = c4ia2.A0E;
                    final String str12 = c4ia2.A0A;
                    final String str13 = indiaUpiChangePinActivity.A02.A07;
                    final String str14 = indiaUpiChangePinActivity.A03;
                    if (c4ce3 != null) {
                        if (TextUtils.isEmpty(str10)) {
                            C4C4 c4c42 = new C4C4(c4ce3.A01, c4ce3.A02, c4ce3.A03, c4ce3.A0A, c4ce3.A04, ((C48B) c4ce3).A01, c4ce3.A05, c4ce3.A0B, c4ce3.A08, c4ce3.A06, null);
                            AnonymousClass486 anonymousClass4862 = new AnonymousClass486() { // from class: X.4CD
                                @Override // X.AnonymousClass486
                                public void AIz(C4GI c4gi) {
                                    c4ce3.A02(c4gi.A01, c4gi.A02, str12, str13, hashMap, str14);
                                }

                                @Override // X.AnonymousClass486
                                public void AJs(C28Q c28q) {
                                    Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to change pin");
                                    C48E c48e = c4ce3.A00;
                                    if (c48e != null) {
                                        c48e.AOZ(c28q);
                                    }
                                }
                            };
                            C02L c02l2 = c4c42.A02;
                            c02l2.A05();
                            c4c42.A00(c02l2.A03, new C4C3(c4c42, anonymousClass4862));
                            return;
                        }
                        c4ce3.A02(str10, str11, str12, str13, hashMap, str14);
                        return;
                    }
                    throw null;
                }
            } else if (i2 == 251) {
                A1f();
            } else if (i2 != 252) {
            } else {
                this.A0N.A07(null, "user canceled", null);
                this.A0M = false;
                if (this.A0L) {
                    this.A0L = false;
                    return;
                }
                A1W();
                finish();
            }
        }
    }

    @Override // X.C4LI, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C02L c02l = this.A01;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            String str = userJid.user;
            if (str != null) {
                this.A0K = str;
                this.A0I = this.A0H.A02();
                this.A09 = this.A04.A04;
                this.A07 = new C895147h(this, ((ActivityC02290Ap) this).A0A, this.A01, ((AbstractActivityC92444Kp) this).A06, this.A0H, this.A0A, ((ActivityC02290Ap) this).A0D, ((C4KG) this).A0C, this.A0B, this.A0D, this.A0F, this.A08, this.A05, getApplicationContext(), this.A06, this.A09);
                if (getIntent() != null) {
                    this.A0J = getIntent().getStringExtra("extra_request_id");
                }
                if (bundle != null) {
                    this.A0M = bundle.getBoolean("payAppShowPinErrorSavedInst");
                    this.A00 = bundle.getInt("showPinConfirmCountSavedInst");
                    ((AbstractActivityC92444Kp) this).A02 = bundle.getInt("setupModeSavedInst", 1);
                }
                this.A0E = new C4CE(this, ((ActivityC02290Ap) this).A0A, this.A01, this.A0H, this.A0C, ((ActivityC02290Ap) this).A0D, ((C4KG) this).A0B, this.A04, ((C4KG) this).A0C, this.A03, this.A0B, this.A0F, this.A08, this.A05, this);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 19) {
            return super.onCreateDialog(i);
        }
        C019208x c019208x = new C019208x(this);
        c019208x.A02(R.string.payments_pin_encryption_error);
        c019208x.A06(R.string.yes, new DialogInterface.OnClickListener() { // from class: X.3Q1
            {
                AbstractActivityC92484Li.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AbstractActivityC92484Li.this.A1e();
            }
        });
        c019208x.A04(R.string.no, new DialogInterface.OnClickListener() { // from class: X.3Q0
            {
                AbstractActivityC92484Li.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AbstractActivityC92484Li.this.A1i();
            }
        });
        C019308y c019308y = c019208x.A01;
        c019308y.A0J = true;
        c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3Py
            {
                AbstractActivityC92484Li.this = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C002701i.A18(AbstractActivityC92484Li.this, 19);
            }
        };
        return c019208x.A00();
    }

    @Override // X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C4CE c4ce = this.A0E;
        if (c4ce != null) {
            c4ce.A00 = null;
        }
        this.A06 = null;
    }

    @Override // X.C4KG, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("payAppShowPinErrorSavedInst", this.A0M);
        bundle.putInt("showPinConfirmCountSavedInst", this.A00);
        bundle.putInt("setupModeSavedInst", ((AbstractActivityC92444Kp) this).A02);
    }
}
