package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.2K5 */
/* loaded from: classes2.dex */
public class C2K5 extends C2K6 {
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public SensorManager A04;
    public Display A05;
    public C0T4 A06;
    public C02E A07;
    public boolean A08;
    public final SensorEventListener A09;
    public final InterfaceC18440tk A0A;
    public final float[] A0B;
    public final float[] A0C;
    public final float[] A0D;

    public C2K5(Context context, C18350tb c18350tb) {
        super(context, c18350tb);
        this.A0C = new float[16];
        this.A0D = new float[3];
        this.A0B = new float[3];
        this.A02 = 2;
        this.A0A = new InterfaceC18440tk() { // from class: X.3Ds
            {
                C2K5.this = this;
            }

            @Override // X.InterfaceC18440tk
            public final void ALj(C0T4 c0t4) {
                C2K5 c2k5 = C2K5.this;
                if (c2k5.A06 == null) {
                    c2k5.A06 = c0t4;
                    c2k5.setLocationMode(c2k5.A02);
                }
            }
        };
        this.A09 = new SensorEventListener() { // from class: X.2yA
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            {
                C2K5.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:111:0x00fb, code lost:
                if (r2 != 3) goto L49;
             */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0102  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x012a  */
            @Override // android.hardware.SensorEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onSensorChanged(android.hardware.SensorEvent r23) {
                /*
                    Method dump skipped, instructions count: 307
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C62542yA.onSensorChanged(android.hardware.SensorEvent):void");
            }
        };
        this.A04 = this.A07.A08();
        this.A05 = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public C0T4 A0L(InterfaceC18440tk interfaceC18440tk) {
        C000700j.A01();
        C0T4 c0t4 = this.A06;
        if (c0t4 != null) {
            interfaceC18440tk.ALj(c0t4);
            return this.A06;
        }
        A0H(interfaceC18440tk);
        return null;
    }

    public void A0M() {
        SensorManager sensorManager = this.A04;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            this.A08 = defaultSensor != null;
            if (defaultSensor != null) {
                this.A04.registerListener(this.A09, defaultSensor, 16000);
            }
        }
    }

    public void A0N(int i) {
        if (this instanceof C3Lm) {
            C3Lm c3Lm = (C3Lm) this;
            if (i == 0) {
                LocationPicker locationPicker = c3Lm.A00;
                locationPicker.A0O.A0S.setImageResource(R.drawable.btn_compass_mode_tilt);
                locationPicker.A0O.A0r = false;
            } else if (i == 1) {
                LocationPicker locationPicker2 = c3Lm.A00;
                locationPicker2.A0O.A0S.setImageResource(R.drawable.btn_myl_active);
                locationPicker2.A0O.A0r = true;
            } else if (i == 2) {
                LocationPicker locationPicker3 = c3Lm.A00;
                locationPicker3.A0O.A0S.setImageResource(R.drawable.btn_myl);
                locationPicker3.A0O.A0r = false;
            }
        } else if (this instanceof C3Ll) {
            C3Ll c3Ll = (C3Ll) this;
            if (i == 0) {
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = c3Ll.A00;
                C2GV c2gv = groupChatLiveLocationsActivity.A0M;
                c2gv.A0u = true;
                c2gv.A0s = true;
                groupChatLiveLocationsActivity.A03.setImageResource(R.drawable.btn_compass_mode_tilt);
                C2GV c2gv2 = groupChatLiveLocationsActivity.A0M;
                c2gv2.A0U.setVisibility(c2gv2.A0m == null ? 0 : 8);
            } else if (i != 1) {
                if (i == 2) {
                    GroupChatLiveLocationsActivity groupChatLiveLocationsActivity2 = c3Ll.A00;
                    groupChatLiveLocationsActivity2.A03.setImageResource(R.drawable.btn_myl);
                    groupChatLiveLocationsActivity2.A0M.A0s = false;
                }
            } else {
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity3 = c3Ll.A00;
                C2GV c2gv3 = groupChatLiveLocationsActivity3.A0M;
                c2gv3.A0u = true;
                c2gv3.A0s = true;
                groupChatLiveLocationsActivity3.A03.setImageResource(R.drawable.btn_myl_active);
                C2GV c2gv4 = groupChatLiveLocationsActivity3.A0M;
                c2gv4.A0U.setVisibility(c2gv4.A0m == null ? 0 : 8);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A02 != 2) {
            this.A02 = 2;
            A0N(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A02;
    }

    public Location getMyLocation() {
        C0T4 A0L = A0L(this.A0A);
        if (A0L == null || !A0L.A0N || A0L.A0H == null) {
            return null;
        }
        return A0L.A0U.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0065, code lost:
        if (r8 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setLocationMode(int r12) {
        /*
            r11 = this;
            X.0tk r0 = r11.A0A
            X.0T4 r4 = r11.A0L(r0)
            if (r4 != 0) goto Lb
            r11.A02 = r12
            return
        Lb:
            X.07l r9 = r4.A02()
            r6 = 0
            r5 = 1500(0x5dc, float:2.102E-42)
            r7 = 1
            if (r12 == 0) goto L21
            r10 = 1
            r1 = 2
            if (r12 == r10) goto L68
            if (r12 != r1) goto L20
            r11.A02 = r1
            r11.A0N(r1)
        L20:
            return
        L21:
            boolean r0 = r11.A08
            if (r0 == 0) goto L20
            float r0 = r9.A02
            r11.A01 = r0
            r0 = 0
            r11.A0N(r0)
            android.location.Location r0 = r11.getMyLocation()
            if (r0 == 0) goto L63
            double r2 = r0.getLatitude()
            double r0 = r0.getLongitude()
            X.07m r8 = new X.07m
            r8.<init>(r2, r0)
        L40:
            float r2 = r11.A00
            float r1 = r11.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r1 = java.lang.Math.max(r1, r0)
            X.07l r0 = new X.07l
            r0.<init>(r8, r1, r7, r2)
            X.07k r0 = X.C07K.A0g(r0)
            r4.A08(r0, r5, r6)
        L56:
            r0 = 33
            java.lang.RunnableEBaseShape2S0200000_I0_2 r2 = new java.lang.RunnableEBaseShape2S0200000_I0_2
            r2.<init>(r11, r4, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.postDelayed(r2, r0)
            return
        L63:
            X.07m r8 = r9.A03
            if (r8 == 0) goto L56
            goto L40
        L68:
            android.location.Location r0 = r11.getMyLocation()
            if (r0 == 0) goto L91
            double r2 = r0.getLatitude()
            double r0 = r0.getLongitude()
            X.07m r8 = new X.07m
            r8.<init>(r2, r0)
            r11.A02 = r10
            r0 = 1
        L7e:
            r11.A0N(r0)
            float r2 = r9.A02
            r1 = 0
            X.07l r0 = new X.07l
            r0.<init>(r8, r2, r7, r1)
            X.07k r0 = X.C07K.A0g(r0)
            r4.A08(r0, r5, r6)
            return
        L91:
            X.07m r8 = r9.A03
            r11.A02 = r1
            r0 = 2
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2K5.setLocationMode(int):void");
    }
}
