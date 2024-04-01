package com.facebook.redex;

import X.ActivityC02310Ar;
import X.C000200d;
import X.C000400f;
import X.C02180Ae;
import X.C40061rW;
import X.C55702m3;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape0S1200000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public ViewOnClickEBaseShape0S1200000_I0(Object obj, String str, Object obj2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                ((GoogleDriveNewUserSetupActivity) this.A00).A1c(this.A02, (RadioButton) this.A01);
                return;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                String str = this.A02;
                C55702m3 c55702m3 = (C55702m3) this.A01;
                if (restoreFromBackupActivity.A0L.A02() < restoreFromBackupActivity.A01) {
                    StringBuilder A0P = C000200d.A0P("gdrive-activity/show-restore insufficient storage, available: ");
                    A0P.append(restoreFromBackupActivity.A0L.A02());
                    A0P.append(" required: ");
                    C000200d.A1I(A0P, restoreFromBackupActivity.A01);
                    boolean A01 = C000400f.A01();
                    int i = R.string.gdrive_insufficient_shared_storage_message;
                    if (A01) {
                        i = R.string.gdrive_insufficient_sdcard_storage_message;
                    }
                    String string = restoreFromBackupActivity.getString(i, C02180Ae.A0k(((ActivityC02310Ar) restoreFromBackupActivity).A01, restoreFromBackupActivity.A01));
                    Bundle A012 = C000200d.A01("dialog_id", 13);
                    A012.putString("title", restoreFromBackupActivity.getString(R.string.gdrive_insufficient_sdcard_storage_title));
                    A012.putString("message", string);
                    A012.putString("positive_button", restoreFromBackupActivity.getString(R.string.btn_storage_settings));
                    A012.putString("neutral_button", restoreFromBackupActivity.getString(R.string.ok));
                    PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                    promptDialogFragment.A0P(A012);
                    promptDialogFragment.A14(restoreFromBackupActivity.A0N(), null);
                    return;
                }
                StringBuilder A0P2 = C000200d.A0P("gdrive-activity/show-restore starting restore from ");
                A0P2.append(C40061rW.A0B(str));
                Log.i(A0P2.toString());
                Log.i("gdrive-activity/show-restore/stopping-approx-transfer-size-calc-thread");
                restoreFromBackupActivity.A0o.set(true);
                restoreFromBackupActivity.A1j(c55702m3);
                return;
            default:
                return;
        }
    }
}
