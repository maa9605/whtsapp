package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;

/* renamed from: X.17V */
/* loaded from: classes.dex */
public final class C17V {
    public static Boolean A02;
    public final Context A00;
    public final Handler A01;

    public C17V(Context context) {
        C07K.A1P(context);
        this.A00 = context;
        this.A01 = new HandlerC235317c();
    }

    public static boolean A00(Context context) {
        C07K.A1P(context);
        Boolean bool = A02;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    z = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        A02 = Boolean.valueOf(z);
        return z;
    }

    public final void A01(Intent intent, int i) {
        try {
            synchronized (C17U.A02) {
                C239718z c239718z = C17U.A00;
                if (c239718z != null && c239718z.A06.isHeld()) {
                    if (c239718z.A02.decrementAndGet() < 0) {
                        Log.e("WakeLock", String.valueOf(c239718z.A08).concat(" release without a matched acquire!"));
                    }
                    if (c239718z.A03) {
                        TextUtils.isEmpty(null);
                    }
                    synchronized (c239718z.A07) {
                        if (c239718z.A03) {
                            Map map = c239718z.A09;
                            Integer[] numArr = (Integer[]) map.get(null);
                            if (numArr != null) {
                                int intValue = numArr[0].intValue();
                                if (intValue == 1) {
                                    map.remove(null);
                                    C232015p.A00(c239718z.A05, AnonymousClass088.A0v(c239718z.A06), 8, c239718z.A08, c239718z.A04, C232615w.A00(c239718z.A01), 0L);
                                    c239718z.A00--;
                                } else {
                                    numArr[0] = Integer.valueOf(intValue - 1);
                                }
                            }
                        }
                        if (!c239718z.A03 && c239718z.A00 == 1) {
                            C232015p.A00(c239718z.A05, AnonymousClass088.A0v(c239718z.A06), 8, c239718z.A08, c239718z.A04, C232615w.A00(c239718z.A01), 0L);
                            c239718z.A00--;
                        }
                    }
                    c239718z.A00();
                }
            }
        } catch (SecurityException unused) {
        }
        C39851qp c39851qp = AnonymousClass176.A00(this.A00).A07;
        AnonymousClass176.A01(c39851qp);
        if (intent == null) {
            c39851qp.A04("AnalyticsService started with null intent");
            return;
        }
        String action = intent.getAction();
        c39851qp.A02(2, "Local AnalyticsService called. startId, action", Integer.valueOf(i), action, null);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            A02(new Runnable(this, i, c39851qp) { // from class: X.17W
                public final int A00;
                public final C39851qp A01;
                public final C17V A02;

                {
                    this.A02 = this;
                    this.A00 = i;
                    this.A01 = c39851qp;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17V c17v = this.A02;
                    int i2 = this.A00;
                    C39851qp c39851qp2 = this.A01;
                    if (((C17Y) c17v.A00).A5s(i2)) {
                        c39851qp2.A03("Local AnalyticsService processed last dispatch request");
                    }
                }
            });
        }
    }

    public final void A02(final Runnable runnable) {
        C39761qg c39761qg = AnonymousClass176.A00(this.A00).A04;
        AnonymousClass176.A01(c39761qg);
        C17K c17k = new C17K() { // from class: X.1cV
            {
                C17V.this = this;
            }

            @Override // X.C17K
            public final void AWy(Throwable th) {
                C17V.this.A01.post(runnable);
            }
        };
        c39761qg.A0C();
        C13H c13h = ((AnonymousClass174) c39761qg).A00.A02;
        C07K.A1P(c13h);
        AnonymousClass173 anonymousClass173 = new AnonymousClass173(c39761qg, c17k);
        C07K.A1P(anonymousClass173);
        c13h.A02.submit(anonymousClass173);
    }
}
