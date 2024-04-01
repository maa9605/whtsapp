package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.AbstractC03520Ga;
import X.ActivityC02290Ap;
import X.C000200d;
import X.C014406v;
import X.C019208x;
import X.C02590Ca;
import X.C02770Cu;
import X.C02780Cv;
import X.C03680Gq;
import X.C06870Vj;
import X.C0DV;
import X.C0EU;
import X.C0GZ;
import X.C0KJ;
import X.C0U1;
import X.C28Q;
import X.C28V;
import X.C2Lw;
import X.C2MH;
import X.C36971lf;
import X.C37071lp;
import X.C463026g;
import X.C468228k;
import X.C4CV;
import X.C4KG;
import X.C4LH;
import X.C90944Da;
import X.InterfaceC03640Gm;
import X.RunnableC69783Pt;
import X.RunnableC69803Pv;
import X.View$OnClickListenerC69813Pw;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity;

/* loaded from: classes3.dex */
public class IndiaUpiPaymentsTosActivity extends C4LH implements InterfaceC03640Gm {
    public C06870Vj A00;
    public C0GZ A02;
    public C0EU A03;
    public C0DV A04;
    public C4CV A05;
    public C2MH A06;
    public C03680Gq A01 = AbstractC03520Ga.A04;
    public boolean A07 = false;
    public boolean A08 = false;
    public final C37071lp A09 = new C37071lp();
    public final C014406v A0A = C014406v.A00("IndiaUpiPaymentsTosActivity", "onboarding", "IN");

    public /* synthetic */ void A1a() {
        this.A09.A04 = Boolean.TRUE;
    }

    public /* synthetic */ void A1b() {
        this.A09.A03 = Boolean.TRUE;
    }

    public final void A1c(int i) {
        this.A05.A03.A03();
        this.A0A.A08("showErrorAndFinish", null);
        findViewById(R.id.progress).setVisibility(4);
        int A00 = C90944Da.A00(i, null);
        if (A00 == 0) {
            A00 = R.string.payments_tos_error;
        }
        AUj(A00);
    }

