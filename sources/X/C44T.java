package X;

import com.whatsapp.camera.litecamera.LiteCameraView;

/* renamed from: X.44T  reason: invalid class name */
/* loaded from: classes3.dex */
public class C44T {
    public final /* synthetic */ C44W A00;

    public C44T(C44W c44w) {
        this.A00 = c44w;
    }

    public void A00() {
        AnonymousClass473 anonymousClass473 = this.A00.A08;
        if (anonymousClass473 != null) {
            anonymousClass473.A00.A01.A02("LiteCamera");
            LiteCameraView liteCameraView = anonymousClass473.A00;
            if (liteCameraView.A06 && !liteCameraView.AFI()) {
                C44W c44w = liteCameraView.A0A;
                C46V c46v = liteCameraView.A0B;
                c44w.A04(c46v.A01);
                if (!c46v.A08) {
                    c46v.A03.A02();
                    c46v.A08 = true;
                    return;
                }
                return;
            }
            liteCameraView.A0B.A00();
        }
    }
}
