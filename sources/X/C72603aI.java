package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.3aI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72603aI {
    public SensorEventListener A00;
    public final Sensor A01;
    public final SensorManager A02;

    public C72603aI(C02E c02e) {
        SensorManager A08 = c02e.A08();
        this.A02 = A08;
        this.A01 = A08.getDefaultSensor(8);
    }
}
