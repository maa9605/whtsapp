package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0IK */
/* loaded from: classes.dex */
public class C0IK {
    public static volatile C0IK A09;
    public LocationManager A00;
    public C0NE A01;
    public Map A02;
    public final C03020Dv A03;
    public final AbstractC000600i A04;
    public final C02E A05;
    public final C001200o A06;
    public final C02F A07;
    public volatile boolean A08;

    public C0IK(C001200o c001200o, AbstractC000600i abstractC000600i, C02E c02e, C02F c02f, C03020Dv c03020Dv) {
        this.A06 = c001200o;
        this.A04 = abstractC000600i;
        this.A07 = c02f;
        this.A05 = c02e;
        this.A03 = c03020Dv;
    }

    public static LocationRequest A00(C35261ir c35261ir) {
        LocationRequest locationRequest = new LocationRequest();
        int i = c35261ir.A00;
        if ((i & 1) != 0) {
            locationRequest.A01 = 100;
        } else if ((i & 2) != 0) {
            locationRequest.A01 = 102;
        } else {
            locationRequest.A01 = 105;
        }
        long j = c35261ir.A02;
        LocationRequest.A00(j);
        locationRequest.A04 = j;
        if (!locationRequest.A07) {
            locationRequest.A05 = (long) (j / 6.0d);
        }
        long j2 = c35261ir.A01;
        LocationRequest.A00(j2);
        locationRequest.A07 = true;
        locationRequest.A05 = j2;
        locationRequest.A00 = 0.0f;
        return locationRequest;
    }

    public static C0IK A01() {
        if (A09 == null) {
            synchronized (C0IK.class) {
                if (A09 == null) {
                    A09 = new C0IK(C001200o.A01, AbstractC000600i.A00(), C02E.A00(), C02F.A00(), C03020Dv.A00());
                }
            }
        }
        return A09;
    }

