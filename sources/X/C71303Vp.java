package X;

import android.widget.SeekBar;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.3Vp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C71303Vp implements SeekBar.OnSeekBarChangeListener {
    public AbstractC71293Vo A00;
    public boolean A01;
    public final C03120Eg A02;
    public final AudioPlayerView A03;
    public final InterfaceC71283Vn A04;

    public C71303Vp(AudioPlayerView audioPlayerView, InterfaceC71283Vn interfaceC71283Vn, C03120Eg c03120Eg, AbstractC71293Vo abstractC71293Vo) {
        this.A03 = audioPlayerView;
        this.A04 = interfaceC71283Vn;
        this.A02 = c03120Eg;
        this.A00 = abstractC71293Vo;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int i2 = i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
            AbstractC71293Vo abstractC71293Vo = this.A00;
            if (abstractC71293Vo != null) {
                abstractC71293Vo.onProgressChanged(seekBar, i, z);
                this.A00.A00(i2);
            }
            AudioPlayerView audioPlayerView = this.A03;
            audioPlayerView.setSeekbarContentDescription(audioPlayerView.A03.getProgress());
        }
        C09560eJ.A02(this.A04.AA5(), this.A03.A03.getProgress());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        C09G AA5 = this.A04.AA5();
        this.A01 = false;
        C03120Eg c03120Eg = this.A02;
        C09560eJ A01 = c03120Eg.A01();
        if (c03120Eg.A09(AA5) && c03120Eg.A08() && A01 != null) {
            A01.A04();
            this.A01 = true;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        C09G AA5 = this.A04.AA5();
        AbstractC71293Vo abstractC71293Vo = this.A00;
        if (abstractC71293Vo != null) {
            abstractC71293Vo.onStopTrackingTouch(seekBar);
        }
        C03120Eg c03120Eg = this.A02;
        if (c03120Eg.A09(AA5) && !c03120Eg.A08() && this.A01) {
            this.A01 = false;
            C09560eJ A01 = c03120Eg.A01();
            if (A01 != null) {
                A01.A0E(this.A03.A03.getProgress());
                A01.A0F(((AnonymousClass092) AA5).A04 == 1 ? C09560eJ.A0p : 0);
                return;
            }
            return;
        }
        AbstractC71293Vo abstractC71293Vo2 = this.A00;
        if (abstractC71293Vo2 != null) {
            abstractC71293Vo2.A00(((AnonymousClass097) AA5).A00);
        }
        C09560eJ.A02(AA5, this.A03.A03.getProgress());
    }
}
