package com.whatsapp.payments.ui;

import X.C002301c;
import X.C014406v;
import X.C02590Ca;
import X.C02770Cu;
import X.C02780Cv;
import X.C02E;
import X.C04P;
import X.C0AT;
import X.C28V;
import X.C3OM;
import X.C3ON;
import X.C3OO;
import X.C3OP;
import X.C3OQ;
import X.C3OR;
import X.C3OS;
import X.C3OT;
import X.C3R1;
import X.C463026g;
import X.C4EJ;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class ReTosFragment extends Hilt_ReTosFragment {
    public Button A00;
    public ProgressBar A01;
    public C02E A02;
    public C002301c A03;
    public C463026g A04;
    public final C014406v A05 = C014406v.A00("ReTosFragment", "onboarding", "COMMON");

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SpannableString A00;
        View inflate = layoutInflater.inflate(R.layout.retos_bottom_sheet, viewGroup, false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C0AT.A0D(inflate, R.id.retos_bottom_sheet_desc);
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A02, textEmojiLabel));
        textEmojiLabel.A07 = new C02770Cu();
        Context context = textEmojiLabel.getContext();
        BrazilReTosFragment brazilReTosFragment = (BrazilReTosFragment) this;
        if (brazilReTosFragment.A02().getBoolean("is_merchant")) {
            A00 = brazilReTosFragment.A01.A00(context, ((ReTosFragment) brazilReTosFragment).A03.A06(R.string.br_p2m_retos_bottom_sheet_desc), new String[]{"wa-merchant-terms", "fb-merchant-agreement", "cielo-merchant-agreement"}, new String[]{brazilReTosFragment.A00.A00("https://www.whatsapp.com/legal/merchant-terms/").toString(), brazilReTosFragment.A00.A00("https://www.facebook.com/legal/commerce_product_merchant_agreement").toString(), brazilReTosFragment.A00.A00("https://www.cielo.com.br/contrato-de-credenciamento-consolidado/").toString()}, new Runnable[]{C3OT.A00, C3OQ.A00, C3OP.A00});
        } else {
            A00 = brazilReTosFragment.A01.A00(context, ((ReTosFragment) brazilReTosFragment).A03.A06(R.string.br_p2p_retos_bottom_sheet_desc), new String[]{"wa-terms", "wa-privacy-policy", "fb-payments-terms", "fb-privacy-policy", "cielo-terms-and-privacy-policy"}, new String[]{brazilReTosFragment.A00.A00("https://www.whatsapp.com/legal/payments-terms-of-service-br#payments").toString(), brazilReTosFragment.A00.A00("https://www.whatsapp.com/legal/payments-terms-of-service-br#payments-privacy-policy").toString(), brazilReTosFragment.A00.A00("https://www.facebook.com/payments_terms").toString(), brazilReTosFragment.A00.A00("https://www.facebook.com/policy.php").toString(), brazilReTosFragment.A00.A00("https://www.cielo.com.br/termos-fb-pay").toString()}, new Runnable[]{C3OO.A00, C3OS.A00, C3OM.A00, C3OR.A00, C3ON.A00});
        }
        textEmojiLabel.setText(A00);
        this.A01 = (ProgressBar) C0AT.A0D(inflate, R.id.progress_bar);
        Button button = (Button) C0AT.A0D(inflate, R.id.retos_bottom_sheet_button);
        this.A00 = button;
        button.setOnClickListener(new C3R1(this));
        return inflate;
    }

    public void A1B() {
        A15(false);
        this.A00.setVisibility(8);
        this.A01.setVisibility(0);
        final C463026g c463026g = this.A04;
        final boolean z = A02().getBoolean("is_consumer");
        final boolean z2 = A02().getBoolean("is_merchant");
        final C4EJ c4ej = new C4EJ(this);
        if (c463026g != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("version", 2));
            if (z) {
                arrayList.add(new C04P("consumer", 1));
            }
            if (z2) {
                arrayList.add(new C04P("merchant", 1));
            }
            c463026g.A0G("set", "urn:xmpp:whatsapp:account", new C02590Ca("accept_pay", (C04P[]) arrayList.toArray(new C04P[0]), null, null), new C28V(c463026g.A04.A00, c463026g.A00, c463026g.A02, c463026g.A0A) { // from class: X.3w0
                public final /* synthetic */ String A02 = "tos_no_wallet";
                public final /* synthetic */ String A03 = "tos_merchant";

                @Override // X.C28V
                public void A02(C28Q c28q) {
                    C014406v c014406v = c463026g.A0G;
                    StringBuilder sb = new StringBuilder("TosV2 onRequestError: ");
                    sb.append(c28q);
                    c014406v.A04(sb.toString());
                    c4ej.ANw(c28q);
                }

                @Override // X.C28V
                public void A03(C28Q c28q) {
                    C014406v c014406v = c463026g.A0G;
                    StringBuilder sb = new StringBuilder("TosV2 onResponseError: ");
                    sb.append(c28q);
                    c014406v.A04(sb.toString());
                    c4ej.AO1(c28q);
                }

                @Override // X.C28V
                public void A04(C02590Ca c02590Ca) {
                    String str;
                    String str2;
                    String str3;
                    C02590Ca A0D = c02590Ca.A0D("accept_pay");
                    C77103hf c77103hf = new C77103hf();
                    boolean z3 = false;
                    if (A0D != null) {
                        C04P A0A = A0D.A0A("consumer");
                        if (A0A != null) {
                            str = A0A.A03;
                        } else {
                            str = null;
                        }
                        C04P A0A2 = A0D.A0A("merchant");
                        if (A0A2 != null) {
                            str2 = A0A2.A03;
                        } else {
                            str2 = null;
                        }
                        if ((!z || "1".equals(str)) && (!z2 || "1".equals(str2))) {
                            z3 = true;
                        }
                        c77103hf.A02 = z3;
                        C04P A0A3 = A0D.A0A("outage");
                        if (A0A3 != null) {
                            str3 = A0A3.A03;
                        } else {
                            str3 = null;
                        }
                        c77103hf.A00 = "1".equals(str3);
                        C04P A0A4 = A0D.A0A("sandbox");
                        c77103hf.A01 = "1".equals(A0A4 != null ? A0A4.A03 : null);
                        if (!TextUtils.isEmpty(str)) {
                            String str4 = this.A02;
                            if (!TextUtils.isEmpty(str4)) {
                                C0GZ c0gz = c463026g.A08;
                                C03680Gq A01 = c0gz.A01(str4);
                                if ("1".equals(str)) {
                                    c0gz.A05(A01);
                                } else {
                                    c0gz.A04(A01);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            String str5 = this.A03;
                            if (!TextUtils.isEmpty(str5)) {
                                C03550Gd c03550Gd = c463026g.A0B;
                                C03680Gq A012 = c03550Gd.A01(str5);
                                if ("1".equals(str2)) {
                                    c03550Gd.A05(A012);
                                } else {
                                    c03550Gd.A04(A012);
                                }
                            }
                        }
                        C000200d.A0l(c463026g.A0C, "payments_sandbox", c77103hf.A01);
                    } else {
                        c77103hf.A02 = false;
                    }
                    c4ej.AO2(c77103hf);
                }
            }, 0L);
            return;
        }
        throw null;
    }
}
