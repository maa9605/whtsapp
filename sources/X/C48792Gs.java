package X;

import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.2Gs */
/* loaded from: classes2.dex */
public class C48792Gs {
    public final /* synthetic */ MediaComposerFragment A00;

    public C48792Gs(MediaComposerFragment mediaComposerFragment) {
        this.A00 = mediaComposerFragment;
    }

    public void A00() {
        if (this instanceof C3L0) {
            ImageComposerFragment imageComposerFragment = ((C3L0) this).A00;
            GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq = imageComposerFragment.A08.A02;
            if (gestureDetector$OnGestureListenerC61252vq.A00 <= gestureDetector$OnGestureListenerC61252vq.A03) {
                imageComposerFragment.A09.A01();
            }
        }
    }

    public void A01() {
        this.A00.A0y().AJV();
    }

    public void A02() {
        this.A00.A0y().AJW();
    }

    public void A03() {
        if (!(this instanceof C3L0)) {
            this.A00.A0y().APg(false);
            return;
        }
        ImageComposerFragment imageComposerFragment = ((C3L0) this).A00;
        C48702Gi c48702Gi = imageComposerFragment.A09;
        boolean A08 = c48702Gi.A08();
        boolean A09 = c48702Gi.A09();
        if (!A08 || !A09) {
            imageComposerFragment.A09.A06(true);
        }
        imageComposerFragment.A0y().APg(imageComposerFragment.A09.A0I);
    }
}
