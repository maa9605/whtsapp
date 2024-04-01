package X;

import android.view.animation.AlphaAnimation;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.3L1  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3L1 extends C48792Gs {
    public final /* synthetic */ VideoComposerFragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3L1(VideoComposerFragment videoComposerFragment) {
        super(videoComposerFragment);
        this.A00 = videoComposerFragment;
    }

    @Override // X.C48792Gs
    public void A01() {
        super.A01();
        AlphaAnimation A03 = C000200d.A03(1.0f, 0.0f, 300L);
        VideoComposerFragment videoComposerFragment = this.A00;
        videoComposerFragment.A0A.setVisibility(4);
        videoComposerFragment.A0A.startAnimation(A03);
    }

    @Override // X.C48792Gs
    public void A02() {
        super.A02();
        VideoComposerFragment videoComposerFragment = this.A00;
        if (videoComposerFragment.A0A.getVisibility() != 0) {
            AlphaAnimation A03 = C000200d.A03(0.0f, 1.0f, 300L);
            videoComposerFragment.A0A.setVisibility(0);
            videoComposerFragment.A0A.startAnimation(A03);
        }
    }
}
