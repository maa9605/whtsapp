package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2ln  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC55542ln extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C68183Ij A03;

    public /* synthetic */ RunnableC55542ln(C68183Ij c68183Ij, int i, long j, long j2) {
        this.A03 = c68183Ij;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C68183Ij c68183Ij = this.A03;
        int i = this.A00;
        long j = this.A01;
        long j2 = this.A02;
        RestoreFromBackupActivity restoreFromBackupActivity = c68183Ij.A01;
        if (!C40061rW.A0G(restoreFromBackupActivity)) {
            restoreFromBackupActivity.A05.setIndeterminate(false);
            restoreFromBackupActivity.A05.setProgress(i);
            restoreFromBackupActivity.A07.setText(restoreFromBackupActivity.getString(R.string.settings_gdrive_restore_progress_message_with_percentage, C02180Ae.A0k(((ActivityC02310Ar) restoreFromBackupActivity).A01, j), C02180Ae.A0k(((ActivityC02310Ar) restoreFromBackupActivity).A01, j2), ((ActivityC02310Ar) restoreFromBackupActivity).A01.A0H().format(i / 100.0d)));
            return;
        }
        Log.i("gdrive-activity-observer/msgstore-download-progress/activity-already-exited");
    }
}
