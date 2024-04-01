package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: X.44y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C889144y extends CameraDevice.StateCallback implements C44C {
    public CameraDevice A00;
    public C887644j A01;
    public C887844l A02;
    public AnonymousClass435 A03;
    public Boolean A04;
    public final C884543e A05;

    public C889144y(C887644j c887644j, C887844l c887844l) {
        this.A01 = c887644j;
        this.A02 = c887844l;
        C884543e c884543e = new C884543e();
        this.A05 = c884543e;
        c884543e.A02(0L);
    }

    @Override // X.C44C
    public void A5k() {
        this.A05.A00();
    }

    @Override // X.C44C
    public Object ACt() {
        Boolean bool = this.A04;
        if (bool != null) {
            if (bool.booleanValue()) {
                return this.A00;
            }
            throw this.A03;
        }
        throw new IllegalStateException("Open Camera operation hasn't completed yet.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) {
        super.onClosed(cameraDevice);
        this.A00 = null;
        final C887644j c887644j = this.A01;
        if (c887644j != null) {
            c887644j.A00.A0k = false;
            C888244p c888244p = c887644j.A00;
            c888244p.A0l = false;
            c888244p.A0f = null;
            c888244p.A0D = null;
            c888244p.A0B = null;
            c888244p.A0C = null;
            C884243b c884243b = c888244p.A0Z;
            c884243b.A04 = null;
            c884243b.A02 = null;
            c884243b.A03 = null;
            c884243b.A01 = null;
            c884243b.A00 = null;
            c884243b.A05 = null;
            c884243b.A07 = null;
            c884243b.A06 = null;
            c888244p.A04 = null;
            c888244p.A0V.A0B = false;
            c888244p.A0U.A00();
            C884143a c884143a = c888244p.A0Y;
            if (c884143a.A0C && (!c888244p.A0m || c884143a.A0B)) {
                try {
                    c888244p.A0b.A01(new Callable() { // from class: X.42s
                        @Override // java.util.concurrent.Callable
                        public Object call() {
                            C887644j.this.A00.A0Y.A00();
                            return null;
                        }
                    }, "on_camera_closed_stop_video_recording", new AbstractC886844b() { // from class: X.45M
                        @Override // X.AbstractC886844b
                        public void A00(Exception exc) {
                            AnonymousClass446.A00();
                        }

                        @Override // X.AbstractC886844b
                        public void A01(Object obj) {
                        }
                    }).get();
                } catch (InterruptedException | ExecutionException unused) {
                    AnonymousClass446.A00();
                }
            }
            C43T c43t = c888244p.A0W;
            if (c43t.A00 != null) {
                synchronized (C43T.A0R) {
                    C889044x c889044x = c43t.A08;
                    if (c889044x != null) {
                        c889044x.A0E = false;
                        c43t.A08 = null;
                    }
                }
                try {
                    c43t.A00.abortCaptures();
                    c43t.A00.close();
                } catch (Exception unused2) {
                }
                c43t.A00 = null;
            }
            String id = cameraDevice.getId();
            C888144o c888144o = c888244p.A0S;
            if (id.equals(c888144o.A00)) {
                c888144o.A01();
                c888144o.A00 = null;
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) {
        if (this.A00 == null) {
            this.A04 = Boolean.FALSE;
            this.A03 = new AnonymousClass435("Could not open camera. Operation disconnected.");
            this.A05.A01();
            return;
        }
        C887844l c887844l = this.A02;
        if (c887844l == null) {
            return;
        }
        C888244p c888244p = c887844l.A00;
        List list = c888244p.A0M.A00;
        UUID uuid = c888244p.A0a.A03;
        c888244p.A0b.A05(uuid, new AnonymousClass431(c888244p, list, 2, "Camera has been disconnected.", uuid));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int i) {
        String str;
        int i2;
        if (this.A00 == null) {
            this.A04 = Boolean.FALSE;
            this.A03 = new AnonymousClass435(C000200d.A0D("Could not open camera. Operation error: ", i));
            this.A05.A01();
            return;
        }
        C887844l c887844l = this.A02;
        if (c887844l == null) {
            return;
        }
        C888244p c888244p = c887844l.A00;
        if (i == 1) {
            str = "Camera in use by higher priority component.";
        } else if (i == 2) {
            str = "There are too many open camera devices.";
        } else if (i == 3) {
            str = "Camera disabled, device policy error.";
        } else if (i == 4 || i == 5) {
            i2 = 100;
            str = "Camera device has encountered a fatal error.";
            List list = c888244p.A0M.A00;
            UUID uuid = c888244p.A0a.A03;
            c888244p.A0b.A05(uuid, new AnonymousClass431(c888244p, list, i2, str, uuid));
        } else {
            str = "Unknown camera error.";
        }
        i2 = 1;
        List list2 = c888244p.A0M.A00;
        UUID uuid2 = c888244p.A0a.A03;
        c888244p.A0b.A05(uuid2, new AnonymousClass431(c888244p, list2, i2, str, uuid2));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        this.A04 = Boolean.TRUE;
        this.A00 = cameraDevice;
        this.A05.A01();
    }
}
