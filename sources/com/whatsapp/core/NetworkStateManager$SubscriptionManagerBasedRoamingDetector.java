package com.whatsapp.core;

import X.C02E;
import android.telephony.SubscriptionManager;
import android.util.Pair;

/* loaded from: classes.dex */
public class NetworkStateManager$SubscriptionManagerBasedRoamingDetector {
    public static Pair determineNetworkStateUsingSubscriptionManager(C02E c02e, boolean z) {
        int defaultDataSubscriptionId;
        SubscriptionManager A0F = c02e.A0F();
        if (A0F != null && (defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId()) != -1) {
            boolean isNetworkRoaming = A0F.isNetworkRoaming(defaultDataSubscriptionId);
            Boolean bool = Boolean.TRUE;
            if (isNetworkRoaming) {
                return new Pair(bool, 3);
            }
            return new Pair(bool, 2);
        }
        return new Pair(Boolean.FALSE, 0);
    }
}
