package X;

import android.content.IntentFilter;
import android.media.AudioManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3tz */
/* loaded from: classes2.dex */
public abstract class AbstractC84583tz {
    public C84383te A00;
    public boolean A01;

    public void A00() {
        C86723y8 c86723y8 = (C86723y8) this;
        c86723y8.A01.registerReceiver(c86723y8.A00, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public void A01() {
        C86723y8 c86723y8 = (C86723y8) this;
        c86723y8.A01.unregisterReceiver(c86723y8.A00);
    }

    public final void A02() {
        boolean A03 = A03();
        if (this.A01 != A03) {
            this.A01 = A03;
            C74613dY c74613dY = this.A00.A00;
            StringBuilder sb = new StringBuilder("voip/audio_route/HeadsetMonitor ");
            sb.append(c74613dY);
            Log.i(sb.toString());
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null && callInfo.callState != Voip.CallState.NONE) {
                c74613dY.A03(callInfo);
                if (A03) {
                    c74613dY.A06 = true;
                    Log.i("voip/audio_route/headset Plugged");
                    if (c74613dY.A00 == 1) {
                        c74613dY.A02(callInfo);
                        c74613dY.A05(false, callInfo);
                        return;
                    }
                    return;
                }
                Log.i("voip/audio_route/headset Unplugged");
                c74613dY.A01(callInfo);
                return;
            }
            Log.e("voip/audio_route/headsetPlugReceiver ignored, not in any call");
        }
    }

    public boolean A03() {
        AudioManager A0A = ((C86723y8) this).A02.A0A();
        if (A0A == null) {
            return false;
        }
        return A0A.isWiredHeadsetOn();
    }
}
