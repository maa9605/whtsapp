package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: X.1Tb  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Tb extends Service implements InterfaceC02360Aw {
    public final C13920m2 A00 = new C13920m2(this);

    @Override // X.InterfaceC02360Aw
    public AbstractC02530Bu AAs() {
        return this.A00.A02;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.A00.A00(C0C1.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.A00.A00(C0C1.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C13920m2 c13920m2 = this.A00;
        c13920m2.A00(C0C1.ON_STOP);
        c13920m2.A00(C0C1.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.A00.A00(C0C1.ON_START);
        super.onStart(intent, i);
    }
}
