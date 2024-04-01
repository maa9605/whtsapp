package com.whatsapp.payments.ui.widget;

import X.ActivityC02290Ap;
import X.ActivityC02330At;
import X.AnonymousClass093;
import X.C002301c;
import X.C013806p;
import X.C014006r;
import X.C014406v;
import X.C018508q;
import X.C019208x;
import X.C0AT;
import X.C0DV;
import X.C0E7;
import X.C0EX;
import X.C0N2;
import X.C0VZ;
import X.C28Q;
import X.C28S;
import X.C3NS;
import X.C3NV;
import X.C3S0;
import X.C3S1;
import X.C3S2;
import X.C3S3;
import X.C3S4;
import X.C3S5;
import X.C3S7;
import X.C40841sx;
import X.C463026g;
import X.C49682Lx;
import X.C4C5;
import X.C4GJ;
import X.C894547b;
import X.C894647c;
import X.DialogInterfaceC019408z;
import X.InterfaceC002901k;
import X.RunnableC70353Ry;
import X.View$OnClickListenerC70363Rz;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class MandatePaymentBottomSheetFragment extends Hilt_MandatePaymentBottomSheetFragment {
    public Button A00;
    public Button A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C018508q A0B;
    public C0E7 A0C;
    public C002301c A0D;
    public AnonymousClass093 A0F;
    public C28S A0G;
    public C0EX A0H;
    public C463026g A0I;
    public C0DV A0J;
    public C4C5 A0K;
    public C0VZ A0L;
    public C49682Lx A0M;
    public InterfaceC002901k A0N;
    public final C014406v A0P = C014406v.A00("MandatePaymentBottomSheetFragment", "payment", "IN");
    public DialogInterfaceC019408z A0A = null;
    public List A0O = new ArrayList();
    public C0N2 A0E = null;

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        this.A0U = true;
        this.A0N.AS1(new RunnableC70353Ry(this));
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.india_upi_mandate_payment_bottom_sheet, viewGroup, false);
        this.A08 = (TextView) C0AT.A0D(inflate, R.id.title);
        this.A03 = (LinearLayout) C0AT.A0D(inflate, R.id.accept_mandate_container);
        this.A06 = (LinearLayout) C0AT.A0D(inflate, R.id.update_mandate_container);
        this.A07 = (TextView) C0AT.A0D(inflate, R.id.payment_method_title);
        this.A02 = (ImageView) C0AT.A0D(inflate, R.id.payment_method_icon);
        this.A04 = (LinearLayout) C0AT.A0D(inflate, R.id.mandate_info_container);
        this.A00 = (Button) C0AT.A0D(inflate, R.id.positive_button);
        this.A01 = (Button) C0AT.A0D(inflate, R.id.negative_button);
        this.A09 = (TextView) C0AT.A0D(inflate, R.id.to_vpa);
        this.A05 = (LinearLayout) C0AT.A0D(inflate, R.id.payment_method_container);
        return inflate;
    }

    public final View A0y(LinearLayout linearLayout, CharSequence charSequence, CharSequence charSequence2) {
        View inflate = LayoutInflater.from(A09()).inflate(R.layout.india_upi_mandate_detail_row_item, (ViewGroup) linearLayout, false);
        ((TextView) C0AT.A0D(inflate, R.id.left_text)).setText(charSequence);
        ((TextView) C0AT.A0D(inflate, R.id.right_text)).setText(charSequence2);
        return inflate;
    }

    public void A0z() {
        C0DV c0dv = this.A0J;
        c0dv.A04();
        c0dv.A07.A0i(this.A0F);
        C018508q c018508q = this.A0B;
        c018508q.A02.post(new C3S4(this));
    }

    public void A10() {
        C0DV c0dv = this.A0J;
        c0dv.A04();
        this.A0E = c0dv.A08.A06();
        C0DV c0dv2 = this.A0J;
        c0dv2.A04();
        this.A0O = c0dv2.A08.A0B();
        C018508q c018508q = this.A0B;
        c018508q.A02.post(new C3S3(this));
    }

    public final void A11() {
        C014006r c014006r;
        AnonymousClass093 anonymousClass093 = (AnonymousClass093) A02().getParcelable("transaction");
        this.A0F = anonymousClass093;
        C4GJ c4gj = (C4GJ) anonymousClass093.A09;
        if (anonymousClass093.A0F != null) {
            Iterator it = this.A0O.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0N2 c0n2 = (C0N2) it.next();
                if (c0n2.A07.equals(this.A0F.A0F)) {
                    this.A0E = c0n2;
                    break;
                }
            }
        }
        if (this.A0E == null) {
            this.A0P.A03("onPaymentMethodListLoaded: No Selected Payment Method found");
            A09().finish();
        }
        this.A0K = new C4C5(((Hilt_MandatePaymentBottomSheetFragment) this).A00, this.A0B, new C3NV(), this.A0M, this.A0C, this.A0I, this.A0G);
        if (c4gj.A06.A03 != null) {
            this.A06.setVisibility(0);
            C4GJ c4gj2 = (C4GJ) this.A0F.A09;
            C894547b c894547b = c4gj2.A06;
            if (c894547b != null) {
                C894647c c894647c = c894547b.A03;
                if (c894647c.A07.equals("PENDING")) {
                    this.A08.setText(R.string.upi_mandate_transaction_detail_processing_update_bottom_sheet_header);
                }
                if (!TextUtils.isEmpty(c894647c.A08)) {
                    String str = c894647c.A08;
                    if (str != null) {
                        c014006r = C014006r.A00(str, C013806p.A05.A9i());
                    } else {
                        c014006r = null;
                    }
                    if (!this.A0F.A07.equals(c014006r) || !c4gj2.A06.A05.equals(c894647c.A04)) {
                        String A06 = this.A0D.A06(R.string.upi_mandate_bottom_row_item_new_amount);
                        C0VZ c0vz = this.A0L;
                        String str2 = c894647c.A04;
                        if (str2 == null) {
                            str2 = c4gj2.A06.A05;
                        }
                        String A03 = c0vz.A03(c014006r, str2);
                        LinearLayout linearLayout = this.A06;
                        linearLayout.addView(A0y(linearLayout, A06, A03));
                    }
                }
                long j = c894647c.A00;
                if (j > 0 && j != c4gj2.A06.A00) {
                    this.A06.addView(A0y(this.A04, this.A0D.A06(R.string.upi_mandate_bottom_row_item_new_valid_date), this.A0L.A02(c4gj2.A06.A01, c894647c.A00)));
                }
                if (c894647c.A07.equals("INIT") && c894647c.A05.equals("UNKNOWN")) {
                    this.A00.setOnClickListener(new C3S0(this));
                    this.A01.setVisibility(0);
                    this.A01.setOnClickListener(new C3S2(this, c894647c));
                } else {
                    this.A00.setVisibility(8);
                    this.A01.setVisibility(8);
                }
            } else {
                throw null;
            }
        } else {
            this.A03.setVisibility(0);
            C4GJ c4gj3 = (C4GJ) this.A0F.A09;
            A12();
            this.A09.setText(c4gj3.A09);
            this.A00.setOnClickListener(new C3S7(this));
            this.A04.removeAllViews();
            String A032 = this.A0L.A03(this.A0F.A07, c4gj3.A06.A05);
            LinearLayout linearLayout2 = this.A04;
            linearLayout2.addView(A0y(linearLayout2, this.A0D.A06(R.string.upi_mandate_bottom_row_item_amount), A032));
            String A062 = this.A0D.A06(R.string.upi_mandate_bottom_row_item_valid_date);
            C0VZ c0vz2 = this.A0L;
            C894547b c894547b2 = c4gj3.A06;
            String A02 = c0vz2.A02(c894547b2.A01, c894547b2.A00);
            LinearLayout linearLayout3 = this.A04;
            linearLayout3.addView(A0y(linearLayout3, A062, A02));
            String A063 = this.A0D.A06(R.string.upi_mandate_bottom_row_item_frequency);
            String A064 = this.A0D.A06(R.string.upi_mandate_bottom_row_item_frequency_once);
            LinearLayout linearLayout4 = this.A04;
            linearLayout4.addView(A0y(linearLayout4, A063, A064));
        }
        this.A05.setOnClickListener(new C3S5(this));
    }

    public final void A12() {
        this.A07.setText(C40841sx.A0G(this.A0J, this.A0D, this.A0E));
        if (this.A0E.A04() != null) {
            this.A02.setImageBitmap(this.A0E.A04());
        }
    }

    public /* synthetic */ void A13() {
        this.A0H.A02(this.A0F);
    }

    public /* synthetic */ void A14() {
        if (this.A0F.A0F != null && this.A0O.size() >= 2) {
            View inflate = LayoutInflater.from(((Hilt_MandatePaymentBottomSheetFragment) this).A00).inflate(R.layout.india_upi_method_selection_dialog, (ViewGroup) null);
            ViewGroup viewGroup = (ViewGroup) C0AT.A0D(inflate, R.id.methods_list);
            for (int i = 0; i < this.A0O.size(); i++) {
                C0N2 c0n2 = (C0N2) this.A0O.get(i);
                View inflate2 = LayoutInflater.from(((Hilt_MandatePaymentBottomSheetFragment) this).A00).inflate(R.layout.india_upi_method_row_item, (ViewGroup) null);
                TextView textView = (TextView) C0AT.A0D(inflate2, R.id.payment_method_title);
                Bitmap A04 = c0n2.A04();
                if (A04 != null) {
                    ((ImageView) C0AT.A0D(inflate2, R.id.payment_method_icon)).setImageBitmap(A04);
                }
                textView.setText(C40841sx.A0G(this.A0J, this.A0D, c0n2));
                inflate2.setId(i);
                inflate2.setOnClickListener(new View$OnClickListenerC70363Rz(this, inflate2));
                viewGroup.addView(inflate2);
            }
            C019208x c019208x = new C019208x(((Hilt_MandatePaymentBottomSheetFragment) this).A00);
            c019208x.A03(R.string.google_account_picker_title);
            c019208x.A07(inflate);
            c019208x.A01.A0J = true;
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3S6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.cancel();
                }
            });
            DialogInterfaceC019408z A00 = c019208x.A00();
            this.A0A = A00;
            A00.show();
        }
    }

    public /* synthetic */ void A15() {
        A18(this.A0E);
    }

    public /* synthetic */ void A16() {
        A18(this.A0E);
    }

    public /* synthetic */ void A17(View view) {
        if (this.A0A != null) {
            this.A0E = (C0N2) this.A0O.get(view.getId());
            A12();
            this.A0A.cancel();
        }
    }

    public final void A18(C0N2 c0n2) {
        ActivityC02330At A09 = A09();
        String str = this.A0F.A0I;
        Intent intent = new Intent(A09, IndiaUpiMandatePaymentActivity.class);
        intent.putExtra("payment_transaction_info_id", str);
        intent.putExtra("payment_method", c0n2);
        intent.putExtra("is_accept_mandate", true);
        A0i(intent);
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) A09();
        if (activityC02290Ap == null) {
            throw null;
        }
        activityC02290Ap.A19("MandatePaymentBottomSheetFragment");
    }

    public /* synthetic */ void A19(final C894647c c894647c) {
        this.A0B.A06(0, R.string.register_wait_message);
        this.A0K.A01(this.A0F, c894647c, new C3NS() { // from class: X.3k2
            {
                MandatePaymentBottomSheetFragment.this = this;
            }

            @Override // X.C3NS
            public final void ANl(C28Q c28q) {
                MandatePaymentBottomSheetFragment.this.A1A(c894647c, c28q);
            }
        });
    }

    public void A1A(C894647c c894647c, C28Q c28q) {
        this.A0B.A03();
        if (c28q == null) {
            c894647c.A05 = "REJECT";
            c894647c.A07 = "SUCCESS";
            this.A0N.AS1(new C3S1(this));
            ((ActivityC02290Ap) A09()).A19("MandatePaymentBottomSheetFragment");
        }
    }
}
