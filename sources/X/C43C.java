package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.43C */
/* loaded from: classes3.dex */
public class C43C {
    public CameraDevice A00;
    public CameraManager A01;
    public AnonymousClass429 A02;
    public C887744k A03;
    public C43T A04;
    public C884243b A05;
    public AnonymousClass456 A06;
    public AbstractC885543o A07;
    public FutureTask A08;
    public final AnonymousClass438 A09;
    public final C44I A0A;
    public volatile boolean A0B;

    public C43C(C44I c44i) {
        this.A0A = c44i;
        this.A09 = new AnonymousClass438(c44i);
    }

    public synchronized void A00() {
        FutureTask futureTask = this.A08;
        if (futureTask != null) {
            this.A0A.A07(futureTask);
            this.A08 = null;
        }
    }

    public synchronized void A01(long j, final CaptureRequest.Builder builder, final C889044x c889044x) {
        Callable callable = new Callable() { // from class: X.43A
            {
                C43C.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C43C c43c = C43C.this;
                c43c.A09.A00("Cannot schedule reset focus task, not prepared");
                if (c43c.A03.A00.isConnected()) {
                    c43c.A0B = false;
                    c43c.A00();
                    AnonymousClass428 anonymousClass428 = AnonymousClass428.CANCELLED;
                    if (c43c.A02 != null) {
                        C44J.A00(new C43B(c43c, null, anonymousClass428));
                    }
                    C889044x c889044x2 = c889044x;
                    if (c889044x2 != null) {
                        c889044x2.A03 = null;
                    }
                    try {
                        c43c.A02(builder, c889044x2);
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
        };
        A00();
        this.A08 = this.A0A.A00(callable, "reset_focus", j);
    }

    public void A02(CaptureRequest.Builder builder, C889044x c889044x) {
        C884243b c884243b;
        CameraCaptureSession cameraCaptureSession;
        this.A09.A01("Can only reset focus on the Optic thread.");
        C43T c43t = this.A04;
        if (c43t == null || (c884243b = this.A05) == null || builder == null || this.A07 == null || (cameraCaptureSession = c43t.A00) == null) {
            return;
        }
        Rect rect = c884243b.A00;
        MeteringRectangle[] A02 = c884243b.A02(c884243b.A07);
        C884243b c884243b2 = this.A05;
        C43T.A00(builder, rect, A02, c884243b2.A02(c884243b2.A06), this.A07);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        cameraCaptureSession.capture(builder.build(), c889044x, null);
        int A08 = C07K.A08(this.A01, this.A00.getId(), builder, this.A06, this.A07);
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        builder.set(key, 0);
        cameraCaptureSession.setRepeatingRequest(builder.build(), c889044x, null);
        if (A08 == 1) {
            builder.set(key, 1);
            cameraCaptureSession.capture(builder.build(), c889044x, null);
            builder.set(key, 0);
        }
    }
}
