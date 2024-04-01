package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiPaymentBankSetupActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4C0  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4C0 extends C48B {
    public AnonymousClass484 A00;
    public final Context A01;
    public final C018508q A02;
    public final C0E7 A03;
    public final C013606n A04;
    public final C894947f A05;
    public final C90564Bm A06;
    public final C28S A07;
    public final C0DV A08;

    public C4C0(Context context, C018508q c018508q, C0DV c0dv, C0E7 c0e7, C894947f c894947f, C463026g c463026g, C013606n c013606n, C28S c28s, C90564Bm c90564Bm, AnonymousClass484 anonymousClass484) {
        super(c463026g, c894947f.A04);
        this.A01 = context;
        this.A02 = c018508q;
        this.A08 = c0dv;
        this.A03 = c0e7;
        this.A05 = c894947f;
        this.A04 = c013606n;
        this.A07 = c28s;
        this.A06 = c90564Bm;
        this.A00 = anonymousClass484;
    }

    public static boolean A00(C90564Bm c90564Bm, ArrayList arrayList, ArrayList arrayList2, C90544Bk c90544Bk) {
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return (((C4IA) arrayList.get(0)).A01 > 1 && TextUtils.isEmpty(c90564Bm.A03()) && (arrayList2 == null || arrayList2.size() <= 0 || c90544Bk == null)) ? false : true;
    }

    public void A01() {
        Log.i("PAY: IndiaUpiPaymentSetup sendGetBanksList called");
        final C3NV c3nv = super.A00;
        c3nv.A04("upi-get-banks");
        C463026g c463026g = super.A01;
        C02590Ca c02590Ca = new C02590Ca("account", new C04P[]{new C04P("action", "upi-get-banks", null, (byte) 0), new C04P("version", 2)}, null, null);
        final Context context = this.A01;
        final C018508q c018508q = this.A02;
        final C0E7 c0e7 = this.A03;
        final C28S c28s = this.A07;
        c463026g.A0F("get", c02590Ca, new C91754Gd(context, c018508q, c0e7, c28s, c3nv) { // from class: X.4IE
            @Override // X.C91754Gd, X.C28V
            public void A02(C28Q c28q) {
                super.A02(c28q);
                AnonymousClass484 anonymousClass484 = C4C0.this.A00;
                if (anonymousClass484 != null) {
                    ((IndiaUpiPaymentBankSetupActivity) anonymousClass484).A1c(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A03(C28Q c28q) {
                super.A03(c28q);
                AnonymousClass484 anonymousClass484 = C4C0.this.A00;
                if (anonymousClass484 != null) {
                    ((IndiaUpiPaymentBankSetupActivity) anonymousClass484).A1c(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A04(C02590Ca c02590Ca2) {
                super.A04(c02590Ca2);
                C4C0 c4c0 = C4C0.this;
                C2EG ABu = c4c0.A08.A03().ABu();
                if (ABu != null) {
                    ArrayList AQa = ABu.AQa(c4c0.A04, c02590Ca2);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = AQa.iterator();
                    C90544Bk c90544Bk = null;
                    while (it.hasNext()) {
                        C0K9 c0k9 = (C0K9) it.next();
                        if (c0k9 instanceof C90544Bk) {
                            C90544Bk c90544Bk2 = (C90544Bk) c0k9;
                            if (c90544Bk2.A05() != null) {
                                arrayList2.add(c90544Bk2);
                            } else {
                                Bundle bundle = c90544Bk2.A00;
                                if (bundle != null && bundle.getStringArrayList("pspRouting") != null) {
                                    c90544Bk = c90544Bk2;
                                }
                            }
                        } else if (c0k9 instanceof C4IA) {
                            arrayList.add(c0k9);
                        }
                    }
                    if (C4C0.A00(c4c0.A06, arrayList, arrayList2, c90544Bk)) {
                        c4c0.A05.A09(arrayList, arrayList2, c90544Bk);
                        AnonymousClass484 anonymousClass484 = c4c0.A00;
                        if (anonymousClass484 != null) {
                            ((IndiaUpiPaymentBankSetupActivity) anonymousClass484).A1e(arrayList, arrayList2, c90544Bk, null);
                            return;
                        }
                        return;
                    }
                    StringBuilder sb = new StringBuilder("PAY: received invalid data from get-banks: banks: ");
                    sb.append(arrayList);
                    sb.append(" psps: ");
                    sb.append(arrayList2);
                    sb.append(" pspRouting: ");
                    sb.append(c90544Bk);
                    sb.append(" , try get bank list directly.");
                    Log.w(sb.toString());
                    AnonymousClass484 anonymousClass4842 = c4c0.A00;
                    if (anonymousClass4842 == null) {
                        return;
                    }
                    ((IndiaUpiPaymentBankSetupActivity) anonymousClass4842).A1e(null, null, null, new C28Q());
                    return;
                }
                throw null;
            }
        }, 0L);
    }
}
