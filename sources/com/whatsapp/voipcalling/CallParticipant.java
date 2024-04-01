package com.whatsapp.voipcalling;

import X.C000200d;
import X.C000700j;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public final class CallParticipant {
    public final UserJid jid;
    public final String state;

    public CallParticipant(UserJid userJid, String str) {
        this.jid = userJid;
        this.state = str;
    }

    public static CallParticipant create(String str, String str2) {
        UserJid nullable = UserJid.getNullable(str);
        if (nullable == null) {
            StringBuilder sb = new StringBuilder("UserJid was null. Parsed: ");
            sb.append(str);
            C000700j.A08(false, sb.toString());
            return null;
        }
        return new CallParticipant(nullable, str2);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CallParticipant{jid=");
        A0P.append(this.jid);
        A0P.append(", state=");
        A0P.append(this.state);
        A0P.append('}');
        return A0P.toString();
    }
}
