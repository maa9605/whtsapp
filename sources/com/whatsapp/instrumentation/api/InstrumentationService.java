package com.whatsapp.instrumentation.api;

import X.C00G;
import X.C3D4;
import X.C3D5;
import X.C62052xG;
import X.C62072xI;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes2.dex */
public class InstrumentationService extends C3D4 {
    public C62052xG A00;
    public C62072xI A01;
    public C00G A02;
    public final C3D5 A03 = new C3D5(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.A03;
    }
}
