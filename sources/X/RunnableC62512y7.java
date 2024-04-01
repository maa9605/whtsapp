package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2y7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC62512y7 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AbstractC005302j A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ AnonymousClass273 A04;
    public final /* synthetic */ C04420Kc A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ RunnableC62512y7(AnonymousClass273 anonymousClass273, C04420Kc c04420Kc, int i, int i2, AbstractC005302j abstractC005302j, DeviceJid deviceJid, String str) {
        this.A04 = anonymousClass273;
        this.A05 = c04420Kc;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = abstractC005302j;
        this.A03 = deviceJid;
        this.A06 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass273 anonymousClass273 = this.A04;
        C04420Kc c04420Kc = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        AbstractC005302j abstractC005302j = this.A02;
        DeviceJid deviceJid = this.A03;
        String str = this.A06;
        C000200d.A11("RecvLocationMessageListener/onFinalLocationNotification/need to send retry receipt; stanzaKey=", c04420Kc);
        if (i > 1) {
            anonymousClass273.A02.A03();
        }
        StringBuilder sb = new StringBuilder("RecvLocationMessageListener/onFinalLocationNotification/axolotl sending retry receipt; stanzaKey=");
        sb.append(c04420Kc);
        sb.append("; localRegistrationId=");
        sb.append(i2);
        Log.i(sb.toString());
        C41461tx c41461tx = anonymousClass273.A06;
        UserJid userJid = deviceJid.userJid;
        byte[] A1c = AnonymousClass029.A1c(i2);
        int i3 = i + 1;
        if (c41461tx != null) {
            StringBuilder sb2 = new StringBuilder("LocationSharingManager/sendFinalLocationRetryRequest/jid=");
            sb2.append(abstractC005302j);
            sb2.append("; participant=");
            sb2.append(userJid);
            sb2.append("; msgId=");
            C000200d.A1R(sb2, str, "; retryCount=", i3);
            if (i3 > 4) {
                StringBuilder sb3 = new StringBuilder("LocationSharingManager/sendFinalLocationRetryRequest/reached max retry; remote_resource=");
                sb3.append(userJid);
                sb3.append("; retryCount=");
                sb3.append(i3);
                Log.w(sb3.toString());
                return;
            } else if (c41461tx.A08(new AnonymousClass094(abstractC005302j, false, str)) == null) {
                StringBuilder sb4 = new StringBuilder("LocationSharingManager/sendFinalLocationRetryRequest/can't find the live location message; jid=");
                sb4.append(abstractC005302j);
                sb4.append("; senderJid=");
                sb4.append(userJid);
                sb4.append("; msgId=");
                sb4.append(str);
                sb4.append("; retryCount=");
                sb4.append(i3);
                Log.w(sb4.toString());
                return;
            } else {
                C05Y c05y = c41461tx.A0P;
                Message obtain = Message.obtain(null, 0, 191, 0);
                Bundle data = obtain.getData();
                data.putParcelable("toJid", userJid);
                data.putParcelable("contextJid", abstractC005302j);
                data.putString("msgId", str);
                data.putByteArray("registrationId", A1c);
                data.putInt("retryCount", i3);
                c05y.A0C(obtain);
                return;
            }
        }
        throw null;
    }
}
