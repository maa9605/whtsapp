package X;

import android.content.BroadcastReceiver;

/* renamed from: X.1CB  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CB extends BroadcastReceiver {
    public C1CC A00;

    public C1CB(C1CC c1cc) {
        this.A00 = c1cc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1 == false) goto L18;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            X.1CC r0 = r3.A00
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r1 = r0.A00()
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L20
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L20
            boolean r1 = r0.isConnected()
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L24
            return
        L24:
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()
            if (r0 == 0) goto L31
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Connectivity changed. Starting background sync."
            android.util.Log.d(r1, r0)
        L31:
            X.1CC r2 = r3.A00
            r0 = 0
            com.google.firebase.iid.FirebaseInstanceId.A02(r2, r0)
            X.1CC r0 = r3.A00
            android.content.Context r0 = r0.A00()
            r0.unregisterReceiver(r3)
            r0 = 0
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CB.onReceive(android.content.Context, android.content.Intent):void");
    }
}
