package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4F7  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4F7 extends C0MU {
    public InterfaceC02360Aw A00;
    public final C002301c A03;
    public final C0N6 A04;
    public final C4CB A05;
    public final C4CE A06;
    public final String A08;
    public final C014406v A07 = C014406v.A00("IndiaUpiCheckPinViewModel", "onboarding", "IN");
    public C0HK A01 = new C0HK();
    public C461825l A02 = new C461825l();

    public C4F7(InterfaceC02360Aw interfaceC02360Aw, C002301c c002301c, C4CE c4ce, C4CB c4cb, C0N6 c0n6, String str) {
        this.A00 = interfaceC02360Aw;
        this.A03 = c002301c;
        this.A06 = c4ce;
        this.A05 = c4cb;
        this.A04 = c0n6;
        this.A08 = str;
    }

    public /* synthetic */ void A02(C014006r c014006r, C014006r c014006r2, C28Q c28q) {
        C0HK c0hk = this.A01;
        C4A3 c4a3 = new C4A3();
        c4a3.A01 = true;
        c0hk.A0B(c4a3);
        if (c28q == null && c014006r != null && c014006r2 != null) {
            C900849p c900849p = new C900849p(2);
            C002301c c002301c = this.A03;
            c900849p.A02 = c002301c.A0D(R.string.upi_check_balance_dialog_text, c002301c.A0D(R.string.upi_check_balance_dialog_total_balance, C013806p.A05.A7z(c002301c, c014006r)), c002301c.A0D(R.string.upi_check_balance_dialog_usable_balance, C013806p.A05.A7z(c002301c, c014006r2)));
            this.A02.A0B(c900849p);
            return;
        }
        C014406v c014406v = this.A07;
        StringBuilder A0P = C000200d.A0P("error: ");
        A0P.append(c28q.A06);
        c014406v.A03(A0P.toString());
        C900849p c900849p2 = new C900849p(3);
        c900849p2.A03 = this.A03.A06(R.string.upi_check_balance_error_message);
        this.A02.A0B(c900849p2);
    }

    public void A03(C900749o c900749o) {
        String A01;
        int i = c900749o.A00;
        if (i == 0) {
            C0HK c0hk = this.A01;
            String A06 = this.A03.A06(R.string.register_wait_message);
            C4A3 c4a3 = new C4A3();
            c4a3.A00 = A06;
            c0hk.A0B(c4a3);
            this.A06.A00();
        } else if (i == 1) {
            String str = c900749o.A01;
            C0N6 c0n6 = this.A04;
            C900849p c900849p = new C900849p(0);
            c900849p.A05 = str;
            c900849p.A04 = c0n6.A08;
            c900849p.A01 = (C4IA) c0n6.A06;
            c900849p.A06 = c0n6.A0A;
            this.A02.A0B(c900849p);
        } else if (i == 2) {
            HashMap hashMap = c900749o.A02;
            C0HK c0hk2 = this.A01;
            String A062 = this.A03.A06(R.string.register_wait_message);
            C4A3 c4a32 = new C4A3();
            c4a32.A00 = A062;
            c0hk2.A0B(c4a32);
            C0N6 c0n62 = this.A04;
            C4IA c4ia = (C4IA) c0n62.A06;
            final C4CB c4cb = this.A05;
            String str2 = c4ia.A0D;
            String str3 = c4ia.A0E;
            String str4 = c4ia.A0A;
            String str5 = this.A08;
            String str6 = c0n62.A07;
            final C78423jt c78423jt = new C78423jt(this);
            if (c4cb != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C04P("action", "upi-check-balance", null, (byte) 0));
                C000200d.A1A("vpa", str2, arrayList);
                if (!TextUtils.isEmpty(str3)) {
                    C000200d.A1A("vpa-id", str3, arrayList);
                }
                arrayList.add(new C04P("seq-no", str5, null, (byte) 0));
                arrayList.add(new C04P("upi-bank-info", str4, null, (byte) 0));
                arrayList.add(new C04P("device-id", c4cb.A0A, null, (byte) 0));
                C000200d.A1A("credential-id", str6, arrayList);
                if (hashMap != null && (A01 = C894947f.A01(hashMap, "MPIN")) != null) {
                    C000200d.A1A("mpin", A01, arrayList);
                }
                C463026g c463026g = c4cb.A07;
                C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
                final Context context = c4cb.A00;
                final C018508q c018508q = c4cb.A01;
                final C0E7 c0e7 = c4cb.A03;
                final C28S c28s = c4cb.A06;
                final C3NV c3nv = ((C48B) c4cb).A00;
                c463026g.A0F("get", c02590Ca, new C91754Gd(context, c018508q, c0e7, c28s, c3nv) { // from class: X.4IR
                    @Override // X.C91754Gd, X.C28V
                    public void A02(C28Q c28q) {
                        super.A02(c28q);
                        C78423jt c78423jt2 = c78423jt;
                        if (c78423jt2 != null) {
                            c78423jt2.A00.A02(null, null, c28q);
                        }
                    }

                    @Override // X.C91754Gd, X.C28V
                    public void A03(C28Q c28q) {
                        super.A03(c28q);
                        C78423jt c78423jt2 = c78423jt;
                        if (c78423jt2 != null) {
                            c78423jt2.A00.A02(null, null, c28q);
                        }
                    }

                    @Override // X.C91754Gd, X.C28V
                    public void A04(C02590Ca c02590Ca2) {
                        Bundle bundle;
                        Bundle bundle2;
                        super.A04(c02590Ca2);
                        C02590Ca A0D = c02590Ca2.A0D("account");
                        if (A0D == null) {
                            Log.e("PAY: IndiaUpiPaymentMethodAction sendCheckPin: empty account node");
                            c78423jt.A00.A02(null, null, new C28Q());
                            return;
                        }
                        C90544Bk c90544Bk = new C90544Bk();
                        c90544Bk.A03(C4CB.this.A04, 6, A0D);
                        Bundle bundle3 = c90544Bk.A00;
                        if ((bundle3 != null && bundle3.getString("updatedVpaFor") != null) || (bundle = c90544Bk.A00) == null || !"1".equals(bundle.getString("valid")) || (bundle2 = c90544Bk.A00) == null || bundle2.getString("balance") == null) {
                            c78423jt.A00.A02(null, null, new C28Q());
                            return;
                        }
                        Bundle bundle4 = c90544Bk.A00;
                        C014006r A00 = C014006r.A00(bundle4 != null ? bundle4.getString("balance") : null, C013806p.A05.A9i());
                        Bundle bundle5 = c90544Bk.A00;
                        c78423jt.A00.A02(A00, C014006r.A00(bundle5 != null ? bundle5.getString("usableBalance") : null, C013806p.A05.A9i()), null);
                    }
                }, 0L);
                return;
            }
            throw null;
        }
    }
}
