package X;

import com.whatsapp.util.Log;

/* renamed from: X.0SE  reason: invalid class name */
/* loaded from: classes.dex */
public class C0SE {
    public final AbstractC005302j A00;
    public final boolean A01;

    public C0SE(AbstractC005302j abstractC005302j, boolean z) {
        this.A00 = abstractC005302j;
        this.A01 = z;
    }

    public void A00(int i) {
        C000200d.A0p("locationssubscriberesponsehandler/error ", i);
    }

    public void A01(int i) {
        Log.i("locationssubscriberesponsehandler/subscription list updated");
    }

    public void A02(int i) {
        C000200d.A0q("locationssubscriberesponsehandler/success ", i);
    }
}
