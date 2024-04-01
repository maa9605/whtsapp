package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.0Mu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04990Mu {
    public final Jid A00;
    public final VoipStanzaChildNode A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C04990Mu(String str, Jid jid, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        this(str, jid, str2, voipStanzaChildNode, false);
    }

    public C04990Mu(String str, Jid jid, String str2, VoipStanzaChildNode voipStanzaChildNode, boolean z) {
        if (C003101m.A0R(jid)) {
            this.A03 = str;
            this.A00 = jid;
            this.A02 = str2;
            this.A01 = voipStanzaChildNode;
            this.A04 = z;
            return;
        }
        StringBuilder sb = new StringBuilder("CallStanza:Wrong jid type: ");
        sb.append(jid);
        throw new IllegalArgumentException(sb.toString());
    }
}
