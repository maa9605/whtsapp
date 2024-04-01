package com.whatsapp.backup.google;

import X.AbstractActivityC470829m;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C000200d;
import X.C018308n;
import X.C0We;
import X.C40061rW;
import android.content.ActivityNotFoundException;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape0S1200000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class GoogleDriveNewUserSetupActivity extends AbstractActivityC470829m {
    public View A01;
    public Button A02;
    public RadioGroup A03;
    public AppCompatSpinner A04;
    public List A05;
    public RadioButton[] A06;
    public int A00 = -1;
    public final ViewTreeObserver.OnGlobalLayoutListener A07 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2m7
        {
            GoogleDriveNewUserSetupActivity.this = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i;
            GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = GoogleDriveNewUserSetupActivity.this;
            int measuredHeight = ((ViewGroup) googleDriveNewUserSetupActivity.findViewById(R.id.scrollbars)).getChildAt(0).getMeasuredHeight();
            if (googleDriveNewUserSetupActivity.A04.getVisibility() == 0) {
                i = googleDriveNewUserSetupActivity.A04.getMeasuredHeight();
            } else {
                i = 0;
            }
            int measuredHeight2 = (measuredHeight - i) + (googleDriveNewUserSetupActivity.A03.getVisibility() == 0 ? 0 : googleDriveNewUserSetupActivity.A03.getMeasuredHeight());
            Point point = new Point();
            googleDriveNewUserSetupActivity.getWindowManager().getDefaultDisplay().getSize(point);
            boolean z = ((double) ((float) point.y)) < ((double) ((float) measuredHeight2)) * 0.7d;
            googleDriveNewUserSetupActivity.A04.setVisibility(z ? 0 : 8);
            googleDriveNewUserSetupActivity.A03.setVisibility(z ? 8 : 0);
            googleDriveNewUserSetupActivity.findViewById(R.id.gdrive_new_user_setup_select_frequency_message).setVisibility(z ? 8 : 0);
            googleDriveNewUserSetupActivity.A03.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    };

    public final void A1a() {
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        int dimensionPixelSize = point.x - getResources().getDimensionPixelSize(R.dimen.gdrive_view_left_padding);
        for (RadioButton radioButton : this.A06) {
            radioButton.setWidth(dimensionPixelSize);
        }
    }

    public final void A1b() {
        this.A03.clearCheck();
        this.A04.setSelection(this.A05.size() - 1, true);
    }

    public final void A1c(String str, RadioButton radioButton) {
        int i = 2;
        String.format("gdrive-new-user-setup/freq-option-changed item:%s radioBtn:%s", str, radioButton);
        if (getString(R.string.settings_gdrive_backup_frequency_option_daily).equals(str)) {
            i = 1;
        } else if (!getString(R.string.settings_gdrive_backup_frequency_option_weekly).equals(str)) {
            i = 3;
            if (!getString(R.string.settings_gdrive_backup_frequency_option_monthly).equals(str)) {
                if (getString(R.string.settings_gdrive_backup_frequency_option_off).equals(str)) {
                    i = 0;
                } else {
                    C000200d.A14("gdrive-new-user-setup/create/unexpected-backup-frequency/", str);
                    i = -1;
                }
            }
        }
        int i2 = this.A00;
        this.A00 = i;
        if (radioButton != null) {
            A1b();
            radioButton.toggle();
            radioButton.getText();
            this.A04.setSelection(this.A05.indexOf(radioButton.getText().toString()));
        }
        A1d(true);
        if ((i2 != -1 && i2 != 0 && ((ActivityC02290Ap) this).A0F.A0F() != null) || i == 0 || i == -1) {
            return;
        }
        this.A01.performClick();
    }

    public final void A1d(boolean z) {
        if (this.A02 == null) {
            Log.e("gdrive-new-user-setup/update-setup-btn/setup-btn-is-null");
            return;
        }
        C0We c0We = new C0We(((ActivityC02310Ar) this).A01, getResources().getDrawable(R.drawable.chevron));
        if (z) {
            this.A02.setTextColor(getResources().getColor(R.color.primary_light));
            c0We.setColorFilter(getResources().getColor(R.color.primary_light), PorterDuff.Mode.SRC_ATOP);
            c0We.setAlpha(255);
        } else {
            int color = getResources().getColor(R.color.settings_disabled_text);
            this.A02.setTextColor(color);
            c0We.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            c0We.setAlpha(color >>> 24);
        }
        if (((ActivityC02310Ar) this).A01.A0M()) {
            this.A02.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, c0We, (Drawable) null);
        } else {
            this.A02.setCompoundDrawablesWithIntrinsicBounds(c0We, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // com.whatsapp.backup.google.SettingsGoogleDrive, X.C0O6
    public void AJP(int i) {
        if (i != 14) {
            super.AJP(i);
            return;
        }
        this.A00 = 0;
        this.A02.performClick();
    }

    public /* synthetic */ void lambda$onCreate$1089$GoogleDriveNewUserSetupActivity(View view) {
        String A0F = ((ActivityC02290Ap) this).A0F.A0F();
        StringBuilder A0P = C000200d.A0P("gdrive-new-user-setup/done-clicked account is ");
        A0P.append(C40061rW.A0B(A0F));
        A0P.append(" and backup frequency is ");
        C000200d.A1F(A0P, this.A00);
        int i = this.A00;
        if (i == -1) {
            Log.i(String.format("gdrive-new-user-setup/done-clicked/show-toast \"%s\"", getString(R.string.gdrive_new_user_setup_button_toast_no_freq_selected)));
            ((ActivityC02290Ap) this).A0A.A07(R.string.gdrive_new_user_setup_button_toast_no_freq_selected, 1);
        } else if (i != 0 && A0F == null) {
            Log.i("gdrive-new-user-setup/done-clicked/show-account-selector");
            A1R();
        } else {
            Log.i("gdrive-new-user-setup/done-clicked/setup-finished");
            ((ActivityC02290Ap) this).A0F.A0o(this.A00);
            this.A0Y.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 5));
            setResult(-1);
            finish();
        }
    }

    @Override // com.whatsapp.backup.google.SettingsGoogleDrive, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        try {
            C018308n.A03(this);
        } catch (ActivityNotFoundException e) {
            Log.e("gdrive-new-user-setup/back-pressed", e);
            ((ActivityC02290Ap) this).A0A.A07(R.string.gdrive_new_user_setup_button_toast_no_freq_selected, 1);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int indexOf;
        super.onConfigurationChanged(configuration);
        A1a();
        int i = this.A00;
        if (i == 0) {
            indexOf = this.A05.indexOf(getString(R.string.settings_gdrive_backup_frequency_option_off));
        } else if (i == 1) {
            indexOf = this.A05.indexOf(getString(R.string.settings_gdrive_backup_frequency_option_daily));
        } else if (i != 2) {
            if (i == 3) {
                indexOf = this.A05.indexOf(getString(R.string.settings_gdrive_backup_frequency_option_monthly));
            }
            A1b();
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
        } else {
            indexOf = this.A05.indexOf(getString(R.string.settings_gdrive_backup_frequency_option_weekly));
        }
        if (indexOf >= 0) {
            RadioButton radioButton = this.A06[indexOf];
            radioButton.toggle();
            radioButton.getText();
            this.A04.setSelection(this.A05.indexOf(radioButton.getText().toString()));
            this.A04.setSelection(indexOf);
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
        }
        A1b();
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractActivityC470829m, com.whatsapp.backup.google.SettingsGoogleDrive, X.AbstractActivityC470929o, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int[] iArr;
        super.onCreate(bundle);
        if (!((SettingsGoogleDrive) this).A0M.A08()) {
            Log.i("gdrive-new-user-setup/create no need to display GoogleDriveNewUserSetupActivity, exiting.");
            setResult(-1);
            finish();
            return;
        }
        setTitle(R.string.gdrive_new_user_setup_title);
        A0c().A0L(false);
        findViewById(R.id.settings_gdrive_backup_info_box).setVisibility(8);
        findViewById(R.id.settings_gdrive_gdrive_category_title).setVisibility(8);
        findViewById(R.id.settings_gdrive_change_frequency_view).setVisibility(8);
        findViewById(R.id.settings_gdrive_network_settings_view).setVisibility(8);
        findViewById(R.id.include_video_settings_summary).setVisibility(8);
        findViewById(R.id.gdrive_new_user_setup_message).setVisibility(0);
        findViewById(R.id.gdrive_new_user_setup_select_frequency_message).setVisibility(0);
        TextView textView = (TextView) findViewById(R.id.gdrive_new_user_setup_footer_info);
        textView.setText(getString(R.string.gdrive_new_user_setup_footer_info, getString(R.string.settings_general), getString(R.string.settings_chat), getString(R.string.settings_backup)));
        textView.setVisibility(0);
        findViewById(R.id.backup_settings_icon).setVisibility(0);
        TextView textView2 = (TextView) findViewById(R.id.settings_gdrive_backup_now_category_title);
        textView2.setVisibility(0);
        textView2.setText(R.string.gdrive_new_user_setup_category_title);
        ((TextView) findViewById(R.id.settings_gdrive_change_account_title)).setText(R.string.gdrive_new_user_setup_account_title);
        this.A01 = findViewById(R.id.settings_gdrive_change_account_view);
        this.A03 = (RadioGroup) findViewById(R.id.gdrive_new_user_setup_freq_options);
        this.A05 = new ArrayList();
        for (int i : SettingsGoogleDrive.A0j) {
            if (i != R.string.settings_gdrive_backup_frequency_option_manual && i != R.string.settings_gdrive_backup_frequency_option_off) {
                this.A05.add(getString(i));
            }
        }
        this.A05.add(getString(R.string.settings_gdrive_backup_frequency_option_off));
        this.A05.add(getString(R.string.gdrive_new_user_setup_select_a_backup_frequency));
        this.A03.setVisibility(0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.A05);
        arrayAdapter.setDropDownViewResource(17367049);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) findViewById(R.id.gdrive_new_user_setup_freq_options_spinner);
        this.A04 = appCompatSpinner;
        appCompatSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        this.A04.setSelection(this.A05.size() - 1);
        this.A04.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: X.2m8
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView adapterView) {
            }

            {
                GoogleDriveNewUserSetupActivity.this = this;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView adapterView, View view, int i2, long j) {
                GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = GoogleDriveNewUserSetupActivity.this;
                if (googleDriveNewUserSetupActivity.A04.getVisibility() == 0) {
                    googleDriveNewUserSetupActivity.A1c(String.valueOf(adapterView.getItemAtPosition(i2)), null);
                }
            }
        });
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        if (layoutInflater != null) {
            this.A06 = new RadioButton[this.A05.size() - 1];
            this.A03.addView(layoutInflater.inflate(R.layout.google_drive_new_user_setup_divider, (ViewGroup) null));
            for (int i2 = 0; i2 < this.A06.length; i2++) {
                String str = (String) this.A05.get(i2);
                TextView textView3 = (TextView) layoutInflater.inflate(R.layout.google_drive_new_user_setup_frequency_option, (ViewGroup) null);
                textView3.setText(str);
                this.A03.addView(textView3);
                this.A03.addView(layoutInflater.inflate(R.layout.google_drive_new_user_setup_divider, (ViewGroup) null));
                this.A06[i2] = textView3;
                textView3.setOnClickListener(new ViewOnClickEBaseShape0S1200000_I0(this, str, textView3, 0));
            }
            A1a();
            Button button = (Button) findViewById(R.id.gdrive_new_user_setup_btn);
            this.A02 = button;
            button.setVisibility(0);
            A1d(false);
            this.A02.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 0));
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
            return;
        }
        throw null;
    }
}
