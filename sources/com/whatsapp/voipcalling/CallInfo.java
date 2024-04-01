package com.whatsapp.voipcalling;

import X.C000200d;
import X.C000700j;
import X.C003101m;
import X.C28231Qu;
import X.C28241Qv;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.Voip;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class CallInfo {
    public long ECMode;
    public long audioDuration;
    public long bytesReceived;
    public long bytesSent;
    public long callActiveTime;
    public long callDuration;
    public boolean callEnding;
    public final String callId;
    public int callResult;
    public int callSetupErrorType;
    public final Voip.CallState callState;
    public C28231Qu callWaitingInfo;
    public final UserJid creatorJid;
    public final GroupJid groupJid;
    public int initialGroupTransactionId;
    public final UserJid initialPeerJid;
    public boolean isCaller;
    public boolean isEndedByMe;
    public boolean isGroupCall;
    public boolean isGroupCallCreatedOnServer;
    public boolean isGroupCallEnabled;
    public final boolean isJoinableGroupCall;
    public final Map participants = new LinkedHashMap();
    public final UserJid peerJid;
    public C28241Qv self;
    public boolean videoCaptureStarted;
    public long videoDuration;
    public boolean videoEnabled;
    public boolean videoPreviewReady;

    public CallInfo(Voip.CallState callState, String str, UserJid userJid, UserJid userJid2, UserJid userJid3, GroupJid groupJid, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i3, boolean z10) {
        this.callState = callState;
        this.callId = str;
        this.peerJid = userJid;
        this.initialPeerJid = userJid2;
        this.creatorJid = userJid3;
        this.groupJid = groupJid;
        this.isCaller = z;
        this.isGroupCall = z2;
        this.isGroupCallEnabled = z3;
        this.isGroupCallCreatedOnServer = z4;
        this.videoEnabled = z5;
        this.isEndedByMe = z6;
        this.callResult = i;
        this.callSetupErrorType = i2;
        this.callEnding = z7;
        this.videoPreviewReady = z8;
        this.videoCaptureStarted = z9;
        this.callActiveTime = j;
        this.callDuration = j2;
        this.audioDuration = j3;
        this.videoDuration = j4;
        this.bytesSent = j5;
        this.bytesReceived = j6;
        this.ECMode = j7;
        this.initialGroupTransactionId = i3;
        this.isJoinableGroupCall = z10;
    }

    private void addParticipantInfo(UserJid userJid, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, boolean z9, int i3, int i4, int i5, boolean z10, boolean z11, int i6, boolean z12, boolean z13) {
        boolean z14 = true;
        if (i < 1 || (i > 7 && i != 11)) {
            z14 = false;
        }
        StringBuilder sb = new StringBuilder("invalid participant state ");
        sb.append(i);
        C000700j.A08(z14, sb.toString());
        C28241Qv c28241Qv = new C28241Qv(userJid, i, z, z2, z3, z4, z5, z6, z7, z8, z9, i2, i3, i4, i5, z10, z11, i6, z12, z13);
        this.participants.put(userJid, c28241Qv);
        if (c28241Qv.A0E) {
            this.self = c28241Qv;
        }
    }

    public static CallInfo convertCallWaitingInfoToCallInfo(CallInfo callInfo) {
        C28231Qu c28231Qu = callInfo.callWaitingInfo;
        Voip.CallState callState = c28231Qu.A01 == 1 ? Voip.CallState.RECEIVED_CALL : Voip.CallState.ACTIVE;
        UserJid userJid = c28231Qu.A03.initialPeerJid;
        if (userJid != null) {
            String str = c28231Qu.A04;
            UserJid userJid2 = (UserJid) c28231Qu.A05.get(0);
            GroupJid groupJid = c28231Qu.A02;
            boolean z = c28231Qu.A00 > 1;
            boolean z2 = callInfo.isGroupCallEnabled;
            boolean z3 = c28231Qu.A07;
            CallInfo callInfo2 = new CallInfo(callState, str, userJid, userJid, userJid2, groupJid, false, z, z2, false, z3, false, 0, 0, false, false, false, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, c28231Qu.A06);
            C28241Qv c28241Qv = callInfo.self;
            callInfo2.addParticipantInfo(c28241Qv.A06, c28241Qv.A01, true, false, c28241Qv.A09, c28241Qv.A0C, c28241Qv.A0A, 1, c28241Qv.A0J, c28241Qv.A0I, c28241Qv.A0H, c28241Qv.A0G, c28241Qv.A05, c28241Qv.A02, c28241Qv.A03 * 90, c28241Qv.A07, c28241Qv.A08, c28241Qv.A00, c28241Qv.A0F, false);
            for (UserJid userJid3 : c28231Qu.A05) {
                callInfo2.addParticipantInfo(userJid3, 2, false, false, false, false, false, z3 ? 1 : 0, false, false, false, false, 0, 0, 0, false, false, 0, false, false);
            }
            callInfo2.setCallWaitingInfo(false, 0, "", 0, new String[0], null, false, false, 0, 0, false, null, false);
            return callInfo2;
        }
        throw null;
    }

    public boolean enableAudioVideoSwitch() {
        return this.self.A07;
    }

    public long getAudioDuration() {
        return this.audioDuration;
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getBytesSent() {
        return this.bytesSent;
    }

    public long getCallActiveTime() {
        return this.callActiveTime;
    }

    public long getCallDuration() {
        return this.callDuration;
    }

    public String getCallId() {
        return this.callId;
    }

    public int getCallResult() {
        return this.callResult;
    }

    public int getCallSetupErrorType() {
        return this.callSetupErrorType;
    }

    public Voip.CallState getCallState() {
        return this.callState;
    }

    public C28231Qu getCallWaitingInfo() {
        return this.callWaitingInfo;
    }

    public int getConnectedParticipantsCount() {
        int i = 0;
        for (Map.Entry entry : this.participants.entrySet()) {
            if (((C28241Qv) entry.getValue()).A01 == 1) {
                i++;
            }
        }
        return i;
    }

    public UserJid getCreatorJid() {
        return this.creatorJid;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C28241Qv getDefaultPeerInfo() {
        /*
            r5 = this;
            boolean r0 = r5.isGroupCall
            r4 = 0
            if (r0 == 0) goto L6
            return r4
        L6:
            java.util.Map r0 = r5.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r2 = r3.next()
            X.1Qv r2 = (X.C28241Qv) r2
            boolean r0 = r2.A0E
            if (r0 == 0) goto L2a
            com.whatsapp.jid.UserJid r1 = r2.A06
            com.whatsapp.jid.UserJid r0 = r5.peerJid
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L10
        L2a:
            return r2
        L2b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.getDefaultPeerInfo():X.1Qv");
    }

    public long getECMode() {
        return this.ECMode;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public C28241Qv getInfoByJid(UserJid userJid) {
        return (C28241Qv) this.participants.get(userJid);
    }

    public UserJid getInitialPeerJid() {
        return this.initialPeerJid;
    }

    public Set getParticipantJids() {
        return this.participants.keySet();
    }

    public Map getParticipants() {
        return this.participants;
    }

    public UserJid getPeerJid() {
        return this.peerJid;
    }

    public C28241Qv getSelfInfo() {
        return this.self;
    }

    public long getVideoDuration() {
        return this.videoDuration;
    }

    public boolean hasOutgoingParticipantInActiveOneToOneCall() {
        return this.callState == Voip.CallState.ACTIVE && getDefaultPeerInfo() != null && getDefaultPeerInfo().A00();
    }

    public int initialGroupTransactionId() {
        return this.initialGroupTransactionId;
    }

    public boolean isCallEnding() {
        return this.callEnding;
    }

    public boolean isCallOnHold() {
        if (this.self.A09) {
            return true;
        }
        for (C28241Qv c28241Qv : this.participants.values()) {
            if (!c28241Qv.A0E && !c28241Qv.A09) {
                return false;
            }
        }
        return true;
    }

    public boolean isCaller() {
        return this.isCaller;
    }

    public boolean isEitherSideRequestingUpgrade() {
        C28241Qv c28241Qv;
        if (this.isGroupCall || this.callState == Voip.CallState.NONE || (c28241Qv = this.self) == null) {
            return false;
        }
        return c28241Qv.A01() || isPeerRequestingUpgrade();
    }

    public boolean isEndedByMe() {
        return this.isEndedByMe;
    }

    public boolean isGroupCall() {
        return this.isGroupCall;
    }

    public boolean isGroupCallCreatedOnServer() {
        return this.isGroupCallCreatedOnServer;
    }

    public boolean isGroupCallEnabled() {
        return this.isGroupCallEnabled;
    }

    public boolean isInLonelyState() {
        if (this.callState != Voip.CallState.ACTIVE) {
            return false;
        }
        for (C28241Qv c28241Qv : this.participants.values()) {
            if (c28241Qv.A01 == 1 && !c28241Qv.A0E) {
                return false;
            }
        }
        return true;
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableGroupCall;
    }

    public boolean isPeerRequestingUpgrade() {
        C28241Qv defaultPeerInfo = getDefaultPeerInfo();
        return defaultPeerInfo != null && defaultPeerInfo.A01();
    }

    public boolean isSelfRequestingUpgrade() {
        C28241Qv c28241Qv;
        if (this.isGroupCall || (c28241Qv = this.self) == null || this.callState == Voip.CallState.NONE) {
            return false;
        }
        return c28241Qv.A01();
    }

    public boolean isVideoCaptureStarted() {
        return this.videoCaptureStarted;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public boolean isVideoPreviewReady() {
        return this.videoPreviewReady;
    }

    private void setCallWaitingInfo(boolean z, int i, String str, int i2, String[] strArr, String str2, boolean z2, boolean z3, int i3, int i4, boolean z4, Voip.CallLogInfo callLogInfo, boolean z5) {
        this.callWaitingInfo = new C28231Qu(i, str, i2, C003101m.A0F(UserJid.class, Arrays.asList(strArr)), str2, z2, callLogInfo, z5);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CallId: ");
        A0P.append(this.callId);
        A0P.append(", peerJid: ");
        A0P.append(this.peerJid);
        A0P.append(", callState: ");
        A0P.append(this.callState);
        return A0P.toString();
    }
}
