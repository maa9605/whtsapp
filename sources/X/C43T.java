package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.ImageReader;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.43T */
/* loaded from: classes3.dex */
public class C43T {
    public static final Object A0R = new Object();
    public CameraCaptureSession A00;
    public CameraCharacteristics A01;
    public CameraDevice A02;
    public CaptureRequest.Builder A03;
    public ImageReader A04;
    public Surface A05;
    public Surface A06;
    public C886744a A07;
    public C889044x A08;
    public AnonymousClass454 A09;
    public AnonymousClass456 A0A;
    public AnonymousClass457 A0B;
    public AbstractC885543o A0C;
    public boolean A0D;
    public MeteringRectangle[] A0E;
    public MeteringRectangle[] A0F;
    public final AnonymousClass438 A0I;
    public final C43W A0J;
    public final C44I A0N;
    public volatile boolean A0P;
    public volatile boolean A0Q;
    public final AnonymousClass427 A0G = new AnonymousClass427();
    public final AnonymousClass427 A0H = new AnonymousClass427();
    public final List A0O = new ArrayList();
    public final InterfaceC884343c A0L = new InterfaceC884343c() { // from class: X.44s
        {
            C43T.this = this;
        }

        @Override // X.InterfaceC884343c
        public void ANL() {
            final C43T c43t = C43T.this;
            if (c43t != null) {
                AnonymousClass446.A00();
                if (!c43t.A0G.A00.isEmpty()) {
                    C44J.A00(new Runnable() { // from class: X.43L
                        @Override // java.lang.Runnable
                        public void run() {
                            List list = c43t.A0G.A00;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ((C44T) list.get(i)).A00();
                            }
                        }
                    });
                }
                c43t.A0N.A06(new C43O(c43t), "handle_preview_started");
                return;
            }
            throw null;
        }
    };
    public final InterfaceC884343c A0K = new InterfaceC884343c() { // from class: X.44t
        {
            C43T.this = this;
        }

        @Override // X.InterfaceC884343c
        public void ANL() {
            C43T c43t = C43T.this;
            c43t.A0N.A06(new C43O(c43t), "handle_preview_started");
        }
    };
    public final AnonymousClass450 A0M = new AnonymousClass450(new C888744u(this));

    public C43T(C44I c44i, C43W c43w) {
        this.A0N = c44i;
        this.A0J = c43w;
        this.A0I = new AnonymousClass438(c44i);
    }

    public static void A00(CaptureRequest.Builder builder, Rect rect, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, AbstractC885543o abstractC885543o) {
        if (((Boolean) abstractC885543o.A00(AbstractC885543o.A0J)).booleanValue()) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        if (((Boolean) abstractC885543o.A00(AbstractC885543o.A0E)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        if (((Boolean) abstractC885543o.A00(AbstractC885543o.A0F)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
    }

    public static boolean A01(List list, int[] iArr) {
        if (list != null && iArr != null && (iArr[0] != 0 || iArr[1] != 0)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public final CameraCaptureSession A02(final List list, String str) {
        this.A0I.A01("Method createCaptureSession must be called on Optic Thread");
        AnonymousClass450 anonymousClass450 = this.A0M;
        anonymousClass450.A03 = 1;
        anonymousClass450.A02.A02(0L);
        return (CameraCaptureSession) this.A0N.A03(new Callable() { // from class: X.43Q
            {
                C43T.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C43T c43t = C43T.this;
                CameraDevice cameraDevice = c43t.A02;
                AnonymousClass454 anonymousClass454 = c43t.A09;
                List<Surface> list2 = list;
                if (anonymousClass454 != null) {
                    AnonymousClass450 anonymousClass4502 = c43t.A0M;
                    cameraDevice.createCaptureSession(list2, anonymousClass4502, null);
                    return anonymousClass4502;
                }
                throw null;
            }
        }, str);
    }

    public CameraCaptureSession A03(boolean z, boolean z2, InterfaceC884343c interfaceC884343c) {
        List asList;
        AnonymousClass438 anonymousClass438 = this.A0I;
        anonymousClass438.A00("Cannot start preview.");
        C889044x c889044x = this.A08;
        c889044x.A0C = 1;
        c889044x.A05 = interfaceC884343c;
        c889044x.A07 = Boolean.TRUE;
        c889044x.A02 = null;
        anonymousClass438.A00("Cannot get output surfaces.");
        if (z) {
            Surface[] surfaceArr = new Surface[3];
            surfaceArr[0] = this.A05;
            surfaceArr[1] = this.A04.getSurface();
            ImageReader imageReader = this.A0J.A01;
            if (imageReader != null) {
                surfaceArr[2] = imageReader.getSurface();
                asList = Arrays.asList(surfaceArr);
            } else {
                throw new IllegalStateException("Getting image reader surface without initialize.");
            }
        } else {
            asList = Arrays.asList(this.A05, this.A04.getSurface());
        }
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
        }
        this.A00 = A02(asList, "start_preview_on_camera_handler_thread");
        A06(z);
        A07(z2, "Preview session was closed while starting preview");
        this.A0P = true;
        return this.A00;
    }

    public void A04() {
        this.A0I.A00("Cannot refresh camera preview.");
        try {
            A07(false, null);
        } catch (Exception unused) {
        }
    }

    public void A05() {
        C888844v c888844v;
        this.A0I.A00("Cannot update frame metadata collection.");
        AnonymousClass456 anonymousClass456 = this.A0A;
        if (anonymousClass456 != null) {
            boolean booleanValue = ((Boolean) anonymousClass456.A00(AbstractC886243v.A0O)).booleanValue();
            C889044x c889044x = this.A08;
            if (booleanValue) {
                c888844v = this.A0J.A07;
                if (c889044x.A06 == null) {
                    c889044x.A06 = new AnonymousClass440();
                }
            } else {
                c888844v = null;
            }
            c889044x.A0F = booleanValue;
            c889044x.A04 = c888844v;
        }
    }

    public void A06(boolean z) {
        this.A0I.A00("Cannot update preview builder for CPU frames.");
        CaptureRequest.Builder builder = this.A03;
        if (builder != null) {
            if (z) {
                ImageReader imageReader = this.A0J.A01;
                if (imageReader != null) {
                    builder.addTarget(imageReader.getSurface());
                    this.A0Q = true;
                    return;
                }
                throw new IllegalStateException("Getting image reader surface without initialize.");
            }
            ImageReader imageReader2 = this.A0J.A01;
            if (imageReader2 != null) {
                builder.removeTarget(imageReader2.getSurface());
                this.A0Q = false;
                return;
            }
            throw new IllegalStateException("Getting image reader surface without initialize.");
        }
    }

    public final void A07(boolean z, String str) {
        CaptureRequest.Builder builder;
        this.A0I.A01("Method updatePreviewView must be invoked in the Optic background thread");
        synchronized (A0R) {
            CameraCaptureSession cameraCaptureSession = this.A00;
            if (cameraCaptureSession != null && (builder = this.A03) != null) {
                cameraCaptureSession.setRepeatingRequest(builder.build(), this.A08, null);
            } else if (z) {
                if (str == null) {
                    str = "Trying to update preview view while preview is closed";
                }
                throw new AnonymousClass435(str);
            }
        }
    }

    public void A08(boolean z, boolean z2) {
        InterfaceC884343c interfaceC884343c;
        AnonymousClass438 anonymousClass438 = this.A0I;
        anonymousClass438.A01("Method restartPreview() must run on the Optic Background Thread.");
        if (this.A08 != null) {
            anonymousClass438.A01("Can only check if the prepared on the Optic thread");
            if (anonymousClass438.A00) {
                C889044x c889044x = this.A08;
                if (c889044x.A0E && c889044x.A0C == 1) {
                    this.A0O.add(new C43S(z, z2));
                    return;
                }
                if (z2) {
                    interfaceC884343c = this.A0L;
                } else {
                    interfaceC884343c = this.A0K;
                }
                this.A00 = A03(z, false, interfaceC884343c);
            }
        }
    }

    public final boolean A09(int i) {
        int[] iArr = (int[]) this.A01.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
