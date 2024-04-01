package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.00h */
/* loaded from: classes.dex */
public class C000500h {
    public static final String A04 = C000200d.A0L(new StringBuilder(), C02M.A02, "_light");
    public static volatile C000500h A05;
    public final SharedPreferences A00;
    public final C02N A01;
    public final Object A02 = new Object();
    public final Object A03 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:66:0x0392 A[LOOP:1: B:64:0x038c->B:66:0x0392, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03b1 A[LOOP:2: B:68:0x03ab->B:70:0x03b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03cb A[LOOP:3: B:72:0x03c5->B:74:0x03cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x042b A[LOOP:4: B:77:0x0425->B:79:0x042b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x051c A[LOOP:5: B:82:0x0516->B:84:0x051c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C000500h(X.C02N r16, X.C001200o r17, X.C02O r18) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C000500h.<init>(X.02N, X.00o, X.02O):void");
    }

    public static C000500h A00() {
        if (A05 == null) {
            synchronized (C000500h.class) {
                if (A05 == null) {
                    A05 = new C000500h(new C02N(), C001200o.A01, C02O.A00());
                }
            }
        }
        return A05;
    }

    public static List A01() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0FK("security_notifications", 1));
        arrayList.add(new C0FK("input_enter_send", 1));
        arrayList.add(new C0FK("interface_font_size", 2));
        arrayList.add(new C0FK("settings_language", 2));
        arrayList.add(new C0FK("conversation_sound", 1));
        arrayList.add(new C0FK("autodownload_wifi_mask", 0));
        arrayList.add(new C0FK("autodownload_cellular_mask", 0));
        arrayList.add(new C0FK("autodownload_roaming_mask", 0));
        arrayList.add(new C0FK("voip_low_data_usage", 1));
        return arrayList;
    }

    public static final List A02(String str, SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : sharedPreferences.getAll().keySet()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public int A03() {
        try {
            return Integer.parseInt(this.A00.getString("interface_gdrive_backup_frequency", String.valueOf(0)));
        } catch (NumberFormatException e) {
            Log.e("wa-shared-preferences/get-backup-freq", e);
            return 0;
        }
    }

    public int A04() {
        try {
            return Integer.parseInt(this.A00.getString("interface_gdrive_backup_network_setting", String.valueOf(0)));
        } catch (NumberFormatException e) {
            Log.w("wa-shared-preferences/get-backup-network-settings", e);
            return 0;
        }
    }

    public int A05() {
        return this.A00.getInt("gdrive_error_code", 10);
    }

    public int A06() {
        return this.A00.getInt("gdrive_state", 0);
    }

    public int A07() {
        return this.A00.getInt("night_mode", Build.VERSION.SDK_INT >= 29 ? -1 : 1);
    }

    public int A08() {
        int i = this.A00.getInt("reg_attempts_generate_code", 0) + 1;
        C000200d.A0g(this, "reg_attempts_generate_code", i);
        return i;
    }

    public long A09() {
        return this.A00.getLong("tos_v2_accepted_time", 0L);
    }

    public long A0A(String str) {
        if (str == null) {
            Log.w("wa-shared-preferences/get-backup-timestamp accountName passed is null.");
            return 0L;
        }
        SharedPreferences sharedPreferences = this.A00;
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_timestamp:");
        sb.append(str);
        long j = sharedPreferences.getLong(sb.toString(), 0L);
        if (j == 0) {
            j = sharedPreferences.getLong("gdrive_last_successful_backup_timestamp", 0L);
            if (j != 0) {
                A0V(str, j);
                sharedPreferences.edit().remove("gdrive_last_successful_backup_timestamp").apply();
            }
        }
        return j;
    }

    public long A0B(String str) {
        SharedPreferences sharedPreferences = this.A00;
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        return sharedPreferences.getLong(sb.toString(), -1L);
    }

    public long A0C(String str) {
        if (this.A01 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C000200d.A0h(this, str, currentTimeMillis);
            return currentTimeMillis;
        }
        throw null;
    }

    public final SharedPreferences.Editor A0D() {
        return this.A00.edit();
    }

    public Integer A0E() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences.getBoolean("need_to_get_groups", false)) {
            return 3;
        }
        if (sharedPreferences.contains("get_groups_params")) {
            return Integer.valueOf(sharedPreferences.getInt("get_groups_params", 0));
        }
        return null;
    }

    public String A0F() {
        return this.A00.getString("gdrive_account_name", null);
    }

    public String A0G() {
        String string = this.A00.getString("perf_device_id", null);
        if (string == null) {
            String obj = UUID.randomUUID().toString();
            C000200d.A0i(this, "perf_device_id", obj);
            return obj;
        }
        return string;
    }

    public String A0H() {
        return this.A00.getString("cc", "");
    }

    public String A0I() {
        return this.A00.getString("registration_jid", null);
    }

    public String A0J() {
        return this.A00.getString("ph", "");
    }

    public void A0K() {
        this.A00.edit().remove("gdrive_already_downloaded_bytes").remove("gdrive_restore_overwrite_local_files").remove("gdrive_restore_start_timestamp").remove("gdrive_media_restore_network_setting").remove("gdrive_approx_media_download_size").apply();
    }

    public void A0L() {
        Log.i("wa-shared-preferences/cleangcmregsettings");
        this.A00.edit().remove("c2dm_reg_id").remove("c2dm_app_vers").remove("saved_gcm_token_server_unreg").apply();
    }

    public void A0M() {
        this.A00.edit().remove("pref_fail_too_many").remove("pref_no_route_sms").remove("pref_no_route_voice").remove("pref_fail_too_many_attempts").remove("pref_fail_too_many_guesses").apply();
    }

    public void A0N() {
        SharedPreferences sharedPreferences = this.A00;
        sharedPreferences.edit().putInt("joinable_call_education_shown_count", sharedPreferences.getInt("joinable_call_education_shown_count", 0) + 1).apply();
    }

    public void A0O() {
        this.A00.edit().remove("business_activity_report_expiration_timestamp").remove("business_activity_report_size").remove("business_activity_report_name").remove("business_activity_report_url").remove("business_activity_report_timestamp").remove("business_activity_report_state").apply();
    }

    public void A0P() {
        this.A00.edit().remove("gdpr_report_expiration_timestamp").remove("gdpr_report_timestamp").remove("gdpr_report_state").apply();
    }

    public void A0Q() {
        this.A00.edit().putString("gdrive_media_restore_network_setting", String.valueOf(1)).apply();
    }

    public void A0R(int i) {
        this.A00.edit().putInt("external_dir_migration_stage", i).commit();
    }

    public void A0S(int i) {
        StringBuilder sb = new StringBuilder("wa-shared-preferences/getgroupsparams ");
        sb.append(i);
        Log.i(sb.toString());
        this.A00.edit().remove("need_to_get_groups").putInt("get_groups_params", i).apply();
    }

    public void A0T(int i) {
        StringBuilder sb = new StringBuilder("wa-shared-preferences/set-gdrive-state/");
        sb.append(i);
        Log.i(sb.toString());
        this.A00.edit().putInt("gdrive_state", i).apply();
    }

    public void A0U(long j) {
        StringBuilder A0S = C000200d.A0S("wa-shared-prefs/save-gdrive-user-prompt-again-timestamp/", j, " ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        A0S.append(simpleDateFormat.format(calendar.getTime()));
        Log.i(A0S.toString());
        this.A00.edit().putLong("gdrive_next_prompt_for_setup_timestamp", j).apply();
    }

    public void A0V(String str, long j) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("wa-shared-preferences/set-backup-timestamp last successful backup timestamp is set to ");
            sb.append(j);
            sb.append(" but accountName associated is null, ignoring.");
            Log.e(sb.toString());
            return;
        }
        SharedPreferences.Editor edit = this.A00.edit();
        StringBuilder sb2 = new StringBuilder("gdrive_last_successful_backup_timestamp:");
        sb2.append(str);
        edit.putLong(sb2.toString(), j).apply();
    }

