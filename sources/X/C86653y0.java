package X;

import android.content.Context;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.MediaController;

/* renamed from: X.3y0 */
/* loaded from: classes2.dex */
public class C86653y0 extends AbstractC84033t5 implements MediaController.MediaPlayerControl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaPlayer.OnCompletionListener A06;
    public MediaPlayer.OnErrorListener A07;
    public MediaPlayer.OnPreparedListener A08;
    public MediaPlayer A09;
    public Surface A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Matrix A0I;

    public C86653y0(Context context) {
        super(context);
        this.A02 = -1;
        this.A01 = 0;
        this.A0I = new Matrix();
        this.A00 = 0;
        this.A03 = 0;
        A00();
    }

    public void A00() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A09 = mediaPlayer;
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: X.3ak
            {
                C86653y0.this = this;
            }

            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i, int i2) {
                C86653y0 c86653y0 = C86653y0.this;
                c86653y0.A05 = i;
                c86653y0.A04 = i2;
                if (i != 0 && i2 != 0) {
                    int width = c86653y0.getWidth();
                    int height = c86653y0.getHeight();
                    int i3 = c86653y0.A05;
                    int i4 = i3 * height;
                    int i5 = c86653y0.A04;
                    int i6 = i5 * width;
                    if (i4 > i6) {
                        height = i6 / i3;
                    } else {
                        width = i4 / i5;
                    }
                    int width2 = c86653y0.getWidth();
                    c86653y0.setTop((c86653y0.getHeight() - height) >> 1);
                    c86653y0.setBottom(c86653y0.getTop() + height);
                    c86653y0.setLeft((width2 - width) >> 1);
                    c86653y0.setRight(c86653y0.getLeft() + width);
                }
                c86653y0.requestLayout();
            }
        });
        this.A09.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.3aj
            {
                C86653y0.this = this;
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                C86653y0 c86653y0 = C86653y0.this;
                c86653y0.A00 = -1;
                c86653y0.A03 = -1;
                MediaPlayer.OnErrorListener onErrorListener = c86653y0.A07;
                if (onErrorListener != null) {
                    onErrorListener.onError(c86653y0.A09, i, i2);
                    return true;
                }
                return true;
            }
        });
        this.A09.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.3ai
            {
                C86653y0.this = this;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                C86653y0 c86653y0 = C86653y0.this;
                c86653y0.A00 = 2;
                if (c86653y0.A0G) {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                }
                if (c86653y0.A0F) {
                    mediaPlayer2.setLooping(true);
                }
                c86653y0.A0E = true;
                c86653y0.A0D = true;
                c86653y0.A0C = true;
                int i = c86653y0.A02;
                if (i >= 0) {
                    c86653y0.seekTo(i);
                }
                if (c86653y0.A03 == 3) {
                    c86653y0.start();
                }
                MediaPlayer.OnPreparedListener onPreparedListener = c86653y0.A08;
                if (onPreparedListener != null) {
                    onPreparedListener.onPrepared(mediaPlayer2);
                }
            }
        });
        this.A09.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.3ah
            {
                C86653y0.this = this;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C86653y0 c86653y0 = C86653y0.this;
                c86653y0.A00 = 5;
                c86653y0.A03 = 5;
                MediaPlayer.OnCompletionListener onCompletionListener = c86653y0.A06;
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion(c86653y0.A09);
                }
            }
        });
        setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC73213bH(this));
    }

    public boolean A01() {
        int i;
        return (this.A09 == null || (i = this.A00) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.A0C;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.A0D;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.A0E;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        C000700j.A08(false, "Not implemented");
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        C000700j.A08(false, "Not implemented");
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer != null) {
                return mediaPlayer.getCurrentPosition();
            }
            throw null;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer != null) {
                return mediaPlayer.getDuration();
            }
            throw null;
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer == null) {
                throw null;
            }
            if (mediaPlayer.isPlaying()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer == null || this.A00 != 4) {
            return;
        }
        mediaPlayer.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer == null || this.A00 != 3) {
            return;
        }
        mediaPlayer.pause();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer == null || this.A00 != 4) {
            return;
        }
        mediaPlayer.start();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.A05 != 0 && this.A04 != 0) {
            if (this.A01 != 1) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int i3 = this.A05;
                int i4 = i3 * measuredHeight;
                int i5 = this.A04;
                int i6 = i5 * measuredWidth;
                if (i4 > i6) {
                    measuredHeight = i6 / i3;
                } else {
                    measuredWidth = i4 / i5;
                }
                setMeasuredDimension(measuredWidth, measuredHeight);
                return;
            }
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            Matrix matrix = this.A0I;
            matrix.reset();
            int i7 = this.A05;
            int i8 = i7 * measuredHeight2;
            int i9 = this.A04;
            int i10 = i9 * measuredWidth2;
            float f2 = 1.0f;
            if (i8 > i10) {
                f2 = (i7 * measuredHeight2) / i10;
                f = 1.0f;
            } else {
                f = (i9 * measuredWidth2) / i8;
            }
            matrix.setScale(f2, f, measuredWidth2 >> 1, measuredHeight2 >> 1);
            setTransform(matrix);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer == null || this.A00 != 3) {
            return;
        }
        mediaPlayer.pause();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer == null) {
                throw null;
            }
            if (mediaPlayer.isPlaying()) {
                this.A09.pause();
                this.A00 = 4;
            }
        }
        this.A03 = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(i);
                this.A02 = -1;
                return;
            }
            throw null;
        }
        this.A02 = i;
    }

    public void setLooping(boolean z) {
        this.A0F = z;
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setMute(boolean z) {
        this.A0G = z;
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            float f = z ? 0.0f : 1.0f;
            mediaPlayer.setVolume(f, f);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.A06 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.A07 = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.A08 = onPreparedListener;
    }

    public void setScaleType(int i) {
        int i2 = this.A01;
        this.A01 = i;
        if (i2 != i) {
            requestLayout();
        }
    }

    public void setVideoPath(String str) {
        this.A0B = str;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer != null) {
                mediaPlayer.start();
                this.A00 = 3;
            } else {
                throw null;
            }
        } else if (this.A09 == null) {
            A00();
        }
        this.A03 = 3;
    }
}
