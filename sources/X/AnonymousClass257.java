package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.257 */
/* loaded from: classes2.dex */
public class AnonymousClass257 extends AnonymousClass009 {
    public PhoneAccountHandle A00;
    public boolean A01;
    public final TelecomManager A02;
    public final C001200o A03;
    public final C0EW A04;
    public final ConcurrentMap A05 = new ConcurrentHashMap();
    public volatile boolean A06;

    public AnonymousClass257(C001200o c001200o, C02E c02e, C0EW c0ew) {
        this.A03 = c001200o;
        this.A02 = c02e.A0E();
        this.A04 = c0ew;
    }

    public static final Uri A00(UserJid userJid) {
        String replaceAll;
        String A02 = C04630Le.A02(userJid);
        if (A02 != null && (replaceAll = A02.replaceAll("\\D", "")) != null) {
            return Uri.fromParts("tel", replaceAll, "");
        }
        Log.i("voip/SelfManagedConnectionsManager/getPhoneCallUri failed to get phone number");
        return null;
    }

    public static final Bundle A01(String str, UserJid userJid, String str2, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
        }
        Bundle A02 = C000200d.A02("call_id", str);
        A02.putString("peer_jid", userJid.getRawString());
        A02.putString("peer_display_name", str2);
        bundle.putParcelable(z2 ? "android.telecom.extra.OUTGOING_CALL_EXTRAS" : "android.telecom.extra.INCOMING_CALL_EXTRAS", A02);
        return bundle;
    }

    public void A02(C74403dD c74403dD) {
        C000700j.A01();
        ConcurrentMap concurrentMap = this.A05;
        concurrentMap.put(c74403dD.A01, c74403dD);
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/addConnection");
        sb.append(c74403dD);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A03(C74403dD c74403dD) {
        C000700j.A01();
        ConcurrentMap concurrentMap = this.A05;
        concurrentMap.remove(c74403dD.A01);
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/removeConnection");
        sb.append(c74403dD);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A04(String str, int i) {
        C000700j.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (c0g5.hasNext()) {
                AnonymousClass258 anonymousClass258 = (AnonymousClass258) c0g5.next();
                if (!(anonymousClass258 instanceof C86733yB)) {
                    C000700j.A01();
                } else {
                    C86733yB c86733yB = (C86733yB) anonymousClass258;
                    C000700j.A01();
                    StringBuilder sb = new StringBuilder("voip/service/selfManagedConnectionListener/onConnectionStateChanged ");
                    sb.append(str);
                    sb.append(", state ");
                    sb.append(i);
                    Log.i(sb.toString());
                    CallInfo callInfo = Voip.getCallInfo();
                    if (Voip.A09(callInfo) && str.equals(callInfo.callId)) {
                        if (i == 0) {
                            c86733yB.A00.A0i(callInfo, true);
                        } else if (i == 1) {
                            c86733yB.A00.A0i(callInfo, false);
                        } else if (i == 2) {
                            C25L c25l = c86733yB.A00;
                            c25l.A0u = true;
                            c25l.A12(callInfo);
                            c25l.A0r(callInfo.callId, 3);
                        } else if (i == 3) {
                            Integer A01 = Voip.A01("options.ignore_telecom_reject_threshold_duration");
                            C25L c25l2 = c86733yB.A00;
                            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - c25l2.A0C);
                            c25l2.A0l = valueOf;
                            if (A01 != null && valueOf.longValue() < A01.intValue()) {
                                if (!c25l2.A10) {
                                    c25l2.A12(callInfo);
                                }
                            } else {
                                c25l2.A0u(str, null, 4);
                            }
                        } else if (i != 4) {
                            C000700j.A08(false, "unknown SelfManagedConnection.StateChange");
                        } else {
                            c86733yB.A00.A0b(1, null);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }
}
