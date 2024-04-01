package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.3TH  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3TH {
    public final int A00;
    public final Jid A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final VoipStanzaChildNode[] A05;

    public C3TH(String str, Jid jid, String str2, int i, boolean z, VoipStanzaChildNode[] voipStanzaChildNodeArr) {
        if (C003101m.A0R(jid)) {
            this.A02 = str;
            this.A01 = jid;
            this.A03 = str2;
            this.A00 = i;
            this.A04 = z;
            this.A05 = voipStanzaChildNodeArr;
            return;
        }
        StringBuilder sb = new StringBuilder("CallIncomingAck:Wrong jid type: ");
        sb.append(jid);
        throw new IllegalArgumentException(sb.toString());
    }
}
