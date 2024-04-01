package com.whatsapp.backup.google;

import X.AbstractActivityC470929o;
import X.AbstractC02800Cx;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass029;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C000700j;
import X.C000800k;
import X.C012005w;
import X.C018508q;
import X.C02160Ac;
import X.C02180Ae;
import X.C02820Cz;
import X.C02F;
import X.C03310Fe;
import X.C06570Tx;
import X.C0CC;
import X.C0E7;
import X.C0EG;
import X.C0HC;
import X.C0KP;
import X.C0O6;
import X.C0O7;
import X.C0U1;
import X.C2MG;
import X.C40061rW;
import X.C42171vH;
import X.C469829b;
import X.C470129e;
import X.C639131i;
import X.C639231j;
import X.C81293of;
import X.InterfaceC001000m;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import X.InterfaceC05880Qp;
import X.InterfaceC470229f;
import X.ProgressDialogC06500To;
import X.ServiceConnectionC55802mD;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* loaded from: classes2.dex */
public class SettingsGoogleDrive extends AbstractActivityC470929o implements C0O6, C0O7 {
    public static final int[] A0j = {R.string.settings_gdrive_backup_frequency_option_off, R.string.settings_gdrive_backup_frequency_option_manual, R.string.settings_gdrive_backup_frequency_option_daily, R.string.settings_gdrive_backup_frequency_option_weekly, R.string.settings_gdrive_backup_frequency_option_monthly};
    public static final int[] A0k = {0, 4, 1, 2, 3};
    public static final int[] A0l = {R.string.settings_gdrive_backup_network_setting_option_wifi, R.string.settings_gdrive_backup_network_setting_option_wifi_and_cellular};
    public static final int[] A0m = {R.string.settings_gdrive_backup_network_setting_option_wifi_summary, R.string.settings_gdrive_backup_network_setting_option_wifi_and_cellular};
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public Button A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ProgressBar A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public SwitchCompat A0I;
    public C012005w A0J;
    public WaTextView A0K;
    public C03310Fe A0L;
    public C469829b A0M;
    public C470129e A0O;
    public C639231j A0P;
    public C000800k A0Q;
    public C000400f A0R;
    public C0E7 A0S;
    public C02F A0T;
    public C42171vH A0U;
    public C0CC A0V;
    public C0EG A0W;
    public C2MG A0X;
    public InterfaceC002901k A0Y;
    public boolean A0Z;
    public String[] A0a;
    public volatile boolean A0i;
    public final InterfaceC05880Qp A0g = new InterfaceC05880Qp() { // from class: X.31h
        {
            SettingsGoogleDrive.this = this;
        }

        @Override // X.InterfaceC05880Qp
        public void ANZ(String str) {
            Log.i("settings-gdrive/readonly-external-storage-readonly");
            SettingsGoogleDrive settingsGoogleDrive = SettingsGoogleDrive.this;
            boolean A01 = C000400f.A01();
            int i = R.string.read_only_media_message_shared_storage;
            if (A01) {
                i = R.string.read_only_media_message;
            }
            settingsGoogleDrive.AUl(R.string.msg_store_backup_skipped, i, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void ANa() {
            Log.i("settings-gdrive/readonly-external-storage-readonly-permission");
            SettingsGoogleDrive settingsGoogleDrive = SettingsGoogleDrive.this;
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_backup_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_backup;
            }
            RequestPermissionActivity.A05(settingsGoogleDrive, R.string.permission_storage_need_write_access_on_backup_request, i2);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ0(String str) {
            Log.i("settings-gdrive/external-storage-unavailable");
            C002701i.A19(SettingsGoogleDrive.this, 602);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ1() {
            Log.i("settings-gdrive/external-storage-unavailable-permission");
            SettingsGoogleDrive settingsGoogleDrive = SettingsGoogleDrive.this;
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_backup_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_backup;
            }
            RequestPermissionActivity.A05(settingsGoogleDrive, R.string.permission_storage_need_write_access_on_backup_request, i2);
        }
    };
    public final InterfaceC001000m A0f = new InterfaceC001000m() { // from class: X.31X
        {
            SettingsGoogleDrive.this = this;
        }

        @Override // X.InterfaceC001000m
        public final void AIx(C05050Nc c05050Nc) {
            SettingsGoogleDrive settingsGoogleDrive = SettingsGoogleDrive.this;
            settingsGoogleDrive.A0Y.AS1(new RunnableEBaseShape0S0100000_I0_0(settingsGoogleDrive, 16));
        }
    };
    public final ConditionVariable A0d = new ConditionVariable(false);
    public GoogleBackupService A0N = null;
    public final ConditionVariable A0c = new ConditionVariable(false);
    public final C0KP A0h = new C0KP() { // from class: X.31Z
        {
            SettingsGoogleDrive.this = this;
        }

        @Override // X.C0KP
        public final void AOz() {
            SettingsGoogleDrive.this.A1T();
        }
    };
    public final InterfaceC470229f A0e = new C639131i(this);
    public final ServiceConnection A0b = new ServiceConnectionC55802mD(this);

    public final int A1P() {
        int A03 = ((ActivityC02290Ap) this).A0F.A03();
        int i = 0;
        while (true) {
            int[] iArr = A0k;
            if (i < iArr.length) {
                if (iArr[i] == A03) {
                    return i;
                }
                i++;
            } else {
                C000200d.A0p("settings-gdrive/get-backup-freq-index/", A03);
                return 0;
            }
        }
    }

    public void A1Q() {
        if (this instanceof GoogleDriveNewUserSetupActivity) {
            return;
        }
        View findViewById = findViewById(R.id.include_video_settings_summary);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            C000500h c000500h = ((ActivityC02290Ap) this).A0F;
            String A0F = c000500h.A0F();
            String str = null;
            long j = -1;
            if (!TextUtils.isEmpty(A0F)) {
                SharedPreferences sharedPreferences = c000500h.A00;
                StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_video_size:");
                sb.append(A0F);
                j = sharedPreferences.getLong(sb.toString(), -1L);
            }
            if (j > 0) {
                textView.setVisibility(0);
                str = C02180Ae.A0j(((ActivityC02310Ar) this).A01, R.plurals.settings_gdrive_video_size_already_uploaded_plural, j, false);
            } else if (this.A0I.isChecked()) {
                textView.setVisibility(0);
                str = getString(R.string.calculating);
                this.A0P.A00.A05(this, new InterfaceC05620Pl() { // from class: X.31d
                    {
                        SettingsGoogleDrive.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        SettingsGoogleDrive settingsGoogleDrive = SettingsGoogleDrive.this;
                        long longValue = ((Number) obj).longValue();
                        View findViewById2 = settingsGoogleDrive.findViewById(R.id.include_video_settings_summary);
                        if (findViewById2 != null) {
                            ((TextView) findViewById2).setText(C02180Ae.A0j(((ActivityC02310Ar) settingsGoogleDrive).A01, R.plurals.settings_gdrive_video_size_to_be_uploaded_plural, longValue, false));
                            return;
                        }
                        throw null;
                    }
                });
                this.A0Y.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 18));
            } else {
                textView.setVisibility(8);
            }
            textView.setText(str);
            return;
        }
        throw null;
    }

    public void A1R() {
        C000700j.A01();
        if (C40061rW.A0G(this)) {
            return;
        }
        if (C40061rW.A0H(((ActivityC02290Ap) this).A0F)) {
            Log.i("settings-gdrive/account-selector/backup/running");
            AUj(R.string.settings_gdrive_please_wait_for_backup_to_finish_before_account_change);
        } else if (C40061rW.A0I(((ActivityC02290Ap) this).A0F)) {
            Log.i("settings-gdrive/account-selector/restore/running");
            AUj(R.string.settings_gdrive_please_wait_for_restore_to_finish_before_account_change);
        } else if (this.A0T.A02("android.permission.GET_ACCOUNTS") == 0 && this.A0T.A03()) {
            String A0F = ((ActivityC02290Ap) this).A0F.A0F();
            Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
            int length = accountsByType.length;
            if (length > 0) {
                C000200d.A1F(C000200d.A0P("settings-gdrive/account-selector/starting-account-picker/num-accounts/"), length);
                int i = -1;
                int i2 = length + 1;
                String[] strArr = new String[i2];
                for (int i3 = 0; i3 < length; i3++) {
                    strArr[i3] = accountsByType[i3].name;
                    if (A0F != null && A0F.equals(strArr[i3])) {
                        i = i3;
                    }
                }
                strArr[i2 - 1] = getString(R.string.google_account_picker_add_account);
                SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                Bundle A01 = C000200d.A01("dialog_id", 17);
                A01.putString("title", getString(R.string.google_account_picker_title));
                A01.putInt("selected_item_index", i);
                A01.putStringArray("multi_line_list_items_key", strArr);
                singleChoiceListDialogFragment.A0P(A01);
                if (A0N().A0Q.A01("account-picker") != null) {
                    return;
                }
                AbstractC02800Cx A0N = A0N();
                if (A0N != null) {
                    C02820Cz c02820Cz = new C02820Cz(A0N);
                    c02820Cz.A09(0, singleChoiceListDialogFragment, "account-picker", 1);
                    c02820Cz.A05();
                    return;
                }
                throw null;
            }
            Log.i("settings-gdrive/account-selector/no-account-found/start-add-account-activity");
            A1V();
        } else {
            A15(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_contacts_small).putExtra("permissions", new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}).putExtra("message_id", R.string.permission_contacts_access_for_gdrive_backup_request).putExtra("perm_denial_message_id", R.string.permission_contacts_access_for_gdrive_backup), 150);
        }
    }

    public final void A1S() {
        if (this.A0R.A0A(this.A0g)) {
            GoogleBackupService googleBackupService = this.A0N;
            if (googleBackupService != null) {
                googleBackupService.A06(10);
            }
            C42171vH c42171vH = this.A0U;
            C0EG c0eg = this.A0W;
            c42171vH.A01(3000L, new C81293of(this, ((ActivityC02310Ar) this).A01, c42171vH, c0eg, this, new RunnableEBaseShape0S0100000_I0_0(this, 21), this.A0R, this.A0T));
        }
    }

    public final void A1T() {
        long j;
        String A0f;
        String A02 = SettingsChat.A02(this, ((ActivityC02310Ar) this).A01, this.A0V);
        String A0F = ((ActivityC02290Ap) this).A0F.A0F();
        if (A0F != null) {
            j = ((ActivityC02290Ap) this).A0F.A0A(A0F);
        } else {
            j = 0;
        }
        if (j == 0) {
            A0f = getString(R.string.never);
        } else if (j == -1) {
            A0f = getString(R.string.unknown);
        } else {
            A0f = AnonymousClass029.A0f(((ActivityC02310Ar) this).A01, j);
        }
        long A0B = A0F != null ? ((ActivityC02290Ap) this).A0F.A0B(A0F) : -1L;
        if (this.A0A != null) {
            TextView textView = (TextView) findViewById(R.id.local_backup_time);
            if (textView != null) {
                textView.setText(getString(R.string.local_backup_time, A02));
                TextView textView2 = (TextView) findViewById(R.id.gdrive_backup_time);
                if (textView2 != null) {
                    textView2.setText(getString(R.string.google_drive_backup_time, A0f));
                    if (A0B > 0) {
                        View findViewById = findViewById(R.id.gdrive_backup_size);
                        if (findViewById != null) {
                            findViewById.setVisibility(0);
                            TextView textView3 = (TextView) findViewById(R.id.gdrive_backup_size);
                            if (textView3 != null) {
                                textView3.setText(getString(R.string.google_drive_backup_size, C02180Ae.A0k(((ActivityC02310Ar) this).A01, A0B)));
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        View findViewById2 = findViewById(R.id.gdrive_backup_size);
                        if (findViewById2 == null) {
                            throw null;
                        }
                        findViewById2.setVisibility(8);
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        A1Q();
    }

    public final void A1U() {
        this.A0Y.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 17));
    }

    public final void A1V() {
        this.A0Y.AS1(new RunnableEBaseShape0S0200000_I0_0(this, AccountManager.get(this).addAccount("com.google", null, null, null, this, null, null), 8));
    }

    public final void A1W() {
        GoogleBackupService googleBackupService = this.A0N;
        if (googleBackupService != null) {
            googleBackupService.A06(10);
        }
        Intent intent = new Intent("action_backup");
        intent.putExtra("backup_mode", "user_initiated");
        C40061rW.A0F(this, intent);
    }

    public final void A1X(String str) {
        C000700j.A00();
        StringBuilder sb = new StringBuilder("settings-gdrive/auth-request account being used is ");
        sb.append(C40061rW.A0B(str));
        Log.i(sb.toString());
        AuthRequestDialogFragment authRequestDialogFragment = new AuthRequestDialogFragment();
        this.A0i = false;
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        c018508q.A02.post(new RunnableEBaseShape0S0200000_I0_0(this, authRequestDialogFragment, 9));
        ConditionVariable conditionVariable = this.A0d;
        conditionVariable.close();
        this.A0Y.AS1(new RunnableEBaseShape0S1200000_I0(this, str, authRequestDialogFragment, 0));
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        C0HC c0hc = new C0HC("settings-gdrive/fetch-auth-token");
        conditionVariable.block(30000L);
        C018508q c018508q2 = ((ActivityC02290Ap) this).A0A;
        c018508q2.A02.post(new RunnableEBaseShape0S0200000_I0_0(this, c0hc, 6));
    }

    public final void A1Y(String str) {
        StringBuilder A0P = C000200d.A0P("setting-gdrive/activity-result/account-picker accountName is ");
        A0P.append(C40061rW.A0B(str));
        Log.i(A0P.toString());
        if (str != null) {
            this.A0Y.AS1(new RunnableEBaseShape0S1100000_I0(this, str, 5));
        } else if (((ActivityC02290Ap) this).A0F.A0F() != null) {
        } else {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            if (this instanceof GoogleDriveNewUserSetupActivity) {
                GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = (GoogleDriveNewUserSetupActivity) this;
                ((ActivityC02290Ap) googleDriveNewUserSetupActivity).A0F.A0o(0);
                if (googleDriveNewUserSetupActivity.A00 == 0) {
                    return;
                }
                googleDriveNewUserSetupActivity.A1d(false);
                googleDriveNewUserSetupActivity.A1b();
                googleDriveNewUserSetupActivity.A00 = -1;
                return;
            }
            ((ActivityC02290Ap) this).A0F.A0o(0);
            this.A0F.setText(this.A0a[A1P()]);
        }
    }

    public final void A1Z(String str, String str2) {
        this.A0d.open();
        DialogFragment dialogFragment = (DialogFragment) A0N().A0Q.A01("auth_request_dialog");
        if (dialogFragment != null) {
            dialogFragment.A11();
        }
        if (str != null) {
            if (!TextUtils.equals(((ActivityC02290Ap) this).A0F.A0F(), str2)) {
                C000200d.A0i(((ActivityC02290Ap) this).A0F, "gdrive_account_name", str2);
                GoogleBackupService googleBackupService = this.A0N;
                if (googleBackupService != null) {
                    Log.i("gdrive-service/reset");
                    googleBackupService.A0E = null;
                }
                StringBuilder A0P = C000200d.A0P("settings-gdrive/activity-result new accountName is ");
                A0P.append(C40061rW.A0B(str2));
                Log.i(A0P.toString());
                Intent intent = new Intent("action_fetch_backup_info");
                intent.putExtra("account_name", str2);
                C40061rW.A0F(this, intent);
                this.A0E.setText(str2);
                A1T();
            } else {
                StringBuilder A0P2 = C000200d.A0P("settings-gdrive/activity-result account unchanged, token received for ");
                A0P2.append(C40061rW.A0B(str2));
                Log.i(A0P2.toString());
            }
        }
        this.A0Y.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 20));
    }

    @Override // X.C0O6
    public void AJN(int i) {
        switch (i) {
            case 12:
                Log.i("settings-gdrive/cancel-media-restore-dialog/user-decided-not-to-cancel");
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user declined to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                return;
            case 14:
            default:
                throw new IllegalStateException(C000200d.A0D("unexpected dialog box: ", i));
            case 15:
                Log.i("settings-gdrive/user-declined-to-restore-media-over-cellular");
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                Log.i("settings-gdrive/user-declined-to-backup-over-cellular");
                return;
        }
    }

    @Override // X.C0O6
    public void AJO(int i) {
        throw new IllegalStateException(C000200d.A0D("unexpected dialog box: ", i));
    }

    public void AJP(int i) {
        switch (i) {
            case 12:
                GoogleBackupService googleBackupService = this.A0N;
                if (googleBackupService != null) {
                    googleBackupService.A04();
                    return;
                } else {
                    Log.e("settings-gdrive/cancel-media-restore google drive service object is null, unexpected.");
                    return;
                }
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                C469829b c469829b = this.A0M;
                c469829b.A03 = true;
                c469829b.A0X.AS1(new RunnableEBaseShape0S0100000_I0_0(c469829b, 2));
                A1W();
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                ((ActivityC02290Ap) this).A0F.A0o(0);
                this.A0F.setText(this.A0a[A1P()]);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                C469829b c469829b2 = this.A0M;
                c469829b2.A0S.A0Q();
                c469829b2.A03();
                c469829b2.A0X.AS1(new RunnableEBaseShape0S0100000_I0_0(c469829b2, 2));
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                C469829b c469829b3 = this.A0M;
                c469829b3.A03 = true;
                c469829b3.A0X.AS1(new RunnableEBaseShape0S0100000_I0_0(c469829b3, 2));
                return;
            default:
                throw new IllegalStateException(C000200d.A0D("unexpected dialog box: ", i));
        }
    }

    @Override // X.C0O7
    public void AJQ(int i) {
        StringBuilder sb = new StringBuilder("settings-gdrive/dialogId-");
        sb.append(i);
        sb.append("-dismissed");
        Log.i(sb.toString());
    }

    @Override // X.C0O7
    public void AOh(int i, int i2, String[] strArr) {
        if (i != 10) {
            if (i == 11) {
                String string = getString(A0m[i2]);
                C000200d.A14("settings-gdrive/backup-network/", string);
                this.A0H.setText(string);
                this.A0Y.AS1(new RunnableEBaseShape0S0101000_I0(this, i2, 0));
                return;
            } else if (i == 17) {
                String str = strArr[i2];
                if (str.equals(Integer.valueOf((int) R.string.google_account_picker_add_account))) {
                    A1V();
                    return;
                } else {
                    A1Y(str);
                    return;
                }
            } else {
                throw new IllegalStateException(C000200d.A0D("unexpected dialog box: ", i));
            }
        }
        int[] iArr = A0k;
        if (i2 > iArr.length) {
            C000200d.A0p("settings-gdrive/change-freq/unexpected-choice/", i2);
            return;
        }
        C000200d.A1F(C000200d.A0Q("settings-gdrive/change-freq/index:", i2, "/value:"), iArr[i2]);
        int A03 = ((ActivityC02290Ap) this).A0F.A03();
        int i3 = iArr[i2];
        if (!((ActivityC02290Ap) this).A0F.A0o(i3)) {
            Log.e("settings-gdrive/change-freq failed to set the new frequency.");
            return;
        }
        this.A0F.setText(this.A0a[i2]);
        if (i3 != 0) {
            if (A03 != 0 || C40061rW.A0H(((ActivityC02290Ap) this).A0F) || C40061rW.A0I(((ActivityC02290Ap) this).A0F)) {
                return;
            }
            this.A04.performClick();
        } else if (((ActivityC02290Ap) this).A0F.A00.getLong("gdrive_next_prompt_for_setup_timestamp", -1L) >= System.currentTimeMillis() + 2592000000L) {
        } else {
            ((ActivityC02290Ap) this).A0F.A0U(System.currentTimeMillis() + 2592000000L);
        }
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringBackup$1069$SettingsGoogleDrive(View view) {
        A1R();
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringBackup$1071$SettingsGoogleDrive(View view) {
        String A0F = ((ActivityC02290Ap) this).A0F.A0F();
        if (A0F == null) {
            A1R();
        } else {
            this.A0Y.AS1(new RunnableEBaseShape0S1100000_I0(this, A0F, 7));
        }
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringBackup$1072$SettingsGoogleDrive(View view) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com/settings/storage?emr=0&authuser=-1&utm_source=whatsapp")));
        } catch (ActivityNotFoundException e) {
            Log.e("settings-gdrive/display-backup-error/banner-tapped/unable-to-display-url", e);
            ((ActivityC02290Ap) this).A0A.A0D(this, getString(R.string.unable_to_display_url, "http://www.google.com/settings/storage?emr=0&authuser=-1&utm_source=whatsapp"));
        }
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1077$SettingsGoogleDrive(View view) {
        this.A0Y.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 19));
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1078$SettingsGoogleDrive(View view) {
        A1U();
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1079$SettingsGoogleDrive(View view) {
        A1U();
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1080$SettingsGoogleDrive(View view) {
        A1U();
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1082$SettingsGoogleDrive(View view) {
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_restore_media_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_restore_media;
        }
        RequestPermissionActivity.A05(this, i2, R.string.permission_storage_need_write_access_on_restore_media_request);
    }

    public /* synthetic */ void lambda$setupListeners$1050$SettingsGoogleDrive(View view) {
        A1S();
    }

    public /* synthetic */ void lambda$setupListeners$1051$SettingsGoogleDrive(View view) {
        GoogleBackupService googleBackupService = this.A0N;
        if (googleBackupService != null) {
            googleBackupService.A04();
            this.A0B.setVisibility(8);
            return;
        }
        Log.e("settings-gdrive/cancel-backup google drive service object is null, unexpected.");
    }

    public void lambda$setupListeners$1052$SettingsGoogleDrive(View view) {
        Bundle A01 = C000200d.A01("dialog_id", 12);
        A01.putString("message", getString(R.string.gdrive_cancel_media_restore_message));
        A01.putString("positive_button", getString(R.string.skip));
        A01.putString("negative_button", getString(R.string.cancel));
        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.A0P(A01);
        AbstractC02800Cx A0N = A0N();
        if (A0N != null) {
            C02820Cz c02820Cz = new C02820Cz(A0N);
            c02820Cz.A09(0, promptDialogFragment, null, 1);
            c02820Cz.A05();
            return;
        }
        throw null;
    }

    public void lambda$setupListeners$1053$SettingsGoogleDrive(View view) {
        if (view == this.A04) {
            A1R();
        } else if (view == this.A08) {
            Log.i("settings-gdrive/show-network-pref");
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle A01 = C000200d.A01("dialog_id", 11);
            A01.putString("title", getString(R.string.settings_gdrive_network_settings_title));
            A01.putStringArray("items", ((ActivityC02310Ar) this).A01.A0O(A0l));
            A01.putInt("selected_item_index", ((ActivityC02290Ap) this).A0F.A04());
            singleChoiceListDialogFragment.A0P(A01);
            if (C40061rW.A0G(this)) {
                return;
            }
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A09(0, singleChoiceListDialogFragment, null, 1);
                c02820Cz.A05();
                return;
            }
            throw null;
        } else if (view == this.A06) {
            Log.i("settings-gdrive/show-freq-pref");
            SingleChoiceListDialogFragment singleChoiceListDialogFragment2 = new SingleChoiceListDialogFragment();
            Bundle A012 = C000200d.A01("dialog_id", 10);
            A012.putString("title", getString(R.string.settings_gdrive_backup_options_title));
            A012.putStringArray("items", this.A0a);
            A012.putInt("selected_item_index", A1P());
            singleChoiceListDialogFragment2.A0P(A012);
            if (C40061rW.A0G(this)) {
                return;
            }
            AbstractC02800Cx A0N2 = A0N();
            if (A0N2 != null) {
                C02820Cz c02820Cz2 = new C02820Cz(A0N2);
                c02820Cz2.A09(0, singleChoiceListDialogFragment2, null, 1);
                c02820Cz2.A05();
                return;
            }
            throw null;
        } else if (view == this.A07) {
            if (C40061rW.A0H(((ActivityC02290Ap) this).A0F)) {
                AUj(R.string.settings_gdrive_please_wait_for_backup_to_finish_before_change);
                return;
            }
            if (C40061rW.A0I(((ActivityC02290Ap) this).A0F)) {
                AUj(R.string.settings_gdrive_please_wait_for_media_restore_to_finish_before_account_change);
            } else {
                this.A0I.toggle();
            }
            C000200d.A0j(((ActivityC02290Ap) this).A0F, "gdrive_include_videos_in_backup", this.A0I.isChecked());
            A1Q();
        } else {
            throw new IllegalArgumentException("Can't handle the click event for the pref view");
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        C000200d.A0t("settings-gdrive/activity-result request: ", i, " result: ", i2);
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            if (i2 != -1) {
                return;
            }
            if (this.A0L != null) {
                this.A0K.setText(R.string.settings_gdrive_backup_password_protect_value_disabled);
                return;
            }
            throw null;
        } else if (i == 1) {
            if (i2 == -1) {
                if (intent != null) {
                    A1Z(intent.getStringExtra("authtoken"), intent.getStringExtra("authAccount"));
                    return;
                }
                throw null;
            }
            DialogFragment dialogFragment = (DialogFragment) A0N().A0Q.A01("auth_request_dialog");
            if (dialogFragment == null) {
                return;
            }
            dialogFragment.A11();
        } else if (i == 2) {
            if (intent != null) {
                str = intent.getStringExtra("authAccount");
            } else {
                str = null;
            }
            A1Y(i2 == -1 ? str : null);
        } else if (i == 150) {
            if (i2 != -1) {
                return;
            }
            A1R();
        } else if (i == 151 && i2 == -1) {
            if (this.A0N != null && ((ActivityC02290Ap) this).A0F.A05() == 23) {
                this.A0N.A06(10);
            }
            if (!C40061rW.A0I(((ActivityC02290Ap) this).A0F) && !C40061rW.A0H(((ActivityC02290Ap) this).A0F)) {
                A1S();
            } else {
                this.A0M.A02();
            }
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, Main.class));
        }
        finish();
    }

    @Override // X.AbstractActivityC470929o, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        Intent intent;
        super.onCreate(bundle);
        this.A0P = (C639231j) new C06570Tx(this).A00(C639231j.class);
        setTitle(R.string.settings_backup);
        setContentView(R.layout.activity_settings_google_drive);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            View findViewById = findViewById(R.id.google_drive_backup_error_info_view);
            if (findViewById != null) {
                this.A05 = findViewById;
                this.A04 = findViewById(R.id.settings_gdrive_change_account_view);
                String A0F = ((ActivityC02290Ap) this).A0F.A0F();
                if (A0F == null) {
                    A0F = getString(R.string.settings_gdrive_account_name_missing_value);
                }
                View findViewById2 = findViewById(R.id.settings_gdrive_account_name_summary);
                if (findViewById2 != null) {
                    TextView textView = (TextView) findViewById2;
                    this.A0E = textView;
                    textView.setText(A0F);
                    this.A0A = (Button) findViewById(R.id.google_drive_backup_now_btn);
                    if (this.A0M.A0Y.get() || C40061rW.A0I(((ActivityC02290Ap) this).A0F)) {
                        this.A0A.setVisibility(8);
                    }
                    this.A0G = (TextView) findViewById(R.id.google_drive_backup_now_btn_info);
                    TextView textView2 = (TextView) findViewById(R.id.gdrive_backup_general_info);
                    if (textView2 != null) {
                        if (this instanceof GoogleDriveNewUserSetupActivity) {
                            boolean A01 = C000400f.A01();
                            i = R.string.gdrive_new_user_setup_general_info_shared_storage_short;
                            if (A01) {
                                i = R.string.gdrive_new_user_setup_general_info_sdcard_short;
                            }
                        } else {
                            boolean A012 = C000400f.A01();
                            i = R.string.settings_gdrive_backup_general_info_shared_storage_short;
                            if (A012) {
                                i = R.string.settings_gdrive_backup_general_info_sdcard_short;
                            }
                        }
                        textView2.setText(i);
                        ProgressBar progressBar = (ProgressBar) findViewById(R.id.google_drive_progress);
                        this.A0D = progressBar;
                        C02180Ae.A18(progressBar, C02160Ac.A00(this, R.color.media_message_progress_determinate));
                        this.A0B = (ImageView) findViewById(R.id.cancel_download);
                        this.A0C = (ImageView) findViewById(R.id.resume_download);
                        this.A06 = findViewById(R.id.settings_gdrive_change_frequency_view);
                        this.A0F = (TextView) findViewById(R.id.settings_gdrive_backup_options_summary);
                        int[] iArr = A0j;
                        int length = iArr.length;
                        this.A0a = new String[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            if (iArr[i2] == R.string.settings_gdrive_backup_frequency_option_manual) {
                                this.A0a[i2] = getString(R.string.settings_gdrive_backup_frequency_option_manual, getString(R.string.backup));
                            } else {
                                this.A0a[i2] = getString(iArr[i2]);
                            }
                        }
                        this.A0F.setText(this.A0a[A1P()]);
                        this.A08 = findViewById(R.id.settings_gdrive_network_settings_view);
                        this.A0H = (TextView) findViewById(R.id.settings_gdrive_network_settings_summary);
                        this.A07 = findViewById(R.id.settings_gdrive_backup_optional_media);
                        this.A09 = findViewById(R.id.settings_gdrive_password_protect_backups);
                        this.A0K = (WaTextView) findViewById(R.id.settings_gdrive_password_protect_backups_value);
                        this.A09.setVisibility(8);
                        this.A0H.setText(getString(A0m[((ActivityC02290Ap) this).A0F.A04()]));
                        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.include_video_setting);
                        this.A0I = switchCompat;
                        switchCompat.setChecked(((ActivityC02290Ap) this).A0F.A00.getBoolean("gdrive_include_videos_in_backup", false));
                        ViewOnClickEBaseShape0S0100000_I0_0 viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S0100000_I0_0(this, 12);
                        this.A03 = viewOnClickEBaseShape0S0100000_I0_0;
                        this.A00 = new ViewOnClickEBaseShape0S0100000_I0_0(this, 17);
                        this.A01 = new ViewOnClickEBaseShape0S0100000_I0_0(this, 14);
                        this.A0A.setOnClickListener(viewOnClickEBaseShape0S0100000_I0_0);
                        ViewOnClickEBaseShape0S0100000_I0_0 viewOnClickEBaseShape0S0100000_I0_02 = new ViewOnClickEBaseShape0S0100000_I0_0(this, 18);
                        this.A04.setOnClickListener(viewOnClickEBaseShape0S0100000_I0_02);
                        A1T();
                        this.A08.setOnClickListener(viewOnClickEBaseShape0S0100000_I0_02);
                        this.A06.setOnClickListener(viewOnClickEBaseShape0S0100000_I0_02);
                        this.A07.setOnClickListener(viewOnClickEBaseShape0S0100000_I0_02);
                        this.A0Q.A01(this.A0f);
                        bindService(new Intent(this, GoogleBackupService.class), this.A0b, 1);
                        if (!this.A0M.A07()) {
                            Log.i("settings-gdrive/create google drive access not allowed.");
                            finish();
                        }
                        if ((bundle == null || !bundle.getBoolean("intent_already_parsed", false)) && (intent = getIntent()) != null && intent.getAction() != null) {
                            onNewIntent(intent);
                        }
                        int A03 = AnonymousClass029.A03(this, R.attr.settingsIconColor, R.color.settings_icon);
                        C02180Ae.A17((ImageView) findViewById(R.id.last_backup_icon), A03);
                        C02180Ae.A17((ImageView) findViewById(R.id.gdrive_icon), A03);
                        C02180Ae.A17((ImageView) findViewById(R.id.backup_settings_icon), A03);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 600) {
            if (i != 602) {
                return super.onCreateDialog(i);
            }
            return SettingsChat.A01(this);
        }
        return SettingsChat.A00(this);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A0Z = true;
        GoogleBackupService googleBackupService = this.A0N;
        if (googleBackupService != null) {
            googleBackupService.A08(this.A0e);
            this.A0N = null;
        }
        unbindService(this.A0b);
        this.A0Q.A00(this.A0f);
        super.onDestroy();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String action = intent.getAction();
        C000200d.A14("settings-gdrive/new-intent/action/", action);
        if (action == null) {
            return;
        }
        char c = 65535;
        int hashCode = action.hashCode();
        if (hashCode != -1074883521) {
            if (hashCode == 996064514 && action.equals("action_perform_media_restore_over_cellular")) {
                c = 0;
            }
        } else if (action.equals("action_perform_backup_over_cellular")) {
            c = 1;
        }
        if (c == 0) {
            Bundle A01 = C000200d.A01("dialog_id", 15);
            A01.putString("message", getString(R.string.google_drive_confirm_media_restore_over_cellular_message));
            A01.putBoolean("cancelable", false);
            A01.putString("positive_button", getString(R.string.google_drive_resume_button_label));
            A01.putString("negative_button", getString(R.string.not_now));
            PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
            promptDialogFragment.A0P(A01);
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A09(0, promptDialogFragment, "action_perform_media_restore_over_cellular", 1);
                c02820Cz.A05();
                return;
            }
            throw null;
        } else if (c != 1) {
            StringBuilder A0P = C000200d.A0P("settings-gdrive/new-intent/unexpected-action/");
            A0P.append(intent.getAction());
            Log.e(A0P.toString());
        } else {
            Bundle A012 = C000200d.A01("dialog_id", 16);
            A012.putString("message", getString(R.string.google_drive_confirm_backup_over_cellular_message));
            A012.putBoolean("cancelable", false);
            A012.putString("positive_button", getString(R.string.google_drive_resume_button_label));
            A012.putString("negative_button", getString(R.string.not_now));
            PromptDialogFragment promptDialogFragment2 = new PromptDialogFragment();
            promptDialogFragment2.A0P(A012);
            AbstractC02800Cx A0N2 = A0N();
            if (A0N2 != null) {
                C02820Cz c02820Cz2 = new C02820Cz(A0N2);
                c02820Cz2.A09(0, promptDialogFragment2, "action_perform_backup_over_cellular", 1);
                c02820Cz2.A05();
                return;
            }
            throw null;
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        C000400f c000400f = this.A0R;
        C0KP c0kp = this.A0h;
        if (c000400f != null) {
            if (c0kp != null) {
                c000400f.A07.remove(c0kp);
            }
            super.onPause();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        C000400f c000400f = this.A0R;
        C0KP c0kp = this.A0h;
        if (c000400f != null) {
            if (c0kp != null) {
                c000400f.A07.add(c0kp);
            }
            A1T();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }

    /* loaded from: classes2.dex */
    public class AuthRequestDialogFragment extends Hilt_SettingsGoogleDrive_AuthRequestDialogFragment {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            ProgressDialogC06500To progressDialogC06500To = new ProgressDialogC06500To(((Hilt_SettingsGoogleDrive_AuthRequestDialogFragment) this).A00);
            progressDialogC06500To.setTitle(R.string.settings_gdrive_authenticating_with_google_servers_title);
            progressDialogC06500To.setIndeterminate(true);
            progressDialogC06500To.setMessage(A0F(R.string.settings_gdrive_authenticating_with_google_servers_message));
            progressDialogC06500To.setCancelable(true);
            progressDialogC06500To.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.2lr
                {
                    SettingsGoogleDrive.AuthRequestDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    SettingsGoogleDrive settingsGoogleDrive = (SettingsGoogleDrive) SettingsGoogleDrive.AuthRequestDialogFragment.this.A09();
                    if (settingsGoogleDrive != null) {
                        settingsGoogleDrive.A0i = true;
                        return;
                    }
                    throw null;
                }
            });
            return progressDialogC06500To;
        }
    }
}
