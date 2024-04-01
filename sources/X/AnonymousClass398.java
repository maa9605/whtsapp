package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.398  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass398 implements InterfaceC53562h9 {
    public int A00 = -1;
    public final ConversationRowAudioPreview A01;
    public final InterfaceC59102sD A02;
    public final InterfaceC59112sE A03;
    public final AudioPlayerView A04;

    public AnonymousClass398(AudioPlayerView audioPlayerView, InterfaceC59102sD interfaceC59102sD, InterfaceC59112sE interfaceC59112sE, ConversationRowAudioPreview conversationRowAudioPreview) {
        this.A04 = audioPlayerView;
        this.A02 = interfaceC59102sD;
        this.A03 = interfaceC59112sE;
        this.A01 = conversationRowAudioPreview;
    }

    @Override // X.InterfaceC53562h9
    public void AMl(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(((AnonymousClass097) AA4()).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription(i);
        this.A02.AJf(((AnonymousClass097) AA4()).A00);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
    }

    @Override // X.InterfaceC53562h9
    public void ANN(int i) {
        int i2 = this.A00;
        int i3 = i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        if (i2 != i3) {
            this.A00 = i3;
            this.A02.AJf(i3);
        }
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription(i);
    }

    @Override // X.InterfaceC53562h9
    public void AOH() {
        this.A04.setPlayButtonState(1);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
    }

    @Override // X.InterfaceC53562h9
    public void AOq(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(1);
        audioPlayerView.setSeekbarMax(i);
        this.A00 = -1;
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
    }

    @Override // X.InterfaceC53562h9
    public void APA(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarProgress(0);
        this.A02.AJf(i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
        this.A03.AOd(false);
    }
}
