package com.facebook.redex;

import X.ActivityC02290Ap;
import X.C000200d;
import X.C2A8;
import X.C41941ul;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape0S0110000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public ViewOnClickEBaseShape0S0110000_I0(Object obj, boolean z, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                if (this.A01) {
                    if (restoreFromBackupActivity.A0M.A03(true) != 1) {
                        Bundle A01 = C000200d.A01("dialog_id", 12);
                        A01.putString("message", restoreFromBackupActivity.getString(R.string.gdrive_messages_restore_succeeded_media_will_be_restored_on_wifi));
                        A01.putBoolean("cancelable", false);
                        A01.putString("positive_button", restoreFromBackupActivity.getString(R.string.ok));
                        A01.putString("negative_button", restoreFromBackupActivity.getString(R.string.gdrive_restore_now));
                        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                        promptDialogFragment.A0P(A01);
                        promptDialogFragment.A14(restoreFromBackupActivity.A0N(), null);
                        return;
                    }
                    Log.i("gdrive-activity/msgstore-download-finish, Wi-Fi available, starting media restore.");
                    restoreFromBackupActivity.A1c();
                    Log.i("gdrive-activity/msgstore-download-finish setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
                    restoreFromBackupActivity.setResult(3);
                    restoreFromBackupActivity.finish();
                    return;
                }
                ((ActivityC02290Ap) restoreFromBackupActivity).A0F.A0T(0);
                ((ActivityC02290Ap) restoreFromBackupActivity).A0F.A0K();
                Log.i("gdrive-activity/msgstore-download-finish no media to restore, setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
                restoreFromBackupActivity.setResult(3);
                restoreFromBackupActivity.finish();
                return;
            case 1:
                GreenAlertActivity greenAlertActivity = (GreenAlertActivity) this.A00;
                boolean z = this.A01;
                int min = Math.min(greenAlertActivity.A0G.A0F(greenAlertActivity.A02.getCurrentItem()) + 1, 2);
                if (min == 2) {
                    C41941ul c41941ul = greenAlertActivity.A0I;
                    if (z) {
                        c41941ul.A01(6);
                    } else {
                        c41941ul.A01(9);
                    }
                    greenAlertActivity.A0J.A03();
                    greenAlertActivity.finish();
                    return;
                }
                greenAlertActivity.A0I.A01(13);
                greenAlertActivity.A1T(min);
                return;
            case 2:
                GreenAlertActivity greenAlertActivity2 = (GreenAlertActivity) this.A00;
                boolean z2 = this.A01;
                C41941ul c41941ul2 = greenAlertActivity2.A0I;
                if (z2) {
                    c41941ul2.A01(14);
                } else {
                    c41941ul2.A01(15);
                }
                int max = Math.max(-1, greenAlertActivity2.A0G.A0F(greenAlertActivity2.A02.getCurrentItem()) - 1);
                if (max < 0) {
                    greenAlertActivity2.A1P();
                } else {
                    greenAlertActivity2.A1T(max);
                }
                int A0F = greenAlertActivity2.A0G.A0F(greenAlertActivity2.A02.getCurrentItem());
                if (A0F == 0) {
                    if (C2A8.A03(greenAlertActivity2.A0J)) {
                        greenAlertActivity2.A08.sendAccessibilityEvent(8);
                        return;
                    }
                    View findViewWithTag = greenAlertActivity2.A02.findViewWithTag(Integer.valueOf(A0F));
                    if (findViewWithTag != null) {
                        findViewWithTag.findViewById(R.id.green_alert_education_title).sendAccessibilityEvent(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
