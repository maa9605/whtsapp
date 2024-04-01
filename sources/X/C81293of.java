package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.3of  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81293of implements C2CU {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C0B5 A01;
    public final /* synthetic */ C000400f A02;
    public final /* synthetic */ C02F A03;
    public final /* synthetic */ C002301c A04;
    public final /* synthetic */ C42171vH A05;
    public final /* synthetic */ C0EG A06;
    public final /* synthetic */ Runnable A07;

    public C81293of(Activity activity, C002301c c002301c, C42171vH c42171vH, C0EG c0eg, C0B5 c0b5, Runnable runnable, C000400f c000400f, C02F c02f) {
        this.A00 = activity;
        this.A04 = c002301c;
        this.A05 = c42171vH;
        this.A06 = c0eg;
        this.A01 = c0b5;
        this.A07 = runnable;
        this.A02 = c000400f;
        this.A03 = c02f;
    }

    @Override // X.C2CU
    public void AH0(int i) {
        String obj;
        A01(this);
        Activity activity = this.A00;
        C002701i.A18(activity, 600);
        SettingsChat.A0W = null;
        if (i == 3) {
            C03460Fu.A06(activity.getApplicationContext());
            byte[] A0C = C02A.A0C(16);
            byte[] A0F = C03460Fu.A0F(A0C);
            if (A0F != null) {
                this.A06.A0U(A0F, A0C, null);
                this.A01.AUj(R.string.msg_store_backup_failed_try_again_later);
                Log.w("settings/backup/failed/missing-or-mismatch");
                return;
            }
            this.A01.AUj(R.string.msg_store_backup_failed);
            Log.w("settings/backup/failed/null");
        } else if (i == 0) {
            this.A07.run();
        } else if (i == 2) {
            C0B5 c0b5 = this.A01;
            if (C000400f.A01()) {
                StringBuilder sb = new StringBuilder();
                sb.append(activity.getString(R.string.msg_store_backup_failed_out_of_space));
                sb.append(" ");
                sb.append(activity.getString(R.string.remove_files_from_sd_card));
                obj = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(activity.getString(R.string.msg_store_backup_failed_out_of_space_shared_storage));
                sb2.append(" ");
                sb2.append(activity.getString(R.string.remove_files_from_shared_storage));
                obj = sb2.toString();
            }
            c0b5.AUm(obj);
        } else if (i == 1) {
            this.A01.AUj(R.string.msg_store_backup_failed);
            Log.w("settings/backup/failed/null");
        } else if (this.A03.A06()) {
        } else {
            Log.i("settings/backup/failed/missing-permissions");
            this.A01.AUj(R.string.msg_store_backup_failed);
        }
    }

    @Override // X.C2CU
    public void AHx() {
        C002701i.A19(this.A00, 600);
    }

    @Override // X.C2CU
    public void ANR(int i) {
        ProgressDialogC06500To progressDialogC06500To = SettingsChat.A0W;
        if (progressDialogC06500To != null) {
            progressDialogC06500To.setMessage(this.A00.getString(R.string.settings_backup_db_now_message_with_progress_percentage_placeholder, this.A04.A0H().format(i / 100.0d)));
        }
        if (i % 10 == 0) {
            Log.i(String.format(Locale.ENGLISH, "settings/backup/msgstore/progress/%d%%", Integer.valueOf(i)));
        } else {
            String.format(Locale.ENGLISH, "settings/backup/msgstore/progress/%d%%", Integer.valueOf(i));
        }
    }
}
