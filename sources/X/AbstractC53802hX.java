package X;

import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.util.Log;

/* renamed from: X.2hX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC53802hX {
    public final /* synthetic */ AbstractC53812hY A00;

    public AbstractC53802hX(AbstractC53812hY abstractC53812hY) {
        this.A00 = abstractC53812hY;
    }

    public void A00() {
        StringBuilder sb = new StringBuilder("playbackPage/onPlaybackContentFinished page=");
        sb.append(this);
        sb.append("; host=");
        AbstractC53812hY abstractC53812hY = this.A00;
        sb.append(abstractC53812hY.A0G.A00);
        Log.i(sb.toString());
        StatusPlaybackProgressView statusPlaybackProgressView = abstractC53812hY.A02;
        if (statusPlaybackProgressView.A03 == abstractC53812hY.A0H) {
            statusPlaybackProgressView.A03 = null;
        }
        statusPlaybackProgressView.invalidate();
        if (abstractC53812hY.A04) {
            return;
        }
        abstractC53812hY.A08.post(new RunnableEBaseShape6S0100000_I0_6(this, 37));
    }

    public void A01() {
        StringBuilder sb = new StringBuilder("playbackPage/onPlaybackContentStarted page=");
        sb.append(this);
        sb.append("; host=");
        AbstractC53812hY abstractC53812hY = this.A00;
        sb.append(abstractC53812hY.A0G.A00);
        Log.i(sb.toString());
        abstractC53812hY.A0E();
    }
}
