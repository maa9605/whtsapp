package com.whatsapp.payments.ui;

import X.AbstractActivityC92374Kb;
import X.ActivityC02290Ap;
import X.AnonymousClass486;
import X.C000700j;
import X.C002701i;
import X.C013606n;
import X.C014406v;
import X.C019208x;
import X.C019308y;
import X.C01C;
import X.C02L;
import X.C0DV;
import X.C0GZ;
import X.C0N2;
import X.C0N6;
import X.C0U1;
import X.C28S;
import X.C40841sx;
import X.C463026g;
import X.C49682Lx;
import X.C4A6;
import X.C4AS;
import X.C4C3;
import X.C4C4;
import X.C4CB;
import X.C4CV;
import X.C4EA;
import X.C4IA;
import X.C4KP;
import X.C894947f;
import X.C90564Bm;
import X.C90944Da;
import X.InterfaceC03640Gm;
import X.View$OnClickListenerC92174Hu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;

/* loaded from: classes3.dex */
public class IndiaUpiBankAccountDetailsActivity extends AbstractActivityC92374Kb implements C4A6 {
    public C02L A00;
    public C0N6 A01;
    public C013606n A02;
    public C894947f A03;
    public C90564Bm A04;
    public C0GZ A05;
    public C28S A06;
    public C463026g A07;
    public C4CB A08;
    public C4CV A09;
    public C90944Da A0A;
    public View$OnClickListenerC92174Hu A0B;
    public C4AS A0C;
    public C49682Lx A0D;
    public final C014406v A0E = C014406v.A00("IndiaUpiBankAccountDetailsActivity", "payment-settings", "IN");

    @Override // X.C4KP
    public void A1U(C0N2 c0n2, boolean z) {
        int i;
        super.A1U(c0n2, z);
        C0N6 c0n6 = (C0N6) c0n2;
        this.A01 = c0n6;
        if (z) {
            ((C4KP) this).A05.setText(C40841sx.A0R(this.A01.A08, C40841sx.A0M(c0n6.A0A)));
            ((C4KP) this).A06.setText(this.A04.A05());
            ((C4KP) this).A06.A03 = getString(R.string.vpa_copied_to_clipboard);
            this.A0B = new View$OnClickListenerC92174Hu(this);
            ((ViewGroup) findViewById(R.id.widget_container)).addView(this.A0B);
            View$OnClickListenerC92174Hu view$OnClickListenerC92174Hu = this.A0B;
            view$OnClickListenerC92174Hu.A05 = this;
            C4IA c4ia = (C4IA) c0n2.A06;
            view$OnClickListenerC92174Hu.findViewById(R.id.reset_upi_pin_container).setOnClickListener(view$OnClickListenerC92174Hu);
            view$OnClickListenerC92174Hu.A03 = (TextView) view$OnClickListenerC92174Hu.findViewById(R.id.reset_upi_pin);
            view$OnClickListenerC92174Hu.A00 = view$OnClickListenerC92174Hu.findViewById(R.id.change_upi_pin_container);
            view$OnClickListenerC92174Hu.A01 = view$OnClickListenerC92174Hu.findViewById(R.id.check_balance_container);
            view$OnClickListenerC92174Hu.A02 = view$OnClickListenerC92174Hu.findViewById(R.id.switch_payment_provider_container);
            boolean z2 = c4ia.A0G;
            view$OnClickListenerC92174Hu.A06 = z2;
            if (!z2) {
                view$OnClickListenerC92174Hu.A03.setText(R.string.payments_reset_upi_pin_activity_title);
                view$OnClickListenerC92174Hu.A00.setVisibility(8);
                view$OnClickListenerC92174Hu.A01.setVisibility(8);
            } else {
                view$OnClickListenerC92174Hu.A00.setVisibility(0);
                View view = view$OnClickListenerC92174Hu.A01;
                if (view$OnClickListenerC92174Hu.A04.A0E(C01C.A1v)) {
                    String str = c4ia.A08;
                    if ("OD_SECURED".equals(str) || "OD_UNSECURED".equals(str)) {
                        i = 0;
                        view.setVisibility(i);
                    }
                }
                i = 8;
                view.setVisibility(i);
            }
            view$OnClickListenerC92174Hu.A00.setOnClickListener(view$OnClickListenerC92174Hu);
            view$OnClickListenerC92174Hu.A01.setOnClickListener(view$OnClickListenerC92174Hu);
            view$OnClickListenerC92174Hu.A02.setOnClickListener(view$OnClickListenerC92174Hu);
            this.A0B.A02.setVisibility(((ActivityC02290Ap) this).A0B.A0E(C01C.A1q) ^ true ? 0 : 8);
        }
    }

    public /* synthetic */ void A1W(int i) {
        C002701i.A18(this, i);
        A1X(true);
    }

