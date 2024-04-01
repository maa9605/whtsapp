package X;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1nT */
/* loaded from: classes.dex */
public final class C38051nT extends C0HV {
    public final MediaPlayer A00;
    public final Handler A01;

    public C38051nT(int i) {
        Looper myLooper = Looper.myLooper();
        this.A01 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A00 = mediaPlayer;
        mediaPlayer.setAudioStreamType(i);
    }

    @Override // X.C0HV
    public int A01() {
        return this.A00.getCurrentPosition();
    }

    @Override // X.C0HV
    public int A02() {
        return this.A00.getDuration();
    }

    @Override // X.C0HV
    public void A03() {
        this.A00.pause();
    }

    @Override // X.C0HV
    public void A04() {
        this.A00.prepare();
    }

    @Override // X.C0HV
    public void A05() {
        this.A01.postDelayed(new RunnableEBaseShape9S0100000_I1_1(this, 20), 100L);
    }

    @Override // X.C0HV
    public void A06() {
        this.A00.start();
    }

    @Override // X.C0HV
    public void A07() {
        this.A00.start();
    }

    @Override // X.C0HV
    public void A08() {
        this.A00.stop();
    }

    @Override // X.C0HV
    public void A09(int i) {
        this.A00.seekTo(i);
    }

    @Override // X.C0HV
    public void A0A(MediaPlayer.OnErrorListener onErrorListener) {
        this.A00.setOnErrorListener(onErrorListener);
    }

    @Override // X.C0HV
    public boolean A0B() {
        return this.A00.isPlaying();
    }

    @Override // X.C0HV
    public boolean A0C(float f, AbstractC000600i abstractC000600i) {
        float f2 = -1.0f;
        try {
            MediaPlayer mediaPlayer = this.A00;
            PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
            playbackParams.allowDefaults();
            f2 = playbackParams.getSpeed();
            mediaPlayer.setPlaybackParams(playbackParams.setSpeed(f));
            return true;
        } catch (IllegalArgumentException | IllegalStateException e) {
            StringBuilder sb = new StringBuilder("currSpeed: ");
            sb.append(f2);
            sb.append(" newSpeed: ");
            sb.append(f);
            sb.append(" ");
            sb.append(e.toString());
            abstractC000600i.A09("audioplayer/setPlaybackSpeed failed", sb.toString(), true);
            return false;
        }
    }
}