    public Location A02(int i, String str) {
        C02F c02f = this.A07;
        if (c02f.A04()) {
            StringBuilder sb = new StringBuilder("FusedLocationManager/getLocation:");
            sb.append(str);
            Log.i(sb.toString());
            A04();
            A07(str);
            C0NE c0ne = this.A01;
            if (c0ne != null && c0ne.A0B()) {
                C0NE c0ne2 = this.A01;
                C07K.A1b(c0ne2 != null, "GoogleApiClient parameter is required.");
                C16410qM c16410qM = (C16410qM) c0ne2.A04(AnonymousClass185.A01);
                C07K.A1c(c16410qM != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
                try {
                    C235817h c235817h = c16410qM.A00;
                    C236317m c236317m = c235817h.A01;
                    c236317m.A00();
                    return ((InterfaceC235717g) c236317m.A00.A02()).AWc(c235817h.A00.getPackageName());
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.A00 == null) {
                return null;
            } else {
                if (i == 1) {
                    if (c02f.A02("android.permission.ACCESS_FINE_LOCATION") == 0) {
                        return this.A00.getLastKnownLocation("gps");
                    }
                } else if (c02f.A02("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    return this.A00.getLastKnownLocation("network");
                }
            }
        }
        C000200d.A15("FusedLocationManager/getLastKnownLocation/do not have location permissions context:", str);
        return null;
    }

    public Location A03(String str) {
        A04();
        Location A02 = A02(1, str);
        Location A022 = A02(2, str);
        if (A02 == null || (A022 != null && A02.getTime() <= A022.getTime() - 20000)) {
            A02 = A022;
            if (A022 == null) {
                return A02;
            }
        }
        if (A02.getTime() + 7200000 < System.currentTimeMillis()) {
            return null;
        }
        return A02;
    }

    public synchronized void A04() {
        if (this.A00 != null) {
            return;
        }
        C001200o c001200o = this.A06;
        if (AnonymousClass029.A1L(c001200o.A00)) {
            C35251iq c35251iq = new C35251iq(this);
            this.A02 = new HashMap();
            C227713y c227713y = new C227713y(c001200o.A00);
            c227713y.A01(AnonymousClass185.A02);
            C07K.A1Q(c35251iq, "Listener must not be null");
            c227713y.A07.add(c35251iq);
            C07K.A1Q(c35251iq, "Listener must not be null");
            c227713y.A08.add(c35251iq);
            this.A01 = c227713y.A00();
        } else {
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = this.A05.A09();
    }

    public void A05(int i, long j, long j2, LocationListener locationListener, String str) {
        C02F c02f = this.A07;
        if (c02f.A04()) {
            A04();
            A07(str);
            if (this.A01 != null) {
                if (this.A02.isEmpty()) {
                    this.A01.A09();
                }
                C35261ir c35261ir = new C35261ir(j, j2, i, locationListener);
                this.A02.put(locationListener, c35261ir);
                if (this.A01.A0B()) {
                    LocationRequest A00 = A00(c35261ir);
                    C0NE c0ne = this.A01;
                    C07K.A1Q(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    c0ne.A07(new C11830iP(c0ne, A00, c35261ir));
                    return;
                }
                return;
            }
            if ((i & 1) != 0) {
                try {
                    if (this.A00 != null && c02f.A02("android.permission.ACCESS_FINE_LOCATION") == 0) {
                        this.A00.requestLocationUpdates("gps", j, 0.0f, locationListener);
                    } else {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have fine location permission");
                    }
                } catch (RuntimeException e) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e);
                }
            }
            if ((i & 2) == 0) {
                return;
            }
            try {
                if (this.A00 != null && c02f.A02("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    this.A00.requestLocationUpdates("network", j, 0.0f, locationListener);
                } else {
                    Log.w("FusedLocationManager/requestLocationUpdates/do not have coarse location permission");
                }
            } catch (RuntimeException e2) {
                Log.e("FusedLocationManager/requestLocationUpdates", e2);
            }
        }
    }

    public void A06(LocationListener locationListener) {
        A04();
        if (this.A01 != null) {
            final C35261ir c35261ir = (C35261ir) this.A02.remove(locationListener);
            if (c35261ir != null) {
                if (this.A01.A0B()) {
                    C0NE c0ne = this.A01;
                    c0ne.A07(new AbstractC16470qS(c0ne) { // from class: X.0gU
                        @Override // X.C0NH
                        public final void A0C(InterfaceC227113q interfaceC227113q) {
                            AnonymousClass184 anonymousClass184 = c35261ir;
                            C07K.A1Q(anonymousClass184, "Listener must not be null");
                            C07K.A1Q("LocationListener", "Listener type must not be null");
                            C07K.A1V("LocationListener", "Listener type must not be empty");
                            C14A c14a = new C14A(anonymousClass184);
                            BinderC39891qt binderC39891qt = new BinderC39891qt(this);
                            C235817h c235817h = ((C16410qM) interfaceC227113q).A00;
                            C236317m c236317m = c235817h.A01;
                            c236317m.A00();
                            C07K.A1Q(c14a, "Invalid null listener key");
                            Map map = c235817h.A02;
                            synchronized (map) {
                                BinderC39901qu binderC39901qu = (BinderC39901qu) map.remove(c14a);
                                if (binderC39901qu != null) {
                                    synchronized (binderC39901qu) {
                                        binderC39901qu.A00.A02 = null;
                                    }
                                    ((InterfaceC235717g) c236317m.A00.A02()).AWv(new C31661cd(2, null, binderC39901qu.asBinder(), null, null, binderC39891qt.asBinder()));
                                }
                            }
                        }
                    });
                }
                if (this.A02.isEmpty()) {
                    this.A01.A0A();
                }
            }
        } else if (this.A00 == null || !this.A07.A04()) {
        } else {
            this.A00.removeUpdates(locationListener);
        }
    }

    public final void A07(String str) {
        if (Build.VERSION.SDK_INT != 29 || this.A03.A00 || this.A08 || "group-chat-live-location-ui-oncreate".equals(str)) {
            return;
        }
        this.A04.A09("FusedLocationManager/logIfLocationAccessedInBackground", "background-location", true);
    }

    public boolean A08() {
        A04();
        LocationManager locationManager = this.A00;
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps") || this.A00.isProviderEnabled("network");
        }
        return false;
    }
}
