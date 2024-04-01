package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.2YR */
/* loaded from: classes2.dex */
public class C2YR extends C2YS {
    public ConversationRowAudioPreview A00;
    public C42381ve A01;
    public C03120Eg A02;
    public C002301c A03;
    public AudioPlayerView A04;

    public C2YR(Context context) {
        super(context);
        setOrientation(0);
        setGravity(16);
        LinearLayout.inflate(context, R.layout.search_attachment_audio, this);
        this.A00 = (ConversationRowAudioPreview) C0AT.A0D(this, R.id.search_row_audio_preview);
        this.A04 = (AudioPlayerView) C0AT.A0D(this, R.id.search_row_audio_controls);
        Drawable A03 = C02160Ac.A03(context, R.drawable.search_attachment_background);
        if (A03 != null) {
            setBackground(C02180Ae.A0Q(A03, C02160Ac.A00(getContext(), R.color.search_attachment_background)));
            C80983oA c80983oA = new C80983oA(this);
            InterfaceC71283Vn interfaceC71283Vn = new InterfaceC71283Vn() { // from class: X.3o8
                {
                    C2YR.this = this;
                }

                @Override // X.InterfaceC71283Vn
                public final C09G AA5() {
                    return C2YR.this.A07;
                }
            };
            AudioPlayerView audioPlayerView = this.A04;
            audioPlayerView.setPlaybackListener(new C71303Vp(audioPlayerView, interfaceC71283Vn, this.A02, c80983oA));
            return;
        }
        throw null;
    }

    public final void A02() {
        C09G c09g = this.A07;
        InterfaceC59102sD interfaceC59102sD = new InterfaceC59102sD() { // from class: X.3ny
            {
                C2YR.this = this;
            }

            @Override // X.InterfaceC59102sD
            public final void AJf(int i) {
                C2YR c2yr = C2YR.this;
                c2yr.A00.setDuration(AnonymousClass029.A0g(c2yr.A03, i));
            }
        };
        final InterfaceC59112sE interfaceC59112sE = new InterfaceC59112sE() { // from class: X.3nx
            {
                C2YR.this = this;
            }

            @Override // X.InterfaceC59112sE
            public final void AOd(boolean z) {
                View findViewById;
                Activity A0F = C02180Ae.A0F(C2YR.this.getContext());
                if (A0F != null && (findViewById = A0F.findViewById(R.id.proximity_overlay)) != null) {
                    findViewById.setVisibility(z ? 0 : 4);
                }
            }
        };
        AudioPlayerView audioPlayerView = this.A04;
        C40731sm.A0h(c09g, audioPlayerView, new C2h8() { // from class: X.3nz
            {
                C2YR.this = this;
            }

            @Override // X.C2h8
            public final void AN1(int i, String str) {
                C2YR c2yr = C2YR.this;
                c2yr.A00.setDuration(str);
                if (i == 0) {
                    c2yr.A00.A01();
                } else if (i == 1) {
                    c2yr.A00.A00();
                }
            }
        }, new AnonymousClass398(audioPlayerView, interfaceC59102sD, interfaceC59112sE, this.A00) { // from class: X.3wl
            {
                C2YR.this = this;
            }

            @Override // X.InterfaceC53562h9
            public C09G AA4() {
                return C2YR.this.A07;
            }

            @Override // X.InterfaceC53562h9
            public void AJg(boolean z) {
                C09560eJ A01 = C2YR.this.A02.A01();
                if (A01 == null || A01.A0W != null) {
                    return;
                }
                interfaceC59112sE.AOd(z);
            }
        }, this.A03, this.A02);
    }
}
