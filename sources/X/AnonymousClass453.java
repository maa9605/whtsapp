package X;

import android.hardware.camera2.CameraCaptureSession;
import android.media.Image;
import android.media.ImageReader;
import java.nio.ByteBuffer;

/* renamed from: X.453  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass453 extends CameraCaptureSession.CaptureCallback implements C44C {
    public final ImageReader.OnImageAvailableListener A00 = new ImageReader.OnImageAvailableListener() { // from class: X.43f
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image acquireNextImage = imageReader.acquireNextImage();
            if (acquireNextImage == null) {
                AnonymousClass453 anonymousClass453 = AnonymousClass453.this;
                anonymousClass453.A04 = Boolean.FALSE;
                anonymousClass453.A03 = new AnonymousClass435("Could not retrieve captured image from reader.");
                return;
            }
            ByteBuffer buffer = acquireNextImage.getPlanes()[0].getBuffer();
            buffer.rewind();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            acquireNextImage.close();
            AnonymousClass453 anonymousClass4532 = AnonymousClass453.this;
            anonymousClass4532.A04 = Boolean.TRUE;
            anonymousClass4532.A05 = bArr;
            anonymousClass4532.A02.A01();
        }
    };
    public final InterfaceC884443d A01 = new InterfaceC884443d() { // from class: X.452
        @Override // X.InterfaceC884443d
        public void APe() {
            AnonymousClass453 anonymousClass453 = AnonymousClass453.this;
            anonymousClass453.A04 = Boolean.FALSE;
            anonymousClass453.A03 = new AnonymousClass435("Photo capture failed. Still capture timed out.");
        }
    };
    public final C884543e A02;
    public volatile AnonymousClass435 A03;
    public volatile Boolean A04;
    public volatile byte[] A05;

    public AnonymousClass453() {
        C884543e c884543e = new C884543e();
        this.A02 = c884543e;
        c884543e.A01 = this.A01;
        c884543e.A02(10000L);
    }

    @Override // X.C44C
    public void A5k() {
        this.A02.A00();
    }

    @Override // X.C44C
    public Object ACt() {
        if (this.A04 != null) {
            if (this.A04.booleanValue()) {
                return this.A05;
            }
            throw this.A03;
        }
        throw new IllegalStateException("Photo capture operation hasn't completed yet.");
    }
}