    public void A1d(Button button) {
        this.A05.A03.A04();
        button.setVisibility(8);
        findViewById(R.id.progress).setVisibility(0);
        final C463026g c463026g = ((C4KG) this).A0C;
        if (c463026g != null) {
            c463026g.A0G("set", "urn:xmpp:whatsapp:account", new C02590Ca("accept_pay", null, null, null), new C28V(c463026g.A04.A00, c463026g.A00, c463026g.A02, c463026g.A0A) { // from class: X.3w1
                @Override // X.C28V
                public void A02(C28Q c28q) {
                    C014406v c014406v = c463026g.A0G;
                    StringBuilder sb = new StringBuilder("Tos onRequestError: ");
                    sb.append(c28q);
                    c014406v.A07(null, sb.toString(), null);
                    this.ANw(c28q);
                }

                @Override // X.C28V
                public void A03(C28Q c28q) {
                    C014406v c014406v = c463026g.A0G;
                    StringBuilder sb = new StringBuilder("Tos onResponseError: ");
                    sb.append(c28q);
                    c014406v.A07(null, sb.toString(), null);
                    this.AO1(c28q);
                }

                @Override // X.C28V
                public void A04(C02590Ca c02590Ca) {
                    String str;
                    String str2;
                    C02590Ca A0D = c02590Ca.A0D("accept_pay");
                    C77103hf c77103hf = new C77103hf();
                    if (A0D != null) {
                        C04P A0A = A0D.A0A("accept");
                        if (A0A != null) {
                            str = A0A.A03;
                        } else {
                            str = null;
                        }
                        c77103hf.A02 = "1".equals(str);
                        C04P A0A2 = A0D.A0A("outage");
                        if (A0A2 != null) {
                            str2 = A0A2.A03;
                        } else {
                            str2 = null;
                        }
                        c77103hf.A00 = "1".equals(str2);
                        C04P A0A3 = A0D.A0A("sandbox");
                        boolean equals = "1".equals(A0A3 != null ? A0A3.A03 : null);
                        c77103hf.A01 = equals;
                        C000200d.A0l(c463026g.A0C, "payments_sandbox", equals);
                    } else {
                        c77103hf.A02 = false;
                    }
                    this.AO2(c77103hf);
                }
            }, 0L);
            C37071lp c37071lp = this.A09;
            c37071lp.A00 = Boolean.TRUE;
            ((AbstractActivityC92444Kp) this).A04.A07(c37071lp);
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC03640Gm
    public void ANw(C28Q c28q) {
        C014406v c014406v = this.A0A;
        StringBuilder A0P = C000200d.A0P("got request error for accept-tos: ");
        A0P.append(c28q.A00);
        c014406v.A07(null, A0P.toString(), null);
        A1c(c28q.A00);
    }

    @Override // X.InterfaceC03640Gm
    public void AO1(C28Q c28q) {
        C014406v c014406v = this.A0A;
        StringBuilder A0P = C000200d.A0P("got response error for accept-tos: ");
        A0P.append(c28q.A00);
        c014406v.A07(null, A0P.toString(), null);
        C4CV c4cv = this.A05;
        int i = c28q.A00;
        String str = c28q.A06;
        C36971lf A01 = c4cv.A01(17);
        A01.A05 = Integer.toString(i);
        A01.A06 = str;
        c4cv.A01.A0B(A01, null, false);
        A1c(c28q.A00);
    }

    @Override // X.InterfaceC03640Gm
    public void AO2(C468228k c468228k) {
        C014406v c014406v = this.A0A;
        StringBuilder A0P = C000200d.A0P("got response for accept-tos: ");
        A0P.append(c468228k.A02);
        c014406v.A07(null, A0P.toString(), null);
        if (this.A01.A03.equals("tos_no_wallet")) {
            if (c468228k.A00) {
                C019208x c019208x = new C019208x(this);
                c019208x.A02(R.string.payments_tos_outage);
                c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Pu
                    {
                        IndiaUpiPaymentsTosActivity.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        IndiaUpiPaymentsTosActivity indiaUpiPaymentsTosActivity = IndiaUpiPaymentsTosActivity.this;
                        dialogInterface.dismiss();
                        indiaUpiPaymentsTosActivity.finish();
                    }
                });
                c019208x.A01();
                return;
            }
            C0KJ A05 = this.A03.A05();
            if (A05 != null) {
                String str = A05.A02;
                if (!TextUtils.isEmpty(str) && str.startsWith("tos_upgrade_step_up")) {
                    this.A03.A04().edit().remove("payment_step_up_info").apply();
                }
            }
            this.A02.A05(this.A01);
            C4CV c4cv = this.A05;
            c4cv.A01.A0B(c4cv.A01(17), null, false);
            if (this.A07) {
                Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
                A1Z(intent);
                A14(intent);
            }
            setResult(-1);
            finish();
        }
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A08) {
            setResult(0);
            finish();
            return;
        }
        super.onBackPressed();
        C37071lp c37071lp = this.A09;
        c37071lp.A02 = Boolean.TRUE;
        ((AbstractActivityC92444Kp) this).A04.A07(c37071lp);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        findViewById(R.id.payments_tos_image_section).setVisibility(configuration.orientation == 2 ? 8 : 0);
    }

    @Override // X.C4LH, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        C37071lp c37071lp;
        super.onCreate(bundle);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("stepName");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.A01 = this.A02.A01(stringExtra);
                this.A07 = true;
            } else {
                this.A01 = this.A02.A01("tos_no_wallet");
            }
            ((AbstractActivityC92444Kp) this).A02 = getIntent().getIntExtra("extra_setup_mode", 1);
        }
        setContentView(R.layout.india_upi_payment_tos);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.payments_activity_title);
            A0c.A0L(true);
        }
        TextView textView = (TextView) findViewById(R.id.payments_tos_title);
        textView.setText(R.string.payments_tos_title_text);
        if (getIntent() != null && getIntent().getBooleanExtra("extra_show_updated_tos", false)) {
            this.A08 = true;
            textView.setText(R.string.payments_tos_v2_title_text);
            c37071lp = this.A09;
            c37071lp.A01 = Boolean.TRUE;
        } else {
            c37071lp = this.A09;
            c37071lp.A01 = Boolean.FALSE;
        }
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.payments_tos_desc);
        SpannableString A00 = this.A06.A00(this, getString(R.string.payments_tos_desc_text), new String[]{"terms-and-privacy-policy", "payment-provider-terms"}, new String[]{this.A00.A00("https://www.whatsapp.com/legal/#payments-in").toString(), this.A00.A00("https://www.whatsapp.com/legal/#payments-payment-provider-in").toString()}, new Runnable[]{new RunnableC69783Pt(this), new RunnableC69803Pv(this)});
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(((ActivityC02290Ap) this).A0E, textEmojiLabel));
        textEmojiLabel.A07 = new C02770Cu();
        textEmojiLabel.setText(A00);
        Button button = (Button) findViewById(R.id.payments_tos_continue);
        button.setOnClickListener(new View$OnClickListenerC69813Pw(this, button));
        C014406v c014406v = this.A0A;
        StringBuilder A0P = C000200d.A0P("onCreate step: ");
        A0P.append(this.A01);
        c014406v.A07(null, A0P.toString(), null);
        C2Lw c2Lw = this.A05.A03;
        c2Lw.A03();
        c37071lp.A05 = c2Lw.A02();
        onConfigurationChanged(getResources().getConfiguration());
    }

    @Override // X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A04.A05(this);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A08 = bundle.getBoolean("extra_show_updated_tos");
    }

    @Override // X.C4KG, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_updated_tos", this.A08);
    }
}
