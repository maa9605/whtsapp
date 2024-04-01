package X;

import android.graphics.Bitmap;
import com.facebook.animated.webp.WebPImage;

/* renamed from: X.3YE  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3YE {
    public int A00;
    public long A01;
    public final Bitmap A02;
    public final Bitmap A03;
    public final C3YB A04;
    public final C44091yV A05;
    public final C3YF A06;

    public C3YE(String str, Bitmap bitmap, WebPImage webPImage, C44091yV c44091yV, int i, int i2) {
        this.A05 = c44091yV;
        this.A02 = bitmap;
        this.A06 = new C3YF(webPImage.getFrameCount(), webPImage.getFrameDurations());
        this.A04 = new C3YB(str, bitmap, webPImage, i, i2);
        this.A03 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }
}
