package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3uS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84853uS extends AbstractC74483dL {
    public final /* synthetic */ VoipActivityV2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84853uS(VoipActivityV2 voipActivityV2, InterfaceC52052Zt interfaceC52052Zt, UserJid userJid) {
        super("display", interfaceC52052Zt, userJid, voipActivityV2.A1l);
        this.A00 = voipActivityV2;
    }

    public final boolean A09() {
        UserJid userJid;
        VideoCallParticipantView videoCallParticipantView;
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A00.A17;
        if (maximizedParticipantVideoDialogFragment != null) {
            UserJid userJid2 = this.A03;
            AbstractC74483dL abstractC74483dL = maximizedParticipantVideoDialogFragment.A0B;
            if (abstractC74483dL != null) {
                userJid = abstractC74483dL.A03;
            } else {
                userJid = null;
            }
            if (userJid2.equals(userJid) && (videoCallParticipantView = super.A00) != null && videoCallParticipantView.A03 != 7) {
                return true;
            }
            return false;
        }
        return false;
    }
}
