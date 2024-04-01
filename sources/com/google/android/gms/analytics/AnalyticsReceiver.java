package com.google.android.gms.analytics;

import X.AnonymousClass088;
import X.AnonymousClass176;
import X.C17U;
import X.C17V;
import X.C232015p;
import X.C232615w;
import X.C239718z;
import X.C39851qp;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {
    public C17U A00;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.A00 == null) {
            this.A00 = new C17U();
        }
        C39851qp c39851qp = AnonymousClass176.A00(context).A07;
        AnonymousClass176.A01(c39851qp);
        if (intent == null) {
            c39851qp.A04("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c39851qp.A06("Local AnalyticsReceiver got", action);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            return;
        }
        boolean A00 = C17V.A00(context);
        Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
        intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        synchronized (C17U.A02) {
            context.startService(intent2);
            if (A00) {
                try {
                    if (C17U.A00 == null) {
                        C239718z c239718z = new C239718z(context);
                        C17U.A00 = c239718z;
                        c239718z.A06.setReferenceCounted(false);
                        c239718z.A03 = false;
                    }
                    final C239718z c239718z2 = C17U.A00;
                    c239718z2.A02.incrementAndGet();
                    if (c239718z2.A03) {
                        TextUtils.isEmpty(null);
                    }
                    synchronized (c239718z2.A07) {
                        Map map = c239718z2.A09;
                        if ((!map.isEmpty() || c239718z2.A00 > 0) && !c239718z2.A06.isHeld()) {
                            map.clear();
                            c239718z2.A00 = 0;
                        }
                        if (c239718z2.A03) {
                            Integer[] numArr = (Integer[]) map.get(null);
                            if (numArr == null) {
                                map.put(null, new Integer[]{1});
                                C232015p.A00(c239718z2.A05, AnonymousClass088.A0v(c239718z2.A06), 7, c239718z2.A08, c239718z2.A04, C232615w.A00(c239718z2.A01), 1000L);
                                c239718z2.A00++;
                            } else {
                                numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                            }
                        }
                        if (!c239718z2.A03 && c239718z2.A00 == 0) {
                            C232015p.A00(c239718z2.A05, AnonymousClass088.A0v(c239718z2.A06), 7, c239718z2.A08, c239718z2.A04, C232615w.A00(c239718z2.A01), 1000L);
                            c239718z2.A00++;
                        }
                    }
                    c239718z2.A06.acquire();
                    C239718z.A0A.schedule(new Runnable() { // from class: X.190
                        @Override // java.lang.Runnable
                        public final void run() {
                            C239718z.this.A00();
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                } catch (SecurityException unused) {
                    c39851qp.A04("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
            }
        }
    }
}
