package com.whatsapp.companiondevice.optin.ui;

import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass029;
import X.C000200d;
import X.C000500h;
import X.C018508q;
import X.C0CR;
import X.C0E7;
import X.C0EE;
import X.C0MU;
import X.C0U1;
import X.C0VJ;
import X.C0VW;
import X.C2J6;
import X.C2NJ;
import X.C2pX;
import X.C40071rX;
import X.C451120l;
import X.C72613aJ;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.companiondevice.optin.ui.OptInActivity;
import com.whatsapp.components.Button;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class OptInActivity extends C2NJ {
    public ProgressDialog A00;
    public View A01;
    public View A02;
    public ScrollView A03;
    public TextView A04;
    public TextView A05;
    public C018508q A06;
    public TextEmojiLabel A07;
    public C451120l A08;
    public C2J6 A09;
    public Button A0A;
    public Button A0B;
    public C0E7 A0C;
    public C000500h A0D;
    public C0EE A0E;
    public C40071rX A0F;
    public InterfaceC002901k A0G;

    public final void A1P(int i) {
        AnonymousClass029.A16(this, this.A06, ((ActivityC02270An) this).A00, ((ActivityC02290Ap) this).A0E, this.A07, getString(i, "learn-more"), new C72613aJ(this.A0F.A02("download-and-installation", "about-multi-device-beta")));
    }

    public /* synthetic */ void lambda$connectUIEventsToViewModel$1355$OptInActivity(View view) {
        C2J6 c2j6 = this.A09;
        if (c2j6.A01 && c2j6.A07.A06.A03(489) != 1) {
            c2j6.A09.A0B(new C2pX(R.string.md_opt_in_portal_not_compatible_header, R.string.md_opt_in_portal_not_compatible));
        } else {
            c2j6.A02(0);
        }
    }

    public /* synthetic */ void lambda$connectUIEventsToViewModel$1356$OptInActivity(View view) {
        this.A09.A02(1);
    }

    @Override // X.C2NJ, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        super.onCreate(bundle);
        setContentView(R.layout.opt_in_activity);
        setTitle(getString(R.string.md_opt_in_screen_title));
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            this.A03 = (ScrollView) C0VJ.A0A(this, R.id.scroll_view);
            this.A02 = C0VJ.A0A(this, R.id.opt_in_sheet_shadow);
            this.A04 = (TextView) C0VJ.A0A(this, R.id.header_title);
            this.A07 = (TextEmojiLabel) C0VJ.A0A(this, R.id.header_description);
            this.A05 = (TextView) C0VJ.A0A(this, R.id.opt_in_clarification);
            this.A01 = C0VJ.A0A(this, R.id.enrolled_header_group);
            this.A0A = (Button) C0VJ.A0A(this, R.id.opt_in_button);
            this.A0B = (Button) C0VJ.A0A(this, R.id.opt_out_button);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                z = extras.getBoolean("arg_has_devices_linked", false);
                z2 = extras.getBoolean("arg_has_portal_device_linked", false);
            } else {
                z = false;
                z2 = false;
            }
            C0CR c0cr = new C0CR(this.A06, this.A0G, this.A0E, this.A0C, this.A0D, this.A08, z, z2) { // from class: X.362
                public final C018508q A00;
                public final C451120l A01;
                public final C0E7 A02;
                public final C000500h A03;
                public final C0EE A04;
                public final InterfaceC002901k A05;
                public final boolean A06;
                public final boolean A07;

                {
                    this.A00 = r1;
                    this.A05 = r2;
                    this.A04 = r3;
                    this.A02 = r4;
                    this.A03 = r5;
                    this.A01 = r6;
                    this.A06 = z;
                    this.A07 = z2;
                }

                @Override // X.C0CR
                public C0MU A6e(Class cls) {
                    return new C2J6(this.A00, this.A05, this.A04, this.A02, this.A03, this.A01, this.A06, this.A07);
                }
            };
            C0VW ADv = ADv();
            String canonicalName = C2J6.class.getCanonicalName();
            if (canonicalName != null) {
                String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                HashMap hashMap = ADv.A00;
                C0MU c0mu = (C0MU) hashMap.get(A0H);
                if (!C2J6.class.isInstance(c0mu)) {
                    c0mu = c0cr.A6e(C2J6.class);
                    C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                    if (c0mu2 != null) {
                        c0mu2.A01();
                    }
                }
                this.A09 = (C2J6) c0mu;
                this.A03.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2pU
                    {
                        OptInActivity.this = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0013, code lost:
                        if ((!r3.A03.canScrollVertically(1)) != false) goto L11;
                     */
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onGlobalLayout() {
                        /*
                            r4 = this;
                            com.whatsapp.companiondevice.optin.ui.OptInActivity r3 = com.whatsapp.companiondevice.optin.ui.OptInActivity.this
                            android.widget.ScrollView r0 = r3.A03
                            boolean r0 = X.C02180Ae.A1X(r0)
                            r2 = 0
                            if (r0 == 0) goto L15
                            android.widget.ScrollView r0 = r3.A03
                            r1 = 1
                            boolean r0 = r0.canScrollVertically(r1)
                            r0 = r0 ^ r1
                            if (r0 == 0) goto L16
                        L15:
                            r1 = 0
                        L16:
                            android.view.View r0 = r3.A02
                            if (r1 != 0) goto L1b
                            r2 = 4
                        L1b:
                            r0.setVisibility(r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserver$OnGlobalLayoutListenerC57502pU.onGlobalLayout():void");
                    }
                });
                this.A03.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.2pT
                    {
                        OptInActivity.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        OptInActivity optInActivity = OptInActivity.this;
                        optInActivity.A02.setVisibility((optInActivity.A03.canScrollVertically(1) ^ true) ^ true ? 0 : 4);
                    }
                });
                this.A0A.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 44));
                this.A0B.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 43));
                this.A09.A03.A05(this, new InterfaceC05620Pl() { // from class: X.360
                    {
                        OptInActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        OptInActivity optInActivity = OptInActivity.this;
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                optInActivity.A01.setVisibility(0);
                                optInActivity.A04.setVisibility(8);
                                optInActivity.A0A.setVisibility(8);
                                optInActivity.A0B.setVisibility(0);
                                optInActivity.A05.setText(R.string.md_opt_out_clarification);
                                optInActivity.A1P(R.string.md_opt_out_screen_description);
                                return;
                            }
                            optInActivity.A01.setVisibility(8);
                            optInActivity.A04.setVisibility(0);
                            optInActivity.A0A.setVisibility(0);
                            optInActivity.A0B.setVisibility(8);
                            optInActivity.A05.setText(R.string.md_opt_in_clarification);
                            optInActivity.A1P(R.string.md_opt_in_screen_description);
                        }
                    }
                });
                this.A09.A08.A05(this, new InterfaceC05620Pl() { // from class: X.35z
                    {
                        OptInActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        final OptInActivity optInActivity = OptInActivity.this;
                        final C57512pW c57512pW = (C57512pW) obj;
                        if (c57512pW != null) {
                            C019208x c019208x = new C019208x(optInActivity);
                            c019208x.A02(c57512pW.A00);
                            String string = optInActivity.getString(R.string.cancel);
                            C019308y c019308y = c019208x.A01;
                            c019308y.A0F = string;
                            c019308y.A03 = null;
                            c019208x.A08(optInActivity.getString(R.string.btn_continue), new DialogInterface.OnClickListener() { // from class: X.2pV
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    optInActivity.A09.A03(c57512pW.A01 == 0);
                                }
                            });
                            c019208x.A01();
                        }
                    }
                });
                this.A09.A09.A05(this, new InterfaceC05620Pl() { // from class: X.35y
                    {
                        OptInActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        OptInActivity optInActivity = OptInActivity.this;
                        C2pX c2pX = (C2pX) obj;
                        if (c2pX != null) {
                            C0U4 c0u4 = new C0U4(c2pX.A00, new Object[0]);
                            int i = c2pX.A01;
                            if (i > 0) {
                                c0u4.A05 = i;
                                c0u4.A0A = new Object[0];
                            }
                            c0u4.A01().A14(optInActivity.A0N(), null);
                        }
                    }
                });
                this.A09.A02.A05(this, new InterfaceC05620Pl() { // from class: X.361
                    {
                        OptInActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        OptInActivity optInActivity = OptInActivity.this;
                        Number number = (Number) obj;
                        if (number == null) {
                            ProgressDialog progressDialog = optInActivity.A00;
                            if (progressDialog != null && progressDialog.isShowing()) {
                                optInActivity.A00.dismiss();
                                return;
                            }
                            return;
                        }
                        ProgressDialog progressDialog2 = optInActivity.A00;
                        if (progressDialog2 == null || !progressDialog2.isShowing()) {
                            if (optInActivity.A00 == null) {
                                ProgressDialog progressDialog3 = new ProgressDialog(optInActivity);
                                optInActivity.A00 = progressDialog3;
                                progressDialog3.setCancelable(false);
                            }
                            optInActivity.A00.setMessage(optInActivity.getString(number.intValue()));
                            optInActivity.A00.show();
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw null;
    }
}
