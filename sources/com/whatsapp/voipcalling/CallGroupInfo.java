package com.whatsapp.voipcalling;

import X.C000200d;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class CallGroupInfo {
    public final CallParticipant[] participants;
    public final int transactionId;

    public CallGroupInfo(int i, CallParticipant[] callParticipantArr) {
        this.transactionId = i;
        this.participants = callParticipantArr;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CallGroupInfo{transactionId=");
        A0P.append(this.transactionId);
        A0P.append(", participants=");
        A0P.append(Arrays.toString(this.participants));
        A0P.append('}');
        return A0P.toString();
    }
}
