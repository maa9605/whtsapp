package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.3M5  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3M5 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C2AK A03;
    public final /* synthetic */ VoipStanzaChildNode A04;
    public final /* synthetic */ C2UG A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ C3M5(C2AK c2ak, String str, UserJid userJid, VoipStanzaChildNode voipStanzaChildNode, Jid jid, String str2, long j, boolean z, C2UG c2ug) {
        this.A03 = c2ak;
        this.A06 = str;
        this.A02 = userJid;
        this.A04 = voipStanzaChildNode;
        this.A01 = jid;
        this.A07 = str2;
        this.A00 = j;
        this.A08 = z;
        this.A05 = c2ug;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2AK c2ak = this.A03;
        String str = this.A06;
        UserJid userJid = this.A02;
        VoipStanzaChildNode voipStanzaChildNode = this.A04;
        Jid jid = this.A01;
        String str2 = this.A07;
        long j = this.A00;
        boolean z = this.A08;
        C2UG c2ug = this.A05;
        int A01 = C2AK.A01(str, userJid, 4, voipStanzaChildNode);
        if (A01 != 200) {
            c2ak.A04(jid, str2, A01, j);
            return;
        }
        String A0t = AnonymousClass029.A0t(str);
        C0HY c0hy = c2ak.A0L;
        if (c0hy.A04(new C07950aM(userJid, true, A0t, -1)) != null) {
            C000200d.A19("app/xmpp/recv/web_action_relay_call_message call-id: ", str, " exists in call log");
        } else {
            c0hy.A03(userJid, true, A0t, -1, c2ak.A0G.A05(), z, true);
        }
        c2ak.A06(c2ug);
        c2ak.A05(jid, str2, j);
    }
}
