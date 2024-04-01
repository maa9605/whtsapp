package com.whatsapp;

import X.AbstractActivityC03830Hg;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.C000400f;
import X.C018308n;
import X.C02180Ae;
import X.C0VJ;
import X.C37131lv;
import X.C40731sm;
import X.C72153Yw;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.InsufficientStorageSpaceActivity;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public class InsufficientStorageSpaceActivity extends AbstractActivityC03830Hg {
    public long A00;
    public ScrollView A01;
    public C000400f A02;
    public AnonymousClass011 A03;
    public C72153Yw A04;

    public /* synthetic */ void A1P(String str) {
        ((ActivityC02270An) this).A00.A06(this, StorageUsageActivity.A00(this, str, 6));
    }

    public /* synthetic */ void lambda$onCreate$2851$InsufficientStorageSpaceActivity(View view) {
        startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
    }

    public void lambda$onCreate$2852$InsufficientStorageSpaceActivity(View view) {
        ((ActivityC02290Ap) this).A0F.A0C("insufficient_storage_prompt_timestamp");
        C37131lv c37131lv = new C37131lv();
        Long valueOf = Long.valueOf(this.A00);
        c37131lv.A02 = valueOf;
        c37131lv.A00 = Boolean.TRUE;
        c37131lv.A01 = 2;
        Log.i(String.format(Locale.ENGLISH, "insufficient-storage-activity/skipped space-required: %,d", valueOf));
        this.A03.A09(c37131lv, 1);
        AnonymousClass011.A01(c37131lv, "");
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C018308n.A03(this);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A04.A00();
    }

    @Override // X.AbstractActivityC03830Hg, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        String string;
        View.OnClickListener onClickListener;
        super.onCreate(bundle);
        final String A0N = C40731sm.A0N(6, this.A03);
        setContentView(R.layout.activity_insufficient_storage_space);
        this.A01 = (ScrollView) findViewById(R.id.insufficient_storage_scroll_view);
        TextView textView = (TextView) C0VJ.A0A(this, R.id.btn_storage_settings);
        TextView textView2 = (TextView) C0VJ.A0A(this, R.id.insufficient_storage_title_textview);
        TextView textView3 = (TextView) C0VJ.A0A(this, R.id.insufficient_storage_description_textview);
        long longExtra = getIntent().getLongExtra("spaceNeededInBytes", -1L);
        this.A00 = longExtra;
        long A03 = (longExtra - this.A02.A03()) + SearchActionVerificationClientService.MS_TO_NS;
        if (getIntent() != null && getIntent().getBooleanExtra("allowSkipKey", false)) {
            z = true;
            i = R.string.insufficient_internal_storage_settings_button_almost_full_enhanced;
            i2 = R.string.insufficient_internal_storage_space_title_almost_full_enhanced;
            string = getResources().getString(R.string.insufficient_internal_storage_space_description_almost_full_enhanced);
        } else {
            z = false;
            i = R.string.insufficient_internal_storage_settings_button;
            i2 = R.string.insufficient_internal_storage_space_title_enhanced;
            string = getResources().getString(R.string.insufficient_internal_storage_space_description_enhanced, C02180Ae.A0k(((ActivityC02310Ar) this).A01, A03));
        }
        textView2.setText(i2);
        textView3.setText(string);
        textView.setText(i);
        if (z) {
            onClickListener = new View.OnClickListener() { // from class: X.1HS
                {
                    InsufficientStorageSpaceActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InsufficientStorageSpaceActivity.this.A1P(A0N);
                }
            };
        } else {
            onClickListener = new View.OnClickListener() { // from class: X.1HT
                {
                    InsufficientStorageSpaceActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InsufficientStorageSpaceActivity.this.lambda$onCreate$2851$InsufficientStorageSpaceActivity(view);
                }
            };
        }
        textView.setOnClickListener(onClickListener);
        if (z) {
            View findViewById = findViewById(R.id.btn_skip_storage_settings);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: X.1HR
                {
                    InsufficientStorageSpaceActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InsufficientStorageSpaceActivity.this.lambda$onCreate$2852$InsufficientStorageSpaceActivity(view);
                }
            });
        }
        C72153Yw c72153Yw = new C72153Yw(this.A01, findViewById(R.id.bottom_button_container), getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
        this.A04 = c72153Yw;
        c72153Yw.A00();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        long A03 = this.A02.A03();
        Log.i(String.format(Locale.ENGLISH, "insufficient-storage-activity/internal-storage available: %,d required: %,d", Long.valueOf(A03), Long.valueOf(this.A00)));
        if (A03 > this.A00) {
            Log.i("insufficient-storage-activity/space-available/finishing-the-activity");
            long j = this.A00;
            if (j > 0) {
                C37131lv c37131lv = new C37131lv();
                c37131lv.A02 = Long.valueOf(j);
                c37131lv.A00 = Boolean.valueOf(findViewById(R.id.btn_skip_storage_settings).getVisibility() == 0);
                c37131lv.A01 = 1;
                this.A03.A09(c37131lv, 1);
                AnonymousClass011.A01(c37131lv, "");
            }
            finish();
        }
    }
}
