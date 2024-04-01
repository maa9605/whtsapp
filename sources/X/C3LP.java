package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gif_search.GifCacheItemSerializable;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3LP */
/* loaded from: classes2.dex */
public class C3LP extends C3KV implements TextureView.SurfaceTextureListener {
    public int A00;
    public MediaPlayer A01;
    public Surface A02;
    public C2BR A03;
    public Runnable A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final TextureView A09;
    public final View A0A;
    public final ImageView A0B;
    public final C455822q A0C;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C3LP(ViewGroup viewGroup, C455822q c455822q, int i) {
        super(viewGroup);
        this.A08 = true;
        this.A04 = new RunnableEBaseShape8S0100000_I1_0(this, 29);
        this.A00 = 500;
        View view = this.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.A0C = c455822q;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        this.A0B = (ImageView) view.findViewById(R.id.thumb_view);
        this.A09 = (TextureView) view.findViewById(R.id.gif_surface_view);
        this.A0A = view.findViewById(R.id.loading_progress);
        this.A09.setSurfaceTextureListener(this);
        this.A09.setVisibility(0);
    }

    @Override // X.AbstractC09080cc
    public void A0C() {
        if (this.A08) {
            this.A09.setVisibility(0);
        }
    }

    @Override // X.AbstractC09080cc
    public void A0D() {
        MediaPlayer mediaPlayer;
        this.A09.setVisibility(8);
        if (!this.A07 || (mediaPlayer = this.A01) == null) {
            return;
        }
        mediaPlayer.pause();
        this.A01.seekTo(0);
    }

