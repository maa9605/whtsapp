package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.search.views.itemviews.AudioPlayerMetadataView;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.2Yb */
/* loaded from: classes2.dex */
public class C51802Yb extends AbstractC51812Yc {
    public C02L A00;
    public C05W A01;
    public C0L5 A02;
    public C42381ve A03;
    public C03120Eg A04;
    public C002301c A05;
    public AudioPlayerMetadataView A06;
    public AudioPlayerView A07;
    public VoiceNoteProfileAvatarView A08;
    public final C0Zn A09;

    public C51802Yb(Context context) {
        super(context);
        this.A09 = this.A02.A04(context);
        setOrientation(0);
        setGravity(16);
        LinearLayout.inflate(context, R.layout.search_attachment_voice_note, this);
        this.A06 = (AudioPlayerMetadataView) C0AT.A0D(this, R.id.search_row_voice_note_metadata);
        this.A07 = (AudioPlayerView) C0AT.A0D(this, R.id.search_row_voice_note_controls);
        this.A08 = (VoiceNoteProfileAvatarView) C0AT.A0D(this, R.id.search_row_voice_note_preview);
        Drawable A03 = C02160Ac.A03(context, R.drawable.search_attachment_background);
        if (A03 != null) {
            setBackground(C02180Ae.A0Q(A03, C02160Ac.A00(getContext(), R.color.search_attachment_background)));
            C80993oB c80993oB = new C80993oB(this);
            InterfaceC71283Vn interfaceC71283Vn = new InterfaceC71283Vn() { // from class: X.3o9
                {
                    C51802Yb.this = this;
                }

                @Override // X.InterfaceC71283Vn
                public final C09G AA5() {
                    return ((C2YT) C51802Yb.this).A07;
                }
            };
            AudioPlayerView audioPlayerView = this.A07;
            audioPlayerView.setPlaybackListener(new C71303Vp(audioPlayerView, interfaceC71283Vn, this.A04, c80993oB));
            return;
        }
        throw null;
    }

    public final void A02() {
        C09G c09g = super.A07;
        InterfaceC59102sD interfaceC59102sD = new InterfaceC59102sD() { // from class: X.3o2
            {
                C51802Yb.this = this;
            }

            @Override // X.InterfaceC59102sD
            public final void AJf(int i) {
                C51802Yb c51802Yb = C51802Yb.this;
                c51802Yb.A06.setDescription(AnonymousClass029.A0g(c51802Yb.A05, i));
            }
        };
        final InterfaceC59112sE interfaceC59112sE = new InterfaceC59112sE() { // from class: X.3o1
            {
                C51802Yb.this = this;
            }

            @Override // X.InterfaceC59112sE
            public final void AOd(boolean z) {
                View findViewById = C018308n.A00(C51802Yb.this.getContext()).findViewById(R.id.proximity_overlay);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 0 : 4);
                }
            }
        };
        AudioPlayerView audioPlayerView = this.A07;
        C40731sm.A0h(c09g, audioPlayerView, new C2h8() { // from class: X.3o3
            {
                C51802Yb.this = this;
            }

            @Override // X.C2h8
            public final void AN1(int i, String str) {
                C51802Yb.this.A06.setDescription(str);
            }
        }, new AnonymousClass398(audioPlayerView, interfaceC59102sD, interfaceC59112sE) { // from class: X.3wm
            {
                C51802Yb.this = this;
            }

            @Override // X.InterfaceC53562h9
            public C09G AA4() {
                return ((C2YT) C51802Yb.this).A07;
            }

            @Override // X.InterfaceC53562h9
            public void AJg(boolean z) {
                C09560eJ A01 = C51802Yb.this.A04.A01();
                if (A01 == null || A01.A0W != null) {
                    return;
                }
                interfaceC59112sE.AOd(z);
            }
        }, this.A05, this.A04);
    }
}
