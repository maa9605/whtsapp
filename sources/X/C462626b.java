package X;

import android.app.ActivityManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.DeadObjectException;
import android.os.Debug;
import com.whatsapp.util.Log;

/* renamed from: X.26b */
/* loaded from: classes2.dex */
public class C462626b {
    public static volatile C462626b A01;
    public final C02E A00;

    public C462626b(C02E c02e) {
        this.A00 = c02e;
    }

    public static C462626b A00() {
        if (A01 == null) {
            synchronized (C462626b.class) {
                if (A01 == null) {
                    A01 = new C462626b(C02E.A00());
                }
            }
        }
        return A01;
    }

    public void A01() {
        NetworkInfo[] networkInfoArr;
        ConnectivityManager A0B = this.A00.A0B();
        if (A0B == null) {
            Log.w("app/log-network-info cm=null");
            return;
        }
        try {
            networkInfoArr = A0B.getAllNetworkInfo();
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof DeadObjectException)) {
                throw e;
            }
            networkInfoArr = null;
        }
        StringBuilder sb = new StringBuilder("network/info");
        if (networkInfoArr != null) {
            boolean z = false;
            for (NetworkInfo networkInfo : networkInfoArr) {
                if (networkInfo.getState() != NetworkInfo.State.UNKNOWN) {
                    sb.append("\n");
                    sb.append(networkInfo.toString());
                    sb.append(", type: ");
                    sb.append(networkInfo.getType());
                    sb.append(", subtype: ");
                    sb.append(networkInfo.getSubtype());
                    z = true;
                }
            }
            if (z) {
                Log.i(sb.toString());
                return;
            } else {
                Log.i("app/log-network-info/all_network_states_unknown");
                return;
            }
        }
        Log.e("app/log-network-info/unavailable");
    }

    public void A02() {
        C000700j.A00();
        ActivityManager A012 = this.A00.A01();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (A012 == null) {
            Log.w("device/memory am=null");
        } else {
            A012.getMemoryInfo(memoryInfo);
            StringBuilder sb = new StringBuilder("device/memory/system/available ");
            sb.append(memoryInfo.availMem / 1024);
            sb.append(" kiB (");
            sb.append(memoryInfo.threshold / 1024);
            sb.append(" kiB) lowMemory=");
            C000200d.A1V(sb, memoryInfo.lowMemory);
        }
        long freeMemory = Runtime.getRuntime().freeMemory();
        long j = Runtime.getRuntime().totalMemory();
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        long maxMemory = Runtime.getRuntime().maxMemory();
        StringBuilder A0P = C000200d.A0P("device/memory/max ");
        A0P.append(maxMemory / 1024);
        A0P.append(" kiB (~");
        A0P.append(C0JO.A00);
        A0P.append(" memory class)");
        Log.i(A0P.toString());
        StringBuilder sb2 = new StringBuilder("device/memory/native/size ");
        sb2.append((nativeHeapFreeSize + nativeHeapAllocatedSize) / 1024);
        sb2.append(" kiB/allocated ");
        sb2.append(nativeHeapAllocatedSize / 1024);
        sb2.append(" kiB/free ");
        sb2.append(nativeHeapFreeSize / 1024);
        sb2.append(" kiB");
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder("device/memory/dalvik/size ");
        sb3.append(j / 1024);
        sb3.append(" kiB/allocated ");
        sb3.append((j - freeMemory) / 1024);
        sb3.append(" kiB/free ");
        sb3.append(freeMemory / 1024);
        sb3.append(" kiB");
        Log.i(sb3.toString());
    }
}
