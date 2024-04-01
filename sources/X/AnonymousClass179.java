package X;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: X.179  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass179 implements ServiceConnection {
    public volatile C17Q A00;
    public volatile boolean A01;
    public final /* synthetic */ C39771qh A02;

    public AnonymousClass179(C39771qh c39771qh) {
        this.A02 = c39771qh;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: all -> 0x0082, TryCatch #3 {, blocks: (B:6:0x000f, B:7:0x0012, B:29:0x007d, B:30:0x0080, B:5:0x0008, B:10:0x0015, B:12:0x0021, B:14:0x0029, B:16:0x0031, B:21:0x004b, B:23:0x004f, B:24:0x0069, B:25:0x006c, B:27:0x0078, B:28:0x007c, B:19:0x0042, B:15:0x002c, B:17:0x0039), top: B:43:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[Catch: IllegalArgumentException -> 0x007d, all -> 0x0082, TryCatch #3 {, blocks: (B:6:0x000f, B:7:0x0012, B:29:0x007d, B:30:0x0080, B:5:0x0008, B:10:0x0015, B:12:0x0021, B:14:0x0029, B:16:0x0031, B:21:0x004b, B:23:0x004f, B:24:0x0069, B:25:0x006c, B:27:0x0078, B:28:0x007c, B:19:0x0042, B:15:0x002c, B:17:0x0039), top: B:43:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[Catch: IllegalArgumentException -> 0x007d, all -> 0x0082, TRY_LEAVE, TryCatch #3 {, blocks: (B:6:0x000f, B:7:0x0012, B:29:0x007d, B:30:0x0080, B:5:0x0008, B:10:0x0015, B:12:0x0021, B:14:0x0029, B:16:0x0031, B:21:0x004b, B:23:0x004f, B:24:0x0069, B:25:0x006c, B:27:0x0078, B:28:0x007c, B:19:0x0042, B:15:0x002c, B:17:0x0039), top: B:43:0x0006 }] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceConnected(android.content.ComponentName r6, android.os.IBinder r7) {
        /*
            r5 = this;
            java.lang.String r0 = "AnalyticsServiceConnection.onServiceConnected"
            X.C07K.A1S(r0)
            monitor-enter(r5)
            if (r7 != 0) goto L14
            X.1qh r1 = r5.A02     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "Service connected with null binder"
            r1.A05(r0)     // Catch: java.lang.Throwable -> L82
            r5.notifyAll()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            return
        L14:
            r4 = 0
            java.lang.String r2 = r7.getInterfaceDescriptor()     // Catch: android.os.RemoteException -> L41 java.lang.Throwable -> L82
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r0 = r1.equals(r2)     // Catch: android.os.RemoteException -> L41 java.lang.Throwable -> L82
            if (r0 == 0) goto L39
            android.os.IInterface r2 = r7.queryLocalInterface(r1)     // Catch: android.os.RemoteException -> L41 java.lang.Throwable -> L82
            boolean r0 = r2 instanceof X.C17Q     // Catch: android.os.RemoteException -> L41 java.lang.Throwable -> L82
            if (r0 == 0) goto L2c
            X.17Q r2 = (X.C17Q) r2     // Catch: android.os.RemoteException -> L41 java.lang.Throwable -> L82
            goto L31
        L2c:
            X.1cU r2 = new X.1cU     // Catch: android.os.RemoteException -> L41 java.lang.Throwable -> L82
            r2.<init>(r7)     // Catch: android.os.RemoteException -> L41 java.lang.Throwable -> L82
        L31:
            X.1qh r3 = r5.A02     // Catch: android.os.RemoteException -> L42 java.lang.Throwable -> L82
            java.lang.String r0 = "Bound to IAnalyticsService interface"
            r3.A03(r0)     // Catch: android.os.RemoteException -> L42 java.lang.Throwable -> L82
            goto L49
        L39:
            X.1qh r3 = r5.A02     // Catch: android.os.RemoteException -> L41 java.lang.Throwable -> L82
            java.lang.String r0 = "Got binder with a wrong descriptor"
            r3.A09(r0, r2)     // Catch: android.os.RemoteException -> L41 java.lang.Throwable -> L82
            goto L6c
        L41:
            r2 = r4
        L42:
            X.1qh r3 = r5.A02     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "Service connect failed to get IAnalyticsService"
            r3.A05(r0)     // Catch: java.lang.Throwable -> L82
        L49:
            if (r2 == 0) goto L6c
            boolean r0 = r5.A01     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L69
            java.lang.String r0 = "onServiceConnected received after the timeout limit"
            r3.A04(r0)     // Catch: java.lang.Throwable -> L82
            X.176 r0 = r3.A00     // Catch: java.lang.Throwable -> L82
            X.13H r0 = r0.A02     // Catch: java.lang.Throwable -> L82
            X.C07K.A1P(r0)     // Catch: java.lang.Throwable -> L82
            X.17A r1 = new X.17A     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
            X.C07K.A1P(r1)     // Catch: java.lang.Throwable -> L82
            X.13E r0 = r0.A02     // Catch: java.lang.Throwable -> L82
            r0.submit(r1)     // Catch: java.lang.Throwable -> L82
            goto L7d
        L69:
            r5.A00 = r2     // Catch: java.lang.Throwable -> L82
            goto L7d
        L6c:
            X.15n r2 = X.C231815n.A00()     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
            X.176 r0 = r3.A00     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
            android.content.Context r1 = r0.A00     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
            X.179 r0 = r3.A01     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
            if (r2 == 0) goto L7c
            r1.unbindService(r0)     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
            goto L7d
        L7c:
            throw r4     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.Throwable -> L82
        L7d:
            r5.notifyAll()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            return
        L82:
            r0 = move-exception
            r5.notifyAll()     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass179.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(final ComponentName componentName) {
        C07K.A1S("AnalyticsServiceConnection.onServiceDisconnected");
        C13H c13h = ((AnonymousClass174) this.A02).A00.A02;
        C07K.A1P(c13h);
        Runnable runnable = new Runnable() { // from class: X.17B
            @Override // java.lang.Runnable
            public final void run() {
                C39771qh c39771qh = AnonymousClass179.this.A02;
                ComponentName componentName2 = componentName;
                if (c39771qh != null) {
                    C13H.A00();
                    if (c39771qh.A00 != null) {
                        c39771qh.A00 = null;
                        c39771qh.A06("Disconnected from device AnalyticsService", componentName2);
                        C39761qg c39761qg = ((AnonymousClass174) c39771qh).A00.A04;
                        AnonymousClass176.A01(c39761qg);
                        c39761qg.A0C();
                        C13H.A00();
                        C39801qk c39801qk = c39761qg.A00;
                        C13H.A00();
                        c39801qk.A0C();
                        c39801qk.A03("Service disconnected");
                        return;
                    }
                    return;
                }
                throw null;
            }
        };
        C07K.A1P(runnable);
        c13h.A02.submit(runnable);
    }
}
