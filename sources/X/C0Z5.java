package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Z5  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Z5 implements Runnable, C0I3 {
    public final AbstractC005302j A00;
    public final C04500Kk A01;

    public C0Z5(AbstractC005302j abstractC005302j, C04500Kk c04500Kk) {
        this.A00 = abstractC005302j;
        this.A01 = c04500Kk;
    }

    @Override // X.C0I3
    public void ARv(int i) {
        C000200d.A0p("locationsunsubscriberesponsehandler/error ", i);
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.i("locationsunsubscriberesponsehandler/success");
    }
}
