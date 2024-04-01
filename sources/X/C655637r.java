package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.conversation.conversationrow.WaveformVisualizerView;

/* renamed from: X.37r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C655637r implements InterfaceC59092sC {
    public final /* synthetic */ C2W4 A00;

    public /* synthetic */ C655637r(C2W4 c2w4) {
        this.A00 = c2w4;
    }

    @Override // X.InterfaceC59092sC
    public final void AQT(byte[] bArr) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A00.A03;
        if (conversationRowAudioPreview != null) {
            WaveformVisualizerView waveformVisualizerView = conversationRowAudioPreview.A02;
            waveformVisualizerView.A00 = bArr;
            waveformVisualizerView.invalidate();
        }
    }
}
