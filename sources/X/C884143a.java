package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* renamed from: X.43a */
/* loaded from: classes3.dex */
public class C884143a {
    public long A00;
    public C886744a A01;
    public C43C A02;
    public C43T A03;
    public AnonymousClass456 A04;
    public AbstractC885543o A05;
    public C44N A06;
    public C44O A07;
    public final AnonymousClass438 A08;
    public final C44I A09;
    public volatile CameraDevice A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;

    public C884143a(C44I c44i) {
        this.A09 = c44i;
        this.A08 = new AnonymousClass438(c44i);
    }

    public Exception A00() {
        Surface surface;
        this.A08.A01("Method stopVideoRecording() must be run on the background thread.");
        C44O c44o = this.A07;
        if (c44o != null) {
            try {
                c44o.AVE();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            this.A07 = null;
        } else {
            e = null;
        }
        C43T c43t = this.A03;
        if (c43t != null) {
            c43t.A0I.A01("Can only stop video recording on the Optic thread");
            AnonymousClass438 anonymousClass438 = c43t.A0I;
            anonymousClass438.A01("Can only check if the prepared on the Optic thread");
            if (anonymousClass438.A00) {
                CaptureRequest.Builder builder = c43t.A03;
                if (builder != null && (surface = c43t.A06) != null) {
                    builder.removeTarget(surface);
                }
                c43t.A06 = null;
            }
        }
        this.A06 = null;
        this.A0C = false;
        this.A0B = false;
        return e;
    }
}
