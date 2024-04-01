package X;

import android.media.MediaPlayer;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.3wy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86173wy extends AbstractC09080cc {
    public final SearchViewModel A00;
    public final AbstractC51892Ys A01;

    public C86173wy(AbstractC51892Ys abstractC51892Ys, SearchViewModel searchViewModel) {
        super(abstractC51892Ys);
        this.A01 = abstractC51892Ys;
        this.A00 = searchViewModel;
    }

    @Override // X.AbstractC09080cc
    public void A0E() {
        AbstractC51892Ys abstractC51892Ys = this.A01;
        if (abstractC51892Ys instanceof C2Yp) {
            MessageGifVideoPlayer messageGifVideoPlayer = ((C2Yp) abstractC51892Ys).A04;
            messageGifVideoPlayer.setVisibility(8);
            MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                messageGifVideoPlayer.A02 = null;
                messageGifVideoPlayer.A0A = false;
                messageGifVideoPlayer.A0B = false;
                messageGifVideoPlayer.A0D = false;
            }
        }
    }

    @Override // X.AbstractC09080cc
    public void A0F(boolean z) {
        this.A01.setScrolling(z);
    }

    @Override // X.AbstractC09080cc
    public void A0G(boolean z) {
        this.A01.setShouldPlay(z);
    }

    @Override // X.AbstractC09080cc
    public boolean A0H() {
        return this.A01 instanceof C2Yp;
    }
}
