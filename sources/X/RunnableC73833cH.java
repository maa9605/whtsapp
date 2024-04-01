package X;

import android.os.SystemClock;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Map;

/* renamed from: X.3cH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC73833cH extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Jid A00;
    public final /* synthetic */ VoipStanzaChildNode A01;
    public final /* synthetic */ C40591sW A02;
    public final /* synthetic */ C25L A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ RunnableC73833cH(C25L c25l, boolean z, Jid jid, String str, Map map, C40591sW c40591sW, VoipStanzaChildNode voipStanzaChildNode, String str2, boolean z2) {
        this.A03 = c25l;
        this.A07 = z;
        this.A00 = jid;
        this.A04 = str;
        this.A06 = map;
        this.A02 = c40591sW;
        this.A01 = voipStanzaChildNode;
        this.A05 = str2;
        this.A08 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25L c25l = this.A03;
        boolean z = this.A07;
        Jid jid = this.A00;
        String str = this.A04;
        Map map = this.A06;
        C40591sW c40591sW = this.A02;
        VoipStanzaChildNode voipStanzaChildNode = this.A01;
        String str2 = this.A05;
        boolean z2 = this.A08;
        if (c25l.A2G != 14) {
            c25l.A2L = false;
            if (z) {
                UserJid convertToUserJid = Voip.JidHelper.convertToUserJid(jid);
                if (convertToUserJid != null) {
                    StringBuilder sb = new StringBuilder("VoiceService:sendOfferEcryptionTask, Call ID = ");
                    sb.append(str);
                    sb.append(", peer = ");
                    sb.append(convertToUserJid);
                    Log.i(sb.toString());
                    Map A0E = c25l.A0E(map);
                    if (A0E != null) {
                        CallInfo callInfo = Voip.getCallInfo();
                        if (callInfo != null && callInfo.isCaller && callInfo.callId.equals(str) && callInfo.peerJid.equals(convertToUserJid)) {
                            voipStanzaChildNode = AnonymousClass029.A0M(c40591sW, A0E);
                        } else {
                            StringBuilder sb2 = new StringBuilder("VoiceService:sendOfferEcryptionTask(");
                            sb2.append(str);
                            sb2.append(", ");
                            sb2.append(convertToUserJid);
                            sb2.append(", call state does not match, do nothing)");
                            Log.w(sb2.toString());
                        }
                    }
                    Log.i("VoiceService:sendOfferStanza sendOfferEcryptionTask skipped or failed");
                    c25l.A2H = c40591sW;
                }
                throw null;
            }
            StringBuilder sb3 = new StringBuilder("VoiceService:sendOfferStanza without enc (Call ID = ");
            sb3.append(str);
            sb3.append(", peer = ");
            sb3.append(jid);
            sb3.append(")");
            Log.i(sb3.toString());
            if (voipStanzaChildNode != null) {
                if (c25l.A0Y == null) {
                    c25l.A0Y = new C74563dT(str2, SystemClock.elapsedRealtime());
                }
                c25l.A1w.A00(new C04990Mu(str2, jid, str, voipStanzaChildNode, z2));
                return;
            }
            c25l.A2H = c40591sW;
        }
    }
}
