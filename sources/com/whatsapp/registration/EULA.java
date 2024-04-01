package com.whatsapp.registration;

import X.AbstractC30351aN;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass088;
import X.C000200d;
import X.C000400f;
import X.C002301c;
import X.C002701i;
import X.C005002g;
import X.C019208x;
import X.C019308y;
import X.C02A;
import X.C02E;
import X.C02F;
import X.C05G;
import X.C06870Vj;
import X.C07K;
import X.C08K;
import X.C0AC;
import X.C0E7;
import X.C0HS;
import X.C0KF;
import X.C0L8;
import X.C0VJ;
import X.C28A;
import X.C2Aa;
import X.C2CO;
import X.C2CQ;
import X.C2DQ;
import X.C2DS;
import X.C2DV;
import X.C2LX;
import X.C2M2;
import X.C2MG;
import X.C2Oy;
import X.C30361aO;
import X.C30371aP;
import X.C31431cG;
import X.C3VI;
import X.C40071rX;
import X.C40291rx;
import X.C40301ry;
import X.C41451tw;
import X.C41951um;
import X.C42161vG;
import X.C42181vJ;
import X.C47262An;
import X.C49622Lq;
import X.InterfaceC002901k;
import android.app.Activity;
import android.app.Dialog;
import android.app.backup.BackupManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.gms.common.api.Status;
import com.google.android.search.verification.client.R;
import com.whatsapp.InsufficientStorageSpaceActivity;
import com.whatsapp.Main;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class EULA extends C2LX {
    public int A00 = 0;
    public View A01 = null;
    public ViewTreeObserver.OnGlobalLayoutListener A02 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3VB
        {
            EULA.this = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            EULA eula = EULA.this;
            View view = eula.A01;
            if (view == null) {
                return;
            }
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (eula.A01.getHeight() < eula.getResources().getDimensionPixelSize(R.dimen.registration_eula_logo_min_height)) {
                eula.A01.setVisibility(8);
            }
        }
    };
    public C005002g A03;
    public C06870Vj A04;
    public C0L8 A05;
    public C000400f A06;
    public C0E7 A07;
    public C02E A08;
    public C02F A09;
    public C002301c A0A;
    public C49622Lq A0B;
    public C2DV A0C;
    public C41451tw A0D;
    public C40291rx A0E;
    public C40301ry A0F;
    public C2Oy A0G;
    public C3VI A0H;
    public C2Aa A0I;
    public C05G A0J;
    public C2CQ A0K;
    public C42181vJ A0L;
    public C42161vG A0M;
    public C2CO A0N;
    public C2M2 A0O;
    public C2MG A0P;
    public C40071rX A0Q;
    public C41951um A0R;
    public C2DQ A0S;
    public C47262An A0T;
    public InterfaceC002901k A0U;

    public static Intent A00(Activity activity) {
        return new Intent(activity, EULA.class).setFlags(268468224);
    }

    public void A1P() {
        if (C0KF.A00(this).exists()) {
            C000200d.A0i(((ActivityC02290Ap) this).A0F, "backup_token_source", "google_backup");
        } else if (Build.VERSION.SDK_INT < 26 || !AnonymousClass029.A1L(this)) {
        } else {
            C30361aO c30361aO = new C30361aO((Activity) this);
            C07K.A1P("com.whatsapp");
            final C31431cG c31431cG = new C31431cG();
            C0AC A01 = c30361aO.A01(new AbstractC30351aN() { // from class: X.1qC
                @Override // X.AbstractC30351aN
                public final void A01(InterfaceC234016m interfaceC234016m) {
                    interfaceC234016m.AWt(new BinderC39741qe(this) { // from class: X.0us
                        public AbstractC30351aN A00;

                        {
                            C39481qC.this = this;
                            this.A00 = this;
                        }

                        @Override // X.InterfaceC233916l
                        public final void AKD(Status status) {
                            C0NR c0nr = this.A00.A00;
                            c0nr.A00.A08(new C30371aP(status));
                        }

                        @Override // X.BinderC39741qe, X.InterfaceC233916l
                        public final void AX0(byte[] bArr) {
                            ((AbstractC30351aN) C39481qC.this).A00.A00.A09(bArr);
                        }
                    }, c31431cG);
                }
            });
            try {
                AnonymousClass088.A0n(A01, 10L, TimeUnit.SECONDS);
                if (!A01.A05()) {
                    return;
                }
                Log.i("eula/create/success retrieving data from account transfer");
                byte[] bArr = (byte[]) A01.A04();
                if (bArr != null && bArr.length != 0) {
                    synchronized (C0KF.A00) {
                        try {
                            C02A.A07(bArr, C0KF.A00(this));
                        } catch (IOException e) {
                            Log.e("BackupTokenUtils/setEncodedBackupToken/unable to write to file", e);
                        }
                    }
                    new BackupManager(this).dataChanged();
                    C000200d.A0i(((ActivityC02290Ap) this).A0F, "backup_token_source", "device_to_device_transfer");
                    return;
                }
                Log.i("eula/create/encoded backup token is not present");
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                if ((e2 instanceof ExecutionException) && (e2.getCause() instanceof C30371aP) && ((C08K) e2.getCause()).mStatus.A01 == 20501) {
                    Log.i("eula/create/no data found from account transfer");
                } else {
                    Log.e("eula/create/exception during retrieving data from account transfer", e2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0025, code lost:
        if (r1 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void lambda$onCreate$2216$EULA(android.view.View r10) {
        /*
            r9 = this;
            X.02E r0 = r9.A08
            android.telephony.TelephonyManager r1 = r0.A0G()
            r3 = 2
            if (r1 != 0) goto L12
            java.lang.String r0 = "eula/cellular-network null"
            com.whatsapp.util.Log.e(r0)
            X.C002701i.A19(r9, r3)
            return
        L12:
            X.02F r0 = r9.A09
            int r2 = X.AnonymousClass024.A00(r0, r1)
            X.0E7 r0 = r9.A07
            android.net.NetworkInfo r0 = r0.A04()
            if (r0 == 0) goto L27
            boolean r1 = r0.isConnected()
            r0 = 1
            if (r1 != 0) goto L28
        L27:
            r0 = 0
        L28:
            if (r2 != 0) goto L35
            if (r0 != 0) goto L35
            java.lang.String r0 = "eula/cellular-network unknown"
            com.whatsapp.util.Log.e(r0)
            X.C002701i.A19(r9, r3)
            return
        L35:
            X.05G r0 = r9.A0J
            boolean r0 = r0.A02()
            r8 = 0
            if (r0 != 0) goto L74
            X.2DV r5 = r9.A0C
            if (r5 == 0) goto Lf0
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r5.A00
            long r3 = r6 - r0
            long r1 = X.C2DV.A09
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L74
            r5.A00 = r6
            java.util.List r1 = r5.A08
            java.util.List r0 = r5.A07
            r1.addAll(r0)
            java.util.List r0 = r5.A08
            java.util.List r1 = r5.A06
            r0.addAll(r1)
            java.util.List r0 = r5.A07
            r0.clear()
            r1.clear()
            X.01k r2 = r5.A05
            r1 = 12
            java.lang.RunnableEBaseShape3S0100000_I0_3 r0 = new java.lang.RunnableEBaseShape3S0100000_I0_3
            r0.<init>(r5, r1)
            r2.AS1(r0)
        L74:
            java.lang.String r0 = "register/eula/accept"
            com.whatsapp.util.Log.i(r0)
            X.0Ea r0 = r9.A0E
            r0.A04()
            X.1um r0 = r9.A0R
            r0.A04()
            X.00h r3 = r9.A0F
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "eula_accepted_time"
            X.C000200d.A0h(r3, r0, r1)
            X.1vG r0 = r9.A0M
            r0.A01()
            X.1vJ r0 = r9.A0L
            if (r0 == 0) goto Lef
            X.2Oy r3 = r9.A0G
            X.01k r2 = r3.A02
            r1 = 29
            java.lang.RunnableEBaseShape5S0100000_I0_5 r0 = new java.lang.RunnableEBaseShape5S0100000_I0_5
            r0.<init>(r3, r1)
            r2.AS1(r0)
            X.2Aa r0 = r9.A0I
            r4 = 1
            r0.A0B(r4)
            java.lang.Class<com.whatsapp.registration.RegisterPhone> r0 = com.whatsapp.registration.RegisterPhone.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r9, r0)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.resetstate"
            r3.putExtra(r0, r4)
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone.phone_number"
            boolean r0 = r2.hasExtra(r1)
            if (r0 == 0) goto Lca
            java.lang.String r0 = r2.getStringExtra(r1)
            r3.putExtra(r1, r0)
        Lca:
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone.country_code"
            boolean r0 = r2.hasExtra(r1)
            if (r0 == 0) goto Ld9
            java.lang.String r0 = r2.getStringExtra(r1)
            r3.putExtra(r1, r0)
        Ld9:
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone.clear_phone_number"
            boolean r0 = r2.hasExtra(r1)
            if (r0 == 0) goto Le8
            boolean r0 = r2.getBooleanExtra(r1, r4)
            r3.putExtra(r1, r0)
        Le8:
            r9.startActivity(r3)
            r9.finish()
            return
        Lef:
            throw r8
        Lf0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.EULA.lambda$onCreate$2216$EULA(android.view.View):void");
    }

    @Override // X.C2LX, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        this.A0M.A02();
        boolean z = false;
        ((ActivityC02270An) this).A0I = false;
        this.A0H = new C3VI(this.A0U, this.A0Q, this.A0A, this.A0B, this.A0D);
        setContentView(R.layout.eula);
        View findViewById = findViewById(R.id.eula_layout);
        ((ActivityC02290Ap) this).A0F.A0M();
        if (this.A06.A03() < 10000000) {
            startActivity(new Intent(this, InsufficientStorageSpaceActivity.class).setFlags(268435456).putExtra("allowSkipKey", false).putExtra("spaceNeededInBytes", 10000000L));
        }
        if (this.A0J.A01() != 0) {
            Log.e("eula/create/wrong-state bounce to main");
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        this.A0U.ARy(new C0HS() { // from class: X.3m6
            {
                EULA.this = this;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                try {
                    return EULA.this.A0T.A02(10, TimeUnit.SECONDS);
                } catch (Exception e) {
                    Log.w("exception while waiting on task killers thread to finish during onCreate ", e);
                    return null;
                }
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                C2DQ c2dq = (C2DQ) obj;
                EULA eula = EULA.this;
                eula.A0S = c2dq;
                if (c2dq != null && c2dq.A00 != null) {
                    C002701i.A19(eula, 6);
                } else if (!C02A.A08()) {
                } else {
                    C002701i.A19(eula, 8);
                }
            }
        }, new Void[0]);
        AnonymousClass012 anonymousClass012 = ((ActivityC02270An) this).A08;
        TelephonyManager A0G = this.A08.A0G();
        String str = C28A.A00(A0G == null ? null : A0G.getSimOperator()).A00;
        if (!"286".equals(str) && !"454".equals(str) && anonymousClass012.A05() < 1621036800000L) {
            z = true;
        }
        C000200d.A0j(((ActivityC02290Ap) this).A0F, "green_alert_dual_tos_shown", z);
        String string2 = getString(R.string.eula_agree);
        if (z) {
            string = getString(R.string.green_alert_dual_tos_reg_string, string2, getString(R.string.green_alert_date_one));
        } else {
            string = getString(R.string.eula_terms_of_service, string2);
        }
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C0VJ.A0A(this, R.id.eula_view);
        HashMap hashMap = new HashMap();
        hashMap.put("privacy-policy", this.A04.A00("https://www.whatsapp.com/legal/privacy-policy"));
        hashMap.put("terms-and-privacy-policy", this.A04.A00(!z ? "https://www.whatsapp.com/legal/terms-of-service" : "https://www.whatsapp.com/legal/"));
        if (z) {
            hashMap.put("new-privacy-policy", this.A04.A00("https://www.whatsapp.com/legal/updates/privacy-policy"));
            hashMap.put("new-terms-and-privacy-policy", this.A04.A00("https://www.whatsapp.com/legal/updates/terms-of-service"));
        }
        AnonymousClass029.A16(this, ((ActivityC02290Ap) this).A0A, ((ActivityC02270An) this).A00, this.A08, textEmojiLabel, string, hashMap);
        textEmojiLabel.setHighlightColor(0);
        View findViewById2 = findViewById(R.id.eula_accept);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 39));
            if (getIntent().getBooleanExtra("show_registration_first_dlg", false)) {
                C002701i.A19(this, 1);
            }
            this.A0I.A0B(0);
            if (this.A03.A04()) {
                Log.w("eula/clock-wrong");
                AnonymousClass088.A23(this, this.A0E, this.A0F);
            }
            C000200d.A0j(((ActivityC02290Ap) this).A0F, "input_enter_send", false);
            this.A01 = findViewById(R.id.eula_logo);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
            }
            this.A05.A03();
            if (((ActivityC02290Ap) this).A0F.A00.getBoolean("is_eula_loaded_once", false)) {
                return;
            }
            this.A0U.AS1(new RunnableEBaseShape5S0100000_I0_5(this, 28));
            C000200d.A0j(((ActivityC02290Ap) this).A0F, "is_eula_loaded_once", true);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        String str;
        Set set;
        if (i == 1) {
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.register_first);
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3UC
                {
                    EULA.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(EULA.this, 1);
                }
            });
            return c019208x.A00();
        } else if (i != 2) {
            switch (i) {
                case 5:
                    C2DQ c2dq = this.A0S;
                    if (c2dq != null && (set = c2dq.A00) != null && !set.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        for (C2DS c2ds : this.A0S.A00) {
                            sb.append('\t');
                            sb.append(c2ds.A00);
                            sb.append('\n');
                        }
                        sb.setLength(sb.length() - 1);
                        str = sb.toString();
                    } else {
                        str = "";
                    }
                    C019208x c019208x2 = new C019208x(this);
                    String string = getString(R.string.task_killer_info_modern, str);
                    C019308y c019308y = c019208x2.A01;
                    c019308y.A0E = string;
                    c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3UH
                        {
                            EULA.this = this;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            EULA eula = EULA.this;
                            C002701i.A18(eula, 5);
                            C002701i.A19(eula, 6);
                        }
                    };
                    return c019208x2.A00();
                case 6:
                    this.A00 = 1;
                    C019208x c019208x3 = new C019208x(this);
                    c019208x3.A03(R.string.alert);
                    c019208x3.A02(R.string.task_killer_detected);
                    c019208x3.A01.A0J = false;
                    c019208x3.A06(R.string.dialog_button_more_info, new DialogInterface.OnClickListener() { // from class: X.3UK
                        {
                            EULA.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C002701i.A19(EULA.this, 5);
                        }
                    });
                    c019208x3.A04(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3UF
                        {
                            EULA.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            EULA eula = EULA.this;
                            C002701i.A18(eula, 6);
                            if (C02A.A08()) {
                                C002701i.A19(eula, 8);
                            } else {
                                eula.A00 = 0;
                            }
                        }
                    });
                    return c019208x3.A00();
                case 7:
                    C019208x c019208x4 = new C019208x(this);
                    String string2 = getString(R.string.custom_rom_info_app_name, getString(R.string.localized_app_name));
                    C019308y c019308y2 = c019208x4.A01;
                    c019308y2.A0E = string2;
                    c019308y2.A02 = new DialogInterface.OnCancelListener() { // from class: X.3UJ
                        {
                            EULA.this = this;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            EULA eula = EULA.this;
                            C002701i.A18(eula, 7);
                            C002701i.A19(eula, 8);
                        }
                    };
                    return c019208x4.A00();
                case 8:
                    this.A00 = 2;
                    C019208x c019208x5 = new C019208x(this);
                    c019208x5.A03(R.string.alert);
                    c019208x5.A02(R.string.custom_rom_detected);
                    c019208x5.A01.A0J = false;
                    c019208x5.A06(R.string.dialog_button_more_info, new DialogInterface.OnClickListener() { // from class: X.3UI
                        {
                            EULA.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C002701i.A19(EULA.this, 7);
                        }
                    });
                    c019208x5.A04(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3UG
                        {
                            EULA.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            EULA eula = EULA.this;
                            C002701i.A18(eula, 8);
                            eula.A00 = 0;
                        }
                    });
                    return c019208x5.A00();
                case 9:
                    C019208x c019208x6 = new C019208x(this);
                    c019208x6.A03(R.string.alert);
                    c019208x6.A02(R.string.clock_wrong);
                    c019208x6.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3UE
                        {
                            EULA.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C002701i.A18(EULA.this, 9);
                        }
                    });
                    return c019208x6.A00();
                default:
                    return super.onCreateDialog(i);
            }
        } else {
            C019208x c019208x7 = new C019208x(this);
            c019208x7.A03(R.string.alert);
            c019208x7.A02(R.string.registration_cellular_network_required);
            c019208x7.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3UD
                {
                    EULA.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(EULA.this, 2);
                }
            });
            return c019208x7.A00();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.registration_help);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A0H.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0K.A02("eula");
            this.A0H.A01(this, this.A0K, "eula");
            return true;
        } else if (itemId != 1) {
            return false;
        } else {
            C02A.A06(this);
            return true;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        int i = this.A00;
        if (i == 1) {
            C002701i.A19(this, 6);
        } else if (i == 2) {
            C002701i.A19(this, 8);
        }
    }
}
