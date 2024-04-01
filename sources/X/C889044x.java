package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;

/* renamed from: X.44x */
/* loaded from: classes3.dex */
public class C889044x extends CameraCaptureSession.CaptureCallback implements C44C {
    public static final int[] A0G = new int[18];
    public CameraCaptureSession A00;
    public C887944m A01;
    public AnonymousClass435 A02;
    public C888444r A03;
    public C888844v A04;
    public InterfaceC884343c A05;
    public AnonymousClass440 A06;
    public Boolean A07;
    public Integer A08;
    public Long A09;
    public final C884543e A0B;
    public volatile boolean A0D;
    public volatile boolean A0F;
    public volatile int A0C = 0;
    public final InterfaceC884443d A0A = new InterfaceC884443d() { // from class: X.44w
        {
            C889044x.this = this;
        }

        @Override // X.InterfaceC884443d
        public void APe() {
            C889044x c889044x = C889044x.this;
            if (c889044x.A0E) {
                if (c889044x.A0C != 1 && c889044x.A0C != 7) {
                    if (c889044x.A0C == 2 || c889044x.A0C == 3 || c889044x.A0C == 4) {
                        c889044x.A0C = 0;
                        return;
                    }
                    return;
                }
                c889044x.A0C = 0;
                c889044x.A07 = Boolean.FALSE;
                c889044x.A02 = new AnonymousClass435("Failed to start operation. Operation timed out.");
            }
        }
    };
    public volatile boolean A0E = true;

    public C889044x() {
        C884543e c884543e = new C884543e();
        this.A0B = c884543e;
        c884543e.A01 = this.A0A;
    }

    public final void A00(CameraCaptureSession cameraCaptureSession) {
        if (this.A0C == 1) {
            this.A0C = 0;
            this.A07 = Boolean.TRUE;
            this.A00 = cameraCaptureSession;
            this.A0B.A01();
            InterfaceC884343c interfaceC884343c = this.A05;
            if (interfaceC884343c != null) {
                interfaceC884343c.ANL();
                return;
            }
            return;
        }
        throw new RuntimeException("Starting preview outside BLOCK_STATE_STARTING_PREVIEW state");
    }

    public final void A01(CameraCaptureSession cameraCaptureSession) {
        if (this.A0C == 7) {
            this.A0C = 0;
            this.A07 = Boolean.TRUE;
            this.A00 = cameraCaptureSession;
            this.A0B.A01();
            return;
        }
        throw new RuntimeException("Starting recording outside BLOCK_STATE_STARTING_RECORD state");
    }

    @Override // X.C44C
    public void A5k() {
        this.A0B.A00();
    }

    @Override // X.C44C
    public Object ACt() {
        Boolean bool = this.A07;
        if (bool != null) {
            if (bool.booleanValue()) {
                return this.A00;
            }
            throw this.A02;
        }
        throw new IllegalStateException("Start Preview operation hasn't completed yet.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x0200, code lost:
        if (r4.intValue() != 4) goto L124;
     */
    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession r18, android.hardware.camera2.CaptureRequest r19, android.hardware.camera2.TotalCaptureResult r20) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C889044x.onCaptureCompleted(android.hardware.camera2.CameraCaptureSession, android.hardware.camera2.CaptureRequest, android.hardware.camera2.TotalCaptureResult):void");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        if (this.A0E) {
            if (this.A0C == 1 || this.A0C == 7) {
                this.A0C = 0;
                this.A07 = Boolean.FALSE;
                StringBuilder A0P = C000200d.A0P("Failed to start operation. Reason: ");
                A0P.append(captureFailure.getReason());
                this.A02 = new AnonymousClass435(A0P.toString());
                if (this.A01 != null) {
                    captureFailure.getReason();
                }
                this.A0B.A01();
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        if (this.A0E) {
            if (this.A0C == 1) {
                A00(cameraCaptureSession);
            } else if (this.A0C != 7) {
            } else {
                A01(cameraCaptureSession);
            }
        }
    }
}
