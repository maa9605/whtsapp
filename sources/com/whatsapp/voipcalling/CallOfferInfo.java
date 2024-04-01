package com.whatsapp.voipcalling;

import X.C000700j;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* loaded from: classes.dex */
public class CallOfferInfo {
    public final CallGroupInfo callGroupInfo;
    public final String callId;
    public final long epochTimeMillis;
    public final UserJid fromJid;
    public final boolean isJoinableCall;
    public final boolean isVideoCall;
    public final CallMetadata metadata;
    public final boolean resume;
    public final boolean uploadFieldStat;

    public CallOfferInfo(UserJid userJid, GroupJid groupJid, String str, long j, boolean z, CallGroupInfo callGroupInfo, boolean z2, boolean z3, boolean z4) {
        this.fromJid = userJid;
        this.metadata = new CallMetadata(groupJid);
        this.callId = str;
        this.epochTimeMillis = j;
        this.isVideoCall = z;
        this.callGroupInfo = callGroupInfo;
        this.resume = z2;
        this.uploadFieldStat = z3;
        this.isJoinableCall = z4;
    }

    public static CallOfferInfo create(UserJid userJid, GroupJid groupJid, String str, long j, boolean z, CallGroupInfo callGroupInfo, boolean z2, boolean z3, boolean z4) {
        if (str == null) {
            C000700j.A08(false, "callId shouldn't be null");
            return null;
        }
        return new CallOfferInfo(userJid, groupJid, str, j, z, callGroupInfo, z2, z3, z4);
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableCall && this.callGroupInfo != null;
    }
}
