package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2Xs */
/* loaded from: classes2.dex */
public class C2Xs extends AbstractC51752Xt {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public long A04;
    public SensorManager A05;
    public Location A06;
    public Display A07;
    public C0S8 A08;
    public C02E A09;
    public boolean A0A;
    public boolean A0B;
    public final SensorEventListener A0C;
    public final C18E A0D;
    public final float[] A0E;
    public final float[] A0F;
    public final float[] A0G;

    public C2Xs(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        this.A0F = new float[16];
        this.A0G = new float[3];
        this.A0E = new float[3];
        this.A03 = 2;
        this.A0D = new C18E() { // from class: X.3EP
            {
                C2Xs.this = this;
            }

            @Override // X.C18E
            public void AID() {
                C2Xs.this.A0A = false;
            }

            @Override // X.C18E
            public void AKU() {
                C2Xs.this.A0A = false;
            }
        };
        this.A0C = new SensorEventListener() { // from class: X.2yC
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            {
                C2Xs.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:122:0x01aa, code lost:
                if (r9 != 3) goto L55;
             */
            /* JADX WARN: Removed duplicated region for block: B:125:0x01b0  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x01e1  */
            @Override // android.hardware.SensorEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onSensorChanged(android.hardware.SensorEvent r25) {
                /*
                    Method dump skipped, instructions count: 491
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C62562yC.onSensorChanged(android.hardware.SensorEvent):void");
            }
        };
        this.A05 = this.A09.A08();
        this.A07 = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        A06(new C18L() { // from class: X.3Dt
            {
                C2Xs.this = this;
            }

            @Override // X.C18L
            public final void ALk(C0S8 c0s8) {
                C2Xs c2Xs = C2Xs.this;
                if (c2Xs.A08 == null) {
                    c2Xs.A08 = c0s8;
                    c2Xs.setLocationMode(c2Xs.A03);
                }
            }
        });
    }

    public void A07() {
        SensorManager sensorManager = this.A05;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            this.A0B = defaultSensor != null;
            if (defaultSensor != null) {
                this.A05.registerListener(this.A0C, defaultSensor, 1);
            }
        }
    }

    public void A08(int i) {
        if (this instanceof C3LU) {
            C3LU c3lu = (C3LU) this;
            if (i == 0) {
                LocationPicker2 locationPicker2 = c3lu.A00;
                locationPicker2.A0N.A0S.setImageResource(R.drawable.btn_compass_mode_tilt);
                locationPicker2.A0N.A0r = false;
            } else if (i == 1) {
                LocationPicker2 locationPicker22 = c3lu.A00;
                locationPicker22.A0N.A0S.setImageResource(R.drawable.btn_myl_active);
                locationPicker22.A0N.A0r = true;
            } else if (i == 2) {
                LocationPicker2 locationPicker23 = c3lu.A00;
                locationPicker23.A0N.A0S.setImageResource(R.drawable.btn_myl);
                locationPicker23.A0N.A0r = false;
            }
        } else if (this instanceof C3LT) {
            C3LT c3lt = (C3LT) this;
            if (i == 0) {
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = c3lt.A00;
                C2GV c2gv = groupChatLiveLocationsActivity2.A0N;
                c2gv.A0u = true;
                c2gv.A0s = true;
                c2gv.A0U.setVisibility(c2gv.A0m == null ? 0 : 8);
                groupChatLiveLocationsActivity2.A04.setImageResource(R.drawable.btn_compass_mode_tilt);
            } else if (i != 1) {
                if (i == 2) {
                    GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity22 = c3lt.A00;
                    groupChatLiveLocationsActivity22.A04.setImageResource(R.drawable.btn_myl);
                    groupChatLiveLocationsActivity22.A0N.A0s = false;
                }
            } else {
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity23 = c3lt.A00;
                C2GV c2gv2 = groupChatLiveLocationsActivity23.A0N;
                c2gv2.A0u = true;
                c2gv2.A0s = true;
                c2gv2.A0U.setVisibility(c2gv2.A0m == null ? 0 : 8);
                groupChatLiveLocationsActivity23.A04.setImageResource(R.drawable.btn_myl_active);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A03 != 2) {
            this.A03 = 2;
            A08(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A03;
    }

    public void setLocationMode(int i) {
        LatLng latLng;
        LatLng latLng2;
        int i2;
        C0S8 c0s8 = this.A08;
        if (c0s8 == null) {
            this.A03 = i;
            return;
        }
        CameraPosition A02 = c0s8.A02();
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.A03 = 2;
                    A08(2);
                    return;
                }
                return;
            }
            Location location = this.A06;
            if (location != null) {
                latLng2 = new LatLng(location.getLatitude(), this.A06.getLongitude());
                this.A03 = 1;
                i2 = 1;
            } else {
                latLng2 = A02.A03;
                this.A03 = 2;
                i2 = 2;
            }
            A08(i2);
            c0s8.A08(AnonymousClass088.A0T(new CameraPosition(latLng2, A02.A02, 0.0f, 0.0f)));
        } else if (this.A0B) {
            this.A01 = A02.A02;
            A08(0);
            Location location2 = this.A06;
            if (location2 != null) {
                latLng = new LatLng(location2.getLatitude(), this.A06.getLongitude());
            } else {
                latLng = A02.A03;
                if (latLng == null) {
                    return;
                }
            }
            float f = this.A00;
            double d = 50.0d / 6378137.0d;
            double radians = Math.toRadians(f);
            double radians2 = Math.toRadians(latLng.A00);
            double radians3 = Math.toRadians(latLng.A01);
            double cos = Math.cos(d);
            double sin = Math.sin(d);
            double sin2 = Math.sin(radians2);
            double cos2 = sin * Math.cos(radians2);
            double cos3 = (Math.cos(radians) * cos2) + (cos * sin2);
            CameraPosition cameraPosition = new CameraPosition(new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * cos2, cos - (sin2 * cos3)))), Math.max(this.A01, 15.0f), Math.max(Math.min(this.A02, 67.5f), 0.0f), f);
            this.A0A = true;
            c0s8.A0A(AnonymousClass088.A0T(cameraPosition), this.A0D);
            this.A03 = 0;
        }
    }

    public void setMyLocation(Location location) {
        this.A06 = location;
    }
}
