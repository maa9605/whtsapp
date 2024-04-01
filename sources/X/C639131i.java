package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.31i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C639131i implements InterfaceC470229f {
    public int A00;
    public final /* synthetic */ SettingsGoogleDrive A03;
    public long A02 = -1;
    public long A01 = -1;

    public C639131i(SettingsGoogleDrive settingsGoogleDrive) {
        this.A03 = settingsGoogleDrive;
    }

    public final void A00(int i, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i2) {
        boolean z = false;
        if (i != this.A00) {
            z = true;
            if (i == 4) {
                Log.i("settings-gdrive/set-message/show-indeterminate");
            }
        }
        this.A00 = i;
        C018508q c018508q = ((ActivityC02290Ap) this.A03).A0A;
        c018508q.A02.post(new RunnableC55572lq(this, i, z, str, onClickListener, i2, onClickListener2));
    }

    @Override // X.InterfaceC470229f
    public void AGu(boolean z) {
        Log.e("settings-gdrive-observer/account-deletion-end/unexpected-state");
    }

    @Override // X.InterfaceC470229f
    public void AHk() {
        Log.i("settings-gdrive-observer/backup-cancelled");
        A00(2, null, null, null, -1);
    }

    @Override // X.InterfaceC470229f
    public void AHl(boolean z) {
        C000200d.A1C("settings-gdrive-observer/backup-end ", z);
        A00(2, null, null, null, -1);
        if (z) {
            SettingsGoogleDrive settingsGoogleDrive = this.A03;
            if (settingsGoogleDrive.A0N != null) {
                settingsGoogleDrive.A0O.A02();
            }
        }
    }

    @Override // X.InterfaceC470229f
    public void AHm(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/backup-paused/no-data-connection");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(3, settingsGoogleDrive.getString(R.string.settings_gdrive_error_data_network_not_available_message), settingsGoogleDrive.A00, null, i);
    }

    @Override // X.InterfaceC470229f
    public void AHn(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/backup-paused/low-battery");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(3, settingsGoogleDrive.getString(R.string.settings_gdrive_backup_pending_on_low_battery), settingsGoogleDrive.A00, null, i);
    }

    @Override // X.InterfaceC470229f
    public void AHo(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/backup-paused/sdcard-missing");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(3, settingsGoogleDrive.getString(R.string.gdrive_backup_error_sdcard_missing_summary), settingsGoogleDrive.A00, null, i);
    }

    @Override // X.InterfaceC470229f
    public void AHp(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/backup-paused/sdcard-unmounted");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(3, settingsGoogleDrive.getString(R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_summary), settingsGoogleDrive.A00, null, i);
    }

    @Override // X.InterfaceC470229f
    public void AHq(long j, long j2) {
        int i;
        String string;
        Log.i("settings-gdrive-observer/backup-paused/no-wifi");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        if (settingsGoogleDrive.A0S.A03(true) == 2) {
            string = settingsGoogleDrive.getString(R.string.settings_gdrive_backup_pending_on_wifi_message_cellular_connection_available);
        } else {
            string = settingsGoogleDrive.getString(R.string.settings_gdrive_backup_pending_on_wifi_message_no_data_connection_available);
        }
        A00(3, string, settingsGoogleDrive.A00, null, i);
    }

    @Override // X.InterfaceC470229f
    public void AHr(int i) {
        if (i >= 0) {
            C000700j.A00();
            SettingsGoogleDrive settingsGoogleDrive = this.A03;
            A00(4, settingsGoogleDrive.getString(R.string.settings_gdrive_backup_preparation_message_with_percentage_placeholder, ((ActivityC02310Ar) settingsGoogleDrive).A01.A0H().format(i / 100.0d)), settingsGoogleDrive.A00, null, i);
        }
    }

    @Override // X.InterfaceC470229f
    public void AHs() {
        Log.i("settings-gdrive-observer/backup-prep-start");
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(4, settingsGoogleDrive.getString(R.string.settings_gdrive_backup_preparation_message), settingsGoogleDrive.A00, null, -1);
    }

    @Override // X.InterfaceC470229f
    public void AHt(long j, long j2) {
        if (j2 <= 0) {
            StringBuilder A0S = C000200d.A0S("settings-gdrive-observer/backup-progress incorrect invocation: ", j, "/");
            A0S.append(j2);
            Log.e(A0S.toString());
            return;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        String A0k = C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive).A01, j);
        int i = (int) ((100 * j) / j2);
        if (((int) ((this.A02 * 100) / j2)) == i && C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive).A01, j).equals(C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive).A01, this.A02))) {
            return;
        }
        this.A02 = j;
        A00(3, settingsGoogleDrive.getString(R.string.settings_gdrive_backup_progress_message_with_percentage, A0k, C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive).A01, j2), ((ActivityC02310Ar) settingsGoogleDrive).A01.A0H().format(i / 100.0d)), settingsGoogleDrive.A00, null, i);
    }

    @Override // X.InterfaceC470229f
    public void AHu() {
        Log.i("settings-gdrive-observer/backup-start");
        this.A02 = -1L;
        AHr(0);
    }

    @Override // X.InterfaceC470229f
    public void AK1(int i, Bundle bundle) {
        if (i != 10) {
            A00(2, null, null, null, -1);
        }
        C018508q c018508q = ((ActivityC02290Ap) this.A03).A0A;
        c018508q.A02.post(new RunnableEBaseShape1S0201000_I1(this, i, bundle, 1));
    }

    @Override // X.InterfaceC470229f
    public void AK2(int i, Bundle bundle) {
        if (i != 10) {
            A00(1, null, null, null, -1);
        }
        C018508q c018508q = ((ActivityC02290Ap) this.A03).A0A;
        c018508q.A02.post(new RunnableEBaseShape1S0201000_I1(this, i, bundle, 2));
    }

    @Override // X.InterfaceC470229f
    public void AK3(int i, Bundle bundle) {
        Log.e("settings-gdrive-observer/msgstore-download-error/unexpected-state");
    }

    @Override // X.InterfaceC470229f
    public void ALq() {
        Log.i("settings-gdrive-observer/restore-cancelled");
        C018508q c018508q = ((ActivityC02290Ap) this.A03).A0A;
        c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(this, 3));
        A00(2, null, null, null, -1);
        this.A01 = -1L;
        this.A02 = -1L;
    }

    @Override // X.InterfaceC470229f
    public void ALr(boolean z, long j, long j2) {
        C000200d.A1C("settings-gdrive-observer/restore-end ", z);
        A00(2, null, null, null, -1);
        this.A01 = -1L;
        this.A02 = -1L;
        if (z) {
            SettingsGoogleDrive settingsGoogleDrive = this.A03;
            if (settingsGoogleDrive.A0N != null) {
                settingsGoogleDrive.A0O.A02();
            }
        }
    }

    @Override // X.InterfaceC470229f
    public void ALs(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/no-data-connection");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A00(3, this.A03.getString(R.string.settings_gdrive_restore_media_pending_on_data_network_not_available_message), null, null, i);
    }

    @Override // X.InterfaceC470229f
    public void ALt(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/low-battery");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A00(3, this.A03.getString(R.string.settings_gdrive_restore_media_pending_on_low_battery), null, new ViewOnClickEBaseShape7S0100000_I1(this, 1), i);
    }

    @Override // X.InterfaceC470229f
    public void ALu(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/sdcard-missing");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A00(3, this.A03.getString(R.string.gdrive_restore_error_sdcard_missing_summary), null, null, i);
    }

    @Override // X.InterfaceC470229f
    public void ALv(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/sdcard-unmounted");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A00(3, this.A03.getString(R.string.gdrive_restore_error_sdcard_unmounted_summary), null, null, i);
    }

    @Override // X.InterfaceC470229f
    public void ALw(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/no-wifi");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        ViewOnClickEBaseShape7S0100000_I1 viewOnClickEBaseShape7S0100000_I1 = null;
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        if (settingsGoogleDrive.A0S.A03(true) == 2) {
            Log.i("settings-gdrive-observer/restore-paused/cellular-available");
            viewOnClickEBaseShape7S0100000_I1 = new ViewOnClickEBaseShape7S0100000_I1(this, 0);
        }
        A00(3, settingsGoogleDrive.getString(R.string.settings_gdrive_restore_pending_on_wifi_not_available_message), null, viewOnClickEBaseShape7S0100000_I1, i);
    }

    @Override // X.InterfaceC470229f
    public void ALx(int i) {
        if (i >= 0) {
            SettingsGoogleDrive settingsGoogleDrive = this.A03;
            A00(4, settingsGoogleDrive.getString(R.string.settings_gdrive_restore_media_preparation_message_with_percentage_placeholder, ((ActivityC02310Ar) settingsGoogleDrive).A01.A0H().format(i / 100.0d)), null, null, i);
        }
    }

    @Override // X.InterfaceC470229f
    public void ALy() {
        Log.i("settings-gdrive-observer/restore-start");
        A00(4, this.A03.getString(R.string.settings_gdrive_restore_media_preparation_message), null, null, -1);
    }

    @Override // X.InterfaceC470229f
    public void ALz(long j, long j2, long j3) {
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        String A0k = C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive).A01, j);
        if (A0k.equals(C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive).A01, this.A01))) {
            return;
        }
        this.A01 = j;
        A00(3, settingsGoogleDrive.getString(R.string.settings_gdrive_restore_progress_message_with_percentage, A0k, C02180Ae.A0k(((ActivityC02310Ar) settingsGoogleDrive).A01, j3), ((ActivityC02310Ar) settingsGoogleDrive).A01.A0H().format(j / j3)), null, null, (int) ((j * 100) / j3));
    }

    @Override // X.InterfaceC470229f
    public void AMC(boolean z) {
        Log.e("settings-gdrive-observer/msgstore-download-end/unexpected-state");
    }

    @Override // X.InterfaceC470229f
    public void AMD(long j, long j2) {
        Log.e("settings-gdrive-observer/msgstore-download-progress/unexpected-state");
        StringBuilder sb = new StringBuilder("settings-gdrive-observer/msgstore-download-progress/downloaded: ");
        sb.append(j);
        sb.append(" total: ");
        C000200d.A1I(sb, j2);
    }

    @Override // X.InterfaceC470229f
    public void AME() {
        Log.e("settings-gdrive-observer/msgstore-download-start/unexpected-state");
    }

    @Override // X.InterfaceC470229f
    public void AOM() {
        Log.i("settings-gdrive-observer/post-backup-scrub-start");
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(4, settingsGoogleDrive.getString(R.string.settings_gdrive_backup_finishing_message), settingsGoogleDrive.A00, null, -1);
    }

    @Override // X.InterfaceC470229f
    public void AQ8() {
        C018508q c018508q = ((ActivityC02290Ap) this.A03).A0A;
        c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(this, 2));
    }
}
