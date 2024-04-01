package com.whatsapp.messaging;

import X.C000200d;
import X.C019208x;
import X.C019308y;
import X.C02E;
import X.C2OO;
import X.C47232Ak;
import android.content.DialogInterface;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.messaging.CaptivePortalActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class CaptivePortalActivity extends C2OO {
    public C02E A00;
    public C47232Ak A01;

    @Override // X.C2OO, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        WifiInfo connectionInfo;
        int length;
        super.onCreate(bundle);
        requestWindowFeature(1);
        final WifiManager A0C = this.A00.A0C();
        if (A0C == null) {
            Log.w("captiveportalactivity/create wm=null");
            connectionInfo = null;
        } else {
            connectionInfo = A0C.getConnectionInfo();
        }
        C019208x c019208x = new C019208x(this);
        C019308y c019308y = c019208x.A01;
        c019308y.A0J = false;
        c019208x.A03(R.string.no_internet_title);
        c019208x.A05(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Lz
            {
                CaptivePortalActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CaptivePortalActivity.this.finish();
            }
        });
        c019208x.A04(R.string.disable_wifi, new DialogInterface.OnClickListener() { // from class: X.3Ly
            {
                CaptivePortalActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CaptivePortalActivity captivePortalActivity = CaptivePortalActivity.this;
                WifiManager wifiManager = A0C;
                Log.i("disable wifi radio");
                if (wifiManager != null) {
                    wifiManager.setWifiEnabled(false);
                }
                captivePortalActivity.finish();
            }
        });
        if (connectionInfo != null) {
            final int networkId = connectionInfo.getNetworkId();
            final String ssid = connectionInfo.getSSID();
            if (ssid != null && (length = ssid.length()) >= 2 && ((ssid.startsWith("\"") || ssid.startsWith("'")) && (ssid.endsWith("\"") || ssid.endsWith("'")))) {
                ssid = ssid.substring(1, length - 1);
            }
            C000200d.A14("wifi network name is ", ssid);
            c019308y.A0E = getString(R.string.wifi_network_blocked_explanation, ssid);
            c019208x.A08(getString(R.string.forget_wifi_network, ssid), new DialogInterface.OnClickListener() { // from class: X.3M0
                {
                    CaptivePortalActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CaptivePortalActivity captivePortalActivity = CaptivePortalActivity.this;
                    WifiManager wifiManager = A0C;
                    int i2 = networkId;
                    String str = ssid;
                    StringBuilder sb = new StringBuilder("forgetting wifi network ");
                    sb.append(i2);
                    sb.append(" named ");
                    sb.append(str);
                    Log.i(sb.toString());
                    if (!wifiManager.removeNetwork(i2)) {
                        StringBuilder sb2 = new StringBuilder("remove network failed for wifi network ");
                        sb2.append(i2);
                        sb2.append(" named ");
                        sb2.append(str);
                        Log.w(sb2.toString());
                    } else if (!wifiManager.saveConfiguration()) {
                        StringBuilder sb3 = new StringBuilder("save configuration failed for wifi network ");
                        sb3.append(i2);
                        sb3.append(" named ");
                        sb3.append(str);
                        Log.w(sb3.toString());
                    }
                    if (!wifiManager.disconnect()) {
                        StringBuilder sb4 = new StringBuilder("failed to disconnect from wifi network ");
                        sb4.append(i2);
                        sb4.append(" named ");
                        sb4.append(str);
                        Log.w(sb4.toString());
                    }
                    captivePortalActivity.finish();
                }
            });
        } else {
            c019208x.A02(R.string.wifi_blocked_explanation);
        }
        Log.i("captive portal dialog created");
        c019208x.A01();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A01.A00.removeMessages(1);
        this.A01.A01();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A01.A00.sendEmptyMessageDelayed(1, 3000L);
    }
}
