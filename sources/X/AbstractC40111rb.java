package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1rb */
/* loaded from: classes2.dex */
public abstract class AbstractC40111rb {
    public boolean A00() {
        if (this instanceof C47642Ca) {
            RestoreFromBackupActivity restoreFromBackupActivity = ((C47642Ca) this).A00;
            if (restoreFromBackupActivity.A0p.get()) {
                Log.i("gdrive-activity/one-time-setup-task/cancelled");
                return false;
            }
            return restoreFromBackupActivity.A0F.A0M.A00();
        } else if (this instanceof C47652Cb) {
            return GoogleBackupService.A00(((C47652Cb) this).A00);
        } else {
            if (this instanceof C47662Cc) {
                GoogleBackupService googleBackupService = ((C47662Cc) this).A00;
                return googleBackupService.A0B.A0Z.get() && GoogleBackupService.A00(googleBackupService) && googleBackupService.A0B.A0Z.get();
            } else if (!(this instanceof C47672Cd)) {
                return ((C2CZ) this).A00.A09();
            } else {
                GoogleBackupService googleBackupService2 = ((C47672Cd) this).A00;
                return googleBackupService2.A0B.A0Y.get() && GoogleBackupService.A00(googleBackupService2) && googleBackupService2.A0B.A0Y.get();
            }
        }
    }
}
