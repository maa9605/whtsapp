package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Process;

/* renamed from: X.0Tb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06420Tb extends C0TX {
    public static final int A05 = Process.myUid();
    public int A00;
    public final ConnectivityManager A03;
    public final long[] A04 = new long[8];
    public boolean A02 = true;
    public BroadcastReceiver A01 = new BroadcastReceiver() { // from class: X.0Tc
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int type;
            C06420Tb c06420Tb = C06420Tb.this;
            NetworkInfo activeNetworkInfo = c06420Tb.A03.getActiveNetworkInfo();
            if (activeNetworkInfo == null || (type = activeNetworkInfo.getType()) == c06420Tb.A00) {
                return;
            }
            c06420Tb.A02();
            c06420Tb.A00 = type;
        }
    };

    @Override // X.C0TX
    public boolean A00() {
        return false;
    }

    public C06420Tb(Context context) {
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.A03 = connectivityManager;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        this.A00 = activeNetworkInfo == null ? -1 : activeNetworkInfo.getType();
        context.registerReceiver(this.A01, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        A02();
    }

    @Override // X.C0TX
    public synchronized boolean A01(long[] jArr) {
        if (this.A02) {
            A02();
            System.arraycopy(this.A04, 0, jArr, 0, jArr.length);
            return true;
        }
        return false;
    }

    public synchronized void A02() {
        int i = A05;
        long uidTxBytes = TrafficStats.getUidTxBytes(i);
        long uidRxBytes = TrafficStats.getUidRxBytes(i);
        if (uidRxBytes != -1 && uidTxBytes != -1) {
            char c = this.A00 == 1 ? (char) 0 : (char) 2;
            long[] jArr = this.A04;
            long j = jArr[3] + jArr[1];
            long j2 = jArr[2] + jArr[0];
            int i2 = c | 1;
            jArr[i2] = (uidTxBytes - j) + jArr[i2];
            int i3 = c | 0;
            jArr[i3] = (uidRxBytes - j2) + jArr[i3];
            return;
        }
        this.A02 = false;
    }
}
