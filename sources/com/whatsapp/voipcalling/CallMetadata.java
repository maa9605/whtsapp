package com.whatsapp.voipcalling;

import X.C000200d;
import com.whatsapp.jid.GroupJid;

/* loaded from: classes.dex */
public class CallMetadata {
    public final GroupJid groupJid;

    public CallMetadata(GroupJid groupJid) {
        this.groupJid = groupJid;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CallMetadata groupJid=");
        A0P.append(this.groupJid);
        return A0P.toString();
    }
}
