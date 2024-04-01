package com.whatsapp.payments.ui;

import X.AbstractC08940cM;
import X.AnonymousClass012;
import X.C000200d;
import X.C02160Ac;
import X.C0AT;
import X.C0CR;
import X.C0DV;
import X.C0E7;
import X.C0EU;
import X.C0MU;
import X.C0VJ;
import X.C0VW;
import X.C3R4;
import X.C3R5;
import X.C3R6;
import X.C463026g;
import X.C49682Lx;
import X.C4A1;
import X.C4AW;
import X.C4FN;
import X.C4KD;
import X.InterfaceC05620Pl;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.BrazilViralityLinkVerifierActivity;
import com.whatsapp.payments.ui.ViralityLinkVerifierActivity;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ViralityLinkVerifierActivity extends C4KD {
    public View A00;
    public View A01;
    public View A02;
    public WaButton A03;
    public WaButton A04;
    public WaTextView A05;
    public WaTextView A06;
    public C0E7 A07;
    public AnonymousClass012 A08;
    public C0EU A09;
    public C463026g A0A;
    public C0DV A0B;
    public C49682Lx A0C;

    public void A1P(C4AW c4aw) {
        int i = c4aw.A00;
        if (i == 2) {
            this.A01.setVisibility(0);
            this.A02.setVisibility(8);
            this.A00.setVisibility(8);
        } else if (i != 0 && i != 1) {
        } else {
            this.A01.setVisibility(8);
            this.A02.setVisibility(0);
            this.A00.setVisibility(0);
            this.A04.setVisibility(i == 0 ? 0 : 8);
            WaButton waButton = this.A03;
            int i2 = R.string.cancel;
            if (i == 0) {
                i2 = R.string.done;
            }
            waButton.setText(i2);
            Object obj = c4aw.A01;
            if (obj != null) {
                C4A1 c4a1 = (C4A1) obj;
                this.A06.setText(c4a1.A01);
                this.A05.setText(c4a1.A00);
                return;
            }
            throw null;
        }
    }

    public /* synthetic */ void lambda$onCreate$101$ViralityLinkVerifierActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$102$ViralityLinkVerifierActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$103$ViralityLinkVerifierActivity(View view) {
        startActivity(new Intent(this, this.A0B.A03().ACK()));
        finish();
    }

    @Override // X.C4KD, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.virality_link_verifier_activity);
        C0VJ.A0A(this, R.id.virality_activity_root_view).setOnClickListener(new C3R5(this));
        this.A00 = C0VJ.A0A(this, R.id.actionable_container);
        this.A02 = C0VJ.A0A(this, R.id.virality_texts_container);
        this.A01 = C0VJ.A0A(this, R.id.progress_container);
        this.A06 = (WaTextView) C0AT.A0D(this.A02, R.id.payment_enabled_or_not_title);
        this.A05 = (WaTextView) C0AT.A0D(this.A02, R.id.virality_description_text);
        WaButton waButton = (WaButton) C0VJ.A0A(this, R.id.done_or_cancel_button);
        this.A03 = waButton;
        waButton.setOnClickListener(new C3R6(this));
        WaButton waButton2 = (WaButton) C0VJ.A0A(this, R.id.go_to_payments_button);
        this.A04 = waButton2;
        waButton2.setOnClickListener(new C3R4(this));
        BottomSheetBehavior A00 = BottomSheetBehavior.A00(C0VJ.A0A(this, R.id.virality_bottom_sheet));
        A00.A0N(0);
        A00.A0O(3);
        A00.A0E = new AbstractC08940cM() { // from class: X.4EO
            @Override // X.AbstractC08940cM
            public void A00(View view, float f) {
            }

            {
                ViralityLinkVerifierActivity.this = this;
            }

            @Override // X.AbstractC08940cM
            public void A01(View view, int i) {
                if (i == 5 || i == 4) {
                    ViralityLinkVerifierActivity.this.finish();
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(C02160Ac.A00(this, R.color.black));
        }
        final Uri data = getIntent().getData();
        C0CR c0cr = new C0CR() { // from class: X.4EP
            {
                ViralityLinkVerifierActivity.this = this;
            }

            @Override // X.C0CR
            public C0MU A6e(Class cls) {
                C4A2 c4a2;
                if (cls.equals(C4FN.class)) {
                    Uri uri = data;
                    ViralityLinkVerifierActivity viralityLinkVerifierActivity = ViralityLinkVerifierActivity.this;
                    AnonymousClass012 anonymousClass012 = viralityLinkVerifierActivity.A08;
                    if (!(viralityLinkVerifierActivity instanceof BrazilViralityLinkVerifierActivity)) {
                        c4a2 = new C4A2();
                    } else {
                        c4a2 = new C4A2() { // from class: X.4DE
                            @Override // X.C4A2
                            public int A00(int i) {
                                if (i == 403) {
                                    return R.string.br_virality_payments_not_enabled_description_ineligible_number;
                                }
                                return super.A00(i);
                            }
                        };
                    }
                    return new C4FN(uri, anonymousClass012, c4a2, viralityLinkVerifierActivity.A0C, viralityLinkVerifierActivity.A09, viralityLinkVerifierActivity.A07, viralityLinkVerifierActivity.A0A);
                }
                StringBuilder sb = new StringBuilder("Not aware about view model :");
                sb.append(cls);
                throw new IllegalArgumentException(sb.toString());
            }
        };
        C0VW ADv = ADv();
        String canonicalName = C4FN.class.getCanonicalName();
        if (canonicalName != null) {
            String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = ADv.A00;
            C0MU c0mu = (C0MU) hashMap.get(A0H);
            if (!C4FN.class.isInstance(c0mu)) {
                c0mu = c0cr.A6e(C4FN.class);
                C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                if (c0mu2 != null) {
                    c0mu2.A01();
                }
            }
            ((C4FN) c0mu).A00.A05(this, new InterfaceC05620Pl() { // from class: X.3jh
                {
                    ViralityLinkVerifierActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    ViralityLinkVerifierActivity.this.A1P((C4AW) obj);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
