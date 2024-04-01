package com.whatsapp.backup.google;

import X.AbstractC000600i;
import X.AbstractC02800Cx;
import X.AbstractC40111rb;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.AnonymousClass327;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C000700j;
import X.C000800k;
import X.C001200o;
import X.C004902f;
import X.C012005w;
import X.C018308n;
import X.C018508q;
import X.C02160Ac;
import X.C02180Ae;
import X.C02820Cz;
import X.C02F;
import X.C02O;
import X.C03310Fe;
import X.C03860Hk;
import X.C04630Le;
import X.C05E;
import X.C06570Tx;
import X.C09I;
import X.C0DS;
import X.C0E7;
import X.C0EL;
import X.C0O6;
import X.C0O7;
import X.C0PR;
import X.C0U1;
import X.C2Aa;
import X.C2CQ;
import X.C2MG;
import X.C3VI;
import X.C40061rW;
import X.C40071rX;
import X.C40161rg;
import X.C41451tw;
import X.C42721wD;
import X.C469829b;
import X.C47642Ca;
import X.C49622Lq;
import X.C49792Mk;
import X.C55702m3;
import X.C638731e;
import X.C68183Ij;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import X.InterfaceC470229f;
import X.RunnableC55562lp;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape0S1200000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class RestoreFromBackupActivity extends C0PR implements C0O6, C0O7 {
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public Button A04;
    public ProgressBar A05;
    public TextView A06;
    public TextView A07;
    public AbstractC000600i A08;
    public C012005w A09;
    public C0EL A0A;
    public C09I A0B;
    public C03310Fe A0C;
    public C638731e A0D;
    public C55702m3 A0E;
    public C469829b A0F;
    public GoogleBackupService A0G;
    public GoogleDriveRestoreAnimationView A0H;
    public C49792Mk A0I;
    public AnonymousClass327 A0J;
    public C000800k A0K;
    public C000400f A0L;
    public C0E7 A0M;
    public C001200o A0N;
    public C02F A0O;
    public C03860Hk A0P;
    public C05E A0Q;
    public C42721wD A0R;
    public C49622Lq A0S;
    public C41451tw A0T;
    public C02O A0U;
    public C3VI A0V;
    public C2Aa A0W;
    public C2CQ A0X;
    public C2MG A0Y;
    public C40071rX A0Z;
    public C004902f A0a;
    public InterfaceC002901k A0b;
    public String A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public final ServiceConnection A0g;
    public final ConditionVariable A0h;
    public final ConditionVariable A0i;
    public final ConditionVariable A0j;
    public final InterfaceC470229f A0k;
    public final AbstractC40111rb A0l;
    public final List A0m;
    public final Set A0n;
    public final AtomicBoolean A0o;
    public final AtomicBoolean A0p;
    public final AtomicBoolean A0q;

    public RestoreFromBackupActivity() {
        super(true);
        this.A0m = new ArrayList();
        this.A0n = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A0i = new ConditionVariable(false);
        this.A0h = new ConditionVariable(false);
        this.A0j = new ConditionVariable(false);
        this.A0o = new AtomicBoolean(false);
        this.A0p = new AtomicBoolean(false);
        this.A0q = new AtomicBoolean(true);
        this.A0g = new ServiceConnection() { // from class: X.2mB
            {
                RestoreFromBackupActivity.this = this;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (iBinder == null) {
                    return;
                }
                RestoreFromBackupActivity restoreFromBackupActivity = RestoreFromBackupActivity.this;
                GoogleBackupService googleBackupService = ((BinderC52972bg) iBinder).A00;
                if (googleBackupService != null) {
                    restoreFromBackupActivity.A0G = googleBackupService;
                    restoreFromBackupActivity.A0h.open();
                    restoreFromBackupActivity.A0G.A07(restoreFromBackupActivity.A0k);
                    return;
                }
                throw null;
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                RestoreFromBackupActivity restoreFromBackupActivity = RestoreFromBackupActivity.this;
                restoreFromBackupActivity.A0e = false;
                GoogleBackupService googleBackupService = restoreFromBackupActivity.A0G;
                if (googleBackupService == null) {
                    return;
                }
                googleBackupService.A08(restoreFromBackupActivity.A0k);
                restoreFromBackupActivity.A0G = null;
                restoreFromBackupActivity.A0h.close();
            }
        };
        this.A0l = new C47642Ca(this);
        this.A0k = new C68183Ij(this);
    }

    public static String A00(int i) {
        switch (i) {
            case 21:
                return "new";
            case 22:
                return "restore-from-gdrive";
            case 23:
                return "restore-from-local";
            case 24:
                return "restoring-from-gdrive";
            case 25:
                return "return-from-auth";
            case 26:
                return "msgstore-restored";
            case 27:
                return "restoring-from-local";
            default:
                throw new IllegalStateException(C000200d.A0D("Unknown state: ", i));
        }
    }

    @Override // X.C0DS
    public void A1Q(int i) {
        if (i - this.A00 > 0) {
            this.A00 = i;
            if (i % 10 == 0) {
                StringBuilder sb = new StringBuilder("gdrive-activity/msg-restore-progress/");
                sb.append(i);
                sb.append("%");
                Log.i(sb.toString());
            }
            if (i <= 100) {
                this.A07.setText(getString(R.string.settings_gdrive_backup_msgstore_restore_message_with_percentage_placeholder, ((ActivityC02310Ar) this).A01.A0H().format(i / 100.0d)));
                this.A05.setIndeterminate(true);
            }
        }
    }

    @Override // X.C0DS
    public void A1R(C03860Hk c03860Hk) {
        String string;
        C000700j.A01();
        if (this.A0f) {
            setResult(2);
            finish();
        } else if (this.A0J.A00 == 26) {
            StringBuilder sb = new StringBuilder("gdrive-activity/after-msgstore-verified/state-is-msgstore-restored/call-ignored ");
            sb.append(c03860Hk);
            Log.i(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("gdrive-activity/after-msgstore-verified/");
            sb2.append(c03860Hk);
            Log.i(sb2.toString());
            A1g(26, c03860Hk);
            int i = c03860Hk.A00;
            boolean z = i != 2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i);
            sb3.append(" is unexpected here");
            C000700j.A08(z, sb3.toString());
            if (i == 1) {
                A1X();
            } else if (i == 5) {
                C000700j.A01();
                if (C40061rW.A0G(this)) {
                    return;
                }
                Bundle A01 = C000200d.A01("dialog_id", 19);
                A01.putString("message", getString(R.string.gdrive_message_restore_failed_low_on_storage_space));
                A01.putBoolean("cancelable", false);
                A01.putString("positive_button", getString(R.string.retry));
                A01.putString("negative_button", getString(R.string.skip));
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
            } else {
                C55702m3 c55702m3 = this.A0E;
                if (c55702m3 != null && c55702m3.A03) {
                    this.A0n.add(new Account(c55702m3.A05, "com.google"));
                    StringBuilder sb4 = new StringBuilder("gdrive-activity/after-msgstore-verified/failed/unrestorable-gdrive-backup/");
                    sb4.append(C40061rW.A0B(this.A0E.A05));
                    Log.i(sb4.toString());
                } else {
                    this.A0q.set(false);
                    Log.i("gdrive-activity/after-msgstore-verified/failed/unrestorable-local-backup");
                }
                if (i == 3) {
                    C000700j.A01();
                    if (C40061rW.A0G(this)) {
                        return;
                    }
                    Bundle A012 = C000200d.A01("dialog_id", 20);
                    String[] strArr = (String[]) Collections.unmodifiableSet(((C0DS) this).A0E.A0Y).toArray(new String[0]);
                    C000200d.A1N(C000200d.A0P("gdrive-activity/get-jid-mismatch-message "), Arrays.toString(strArr));
                    int length = strArr.length;
                    if (length == 0) {
                        string = getString(R.string.gdrive_message_restore_failed_jid_mismatch_no_jid_associated_with_backup_found);
                    } else if (length == 1) {
                        string = getString(R.string.gdrive_message_restore_failed_jid_mismatch_one_jid_associated_with_backup_found, C04630Le.A03(((ActivityC02290Ap) this).A0F.A0I()), strArr[0]);
                    } else {
                        Arrays.sort(strArr);
                        int i2 = length - 1;
                        String[] strArr2 = new String[i2];
                        String str = strArr[i2];
                        System.arraycopy(strArr, 0, strArr2, 0, i2);
                        string = getString(R.string.gdrive_message_restore_failed_jid_mismatch_many_jids_associated_with_backup_found, C04630Le.A03(((ActivityC02290Ap) this).A0F.A0I()), AnonymousClass029.A0o(((ActivityC02310Ar) this).A01, false, Arrays.asList(strArr2)), str);
                    }
                    A012.putString("message", string);
                    A012.putBoolean("cancelable", false);
                    A012.putString("positive_button", getString(R.string.gdrive_message_restore_failed_reregister_btn));
                    boolean A1o = A1o();
                    int i3 = R.string.skip;
                    if (A1o) {
                        i3 = R.string.restore_from_older;
                    }
                    A012.putString("negative_button", getString(i3));
                    PromptDialogFragment promptDialogFragment2 = new PromptDialogFragment();
                    promptDialogFragment2.A0P(A012);
                    AbstractC02800Cx A0N2 = A0N();
                    if (A0N2 != null) {
                        C02820Cz c02820Cz2 = new C02820Cz(A0N2);
                        c02820Cz2.A09(0, promptDialogFragment2, null, 1);
                        c02820Cz2.A05();
                        return;
                    }
                    throw null;
                }
                TextUtils.join(",", this.A0m);
                TextUtils.join(",", this.A0n);
                if (A1o()) {
                    C000700j.A01();
                    if (!C40061rW.A0G(this)) {
                        Bundle A013 = C000200d.A01("dialog_id", 18);
                        A013.putString("message", getString(R.string.gdrive_message_restore_failed_retry_prompt_message));
                        A013.putBoolean("cancelable", false);
                        A013.putString("positive_button", getString(R.string.restore_from_older));
                        A013.putString("negative_button", getString(R.string.skip));
                        PromptDialogFragment promptDialogFragment3 = new PromptDialogFragment();
                        promptDialogFragment3.A0P(A013);
                        AbstractC02800Cx A0N3 = A0N();
                        if (A0N3 != null) {
                            C02820Cz c02820Cz3 = new C02820Cz(A0N3);
                            c02820Cz3.A09(0, promptDialogFragment3, null, 1);
                            c02820Cz3.A05();
                            return;
                        }
                        throw null;
                    }
                    return;
                }
                A1T(false);
                A1X();
                ((ActivityC02290Ap) this).A0A.A0C(this, R.string.msg_store_error_not_restored);
            }
        }
    }

    public void A1V() {
        StringBuilder A0P = C000200d.A0P("gdrive-activity/skip-restore user declined to restore backup from ");
        C55702m3 c55702m3 = this.A0E;
        A0P.append(c55702m3 == null ? "<unset account>" : C40061rW.A0B(c55702m3.A05));
        Log.i(A0P.toString());
        Log.i("gdrive-activity/skip-restore/stopping-approx-transfer-size-calc-thread");
        this.A0o.set(true);
        ((ActivityC02290Ap) this).A0F.A0T(0);
        ((ActivityC02290Ap) this).A0F.A0K();
        ((ActivityC02290Ap) this).A0F.A0o(0);
        C000200d.A0j(((ActivityC02290Ap) this).A0F, "gdrive_include_videos_in_backup", false);
        RunnableEBaseShape0S0100000_I0_0 runnableEBaseShape0S0100000_I0_0 = new RunnableEBaseShape0S0100000_I0_0(this, 8);
        if (AnonymousClass024.A0c()) {
            this.A0b.AS1(runnableEBaseShape0S0100000_I0_0);
        } else {
            ((RestoreFromBackupActivity) runnableEBaseShape0S0100000_I0_0.A00).A1e();
        }
        GoogleBackupService googleBackupService = this.A0G;
        if (googleBackupService != null) {
            googleBackupService.A06(10);
        } else {
            Log.e("gdrive-activity/skip-restore/google-drive-service-object-is-null");
        }
        String A0F = ((ActivityC02290Ap) this).A0F.A0F();
        if (A0F != null) {
            Intent intent = new Intent("action_remove_backup_info");
            intent.putExtra("account_name", A0F);
            intent.putExtra("remove_account_name", true);
            C40061rW.A0F(this, intent);
        }
        setResult(2);
        A1b();
    }

    public final void A1W() {
        C000700j.A01();
        C000200d.A0c(this, R.id.restore_actions_view, 0);
        C000200d.A0c(this, R.id.restore_general_info, 0);
        C000200d.A0c(this, R.id.calculating_progress_view, 0);
        C000200d.A0c(this, R.id.google_drive_looking_for_backup_view, 0);
        C000200d.A0c(this, R.id.google_drive_restore_animation_view, 8);
        C000200d.A0c(this, R.id.google_drive_progress, 8);
        C000200d.A0c(this, R.id.google_drive_progress_info, 8);
        C000200d.A0c(this, R.id.google_drive_restore_view, 8);
        C000200d.A0c(this, R.id.google_drive_media_will_be_downloaded_later_notice, 8);
        C000200d.A0c(this, R.id.msgrestore_result_box, 8);
        View findViewById = findViewById(R.id.nextBtn);
        if (findViewById != null) {
            findViewById.setVisibility(8);
            File databasePath = getDatabasePath("msgstore.db");
            if (databasePath.exists()) {
                if (!databasePath.delete()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-activity/show-msgstore-downloading-view/restore-failed ");
                    sb.append(databasePath);
                    sb.append(" exists but cannot be deleted, message restore might fail");
                    Log.w(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("gdrive-activity/show-msgstore-downloading-view/restore-failed ");
                    sb2.append(databasePath);
                    sb2.append(" deleted");
                    Log.i(sb2.toString());
                }
            }
            this.A0R.A01();
            A1l(false);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x000c, code lost:
        if (r0.A01 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1X() {
        /*
            r10 = this;
            X.C000700j.A01()
            X.2m3 r0 = r10.A0E
            r8 = 0
            r7 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.A01
            r6 = 1
            if (r0 == 0) goto Lf
        Le:
            r6 = 0
        Lf:
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r10.A0H
            if (r0 != 0) goto L20
            r0 = 2131363125(0x7f0a0535, float:1.834605E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 == 0) goto Ldf
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) r0
            r10.A0H = r0
        L20:
            r0.A02(r8)
            r0 = 2131364271(0x7f0a09af, float:1.8348374E38)
            r1 = 8
            X.C000200d.A0c(r10, r0, r1)
            android.widget.ProgressBar r0 = r10.A05
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A06
            if (r0 != 0) goto L46
            r0 = 2131363121(0x7f0a0531, float:1.8346042E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 == 0) goto Ldd
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A06 = r0
        L46:
            r0.setVisibility(r1)
            r0 = 2131363639(0x7f0a0737, float:1.8347093E38)
            android.view.View r5 = r10.findViewById(r0)
            if (r5 == 0) goto Ldb
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setVisibility(r8)
            if (r6 == 0) goto Lba
            X.00h r1 = r10.A0F
            r0 = 2
            r1.A0T(r0)
            X.01c r9 = r10.A01
            r4 = 2131755088(0x7f100050, float:1.9141045E38)
            X.05E r0 = r10.A0Q
            int r0 = r0.A01()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.05E r2 = r10.A0Q
            int r2 = r2.A01()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r8] = r2
            java.lang.String r2 = r9.A0A(r4, r0, r3)
        L7d:
            java.lang.String r1 = "gdrive-activity/after-msgstore-verified/ "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            r5.setText(r2)
            r0 = 2131363679(0x7f0a075f, float:1.8347174E38)
            android.view.View r2 = r10.findViewById(r0)
            if (r2 == 0) goto Ld9
            r2.setVisibility(r8)
            X.02E r0 = r10.A0E
            android.view.accessibility.AccessibilityManager r0 = r0.A0H()
            if (r0 == 0) goto Lb1
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto Lb1
            r2.setFocusableInTouchMode(r7)
            r2.requestFocus()
        Lb1:
            com.facebook.redex.ViewOnClickEBaseShape0S0110000_I0 r0 = new com.facebook.redex.ViewOnClickEBaseShape0S0110000_I0
            r0.<init>(r10, r6, r8)
            r2.setOnClickListener(r0)
            return
        Lba:
            X.01c r9 = r10.A01
            r4 = 2131755089(0x7f100051, float:1.9141047E38)
            X.05E r0 = r10.A0Q
            int r0 = r0.A01()
            long r1 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.05E r0 = r10.A0Q
            int r0 = r0.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r8] = r0
            java.lang.String r2 = r9.A0A(r4, r1, r3)
            goto L7d
        Ld9:
            r0 = 0
            throw r0
        Ldb:
            r0 = 0
            throw r0
        Ldd:
            r0 = 0
            throw r0
        Ldf:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A1X():void");
    }

    public final void A1Y() {
        Log.i("gdrive-activity/set-skip-restore/");
        this.A0f = true;
    }

    public final void A1Z() {
        C000700j.A01();
        Log.i("gdrive-activity/show-msgstore-downloading-view");
        C000200d.A0c(this, R.id.restore_actions_view, 8);
        C000200d.A0c(this, R.id.restore_general_info, 8);
        C000200d.A0c(this, R.id.calculating_progress_view, 8);
        C000200d.A0c(this, R.id.google_drive_restore_animation_view, 0);
        this.A05.setVisibility(0);
        this.A05.setIndeterminate(true);
        C02180Ae.A18(this.A05, C02160Ac.A00(this, R.color.media_message_progress_determinate));
        this.A07.setVisibility(0);
        this.A06 = (TextView) findViewById(R.id.google_drive_media_will_be_downloaded_later_notice);
        long j = this.A02;
        if (j == 0) {
            j = ((ActivityC02290Ap) this).A0F.A00.getLong("gdrive_approx_media_download_size", 0L);
            this.A02 = j;
        }
        if (j > 0) {
            this.A06.setText(getString(R.string.activity_gdrive_media_will_be_downloaded_later_notice, C02180Ae.A0k(((ActivityC02310Ar) this).A01, j)));
            this.A06.setVisibility(0);
        }
    }

    public final void A1a() {
        Log.i("gdrive-activity/show-restore-for-local-backup");
        C000200d.A0c(this, R.id.google_drive_looking_for_backup_view, 8);
        C000200d.A0c(this, R.id.google_drive_restore_view, 0);
        this.A0i.open();
        setTitle(R.string.activity_google_drive_restore_title);
        C000200d.A0c(this, R.id.calculating_progress_view, 8);
        C000200d.A0c(this, R.id.gdrive_restore_size_info, 8);
        C000200d.A0c(this, R.id.calculating_transfer_size_progress_bar, 8);
        CharSequence A0U = AnonymousClass029.A0U(((ActivityC02310Ar) this).A01, ((C0DS) this).A0E.A08());
        TextView textView = (TextView) findViewById(R.id.gdrive_restore_info);
        if (textView != null) {
            textView.setText(getString(R.string.local_restore_info_calculating, A0U));
            this.A0J.A01.A05(this, new InterfaceC05620Pl() { // from class: X.31Y
                {
                    RestoreFromBackupActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    RestoreFromBackupActivity restoreFromBackupActivity = RestoreFromBackupActivity.this;
                    long longValue = ((Number) obj).longValue();
                    CharSequence A0U2 = AnonymousClass029.A0U(((ActivityC02310Ar) restoreFromBackupActivity).A01, ((C0DS) restoreFromBackupActivity).A0E.A08());
                    String A0k = C02180Ae.A0k(((ActivityC02310Ar) restoreFromBackupActivity).A01, longValue);
                    TextView textView2 = (TextView) restoreFromBackupActivity.findViewById(R.id.gdrive_restore_info);
                    if (textView2 != null) {
                        textView2.setText(restoreFromBackupActivity.getString(R.string.local_restore_info, null, A0U2, A0k));
                        return;
                    }
                    throw null;
                }
            });
            this.A0b.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 14));
            this.A03.setVisibility(8);
            if (this.A0H == null) {
                this.A0H = (GoogleDriveRestoreAnimationView) findViewById(R.id.google_drive_restore_animation_view);
            }
            TextView textView2 = (TextView) findViewById(R.id.restore_general_info);
            if (textView2 != null) {
                boolean A01 = C000400f.A01();
                int i = R.string.shared_internal_storage_restore_general_info;
                if (A01) {
                    i = R.string.sdcard_restore_general_info;
                }
                textView2.setText(i);
                View findViewById = findViewById(R.id.dont_restore);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 3));
                    this.A04.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 2));
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void A1b() {
        Log.i("gdrive-activity/show-new-user-settings");
        A1Y();
        A1T(false);
        ((ActivityC02290Ap) this).A0F.A0U(System.currentTimeMillis() + 604800000);
    }

    public final void A1c() {
        Log.i("gdrive-activity/restore-media");
        C40061rW.A0F(this, new Intent("action_restore_media"));
    }

    public final void A1d() {
        Log.i("gdrive-activity/restore-messages");
        C55702m3 c55702m3 = this.A0E;
        if (c55702m3 != null && c55702m3.A01) {
            this.A0k.AMC(true);
        } else {
            C40061rW.A0F(this, new Intent("action_restore"));
        }
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        c018508q.A02.post(new RunnableEBaseShape0S0100000_I0_0(this, 11));
    }

    public /* synthetic */ void A1e() {
        this.A0F.A0A(0);
    }

    public final void A1f(int i) {
        Bundle A01 = C000200d.A01("dialog_id", i);
        A01.putString("message", getString(R.string.dont_restore_message));
        A01.putBoolean("cancelable", true);
        A01.putString("positive_button", getString(R.string.msg_store_do_not_restore));
        A01.putString("negative_button", getString(R.string.cancel));
        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.A0P(A01);
        if (!C40061rW.A0G(this)) {
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A09(0, promptDialogFragment, null, 1);
                c02820Cz.A05();
                return;
            }
            throw null;
        }
    }

    public final void A1g(int i, C03860Hk c03860Hk) {
        Integer num;
        this.A0J.A00 = i;
        this.A0P = c03860Hk;
        StringBuilder A0P = C000200d.A0P("gdrive-activity/state ");
        A0P.append(A00(i));
        A0P.append(" ");
        A0P.append(c03860Hk);
        Log.i(A0P.toString());
        C000500h c000500h = ((ActivityC02290Ap) this).A0F;
        int i2 = this.A0J.A00;
        C03860Hk c03860Hk2 = this.A0P;
        if (c03860Hk2 != null) {
            num = Integer.valueOf(c03860Hk2.A00);
        } else {
            num = null;
        }
        SharedPreferences.Editor A0D = c000500h.A0D();
        A0D.putInt("gdrive_activity_state", i2);
        if (num != null) {
            A0D.putInt("gdrive_activity_msgstore_init_key", num.intValue());
        } else {
            A0D.remove("gdrive_activity_msgstore_init_key");
        }
        A0D.apply();
    }

    public void A1h(long j, long j2) {
        String string;
        C000700j.A00();
        this.A01 = j;
        this.A02 = j2;
        ((ActivityC02290Ap) this).A0F.A0D().putLong("gdrive_approx_media_download_size", j2).apply();
        C000200d.A1I(new StringBuilder("washaredpreferences/save-gdrive-media-download-transfer-size/"), j2);
        if (j <= 0) {
            string = getString(R.string.gdrive_backup_size_info_with_nothing_to_download);
        } else {
            string = getString(R.string.gdrive_backup_size_info, C02180Ae.A0k(((ActivityC02310Ar) this).A01, j));
        }
        this.A0i.block();
        StringBuilder sb = new StringBuilder("gdrive-activity/update-restore-info/ total download size: ");
        sb.append(j);
        sb.append(" media download size: ");
        C000200d.A1I(sb, j2);
        ((ActivityC02290Ap) this).A0A.A02.post(new RunnableEBaseShape0S1100000_I0(this, string, 3));
    }

    public final void A1i(C55702m3 c55702m3) {
        StringBuilder A0P = C000200d.A0P("gdrive-activity/show-restore-for-gdrive-backup/");
        String str = c55702m3.A05;
        A0P.append(C40061rW.A0B(str));
        Log.i(A0P.toString());
        long j = c55702m3.A04;
        long j2 = c55702m3.A00;
        String A01 = c55702m3.A01();
        if (!TextUtils.isEmpty(A01)) {
            C000200d.A14("gdrive-activity/show-restore/", A01);
        }
        C000200d.A0c(this, R.id.google_drive_looking_for_backup_view, 8);
        C000200d.A0c(this, R.id.google_drive_restore_view, 0);
        this.A0i.open();
        setTitle(R.string.activity_google_drive_restore_title);
        if (this.A0H == null) {
            this.A0H = (GoogleDriveRestoreAnimationView) findViewById(R.id.google_drive_restore_animation_view);
        }
        if (c55702m3.A01) {
            TextView textView = (TextView) findViewById(R.id.restore_general_info);
            if (textView != null) {
                boolean A012 = C000400f.A01();
                int i = R.string.shared_internal_storage_restore_general_info;
                if (A012) {
                    i = R.string.sdcard_restore_general_info;
                }
                textView.setText(i);
            } else {
                throw null;
            }
        } else {
            TextView textView2 = (TextView) findViewById(R.id.restore_general_info);
            if (textView2 != null) {
                textView2.setText(R.string.gdrive_restore_general_info);
            } else {
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(getString(R.string.gdrive_backup_last_modified_date_unavailable));
        StringBuilder sb2 = new StringBuilder();
        if (j > 0) {
            sb.setLength(0);
            sb.append(AnonymousClass029.A0U(((ActivityC02310Ar) this).A01, j));
        }
        this.A01 = c55702m3.A01 ? 0L : j2;
        if (j2 >= 0) {
            sb2.setLength(0);
            sb2.append(C02180Ae.A0k(((ActivityC02310Ar) this).A01, j2));
        }
        if (!c55702m3.A03) {
            sb.setLength(0);
            sb.append(AnonymousClass029.A0U(((ActivityC02310Ar) this).A01, ((C0DS) this).A0E.A08()));
            Log.i("gdrive-activity/show-restore-for-gdrive-backup/local message backup will be used. showing local backup timestamp");
        }
        TextView textView3 = (TextView) findViewById(R.id.gdrive_restore_info);
        if (textView3 != null) {
            boolean z = c55702m3.A01;
            int i2 = R.string.gdrive_restore_info;
            if (z) {
                i2 = R.string.local_restore_info;
            }
            textView3.setText(getString(i2, str, sb.toString(), sb2.toString()));
            this.A03.setVisibility(8);
            View findViewById = findViewById(R.id.dont_restore);
            if (findViewById != null) {
                findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 6));
                this.A04.setOnClickListener(new ViewOnClickEBaseShape0S1200000_I0(this, str, c55702m3, 1));
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A1j(C55702m3 c55702m3) {
        A1Z();
        this.A0b.AS1(new RunnableEBaseShape0S1200100_I0(this, c55702m3.A05, c55702m3.A00, c55702m3, 0));
    }

    public final void A1k(boolean z) {
        setTitle(R.string.activity_google_drive_restore_title);
        if (((ActivityC02290Ap) this).A0F.A00.getBoolean("gdrive_restore_overwrite_local_files", false)) {
            StringBuilder sb = new StringBuilder("gdrive-activity/msgstore-download/finished, success: ");
            sb.append(z);
            sb.append(", now, restoring it.");
            Log.i(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("gdrive-activity/msgstore-download/not performed since we are using local, success: ");
            sb2.append(z);
            sb2.append(", now, restoring it.");
            Log.i(sb2.toString());
        }
        ((C0DS) this).A01.A0A(z, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x001c, code lost:
        if (r44.A0O.A03() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1l(boolean r45) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A1l(boolean):void");
    }

    public final void A1m(boolean z) {
        if (!this.A0O.A06()) {
            if (z) {
                A1n(true, false, 6);
                return;
            }
            ((C0DS) this).A0E.A00 = 4;
            A1Y();
            A1T(false);
        } else if (((C0DS) this).A0E.A06() > 0) {
            ((C0DS) this).A0E.A00 = 3;
            A1g(23, null);
            A1a();
        } else {
            ((C0DS) this).A0E.A00 = 4;
            A1Y();
            A1T(false);
        }
    }

    public final void A1n(boolean z, boolean z2, int i) {
        if (!z) {
            if (isFinishing()) {
                return;
            }
            startActivityForResult(RequestPermissionActivity.A00(this, R.string.permission_contacts_access_on_gdrive_restore_request, R.string.permission_contacts_access_on_gdrive_restore, true), i);
        } else if (z2) {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = R.string.permission_storage_contacts_on_gdrive_restore_v30;
            if (i2 < 30) {
                i3 = R.string.permission_storage_contacts_on_gdrive_restore;
            }
            if (!isFinishing()) {
                startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_contacts, R.drawable.permission_plus, R.drawable.permission_storage}).putExtra("permissions", new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).putExtra("message_id", R.string.permission_storage_contacts_on_gdrive_restore_request).putExtra("perm_denial_message_id", i3).putExtra("force_ui", true), i);
            }
        } else {
            int i4 = Build.VERSION.SDK_INT;
            int i5 = R.string.permission_storage_need_write_access_on_restore_from_backup_v30;
            if (i4 < 30) {
                i5 = R.string.permission_storage_need_write_access_on_restore_from_backup;
            }
            RequestPermissionActivity.A06(this, R.string.permission_storage_need_write_access_on_restore_from_backup_request, i5, true, i);
        }
    }

    public final boolean A1o() {
        return this.A0n.size() < this.A0m.size() || this.A0q.get();
    }

    public final boolean A1p(String str, int i) {
        C000700j.A00();
        StringBuilder sb = new StringBuilder("gdrive-activity/auth-request account being used is ");
        sb.append(C40061rW.A0B(str));
        Log.i(sb.toString());
        this.A0b.AS1(new RunnableC55562lp(this, str, i));
        Log.i("gdrive-activity/auth-request blocking on tokenReceived");
        this.A0j.block(100000L);
        return this.A0c != null;
    }

    @Override // X.C0O6
    public void AJN(int i) {
        if (i != 10 && i != 11) {
            if (i == 12) {
                Log.i("gdrive-activity/restore-media-on-cellular-dialog Wi-Fi unavailable and user agreed to restore media on cellular.");
                ((ActivityC02290Ap) this).A0F.A0Q();
                Log.i("gdrive-activity/restore-media");
                C40061rW.A0F(this, new Intent("action_restore_media"));
                Log.i("gdrive-activity/msgstore-download-finish setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
                setResult(3);
                finish();
                return;
            } else if (i == 14) {
                Log.i("gdrive-activity/no-local-or-gdrive-backup-found-dialog no google drive backups found and user is not interested in adding an account for that either.");
                A1b();
                setResult(1);
                return;
            } else if (i == 16) {
                Log.i("gdrive-activity/one-time-setup-is-taking-too-long/user-decided-to-cancel");
                C40161rg.A02();
                this.A0p.set(true);
                if (((C0DS) this).A0E.A06() > 0) {
                    A1g(23, null);
                    A1a();
                    return;
                }
                A1Y();
                A1T(false);
                return;
            } else if (i == 18) {
                Log.i("gdrive-activity/failed-to-restore-messages-from-selected-backup/user-decided-to-continue");
                A1Y();
                A1T(false);
                A1X();
                return;
            } else if (i == 19) {
                Log.i("gdrive-activity/failed-to-restore-messages/internal-storage-out-of-free-space/user-decided-to-skip");
                A1Y();
                A1T(false);
                return;
            } else if (i == 20) {
                if (A1o()) {
                    Log.i("gdrive-activity/msgstore-jid-mismatch/restore-from-older");
                    A1W();
                    return;
                }
                Log.i("gdrive-activity/msgstore-jid-mismatch/skip");
                A1T(false);
                A1X();
                return;
            } else {
                throw new IllegalStateException(C000200d.A0D("unexpected dialog box: ", i));
            }
        }
        C000200d.A0q("gdrive-activity/dialog-negative-click/dialog-id/", i);
    }

    @Override // X.C0O6
    public void AJO(int i) {
        if (i == 13) {
            Log.i("gdrive-activity/insufficient-space-dialog/neutral-click");
            return;
        }
        throw new IllegalStateException(C000200d.A0D("unexpected dialog box: ", i));
    }

    @Override // X.C0O6
    public void AJP(int i) {
        if (i == 10) {
            Log.i("gdrive-activity/show-restore user declined to restore from local backup");
            setResult(2);
            A1b();
        } else if (i == 11) {
            Log.i("gdrive-activity/user-confirmed-skip-restore");
            A1V();
        } else if (i == 12) {
            Log.i("gdrive-activity/restore-media-on-cellular-dialog, Wi-Fi unavailable and user declined to restore media on cellular.");
            setResult(3);
            finish();
        } else if (i == 13) {
            Log.i("gdrive-activity/insufficient-storage-for-restore/user-decided-to-visit-storage-settings");
            startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
        } else if (i == 14) {
            Log.i("gdrive-activity/one-time-setup no google drive backups found and user decided to add an account or give permission to an existing one.");
            Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
            int length = accountsByType.length;
            int i2 = length + 1;
            String[] strArr = new String[i2];
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = accountsByType[i3].name;
            }
            int i4 = i2 - 1;
            strArr[i4] = getString(R.string.google_account_picker_add_account);
            String[] strArr2 = new String[i2];
            boolean[] zArr = new boolean[i2];
            List list = this.A0m;
            list.clear();
            for (int i5 = 0; i5 < length; i5++) {
                list.add(accountsByType[i5]);
                if (this.A0n.contains(accountsByType[i5])) {
                    strArr2[i5] = getString(R.string.google_drive_no_backup_found);
                    zArr[i5] = false;
                } else {
                    strArr2[i5] = null;
                    zArr[i5] = true;
                }
            }
            zArr[i4] = true;
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle A01 = C000200d.A01("dialog_id", 17);
            A01.putString("title", getString(R.string.google_account_picker_title));
            A01.putStringArray("multi_line_list_items_key", strArr);
            A01.putStringArray("multi_line_list_item_values_key", strArr2);
            A01.putBooleanArray("list_item_enabled_key", zArr);
            A01.putString("disabled_item_toast_key", getString(R.string.gdrive_no_backup_found));
            singleChoiceListDialogFragment.A0P(A01);
            if (C40061rW.A0G(this)) {
                return;
            }
            singleChoiceListDialogFragment.A14(A0N(), null);
        } else if (i == 15) {
            Log.i("gdrive-activity/google-play-services-is-broken/user-decided-to-skip");
            setResult(1);
            finish();
        } else if (i == 16) {
            Log.i("gdrive-activity/one-time-setup-taking-too-long/user-decided-to-wait");
        } else if (i == 18) {
            Log.i("gdrive-activity/failed-to-restore-from-selected-backup/restore-from-older");
            A1W();
        } else if (i == 19) {
            A1W();
        } else if (i == 20) {
            Log.i("gdrive-activity/msgstore-jid-mistmatch/user-decided-to-reregister");
            C02O c02o = this.A0U;
            Log.i("register/phone/clear-reg-preferences");
            SharedPreferences.Editor edit = c02o.A01(C2Aa.A01(this, RegisterPhone.class)).edit();
            edit.clear();
            if (!edit.commit()) {
                Log.w("register/phone/failed-to-clear-reg-preferences");
            }
            this.A0W.A0A();
            Intent intent = new Intent(this, Main.class);
            intent.setFlags(268435456);
            startActivity(intent);
            System.exit(0);
        } else {
            throw new IllegalStateException(C000200d.A0D("unexpected dialog box: ", i));
        }
    }

    @Override // X.C0O7
    public void AJQ(int i) {
        if (i == 17) {
            Log.i("gdrive-activity/user-dismissed-account-selector-dialog-dismissed");
            A1l(true);
            return;
        }
        throw new IllegalStateException(C000200d.A0D("Unexpected dialog id:", i));
    }

    @Override // X.C0O7
    public void AOh(int i, int i2, String[] strArr) {
        if (i == 17) {
            if (strArr[i2].equals(getString(R.string.google_account_picker_add_account))) {
                C40061rW.A00.execute(new RunnableEBaseShape0S0200000_I0_0(this, AccountManager.get(this).addAccount("com.google", null, null, null, this, null, null), 4));
                Log.i("gdrive-activity/show-accounts/waiting-for-add-account-activity-to-return");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("authAccount", strArr[i2]);
            onActivityResult(3, -1, intent);
            return;
        }
        throw new IllegalStateException(C000200d.A0F("Unexpected dialogId: ", i, " index:", i2));
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMessageStoreDownload$1022$RestoreFromBackupActivity(View view) {
        GoogleBackupService googleBackupService = this.A0G;
        if (googleBackupService != null) {
            googleBackupService.A06(10);
            A1d();
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMessageStoreDownload$1024$RestoreFromBackupActivity(View view) {
        startActivity(new Intent("android.intent.action.VIEW", this.A0B.A01()));
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMessageStoreDownload$1025$RestoreFromBackupActivity(View view) {
        Log.i("gdrive-activity/show-skip-gdrive-restore-dialog");
        A1f(11);
    }

    public /* synthetic */ void lambda$showRestorePanelForUsersWithGoogleDriveBackups$1008$RestoreFromBackupActivity(View view) {
        Log.i("gdrive-activity/show-skip-gdrive-restore-dialog");
        A1f(11);
    }

    public /* synthetic */ void lambda$showRestorePanelForUsersWithOnlyLocalBackup$1012$RestoreFromBackupActivity(View view) {
        Log.i("gdrive-activity/show-local-restore-skip-dialog");
        A1f(10);
    }

    public void lambda$showRestorePanelForUsersWithOnlyLocalBackup$1013$RestoreFromBackupActivity(View view) {
        A1g(27, null);
        A1Z();
        A1k(true);
    }

    @Override // X.C0DS, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 5) {
            StringBuilder sb = new StringBuilder("gdrive-activity/request-permissions/result/");
            sb.append(i2);
            Log.i(sb.toString());
            A1l(true);
        } else if (i == 6) {
            StringBuilder sb2 = new StringBuilder("gdrive-activity/request-permissions-non-gps/result/");
            sb2.append(i2);
            Log.i(sb2.toString());
            A1m(false);
        } else if (i == 2) {
            StringBuilder sb3 = new StringBuilder("gdrive-activity/request-to-fix-google-play-services/result/");
            sb3.append(i2);
            Log.i(sb3.toString());
            A1l(false);
        } else if (i == 1) {
            if (i2 == -1) {
                if (intent != null) {
                    this.A0c = intent.getStringExtra("authtoken");
                    this.A0j.open();
                    this.A0b.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 12));
                    return;
                }
                throw null;
            }
        } else if (i != 3) {
            if (i == 4) {
                StringBuilder sb4 = new StringBuilder("gdrive-activity/activity-result/account-added-request/");
                sb4.append(i2);
                Log.i(sb4.toString());
                Intent intent2 = new Intent(this, RestoreFromBackupActivity.class);
                intent2.setAction("action_show_restore_one_time_setup");
                startActivity(intent2);
            } else if (i == 102) {
                C000200d.A0q("gdrive-activity/activity-result/password-input-activity/", i2);
                if (i2 != -1) {
                    return;
                }
                A1j(this.A0E);
            } else {
                super.onActivityResult(i, i2, intent);
            }
        } else if (i2 != -1) {
            StringBuilder sb5 = new StringBuilder("gdrive-activity/activity-result/account-picker-request/");
            sb5.append(i2);
            Log.e(sb5.toString());
            A1Y();
            A1T(false);
        } else if (intent != null) {
            if (intent.getExtras() != null) {
                String string = intent.getExtras().getString("authAccount");
                C40061rW.A0B(string);
                if (string == null) {
                    Log.e("gdrive-activity/activity-result/account-picker-returned-null-account");
                    return;
                } else {
                    this.A0b.AS1(new RunnableEBaseShape0S1100000_I0(this, string, 1));
                    return;
                }
            }
            throw null;
        } else {
            throw null;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C018308n.A03(this);
    }

    @Override // X.C0PR, X.C0DS, X.C0DT, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0V = new C3VI(this.A0b, this.A0Z, ((ActivityC02310Ar) this).A01, this.A0S, this.A0T);
        this.A0J = (AnonymousClass327) new C06570Tx(this).A00(AnonymousClass327.class);
        if (!this.A0F.A07()) {
            Log.i("gdrive-activity/no-google-drive-access-possible");
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.activity_google_drive_restore);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey()) {
            A0k(toolbar);
            C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A0L(false);
                A0c.A0O(false);
            }
        }
        setTitle(R.string.activity_google_drive_title);
        C02180Ae.A18((ProgressBar) findViewById(R.id.gdrive_looking_for_backup_progress_bar), C02160Ac.A00(this, R.color.primary_light));
        C02180Ae.A18((ProgressBar) findViewById(R.id.calculating_transfer_size_progress_bar), C02160Ac.A00(this, R.color.primary_light));
        View findViewById = findViewById(R.id.google_drive_progress);
        if (findViewById != null) {
            this.A05 = (ProgressBar) findViewById;
            View findViewById2 = findViewById(R.id.google_drive_progress_info);
            if (findViewById2 != null) {
                this.A07 = (TextView) findViewById2;
                View findViewById3 = findViewById(R.id.gdrive_restore_password_protected);
                if (findViewById3 != null) {
                    this.A03 = findViewById3;
                    View findViewById4 = findViewById(R.id.perform_restore);
                    if (findViewById4 != null) {
                        this.A04 = (Button) findViewById4;
                        this.A0e = getApplicationContext().bindService(new Intent(getApplicationContext(), GoogleBackupService.class), this.A0g, 1);
                        if (Build.VERSION.SDK_INT < 23) {
                            C02180Ae.A17((ImageView) findViewById(R.id.gdrive_restore_password_protected_icon), C02160Ac.A00(this, R.color.backupRestoreSecondaryText));
                        }
                        if (bundle == null) {
                            this.A0J.A00 = 21;
                            this.A0P = null;
                            ((ActivityC02290Ap) this).A0F.A0D().remove("gdrive_activity_state").remove("gdrive_activity_msgstore_init_key").apply();
                        } else {
                            C000500h c000500h = ((ActivityC02290Ap) this).A0F;
                            Pair pair = new Pair(Integer.valueOf(c000500h.A00.getInt("gdrive_activity_state", -1)), Integer.valueOf(c000500h.A00.getInt("gdrive_activity_msgstore_init_key", -1)));
                            AnonymousClass327 anonymousClass327 = this.A0J;
                            int intValue = ((Number) pair.first).intValue();
                            int i = intValue != -1 ? intValue : 21;
                            anonymousClass327.A00 = i;
                            if (i == 26) {
                                int intValue2 = ((Number) pair.second).intValue();
                                if (intValue2 == -1) {
                                    this.A0P = C03860Hk.A00(0);
                                } else {
                                    this.A0P = C03860Hk.A00(intValue2);
                                }
                            } else {
                                this.A0P = null;
                            }
                        }
                        if (this.A0J.A00 == 24 && !this.A0F.A0a.get()) {
                            Log.i("gdrive-activity/create/it looks like restoring from gdrive has been completed but we missed it, let's try again");
                            A1g(22, this.A0P);
                        }
                        Bundle bundle2 = bundle == null ? null : bundle.getBundle("restore_account_data");
                        StringBuilder A0P = C000200d.A0P("gdrive-activity/create/state/");
                        A0P.append(A00(this.A0J.A00));
                        Log.i(A0P.toString());
                        int i2 = this.A0J.A00;
                        switch (i2) {
                            case 21:
                                Intent intent = getIntent();
                                if (intent.getAction() == null) {
                                    Log.e("gdrive-activity/create no action provided.");
                                    finish();
                                    return;
                                }
                                onNewIntent(intent);
                                return;
                            case 22:
                                if (bundle2 != null) {
                                    this.A0E = C55702m3.A00(bundle2);
                                    A1g(22, null);
                                    A1i(this.A0E);
                                    this.A0b.AS1(new RunnableEBaseShape0S0200000_I0_0(this, bundle, 3));
                                    return;
                                }
                                throw new IllegalStateException("restore_account_data cannot be null");
                            case 23:
                                A1g(23, null);
                                A1a();
                                return;
                            case 24:
                                if (bundle2 != null) {
                                    this.A0E = C55702m3.A00(bundle2);
                                    A1g(22, null);
                                    A1i(this.A0E);
                                    A1g(24, null);
                                    A1Z();
                                    if (((ActivityC02290Ap) this).A0F.A06() == 3) {
                                        Log.i("gdrive-activity/create/gdrive-msgstore-download-pending");
                                        return;
                                    }
                                    Log.i("gdrive-activity/create/gdrive-msgstore-download-not-pending");
                                    A1k(true);
                                    return;
                                }
                                throw new IllegalStateException("restore_account_data cannot be null");
                            case 25:
                                if (bundle2 != null) {
                                    this.A0E = C55702m3.A00(bundle2);
                                    return;
                                }
                                return;
                            case 26:
                                C03860Hk c03860Hk = this.A0P;
                                if (bundle2 != null) {
                                    this.A0E = C55702m3.A00(bundle2);
                                    A1g(22, null);
                                    A1i(this.A0E);
                                } else {
                                    A1g(23, null);
                                    A1a();
                                }
                                A1Z();
                                StringBuilder sb = new StringBuilder("gdrive-activity/create/msgstore-init-status/");
                                sb.append(c03860Hk);
                                Log.i(sb.toString());
                                A1R(c03860Hk);
                                return;
                            case 27:
                                A1g(23, null);
                                A1a();
                                A1Z();
                                A1k(true);
                                A1g(27, null);
                                return;
                            default:
                                StringBuilder A0P2 = C000200d.A0P("Unknown state: ");
                                A0P2.append(i2);
                                throw new IllegalStateException(A0P2.toString());
                        }
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.registration_help);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A0d = true;
        GoogleBackupService googleBackupService = this.A0G;
        if (googleBackupService != null) {
            googleBackupService.A08(this.A0k);
        }
        if (this.A0e) {
            getApplicationContext().unbindService(this.A0g);
            this.A0G = null;
        }
        this.A0V.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getAction() == null) {
            Log.e("gdrive-activity/new-intent action is null");
            return;
        }
        String action = intent.getAction();
        if (action.hashCode() == -1725923122 && action.equals("action_show_restore_one_time_setup")) {
            Dialog A02 = C40061rW.A02(AnonymousClass029.A02(this.A0N.A00), this, 2, new DialogInterface.OnCancelListener() { // from class: X.2lo
                {
                    RestoreFromBackupActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    RestoreFromBackupActivity restoreFromBackupActivity = RestoreFromBackupActivity.this;
                    Log.i("gdrive-activity/create user declined to install Google Play Services.");
                    restoreFromBackupActivity.A1m(true);
                }
            }, false);
            if (A02 != null && !C40061rW.A0G(this)) {
                boolean z = ((ActivityC02290Ap) this).A0F.A00.getBoolean("new_jid", false);
                C000200d.A1C("gdrive-util/is-new-jid/", z);
                if (!z) {
                    Log.i("gdrive-activity/google-play-service-unavailable/existing-user");
                    A02.show();
                    return;
                }
            }
            if (((ActivityC02290Ap) this).A0F.A0F() == null) {
                A1l(false);
                return;
            }
            if (((ActivityC02290Ap) this).A0F.A06() == 3) {
                Log.i("gdrive-activity/create/continue-msgstore-download");
                C000200d.A0c(this, R.id.google_drive_looking_for_backup_view, 8);
                View findViewById = findViewById(R.id.google_drive_restore_view);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                    A1Z();
                    String A0F = ((ActivityC02290Ap) this).A0F.A0F();
                    if (A0F != null) {
                        long A0B = ((ActivityC02290Ap) this).A0F.A0B(A0F);
                        long A0A = ((ActivityC02290Ap) this).A0F.A0A(A0F);
                        Object string = getString(R.string.gdrive_backup_last_modified_date_unavailable);
                        if (A0A > 0) {
                            string = AnonymousClass029.A0U(((ActivityC02310Ar) this).A01, A0A);
                        }
                        if (!((ActivityC02290Ap) this).A0F.A00.getBoolean("gdrive_restore_overwrite_local_files", false)) {
                            string = AnonymousClass029.A0U(((ActivityC02310Ar) this).A01, ((C0DS) this).A0E.A08());
                        }
                        Object A0k = C02180Ae.A0k(((ActivityC02310Ar) this).A01, A0B);
                        if (this.A0E == null) {
                            this.A0E = new C55702m3(A0F, A0A, A0B, ((ActivityC02290Ap) this).A0F.A00.getBoolean("gdrive_restore_overwrite_local_files", false), false, ((ActivityC02290Ap) this).A0F.A00.getBoolean("gdrive_last_restore_file_is_password_protected", false));
                        }
                        TextView textView = (TextView) findViewById(R.id.gdrive_restore_info);
                        if (textView != null) {
                            textView.setText(getString(R.string.gdrive_restore_info, A0F, string, A0k));
                            this.A03.setVisibility(8);
                            A1d();
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            } else if (((ActivityC02290Ap) this).A0F.A03() != 0) {
                Log.i("gdrive-activity/create/msgstore-download-already-finished, restoring");
                C000200d.A0c(this, R.id.google_drive_looking_for_backup_view, 8);
                C000200d.A0c(this, R.id.google_drive_restore_view, 0);
                TextView textView2 = (TextView) findViewById(R.id.gdrive_restore_info);
                if (textView2 != null) {
                    textView2.setText(SettingsChat.A02(this, ((ActivityC02310Ar) this).A01, ((C0DS) this).A0E));
                    ((ActivityC02290Ap) this).A0F.A00.getBoolean("gdrive_last_restore_file_is_password_protected", false);
                    this.A03.setVisibility(8);
                    A1Z();
                    A1k(true);
                    return;
                }
                throw null;
            } else {
                A1b();
                setResult(2);
                return;
            }
        }
        StringBuilder A0P = C000200d.A0P("gdrive-activity/new-intent unexpected action: ");
        A0P.append(intent.getAction());
        Log.e(A0P.toString());
        finish();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str = "one-time-restore";
        this.A0X.A02("one-time-restore");
        C3VI c3vi = this.A0V;
        C2CQ c2cq = this.A0X;
        C03860Hk c03860Hk = this.A0P;
        if (c03860Hk != null) {
            int i = c03860Hk.A00;
            if (i == 3) {
                str = "one-time-restore-jid-mismatch";
            } else if (i == 4) {
                str = "one-time-restore-integrity-check-failed";
            }
        }
        int A02 = AnonymousClass029.A02(this.A0N.A00);
        if (A02 != 0) {
            if (A02 == 1) {
                str = C000200d.A0H(str, "-no-gs");
            } else if (A02 == 2) {
                str = C000200d.A0H(str, "-update-gs");
            } else if (A02 != 3) {
                str = C000200d.A0H(str, "-gs-invalid");
            } else {
                str = C000200d.A0H(str, "-gs-disabled");
            }
        }
        c3vi.A01(this, c2cq, str);
        return true;
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        C55702m3 c55702m3 = this.A0E;
        if (c55702m3 != null) {
            StringBuilder A0P = C000200d.A0P("gdrive-activity/save-state/restore-account-data/ ");
            A0P.append(c55702m3);
            Log.i(A0P.toString());
            C55702m3 c55702m32 = this.A0E;
            synchronized (c55702m32) {
                bundle2 = new Bundle();
                bundle2.putString("account_name", c55702m32.A05);
                bundle2.putLong("total_backup_size", c55702m32.A00);
                bundle2.putLong("last_modified", c55702m32.A04);
                bundle2.putBoolean("overwrite_local_files", c55702m32.A03);
                bundle2.putBoolean("is_download_size_zero", c55702m32.A01);
                bundle2.putBoolean("is_password_protected", c55702m32.A02);
            }
            bundle.putBundle("restore_account_data", bundle2);
        }
        C000200d.A1I(C000200d.A0P("gdrive-activity/save-state/total-download-size/"), this.A01);
        bundle.putLong("total_download_size", this.A01);
        C000200d.A1I(new StringBuilder("gdrive-activity/save-state/media-download-size/"), this.A02);
        bundle.putLong("media_download_size", this.A02);
    }

    @Override // android.app.Activity
    public void setTitle(int i) {
        TextView textView = (TextView) findViewById(R.id.title_toolbar_text);
        if (textView == null) {
            throw null;
        }
        textView.setText(i);
    }
}
