package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2Ec  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Ec extends C0HS implements LocationListener {
    public Location A04;
    public boolean A05;
    public final AbstractC000600i A06;
    public final C0IK A07;
    public final AnonymousClass012 A08;
    public final C02F A09;
    public final C0C9 A0A;
    public final C0C8 A0B;
    public final C00A A0C;
    public final C0E9 A0D;
    public final C41451tw A0E;
    public final C41461tx A0F;
    public final C0KD A0G;
    public int A01 = 15;
    public int A00 = 0;
    public Location A03 = null;
    public Location A02 = null;

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C2Ec(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C0C9 c0c9, C00A c00a, C0E9 c0e9, C41451tw c41451tw, C02F c02f, C0IK c0ik, C41461tx c41461tx, C0C8 c0c8, C0KD c0kd) {
        this.A08 = anonymousClass012;
        this.A0G = c0kd;
        this.A06 = abstractC000600i;
        this.A0A = c0c9;
        this.A0C = c00a;
        this.A0D = c0e9;
        this.A0E = c41451tw;
        this.A09 = c02f;
        this.A0F = c41461tx;
        this.A0B = c0c8;
        if (c0kd.A00 == 0.0d || c0kd.A01 == 0.0d) {
            this.A07 = c0ik;
            return;
        }
        Location location = new Location("");
        this.A04 = location;
        location.setLatitude(c0kd.A00);
        this.A04.setLongitude(c0kd.A01);
        this.A04.setTime(c0kd.A0E);
        this.A05 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b0  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A00(double r12, double r14, int r16) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Ec.A00(double, double, int):byte[]");
    }

    @Override // X.C0HS
    public void A06() {
        C0IK c0ik = this.A07;
        if (c0ik != null) {
            try {
                c0ik.A05(3, 1000L, 1000L, this, "map-download");
            } catch (IllegalArgumentException e) {
                Log.w("MapDownload/registerListener/GPS error ", e);
            }
        }
        C0KD c0kd = this.A0G;
        c0kd.A02 = 1;
        this.A0C.A05(c0kd, -1);
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        boolean z;
        Location location = this.A04;
        if (location == null) {
            C0IK c0ik = this.A07;
            if (c0ik == null) {
                return Boolean.FALSE;
            }
            if (!c0ik.A08() || !this.A09.A04()) {
                return Boolean.FALSE;
            }
            int i = 0;
            while (true) {
                z = this.A05;
                if (z || i >= 40) {
                    break;
                }
                SystemClock.sleep(250L);
                i++;
            }
            if (z) {
                location = this.A03;
                this.A04 = location;
            } else {
                Location location2 = this.A02;
                if (location2 != null) {
                    StringBuilder A0P = C000200d.A0P("MapDownload/doInBackground/using coarseLocation ");
                    A0P.append(location2.getAccuracy());
                    Log.i(A0P.toString());
                    location = this.A02;
                    this.A04 = location;
                } else {
                    Log.i("MapDownload/doInBackground/failed to get location");
                    return Boolean.FALSE;
                }
            }
        }
        this.A0E.A01();
        this.A0G.A0E().A03(A00(location.getLatitude(), this.A04.getLongitude(), this.A01));
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Ec.A09(java.lang.Object):void");
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        System.currentTimeMillis();
        location.getTime();
        location.getAccuracy();
        if (C41481tz.A04(location, this.A02)) {
            this.A02 = location;
        }
        int i = this.A00 + 1;
        this.A00 = i;
        if (i >= 2 || location.getAccuracy() < 80.0f) {
            this.A03 = location;
            this.A05 = true;
        }
    }
}
