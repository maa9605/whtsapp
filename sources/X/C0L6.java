package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.0L6  reason: invalid class name */
/* loaded from: classes.dex */
public class C0L6 {
    public static volatile C0L6 A00;

    public static C0L6 A00() {
        if (A00 == null) {
            synchronized (C0L6.class) {
                if (A00 == null) {
                    A00 = new C0L6();
                }
            }
        }
        return A00;
    }

    public static boolean A01() {
        try {
            Voip.CallState currentCallState = Voip.getCurrentCallState();
            if (currentCallState != null) {
                return currentCallState != Voip.CallState.NONE;
            }
            return false;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public static boolean A02() {
        try {
            Voip.CallState currentCallState = Voip.getCurrentCallState();
            if (currentCallState == null || currentCallState == Voip.CallState.NONE) {
                return false;
            }
            return currentCallState != Voip.CallState.ACTIVE_ELSEWHERE;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public static boolean A03() {
        try {
            Voip.CallState currentCallState = Voip.getCurrentCallState();
            if (currentCallState != null) {
                return currentCallState == Voip.CallState.ACTIVE_ELSEWHERE;
            }
            return false;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return false;
        }
    }

    public boolean A04() {
        CallInfo callInfo;
        return A01() && (callInfo = Voip.getCallInfo()) != null && callInfo.videoEnabled;
    }
}
