package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.2UG  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2UG extends C04990Mu {
    public final long A00;
    public final Jid A01;
    public final boolean A02;

    public C2UG(String str, Jid jid, UserJid userJid, String str2, VoipStanzaChildNode voipStanzaChildNode, long j) {
        super(str, userJid, str2, voipStanzaChildNode, true);
        this.A01 = jid;
        this.A02 = false;
        this.A00 = j;
    }

    public C2UG(String str, Jid jid, UserJid userJid, String str2, VoipStanzaChildNode voipStanzaChildNode, boolean z, long j) {
        super(str, userJid, str2, voipStanzaChildNode, true);
        this.A01 = jid;
        this.A02 = z;
        this.A00 = j;
    }
}
