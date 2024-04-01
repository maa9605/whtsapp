package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.util.Log;

/* renamed from: X.3aH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C72593aH implements SensorEventListener {
    public boolean A00;
    public final /* synthetic */ C72603aI A01;
    public final /* synthetic */ C84313tX A02;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C72593aH(C72603aI c72603aI, C84313tX c84313tX) {
        this.A01 = c72603aI;
        this.A02 = c84313tX;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        if (f < 5.0f && f != this.A01.A01.getMaximumRange()) {
            z = true;
        }
        if (z != this.A00) {
            this.A00 = z;
            C25L c25l = this.A02.A00;
            StringBuilder sb = new StringBuilder("voip/service/proximitylistener.onchanged ");
            sb.append(c25l);
            Log.i(sb.toString());
            if (z) {
                c25l.A0S();
            } else {
                c25l.A0R();
            }
        }
    }
}
