package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.31I  reason: invalid class name */
/* loaded from: classes2.dex */
public class C31I extends RunnableEmptyBase implements Runnable {
    public long A00;
    public boolean A01;
    public final PhotoView A02;

    public C31I(PhotoView photoView) {
        this.A02 = photoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.A01) {
            return;
        }
        long j = this.A00;
        if (j == 0) {
            j = System.currentTimeMillis();
            this.A00 = j;
        }
        if (((float) (System.currentTimeMillis() - j)) / ((float) 0) >= 1.0f) {
            this.A01 = true;
            PhotoView photoView = this.A02;
            photoView.invalidate();
            if (this.A01) {
                return;
            }
            photoView.post(this);
            return;
        }
        throw null;
    }
}
