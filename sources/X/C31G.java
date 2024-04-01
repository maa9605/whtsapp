package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.31G  reason: invalid class name */
/* loaded from: classes2.dex */
public class C31G extends RunnableEmptyBase implements Runnable {
    public float A00;
    public long A01;
    public boolean A02;
    public final PhotoView A03;

    public C31G(PhotoView photoView) {
        this.A03 = photoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.A02) {
            return;
        }
        float f = this.A00;
        if (f != 0.0f) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.A01;
            float f2 = 0.0f * ((float) (j != -1 ? currentTimeMillis - j : 0L));
            if ((f < 0.0f && f + f2 > 0.0f) || (f > 0.0f && f + f2 < 0.0f)) {
                f2 = 0.0f - f;
            }
            PhotoView photoView = this.A03;
            photoView.A07 += f2;
            photoView.A0B.postRotate(f2, photoView.getWidth() >> 1, photoView.getHeight() >> 1);
            photoView.setImageMatrix(photoView.A0B);
            float f3 = this.A00 + f2;
            this.A00 = f3;
            if (f3 == 0.0f) {
                this.A02 = true;
                photoView.A07 = Math.round(photoView.A07);
                photoView.A08(true);
                photoView.requestLayout();
                photoView.invalidate();
            }
            this.A01 = currentTimeMillis;
        }
        if (this.A02) {
            return;
        }
        this.A03.post(this);
    }
}
