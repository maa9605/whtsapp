package X;

import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.1X6  reason: invalid class name */
/* loaded from: classes.dex */
public class C1X6 implements LocationListener {
    public static final String[] A06 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public Location A00;
    public C29351Wl A01;
    public C1X6 A02;
    public boolean A03;
    public final Context A04;
    public final LocationManager A05;

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C1X6(Context context) {
        this.A04 = context;
        this.A05 = (LocationManager) context.getSystemService("location");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r1 <= 200) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(android.location.Location r7, android.location.Location r8) {
        /*
            r6 = 0
            if (r7 != 0) goto L4
            return r6
        L4:
            r5 = 1
            if (r8 != 0) goto L8
            return r5
        L8:
            long r3 = r7.getTime()
            long r0 = r8.getTime()
            long r3 = r3 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L19
            return r5
        L19:
            r1 = -120000(0xfffffffffffe2b40, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L21
            return r6
        L21:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L29
            r4 = 1
        L29:
            float r1 = r7.getAccuracy()
            float r0 = r8.getAccuracy()
            float r1 = r1 - r0
            int r1 = (int) r1
            r3 = 1
            if (r1 <= 0) goto L3c
            r3 = 0
            r0 = 200(0xc8, float:2.8E-43)
            r2 = 1
            if (r1 > r0) goto L3d
        L3c:
            r2 = 0
        L3d:
            java.lang.String r0 = r7.getProvider()
            java.lang.String r1 = r8.getProvider()
            if (r0 != 0) goto L54
            r0 = 0
            if (r1 != 0) goto L4b
            r0 = 1
        L4b:
            if (r3 != 0) goto L53
            if (r4 == 0) goto L59
            if (r2 != 0) goto L59
            if (r0 == 0) goto L59
        L53:
            return r5
        L54:
            boolean r0 = r0.equals(r1)
            goto L4b
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1X6.A00(android.location.Location, android.location.Location):boolean");
    }

    public void A01(boolean z) {
        if (this.A02 == null) {
            this.A02 = this;
        }
        this.A03 = z;
        if (z && Build.VERSION.SDK_INT >= 23) {
            Context context = this.A04;
            if (context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 || context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                boolean z2 = context instanceof Activity;
                C18680u8.A0O.A00();
                if (!z2) {
                    return;
                }
                return;
            }
        }
        if (this.A03) {
            C1X6 c1x6 = this.A02;
            List<String> providers = c1x6.A05.getProviders(true);
            Location location = c1x6.A00;
            if (providers != null) {
                for (String str : providers) {
                    Location lastKnownLocation = c1x6.A05.getLastKnownLocation(str);
                    if (A00(lastKnownLocation, location)) {
                        location = lastKnownLocation;
                    }
                }
            }
            if (location != null && System.currentTimeMillis() - location.getTime() < 7200000) {
                c1x6.A00 = location;
                C29351Wl c29351Wl = c1x6.A01;
                if (c29351Wl != null) {
                    c29351Wl.A00.A0E.invalidate();
                }
            } else {
                c1x6.A00 = null;
            }
            Criteria criteria = new Criteria();
            try {
                criteria.setAccuracy(1);
                LocationManager locationManager = c1x6.A05;
                locationManager.requestLocationUpdates(locationManager.getBestProvider(criteria, true), 50L, 0.0f, c1x6);
            } catch (Exception unused) {
            }
            try {
                criteria.setAccuracy(2);
                LocationManager locationManager2 = c1x6.A05;
                locationManager2.requestLocationUpdates(locationManager2.getBestProvider(criteria, true), 50L, 0.0f, c1x6);
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        C1X6 c1x62 = this.A02;
        c1x62.A05.removeUpdates(c1x62);
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (A00(location, this.A00)) {
            this.A00 = location;
            C29351Wl c29351Wl = this.A01;
            if (c29351Wl != null) {
                c29351Wl.A00.A0E.invalidate();
            }
        }
    }
}
