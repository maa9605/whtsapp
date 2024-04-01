package X;

import android.content.Context;
import android.media.MediaPlayer;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.3tD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84113tD extends AbstractC48662Ge {
    public final VideoSurfaceView A00;

    public C84113tD(final Context context, String str, boolean z) {
        VideoSurfaceView videoSurfaceView = new VideoSurfaceView(context) { // from class: X.3yn
            @Override // com.whatsapp.videoplayback.VideoSurfaceView, android.widget.MediaController.MediaPlayerControl
            public void start() {
                C84113tD c84113tD;
                InterfaceC73133b9 interfaceC73133b9;
                if (A04() && (interfaceC73133b9 = (c84113tD = C84113tD.this).A03) != null) {
                    interfaceC73133b9.AOs(c84113tD);
                }
                super.start();
            }
        };
        this.A00 = videoSurfaceView;
        videoSurfaceView.setVideoPath(str);
        VideoSurfaceView videoSurfaceView2 = this.A00;
        videoSurfaceView2.A0A = new MediaPlayer.OnErrorListener() { // from class: X.3ae
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                C84113tD c84113tD = C84113tD.this;
                StringBuilder sb = new StringBuilder("VideoPlayerOnSurfaceView/error ");
                sb.append(i);
                sb.append(" ");
                sb.append(i2);
                Log.e(sb.toString());
                InterfaceC73123b8 interfaceC73123b8 = c84113tD.A02;
                if (interfaceC73123b8 != null) {
                    interfaceC73123b8.AJy(null, true);
                    return false;
                }
                return false;
            }
        };
        videoSurfaceView2.A09 = new MediaPlayer.OnCompletionListener() { // from class: X.3ad
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C84113tD c84113tD = C84113tD.this;
                InterfaceC73113b7 interfaceC73113b7 = c84113tD.A01;
                if (interfaceC73113b7 != null) {
                    interfaceC73113b7.AIq(c84113tD);
                }
            }
        };
        videoSurfaceView2.setLooping(z);
    }
}
