package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2U6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2U6 {
    public final long A00;
    public final GroupJid A01;
    public final UserJid A02;
    public final Voip.CallState A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C2U6(String str, Voip.CallState callState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, UserJid userJid, List list, boolean z6, GroupJid groupJid, boolean z7) {
        this.A04 = str;
        this.A03 = callState;
        this.A06 = z;
        this.A07 = z2;
        this.A0C = z3;
        this.A0A = z4;
        this.A09 = z5;
        this.A00 = j;
        this.A02 = userJid;
        this.A05 = list;
        this.A0B = z6;
        this.A01 = groupJid;
        this.A08 = z7;
    }

    public static C2U6 A00(CallInfo callInfo, boolean z) {
        C28231Qu c28231Qu = callInfo.callWaitingInfo;
        if (c28231Qu.A01 == 1) {
            UserJid userJid = c28231Qu.A03.initialPeerJid;
            if (userJid != null) {
                return new C2U6(c28231Qu.A04, Voip.CallState.RECEIVED_CALL, false, c28231Qu.A00 > 1, c28231Qu.A07, false, false, 0L, userJid, c28231Qu.A05, true, c28231Qu.A02, c28231Qu.A06);
            }
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (C28241Qv c28241Qv : callInfo.participants.values()) {
            if (!c28241Qv.A0E) {
                arrayList.add(c28241Qv.A06);
            }
        }
        return new C2U6(callInfo.callId, callInfo.callState, callInfo.isCaller, callInfo.isGroupCall, callInfo.videoEnabled, z, callInfo.isCallOnHold(), callInfo.callActiveTime, callInfo.peerJid, arrayList, false, callInfo.groupJid, callInfo.isJoinableGroupCall);
    }
}