    @Override // X.AbstractC09080cc
    public void A0E() {
        MediaPlayer mediaPlayer = this.A01;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.A01 = null;
            this.A06 = false;
            this.A05 = false;
            this.A07 = false;
        }
    }

    @Override // X.AbstractC09080cc
    public void A0G(boolean z) {
        MediaPlayer mediaPlayer;
        this.A08 = z;
        if (!z) {
            if (this.A07 && (mediaPlayer = this.A01) != null) {
                mediaPlayer.pause();
            }
        } else if (this.A06) {
            TextureView textureView = this.A09;
            textureView.setVisibility(0);
            textureView.setVisibility(0);
            MediaPlayer mediaPlayer2 = this.A01;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
                this.A07 = true;
            }
            this.A07 = true;
        } else {
            this.A0B.postDelayed(this.A04, this.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x004a, code lost:
        if (r8 < r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0059, code lost:
        if (r3 > r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005b, code lost:
        r1 = (r3 / r6) / (r4 / r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0I() {
        /*
            r9 = this;
            X.2BR r0 = r9.A03
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r0.A02
            if (r1 <= 0) goto L3f
            int r0 = r0.A01
            if (r0 <= 0) goto L3f
            float r7 = (float) r1
            float r6 = (float) r0
            android.view.TextureView r5 = r9.A09
            int r0 = r5.getWidth()
            float r4 = (float) r0
            int r0 = r5.getHeight()
            float r3 = (float) r0
            float r8 = r7 / r6
            float r2 = r4 / r3
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L40
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L40
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L61
            float r6 = r6 / r3
            float r7 = r7 / r4
            float r6 = r6 / r7
        L30:
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r3 = r3 / r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setScale(r1, r6, r4, r3)
            r5.setTransform(r0)
        L3f:
            return
        L40:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L53
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L53
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5b
        L4c:
            float r2 = r4 / r7
            float r0 = r3 / r6
            float r6 = r2 / r0
            goto L30
        L53:
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 > 0) goto L4c
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L65
        L5b:
            float r1 = r3 / r6
            float r0 = r4 / r7
            float r1 = r1 / r0
            goto L65
        L61:
            float r7 = r7 / r4
            float r6 = r6 / r3
            float r7 = r7 / r6
            r1 = r7
        L65:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3LP.A0I():void");
    }

    public void A0J(C2BR c2br) {
        if ((this.A03 != c2br || this.A01 == null) && c2br != null) {
            this.A03 = c2br;
            final ImageView imageView = this.A0B;
            imageView.setVisibility(0);
            this.A0A.setVisibility(8);
            imageView.setImageDrawable(null);
            C455822q c455822q = this.A0C;
            InterfaceC13020kT interfaceC13020kT = new InterfaceC13020kT() { // from class: X.3BZ
                @Override // X.InterfaceC13020kT
                public final void A54(Object obj) {
                    imageView.setImageBitmap((Bitmap) obj);
                }
            };
            if (c455822q != null) {
                C000700j.A01();
                c455822q.A0B.ARy(new C0HS(c2br, c455822q.A06.A06(), interfaceC13020kT) { // from class: X.3Bh
                    public final InterfaceC13020kT A00;
                    public final C04560Kx A01;
                    public final C2BR A02;

                    {
                        this.A02 = c2br;
                        this.A01 = r2;
                        this.A00 = interfaceC13020kT;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        byte[] A1c;
                        C2BR c2br2 = this.A02;
                        if (!A04()) {
                            String str = c2br2.A03;
                            C0HC c0hc = new C0HC(C000200d.A0H("gif/cache/get", str));
                            C04560Kx c04560Kx = this.A01;
                            GifCacheItemSerializable A03 = c04560Kx.A03(str);
                            if (A03 != null) {
                                A1c = A03.A00;
                                c0hc.A02("get");
                            } else {
                                File file = new File(str);
                                if (file.exists()) {
                                    A1c = C02180Ae.A1c(file, 0L);
                                    if (A1c != null) {
                                        GifCacheItemSerializable gifCacheItemSerializable = new GifCacheItemSerializable(str, A1c, str);
                                        if (c04560Kx != null) {
                                            c04560Kx.A08();
                                            c04560Kx.A05.A08(str, gifCacheItemSerializable);
                                            c04560Kx.A05().execute(new RunnableEBaseShape3S0100000_I0_3(c04560Kx, 1));
                                        } else {
                                            throw null;
                                        }
                                    }
                                    c0hc.A02("put");
                                }
                            }
                            if (A1c == null) {
                                C000200d.A1M(C000200d.A0P("gif/cache/null thumb generated"), c2br2.A03);
                            } else {
                                c0hc.A01();
                                return BitmapFactory.decodeByteArray(A1c, 0, A1c.length, C42471vn.A07);
                            }
                        }
                        return null;
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        if (obj != null) {
                            this.A00.A54(obj);
                        }
                    }
                }, new Void[0]);
                synchronized (this) {
                    if (this.A03 == null) {
                        return;
                    }
                    MediaPlayer mediaPlayer = this.A01;
                    if (mediaPlayer == null) {
                        this.A01 = new MediaPlayer();
                    } else {
                        mediaPlayer.reset();
                    }
                    this.A01.setLooping(true);
                    this.A06 = false;
                    this.A05 = false;
                    try {
                        this.A01.setDataSource(this.A09.getContext(), Uri.parse(this.A03.A03));
                        this.A01.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.2w9
                            {
                                C3LP.this = this;
                            }

                            @Override // android.media.MediaPlayer.OnPreparedListener
                            public void onPrepared(MediaPlayer mediaPlayer2) {
                                C3LP c3lp = C3LP.this;
                                c3lp.A06 = true;
                                if (c3lp.A08) {
                                    c3lp.A09.setVisibility(0);
                                    MediaPlayer mediaPlayer3 = c3lp.A01;
                                    if (mediaPlayer3 != null) {
                                        mediaPlayer3.start();
                                        c3lp.A07 = true;
                                    }
                                }
                            }
                        });
                        this.A05 = true;
                        imageView.postDelayed(this.A04, this.A00);
                    } catch (IOException e) {
                        Log.e("GifMessagePreviewHolder/prepareGif failed to prepare mediaplayer", e);
                    }
                    return;
                }
            }
            throw null;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A02 = new Surface(surfaceTexture);
        A0I();
        MediaPlayer mediaPlayer = this.A01;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(this.A02);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MediaPlayer mediaPlayer = this.A01;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(null);
            A0D();
        }
        Surface surface = this.A02;
        if (surface != null) {
            surface.release();
            this.A02 = null;
            return true;
        }
        throw null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        A0I();
    }
}
