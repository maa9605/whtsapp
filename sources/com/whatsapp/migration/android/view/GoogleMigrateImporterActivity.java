package com.whatsapp.migration.android.view;

import X.C000200d;
import X.C001200o;
import X.C02F;
import X.C0ER;
import X.C0MU;
import X.C0VJ;
import X.C0VW;
import X.C0Zo;
import X.C2OQ;
import X.C42291vV;
import X.C42311vX;
import X.C76263gJ;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaButton;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class GoogleMigrateImporterActivity extends C2OQ {
    public static final int A0D = 1;
    public static final int A0E = 11;
    public static final String A0F = "com.whatsapp.migration.ACTION_OPENED_VIA_NOTIFICATION";
    public WaButton A00;
    public WaButton A01;
    public WaTextView A02;
    public WaTextView A03;
    public WaTextView A04;
    public RoundCornerProgressBar A05;
    public C001200o A06;
    public C02F A07;
    public C42311vX A08;
    public C42291vV A09;
    public C76263gJ A0A;
    public C0ER A0B;
    public InterfaceC002901k A0C;

    public static /* synthetic */ void A00() {
    }

    public static void A01(Context context) {
        new Intent(context, GoogleMigrateImporterActivity.class).addFlags(335544320);
    }

    public static void A02(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        googleMigrateImporterActivity.setResult(i);
        if (googleMigrateImporterActivity.getIntent() != null && A0F.equals(googleMigrateImporterActivity.getIntent().getAction())) {
            Intent intent = new Intent(googleMigrateImporterActivity, RegisterName.class);
            if (i == 2) {
                intent.putExtra("google_migrate_import_canceled", true);
            }
            googleMigrateImporterActivity.startActivity(intent);
        }
        googleMigrateImporterActivity.finish();
    }

    public static void A03(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        googleMigrateImporterActivity.A05.setProgress(i);
    }

    public static void A0E(GoogleMigrateImporterActivity googleMigrateImporterActivity, Integer num) {
        String string;
        String string2;
        String string3;
        if (num == null) {
            Log.e("GoogleMigrateImporterActivity/currentScreen is null");
            return;
        }
        String string4 = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_title_importing);
        googleMigrateImporterActivity.A05.setVisibility(8);
        int intValue = num.intValue();
        String str = null;
        if (intValue == 0) {
            string = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_sub_title_need_permission);
            string2 = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_warning_need_permission);
            string3 = googleMigrateImporterActivity.getString(R.string.start);
        } else if (intValue == 1) {
            string = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_sub_title_need_permission);
            string2 = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_warning_permission_denied);
            string3 = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_warning_permission_denied_settings);
            str = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_do_not_import_permission_denied);
        } else if (intValue == 2) {
            string = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_sub_title_in_progress);
            String string5 = googleMigrateImporterActivity.getString(R.string.cancel);
            googleMigrateImporterActivity.A05.setVisibility(0);
            string2 = null;
            string3 = null;
            str = string5;
        } else if (intValue == 3) {
            string4 = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_title_import_complete);
            string3 = googleMigrateImporterActivity.getString(R.string.next);
            string = null;
            string2 = null;
        } else if (intValue != 4) {
            string = null;
            string2 = null;
            string3 = null;
        } else {
            string2 = googleMigrateImporterActivity.getString(R.string.google_migrate_importer_error_generic);
            string3 = googleMigrateImporterActivity.getString(R.string.retry);
            string = null;
        }
        googleMigrateImporterActivity.A0O(string4, string, string2, string3, str);
    }

    public static void A0G(GoogleMigrateImporterActivity googleMigrateImporterActivity, String str) {
        Toast.makeText(googleMigrateImporterActivity, str, 0).show();
    }

    public static void A0M(GoogleMigrateImporterActivity googleMigrateImporterActivity, boolean z) {
        if (z) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_setting_restore_chats_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_setting_restore_chats;
            }
            RequestPermissionActivity.A06(googleMigrateImporterActivity, R.string.permission_storage_restore_chats, i2, false, 11);
        }
    }

    private void A0O(String str, String str2, String str3, String str4, String str5) {
        this.A03.setVisibility(str != null ? 0 : 8);
        this.A02.setVisibility(str2 != null ? 0 : 8);
        this.A04.setVisibility(str3 != null ? 0 : 8);
        this.A00.setVisibility(str4 != null ? 0 : 8);
        this.A01.setVisibility(str5 == null ? 8 : 0);
        this.A03.setText(str);
        this.A02.setText(str2);
        this.A04.setText(str3);
        this.A00.setText(str4);
        this.A01.setText(str5);
    }

    public C76263gJ A1P() {
        C0Zo c0Zo = new C0Zo(this, this.A06, this.A0C, this.A0B, this.A07, this.A09, this.A08) { // from class: X.3yO
            public final C001200o A00;
            public final C02F A01;
            public final C42311vX A02;
            public final C42291vV A03;
            public final C0ER A04;
            public final InterfaceC002901k A05;

            {
                this.A00 = r3;
                this.A05 = r4;
                this.A04 = r5;
                this.A01 = r6;
                this.A03 = r7;
                this.A02 = r8;
            }

            @Override // X.C0Zo
            public C0MU A02(String str, Class cls, C07750Zs c07750Zs) {
                C000700j.A09(cls.isAssignableFrom(C76263gJ.class), "Invalid viewModel");
                return new C76263gJ(c07750Zs, this.A00, this.A05, this.A04, this.A01, this.A03);
            }
        };
        C0VW ADv = ADv();
        String canonicalName = C76263gJ.class.getCanonicalName();
        if (canonicalName != null) {
            String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = ADv.A00;
            C0MU c0mu = (C0MU) hashMap.get(A0H);
            if (C76263gJ.class.isInstance(c0mu)) {
                c0Zo.A00(c0mu);
            } else {
                c0mu = c0Zo.A01(A0H, C76263gJ.class);
                C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                if (c0mu2 != null) {
                    c0mu2.A01();
                }
            }
            return (C76263gJ) c0mu;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 11 && i2 == -1) {
            this.A0A.A02(2);
        } else {
            this.A0A.A02(1);
        }
    }

    @Override // X.C2OQ, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.google_migrate_importer_view);
        this.A03 = (WaTextView) C0VJ.A0A(this, R.id.google_migrate_title);
        this.A02 = (WaTextView) C0VJ.A0A(this, R.id.google_migrate_sub_title);
        this.A04 = (WaTextView) C0VJ.A0A(this, R.id.google_migrate_warning);
        this.A00 = (WaButton) C0VJ.A0A(this, R.id.google_migrate_main_action);
        this.A01 = (WaButton) C0VJ.A0A(this, R.id.google_migrate_sub_action);
        this.A05 = (RoundCornerProgressBar) C0VJ.A0A(this, R.id.google_migrate_progress_bar);
        C76263gJ A1P = A1P();
        this.A0A = A1P;
        A1P.A00.A05(this, new InterfaceC05620Pl() { // from class: X.3gG
            {
                GoogleMigrateImporterActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                GoogleMigrateImporterActivity.A0E(GoogleMigrateImporterActivity.this, (Integer) obj);
            }
        });
        this.A0A.A03.A05(this, new InterfaceC05620Pl() { // from class: X.3gF
            {
                GoogleMigrateImporterActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                GoogleMigrateImporterActivity.A03(GoogleMigrateImporterActivity.this, ((Number) obj).intValue());
            }
        });
        this.A0A.A01.A05(this, new InterfaceC05620Pl() { // from class: X.3gE
            {
                GoogleMigrateImporterActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                GoogleMigrateImporterActivity.A02(GoogleMigrateImporterActivity.this, ((Number) obj).intValue());
            }
        });
        this.A0A.A02.A05(this, new InterfaceC05620Pl() { // from class: X.3gH
            {
                GoogleMigrateImporterActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                GoogleMigrateImporterActivity.A0G(GoogleMigrateImporterActivity.this, (String) obj);
            }
        });
        this.A0A.A04.A05(this, new InterfaceC05620Pl() { // from class: X.3gD
            {
                GoogleMigrateImporterActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                GoogleMigrateImporterActivity.A0M(GoogleMigrateImporterActivity.this, ((Boolean) obj).booleanValue());
            }
        });
        this.A00.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 3));
        this.A01.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 4));
    }
}
