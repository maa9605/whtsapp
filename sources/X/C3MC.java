package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;

/* renamed from: X.3MC  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3MC extends ConnectivityManager.NetworkCallback {
    public volatile Network A00;
    public final /* synthetic */ C22N A01;

    public C3MC(C22N c22n) {
        this.A01 = c22n;
    }

    public final void A00(Network network) {
        if (this.A00 != null) {
            if (network == null || network.equals(this.A00)) {
                this.A00 = null;
                this.A01.A01(false, -1L, false, false);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        StringBuilder sb = new StringBuilder("xmpp/handler/network/network-callback onAvailable:");
        sb.append(network);
        sb.append(" handle:");
        sb.append(network.getNetworkHandle());
        Log.i(sb.toString());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        StringBuilder sb = new StringBuilder("xmpp/handler/network/network-callback onBlockedStatusChanged network:");
        sb.append(network);
        sb.append(" blocked:");
        sb.append(z);
        sb.append(" handle:");
        sb.append(network.getNetworkHandle());
        Log.i(sb.toString());
        if (z) {
            A00(network);
            return;
        }
        this.A00 = network;
        C22N c22n = this.A01;
        c22n.A01(true, network.getNetworkHandle(), c22n.A02(network), false);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        StringBuilder sb = new StringBuilder("xmpp/handler/network/network-callback onLost:");
        sb.append(network);
        Log.i(sb.toString());
        A00(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        Log.i("xmpp/handler/network/network-callback onUnavailable");
        A00(null);
    }
}
