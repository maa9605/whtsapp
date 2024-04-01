package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3xt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86593xt extends AbstractC83993t1 {
    public int A00;
    public C06260Si A01;
    public ExoPlaybackControlView A02;
    public C72953ar A03;
    public C83963sy A04;
    public String A05;
    public boolean A06;
    public final View A07;
    public final View A08;
    public final AspectRatioFrameLayout A09;
    public final SubtitleView A0A;
    public final C83953sx A0B;
    public final boolean A0C;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.3sy] */
    public C86593xt(Context context, boolean z) {
        super(context);
        View c84093tB;
        this.A00 = -1;
        this.A06 = false;
        LayoutInflater.from(context).inflate(R.layout.wa_exoplayer_video_view, this);
        this.A0B = new C83953sx(this);
        this.A09 = (AspectRatioFrameLayout) findViewById(R.id.video_frame);
        this.A07 = findViewById(R.id.shutter);
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.subtitles);
        this.A0A = subtitleView;
        subtitleView.A00();
        this.A0A.A01();
        this.A0C = z;
        if (z) {
            c84093tB = new SurfaceView(context);
        } else {
            c84093tB = new C84093tB(context);
        }
        this.A08 = c84093tB;
        this.A08.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.A09.addView(this.A08, 0);
        this.A04 = new InterfaceC72943aq() { // from class: X.3sy
            @Override // X.InterfaceC72943aq
            public void AQP(int i) {
                if (i == 0) {
                    C86593xt.this.setSystemUiVisibility(3840);
                } else {
                    C86593xt.this.setSystemUiVisibility(3846);
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ExoPlaybackControlView exoPlaybackControlView = this.A02;
        return exoPlaybackControlView != null ? exoPlaybackControlView.dispatchKeyEvent(keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    public Bitmap getCurrentFrame() {
        try {
            View view = this.A08;
            int width = view.getWidth() / 4;
            int height = view.getHeight() / 4;
            if (this.A0C) {
                boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                if (!isDrawingCacheEnabled) {
                    view.setDrawingCacheEnabled(true);
                }
                view.buildDrawingCache(true);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(view.getDrawingCache(), width, height, true);
                if (!isDrawingCacheEnabled) {
                    view.setDrawingCacheEnabled(false);
                }
                view.destroyDrawingCache();
                return createScaledBitmap;
            }
            return ((TextureView) view).getBitmap(width, height);
        } catch (OutOfMemoryError e) {
            Log.e("ExoPlayerView/getCurrentFrame/", e);
            return null;
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        ExoPlaybackControlView exoPlaybackControlView = this.A02;
        if (exoPlaybackControlView == null) {
            return false;
        }
        exoPlaybackControlView.A01();
        return true;
    }

    public void setController(ExoPlaybackControlView exoPlaybackControlView) {
        this.A02 = exoPlaybackControlView;
        if (exoPlaybackControlView != null) {
            exoPlaybackControlView.A05 = this.A04;
            C06260Si c06260Si = this.A01;
            if (c06260Si != null) {
                exoPlaybackControlView.setPlayer(c06260Si);
            }
        }
    }

    public void setExoPlayerErrorActionsController(C72953ar c72953ar) {
        this.A03 = c72953ar;
    }

    public void setLayoutResizingEnabled(boolean z) {
        this.A09.setResizeMode(z ? 0 : 3);
    }

    public void setPlayer(C06260Si c06260Si) {
        SurfaceTexture surfaceTexture;
        C06260Si c06260Si2 = this.A01;
        if (c06260Si2 != null) {
            c06260Si2.A0O.clear();
            this.A01.A0Q.clear();
            this.A01.ARO(this.A0B);
            C06260Si c06260Si3 = this.A01;
            c06260Si3.A03();
            c06260Si3.A01();
            c06260Si3.A06(null, false);
            c06260Si3.A05(0, 0);
        }
        this.A01 = c06260Si;
        if (c06260Si != null) {
            if (this.A0C) {
                SurfaceView surfaceView = (SurfaceView) this.A08;
                SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
                c06260Si.A03();
                c06260Si.A01();
                c06260Si.A05 = holder;
                if (holder == null) {
                    c06260Si.A06(null, false);
                    c06260Si.A05(0, 0);
                } else {
                    holder.addCallback(c06260Si.A0H);
                    Surface surface = holder.getSurface();
                    if (surface != null && surface.isValid()) {
                        c06260Si.A06(surface, false);
                        Rect surfaceFrame = holder.getSurfaceFrame();
                        c06260Si.A05(surfaceFrame.width(), surfaceFrame.height());
                    } else {
                        c06260Si.A06(null, false);
                        c06260Si.A05(0, 0);
                    }
                }
            } else {
                TextureView textureView = (TextureView) this.A08;
                c06260Si.A03();
                c06260Si.A01();
                c06260Si.A06 = textureView;
                if (textureView == null) {
                    c06260Si.A06(null, true);
                    c06260Si.A05(0, 0);
                } else {
                    if (textureView.getSurfaceTextureListener() != null) {
                        android.util.Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
                    }
                    textureView.setSurfaceTextureListener(c06260Si.A0H);
                    if (textureView.isAvailable() && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                        c06260Si.A06(new Surface(surfaceTexture), true);
                        c06260Si.A05(textureView.getWidth(), textureView.getHeight());
                    } else {
                        c06260Si.A06(null, true);
                        c06260Si.A05(0, 0);
                    }
                }
            }
            C83953sx c83953sx = this.A0B;
            CopyOnWriteArraySet copyOnWriteArraySet = c06260Si.A0Q;
            copyOnWriteArraySet.clear();
            if (c83953sx != null) {
                copyOnWriteArraySet.add(c83953sx);
            }
            c06260Si.A5D(c83953sx);
            CopyOnWriteArraySet copyOnWriteArraySet2 = c06260Si.A0O;
            copyOnWriteArraySet2.clear();
            if (c83953sx != null) {
                if (!c06260Si.A0C.isEmpty()) {
                    c83953sx.AJA(c06260Si.A0C);
                }
                copyOnWriteArraySet2.add(c83953sx);
            }
            ExoPlaybackControlView exoPlaybackControlView = this.A02;
            if (exoPlaybackControlView != null) {
                exoPlaybackControlView.setPlayer(c06260Si);
            }
        } else {
            this.A07.setVisibility(0);
        }
        this.A06 = false;
    }
}
