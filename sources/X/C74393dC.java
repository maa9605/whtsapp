package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.MultiNetworkCallback;
import com.whatsapp.voipcalling.Voip;
import java.net.DatagramSocket;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3dC */
/* loaded from: classes2.dex */
public class C74393dC {
    public ConnectivityManager.NetworkCallback A00;
    public Network A01;
    public DatagramSocket A02;
    public boolean A03;
    public final ConnectivityManager A04;
    public final C74363d9 A05;
    public final ScheduledExecutorService A06;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3d9] */
    public C74393dC(ConnectivityManager connectivityManager) {
        ?? r1 = new Object() { // from class: X.3d9
        };
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A04 = connectivityManager;
        this.A05 = r1;
        this.A06 = newSingleThreadScheduledExecutor;
        this.A03 = false;
    }

    public /* synthetic */ void A00() {
        C000700j.A08(this.A03, "provider must not have already shutdown");
        if (!this.A03) {
            Log.e("voip/weak-wifi/shutdown: provider is already shutdown");
            return;
        }
        A03(true);
        Voip.nativeUnregisterMultiNetworkCallback();
        this.A03 = false;
    }

    public /* synthetic */ void A01() {
        C000700j.A08(!this.A03, "provider must not have already started");
        if (this.A03) {
            Log.e("voip/weak-wifi/startup: provider is already started");
            return;
        }
        Voip.nativeRegisterMultiNetworkCallback(new MultiNetworkCallback(this));
        this.A03 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(android.net.Network r7, boolean r8) {
        /*
            r6 = this;
            java.net.DatagramSocket r0 = r6.A02
            r4 = 0
            r3 = 1
            r1 = 0
            if (r0 != 0) goto L8
            r1 = 1
        L8:
            java.lang.String r0 = "alternative socket must not have created"
            X.C000700j.A08(r1, r0)
            java.net.DatagramSocket r0 = r6.A02
            r5 = 0
            if (r0 == 0) goto L20
            java.lang.String r0 = "voip/weak-wifi/alt-sock: socket already created"
            com.whatsapp.util.Log.i(r0)
            X.3d9 r0 = r6.A05
            if (r0 == 0) goto L1f
            com.whatsapp.voipcalling.Voip.notifyFailureToCreateAlternativeSocket(r8)
            return
        L1f:
            throw r5
        L20:
            r0 = 15
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch: java.io.IOException -> L34 java.net.SocketException -> L3a
            r6.A01 = r7     // Catch: java.io.IOException -> L34 java.net.SocketException -> L3a
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.io.IOException -> L34 java.net.SocketException -> L3a
            r1.<init>()     // Catch: java.io.IOException -> L34 java.net.SocketException -> L3a
            r6.A02 = r1     // Catch: java.io.IOException -> L34 java.net.SocketException -> L3a
            android.net.Network r0 = r6.A01     // Catch: java.io.IOException -> L34 java.net.SocketException -> L3a
            r0.bindSocket(r1)     // Catch: java.io.IOException -> L34 java.net.SocketException -> L3a
            goto L40
        L34:
            java.lang.String r0 = "voip/weak-wifi/create-sock: io exception to bind socket to alternative network."
            com.whatsapp.util.Log.e(r0)
            goto L41
        L3a:
            java.lang.String r0 = "voip/weak-wifi/create-sock: socket exception to create alternative socket."
            com.whatsapp.util.Log.e(r0)
            goto L41
        L40:
            r4 = 1
        L41:
            java.net.DatagramSocket r2 = r6.A02
            if (r2 == 0) goto Lb8
            if (r4 == 0) goto Lb8
            java.lang.String r0 = "1.1.1.1"
            java.net.InetAddress r1 = r7.getByName(r0)     // Catch: java.net.UnknownHostException -> L6a
            r0 = 53
            r2.connect(r1, r0)     // Catch: java.net.UnknownHostException -> L6a
            java.net.DatagramSocket r0 = r6.A02     // Catch: java.net.UnknownHostException -> L6a
            java.net.InetAddress r1 = r0.getLocalAddress()     // Catch: java.net.UnknownHostException -> L6a
            boolean r0 = r1.isAnyLocalAddress()     // Catch: java.net.UnknownHostException -> L6a
            if (r0 != 0) goto L63
            java.lang.String r4 = r1.getHostAddress()     // Catch: java.net.UnknownHostException -> L6a
            goto L64
        L63:
            r4 = r5
        L64:
            java.net.DatagramSocket r0 = r6.A02     // Catch: java.net.UnknownHostException -> L6b
            r0.disconnect()     // Catch: java.net.UnknownHostException -> L6b
            goto L70
        L6a:
            r4 = r5
        L6b:
            java.lang.String r0 = "voip/weak-wifi/create-sock: unknown host exception to retrieve local ip."
            com.whatsapp.util.Log.e(r0)
        L70:
            java.net.DatagramSocket r0 = r6.A02
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.fromDatagramSocket(r0)
            int r3 = r0.detachFd()
            java.net.DatagramSocket r0 = r6.A02
            int r2 = r0.getLocalPort()
            java.lang.String r0 = "voip/weak-wifi/create-sock: ip="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = "; port="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; fd="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; test_network_cond = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            X.3d9 r0 = r6.A05
            if (r0 == 0) goto Lb7
            if (r8 == 0) goto Lb3
            com.whatsapp.voipcalling.Voip.startTestNetworkConditionWithAlternativeSocket(r3, r4, r2)
            return
        Lb3:
            com.whatsapp.voipcalling.Voip.switchNetworkWithAlternativeSocket(r3, r4, r2)
            return
        Lb7:
            throw r5
        Lb8:
            r6.A03(r3)
            X.3d9 r0 = r6.A05
            if (r0 == 0) goto Lc3
            com.whatsapp.voipcalling.Voip.notifyFailureToCreateAlternativeSocket(r8)
            return
        Lc3:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74393dC.A02(android.net.Network, boolean):void");
    }

    public final void A03(boolean z) {
        if (this.A02 != null) {
            Log.i("voip/weak-wifi/close-sock");
            this.A02.close();
            this.A02 = null;
        }
        if (z) {
            ConnectivityManager.NetworkCallback networkCallback = this.A00;
            if (networkCallback != null) {
                try {
                    this.A04.unregisterNetworkCallback(networkCallback);
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: succeeded.");
                } catch (IllegalArgumentException unused) {
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: failed.");
                }
                this.A00 = null;
            }
            this.A01 = null;
        }
    }

    public /* synthetic */ void A04(boolean z) {
        if (!this.A03) {
            Log.i("voip/weak-wifi/closeAlternativeSocket: provider is not running");
        } else {
            A03(z);
        }
    }

    public /* synthetic */ void A05(boolean z, boolean z2) {
        if (!this.A03) {
            Log.i("voip/weak-wifi/createAlternativeSocket: provider is not running");
        } else if (this.A01 != null) {
            StringBuilder A0P = C000200d.A0P("voip/weak-wifi/re-use-alt-network: ");
            A0P.append(z ? "cellular" : "wifi");
            A0P.append("; test_network_cond=");
            C000200d.A1N(A0P, z2 ? "true" : "false");
            if (this.A02 != null) {
                Log.i("voip/weak-wifi/create-alt-sock: previously created sock was not closed");
                if (this.A05 != null) {
                    Voip.notifyFailureToCreateAlternativeSocket(z2);
                    return;
                }
                throw null;
            }
            A02(this.A01, z2);
        } else {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            if (z) {
                builder.addTransportType(0);
                Log.i("voip/weak-wifi/alt-network: cellular");
            } else {
                builder.addTransportType(1);
                Log.i("voip/weak-wifi/alt-network: wifi");
            }
            builder.addCapability(12);
            this.A00 = new C74383dB(this, this.A06.schedule(new RunnableC74373dA(this, z2), 5000L, TimeUnit.MILLISECONDS), z2);
            if (Build.VERSION.SDK_INT >= 26) {
                this.A04.requestNetwork(builder.build(), this.A00, 5000);
            } else {
                this.A04.requestNetwork(builder.build(), this.A00);
            }
        }
    }
}
