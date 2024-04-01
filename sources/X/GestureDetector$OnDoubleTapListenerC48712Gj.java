package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.2Gj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class GestureDetector$OnDoubleTapListenerC48712Gj implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ MediaComposerFragment A00;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetector$OnDoubleTapListenerC48712Gj(MediaComposerFragment mediaComposerFragment) {
        this.A00 = mediaComposerFragment;
    }

    public void A00() {
        MediaComposerFragment mediaComposerFragment = this.A00;
        C2EN A0y = mediaComposerFragment.A0y();
        if (A0y != null) {
            A0y.AKP();
        }
        mediaComposerFragment.A0A.A0G.setEnabled(true);
    }

    public void A01() {
        MediaComposerFragment mediaComposerFragment = this.A00;
        C2EN A0y = mediaComposerFragment.A0y();
        if (A0y != null) {
            A0y.AKQ();
        }
        mediaComposerFragment.A0A.A0G.setEnabled(false);
    }
}
