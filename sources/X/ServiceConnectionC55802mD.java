package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.2mD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ServiceConnectionC55802mD implements ServiceConnection {
    public final /* synthetic */ SettingsGoogleDrive A00;

    public ServiceConnectionC55802mD(SettingsGoogleDrive settingsGoogleDrive) {
        this.A00 = settingsGoogleDrive;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        settingsGoogleDrive.A0N = ((BinderC52972bg) iBinder).A00;
        C470129e c470129e = settingsGoogleDrive.A0O;
        if (!c470129e.A0A) {
            c470129e.A02();
        }
        settingsGoogleDrive.A0Y.AS1(new RunnableEBaseShape8S0100000_I1_0(this, 4));
        settingsGoogleDrive.A0c.open();
        settingsGoogleDrive.A1T();
        Log.i("settings-gdrive/service-connected");
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        settingsGoogleDrive.A0N = null;
        settingsGoogleDrive.A0c.close();
        Log.i("settings-gdrive/service-disconnected");
    }
}
