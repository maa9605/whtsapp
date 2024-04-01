package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2W4 */
/* loaded from: classes2.dex */
public class C2W4 extends C2W5 {
    public final View.OnClickListener A00;
    public final View A01;
    public final TextView A02;
    public final ConversationRowAudioPreview A03;
    public final C42381ve A04;
    public final C03120Eg A05;
    public final AudioPlayerView A06;

    public C2W4(Context context, C09G c09g, C42381ve c42381ve, C03120Eg c03120Eg) {
        super(context, c09g);
        this.A00 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 13);
        this.A04 = c42381ve;
        this.A05 = c03120Eg;
        this.A01 = findViewById(R.id.conversation_row_root);
        this.A06 = (AudioPlayerView) C0AT.A0D(this, R.id.conversation_row_audio_player_view);
        this.A03 = (ConversationRowAudioPreview) findViewById(R.id.conversation_row_audio_preview);
        this.A02 = (TextView) C0AT.A0D(this, R.id.description);
        C38I c38i = new C38I(this);
        InterfaceC71283Vn interfaceC71283Vn = new InterfaceC71283Vn() { // from class: X.389
            {
                C2W4.this = this;
            }

            @Override // X.InterfaceC71283Vn
            public final C09G AA5() {
                return C2W4.this.getFMessage();
            }
        };
        AudioPlayerView audioPlayerView = this.A06;
        audioPlayerView.setPlaybackListener(new C71303Vp(audioPlayerView, interfaceC71283Vn, c03120Eg, c38i));
        AudioPlayerView audioPlayerView2 = this.A06;
        View.OnLongClickListener onLongClickListener = this.A19;
        audioPlayerView2.setSeekbarLongClickListener(onLongClickListener);
        this.A06.setOnControlButtonLongClickListener(onLongClickListener);
        A0n();
    }

    @Override // X.AbstractC48202Eh
    public boolean A07() {
        if ((this instanceof C2YA) || (this instanceof C2XQ)) {
            return false;
        }
        return C0DB.A0K(((AbstractC48182Ef) this).A0K, super.getFMessage());
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        if (!(this instanceof C2XQ)) {
            return C0DB.A0g(super.getFMessage());
        }
        return C0DB.A0g((C09G) super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0e(false);
        A0n();
    }

    @Override // X.AbstractC48182Ef
    public void A0M() {
        A0j(this.A06.A01, super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0N() {
        if (((C2JE) this).A02 == null || RequestPermissionActivity.A0Q(getContext(), ((C2JE) this).A02)) {
            C09G c09g = (C09G) super.getFMessage();
            StringBuilder A0P = C000200d.A0P("conversationrowvoicenote/viewmessage ");
            A0P.append(c09g.A0n);
            Log.i(A0P.toString());
            Context context = getContext();
            C655737s c655737s = new C655737s(this);
            C42461vm c42461vm = ((AbstractC48202Eh) this).A0M;
            if (c42461vm != null) {
                if (C40731sm.A0p(c09g, context, c655737s, c42461vm, ((AbstractC48182Ef) this).A0G, ((C2JE) this).A07)) {
                    C09560eJ A01 = this.A04.A01(c09g, C018308n.A00(getContext()), false);
                    A01.A0H(c09g);
                    A01.A0I = new C655637r(this);
                    A01.A0J(false);
                    A0I();
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0W(AbstractC005302j abstractC005302j) {
        ImageView imageView;
        if (!(this instanceof C2XQ)) {
            AnonymousClass097 fMessage = super.getFMessage();
            if (fMessage.A0n.A02) {
                C02L c02l = ((AbstractC48182Ef) this).A0I;
                c02l.A05();
                Object obj = c02l.A03;
                if (obj == null) {
                    throw null;
                }
                if (abstractC005302j.equals(obj)) {
                    A0O();
                    return;
                }
                return;
            } else if (!abstractC005302j.equals(fMessage.A0B())) {
                return;
            } else {
                A0O();
                return;
            }
        }
        C2XQ c2xq = (C2XQ) this;
        C09G c09g = (C09G) super.getFMessage();
        if (c09g != null) {
            AnonymousClass094 anonymousClass094 = c09g.A0n;
            if (anonymousClass094.A02) {
                return;
            }
            AbstractC005302j abstractC005302j2 = anonymousClass094.A00;
            boolean A0U = C003101m.A0U(abstractC005302j2);
            if (A0U) {
                abstractC005302j2 = c09g.A0G;
            }
            if (abstractC005302j.equals(abstractC005302j2)) {
                if (A0U) {
                    imageView = c2xq.A02;
                } else {
                    imageView = c2xq.A03;
                }
                c2xq.A04.A02(((AbstractC48182Ef) c2xq).A0R.A0A(abstractC005302j2), imageView);
            }
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0n();
        } else if (C0DB.A0o(getFMessage())) {
            A0o();
        }
    }

    public final void A0n() {
        File file;
        C09G c09g = (C09G) super.getFMessage();
        C09H c09h = ((AnonymousClass097) c09g).A02;
        if (c09h != null) {
            this.A01.setContentDescription(C23X.A0C(getContext(), c09g, ((AbstractC48182Ef) this).A0X, ((AbstractC48182Ef) this).A0R, ((AbstractC48182Ef) this).A0T, ((AbstractC48202Eh) this).A0J));
            TextView textView = this.A02;
            textView.setVisibility(0);
            if (((AnonymousClass097) c09g).A00 == 0) {
                ((AnonymousClass097) c09g).A00 = C0DD.A03(c09h.A0F);
            }
            if (C0DB.A0n(getFMessage())) {
                ConversationRowAudioPreview conversationRowAudioPreview = this.A03;
                if (conversationRowAudioPreview != null) {
                    conversationRowAudioPreview.A00();
                }
                textView.setText(C02180Ae.A0k(((AbstractC48202Eh) this).A0J, ((AnonymousClass097) c09g).A01));
                AudioPlayerView audioPlayerView = this.A06;
                audioPlayerView.setPlayButtonState(4);
                audioPlayerView.setOnControlButtonClickListener(((C2JE) this).A09);
                audioPlayerView.setSeekbarProgress(0);
                setDuration(C02180Ae.A0k(((AbstractC48202Eh) this).A0J, ((AnonymousClass097) c09g).A01));
            } else if (C0DB.A0o(getFMessage())) {
                if (AnonymousClass024.A0j(((AnonymousClass097) c09g).A08) && (file = c09h.A0F) != null) {
                    ((AnonymousClass097) c09g).A08 = file.getName();
                }
                if (AnonymousClass024.A0j(((AnonymousClass097) c09g).A08)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(((AnonymousClass097) c09g).A08);
                }
                AudioPlayerView audioPlayerView2 = this.A06;
                audioPlayerView2.setSeekbarColor(C02160Ac.A00(getContext(), R.color.music_scrubber));
                A0o();
                audioPlayerView2.setOnControlButtonClickListener(this.A00);
            } else {
                ConversationRowAudioPreview conversationRowAudioPreview2 = this.A03;
                if (conversationRowAudioPreview2 != null) {
                    conversationRowAudioPreview2.A00();
                }
                textView.setText(C02180Ae.A0k(((AbstractC48202Eh) this).A0J, ((AnonymousClass097) c09g).A01));
                if (c09g.A0n.A02 && c09h.A0F != null) {
                    AudioPlayerView audioPlayerView3 = this.A06;
                    audioPlayerView3.setPlayButtonState(2);
                    audioPlayerView3.setOnControlButtonClickListener(((C2JE) this).A0B);
                } else {
                    AudioPlayerView audioPlayerView4 = this.A06;
                    audioPlayerView4.setPlayButtonState(3);
                    audioPlayerView4.setOnControlButtonClickListener(((C2JE) this).A0A);
                }
                int i = ((AnonymousClass097) c09g).A00;
                if (i != 0) {
                    setDuration(AnonymousClass029.A0g(((AbstractC48202Eh) this).A0J, i));
                } else {
                    setDuration(C02180Ae.A0k(((AbstractC48202Eh) this).A0J, ((AnonymousClass097) c09g).A01));
                }
            }
            A0M();
            A0l(c09g);
            return;
        }
        throw null;
    }

    public final void A0o() {
        C09G c09g = (C09G) super.getFMessage();
        C03120Eg c03120Eg = this.A05;
        if (!c03120Eg.A09(c09g)) {
            A0p(c09g);
            return;
        }
        final C09560eJ A01 = c03120Eg.A01();
        if (A01 == null) {
            return;
        }
        if (!A01.A0K()) {
            A0p(c09g);
        } else {
            AudioPlayerView audioPlayerView = this.A06;
            audioPlayerView.setPlayButtonState(1);
            audioPlayerView.setSeekbarProgress(A01.A03());
            audioPlayerView.setSeekbarMax(A01.A02);
            audioPlayerView.setSeekbarProgress(A01.A03());
            setDuration(AnonymousClass029.A0g(((AbstractC48202Eh) this).A0J, A01.A03() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
            ConversationRowAudioPreview conversationRowAudioPreview = this.A03;
            if (conversationRowAudioPreview != null) {
                conversationRowAudioPreview.A01();
            }
        }
        AudioPlayerView audioPlayerView2 = this.A06;
        audioPlayerView2.setSeekbarContentDescription(A01.A03());
        A01.A0I = new C655637r(this);
        A01.A0H = new AnonymousClass398(audioPlayerView2, new InterfaceC59102sD() { // from class: X.37y
            {
                C2W4.this = this;
            }

            @Override // X.InterfaceC59102sD
            public final void AJf(int i) {
                C2W4 c2w4 = C2W4.this;
                c2w4.setDuration(AnonymousClass029.A0g(((AbstractC48202Eh) c2w4).A0J, i));
            }
        }, new InterfaceC59112sE() { // from class: X.38B
            {
                C2W4.this = this;
            }

            @Override // X.InterfaceC59112sE
            public final void AOd(boolean z) {
                View findViewById = C018308n.A00(C2W4.this.getContext()).findViewById(R.id.proximity_overlay);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 0 : 4);
                }
            }
        }, this.A03) { // from class: X.3JU
            {
                C2W4.this = this;
            }

            @Override // X.InterfaceC53562h9
            public C09G AA4() {
                return C2W4.this.getFMessage();
            }

            @Override // X.InterfaceC53562h9
            public void AJg(boolean z) {
                View findViewById;
                if (A01.A0W == null && (findViewById = C018308n.A00(C2W4.this.getContext()).findViewById(R.id.proximity_overlay)) != null) {
                    findViewById.setVisibility(z ? 0 : 4);
                }
            }
        };
    }

    public final void A0p(C09G c09g) {
        Number number = (Number) C09560eJ.A0q.get(c09g.A0n);
        int intValue = number == null ? 0 : number.intValue();
        AudioPlayerView audioPlayerView = this.A06;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(((AnonymousClass097) c09g).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        audioPlayerView.setSeekbarProgress(intValue);
        audioPlayerView.setSeekbarContentDescription(intValue);
        setDuration(AnonymousClass029.A0g(((AbstractC48202Eh) this).A0J, ((AnonymousClass097) c09g).A00));
        ConversationRowAudioPreview conversationRowAudioPreview = this.A03;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_audio_left;
    }

    @Override // X.C2JE
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass097 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public C09G getFMessage() {
        return (C09G) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_audio_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_audio_right;
    }

    public void setDuration(String str) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A03;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.setDuration(str);
        }
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C09G);
        super.setFMessage(anonymousClass092);
    }
}
