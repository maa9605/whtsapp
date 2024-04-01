package X;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1tz */
/* loaded from: classes2.dex */
public class C41481tz {
    public static final String[] A05 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public static volatile C41481tz A06;
    public boolean A00;
    public final C02L A01;
    public final C02E A02;
    public final AnonymousClass012 A03;
    public final C000500h A04;

    public C41481tz(AnonymousClass012 anonymousClass012, C02L c02l, C02E c02e, C000500h c000500h) {
        this.A03 = anonymousClass012;
        this.A01 = c02l;
        this.A02 = c02e;
        this.A04 = c000500h;
    }

    public static C41481tz A01() {
        if (A06 == null) {
            synchronized (C41481tz.class) {
                if (A06 == null) {
                    A06 = new C41481tz(AnonymousClass012.A00(), C02L.A00(), C02E.A00(), C000500h.A00());
                }
            }
        }
        return A06;
    }

    public static void A02(Context context) {
        String str = C0FH.A05;
        C0K2.A03 = null;
        C0K2.A0D = str;
        Context applicationContext = context.getApplicationContext();
        C0K2.A02 = applicationContext;
        String packageName = applicationContext.getPackageName();
        if (!"com.instagram.android".equals(packageName) && !"com.instagram.android.preload".equals(packageName)) {
            if (!"com.whatsapp".equals(packageName) && !"com.whatsapp.w4b".equals(packageName)) {
                if ("com.expresswifi.customer".equals(packageName)) {
                    C0K2.A0C = C0K2.A09;
                }
            } else {
                C0K2.A0E = "https://graph.whatsapp.net/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
            }
        } else {
            C0K2.A0E = "https://graph.instagram.com/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
            C0K2.A0C = C0K2.A08;
        }
        if (C0K2.A01 == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.0K5
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                        C0K2.A01();
                    }
                }
            };
            C0K2.A01 = broadcastReceiver;
            C0K2.A02.registerReceiver(broadcastReceiver, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        }
        C07K.A16(context);
    }

    public static void A03(C21X c21x, C0K0 c0k0, Integer num) {
        double d = c0k0.A00;
        c21x.A02();
        C21Y c21y = (C21Y) c21x.A00;
        c21y.A04 |= 1;
        c21y.A00 = d;
        double d2 = c0k0.A01;
        c21x.A02();
        C21Y c21y2 = (C21Y) c21x.A00;
        c21y2.A04 |= 2;
        c21y2.A01 = d2;
        int i = c0k0.A03;
        if (i != -1) {
            c21x.A02();
            C21Y c21y3 = (C21Y) c21x.A00;
            c21y3.A04 |= 4;
            c21y3.A03 = i;
        }
        float f = c0k0.A02;
        if (f != -1.0f) {
            c21x.A02();
            C21Y c21y4 = (C21Y) c21x.A00;
            c21y4.A04 |= 8;
            c21y4.A02 = f;
        }
        int i2 = c0k0.A04;
        if (i2 != -1) {
            c21x.A02();
            C21Y c21y5 = (C21Y) c21x.A00;
            c21y5.A04 |= 16;
            c21y5.A05 = i2;
        }
        if (num != null) {
            int intValue = num.intValue();
            c21x.A02();
            C21Y c21y6 = (C21Y) c21x.A00;
            c21y6.A04 |= 128;
            c21y6.A06 = intValue;
        }
    }

    public static boolean A04(Location location, Location location2) {
        if (location2 != null && location2.getTime() + 120000 >= location.getTime() && location2.getAccuracy() <= location.getAccuracy()) {
            return TextUtils.equals(location2.getProvider(), location.getProvider()) && location2.distanceTo(location) > Math.max(10.0f, location.getAccuracy());
        }
        return true;
    }

    public C40531sQ A05(C0K0 c0k0, Integer num) {
        C40541sR A09 = C40531sQ.A09();
        C21X c21x = (C21X) ((C40531sQ) A09.A00).A10().AVX();
        A03(c21x, c0k0, num);
        A09.A02();
        C40531sQ.A0S((C40531sQ) A09.A00, c21x);
        return (C40531sQ) A09.A01();
    }

    public C0K0 A06(Location location) {
        C02L c02l = this.A01;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            C0K0 c0k0 = new C0K0(userJid);
            c0k0.A00 = Math.round(location.getLatitude() * 1000000.0d) / 1000000.0d;
            c0k0.A01 = Math.round(location.getLongitude() * 1000000.0d) / 1000000.0d;
            if (location.hasAccuracy()) {
                c0k0.A03 = (int) location.getAccuracy();
            }
            if (location.hasSpeed()) {
                c0k0.A02 = ((int) (location.getSpeed() * 100.0f)) / 100.0f;
            }
            if (location.hasBearing()) {
                c0k0.A04 = (int) location.getBearing();
            }
            long time = location.getTime();
            c0k0.A05 = time;
            AnonymousClass012 anonymousClass012 = this.A03;
            if (time > anonymousClass012.A05()) {
                c0k0.A05 = anonymousClass012.A05();
            }
            return c0k0;
        }
        throw null;
    }

    public boolean A07(Context context) {
        if (AnonymousClass029.A1L(context) && C0K6.A00(context) == 0) {
            ActivityManager A01 = this.A02.A01();
            if (A01 != null) {
                return A01.getDeviceConfigurationInfo().reqGlEsVersion >= 131072;
            }
            Log.w("app/has-google-maps-v2 am=false");
            return false;
        }
        return false;
    }
}