    public void A1X(boolean z) {
        if (z) {
            this.A0E.A07(null, "unlinking the payment account.", null);
            Intent intent = new Intent(this, PaymentDeleteAccountActivity.class);
            intent.putExtra("extra_remove_payment_account", 1);
            startActivityForResult(intent, 0);
            return;
        }
        A12(R.string.register_wait_message);
        this.A09.A03.A04();
        final C4CV c4cv = this.A09;
        final C4EA c4ea = new C4EA(this, c4cv, 13);
        final InterfaceC03640Gm interfaceC03640Gm = new InterfaceC03640Gm() { // from class: X.4DN
            public final /* synthetic */ int A00 = 13;

            {
                IndiaUpiBankAccountDetailsActivity.this = this;
            }

            @Override // X.InterfaceC03640Gm
            public void ANw(C28Q c28q) {
                c4ea.ANw(c28q);
            }

            @Override // X.InterfaceC03640Gm
            public void AO1(C28Q c28q) {
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = IndiaUpiBankAccountDetailsActivity.this;
                C014406v c014406v = indiaUpiBankAccountDetailsActivity.A0E;
                StringBuilder sb = new StringBuilder("removePayment/onResponseError. paymentNetworkError: ");
                sb.append(c28q);
                c014406v.A07(null, sb.toString(), null);
                C28T c28t = c4cv;
                if (c28t != null) {
                    c28t.AG6(this.A00, c28q);
                }
                int A00 = C90944Da.A00(c28q.A00, null);
                if (A00 == 0) {
                    c4ea.AO1(c28q);
                    return;
                }
                indiaUpiBankAccountDetailsActivity.ARS();
                indiaUpiBankAccountDetailsActivity.AUj(A00);
            }

            @Override // X.InterfaceC03640Gm
            public void AO2(C468228k c468228k) {
                c4ea.AO2(c468228k);
            }
        };
        C4IA c4ia = (C4IA) this.A01.A06;
        C014406v c014406v = this.A0E;
        C000700j.A04(c4ia, c014406v.A02(c014406v.A02, "IndiaUpiBankAccountDetailsActivity onRemovePaymentMethod Unable to get IndiaUpiMethodData").toString());
        final C4CB c4cb = this.A08;
        String str = c4ia.A0D;
        String str2 = c4ia.A0E;
        final String str3 = c4ia.A0A;
        final String str4 = this.A01.A07;
        if (c4cb != null) {
            if (TextUtils.isEmpty(str)) {
                C4C4 c4c4 = new C4C4(c4cb.A00, c4cb.A01, c4cb.A02, c4cb.A08, c4cb.A03, c4cb.A07, c4cb.A04, c4cb.A09, c4cb.A06, c4cb.A05, null);
                AnonymousClass486 anonymousClass486 = new AnonymousClass486() { // from class: X.4CA
                    @Override // X.AnonymousClass486
                    public void AIz(C4GI c4gi) {
                        c4cb.A00(c4gi.A01, c4gi.A02, str3, str4, interfaceC03640Gm);
                    }

                    @Override // X.AnonymousClass486
                    public void AJs(C28Q c28q) {
                        Log.w("PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to remove payment method");
                        InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                        if (interfaceC03640Gm2 != null) {
                            interfaceC03640Gm2.ANw(c28q);
                        }
                    }
                };
                C02L c02l = c4c4.A02;
                c02l.A05();
                c4c4.A00(c02l.A03, new C4C3(c4c4, anonymousClass486));
                return;
            }
            c4cb.A00(str, str2, str3, str4, interfaceC03640Gm);
            return;
        }
        throw null;
    }

    @Override // X.C4KP, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            if (i2 == -1) {
                this.A0C.A00(this);
            }
        } else if (i == 1012 && i2 == -1) {
            View$OnClickListenerC92174Hu view$OnClickListenerC92174Hu = this.A0B;
            view$OnClickListenerC92174Hu.A06 = true;
            view$OnClickListenerC92174Hu.A03.setText(R.string.forgot_upi_pin);
            view$OnClickListenerC92174Hu.A00.setVisibility(0);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AbstractActivityC92374Kb, X.C4KP, X.C4K9, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0C = new C4AS(this.A05);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.payments_bank_account_details);
            A0c.A0L(true);
        }
        this.A0E.A07(null, "onCreate", null);
        ((TextView) findViewById(R.id.footer_processed_by_psp)).setText(getString(R.string.payments_processed_by_psp, getString(C40841sx.A0A(this.A04.A03()).A01)));
        this.A08 = new C4CB(this, ((ActivityC02290Ap) this).A0A, this.A00, ((C4KP) this).A0C, this.A0D, this.A03, ((ActivityC02290Ap) this).A0D, this.A07, this.A02, this.A09, this.A06, this.A04);
    }

    @Override // X.C4KP, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        String string;
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        C0DV c0dv = ((C4KP) this).A0C;
        c0dv.A04();
        boolean z = ((AbstractCollection) c0dv.A07.A0V(1)).size() > 0;
        C019208x c019208x = new C019208x(this);
        if (z) {
            string = getString(R.string.switch_psp_dialog_title_with_warning);
        } else {
            string = getString(R.string.switch_psp_dialog_title);
        }
        CharSequence A0g = C002701i.A0g(string, this, ((ActivityC02290Ap) this).A0H);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = A0g;
        c019308y.A0J = true;
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Ou
            public final /* synthetic */ int A00 = 100;

            {
                IndiaUpiBankAccountDetailsActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C002701i.A18(IndiaUpiBankAccountDetailsActivity.this, this.A00);
            }
        });
        c019208x.A06(R.string.payments_remove_and_continue, new DialogInterface.OnClickListener() { // from class: X.3Ow
            public final /* synthetic */ int A00 = 100;

            {
                IndiaUpiBankAccountDetailsActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IndiaUpiBankAccountDetailsActivity.this.A1W(this.A00);
            }
        });
        c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3Ov
            public final /* synthetic */ int A00 = 100;

            {
                IndiaUpiBankAccountDetailsActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C002701i.A18(IndiaUpiBankAccountDetailsActivity.this, this.A00);
            }
        };
        return c019208x.A00();
    }
}
