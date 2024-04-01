package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.3M4  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3M4 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ Jid A02;
    public final /* synthetic */ C2AK A03;
    public final /* synthetic */ VoipStanzaChildNode A04;
    public final /* synthetic */ C2UG A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ C3M4(C2AK c2ak, String str, Jid jid, VoipStanzaChildNode voipStanzaChildNode, Jid jid2, String str2, long j, C2UG c2ug) {
        this.A03 = c2ak;
        this.A06 = str;
        this.A01 = jid;
        this.A04 = voipStanzaChildNode;
        this.A02 = jid2;
        this.A07 = str2;
        this.A00 = j;
        this.A05 = c2ug;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2AK c2ak = this.A03;
        String str = this.A06;
        Jid jid = this.A01;
        VoipStanzaChildNode voipStanzaChildNode = this.A04;
        Jid jid2 = this.A02;
        String str2 = this.A07;
        long j = this.A00;
        C2UG c2ug = this.A05;
        int A01 = C2AK.A01(str, jid, 5, voipStanzaChildNode);
        if (A01 != 200) {
            c2ak.A04(jid2, str2, A01, j);
            return;
        }
        c2ak.A06(c2ug);
        c2ak.A05(jid2, str2, j);
    }
}
