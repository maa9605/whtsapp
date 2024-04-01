package com.facebook.redex;

import X.C2J9;
import X.C54452il;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.SettingsDataUsageActivity;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape0S1100000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public ViewOnClickEBaseShape0S1100000_I0(Object obj, String str, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                restoreFromBackupActivity.A0b.AS1(new RunnableEBaseShape0S1100000_I0(restoreFromBackupActivity, this.A01, 2));
                return;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity2 = (RestoreFromBackupActivity) this.A00;
                restoreFromBackupActivity2.A0b.AS1(new RunnableEBaseShape0S1100000_I0(restoreFromBackupActivity2, this.A01, 0));
                return;
            case 2:
                SettingsGoogleDrive settingsGoogleDrive = (SettingsGoogleDrive) this.A00;
                settingsGoogleDrive.A0Y.AS1(new RunnableEBaseShape0S1100000_I0(settingsGoogleDrive, this.A01, 8));
                return;
            case 3:
                C54452il c54452il = (C54452il) this.A00;
                String str = this.A01;
                UserJid userJid = c54452il.A08;
                if (userJid != null) {
                    UserJid userJid2 = c54452il.A02;
                    if (userJid2 != null) {
                        ((C2J9) c54452il).A01.AUh(ChangeNumberNotificationDialogFragment.A00(userJid, userJid2, str));
                        return;
                    }
                    throw null;
                }
                throw null;
            case 4:
                ((SettingsDataUsageActivity) this.A00).A1U(this.A01);
                return;
            case 5:
                Activity activity = (Activity) this.A00;
                String str2 = this.A01;
                activity.finish();
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                return;
            default:
                return;
        }
    }
}
