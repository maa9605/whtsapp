package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Dl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91054Dl extends C0HS {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public C91054Dl(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    @Override // X.C0HS
    public void A06() {
        this.A00.A12(R.string.register_wait_message);
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        C0DV c0dv = ((AbstractActivityC92484Li) this.A00).A0C;
        c0dv.A04();
        return c0dv.A08.A0B();
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        int A03;
        List list = (List) obj;
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        if (!((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0L && !indiaUpiPaymentActivity.A0f) {
            indiaUpiPaymentActivity.ARS();
        }
        if (list != null && list.size() != 0) {
            C014406v c014406v = indiaUpiPaymentActivity.A0i;
            StringBuilder A0P = C000200d.A0P("onPostExecute got methods: ");
            A0P.append(list.size());
            c014406v.A07(null, A0P.toString(), null);
            List A032 = C0N2.A03(list, ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0B.A02());
            indiaUpiPaymentActivity.A0b = A032;
            StringBuilder A0P2 = C000200d.A0P("onPostExecute got paymentMethodList for store: ");
            A0P2.append(Integer.valueOf(A032.size()));
            c014406v.A03(A0P2.toString());
            List list2 = indiaUpiPaymentActivity.A0b;
            if (list2 != null && list2.size() > 0) {
                if (indiaUpiPaymentActivity.A0G != null) {
                    Iterator it = indiaUpiPaymentActivity.A0b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0N2 c0n2 = (C0N2) it.next();
                        if (c0n2.A07.equals(indiaUpiPaymentActivity.A0G.A07)) {
                            indiaUpiPaymentActivity.A0b.remove(c0n2);
                            break;
                        }
                    }
                    indiaUpiPaymentActivity.A0b.add(0, indiaUpiPaymentActivity.A0G);
                } else {
                    indiaUpiPaymentActivity.A0G = (C0N2) indiaUpiPaymentActivity.A0b.get(0);
                }
                indiaUpiPaymentActivity.A0W.setBankLogo(indiaUpiPaymentActivity.A0G.A04());
                PaymentView paymentView = indiaUpiPaymentActivity.A0W;
                C0DV c0dv = ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0C;
                C002301c c002301c = indiaUpiPaymentActivity.A08;
                List list3 = indiaUpiPaymentActivity.A0b;
                C0N2 c0n22 = indiaUpiPaymentActivity.A0G;
                if (c0n22 != null) {
                    A03 = 0;
                    while (true) {
                        if (A03 < list3.size()) {
                            if (((C0N2) list3.get(A03)).A07.equals(c0n22.A07)) {
                                break;
                            }
                            A03++;
                        } else {
                            A03 = 0;
                            break;
                        }
                    }
                } else {
                    A03 = C40841sx.A03(list3);
                }
                paymentView.setPaymentMethodText(C40841sx.A0G(c0dv, c002301c, (C0N2) list3.get(A03)));
                PaymentView paymentView2 = indiaUpiPaymentActivity.A0W;
                if (paymentView2.A00 != 1) {
                    paymentView2.A03();
                }
            }
            indiaUpiPaymentActivity.A0U = null;
            return;
        }
        indiaUpiPaymentActivity.A0i.A07(null, "PopulateMethodsForSend could not find methods;", null);
        indiaUpiPaymentActivity.finish();
    }
}
