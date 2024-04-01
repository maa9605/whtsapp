package X;

import android.content.Context;
import android.media.MediaPlayer;
import com.whatsapp.util.Log;

/* renamed from: X.3tE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84123tE extends AbstractC48662Ge {
    public final C86653y0 A00;

    public C84123tE(final Context context, String str, boolean z) {
        C86653y0 c86653y0 = new C86653y0(context) { // from class: X.3yo
            @Override // X.C86653y0, android.widget.MediaController.MediaPlayerControl
            public void start() {
                C84123tE c84123tE;
                InterfaceC73133b9 interfaceC73133b9;
                if (A01() && (interfaceC73133b9 = (c84123tE = C84123tE.this).A03) != null) {
                    interfaceC73133b9.AOs(c84123tE);
                }
                super.start();
            }
        };
        this.A00 = c86653y0;
        c86653y0.A0B = str;
        c86653y0.A07 = new MediaPlayer.OnErrorListener() { // from class: X.3af
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                C84123tE c84123tE = C84123tE.this;
                StringBuilder sb = new StringBuilder("VideoPlayerOnTextureView/error ");
                sb.append(i);
                sb.append(" ");
                sb.append(i2);
                Log.e(sb.toString());
                InterfaceC73123b8 interfaceC73123b8 = c84123tE.A02;
                if (interfaceC73123b8 != null) {
                    interfaceC73123b8.AJy(null, true);
                    return false;
                }
                return false;
            }
        };
        c86653y0.A06 = new MediaPlayer.OnCompletionListener() { // from class: X.3ag
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C84123tE c84123tE = C84123tE.this;
                InterfaceC73113b7 interfaceC73113b7 = c84123tE.A01;
                if (interfaceC73113b7 != null) {
                    interfaceC73113b7.AIq(c84123tE);
                }
            }
        };
        c86653y0.setLooping(z);
    }
}
