package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.Map;

/* renamed from: X.3u9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84683u9 {
    public final /* synthetic */ C25L A00;

    public C84683u9(C25L c25l) {
        this.A00 = c25l;
    }

    public void A00(DeviceJid deviceJid) {
        byte byteValue;
        StringBuilder sb = new StringBuilder("VoiceService/notifyNewSessionEstablished ");
        sb.append(deviceJid);
        Log.i(sb.toString());
        C25L c25l = this.A00;
        c25l.A0e(deviceJid, Voip.getCurrentCallId(), false);
        Map map = c25l.A2B;
        String str = (String) map.get(deviceJid);
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("voip/sendOfferRetryRequest for jid:");
            sb2.append(deviceJid);
            Log.i(sb2.toString());
            map.remove(deviceJid);
            c25l.A0s.execute(new RunnableEBaseShape1S1100000_I1(deviceJid, str, 4));
        }
        Number number = (Number) c25l.A2C.get(deviceJid);
        if (number == null || (byteValue = number.byteValue()) < 0 || byteValue > 4) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("voip/sendPendingRekeyRequest for jid:");
        sb3.append(deviceJid);
        sb3.append(", retry:");
        sb3.append(number);
        Log.i(sb3.toString());
        c25l.A0s.execute(new RunnableEBaseShape2S0300000_I1(number, c25l, deviceJid, 11));
    }
}
