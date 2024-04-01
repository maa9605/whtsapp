package X;

import com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3cI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC73843cI extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ VoiceService$VoiceServiceEventCallback A01;
    public final /* synthetic */ Voip.DebugTapType A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ Voip.RecordingInfo[] A04;

    public /* synthetic */ RunnableC73843cI(VoiceService$VoiceServiceEventCallback voiceService$VoiceServiceEventCallback, Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType, byte[] bArr, int i) {
        this.A01 = voiceService$VoiceServiceEventCallback;
        this.A04 = recordingInfoArr;
        this.A02 = debugTapType;
        this.A03 = bArr;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.lambda$callCaptureBufferFilled$2706$VoiceService$VoiceServiceEventCallback(this.A04, this.A02, this.A03, this.A00);
    }
}
