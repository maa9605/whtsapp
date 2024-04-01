package com.whatsapp.twofactor;

import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass029;
import X.C000700j;
import X.C019208x;
import X.C02160Ac;
import X.C02180Ae;
import X.C0U1;
import X.C2E8;
import X.C2QL;
import X.C3ZR;
import X.C41911ui;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class SettingsTwoFactorAuthActivity extends C2QL implements C2E8 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C41911ui A0A;
    public final Handler A0B = new Handler(Looper.getMainLooper());
    public final Runnable A0C = new RunnableEBaseShape7S0100000_I0_7(this, 17);

    public final void A1P() {
        if (this.A05.canScrollVertically(1)) {
            this.A03.setElevation(this.A00);
        } else {
            this.A03.setElevation(0.0f);
        }
    }

    public final void A1Q() {
        int i;
        boolean z = !this.A0A.A02().isEmpty();
        int i2 = R.dimen.settings_2fa_disabled_logo_margin_top;
        if (z) {
            i2 = R.dimen.settings_2fa_enabled_logo_margin_top;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A04.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, getResources().getDimensionPixelSize(i2), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        ImageView imageView = this.A04;
        if (z) {
            boolean A0N = ((ActivityC02310Ar) this).A01.A0N();
            i = R.drawable.settings_2fa_done;
            if (A0N) {
                i = R.drawable.settings_2fa_done_rtl;
            }
        } else {
            i = R.drawable.settings_2fa;
        }
        imageView.setImageDrawable(C02160Ac.A03(this, i));
        this.A03.setVisibility(z ? 8 : 0);
        this.A02.setVisibility(z ? 0 : 8);
        this.A01.setVisibility(z ? 0 : 8);
        TextView textView = this.A08;
        int i3 = R.string.settings_two_factor_auth_info_disabled;
        if (z) {
            i3 = R.string.settings_two_factor_auth_info_enabled;
        }
        textView.setText(i3);
        TextView textView2 = this.A07;
        int i4 = this.A0A.A01().getInt("two_factor_auth_email_set", 0);
        int i5 = R.string.settings_two_factor_auth_add_email;
        if (i4 == 1) {
            i5 = R.string.settings_two_factor_auth_change_email;
        }
        textView2.setText(i5);
    }

    @Override // X.C2E8
    public void APy() {
        this.A0B.removeCallbacks(this.A0C);
        ARS();
        AUj(R.string.two_factor_auth_save_error);
        A1Q();
    }

    @Override // X.C2E8
    public void APz() {
        this.A0B.removeCallbacks(this.A0C);
        ARS();
        A1Q();
        ((ActivityC02290Ap) this).A0A.A07(R.string.two_factor_auth_disabled, 1);
    }

    public /* synthetic */ void lambda$onCreate$2595$SettingsTwoFactorAuthActivity(View view) {
        Intent intent = new Intent(this, TwoFactorAuthActivity.class);
        intent.putExtra("workflows", new int[]{1, 2});
        startActivity(intent);
    }

    public void lambda$onCreate$2596$SettingsTwoFactorAuthActivity(View view) {
        AUg(new ConfirmDisableDialog(), null);
    }

    public /* synthetic */ void lambda$onCreate$2597$SettingsTwoFactorAuthActivity(View view) {
        Intent intent = new Intent(this, TwoFactorAuthActivity.class);
        intent.putExtra("workflows", new int[]{1});
        startActivity(intent);
    }

    public /* synthetic */ void lambda$onCreate$2598$SettingsTwoFactorAuthActivity(View view) {
        Intent intent = new Intent(this, TwoFactorAuthActivity.class);
        intent.putExtra("workflows", new int[]{2});
        startActivity(intent);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A05.getViewTreeObserver().addOnPreDrawListener(new C3ZR(this));
        }
    }

    @Override // X.C2QL, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.settings_two_factor_auth);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        setContentView(R.layout.settings_two_factor_auth);
        this.A05 = (ScrollView) findViewById(R.id.scroll_view);
        this.A04 = (ImageView) findViewById(R.id.logo);
        this.A03 = findViewById(R.id.enable_panel);
        this.A02 = findViewById(R.id.disable_panel_divider);
        this.A01 = findViewById(R.id.disable_panel);
        this.A08 = (TextView) findViewById(R.id.description);
        this.A09 = (TextView) findViewById(R.id.disable_button);
        this.A06 = (TextView) findViewById(R.id.change_code_button);
        this.A07 = (TextView) findViewById(R.id.change_email_button);
        findViewById(R.id.enable_button).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 40));
        this.A09.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 41));
        this.A06.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 42));
        this.A07.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 39));
        if (Build.VERSION.SDK_INT < 23) {
            int A03 = AnonymousClass029.A03(this, R.attr.settingsIconColor, R.color.settings_icon);
            C02180Ae.A19(this.A09, A03);
            C02180Ae.A19(this.A06, A03);
            C02180Ae.A19(this.A07, A03);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
            this.A05.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3ZQ
                {
                    SettingsTwoFactorAuthActivity.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    SettingsTwoFactorAuthActivity.this.A1P();
                }
            });
            this.A05.getViewTreeObserver().addOnPreDrawListener(new C3ZR(this));
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        C41911ui c41911ui = this.A0A;
        C000700j.A07(c41911ui.A06.contains(this));
        c41911ui.A06.remove(this);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        this.A0A.A03(this);
        A1Q();
    }

    /* loaded from: classes2.dex */
    public class ConfirmDisableDialog extends Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x c019208x = new C019208x(((Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog) this).A00);
            c019208x.A02(R.string.settings_two_factor_auth_disable_confirm);
            c019208x.A06(R.string.settings_two_factor_auth_disable, new DialogInterface.OnClickListener() { // from class: X.3ZP
                {
                    SettingsTwoFactorAuthActivity.ConfirmDisableDialog.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SettingsTwoFactorAuthActivity settingsTwoFactorAuthActivity = (SettingsTwoFactorAuthActivity) SettingsTwoFactorAuthActivity.ConfirmDisableDialog.this.A09();
                    settingsTwoFactorAuthActivity.A12(R.string.two_factor_auth_disabling);
                    settingsTwoFactorAuthActivity.A0B.postDelayed(settingsTwoFactorAuthActivity.A0C, C41911ui.A08);
                    C41911ui c41911ui = settingsTwoFactorAuthActivity.A0A;
                    if (c41911ui != null) {
                        Log.i("twofactorauthmanager/disable-two-factor-auth");
                        c41911ui.A04("", null);
                        return;
                    }
                    throw null;
                }
            });
            c019208x.A04(R.string.cancel, null);
            return c019208x.A00();
        }
    }
}
