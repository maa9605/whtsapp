package com.whatsapp.search.views.itemviews;

import X.AnonymousClass097;
import X.C0LO;
import X.C2BR;
import X.C2Yk;
import X.C2Yp;
import X.C81033oF;
import X.InterfaceC002901k;
import X.InterfaceC71333Vs;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* loaded from: classes2.dex */
public class MessageGifVideoPlayer extends C2Yk {
    public MediaPlayer.OnErrorListener A00;
    public MediaPlayer.OnPreparedListener A01;
    public MediaPlayer A02;
    public Surface A03;
    public C2BR A04;
    public C0LO A05;
    public InterfaceC71333Vs A06;
    public InterfaceC002901k A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final TextureView.SurfaceTextureListener A0E;

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0D = false;
        this.A0C = false;
        this.A0E = new TextureView.SurfaceTextureListener() { // from class: X.3Vq
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            {
                MessageGifVideoPlayer.this = this;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                MessageGifVideoPlayer messageGifVideoPlayer = MessageGifVideoPlayer.this;
                messageGifVideoPlayer.A03 = new Surface(surfaceTexture);
                MessageGifVideoPlayer.A00(messageGifVideoPlayer);
                MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
                if (mediaPlayer != null) {
                    mediaPlayer.setSurface(messageGifVideoPlayer.A03);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                MessageGifVideoPlayer messageGifVideoPlayer = MessageGifVideoPlayer.this;
                MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
                if (mediaPlayer != null) {
                    mediaPlayer.setSurface(null);
                    messageGifVideoPlayer.A04();
                }
                Surface surface = messageGifVideoPlayer.A03;
                if (surface != null) {
                    surface.release();
                    messageGifVideoPlayer.A03 = null;
                    return true;
                }
                throw null;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                MessageGifVideoPlayer.A00(MessageGifVideoPlayer.this);
            }
        };
        this.A01 = new MediaPlayer.OnPreparedListener() { // from class: X.3Vr
            {
                MessageGifVideoPlayer.this = this;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                MessageGifVideoPlayer messageGifVideoPlayer = MessageGifVideoPlayer.this;
                messageGifVideoPlayer.A0A = true;
                messageGifVideoPlayer.A02();
            }
        };
        this.A00 = new MediaPlayer.OnErrorListener() { // from class: X.3Vl
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return MessageGifVideoPlayer.A01(i2);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x002d, code lost:
        if (r3 < r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004a, code lost:
        if (r3 < r2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer r8) {
        /*
            X.2BR r1 = r8.A04
            if (r1 == 0) goto L3f
            int r0 = r1.A02
            float r7 = (float) r0
            int r0 = r1.A01
            float r6 = (float) r0
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3f
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3f
            int r0 = r8.getWidth()
            float r5 = (float) r0
            int r0 = r8.getHeight()
            float r4 = (float) r0
            float r3 = r7 / r6
            float r2 = r5 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L40
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L40
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5b
        L2f:
            float r2 = r2 / r3
        L30:
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r4 / r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setScale(r1, r2, r5, r4)
            r8.setTransform(r0)
        L3f:
            return
        L40:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L4d
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4d
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5b
            goto L2f
        L4d:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L2f
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L5b
            r3 = 1065353216(0x3f800000, float:1.0)
        L57:
            r1 = r3
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L30
        L5b:
            float r3 = r3 / r2
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.MessageGifVideoPlayer.A00(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer):void");
    }

    public static /* synthetic */ boolean A01(int i) {
        return false;
    }

    public final void A02() {
        if (this.A0D && this.A02 != null && this.A0A) {
            InterfaceC71333Vs interfaceC71333Vs = this.A06;
            if (interfaceC71333Vs != null) {
                C2Yp.A00(((C81033oF) interfaceC71333Vs).A00, false);
            }
            setVisibility(0);
            this.A02.start();
            this.A0B = true;
        }
    }

    public final void A03() {
        this.A0A = false;
        if (this.A0C) {
            this.A09 = true;
        } else if (!this.A0D) {
            this.A08 = true;
        } else {
            setSurfaceTextureListener(this.A0E);
            this.A07.AS1(new RunnableEBaseShape6S0100000_I0_6(this, 14));
        }
    }

    public final void A04() {
        MediaPlayer mediaPlayer;
        setVisibility(8);
        InterfaceC71333Vs interfaceC71333Vs = this.A06;
        if (interfaceC71333Vs != null) {
            C2Yp.A00(((C81033oF) interfaceC71333Vs).A00, true);
        }
        if (!this.A0B || (mediaPlayer = this.A02) == null) {
            return;
        }
        mediaPlayer.pause();
        this.A02.seekTo(0);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A02();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
    }

    public void setMessage(C0LO c0lo) {
        if ((this.A05 != c0lo || this.A02 == null) && ((AnonymousClass097) c0lo).A02 != null) {
            this.A05 = c0lo;
            A03();
        }
    }

    public void setPlayingListener(InterfaceC71333Vs interfaceC71333Vs) {
        this.A06 = interfaceC71333Vs;
    }

    public void setScrolling(boolean z) {
        this.A0C = z;
        if (z || !this.A09) {
            return;
        }
        this.A09 = false;
        A03();
    }

    public void setShouldPlay(boolean z) {
        if (this.A0D == z) {
            return;
        }
        this.A0D = z;
        if (!z) {
            if (this.A0B && this.A02 != null) {
                A04();
            }
        } else if (this.A08) {
            A03();
        } else if (!this.A0A) {
        } else {
            A02();
        }
    }
}
