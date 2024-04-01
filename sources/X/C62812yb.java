package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseIntArray;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2yb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C62812yb implements LocationListener {
    public long A00;
    public Location A01;
    public Location A02;
    public PowerManager.WakeLock A03;
    public final SparseIntArray A04 = new SparseIntArray();
    public final C0IK A05;
    public final C0G2 A06;
    public final C0G4 A07;
    public final C02E A08;
    public final C000500h A09;
    public final InterfaceC453721o A0A;

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C62812yb(C02E c02e, C000500h c000500h, C0G2 c0g2, C0IK c0ik, C0G4 c0g4, InterfaceC453721o interfaceC453721o) {
        this.A08 = c02e;
        this.A09 = c000500h;
        this.A06 = c0g2;
        this.A05 = c0ik;
        this.A07 = c0g4;
        this.A0A = interfaceC453721o;
    }

    public final void A00() {
        long j = this.A00;
        if (j != 0) {
            int i = (int) ((j - (j % 3600000)) / 1000);
            SparseIntArray sparseIntArray = this.A04;
            sparseIntArray.put(i, sparseIntArray.get(i, 0) + ((int) (System.currentTimeMillis() - j)));
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
                int keyAt = sparseIntArray.keyAt(i2);
                int i3 = sparseIntArray.get(keyAt);
                if (i2 != 0) {
                    sb.append(";");
                }
                sb.append(keyAt);
                sb.append(",");
                sb.append(i3);
            }
            C000200d.A0i(this.A09, "location_shared_duration", sb.toString());
            this.A00 = 0L;
        }
    }

    public final void A01(Location location) {
        this.A02 = location;
        LocationSharingService locationSharingService = (LocationSharingService) this.A0A;
        if (locationSharingService.A0G) {
            locationSharingService.A08.A0Q(location);
            C2AX c2ax = locationSharingService.A09;
            C0K0 A06 = c2ax.A03.A06(location);
            c2ax.A05.A0A(A06.A06, c2ax.A03.A05(A06, null), (c2ax.A00.A05() - A06.A05) / 1000);
        }
        long A05 = locationSharingService.A05.A05();
        long j = locationSharingService.A00;
        if (A05 > j) {
            C000200d.A1I(C000200d.A0P("LocationSharingService/onLocationUpdate/stop this service since passed maxEndTime; maxEndTime="), j);
            locationSharingService.A0F = false;
            locationSharingService.A02();
        } else if (!locationSharingService.A08.A0f()) {
            Log.i("LocationSharingService/onLocationUpdate/stop this service, no longer sharing live location");
            locationSharingService.A0F = false;
            locationSharingService.A02();
        } else if (!locationSharingService.A0F) {
        } else {
            locationSharingService.A08.A0Q(location);
            if (locationSharingService.A08.A0g()) {
                return;
            }
            locationSharingService.A08.A0K();
        }
    }

    public void A02(String str) {
        String obj;
        SparseIntArray sparseIntArray;
        long j;
        long j2;
        int i;
        Location location = this.A02;
        if (location == null || location.getTime() + 120000 < System.currentTimeMillis()) {
            Location A03 = this.A05.A03(str);
            if (A03 != null && A03.getTime() + 7200000 < System.currentTimeMillis()) {
                A03 = null;
            }
            StringBuilder A0P = C000200d.A0P("MyLocationUpdater/onStartCommand/start; ");
            if (A03 == null) {
                obj = "location=null";
            } else {
                StringBuilder A0P2 = C000200d.A0P("location.provider=");
                A0P2.append(A03.getProvider());
                obj = A0P2.toString();
            }
            C000200d.A1N(A0P, obj);
            if (A03 != null) {
                A01(A03);
            }
        }
        if (this.A00 != 0) {
            A00();
        }
        this.A00 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        long j3 = 0;
        while (true) {
            sparseIntArray = this.A04;
            if (i2 >= sparseIntArray.size()) {
                break;
            }
            int keyAt = sparseIntArray.keyAt(i2);
            int i3 = sparseIntArray.get(keyAt);
            if ((keyAt * 1000) + 86400000 >= System.currentTimeMillis()) {
                j3 += i3;
            } else {
                arrayList.add(Integer.valueOf(keyAt));
            }
            i2++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sparseIntArray.delete(((Number) it.next()).intValue());
        }
        boolean z = this.A07.A00;
        C0G3 c0g3 = this.A06.A00;
        boolean A01 = c0g3.A01();
        double A00 = c0g3.A00();
        if (Double.isNaN(A00)) {
            A00 = 100.0d;
        }
        try {
            if (z) {
                this.A00 = 0L;
            } else {
                if (A01 && A00 > 30.0d) {
                    this.A00 = 0L;
                } else if (j3 > 7200000 || (!A01 && A00 <= 15.0d)) {
                    this.A00 = 0L;
                } else if (j3 > 1800000 || (!A01 && A00 <= 30.0d)) {
                    j = 5000;
                    j2 = 10000;
                    i = 2;
                    C0IK c0ik = this.A05;
                    c0ik.A06(this);
                    StringBuilder sb = new StringBuilder();
                    sb.append("MyLocationUpdater/onStartCommand/request location updates; powerSaveMode=");
                    sb.append(z);
                    sb.append("; duration=");
                    sb.append(j3);
                    sb.append("; locationProviders=");
                    sb.append(i);
                    sb.append("; updateInterval=");
                    sb.append(j2);
                    Log.i(sb.toString());
                    c0ik.A05(i, j2, j, this, "location-updater");
                    return;
                }
                j = 1000;
                j2 = 5000;
                i = 3;
                C0IK c0ik2 = this.A05;
                c0ik2.A06(this);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MyLocationUpdater/onStartCommand/request location updates; powerSaveMode=");
                sb2.append(z);
                sb2.append("; duration=");
                sb2.append(j3);
                sb2.append("; locationProviders=");
                sb2.append(i);
                sb2.append("; updateInterval=");
                sb2.append(j2);
                Log.i(sb2.toString());
                c0ik2.A05(i, j2, j, this, "location-updater");
                return;
            }
            StringBuilder sb22 = new StringBuilder();
            sb22.append("MyLocationUpdater/onStartCommand/request location updates; powerSaveMode=");
            sb22.append(z);
            sb22.append("; duration=");
            sb22.append(j3);
            sb22.append("; locationProviders=");
            sb22.append(i);
            sb22.append("; updateInterval=");
            sb22.append(j2);
            Log.i(sb22.toString());
            c0ik2.A05(i, j2, j, this, "location-updater");
            return;
        } catch (IllegalArgumentException e) {
            Log.w("MyLocationUpdater/onCreate/GPS error ", e);
            return;
        }
        j2 = 30000;
        j = 10000;
        i = 0;
        C0IK c0ik22 = this.A05;
        c0ik22.A06(this);
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        Log.i("MyLocationUpdater/onLocationChanged");
        if (C41481tz.A04(location, this.A02)) {
            A01(location);
            this.A01 = location;
            return;
        }
        if (location.getAccuracy() < 80.0f) {
            this.A01 = location;
        }
        if (this.A01 == null || this.A02.getTime() + 40000 >= this.A01.getTime()) {
            return;
        }
        A01(this.A01);
    }
}
