package com.whatsapp.videoplayback;

import X.AbstractC84023t4;
import X.AnonymousClass024;
import X.C000200d;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public class VideoSurfaceView extends AbstractC84023t4 implements MediaController.MediaPlayerControl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public MediaPlayer.OnCompletionListener A09;
    public MediaPlayer.OnErrorListener A0A;
    public MediaPlayer.OnPreparedListener A0B;
    public MediaPlayer A0C;
    public Uri A0D;
    public SurfaceHolder A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final MediaPlayer.OnBufferingUpdateListener A0K;
    public final MediaPlayer.OnCompletionListener A0L;
    public final MediaPlayer.OnErrorListener A0M;
    public final MediaPlayer.OnPreparedListener A0N;
    public final MediaPlayer.OnVideoSizeChangedListener A0O;
    public final SurfaceHolder.Callback A0P;

    public VideoSurfaceView(Context context) {
        super(context);
        this.A02 = 0;
        this.A06 = 0;
        this.A0E = null;
        this.A0C = null;
        this.A03 = -1;
        this.A0O = new MediaPlayer.OnVideoSizeChangedListener() { // from class: X.3bB
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                videoSurfaceView.A07 = videoHeight;
                StringBuilder A0P = C000200d.A0P("videoview/onVideoSizeChanged: ");
                A0P.append(videoSurfaceView.A08);
                A0P.append("x");
                C000200d.A1F(A0P, videoHeight);
                if (videoSurfaceView.A08 == 0 || videoSurfaceView.A07 == 0) {
                    return;
                }
                videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
                videoSurfaceView.requestLayout();
            }
        };
        this.A0N = new MediaPlayer.OnPreparedListener() { // from class: X.3bC
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A02 = 2;
                videoSurfaceView.A0H = true;
                videoSurfaceView.A0G = true;
                videoSurfaceView.A0F = true;
                MediaPlayer.OnPreparedListener onPreparedListener = videoSurfaceView.A0B;
                if (onPreparedListener != null) {
                    onPreparedListener.onPrepared(videoSurfaceView.A0C);
                }
                videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                videoSurfaceView.A07 = videoHeight;
                StringBuilder A0P = C000200d.A0P("videoview/onPrepare: ");
                A0P.append(videoSurfaceView.A08);
                A0P.append("x");
                C000200d.A1F(A0P, videoHeight);
                int i = videoSurfaceView.A03;
                if (i >= 0) {
                    videoSurfaceView.seekTo(i);
                }
                if (videoSurfaceView.A08 != 0 && videoSurfaceView.A07 != 0) {
                    videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
                    if (videoSurfaceView.A05 == videoSurfaceView.A08 && videoSurfaceView.A04 == videoSurfaceView.A07 && videoSurfaceView.A06 == 3) {
                        videoSurfaceView.start();
                    }
                } else if (videoSurfaceView.A06 != 3) {
                } else {
                    videoSurfaceView.start();
                }
            }
        };
        this.A0L = new MediaPlayer.OnCompletionListener() { // from class: X.3bD
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A02 = 5;
                videoSurfaceView.A06 = 5;
                MediaPlayer.OnCompletionListener onCompletionListener = videoSurfaceView.A09;
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion(videoSurfaceView.A0C);
                }
            }
        };
        this.A0M = new MediaPlayer.OnErrorListener() { // from class: X.3bE
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                StringBuilder sb = new StringBuilder("videoview/ Error: ");
                sb.append(i);
                sb.append(",");
                sb.append(i2);
                Log.w(sb.toString());
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A02 = -1;
                videoSurfaceView.A06 = -1;
                MediaPlayer.OnErrorListener onErrorListener = videoSurfaceView.A0A;
                if (onErrorListener != null) {
                    onErrorListener.onError(videoSurfaceView.A0C, i, i2);
                    return true;
                }
                return true;
            }
        };
        this.A0K = new MediaPlayer.OnBufferingUpdateListener() { // from class: X.3bF
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                VideoSurfaceView.this.A01 = i;
            }
        };
        this.A0P = new SurfaceHolder.Callback() { // from class: X.3bG
            {
                VideoSurfaceView.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0014, code lost:
                if (r2.A07 != r7) goto L19;
             */
            @Override // android.view.SurfaceHolder.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void surfaceChanged(android.view.SurfaceHolder r4, int r5, int r6, int r7) {
                /*
                    r3 = this;
                    java.lang.String r1 = "videoview/surfaceChanged: "
                    java.lang.String r0 = "x"
                    X.C000200d.A0t(r1, r6, r0, r7)
                    com.whatsapp.videoplayback.VideoSurfaceView r2 = com.whatsapp.videoplayback.VideoSurfaceView.this
                    r2.A05 = r6
                    r2.A04 = r7
                    int r0 = r2.A08
                    if (r0 != r6) goto L16
                    int r0 = r2.A07
                    r1 = 1
                    if (r0 == r7) goto L17
                L16:
                    r1 = 0
                L17:
                    android.media.MediaPlayer r0 = r2.A0C
                    if (r0 == 0) goto L2c
                    if (r1 == 0) goto L2c
                    int r0 = r2.A03
                    if (r0 < 0) goto L24
                    r2.seekTo(r0)
                L24:
                    int r1 = r2.A06
                    r0 = 3
                    if (r1 != r0) goto L2c
                    r2.start()
                L2c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolder$CallbackC73203bG.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A0E = surfaceHolder;
                videoSurfaceView.A02();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A03 = videoSurfaceView.getCurrentPosition();
                videoSurfaceView.A0E = null;
                videoSurfaceView.A03(true);
            }
        };
        A01();
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = 0;
        this.A06 = 0;
        this.A0E = null;
        this.A0C = null;
        this.A03 = -1;
        this.A0O = new MediaPlayer.OnVideoSizeChangedListener() { // from class: X.3bB
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                videoSurfaceView.A07 = videoHeight;
                StringBuilder A0P = C000200d.A0P("videoview/onVideoSizeChanged: ");
                A0P.append(videoSurfaceView.A08);
                A0P.append("x");
                C000200d.A1F(A0P, videoHeight);
                if (videoSurfaceView.A08 == 0 || videoSurfaceView.A07 == 0) {
                    return;
                }
                videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
                videoSurfaceView.requestLayout();
            }
        };
        this.A0N = new MediaPlayer.OnPreparedListener() { // from class: X.3bC
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A02 = 2;
                videoSurfaceView.A0H = true;
                videoSurfaceView.A0G = true;
                videoSurfaceView.A0F = true;
                MediaPlayer.OnPreparedListener onPreparedListener = videoSurfaceView.A0B;
                if (onPreparedListener != null) {
                    onPreparedListener.onPrepared(videoSurfaceView.A0C);
                }
                videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                videoSurfaceView.A07 = videoHeight;
                StringBuilder A0P = C000200d.A0P("videoview/onPrepare: ");
                A0P.append(videoSurfaceView.A08);
                A0P.append("x");
                C000200d.A1F(A0P, videoHeight);
                int i = videoSurfaceView.A03;
                if (i >= 0) {
                    videoSurfaceView.seekTo(i);
                }
                if (videoSurfaceView.A08 != 0 && videoSurfaceView.A07 != 0) {
                    videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
                    if (videoSurfaceView.A05 == videoSurfaceView.A08 && videoSurfaceView.A04 == videoSurfaceView.A07 && videoSurfaceView.A06 == 3) {
                        videoSurfaceView.start();
                    }
                } else if (videoSurfaceView.A06 != 3) {
                } else {
                    videoSurfaceView.start();
                }
            }
        };
        this.A0L = new MediaPlayer.OnCompletionListener() { // from class: X.3bD
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A02 = 5;
                videoSurfaceView.A06 = 5;
                MediaPlayer.OnCompletionListener onCompletionListener = videoSurfaceView.A09;
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion(videoSurfaceView.A0C);
                }
            }
        };
        this.A0M = new MediaPlayer.OnErrorListener() { // from class: X.3bE
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                StringBuilder sb = new StringBuilder("videoview/ Error: ");
                sb.append(i);
                sb.append(",");
                sb.append(i2);
                Log.w(sb.toString());
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A02 = -1;
                videoSurfaceView.A06 = -1;
                MediaPlayer.OnErrorListener onErrorListener = videoSurfaceView.A0A;
                if (onErrorListener != null) {
                    onErrorListener.onError(videoSurfaceView.A0C, i, i2);
                    return true;
                }
                return true;
            }
        };
        this.A0K = new MediaPlayer.OnBufferingUpdateListener() { // from class: X.3bF
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                VideoSurfaceView.this.A01 = i;
            }
        };
        this.A0P = new SurfaceHolder.Callback() { // from class: X.3bG
            {
                VideoSurfaceView.this = this;
            }

            @Override // android.view.SurfaceHolder.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void surfaceChanged(android.view.SurfaceHolder r4, int r5, int r6, int r7) {
                /*
                    r3 = this;
                    java.lang.String r1 = "videoview/surfaceChanged: "
                    java.lang.String r0 = "x"
                    X.C000200d.A0t(r1, r6, r0, r7)
                    com.whatsapp.videoplayback.VideoSurfaceView r2 = com.whatsapp.videoplayback.VideoSurfaceView.this
                    r2.A05 = r6
                    r2.A04 = r7
                    int r0 = r2.A08
                    if (r0 != r6) goto L16
                    int r0 = r2.A07
                    r1 = 1
                    if (r0 == r7) goto L17
                L16:
                    r1 = 0
                L17:
                    android.media.MediaPlayer r0 = r2.A0C
                    if (r0 == 0) goto L2c
                    if (r1 == 0) goto L2c
                    int r0 = r2.A03
                    if (r0 < 0) goto L24
                    r2.seekTo(r0)
                L24:
                    int r1 = r2.A06
                    r0 = 3
                    if (r1 != r0) goto L2c
                    r2.start()
                L2c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolder$CallbackC73203bG.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A0E = surfaceHolder;
                videoSurfaceView.A02();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
                videoSurfaceView.A03 = videoSurfaceView.getCurrentPosition();
                videoSurfaceView.A0E = null;
                videoSurfaceView.A03(true);
            }
        };
        A01();
    }

    public void A00() {
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.A0C.release();
            this.A0C = null;
            this.A02 = 0;
            this.A06 = 0;
        }
    }

    public final void A01() {
        this.A08 = 0;
        this.A07 = 0;
        getHolder().addCallback(this.A0P);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.A02 = 0;
        this.A06 = 0;
    }

    public final void A02() {
        Uri uri = this.A0D;
        if (uri == null || this.A0E == null) {
            return;
        }
        File A05 = AnonymousClass024.A05(uri);
        if (A05 == null || !A05.exists() || !GifHelper.A02(A05)) {
            Intent intent = new Intent("com.android.music.musicservicecommand");
            intent.putExtra("command", "pause");
            getContext().sendBroadcast(intent);
        }
        A03(false);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.A0C = mediaPlayer;
            int i = this.A00;
            if (i != 0) {
                mediaPlayer.setAudioSessionId(i);
            } else {
                this.A00 = mediaPlayer.getAudioSessionId();
            }
            if (this.A0J) {
                this.A0C.setVolume(0.0f, 0.0f);
            }
            if (this.A0I) {
                this.A0C.setLooping(true);
            }
            this.A0C.setOnPreparedListener(this.A0N);
            this.A0C.setOnVideoSizeChangedListener(this.A0O);
            this.A0C.setOnCompletionListener(this.A0L);
            this.A0C.setOnErrorListener(this.A0M);
            this.A0C.setOnBufferingUpdateListener(this.A0K);
            this.A01 = 0;
            this.A0C.setDataSource(getContext(), this.A0D, (Map<String, String>) null);
            this.A0C.setDisplay(this.A0E);
            this.A0C.setAudioStreamType(3);
            this.A0C.setScreenOnWhilePlaying(true);
            this.A0C.prepareAsync();
            this.A02 = 1;
        } catch (IOException | IllegalArgumentException e) {
            StringBuilder A0P = C000200d.A0P("videoview/ Unable to open content: ");
            A0P.append(this.A0D);
            Log.w(A0P.toString(), e);
            this.A02 = -1;
            this.A06 = -1;
            this.A0M.onError(this.A0C, 1, 0);
        }
    }

    public final void A03(boolean z) {
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.A0C.release();
            this.A0C = null;
            this.A02 = 0;
            if (z) {
                this.A06 = 0;
            }
        }
    }

    public boolean A04() {
        int i;
        return (this.A0C == null || (i = this.A02) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.A0F;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.A0G;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.A0H;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.A00 == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.A00 = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.A00;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.A0C != null) {
            return this.A01;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer != null) {
                return mediaPlayer.getCurrentPosition();
            }
            throw null;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer != null) {
                return mediaPlayer.getDuration();
            }
            throw null;
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer == null) {
                throw null;
            }
            if (mediaPlayer.isPlaying()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoSurfaceView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoSurfaceView.class.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x005c, code lost:
        if (r2 > r6) goto L12;
     */
    @Override // android.view.SurfaceView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.A08
            int r2 = android.view.SurfaceView.getDefaultSize(r0, r9)
            int r0 = r8.A07
            int r4 = android.view.SurfaceView.getDefaultSize(r0, r10)
            int r0 = r8.A08
            if (r0 <= 0) goto L35
            int r0 = r8.A07
            if (r0 <= 0) goto L35
            int r7 = android.view.View.MeasureSpec.getMode(r9)
            int r6 = android.view.View.MeasureSpec.getSize(r9)
            int r5 = android.view.View.MeasureSpec.getMode(r10)
            int r4 = android.view.View.MeasureSpec.getSize(r10)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 != r0) goto L40
            if (r5 != r0) goto L40
            int r3 = r8.A08
            int r2 = r3 * r4
            int r1 = r8.A07
            int r0 = r6 * r1
            if (r2 >= r0) goto L74
            int r2 = r2 / r1
        L35:
            java.lang.String r1 = "videoview/setMeasuredDimension: "
            java.lang.String r0 = "x"
            X.C000200d.A0t(r1, r2, r0, r4)
            r8.setMeasuredDimension(r2, r4)
            return
        L40:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r0) goto L52
            int r1 = r8.A07
            int r1 = r1 * r6
            int r0 = r8.A08
            int r1 = r1 / r0
            if (r5 != r3) goto L50
            if (r1 <= r4) goto L50
        L4e:
            r2 = r6
            goto L35
        L50:
            r4 = r1
            goto L78
        L52:
            if (r5 != r0) goto L5f
            int r2 = r8.A08
            int r2 = r2 * r4
            int r0 = r8.A07
            int r2 = r2 / r0
            if (r7 != r3) goto L35
            if (r2 <= r6) goto L35
            goto L4e
        L5f:
            int r2 = r8.A08
            r1 = r2
            int r0 = r8.A07
            if (r5 != r3) goto L72
            if (r0 <= r4) goto L72
            int r2 = r2 * r4
            int r2 = r2 / r0
        L6a:
            if (r7 != r3) goto L35
            if (r2 <= r6) goto L35
            int r0 = r0 * r6
            int r0 = r0 / r1
            r4 = r0
            goto L78
        L72:
            r4 = r0
            goto L6a
        L74:
            if (r2 <= r0) goto L4e
            int r0 = r0 / r3
            r4 = r0
        L78:
            r2 = r6
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.videoplayback.VideoSurfaceView.onMeasure(int, int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer == null) {
                throw null;
            }
            if (mediaPlayer.isPlaying()) {
                this.A0C.pause();
                this.A02 = 4;
            }
        }
        this.A06 = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(i);
                this.A03 = -1;
                return;
            }
            throw null;
        }
        this.A03 = i;
    }

    public void setLooping(boolean z) {
        this.A0I = z;
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setMute(boolean z) {
        this.A0J = z;
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            float f = z ? 0.0f : 1.0f;
            mediaPlayer.setVolume(f, f);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.A09 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.A0A = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.A0B = onPreparedListener;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.A0D = uri;
        this.A03 = -1;
        A02();
        requestLayout();
        invalidate();
    }

    public void start() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer != null) {
                mediaPlayer.start();
                this.A02 = 3;
            } else {
                throw null;
            }
        }
        this.A06 = 3;
    }
}
