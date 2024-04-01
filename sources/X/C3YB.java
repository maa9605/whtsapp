package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.animated.webp.WebPFrame;
import com.facebook.animated.webp.WebPImage;
import com.whatsapp.util.Log;

/* renamed from: X.3YB */
/* loaded from: classes2.dex */
public class C3YB {
    public int A00 = 0;
    public Bitmap A01;
    public Bitmap A02;
    public Canvas A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Bitmap A08;
    public final Paint A09;
    public final WebPImage A0A;
    public final String A0B;

    public C3YB(String str, Bitmap bitmap, WebPImage webPImage, int i, int i2) {
        this.A0B = str;
        this.A0A = webPImage;
        this.A08 = bitmap;
        Paint paint = new Paint();
        this.A09 = paint;
        paint.setColor(0);
        this.A09.setStyle(Paint.Style.FILL);
        this.A09.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A07 = webPImage.getFrameCount();
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i / webPImage.getWidth();
    }

    public synchronized Bitmap A00(C44071yT c44071yT, Bitmap bitmap) {
        Bitmap bitmap2;
        A01();
        if (this.A01 != null) {
            if (this.A03 != null) {
                int i = this.A00;
                this.A00 = (i + 1) % this.A07;
                WebPImage webPImage = this.A0A;
                C19300vC frameInfo = webPImage.getFrameInfo(i);
                WebPFrame frame = webPImage.getFrame(this.A00);
                C19300vC frameInfo2 = webPImage.getFrameInfo(this.A00);
                int i2 = this.A00;
                if (i2 == 0) {
                    bitmap2 = this.A08;
                } else {
                    String str = this.A0B;
                    if (c44071yT != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("_frame_");
                        sb.append(i2);
                        String obj = sb.toString();
                        C0JH A04 = c44071yT.A00.A04();
                        bitmap2 = (Bitmap) A04.A01(obj);
                        if (bitmap2 != null && bitmap2.isRecycled()) {
                            A04.A04(obj);
                            bitmap2 = null;
                        }
                    } else {
                        throw null;
                    }
                }
                if (bitmap2 != null) {
                    this.A02 = bitmap2;
                    this.A01.eraseColor(0);
                    this.A03.drawBitmap(this.A02, 0.0f, 0.0f, (Paint) null);
                    frame.dispose();
                    return this.A02;
                }
                bitmap.eraseColor(0);
                float f = this.A04;
                frame.renderFrame((int) Math.ceil(frame.getWidth() * f), (int) Math.ceil(frame.getHeight() * f), bitmap);
                if (frameInfo.A05 == EnumC19290vB.DISPOSE_TO_BACKGROUND) {
                    A02(this.A03, frameInfo);
                }
                if (frameInfo2.A04 == EnumC19280vA.NO_BLEND) {
                    A02(this.A03, frameInfo2);
                }
                int xOffset = frame.getXOffset();
                int yOffset = frame.getYOffset();
                frame.dispose();
                this.A03.drawBitmap(bitmap, xOffset * f, yOffset * f, (Paint) null);
                try {
                    Bitmap bitmap3 = this.A01;
                    Bitmap copy = bitmap3.copy(bitmap3.getConfig(), false);
                    this.A02 = copy;
                    c44071yT.A00(this.A0B, this.A00, copy);
                } catch (OutOfMemoryError e) {
                    this.A02 = this.A01;
                    Log.e("AnimatedWebpRenderer/renderNextFrame/OutofMemoryError: ", e);
                }
                return this.A02;
            }
            throw null;
        }
        throw null;
    }

    public final synchronized void A01() {
        if (this.A01 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(this.A06, this.A05, Bitmap.Config.ARGB_8888);
            this.A01 = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            this.A03 = canvas;
            canvas.drawBitmap(this.A08, 0.0f, 0.0f, (Paint) null);
        }
    }

    public final void A02(Canvas canvas, C19300vC c19300vC) {
        int i = c19300vC.A02;
        float f = this.A04;
        int i2 = c19300vC.A03;
        canvas.drawRect(i * f, i2 * f, (i + c19300vC.A01) * f, (i2 + c19300vC.A00) * f, this.A09);
    }

    public synchronized void finalize() {
        this.A0A.dispose();
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
            this.A01 = null;
        }
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.A02 = null;
        }
        super.finalize();
    }
}
