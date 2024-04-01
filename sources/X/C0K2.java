package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.Semaphore;

/* renamed from: X.0K2  reason: invalid class name */
/* loaded from: classes.dex */
public class C0K2 {
    public static long A00;
    public static BroadcastReceiver A01;
    public static Context A02;
    public static C0K3 A03;
    public static String A04;
    public static String A05;
    public static String A06;
    public static volatile String A0D;
    public static final Semaphore A0B = new Semaphore(1);
    public static final List A0A = new LinkedList();
    public static volatile String A0E = "https://graph.facebook.com/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
    public static final C0K4 A07 = new C0K4("https://www.facebook.com/maps/tile/?", "https://www.facebook.com/maps/static/?", null, Integer.MAX_VALUE, null, null);
    public static final C0K4 A08 = new C0K4("https://maps.instagram.com/maps/tile/?", "https://maps.instagram.com/maps/static/?", null, Integer.MAX_VALUE, null, null);
    public static final C0K4 A09 = new C0K4("https://expresswifi.com/maps/tile/?", "https://expresswifi.com/maps/static/?", null, Integer.MAX_VALUE, null, null);
    public static volatile C0K4 A0C = A07;

    static {
        A01();
    }

    public static void A00() {
        if (A0D == null || A02 == null) {
            return;
        }
        Semaphore semaphore = A0B;
        if (semaphore.tryAcquire()) {
            long j = A00;
            if (j != 0 && SystemClock.uptimeMillis() - j < 3600000) {
                semaphore.release();
            } else {
                C18620u2.A02(new AbstractRunnableC18610u1() { // from class: X.1X0
                    public int A00;

                    @Override // X.AbstractRunnableC18610u1
                    public void A00() {
                        C0K2.A0B.release();
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:60:0x0216, code lost:
                        if (r3 == null) goto L56;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x0220  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0243  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [android.location.LocationManager, java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r3v10, types: [java.net.URL] */
                    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.InputStream] */
                    @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void run() {
                        /*
                            Method dump skipped, instructions count: 597
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1X0.run():void");
                    }
                }, "MapConfigUpdateDispatchable");
            }
        }
    }

    public static void A01() {
        String str;
        String language = Locale.getDefault().getLanguage();
        if (language.length() == 2) {
            String country = Locale.getDefault().getCountry();
            StringBuilder A0P = C000200d.A0P(language);
            A0P.append(country.length() == 2 ? C000200d.A0H("_", country) : "");
            str = A0P.toString();
            A04 = str;
        } else {
            str = "en";
            A04 = "en";
        }
        A05 = str.toLowerCase(Locale.US);
        try {
            A06 = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
            A06 = "eng";
        }
    }
}
