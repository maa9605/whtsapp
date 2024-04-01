package X;

import android.net.ConnectivityManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3dA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC74373dA extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C74393dC A00;
    public final /* synthetic */ boolean A01;

    public RunnableC74373dA(C74393dC c74393dC, boolean z) {
        this.A00 = c74393dC;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        C74393dC c74393dC = this.A00;
        ConnectivityManager.NetworkCallback networkCallback = c74393dC.A00;
        if (networkCallback == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        c74393dC.A04.unregisterNetworkCallback(networkCallback);
        c74393dC.A00 = null;
        c74393dC.A01 = null;
        C74363d9 c74363d9 = c74393dC.A05;
        boolean z = this.A01;
        if (c74363d9 == null) {
            throw null;
        }
        Voip.notifyFailureToCreateAlternativeSocket(z);
    }
}
