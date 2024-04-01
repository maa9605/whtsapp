package X;

import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.List;

/* renamed from: X.4ED  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4ED extends C2GW {
    public final /* synthetic */ PaymentMethodsListPickerFragment A00;

    public C4ED(PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        this.A00 = paymentMethodsListPickerFragment;
    }

    @Override // X.C2GW
    public void A00() {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = this.A00;
        C0CI A00 = paymentMethodsListPickerFragment.A04.A01().A00();
        A00.A01.A03(new C0CG() { // from class: X.3ja
            @Override // X.C0CG
            public final void A54(Object obj) {
                C4ED.this.A01((List) obj);
            }
        }, paymentMethodsListPickerFragment.A00.A06);
    }

    public void A01(List list) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = this.A00;
        C4EC c4ec = paymentMethodsListPickerFragment.A06;
        C49X c49x = paymentMethodsListPickerFragment.A07;
        if (c49x != null) {
            list = c49x.A7o(list);
        }
        ((C49W) c4ec).A00 = list;
        c4ec.notifyDataSetChanged();
    }
}
