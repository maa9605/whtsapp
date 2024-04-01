package com.whatsapp.voipcalling;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* loaded from: classes.dex */
public interface SignalingXmppCallback {
    void sendCallStanza(Jid jid, String str, VoipStanzaChildNode voipStanzaChildNode);
}
