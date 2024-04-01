package X;

import android.media.Image;
import android.media.ImageReader;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;

/* renamed from: X.356  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass356 implements InterfaceC57222ot, ImageReader.OnImageAvailableListener {
    public ByteBuffer A00;
    public final C57212os A01 = new C57212os();
    public final /* synthetic */ C2L5 A02;

    public AnonymousClass356(C2L5 c2l5) {
        this.A02 = c2l5;
    }

    @Override // X.InterfaceC57222ot
    public C57212os A8D() {
        int[] iArr;
        C57172ol c57172ol = this.A02.A0g;
        synchronized (c57172ol) {
            while (c57172ol.A04 == null) {
                try {
                    c57172ol.wait();
                } catch (InterruptedException unused) {
                    c57172ol.A01();
                    return null;
                }
            }
            if (c57172ol.A04.A01.getAndIncrement() > 0 && c57172ol.A04.A02 != null) {
                C57162ok c57162ok = c57172ol.A04;
                try {
                    if (c57162ok != null) {
                        try {
                            Image image = c57162ok.A02;
                            if (image != null) {
                                int width = image.getWidth();
                                int height = image.getHeight();
                                int i = 640;
                                int i2 = 480;
                                for (int i3 : C2L5.A0o) {
                                    i = (i3 * width) >> 3;
                                    i2 = (i3 * height) >> 3;
                                    if (i >= 640 && i2 >= 480) {
                                        break;
                                    }
                                }
                                int i4 = i * i2;
                                ByteBuffer byteBuffer = this.A00;
                                if (byteBuffer == null || byteBuffer.capacity() != i4) {
                                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i4);
                                    this.A00 = allocateDirect;
                                    C57212os c57212os = this.A01;
                                    c57212os.A02 = allocateDirect.array();
                                    c57212os.A01 = i;
                                    c57212os.A00 = i2;
                                }
                                Image.Plane plane = image.getPlanes()[0];
                                VideoFrameConverter.scalePlane(plane.getBuffer(), plane.getRowStride(), width, height, this.A00, i, i, i2);
                                synchronized (c57172ol) {
                                    c57162ok.A00();
                                }
                                c57172ol.A01();
                                return this.A01;
                            }
                            throw null;
                        } catch (IllegalStateException e) {
                            Log.e("cameraview2/qr/get", e);
                            synchronized (c57172ol) {
                                c57162ok.A00();
                                c57172ol.A01();
                                return null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    synchronized (c57172ol) {
                        c57162ok.A00();
                        c57172ol.A01();
                        throw th;
                    }
                }
            } else {
                c57172ol.A04.A00();
            }
        }
        return null;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        C57162ok c57162ok;
        C2L5 c2l5 = this.A02;
        synchronized (c2l5) {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage == null) {
                return;
            }
            int i = c2l5.A0W.get();
            if (C2L5.A0J(c2l5, i, true)) {
                C2L5.A0E(c2l5, acquireLatestImage);
            } else if (i == 1) {
                C57172ol c57172ol = c2l5.A0g;
                long timestamp = acquireLatestImage.getTimestamp();
                boolean z = c2l5.A0Y ? false : true;
                synchronized (c57172ol) {
                    if (c57172ol.A00) {
                        if (c57172ol.A01) {
                            c57162ok = c57172ol.A00(timestamp);
                        } else {
                            c57162ok = new C57162ok(false);
                        }
                        c57162ok.A02 = acquireLatestImage;
                        if (z) {
                            if (c57172ol.A04 == null) {
                                c57172ol.A04 = c57162ok;
                                c57172ol.A04.A01.getAndIncrement();
                                c57172ol.notify();
                            } else if (!c57172ol.A01) {
                            }
                        }
                        c57172ol.A02();
                    }
                    acquireLatestImage.close();
                }
            } else {
                acquireLatestImage.close();
            }
        }
    }
}
