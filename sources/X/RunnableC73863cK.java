package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3cK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC73863cK extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ RunnableC73863cK(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A00;
        String str2 = this.A01;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            C28231Qu c28231Qu = callInfo.callWaitingInfo;
            if (c28231Qu.A01 != 0 && c28231Qu.A04.equals(str)) {
                Voip.rejectPendingCall(str);
                return;
            }
        }
        Voip.rejectCall(str, str2);
    }
}
