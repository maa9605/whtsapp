package com.whatsapp.payments.ui;

import X.C002301c;
import X.C018508q;
import X.C02160Ac;
import X.C02180Ae;
import X.C0BA;
import X.C0DV;
import X.C0N0;
import X.C0N2;
import X.C2GW;
import X.C40841sx;
import X.C41751uS;
import X.C49L;
import X.C49W;
import X.C49X;
import X.C4EB;
import X.C4EC;
import X.C4ED;
import X.View$OnClickListenerC69923Qh;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class PaymentMethodsListPickerFragment extends Hilt_PaymentMethodsListPickerFragment implements C4EB {
    public C018508q A00;
    public C002301c A01;
    public C2GW A02 = new C4ED(this);
    public C41751uS A03;
    public C0DV A04;
    public C49L A05;
    public C4EC A06;
    public C49X A07;

    public static PaymentMethodsListPickerFragment A00(List list) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = new PaymentMethodsListPickerFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("arg_methods", new ArrayList<>(list));
        paymentMethodsListPickerFragment.A0P(bundle);
        return paymentMethodsListPickerFragment;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.payment_method_picker_fragment, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0q() {
        this.A0U = true;
        this.A03.A00(this.A02);
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        this.A03.A01(this.A02);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        final View view2;
        ArrayList parcelableArrayList = A02().getParcelableArrayList("arg_methods");
        if (parcelableArrayList != null) {
            C4EC c4ec = new C4EC(view.getContext(), this.A01, this.A04, this);
            this.A06 = c4ec;
            ((C49W) c4ec).A00 = parcelableArrayList;
            c4ec.notifyDataSetChanged();
            final ListView listView = (ListView) view.findViewById(R.id.methods_list);
            C49X c49x = this.A07;
            final View view3 = null;
            if (c49x != null && c49x.AUQ()) {
                view2 = A04().inflate(R.layout.add_payment_method_row, (ViewGroup) null);
                C02180Ae.A17((ImageView) view2.findViewById(R.id.add_new_account_icon), C02160Ac.A00(view.getContext(), R.color.settings_icon));
                listView.addFooterView(view2);
            } else {
                view2 = null;
            }
            C49X c49x2 = this.A07;
            if (c49x2 != null && (view3 = c49x2.ACC(A04(), null)) != null) {
                listView.addHeaderView(view3);
            }
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.3Qg
                {
                    PaymentMethodsListPickerFragment.this = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view4, int i, long j) {
                    PaymentMethodsListPickerFragment.this.A0z(view3, listView, view2, i);
                }
            });
            listView.setAdapter((ListAdapter) this.A06);
            View findViewById = view.findViewById(R.id.back);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new View$OnClickListenerC69923Qh(this));
            View findViewById2 = view.findViewById(R.id.icon_lock);
            C49X c49x3 = this.A07;
            if (c49x3 != null && !c49x3.AUV()) {
                findViewById2.setVisibility(4);
                return;
            } else {
                findViewById2.setVisibility(0);
                return;
            }
        }
        throw null;
    }

    public void A0y() {
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0D;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A18();
        }
    }

    public void A0z(View view, ListView listView, View view2, int i) {
        if (view == null || i != listView.getPositionForView(view)) {
            if (view2 != null && i == listView.getPositionForView(view2)) {
                C49X c49x = this.A07;
                if (c49x != null) {
                    c49x.AGx();
                    return;
                }
                return;
            }
            C0BA A07 = A07();
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0D;
            if (A07 instanceof C49L) {
                ((C49L) A07).AMp((C0N2) ((C49W) this.A06).A00.get(i - listView.getHeaderViewsCount()));
                if (paymentBottomSheet != null) {
                    paymentBottomSheet.A19(A07);
                    return;
                }
                return;
            }
            C49L c49l = this.A05;
            if (c49l == null) {
                return;
            }
            c49l.AMp((C0N2) ((C49W) this.A06).A00.get(i - listView.getHeaderViewsCount()));
            if (paymentBottomSheet == null) {
                return;
            }
            paymentBottomSheet.A18();
        }
    }

    @Override // X.C4EB
    public int ABI(C0N2 c0n2) {
        C49X c49x = this.A07;
        if (c49x != null) {
            return c49x.ABI(c0n2);
        }
        return 0;
    }

    @Override // X.C4EB
    public String ABJ(C0N2 c0n2) {
        C49X c49x = this.A07;
        if (c49x != null) {
            return c49x.ABJ(c0n2);
        }
        return null;
    }

    @Override // X.C49V
    public String ABL(C0N2 c0n2) {
        C49X c49x = this.A07;
        if (c49x != null) {
            if (!c49x.AUU()) {
                return "";
            }
            String ABL = c49x.ABL(c0n2);
            if (!TextUtils.isEmpty(ABL)) {
                return ABL;
            }
        }
        C0N0 c0n0 = c0n2.A06;
        if (c0n0 != null) {
            if (c0n0.A09()) {
                return C40841sx.A0F(this.A01, c0n2) != null ? C40841sx.A0F(this.A01, c0n2) : "";
            }
            return this.A01.A06(R.string.payment_method_unverified);
        }
        throw null;
    }

    @Override // X.C49V
    public String ABM(C0N2 c0n2) {
        C49X c49x = this.A07;
        if (c49x != null) {
            return c49x.ABM(c0n2);
        }
        return null;
    }

    @Override // X.C4EB
    public boolean AUT() {
        C49X c49x = this.A07;
        return c49x != null && c49x.AUT();
    }

    @Override // X.C4EB
    public void AUe(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
        C49X c49x = this.A07;
        if (c49x != null) {
            c49x.AUe(c0n2, paymentMethodRow);
        }
    }
}
