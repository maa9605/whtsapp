package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.450  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass450 extends CameraCaptureSession.StateCallback implements C44C {
    public final C888744u A00;
    public final C884543e A02;
    public volatile CameraCaptureSession A04;
    public volatile Boolean A05;
    public volatile int A03 = 0;
    public final InterfaceC884443d A01 = new InterfaceC884443d() { // from class: X.44z
        @Override // X.InterfaceC884443d
        public void APe() {
            AnonymousClass450 anonymousClass450 = AnonymousClass450.this;
            anonymousClass450.A03 = 0;
            anonymousClass450.A05 = Boolean.FALSE;
        }
    };

    public AnonymousClass450(C888744u c888744u) {
        this.A00 = c888744u;
        C884543e c884543e = new C884543e();
        this.A02 = c884543e;
        c884543e.A01 = this.A01;
    }

    @Override // X.C44C
    public void A5k() {
        this.A02.A00();
    }

    @Override // X.C44C
    public Object ACt() {
        if (this.A05 != null) {
            if (this.A05.booleanValue()) {
                return this.A04;
            }
            throw new AnonymousClass435("Failed to configure preview.");
        }
        throw new IllegalStateException("Configure Preview operation hasn't completed yet.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        super.onActive(cameraCaptureSession);
        final C888744u c888744u = this.A00;
        if (c888744u != null) {
            c888744u.A00.A0N.A01(new Callable() { // from class: X.43N
                @Override // java.util.concurrent.Callable
                public Object call() {
                    final C43T c43t = C888744u.this.A00;
                    c43t.A0I.A01("Method onCameraSessionActive must be called on Optic Thread.");
                    final AnonymousClass451 anonymousClass451 = new AnonymousClass451();
                    c43t.A0N.A03(new Callable() { // from class: X.43R
                        @Override // java.util.concurrent.Callable
                        public Object call() {
                            C43T c43t2 = C43T.this;
                            if (c43t2.A00 != null) {
                                CaptureRequest.Builder builder = c43t2.A03;
                            }
                            AnonymousClass451 anonymousClass4512 = anonymousClass451;
                            anonymousClass4512.A00.A01();
                            return anonymousClass4512;
                        }
                    }, "camera_session_active_on_camera_handler_thread");
                    return null;
                }
            }, "camera_session_active", new C45I());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        if (this.A03 == 2) {
            this.A03 = 0;
            this.A05 = Boolean.TRUE;
            this.A04 = cameraCaptureSession;
            this.A02.A01();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        if (this.A03 == 1) {
            this.A03 = 0;
            this.A05 = Boolean.FALSE;
            this.A02.A01();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        if (this.A03 == 1) {
            this.A03 = 0;
            this.A05 = Boolean.TRUE;
            this.A04 = cameraCaptureSession;
            this.A02.A01();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        if (this.A03 == 3) {
            this.A03 = 0;
            this.A05 = Boolean.TRUE;
            this.A04 = cameraCaptureSession;
            this.A02.A01();
        }
    }
}
