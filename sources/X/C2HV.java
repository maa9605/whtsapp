package X;

import android.view.ViewTreeObserver;
import com.whatsapp.location.WaMapView;

/* renamed from: X.2HV  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2HV implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C41471ty A00;
    public final /* synthetic */ WaMapView A01;

    public C2HV(WaMapView waMapView, C41471ty c41471ty) {
        this.A01 = waMapView;
        this.A00 = c41471ty;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        WaMapView waMapView = this.A01;
        C0SD c0sd = waMapView.A01;
        if (c0sd != null) {
            c0sd.getViewTreeObserver().removeOnPreDrawListener(this);
            waMapView.A01.post(new RunnableEBaseShape3S0100000_I0_3(this, 38));
            return true;
        }
        throw null;
    }
}
