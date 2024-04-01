package com.whatsapp.voipcalling;

import X.C000200d;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CallParticipantJid {
    public final DeviceJid[] deviceJids;
    public final UserJid userJid;

    public CallParticipantJid(UserJid userJid, DeviceJid[] deviceJidArr) {
        this.userJid = userJid;
        this.deviceJids = deviceJidArr;
    }

    public DeviceJid[] getDeviceJids() {
        return this.deviceJids;
    }

    public UserJid getUserJid() {
        return this.userJid;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CallParticipantJid userJid=");
        A0P.append(this.userJid);
        A0P.append(", deviceJids=(");
        A0P.append(Arrays.toString(this.deviceJids));
        A0P.append(')');
        return A0P.toString();
    }
}
