package com.whatsapp.registration.directmigration;

import X.AbstractC40441sG;
import X.ActivityC02310Ar;
import X.C000400f;
import X.C002701i;
import X.C02160Ac;
import X.C02960Do;
import X.C02L;
import X.C03290Fc;
import X.C03350Fj;
import X.C05E;
import X.C05N;
import X.C05W;
import X.C0C8;
import X.C0CB;
import X.C0CC;
import X.C0E6;
import X.C0EB;
import X.C0EG;
import X.C0ES;
import X.C0We;
import X.C23Y;
import X.C25C;
import X.C26I;
import X.C26S;
import X.C28661Tc;
import X.C2Aa;
import X.C2CS;
import X.C2P3;
import X.C40291rx;
import X.C40431sF;
import X.C41181tV;
import X.C41321tj;
import X.C41511u2;
import X.C42161vG;
import X.C42181vJ;
import X.C42431vj;
import X.C42711wC;
import X.C49552Lb;
import X.C49562Lc;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class RestoreFromConsumerDatabaseActivity extends C2P3 {
    public C02L A00;
    public WaButton A01;
    public C0E6 A02;
    public WaTextView A03;
    public WaTextView A04;
    public WaTextView A05;
    public WaTextView A06;
    public GoogleDriveRestoreAnimationView A07;
    public RoundCornerProgressBar A08;
    public C05W A09;
    public C41321tj A0A;
    public C000400f A0B;
    public C03290Fc A0C;
    public C49552Lb A0D;
    public C41181tV A0E;
    public C42711wC A0F;
    public C23Y A0G;
    public C02960Do A0H;
    public C0C8 A0I;
    public C0CC A0J;
    public C42431vj A0K;
    public C05N A0L;
    public C05E A0M;
    public C0EB A0N;
    public C2CS A0O;
    public C49562Lc A0P;
    public C0ES A0Q;
    public C40291rx A0R;
    public C41511u2 A0S;
    public C0EG A0T;
    public C2Aa A0U;
    public C42181vJ A0V;
    public C26I A0W;
    public C42161vG A0X;
    public C25C A0Y;
    public C03350Fj A0Z;
    public C0CB A0a;
    public AbstractC40441sG A0b;
    public C26S A0c;
    public C40431sF A0d;
    public InterfaceC002901k A0e;

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
    }

    public final void A1P() {
        this.A07.A02(true);
        this.A06.setText(R.string.migration_title_error_title);
        this.A01.setVisibility(0);
        this.A03.setVisibility(8);
    }

    public final void A1Q() {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A07;
        if (googleDriveRestoreAnimationView.A01 != 1) {
            googleDriveRestoreAnimationView.A00();
        }
        this.A03.setVisibility(0);
        this.A01.setVisibility(8);
        this.A06.setText(R.string.migration_title);
        this.A05.setText(R.string.migration_restore_from_source_app_do_not_close);
        this.A03.setText(R.string.migration_transferring_chats_and_media);
    }

    public /* synthetic */ void lambda$null$2199$RestoreFromConsumerDatabaseActivity(View view) {
        setResult(2);
        finish();
    }

    public void lambda$onCreate$2198$RestoreFromConsumerDatabaseActivity(View view) {
        this.A0W.A02();
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A07;
        googleDriveRestoreAnimationView.A0C = false;
        googleDriveRestoreAnimationView.A0A = null;
        googleDriveRestoreAnimationView.A00();
    }

    @Override // X.C2P3, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.restore_from_consumer_layout);
        this.A06 = (WaTextView) findViewById(R.id.restore_from_consumer_title);
        this.A05 = (WaTextView) findViewById(R.id.restore_from_consumer_sub_title);
        this.A03 = (WaTextView) findViewById(R.id.restore_from_consumer_bottom_info);
        this.A01 = (WaButton) findViewById(R.id.restore_from_consumer_action_btn);
        this.A04 = (WaTextView) findViewById(R.id.restore_from_consumer_progress_description);
        this.A08 = (RoundCornerProgressBar) findViewById(R.id.restore_from_consumer_progress_bar);
        this.A07 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_from_consumer_animation_view);
        findViewById(R.id.restore_from_consumer_background_image).setBackgroundDrawable(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.graphic_migration)));
        this.A01.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 49));
        A1Q();
        C26I c26i = (C26I) C002701i.A0J(this, new C28661Tc() { // from class: X.3we
            {
                RestoreFromConsumerDatabaseActivity.this = this;
            }

            @Override // X.C28661Tc, X.C0CR
            public C0MU A6e(Class cls) {
                if (cls.isAssignableFrom(C26I.class)) {
                    RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity = RestoreFromConsumerDatabaseActivity.this;
                    return new C26I(((ActivityC02290Ap) restoreFromConsumerDatabaseActivity).A0A, restoreFromConsumerDatabaseActivity.A00, restoreFromConsumerDatabaseActivity.A0e, restoreFromConsumerDatabaseActivity.A0E, restoreFromConsumerDatabaseActivity.A0T, restoreFromConsumerDatabaseActivity.A0N, restoreFromConsumerDatabaseActivity.A02, restoreFromConsumerDatabaseActivity.A09, restoreFromConsumerDatabaseActivity.A0G, restoreFromConsumerDatabaseActivity.A0R, restoreFromConsumerDatabaseActivity.A0C, restoreFromConsumerDatabaseActivity.A0O, restoreFromConsumerDatabaseActivity.A0Q, restoreFromConsumerDatabaseActivity.A0d, restoreFromConsumerDatabaseActivity.A0b, restoreFromConsumerDatabaseActivity.A0a, restoreFromConsumerDatabaseActivity.A0B, restoreFromConsumerDatabaseActivity.A0A, restoreFromConsumerDatabaseActivity.A0J, restoreFromConsumerDatabaseActivity.A0S, restoreFromConsumerDatabaseActivity.A0M, restoreFromConsumerDatabaseActivity.A0U, ((ActivityC02290Ap) restoreFromConsumerDatabaseActivity).A0F, restoreFromConsumerDatabaseActivity.A0H, restoreFromConsumerDatabaseActivity.A0D, restoreFromConsumerDatabaseActivity.A0V, restoreFromConsumerDatabaseActivity.A0c, restoreFromConsumerDatabaseActivity.A0Y, restoreFromConsumerDatabaseActivity.A0F, restoreFromConsumerDatabaseActivity.A0I, restoreFromConsumerDatabaseActivity.A0K, restoreFromConsumerDatabaseActivity.A0Z, restoreFromConsumerDatabaseActivity.A0X, restoreFromConsumerDatabaseActivity.A0L, restoreFromConsumerDatabaseActivity.A0P);
                }
                throw new IllegalArgumentException("Invalid viewModel");
            }
        }).A00(C26I.class);
        this.A0W = c26i;
        c26i.A02.A05(this, new InterfaceC05620Pl() { // from class: X.3mR
            {
                RestoreFromConsumerDatabaseActivity.this = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity = RestoreFromConsumerDatabaseActivity.this;
                Number number = (Number) obj;
                StringBuilder sb = new StringBuilder("RestoreFromConsumerDatabaseActivity/view-model-state= ");
                sb.append(number);
                Log.i(sb.toString());
                switch (number.intValue()) {
                    case 0:
                        Log.e("RestoreFromConsumerDatabaseActivity/missing-params bounce to regphone");
                        restoreFromConsumerDatabaseActivity.A0U.A0B(1);
                        restoreFromConsumerDatabaseActivity.startActivity(new Intent(restoreFromConsumerDatabaseActivity, RegisterPhone.class));
                        restoreFromConsumerDatabaseActivity.finish();
                        break;
                    case 1:
                        break;
                    case 2:
                    case 6:
                        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = restoreFromConsumerDatabaseActivity.A07;
                        googleDriveRestoreAnimationView.A01 = 4;
                        C55762m9 c55762m9 = googleDriveRestoreAnimationView.A0A;
                        if (c55762m9 != null) {
                            c55762m9.cancel();
                        }
                        restoreFromConsumerDatabaseActivity.setResult(1);
                        restoreFromConsumerDatabaseActivity.finish();
                        return;
                    case 3:
                        restoreFromConsumerDatabaseActivity.A05.setText(R.string.migration_failed_to_migrate_generic_reason);
                        restoreFromConsumerDatabaseActivity.A1P();
                        return;
                    case 4:
                    case 7:
                        restoreFromConsumerDatabaseActivity.A05.setText(R.string.migration_restore_from_backup_text);
                        restoreFromConsumerDatabaseActivity.A1P();
                        restoreFromConsumerDatabaseActivity.A01.setText(R.string.migration_restore_from_backup_button);
                        restoreFromConsumerDatabaseActivity.A01.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(restoreFromConsumerDatabaseActivity, 0));
                        return;
                    case 5:
                        restoreFromConsumerDatabaseActivity.A05.setText(R.string.migration_not_enough_space_on_phone_dialog_title);
                        restoreFromConsumerDatabaseActivity.A1P();
                        return;
                    default:
                        return;
                }
                restoreFromConsumerDatabaseActivity.A1Q();
                restoreFromConsumerDatabaseActivity.A03.setText(R.string.migration_transferring_chats_and_media);
            }
        });
        this.A0W.A04.A05(this, new InterfaceC05620Pl() { // from class: X.3mS
            {
                RestoreFromConsumerDatabaseActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity = RestoreFromConsumerDatabaseActivity.this;
                int[] iArr = (int[]) obj;
                int i = iArr[0];
                int i2 = iArr[1];
                if (i2 != 0) {
                    restoreFromConsumerDatabaseActivity.A04.setVisibility(0);
                    restoreFromConsumerDatabaseActivity.A08.setVisibility(0);
                    restoreFromConsumerDatabaseActivity.A08.setProgress((i * 100) / i2);
                    restoreFromConsumerDatabaseActivity.A04.setText(restoreFromConsumerDatabaseActivity.getString(R.string.migration_direct_transfer_progress_message, Integer.valueOf(i), Integer.valueOf(i2)));
                }
            }
        });
    }
}
