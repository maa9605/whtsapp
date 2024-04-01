package X;

import android.app.Notification;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.0IL  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0IL extends C0IM {
    public int A00 = -1;
    public C0ER A01;
    public boolean A02;
    public final String A03;
    public final boolean A04;

    public C0IL(String str, boolean z) {
        this.A03 = str;
        this.A04 = z;
    }

    public void A01(int i, int i2, Notification notification) {
        this.A00 = i;
        startForeground(i2, notification);
        if (!this.A02) {
            this.A02 = true;
            if (Build.VERSION.SDK_INT >= 26) {
                C0ER c0er = this.A01;
                synchronized (c0er) {
                    Class<?> cls = getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("FgServiceManager register:");
                    sb.append(cls);
                    Log.i(sb.toString());
                    c0er.A01.put(cls, this);
                }
                c0er.A01();
            }
        }
    }

    public boolean A02() {
        boolean stopSelfResult = stopSelfResult(this.A04 ? -1 : this.A00);
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append("/Stop service success:");
        sb.append(stopSelfResult);
        Log.i(sb.toString());
        return stopSelfResult;
    }

    @Override // X.C0IM, android.app.Service
    public void onCreate() {
        this.A02 = false;
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.A02 = false;
        this.A00 = -1;
    }
}
