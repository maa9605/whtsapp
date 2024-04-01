package X;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.util.Formatter;

/* renamed from: X.3su  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class View$OnClickListenerC83923su implements View.OnClickListener, InterfaceC21130yq, SeekBar.OnSeekBarChangeListener {
    public boolean A00;
    public final /* synthetic */ ExoPlaybackControlView A01;

    @Override // X.InterfaceC21130yq
    public void ALa(boolean z) {
    }

    @Override // X.InterfaceC21130yq
    public void AN0(C21120yp c21120yp) {
    }

    @Override // X.InterfaceC21130yq
    public void AN2(C20930yW c20930yW) {
    }

    @Override // X.InterfaceC21130yq
    public /* synthetic */ void AOS() {
    }

    @Override // X.InterfaceC21130yq
    public void APq(C220910z c220910z, C222111l c222111l) {
    }

    public View$OnClickListenerC83923su(ExoPlaybackControlView exoPlaybackControlView) {
        this.A01 = exoPlaybackControlView;
    }

    @Override // X.InterfaceC21130yq
    public void AN3(boolean z, int i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A04();
        exoPlaybackControlView.A05();
    }

    @Override // X.InterfaceC21130yq
    public void AN4(int i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A03();
        exoPlaybackControlView.A05();
    }

    @Override // X.InterfaceC21130yq
    public void APd(AbstractC21230z0 abstractC21230z0, Object obj, int i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A03();
        exoPlaybackControlView.A05();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC06290Sl interfaceC06290Sl;
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        InterfaceC72923ao interfaceC72923ao = exoPlaybackControlView.A03;
        if (interfaceC72923ao != null) {
            interfaceC72923ao.AIT();
        }
        if (exoPlaybackControlView.A0A == view && (interfaceC06290Sl = exoPlaybackControlView.A01) != null) {
            if (interfaceC06290Sl.ACT() == 4) {
                exoPlaybackControlView.A01.ASJ(0L);
            } else {
                InterfaceC06290Sl interfaceC06290Sl2 = exoPlaybackControlView.A01;
                interfaceC06290Sl2.ATc(!interfaceC06290Sl2.ACR());
            }
        }
        exoPlaybackControlView.A06(300);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            ExoPlaybackControlView exoPlaybackControlView = this.A01;
            TextView textView = exoPlaybackControlView.A0H;
            StringBuilder sb = exoPlaybackControlView.A0M;
            Formatter formatter = exoPlaybackControlView.A0N;
            long duration = exoPlaybackControlView.getDuration();
            textView.setText(C02180Ae.A0n(sb, formatter, duration == -9223372036854775807L ? 0L : (duration * i) / 1000));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0K);
        InterfaceC72933ap interfaceC72933ap = exoPlaybackControlView.A04;
        if (interfaceC72933ap != null) {
            interfaceC72933ap.AOw();
        }
        InterfaceC06290Sl interfaceC06290Sl = exoPlaybackControlView.A01;
        if (interfaceC06290Sl != null && interfaceC06290Sl.ACR()) {
            exoPlaybackControlView.A01.ATc(false);
            this.A00 = true;
        }
        exoPlaybackControlView.A08 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A08 = false;
        InterfaceC06290Sl interfaceC06290Sl = exoPlaybackControlView.A01;
        if (interfaceC06290Sl != null) {
            int progress = seekBar.getProgress();
            long duration = exoPlaybackControlView.getDuration();
            interfaceC06290Sl.ASJ(duration == -9223372036854775807L ? 0L : (duration * progress) / 1000);
        }
        InterfaceC06290Sl interfaceC06290Sl2 = exoPlaybackControlView.A01;
        if (interfaceC06290Sl2 != null && this.A00) {
            interfaceC06290Sl2.ATc(true);
        }
        this.A00 = false;
        exoPlaybackControlView.A06(3000);
    }
}
