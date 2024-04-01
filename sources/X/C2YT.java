package X;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerMetadataView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;

/* renamed from: X.2YT */
/* loaded from: classes2.dex */
public abstract class C2YT extends C2YU {
    public C018508q A00;
    public C03010Du A01;
    public C018608r A02;
    public C02F A03;
    public C41771uU A04;
    public C42451vl A05;
    public C2K4 A06;
    public C09G A07;
    public C42461vm A08;
    public C42471vn A09;
    public final AbstractView$OnClickListenerC49532Ky A0A;
    public final AbstractView$OnClickListenerC49532Ky A0B;
    public final AbstractView$OnClickListenerC49532Ky A0C;
    public final AbstractView$OnClickListenerC49532Ky A0D;

    public C2YT(Context context) {
        super(context);
        this.A0B = new ViewOnClickCListenerShape10S0100000_I0_2(this, 24);
        this.A0D = new ViewOnClickCListenerShape10S0100000_I0_2(this, 25);
        this.A0A = new ViewOnClickCListenerShape10S0100000_I0_2(this, 26);
        this.A0C = new ViewOnClickCListenerShape10S0100000_I0_2(this, 27);
    }

    public void A01() {
        if (!(this instanceof C51802Yb)) {
            final C2YR c2yr = (C2YR) this;
            C40731sm.A0g(c2yr.A07, c2yr.A04, c2yr.A0A, c2yr.A0D, c2yr.A0B, c2yr.A0C, new InterfaceC53542h6() { // from class: X.3nw
                @Override // X.InterfaceC53542h6
                public final void AOx(int i) {
                    String A0k;
                    C2YR c2yr2 = c2yr;
                    if (i == 0) {
                        c2yr2.A04.A01.setVisibility(8);
                        c2yr2.A02();
                    } else if (i == 1) {
                        c2yr2.A00.A00();
                        c2yr2.A00.setDuration(C02180Ae.A0k(c2yr2.A03, ((AnonymousClass097) c2yr2.A07).A01));
                        C23X.A02(((C2YT) c2yr2).A04, c2yr2.A04.A01, c2yr2.A07);
                    } else if (i == 2 || i == 3) {
                        c2yr2.A04.A01.setVisibility(8);
                        c2yr2.A00.A00();
                        ConversationRowAudioPreview conversationRowAudioPreview = c2yr2.A00;
                        C09G c09g = c2yr2.A07;
                        C002301c c002301c = c2yr2.A03;
                        int i2 = ((AnonymousClass097) c09g).A00;
                        if (i2 != 0) {
                            A0k = AnonymousClass029.A0g(c002301c, i2);
                        } else {
                            A0k = C02180Ae.A0k(c002301c, ((AnonymousClass097) c09g).A01);
                        }
                        conversationRowAudioPreview.setDuration(A0k);
                    }
                }
            });
            return;
        }
        final C51802Yb c51802Yb = (C51802Yb) this;
        C40731sm.A0g(((C2YT) c51802Yb).A07, c51802Yb.A07, c51802Yb.A0A, c51802Yb.A0D, c51802Yb.A0B, c51802Yb.A0C, new InterfaceC53542h6() { // from class: X.3o4
            @Override // X.InterfaceC53542h6
            public final void AOx(int i) {
                String A0k;
                C51802Yb c51802Yb2 = c51802Yb;
                if (i == 0) {
                    c51802Yb2.A07.A01.setVisibility(8);
                    c51802Yb2.A02();
                } else if (i == 1) {
                    c51802Yb2.A06.setDescription(C02180Ae.A0k(c51802Yb2.A05, ((AnonymousClass097) ((C2YT) c51802Yb2).A07).A01));
                    C23X.A02(((C2YT) c51802Yb2).A04, c51802Yb2.A07.A01, ((C2YT) c51802Yb2).A07);
                } else if (i == 2 || i == 3) {
                    c51802Yb2.A07.A01.setVisibility(8);
                    AudioPlayerMetadataView audioPlayerMetadataView = c51802Yb2.A06;
                    C09G c09g = ((C2YT) c51802Yb2).A07;
                    C002301c c002301c = c51802Yb2.A05;
                    int i2 = ((AnonymousClass097) c09g).A00;
                    if (i2 != 0) {
                        A0k = AnonymousClass029.A0g(c002301c, i2);
                    } else {
                        A0k = C02180Ae.A0k(c002301c, ((AnonymousClass097) c09g).A01);
                    }
                    audioPlayerMetadataView.setDescription(A0k);
                }
            }
        });
        c51802Yb.A08.setupMicBackgroudnColor(R.color.search_attachment_background);
        C23X.A0K(c51802Yb.A07, c51802Yb.A08, ((C2YT) c51802Yb).A07);
        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = c51802Yb.A08;
        ImageView imageView = voiceNoteProfileAvatarView.A05;
        if (((C2YT) c51802Yb).A07.A0n.A02) {
            C0Zn c0Zn = c51802Yb.A09;
            C02L c02l = c51802Yb.A00;
            c02l.A05();
            C0K1 c0k1 = c02l.A01;
            if (c0k1 != null) {
                c0Zn.A02(c0k1, imageView);
                return;
            }
            throw null;
        }
        voiceNoteProfileAvatarView.A03.setVisibility(8);
        imageView.setVisibility(0);
        C09G c09g = ((C2YT) c51802Yb).A07;
        AbstractC005302j abstractC005302j = c09g.A0n.A00;
        if (abstractC005302j != null) {
            if (C003101m.A0U(abstractC005302j) && (abstractC005302j = c09g.A0G) == null) {
                throw null;
            }
            c51802Yb.A09.A02(c51802Yb.A01.A0A(abstractC005302j), imageView);
            return;
        }
        throw null;
    }

    public C09G getFMessageAudio() {
        return this.A07;
    }

    public final void setAudioMessage(C09G c09g) {
        this.A07 = c09g;
        A01();
    }
}
