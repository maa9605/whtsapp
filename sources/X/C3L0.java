package X;

import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.3L0  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3L0 extends C48792Gs {
    public final /* synthetic */ ImageComposerFragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3L0(ImageComposerFragment imageComposerFragment) {
        super(imageComposerFragment);
        this.A00 = imageComposerFragment;
    }

    @Override // X.C48792Gs
    public void A01() {
        this.A00.A0y().AJV();
    }

    @Override // X.C48792Gs
    public void A02() {
        ImageComposerFragment imageComposerFragment = this.A00;
        imageComposerFragment.A0y().AJW();
        GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq = imageComposerFragment.A08.A02;
        if (gestureDetector$OnGestureListenerC61252vq.A00 <= gestureDetector$OnGestureListenerC61252vq.A03) {
            if (((MediaComposerFragment) imageComposerFragment).A0A.A0C.A06.getVisibility() == 0) {
                return;
            }
            imageComposerFragment.A09.A01();
        }
    }
}
