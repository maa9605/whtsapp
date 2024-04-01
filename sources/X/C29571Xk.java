package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.1Xk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29571Xk {
    public Bitmap A00;
    public final Rect A03;
    public final C0JC A04;
    public final C19310vD A05;
    public final C19360vJ A06;
    public final boolean A07;
    public final int[] A08;
    public final C19300vC[] A09;
    public final Rect A02 = new Rect();
    public final Rect A01 = new Rect();

    public C29571Xk(C19360vJ c19360vJ, C19310vD c19310vD, Rect rect, boolean z) {
        int length;
        this.A06 = c19360vJ;
        this.A05 = c19310vD;
        C0JC c0jc = c19310vD.A00;
        this.A04 = c0jc;
        int[] frameDurations = c0jc.getFrameDurations();
        this.A08 = frameDurations;
        C19360vJ c19360vJ2 = this.A06;
        if (c19360vJ2 != null) {
            int i = 0;
            while (true) {
                length = frameDurations.length;
                if (i >= length) {
                    break;
                }
                if (frameDurations[i] < 11) {
                    frameDurations[i] = 100;
                }
                i++;
            }
            if (c19360vJ2 != null) {
                for (int i2 = 0; i2 < length; i2++) {
                }
                for (int i3 = 0; i3 < length; i3++) {
                }
                this.A03 = A00(this.A04, rect);
                this.A07 = z;
                this.A09 = new C19300vC[this.A04.getFrameCount()];
                for (int i4 = 0; i4 < this.A04.getFrameCount(); i4++) {
                    this.A09[i4] = this.A04.getFrameInfo(i4);
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public static Rect A00(C0JC c0jc, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, c0jc.getWidth(), c0jc.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), c0jc.getWidth()), Math.min(rect.height(), c0jc.getHeight()));
    }

    public final synchronized void A01(int i, int i2) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null && ((bitmap2.getWidth() < i || this.A00.getHeight() < i2) && (bitmap = this.A00) != null)) {
            bitmap.recycle();
            this.A00 = null;
        }
        Bitmap bitmap3 = this.A00;
        if (bitmap3 == null) {
            bitmap3 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.A00 = bitmap3;
        }
        bitmap3.eraseColor(0);
    }

    public void A02(int i, Canvas canvas) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        C0JC c0jc = this.A04;
        C0JE frame = c0jc.getFrame(i);
        try {
            if (c0jc.doesRenderSupportScaling()) {
                Rect rect = this.A03;
                double width2 = rect.width() / c0jc.getWidth();
                double height2 = rect.height() / c0jc.getHeight();
                int round = (int) Math.round(frame.getWidth() * width2);
                int round2 = (int) Math.round(frame.getHeight() * height2);
                int xOffset2 = (int) (frame.getXOffset() * width2);
                int yOffset2 = (int) (frame.getYOffset() * height2);
                synchronized (this) {
                    int width3 = rect.width();
                    int height3 = rect.height();
                    A01(width3, height3);
                    frame.renderFrame(round, round2, this.A00);
                    Rect rect2 = this.A02;
                    rect2.set(0, 0, width3, height3);
                    Rect rect3 = this.A01;
                    rect3.set(xOffset2, yOffset2, width3 + xOffset2, height3 + yOffset2);
                    canvas.drawBitmap(this.A00, rect2, rect3, (Paint) null);
                }
            } else {
                if (this.A07) {
                    float max = Math.max(frame.getWidth() / Math.min(frame.getWidth(), canvas.getWidth()), frame.getHeight() / Math.min(frame.getHeight(), canvas.getHeight()));
                    width = (int) (frame.getWidth() / max);
                    height = (int) (frame.getHeight() / max);
                    xOffset = (int) (frame.getXOffset() / max);
                    yOffset = (int) (frame.getYOffset() / max);
                } else {
                    width = frame.getWidth();
                    height = frame.getHeight();
                    xOffset = frame.getXOffset();
                    yOffset = frame.getYOffset();
                }
                synchronized (this) {
                    A01(width, height);
                    frame.renderFrame(width, height, this.A00);
                    canvas.save();
                    canvas.translate(xOffset, yOffset);
                    canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
            }
        } finally {
            frame.dispose();
        }
    }
}
