package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.1CK  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CK implements ServiceConnection {
    public C1CI A00;
    public boolean A01;
    public final Context A02;
    public final Intent A03;
    public final Queue A04;
    public final ScheduledExecutorService A05;

    public C1CK(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC232715y("Firebase-FirebaseInstanceIdServiceConnection"));
        this.A04 = new ArrayDeque();
        this.A01 = false;
        this.A02 = context.getApplicationContext();
        this.A03 = new Intent(str).setPackage(this.A02.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }

    public final synchronized void A00() {
        Queue queue;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "flush queue called");
        }
        while (true) {
            queue = this.A04;
            if (queue.isEmpty()) {
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "found intent to be delivered");
            }
            C1CI c1ci = this.A00;
            if (c1ci == null || !c1ci.isBinderAlive()) {
                break;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
            }
            final C1CG c1cg = (C1CG) queue.poll();
            final C1CI c1ci2 = this.A00;
            if (Binder.getCallingUid() == Process.myUid()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "service received new intent via bind strategy");
                }
                C1CE c1ce = c1ci2.A00;
                if (c1ce.A03(c1cg.A02)) {
                    c1cg.A00();
                } else {
                    if (Log.isLoggable("EnhancedIntentService", 3)) {
                        Log.d("EnhancedIntentService", "intent being queued for bg execution");
                    }
                    c1ce.A04.execute(new Runnable() { // from class: X.1CH
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (Log.isLoggable("EnhancedIntentService", 3)) {
                                Log.d("EnhancedIntentService", "bg processing of the intent starting now");
                            }
                            C1CE c1ce2 = C1CI.this.A00;
                            C1CG c1cg2 = c1cg;
                            c1ce2.A02(c1cg2.A02);
                            c1cg2.A00();
                        }
                    });
                }
            } else {
                throw new SecurityException("Binding only allowed within app");
            }
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            boolean z = this.A01 ? false : true;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(z);
            Log.d("EnhancedIntentService", sb.toString());
        }
        if (!this.A01) {
            this.A01 = true;
            try {
                C231815n.A00();
            } catch (SecurityException e) {
                Log.e("EnhancedIntentService", "Exception while binding the service", e);
            }
            if (C231815n.A01(this.A02, this.A03, this, 65)) {
                return;
            }
            Log.e("EnhancedIntentService", "binding to the service failed");
            this.A01 = false;
            while (!queue.isEmpty()) {
                ((C1CG) queue.poll()).A00();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        this.A01 = false;
        if (!(iBinder instanceof C1CI)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("EnhancedIntentService", sb2.toString());
            while (true) {
                Queue queue = this.A04;
                if (queue.isEmpty()) {
                    return;
                }
                ((C1CG) queue.poll()).A00();
            }
        } else {
            this.A00 = (C1CI) iBinder;
            A00();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        A00();
    }
}
