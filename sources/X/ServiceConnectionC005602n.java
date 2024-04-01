package X;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.02n */
/* loaded from: classes.dex */
public class ServiceConnectionC005602n implements ServiceConnection, Handler.Callback {
    public final Context A01;
    public final Handler A02;
    public final HandlerThread A03;
    public final Map A04 = new HashMap();
    public Set A00 = new HashSet();

    public ServiceConnectionC005602n(Context context) {
        this.A01 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.A03 = handlerThread;
        handlerThread.start();
        this.A02 = new Handler(this.A03.getLooper(), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0059, code lost:
        if (r7.A03 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(X.C12790k4 r7) {
        /*
            r6 = this;
            java.lang.String r3 = "NotifManCompat"
            r4 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r4)
            if (r0 == 0) goto L2e
            java.lang.String r0 = "Processing component "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            android.content.ComponentName r0 = r7.A04
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.util.ArrayDeque r0 = r7.A02
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " queued tasks"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r3, r0)
        L2e:
            java.util.ArrayDeque r0 = r7.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L37
            return
        L37:
            boolean r0 = r7.A03
            if (r0 != 0) goto L5b
            java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            android.content.ComponentName r5 = r7.A04
            android.content.Intent r2 = r0.setComponent(r5)
            android.content.Context r1 = r6.A01
            r0 = 33
            boolean r0 = r1.bindService(r2, r6, r0)
            r7.A03 = r0
            if (r0 == 0) goto L63
            r0 = 0
            r7.A00 = r0
        L57:
            boolean r0 = r7.A03
            if (r0 == 0) goto L5f
        L5b:
            android.support.v4.app.INotificationSideChannel r0 = r7.A01
            if (r0 != 0) goto L77
        L5f:
            r6.A01(r7)
            return
        L63:
            java.lang.String r0 = "Unable to bind to listener "
            java.lang.StringBuilder r0 = X.C000200d.A0P(r0)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            r1.unbindService(r6)
            goto L57
        L77:
            java.util.ArrayDeque r0 = r7.A02
            java.lang.Object r2 = r0.peek()
            X.02m r2 = (X.InterfaceC005502m) r2
            if (r2 == 0) goto Ld2
            boolean r0 = android.util.Log.isLoggable(r3, r4)     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            if (r0 == 0) goto L9b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            r1.<init>()     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            java.lang.String r0 = "Sending task "
            r1.append(r0)     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            r1.append(r2)     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            java.lang.String r0 = r1.toString()     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            android.util.Log.d(r3, r0)     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
        L9b:
            android.support.v4.app.INotificationSideChannel r0 = r7.A01     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            r2.ASN(r0)     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            java.util.ArrayDeque r0 = r7.A02     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            r0.remove()     // Catch: android.os.DeadObjectException -> La6 android.os.RemoteException -> Lbf
            goto L77
        La6:
            boolean r0 = android.util.Log.isLoggable(r3, r4)
            if (r0 == 0) goto Ld2
            java.lang.String r0 = "Remote service has died: "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            android.content.ComponentName r0 = r7.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r3, r0)
            goto Ld2
        Lbf:
            r2 = move-exception
            java.lang.String r0 = "RemoteException communicating with "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            android.content.ComponentName r0 = r7.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0, r2)
        Ld2:
            java.util.ArrayDeque r0 = r7.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ldd
            r6.A01(r7)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ServiceConnectionC005602n.A00(X.0k4):void");
    }

    public final void A01(C12790k4 c12790k4) {
        Handler handler = this.A02;
        ComponentName componentName = c12790k4.A04;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c12790k4.A00 + 1;
        c12790k4.A00 = i;
        if (i > 6) {
            StringBuilder A0P = C000200d.A0P("Giving up on delivering ");
            A0P.append(c12790k4.A02.size());
            A0P.append(" tasks to ");
            A0P.append(componentName);
            A0P.append(" after ");
            A0P.append(c12790k4.A00);
            A0P.append(" retries");
            Log.w("NotifManCompat", A0P.toString());
            c12790k4.A02.clear();
            return;
        }
        int i2 = (1 << (i - 1)) * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        if (Log.isLoggable("NotifManCompat", 3)) {
            StringBuilder sb = new StringBuilder("Scheduling retry for ");
            sb.append(i2);
            sb.append(" ms");
            Log.d("NotifManCompat", sb.toString());
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i2);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Set set;
        INotificationSideChannel iNotificationSideChannel;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    C12790k4 c12790k4 = (C12790k4) this.A04.get(message.obj);
                    if (c12790k4 != null) {
                        A00(c12790k4);
                    }
                    return true;
                }
                C12790k4 c12790k42 = (C12790k4) this.A04.get(message.obj);
                if (c12790k42 != null) {
                    if (c12790k42.A03) {
                        this.A01.unbindService(this);
                        c12790k42.A03 = false;
                    }
                    c12790k42.A01 = null;
                }
                return true;
            }
            C12780k3 c12780k3 = (C12780k3) message.obj;
            ComponentName componentName = c12780k3.A00;
            IBinder iBinder = c12780k3.A01;
            C12790k4 c12790k43 = (C12790k4) this.A04.get(componentName);
            if (c12790k43 != null) {
                if (iBinder == null) {
                    iNotificationSideChannel = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof INotificationSideChannel)) {
                        iNotificationSideChannel = (INotificationSideChannel) queryLocalInterface;
                    } else {
                        iNotificationSideChannel = new INotificationSideChannel(iBinder) { // from class: X.1RV
                            public IBinder A00;

                            {
                                this.A00 = iBinder;
                            }

                            @Override // android.support.v4.app.INotificationSideChannel
                            public void A60(String str, int i2, String str2) {
                                Parcel obtain = Parcel.obtain();
                                try {
                                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                                    obtain.writeString(str);
                                    obtain.writeInt(i2);
                                    obtain.writeString(str2);
                                    this.A00.transact(2, obtain, null, 1);
                                } finally {
                                    obtain.recycle();
                                }
                            }

                            @Override // android.support.v4.app.INotificationSideChannel
                            public void AGn(String str, int i2, String str2, Notification notification) {
                                Parcel obtain = Parcel.obtain();
                                try {
                                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                                    obtain.writeString(str);
                                    obtain.writeInt(i2);
                                    obtain.writeString(str2);
                                    if (notification == null) {
                                        obtain.writeInt(0);
                                    } else {
                                        obtain.writeInt(1);
                                        notification.writeToParcel(obtain, 0);
                                    }
                                    this.A00.transact(1, obtain, null, 1);
                                } finally {
                                    obtain.recycle();
                                }
                            }

                            @Override // android.os.IInterface
                            public IBinder asBinder() {
                                return this.A00;
                            }
                        };
                    }
                }
                c12790k43.A01 = iNotificationSideChannel;
                c12790k43.A00 = 0;
                A00(c12790k43);
            }
            return true;
        }
        Object obj = message.obj;
        Context context = this.A01;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (C005202i.A05) {
            if (string != null) {
                if (!string.equals(C005202i.A03)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    C005202i.A04 = hashSet;
                    C005202i.A03 = string;
                }
            }
            set = C005202i.A04;
        }
        if (!set.equals(this.A00)) {
            this.A00 = set;
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (set.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        StringBuilder sb = new StringBuilder("Permission present on component ");
                        sb.append(componentName2);
                        sb.append(", not adding listener record.");
                        Log.w("NotifManCompat", sb.toString());
                    } else {
                        hashSet2.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                Map map = this.A04;
                if (!map.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb2 = new StringBuilder("Adding listener record for ");
                        sb2.append(componentName3);
                        Log.d("NotifManCompat", sb2.toString());
                    }
                    map.put(componentName3, new C12790k4(componentName3));
                }
            }
            Iterator it2 = this.A04.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet2.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder A0P = C000200d.A0P("Removing listener record for ");
                        A0P.append(entry.getKey());
                        Log.d("NotifManCompat", A0P.toString());
                    }
                    C12790k4 c12790k44 = (C12790k4) entry.getValue();
                    if (c12790k44.A03) {
                        context.unbindService(this);
                        c12790k44.A03 = false;
                    }
                    c12790k44.A01 = null;
                    it2.remove();
                }
            }
        }
        for (C12790k4 c12790k45 : this.A04.values()) {
            c12790k45.A02.add(obj);
            A00(c12790k45);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            StringBuilder sb = new StringBuilder("Connected to service ");
            sb.append(componentName);
            Log.d("NotifManCompat", sb.toString());
        }
        this.A02.obtainMessage(1, new C12780k3(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            StringBuilder sb = new StringBuilder("Disconnected from service ");
            sb.append(componentName);
            Log.d("NotifManCompat", sb.toString());
        }
        this.A02.obtainMessage(2, componentName).sendToTarget();
    }
}
