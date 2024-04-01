package X;

import android.content.Context;

/* renamed from: X.17z  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC237617z {
    public Object A00;
    public final Context A02;
    public final String A05;
    public final String A06;
    public final Object A03 = new Object();
    public boolean A01 = false;
    public final String A04 = "FaceNativeHandle";

    public AbstractC237617z(Context context) {
        this.A02 = context;
        StringBuilder sb = new StringBuilder("face".length() + 39);
        sb.append("com.google.android.gms.vision.dynamite");
        sb.append(".");
        sb.append("face");
        this.A05 = sb.toString();
        this.A06 = "com.google.android.gms.vision.dynamite";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000a, B:15:0x002f, B:20:0x0042, B:22:0x0046, B:24:0x004a, B:25:0x0054, B:26:0x0056, B:29:0x005a, B:31:0x005e, B:10:0x0015, B:11:0x001c, B:13:0x0028, B:19:0x003b), top: B:36:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000a, B:15:0x002f, B:20:0x0042, B:22:0x0046, B:24:0x004a, B:25:0x0054, B:26:0x0056, B:29:0x005a, B:31:0x005e, B:10:0x0015, B:11:0x001c, B:13:0x0028, B:19:0x003b), top: B:36:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A00() {
        /*
            r6 = this;
            java.lang.Object r3 = r6.A03
            monitor-enter(r3)
            java.lang.Object r0 = r6.A00     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
            return r0
        L9:
            r5 = 0
            android.content.Context r2 = r6.A02     // Catch: X.C16A -> L15 android.os.RemoteException -> L38 java.lang.Throwable -> L67
            X.16D r1 = X.C16F.A07     // Catch: X.C16A -> L15 android.os.RemoteException -> L38 java.lang.Throwable -> L67
            java.lang.String r0 = r6.A05     // Catch: X.C16A -> L15 android.os.RemoteException -> L38 java.lang.Throwable -> L67
            X.16F r5 = X.C16F.A01(r2, r1, r0)     // Catch: X.C16A -> L15 android.os.RemoteException -> L38 java.lang.Throwable -> L67
            goto L2d
        L15:
            java.lang.String r4 = r6.A04     // Catch: android.os.RemoteException -> L38 X.C16A -> L3a java.lang.Throwable -> L67
            java.lang.String r0 = "Cannot load feature, fall back to load whole module."
            android.util.Log.d(r4, r0)     // Catch: android.os.RemoteException -> L38 X.C16A -> L3a java.lang.Throwable -> L67
            android.content.Context r2 = r6.A02     // Catch: X.C16A -> L27 android.os.RemoteException -> L38 java.lang.Throwable -> L67
            X.16D r1 = X.C16F.A07     // Catch: X.C16A -> L27 android.os.RemoteException -> L38 java.lang.Throwable -> L67
            java.lang.String r0 = "com.google.android.gms.vision.dynamite"
            X.16F r5 = X.C16F.A01(r2, r1, r0)     // Catch: X.C16A -> L27 android.os.RemoteException -> L38 java.lang.Throwable -> L67
            goto L2d
        L27:
            r1 = move-exception
            java.lang.String r0 = "Error Loading module"
            android.util.Log.e(r4, r0, r1)     // Catch: android.os.RemoteException -> L38 X.C16A -> L3a java.lang.Throwable -> L67
        L2d:
            if (r5 == 0) goto L42
            android.content.Context r0 = r6.A02     // Catch: android.os.RemoteException -> L38 X.C16A -> L3a java.lang.Throwable -> L67
            java.lang.Object r0 = r6.A01(r5, r0)     // Catch: android.os.RemoteException -> L38 X.C16A -> L3a java.lang.Throwable -> L67
            r6.A00 = r0     // Catch: android.os.RemoteException -> L38 X.C16A -> L3a java.lang.Throwable -> L67
            goto L42
        L38:
            r2 = move-exception
            goto L3b
        L3a:
            r2 = move-exception
        L3b:
            java.lang.String r1 = r6.A04     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error creating remote native handle"
            android.util.Log.e(r1, r0, r2)     // Catch: java.lang.Throwable -> L67
        L42:
            boolean r1 = r6.A01     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L58
            java.lang.Object r0 = r6.A00     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L58
            java.lang.String r1 = r6.A04     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Native handle not yet available. Reverting to no-op handle."
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L67
            r0 = 1
            r6.A01 = r0     // Catch: java.lang.Throwable -> L67
        L54:
            java.lang.Object r0 = r6.A00     // Catch: java.lang.Throwable -> L67
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
            goto L66
        L58:
            if (r1 == 0) goto L54
            java.lang.Object r0 = r6.A00     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L54
            java.lang.String r1 = r6.A04     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Native handle is now available."
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L67
            goto L54
        L66:
            return r0
        L67:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC237617z.A00():java.lang.Object");
    }

    public abstract Object A01(C16F c16f, Context context);
}
