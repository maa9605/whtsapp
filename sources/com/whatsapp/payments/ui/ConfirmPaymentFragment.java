package com.whatsapp.payments.ui;

import X.C002301c;
import X.C013606n;
import X.C014006r;
import X.C0AT;
import X.C0DV;
import X.C0DW;
import X.C0N0;
import X.C0N2;
import X.C0N8;
import X.C0TN;
import X.C3OZ;
import X.C40841sx;
import X.C49J;
import X.C49K;
import X.C49L;
import X.InterfaceC013706o;
import X.View$OnClickListenerC69333Oa;
import X.View$OnClickListenerC69343Ob;
import X.View$OnClickListenerC69353Oc;
import X.View$OnClickListenerC69363Od;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* loaded from: classes3.dex */
public class ConfirmPaymentFragment extends Hilt_ConfirmPaymentFragment implements C49L {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public Button A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public ProgressBar A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public WaImageView A0C;
    public C002301c A0D;
    public C0TN A0E;
    public C013606n A0F;
    public C0N2 A0G;
    public C0DW A0H;
    public C0DV A0I;
    public C49J A0J;
    public C49K A0K;
    public PaymentMethodRow A0L;
    public String A0M;
    public String A0N;

    public static ConfirmPaymentFragment A00(C0N2 c0n2, UserJid userJid, String str, C014006r c014006r, int i) {
        ConfirmPaymentFragment confirmPaymentFragment = new ConfirmPaymentFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_payment_method", c0n2);
        if (userJid != null) {
            bundle.putString("arg_jid", userJid.getRawString());
        }
        bundle.putString("arg_currency", str);
        bundle.putString("arg_amount", c014006r.toString());
        bundle.putInt("arg_payment_type", i);
        confirmPaymentFragment.A0P(bundle);
        return confirmPaymentFragment;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.confirm_payment_fragment, viewGroup, false);
        this.A07 = (FrameLayout) inflate.findViewById(R.id.title_view);
        this.A0L = (PaymentMethodRow) inflate.findViewById(R.id.payment_method_row);
        this.A05 = (Button) inflate.findViewById(R.id.confirm_payment);
        this.A06 = (FrameLayout) C0AT.A0D(inflate, R.id.footer_view);
        this.A09 = (TextView) inflate.findViewById(R.id.education);
        this.A08 = (ProgressBar) inflate.findViewById(R.id.confirm_payment_progressbar);
        this.A02 = C0AT.A0D(inflate, R.id.education_divider);
        inflate.findViewById(R.id.account_number_divider).setVisibility(8);
        inflate.findViewById(R.id.payment_method_account_id).setVisibility(8);
        AMp(this.A0G);
        this.A04 = inflate.findViewById(R.id.payment_to_merchant_options_container);
        this.A0B = (TextView) inflate.findViewById(R.id.payment_to_merchant_options);
        this.A0C = (WaImageView) inflate.findViewById(R.id.payment_to_merchant_options_icon);
        this.A03 = inflate.findViewById(R.id.payment_rails_container);
        this.A0A = (TextView) inflate.findViewById(R.id.payment_rails_label);
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) super.A0D;
        inflate.findViewById(R.id.payment_method_container).setOnClickListener(new View$OnClickListenerC69363Od(this, paymentBottomSheet));
        inflate.findViewById(R.id.payment_to_merchant_options_container).setOnClickListener(new C3OZ(this, paymentBottomSheet));
        inflate.findViewById(R.id.payment_rails_container).setOnClickListener(new View$OnClickListenerC69333Oa(this, paymentBottomSheet));
        if (this.A0J != null) {
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.contact_info_view);
            if (viewGroup2 != null) {
                this.A0J.AHO(this.A0D, viewGroup2);
            }
            View findViewById = inflate.findViewById(R.id.transaction_amount_info_view);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View$OnClickListenerC69353Oc(this, paymentBottomSheet));
            }
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.extra_info_view);
            if (viewGroup3 != null) {
                this.A0J.A5Z(viewGroup3);
            }
        }
        return inflate;
    }

    @Override // X.C0BA
    public void A0r() {
        this.A0U = true;
        this.A06 = null;
    }

    @Override // X.C0BA
    public void A0s() {
        C0TN c0tn;
        C0TN c0tn2;
        this.A0U = true;
        UserJid nullable = UserJid.getNullable(A02().getString("arg_jid"));
        if (nullable != null) {
            C0DV c0dv = this.A0I;
            c0dv.A04();
            c0tn = c0dv.A08.A05(nullable);
        } else {
            c0tn = null;
        }
        this.A0E = c0tn;
        if (this.A0H.A05() && (c0tn2 = this.A0E) != null && c0tn2.A0E()) {
            if (this.A0G.A08() == 6 && this.A01 == 0) {
                this.A03.setVisibility(0);
                if (this.A0G.A06 != null) {
                    if (this.A00 == 0) {
                        this.A0A.setText(R.string.confirm_payment_bottom_sheet_payment_rails_credit_label);
                    } else {
                        this.A0A.setText(R.string.confirm_payment_bottom_sheet_payment_rails_debit_label);
                    }
                }
            } else {
                this.A03.setVisibility(8);
            }
            A0y(this.A01);
        }
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        C0N2 c0n2 = (C0N2) A02().getParcelable("arg_payment_method");
        if (c0n2 != null) {
            this.A0G = c0n2;
            String string = A02().getString("arg_currency");
            if (string != null) {
                this.A0N = string;
                String string2 = A02().getString("arg_amount");
                if (string2 != null) {
                    this.A0M = string2;
                    Integer valueOf = Integer.valueOf(A02().getInt("arg_payment_type"));
                    if (valueOf == null) {
                        throw null;
                    }
                    this.A01 = valueOf.intValue();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void A0y(int i) {
        this.A01 = i;
        this.A04.setVisibility(0);
        if (i == 0) {
            this.A0B.setText(R.string.buying_goods_and_services);
            this.A0C.setImageResource(R.drawable.cart);
            return;
        }
        this.A0B.setText(R.string.sending_to_friends_and_family);
        this.A0C.setImageResource(R.drawable.ic_contacts_storage_usage);
    }

    public void A0z(C0N2 c0n2, View view) {
        if (this.A0K != null) {
            C49J c49j = this.A0J;
            if (c49j != null && c49j.AUS()) {
                this.A05.setVisibility(8);
                this.A08.setVisibility(0);
            }
            C0TN c0tn = this.A0E;
            if (c0tn != null) {
                c0tn.A0A(this.A01);
            }
            this.A0K.AIt(view, this.A08, c0n2, c0tn, (PaymentBottomSheet) super.A0D);
        }
    }

    public /* synthetic */ void A10(PaymentBottomSheet paymentBottomSheet) {
        C49K c49k;
        if (paymentBottomSheet == null || (c49k = this.A0K) == null) {
            return;
        }
        c49k.AMo(paymentBottomSheet, this.A01);
    }

    public /* synthetic */ void A11(PaymentBottomSheet paymentBottomSheet) {
        C49K c49k;
        if (paymentBottomSheet == null || (c49k = this.A0K) == null) {
            return;
        }
        c49k.AMv(this.A01, paymentBottomSheet);
    }

    public /* synthetic */ void A12(PaymentBottomSheet paymentBottomSheet) {
        C49K c49k;
        if (paymentBottomSheet == null || (c49k = this.A0K) == null) {
            return;
        }
        c49k.AMr(this.A00, paymentBottomSheet);
    }

    @Override // X.C49L
    public void AMp(C0N2 c0n2) {
        boolean z;
        String str;
        String A06;
        C0N8 c0n8;
        this.A0G = c0n2;
        C49J c49j = this.A0J;
        if (c49j != null) {
            z = c49j.AUR(c0n2);
            if (z) {
                String A9a = c49j.A9a(this.A0D, c0n2);
                if (!TextUtils.isEmpty(A9a)) {
                    this.A0L.A01.setText(A9a);
                }
            }
        } else {
            z = false;
        }
        this.A0L.A01.setVisibility(z ? 0 : 8);
        C49J c49j2 = this.A0J;
        String str2 = null;
        if (c49j2 != null) {
            str = c49j2.A9b(c0n2);
        } else {
            str = null;
        }
        PaymentMethodRow paymentMethodRow = this.A0L;
        if (TextUtils.isEmpty(str)) {
            str = C40841sx.A0G(this.A0I, this.A0D, c0n2);
        }
        paymentMethodRow.A04.setText(str);
        C49J c49j3 = this.A0J;
        if (c49j3 == null || (str2 = c49j3.ABK(c0n2)) == null) {
            C0N0 c0n0 = c0n2.A06;
            if (c0n0 == null) {
                throw null;
            }
            if (!c0n0.A09()) {
                str2 = this.A0D.A06(R.string.payment_method_unverified);
            }
        }
        this.A0L.A01(str2);
        C49J c49j4 = this.A0J;
        if (c49j4 != null && c49j4.AUT()) {
            c49j4.AUe(c0n2, this.A0L);
        } else {
            C40841sx.A0b(this.A0L, c0n2);
        }
        if (this.A0J.AUO(c0n2, this.A01)) {
            this.A0L.A02(false);
            this.A0L.A01(this.A0D.A06(R.string.payment_method_unavailable));
        } else {
            this.A0L.A02(true);
        }
        this.A05.setOnClickListener(new View$OnClickListenerC69343Ob(this, c0n2));
        InterfaceC013706o A01 = C013606n.A01(this.A0N);
        C014006r A00 = C014006r.A00(this.A0M, A01.A9i());
        if (A00 != null) {
            C0N0 c0n02 = c0n2.A06;
            if (c0n02 != null) {
                if (c0n02.A09()) {
                    C002301c c002301c = this.A0D;
                    A06 = c002301c.A0D(R.string.confirm_payment_bottom_sheet_confirm_amount_button, A01.A81(c002301c, A00));
                } else {
                    A06 = this.A0D.A06(R.string.confirm_payment_bottom_sheet_confirm_unverified_button);
                }
                C49J c49j5 = this.A0J;
                if (c49j5 != null) {
                    String A90 = c49j5.A90(c0n2, this.A01);
                    if (!TextUtils.isEmpty(A90)) {
                        A06 = A90;
                    }
                    Integer A8z = this.A0J.A8z();
                    if (A8z != null) {
                        this.A05.setBackgroundColor(A8z.intValue());
                        this.A08.getIndeterminateDrawable().setColorFilter(A8z.intValue(), PorterDuff.Mode.SRC_IN);
                    }
                }
                this.A05.setText(A06);
                this.A05.setEnabled(true);
                if (c0n2.A08() == 6 && (c0n8 = (C0N8) c0n2.A06) != null) {
                    this.A00 = c0n8.A03;
                }
                C49J c49j6 = this.A0J;
                if (c49j6 != null) {
                    c49j6.AHN(this.A0D, this.A07);
                    FrameLayout frameLayout = this.A06;
                    if (frameLayout != null) {
                        this.A0J.AKZ(this.A0D, frameLayout, c0n2);
                    }
                    String A9t = this.A0J.A9t(c0n2, this.A01);
                    if (!TextUtils.isEmpty(A9t)) {
                        this.A09.setText(A9t);
                    } else {
                        this.A09.setVisibility(8);
                        this.A02.setVisibility(8);
                    }
                    this.A05.setEnabled(this.A0J.AF8(c0n2));
                }
                C49K c49k = this.A0K;
                if (c49k != null) {
                    c49k.AMq(c0n2, this.A0L);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }
}
