package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.15n  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C231815n {
    public static final Object A00 = new Object();
    public static volatile C231815n A01;

    public static C231815n A00() {
        if (A01 == null) {
            synchronized (A00) {
                if (A01 == null) {
                    A01 = new C231815n();
                }
            }
        }
        return A01;
    }

    public static final boolean A01(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((C06080Rl.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
