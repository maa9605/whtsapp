package com.whatsapp.registration.backuptoken;

import X.AnonymousClass029;
import X.C0C5;
import X.C0KF;
import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class BackupTokenAgentHelper extends BackupAgentHelper {
    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        if (!C0KF.A02()) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/disabled");
        } else if (Build.VERSION.SDK_INT < 28) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/older api version");
        } else if ((backupDataOutput.getTransportFlags() & 1) == 0) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/encryption not enabled");
        } else if (!AnonymousClass029.A1L(((C0C5) AnonymousClass029.A0X(this)).A0e().A00)) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/google play services is not installed");
        } else {
            synchronized (C0KF.A00) {
                Log.i("BackupTokenAgentHelper/onBackup/success");
                super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            }
        }
    }

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper("backup_helper_key", new FileBackupHelper(this, "backup_token"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        if (!C0KF.A02()) {
            Log.i("BackupTokenAgentHelper/onRestore/backup skipped/feature not enabled");
            return;
        }
        synchronized (C0KF.A00) {
            Log.i("BackupTokenAgentHelper/onRestore/success");
            super.onRestore(backupDataInput, i, parcelFileDescriptor);
        }
    }
}
