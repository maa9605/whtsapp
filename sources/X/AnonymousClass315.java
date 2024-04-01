package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.315 */
/* loaded from: classes2.dex */
public abstract class AnonymousClass315 implements View.OnTouchListener {
    public final Matrix A00 = new Matrix();
    public final PhotoView A01;
    public final AnonymousClass097 A02;

    public AnonymousClass315(AnonymousClass097 anonymousClass097, PhotoView photoView) {
        this.A02 = anonymousClass097;
        this.A01 = photoView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            PhotoView photoView = this.A01;
            Bitmap photo = photoView.getPhoto();
            if (photo != null) {
                Matrix imageMatrix = photoView.getImageMatrix();
                Matrix matrix = this.A00;
                imageMatrix.invert(matrix);
                float[] fArr = {motionEvent.getRawX() - photoView.getLeft(), motionEvent.getRawY() - photoView.getTop()};
                float[] fArr2 = {photo.getWidth(), photo.getHeight()};
                matrix.mapPoints(fArr);
                InteractiveAnnotation A0i = AnonymousClass088.A0i(this.A02, fArr, fArr2);
                if (A0i != null) {
                    if (this instanceof C3IO) {
                        C3IO c3io = (C3IO) this;
                        MediaViewFragment.A04(c3io.A00, A0i, c3io.A01);
                        return true;
                    } else if (!(this instanceof C3IN)) {
                        C3IL c3il = (C3IL) this;
                        MediaViewFragment.A04(c3il.A00, A0i, c3il.A01);
                        return true;
                    } else {
                        C3IN c3in = (C3IN) this;
                        MediaViewFragment.A04(c3in.A00, A0i, c3in.A01);
                        return true;
                    }
                }
            }
            if (this instanceof C3IO) {
                C3IO c3io2 = (C3IO) this;
                if (motionEvent.getActionMasked() == 1) {
                    ExoPlaybackControlView exoPlaybackControlView = c3io2.A02;
                    if (exoPlaybackControlView.A07()) {
                        exoPlaybackControlView.A00();
                        return true;
                    }
                    exoPlaybackControlView.A01();
                    exoPlaybackControlView.A06(3000);
                    return true;
                }
            } else if (!(this instanceof C3IN)) {
                C3IL c3il2 = (C3IL) this;
                if (motionEvent.getActionMasked() == 1) {
                    MediaViewFragment mediaViewFragment = c3il2.A00;
                    if (((MediaViewBaseFragment) mediaViewFragment).A0G) {
                        mediaViewFragment.A1A(false, true);
                    } else {
                        mediaViewFragment.A1A(true, true);
                        return true;
                    }
                }
            } else {
                C3IN c3in2 = (C3IN) this;
                if (motionEvent.getActionMasked() == 1) {
                    ExoPlaybackControlView exoPlaybackControlView2 = c3in2.A02;
                    if (exoPlaybackControlView2.A07()) {
                        exoPlaybackControlView2.A00();
                        return true;
                    }
                    exoPlaybackControlView2.A01();
                    exoPlaybackControlView2.A06(3000);
                    return true;
                }
            }
        }
        return true;
    }
}