    public void A0W(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-total-backup-size account name is null");
            return;
        }
        SharedPreferences.Editor edit = this.A00.edit();
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        edit.putLong(sb.toString(), j).apply();
    }

    public void A0X(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-video-size account name is null");
            return;
        }
        SharedPreferences.Editor edit = this.A00.edit();
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_video_size:");
        sb.append(str);
        edit.putLong(sb.toString(), j).apply();
    }

    public void A0Y(String str, long j) {
        SharedPreferences.Editor edit = this.A00.edit();
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("|");
            sb.append(j);
            edit.putString("mms_authority_override", sb.toString());
        } else {
            edit.remove("mms_authority_override");
        }
        edit.apply();
    }

    public void A0Z(String str, String str2) {
        SharedPreferences.Editor edit = this.A00.edit();
        if (str == null) {
            edit.remove("my_current_status");
            edit.remove("my_current_status_hash");
        } else {
            edit.putString("my_current_status", str);
            if (TextUtils.isEmpty(str2)) {
                edit.remove("my_current_status_hash");
            } else {
                edit.putString("my_current_status_hash", str2);
            }
        }
        edit.apply();
    }

    public void A0a(String str, String str2) {
        SharedPreferences.Editor edit = this.A00.edit();
        StringBuilder sb = new StringBuilder("downloadable_category_local_info_json_");
        sb.append(str);
        edit.putString(sb.toString(), str2).apply();
    }

    public void A0b(String str, String str2) {
        this.A00.edit().putString("cc", str).putString("ph", str2).apply();
    }

    public void A0c(String str, String str2, long j, long j2, long j3, long j4) {
        SharedPreferences sharedPreferences = this.A00;
        sharedPreferences.edit().putString("registration_wipe_type", str).putString("registration_wipe_token", str2).putLong("registration_wipe_wait", j).putLong("registration_wipe_expiry", j2).putLong("registration_wipe_server_time", j3).apply();
        sharedPreferences.edit().putLong("registration_wipe_info_timestamp", j4).apply();
    }

    public void A0d(boolean z) {
        SharedPreferences.Editor remove = this.A00.edit().remove("external_dir_migration_attempt_n").remove("ext_dir_migration_rescan_time").remove("ext_dir_migration_move_time").remove("ext_dir_migration_start_time");
        if (!z) {
            remove.remove("external_dir_migration_stage");
        }
        remove.commit();
    }

    public void A0e(boolean z) {
        C000200d.A1C("wa-shared-prefs/setshouldgetprekeydigest/", z);
        synchronized (this.A02) {
            this.A00.edit().putBoolean("need_to_get_pre_key_digest", z).apply();
        }
    }

    public void A0f(boolean z) {
        SharedPreferences.Editor edit = this.A00.edit();
        if (z) {
            edit.putBoolean("show_post_reg_logged_out_dialog", true);
        } else {
            edit.remove("show_post_reg_logged_out_dialog");
        }
        edit.apply();
    }

    public void A0g(boolean z) {
        SharedPreferences.Editor edit = this.A00.edit();
        if (z) {
            edit.putBoolean("show_pre_reg_do_not_share_code_warning", true);
        } else {
            edit.remove("show_pre_reg_do_not_share_code_warning");
        }
        edit.apply();
    }

    public void A0h(boolean z) {
        C000200d.A1C("wa-shared-prefs/setsignalprotocolstoreisnew/", z);
        synchronized (this.A03) {
            this.A00.edit().putBoolean("signal_protocol_store_is_new", z).apply();
        }
    }

    public void A0i(boolean z, long j) {
        SharedPreferences sharedPreferences = this.A00;
        sharedPreferences.edit().putBoolean("spam_banned", z).apply();
        sharedPreferences.edit().putLong("spam_banned_expiry_timestamp", j).apply();
    }

    public void A0j(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00.edit().putBoolean("pref_fail_too_many", z).putBoolean("pref_no_route_sms", z2).putBoolean("pref_no_route_voice", z3).putBoolean("pref_fail_too_many_attempts", z4).putBoolean("pref_fail_too_many_guesses", z5).apply();
    }

    public boolean A0k() {
        return this.A00.getBoolean("companion_reg_opt_in_enabled", false);
    }

    public boolean A0l() {
        return this.A00.getBoolean("notify_new_message_for_archived_chats", false);
    }

    public boolean A0m() {
        return this.A00.getBoolean("read_receipts_enabled", true);
    }

    public boolean A0n() {
        boolean z;
        synchronized (this.A03) {
            z = this.A00.getBoolean("signal_protocol_store_is_new", false);
        }
        return z;
    }

    public boolean A0o(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4) {
            C000200d.A0p("wa-shared-preferences/set-backup-freq/", i);
            return false;
        }
        this.A00.edit().putString("interface_gdrive_backup_frequency", String.valueOf(i)).apply();
        return true;
    }

    public boolean A0p(long j, String str) {
        long j2 = this.A00.getLong(str, -1L);
        if (j2 == -1) {
            return true;
        }
        if (this.A01 != null) {
            return System.currentTimeMillis() > j2 + j;
        }
        throw null;
    }
}
