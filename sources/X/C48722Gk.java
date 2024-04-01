package X;

import android.view.MotionEvent;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.2Gk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48722Gk extends GestureDetector$OnDoubleTapListenerC48712Gj {
    public final /* synthetic */ ImageComposerFragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48722Gk(ImageComposerFragment imageComposerFragment) {
        super(imageComposerFragment);
        this.A00 = imageComposerFragment;
    }

    @Override // X.GestureDetector$OnDoubleTapListenerC48712Gj
    public void A00() {
        super.A00();
        this.A00.A08.A02.A0U = true;
    }

    @Override // X.GestureDetector$OnDoubleTapListenerC48712Gj
    public void A01() {
        super.A01();
        GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq = this.A00.A08.A02;
        gestureDetector$OnGestureListenerC61252vq.A0U = false;
        gestureDetector$OnGestureListenerC61252vq.A09.set(gestureDetector$OnGestureListenerC61252vq.A0A);
        gestureDetector$OnGestureListenerC61252vq.A00 = gestureDetector$OnGestureListenerC61252vq.A05;
        gestureDetector$OnGestureListenerC61252vq.A0L.A00(gestureDetector$OnGestureListenerC61252vq.A09);
    }

    public void A02() {
        ImageComposerFragment imageComposerFragment = this.A00;
        C2EN A0y = imageComposerFragment.A0y();
        if (A0y != null) {
            A0y.AT2(((MediaComposerFragment) imageComposerFragment).A00, imageComposerFragment.A09.A02);
        }
        if (imageComposerFragment.A0W()) {
            if (imageComposerFragment.A09() != null && imageComposerFragment.A07.getDrawable() == null) {
                imageComposerFragment.A09().A0T();
            }
            imageComposerFragment.A07.A06(imageComposerFragment.A09.A04);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        ImageComposerFragment imageComposerFragment = this.A00;
        boolean onDoubleTap = imageComposerFragment.A08.A02.onDoubleTap(motionEvent);
        if (onDoubleTap) {
            imageComposerFragment.A09.A06(true);
        }
        return onDoubleTap;
    }
}
