package X;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* renamed from: X.0Uy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06770Uy {
    public static C06770Uy A03;
    public final Context A00;
    public final LocationManager A01;
    public final C10620gN A02 = new C10620gN();

    public C06770Uy(Context context, LocationManager locationManager) {
        this.A00 = context;
        this.A01 = locationManager;
    }

    public final Location A00(String str) {
        try {
            LocationManager locationManager = this.A01;
            if (locationManager.isProviderEnabled(str)) {
                return locationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
