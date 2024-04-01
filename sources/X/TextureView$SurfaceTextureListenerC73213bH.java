package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.3bH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class TextureView$SurfaceTextureListenerC73213bH implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C86653y0 A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public TextureView$SurfaceTextureListenerC73213bH(C86653y0 c86653y0) {
        this.A00 = c86653y0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C86653y0 c86653y0 = this.A00;
        if (c86653y0.A09 == null) {
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        c86653y0.A0A = surface;
        c86653y0.A09.setSurface(surface);
        if (c86653y0.A00 == 0) {
            try {
                c86653y0.A09.setDataSource(c86653y0.A0B);
                c86653y0.A09.prepareAsync();
                c86653y0.A00 = 1;
            } catch (IOException e) {
                c86653y0.A00 = -1;
                c86653y0.A03 = -1;
                if (c86653y0.A07 != null) {
                    c86653y0.post(new RunnableEBaseShape9S0100000_I1_1(this, 22));
                }
                Log.e("mediaview/unable-to-play", e);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C86653y0 c86653y0 = this.A00;
        MediaPlayer mediaPlayer = c86653y0.A09;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(null);
        }
        Surface surface = c86653y0.A0A;
        if (surface != null) {
            surface.release();
            c86653y0.A0A = null;
        }
        c86653y0.A0H = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C86653y0 c86653y0 = this.A00;
        if (c86653y0.A0H) {
            return;
        }
        c86653y0.A0H = surfaceTexture.getTimestamp() > 0;
    }
}
