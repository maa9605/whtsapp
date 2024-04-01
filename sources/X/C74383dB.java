package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.3dB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C74383dB extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C74393dC A00;
    public final /* synthetic */ ScheduledFuture A01;
    public final /* synthetic */ boolean A02;

    public C74383dB(C74393dC c74393dC, ScheduledFuture scheduledFuture, boolean z) {
        this.A00 = c74393dC;
        this.A01 = scheduledFuture;
        this.A02 = z;
    }

    public void A00(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
        C74393dC c74393dC = this.A00;
        if (c74393dC.A00 == null) {
            Log.i("voip/weak-wifi/onLost: network callback is already unregistered");
        } else if (c74393dC.A05 == null) {
            throw null;
        } else {
            Voip.notifyLostOfAlternativeNetwork();
        }
    }

    public void A01(ScheduledFuture scheduledFuture, Network network, boolean z) {
        scheduledFuture.cancel(false);
        C74393dC c74393dC = this.A00;
        if (c74393dC.A00 == null) {
            Log.i("voip/weak-wifi/onAvailable: network callback is already unregistered");
        } else if (c74393dC.A02 != null) {
            Log.i("voip/weak-wifi/onAvailable: onAvailable() is called multiple times");
            if (c74393dC.A05 == null) {
                throw null;
            }
            Voip.notifyLostOfAlternativeNetwork();
        } else {
            c74393dC.A02(network, z);
        }
    }

    public void A02(ScheduledFuture scheduledFuture, boolean z) {
        scheduledFuture.cancel(false);
        C74393dC c74393dC = this.A00;
        if (c74393dC.A00 == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        c74393dC.A00 = null;
        c74393dC.A01 = null;
        if (c74393dC.A05 == null) {
            throw null;
        }
        Voip.notifyFailureToCreateAlternativeSocket(z);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        Log.i("voip/weak-wifi/onAvailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A06;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new RunnableC73683c2(this, this.A01, network, this.A02));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        Log.i("voip/weak-wifi/onLost");
        ScheduledExecutorService scheduledExecutorService = this.A00.A06;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new RunnableC73663c0(this, this.A01));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        Log.i("voip/weak-wifi/onUnavailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A06;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new RunnableC73673c1(this, this.A01, this.A02));
        }
    }
}
