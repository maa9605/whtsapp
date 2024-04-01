package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0F1  reason: invalid class name */
/* loaded from: classes.dex */
public class C0F1 extends AbstractC03000Dt {
    public final C02L A00;
    public final C05W A01;
    public final C018708s A02;
    public final C0C7 A03;
    public final C0F0 A04;
    public final InterfaceC007103c A05;
    public final InterfaceC007103c A06;

    public C0F1(C02L c02l, C05W c05w, C018708s c018708s, InterfaceC007103c interfaceC007103c, InterfaceC007103c interfaceC007103c2, C0F0 c0f0, C0C7 c0c7) {
        this.A00 = c02l;
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A05 = interfaceC007103c;
        this.A06 = interfaceC007103c2;
        this.A04 = c0f0;
        this.A03 = c0c7;
    }

    public static String A02(Voip.CallState callState) {
        switch (callState.ordinal()) {
            case 1:
            case 2:
                return "outgoing_ringing";
            case 3:
            case 8:
                return "incoming_ringing";
            case 4:
            case 5:
            case 6:
                return "active";
            case 7:
            default:
                return "idle";
        }
    }

    public static JSONObject A03(Voip.CallState callState, CallInfo callInfo, C02L c02l, C05W c05w, C018708s c018708s, C07F c07f, C0F0 c0f0, C0C7 c0c7) {
        String A02 = A02(callState);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("call_state", A02);
        if (!"idle".equals(A02) && callInfo != null) {
            if (!callInfo.isCaller) {
                jSONObject.put("caller_contact_id", c0c7.A01.A04(c07f, callInfo.peerJid.getRawString()));
                jSONObject.put("caller_name", c018708s.A09(c05w.A0A(callInfo.peerJid), false));
            }
            GroupJid groupJid = callInfo.groupJid;
            if (groupJid != null) {
                jSONObject.put("group_name", c018708s.A08(c05w.A0A(groupJid), false));
            }
            Set<AbstractC005302j> participantJids = callInfo.getParticipantJids();
            if (!participantJids.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                int i = 0;
                for (AbstractC005302j abstractC005302j : participantJids) {
                    if (!c02l.A0A(abstractC005302j)) {
                        String A09 = c018708s.A09(c05w.A0A(abstractC005302j), false);
                        if (TextUtils.isEmpty(A09)) {
                            i++;
                        } else {
                            jSONArray.put(c0c7.A01.A04(c07f, abstractC005302j.getRawString()));
                            jSONArray2.put(A09);
                        }
                    }
                }
                jSONObject.put("call_participant_contact_ids", jSONArray);
                jSONObject.put("call_participant_names", jSONArray2);
                jSONObject.put("unnamed_call_participant_count", i);
            }
            jSONObject.put("call_id", c0f0.A04(c07f, callInfo.callId));
            jSONObject.put("video_call", callInfo.videoEnabled);
        }
        return jSONObject;
    }
}
