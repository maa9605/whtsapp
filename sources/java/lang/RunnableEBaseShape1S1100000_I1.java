package java.lang;

import X.C58462rB;
import X.C650235p;
import X.C655237n;
import X.C72953ar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.blocklist.BlockConfirmationDialogFragment;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;
import com.whatsapp.voipcalling.Voip;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S1100000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public String A01;
    public final int A02;

    public RunnableEBaseShape1S1100000_I1(Object obj, String str, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A02) {
            case 0:
                ((BlockConfirmationDialogFragment) this.A00).A00.A0E(this.A01, 1);
                return;
            case 1:
                ((C650235p) this.A00).A01.AEJ(this.A01);
                return;
            case 2:
                String str = this.A01;
                C58462rB c58462rB = (C58462rB) ((C655237n) this.A00).A05.get();
                if (c58462rB != null) {
                    c58462rB.A01 = str;
                    c58462rB.A03.AKs();
                    return;
                }
                return;
            case 3:
                C72953ar c72953ar = (C72953ar) this.A00;
                ExoPlayerErrorFrame exoPlayerErrorFrame = c72953ar.A03;
                exoPlayerErrorFrame.setLoadingViewVisibility(8);
                ExoPlaybackControlView exoPlaybackControlView = c72953ar.A02;
                if (exoPlaybackControlView != null) {
                    exoPlaybackControlView.setPlayControlVisibility(8);
                }
                String str2 = this.A01;
                if (str2 == null) {
                    str2 = exoPlayerErrorFrame.getContext().getString(R.string.unable_to_finish_download);
                }
                if (exoPlayerErrorFrame.A02 == null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(exoPlayerErrorFrame.getContext()).inflate(R.layout.wa_exoplayer_error_screen, (ViewGroup) null);
                    exoPlayerErrorFrame.A02 = frameLayout;
                    exoPlayerErrorFrame.A04.addView(frameLayout);
                    exoPlayerErrorFrame.A03 = (TextView) exoPlayerErrorFrame.findViewById(R.id.error_text);
                    View findViewById = exoPlayerErrorFrame.findViewById(R.id.retry_button);
                    exoPlayerErrorFrame.A01 = findViewById;
                    findViewById.setOnClickListener(exoPlayerErrorFrame.A00);
                }
                TextView textView = exoPlayerErrorFrame.A03;
                if (textView != null) {
                    textView.setText(str2);
                    FrameLayout frameLayout2 = exoPlayerErrorFrame.A02;
                    if (frameLayout2 == null) {
                        throw null;
                    }
                    frameLayout2.setVisibility(0);
                    return;
                }
                throw null;
            case 4:
                Voip.resendOfferOnDecryptionFailure((DeviceJid) this.A00, this.A01);
                return;
            default:
                return;
        }
    }
}
