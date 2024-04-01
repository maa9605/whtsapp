package com.whatsapp.voipcalling;

import X.C000200d;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class SyncDevicesUserInfo {
    public final UserJid jid;
    public final String phash;

    public SyncDevicesUserInfo(String str, String str2) {
        UserJid nullable = UserJid.getNullable(str);
        if (nullable != null) {
            this.jid = nullable;
            this.phash = str2;
            return;
        }
        throw null;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SyncDevicesUserInfo {jid=");
        A0P.append(this.jid);
        A0P.append(", phash=");
        A0P.append(this.phash);
        A0P.append('}');
        return A0P.toString();
    }
}
