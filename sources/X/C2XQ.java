package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.2XQ */
/* loaded from: classes2.dex */
public class C2XQ extends C2XR {
    public TextView A00;
    public final View.OnClickListener A01;
    public final ImageView A02;
    public final ImageView A03;
    public final C0Zn A04;
    public final C03120Eg A05;
    public final C59122sF A06;
    public final AudioPlayerView A07;
    public final VoiceNoteProfileAvatarView A08;

    public C2XQ(Context context, C09G c09g, C0Zn c0Zn, C42381ve c42381ve, C03120Eg c03120Eg) {
        super(context, c09g, c42381ve, c03120Eg);
        this.A01 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 21);
        this.A04 = c0Zn;
        this.A05 = c03120Eg;
        this.A07 = (AudioPlayerView) C0AT.A0D(this, R.id.conversation_row_audio_player_view);
        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = (VoiceNoteProfileAvatarView) C0AT.A0D(this, R.id.conversation_row_voice_note_profile_avatar);
        this.A08 = voiceNoteProfileAvatarView;
        this.A03 = voiceNoteProfileAvatarView.A05;
        this.A02 = voiceNoteProfileAvatarView.A03;
        this.A06 = new C59122sF(voiceNoteProfileAvatarView);
        this.A00 = (TextView) findViewById(R.id.description);
        A0r(false, false);
    }

    @Override // X.C2W4, X.AbstractC48182Ef
    public void A0I() {
        super.A0I();
        A0r(false, false);
    }

    @Override // X.C2W4, X.AbstractC48182Ef
    public void A0N() {
        C09G c09g;
        final C09G fMessage = getFMessage();
        if (getRowsContainer() instanceof InterfaceC04720Lo) {
            boolean AFn = ((InterfaceC04720Lo) getRowsContainer()).AFn();
            if (((C2JE) this).A02 == null || RequestPermissionActivity.A0Q(getContext(), ((C2JE) this).A02)) {
                Context context = getContext();
                C655737s c655737s = new C655737s(this);
                C42461vm c42461vm = ((AbstractC48202Eh) this).A0M;
                if (c42461vm != null) {
                    if (C40731sm.A0p(fMessage, context, c655737s, c42461vm, ((AbstractC48182Ef) this).A0G, ((C2JE) this).A07)) {
                        C01B c01b = ((AbstractC48182Ef) this).A0K;
                        C03B c03b = C01C.A24;
                        if (c01b.A0E(c03b) && C0K7.A03()) {
                            C03120Eg c03120Eg = this.A05;
                            synchronized (c03120Eg) {
                                c09g = c03120Eg.A01;
                            }
                            if (c09g != null && c09g.A0p != fMessage.A0p) {
                                InterfaceC04690Ll rowsContainer = getRowsContainer();
                                if (rowsContainer instanceof InterfaceC04720Lo) {
                                    ((InterfaceC04720Lo) rowsContainer).ARn(c09g, 0L);
                                }
                            }
                        }
                        final C09560eJ A01 = ((C2W4) this).A04.A01(fMessage, C018308n.A00(getContext()), true);
                        A01.A0H(fMessage);
                        A01.A0I = new C655637r(this);
                        if (AFn) {
                            ((InterfaceC04720Lo) getRowsContainer()).AT4(true);
                            A01.A0G = new InterfaceC59072sA() { // from class: X.385
                                {
                                    C2XQ.this = this;
                                }

                                @Override // X.InterfaceC59072sA
                                public final void AMz(int i) {
                                    C2XQ c2xq = C2XQ.this;
                                    C09G c09g2 = fMessage;
                                    C09560eJ c09560eJ = A01;
                                    InterfaceC04690Ll rowsContainer2 = c2xq.getRowsContainer();
                                    if (rowsContainer2 instanceof InterfaceC04720Lo) {
                                        InterfaceC04720Lo interfaceC04720Lo = (InterfaceC04720Lo) rowsContainer2;
                                        if (interfaceC04720Lo.A66(c09g2, c09560eJ.A0Q) && interfaceC04720Lo.A6X(c09g2, i, c09560eJ.A0Q)) {
                                            c09560eJ.A0P = true;
                                        } else if (!((AbstractC48182Ef) c2xq).A0K.A0E(C01C.A24) || !C0K7.A03()) {
                                        } else {
                                            c2xq.A0q(c09g2);
                                        }
                                    }
                                }
                            };
                        } else {
                            A01.A0G = new InterfaceC59072sA() { // from class: X.386
                                {
                                    C2XQ.this = this;
                                }

                                @Override // X.InterfaceC59072sA
                                public final void AMz(int i) {
                                    C2XQ c2xq = C2XQ.this;
                                    C09G c09g2 = fMessage;
                                    if (((AbstractC48182Ef) c2xq).A0K.A0E(C01C.A24) && C0K7.A03()) {
                                        c2xq.A0q(c09g2);
                                    }
                                }
                            };
                        }
                        A01.A0J(true);
                        super.A0I();
                        A0r(true, true);
                        if (((AbstractC48182Ef) this).A0K.A0E(c03b) && C0K7.A03() && !A01.A0K()) {
                            A0q(fMessage);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw null;
            }
            return;
        }
        super.A0N();
    }

    @Override // X.C2W4, X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0r(false, false);
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0Y(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0r(false, true);
        }
    }

    public final void A0q(C09G c09g) {
        InterfaceC04690Ll rowsContainer = getRowsContainer();
        if (rowsContainer instanceof InterfaceC04720Lo) {
            this.A05.A06();
            ((InterfaceC04720Lo) rowsContainer).ARn(c09g, ((AbstractC48182Ef) this).A0K.A07(C01C.A3p));
        }
    }

    public final void A0r(boolean z, boolean z2) {
        C09560eJ c09560eJ;
        C09G c09g;
        C09G fMessage = getFMessage();
        AudioPlayerView audioPlayerView = this.A07;
        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A08;
        C23X.A0K(audioPlayerView, voiceNoteProfileAvatarView, fMessage);
        C0Zn c0Zn = this.A04;
        C02L c02l = ((AbstractC48182Ef) this).A0I;
        C05W c05w = ((AbstractC48182Ef) this).A0R;
        ImageView imageView = voiceNoteProfileAvatarView.A05;
        AnonymousClass094 anonymousClass094 = fMessage.A0n;
        boolean z3 = anonymousClass094.A02;
        if (z3) {
            c02l.A05();
            c0Zn.A02(c02l.A01, imageView);
        } else {
            ImageView imageView2 = voiceNoteProfileAvatarView.A03;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (C003101m.A0U(abstractC005302j)) {
                imageView2.setVisibility(0);
                imageView.setVisibility(8);
                abstractC005302j = fMessage.A0G;
                if (abstractC005302j == null) {
                    throw null;
                }
                imageView = imageView2;
            } else {
                imageView2.setVisibility(8);
                imageView.setVisibility(0);
                if (abstractC005302j == null) {
                    throw null;
                }
            }
            c0Zn.A02(c05w.A0A(abstractC005302j), imageView);
        }
        if (!z3 && C003101m.A0U(anonymousClass094.A00)) {
            findViewById(R.id.conversation_row_audio_player_view).setPadding(0, getResources().getDimensionPixelSize(R.dimen.conversation_row_voice_note_top_padding), 0, 0);
        }
        if (((AbstractC48182Ef) this).A0K.A0E(C01C.A24) && C0K7.A03()) {
            voiceNoteProfileAvatarView.setOnFastPlaybackButtonClickListener(this.A01);
            C09G fMessage2 = getFMessage();
            C03120Eg c03120Eg = ((C2W4) this).A04.A05;
            if (c03120Eg.A09(fMessage2)) {
                c09560eJ = c03120Eg.A01();
            } else {
                c09560eJ = null;
            }
            C03120Eg c03120Eg2 = this.A05;
            synchronized (c03120Eg2) {
                c09g = c03120Eg2.A01;
            }
            C09560eJ A01 = c03120Eg2.A01();
            AnonymousClass094 anonymousClass0942 = fMessage2.A0n;
            boolean z4 = anonymousClass0942.A02;
            boolean A0U = C003101m.A0U(anonymousClass0942.A00);
            if ((c09560eJ != null && c09560eJ.A0K()) || z || ((A01 == null || !A01.A0K()) && c09g != null && c09g.A0p == fMessage2.A0p)) {
                C59122sF c59122sF = this.A06;
                int i = C09560eJ.A0p;
                if (c59122sF == null) {
                    throw null;
                }
                if (i == 0) {
                    c59122sF.A00.A02(1, z2, z4, A0U);
                } else if (i == 1) {
                    c59122sF.A00.A02(2, z2, z4, A0U);
                } else if (i == 2) {
                    c59122sF.A00.A02(3, z2, z4, A0U);
                }
            } else {
                this.A06.A00.A02(0, z2, z4, A0U);
            }
        }
        A0l(fMessage);
    }

    @Override // X.C2W4, X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_voice_note_left;
    }

    @Override // X.C2W4, X.C2JE
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.C2W4, X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_voice_note_left;
    }

    @Override // X.C2W4, X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_voice_note_right;
    }

    @Override // X.C2W4
    public void setDuration(String str) {
        TextView textView = this.A00;
        if (textView == null) {
            textView = (TextView) findViewById(R.id.description);
            this.A00 = textView;
        }
        textView.setText(str);
    }
}
