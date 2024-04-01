package com.whatsapp.voipcalling;

import X.C000200d;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class CallOfferAckError {
    public final int errorCode;
    public final UserJid errorJid;

    public CallOfferAckError(String str, int i) {
        UserJid nullable = UserJid.getNullable(str);
        if (nullable != null) {
            this.errorJid = nullable;
            this.errorCode = i;
            return;
        }
        throw null;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CallOfferAckError {errorJid=");
        A0P.append(this.errorJid);
        A0P.append(", errorCode=");
        A0P.append(this.errorCode);
        A0P.append('}');
        return A0P.toString();
    }
}
