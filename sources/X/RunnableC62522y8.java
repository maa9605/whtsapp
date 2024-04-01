package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.util.Log;

/* renamed from: X.2y8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC62522y8 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Pair A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ AnonymousClass273 A04;
    public final /* synthetic */ AnonymousClass094 A05;
    public final /* synthetic */ C04420Kc A06;

    public /* synthetic */ RunnableC62522y8(AnonymousClass273 anonymousClass273, DeviceJid deviceJid, int i, C04420Kc c04420Kc, int i2, AnonymousClass094 anonymousClass094, Pair pair) {
        this.A04 = anonymousClass273;
        this.A03 = deviceJid;
        this.A00 = i;
        this.A06 = c04420Kc;
        this.A01 = i2;
        this.A05 = anonymousClass094;
        this.A02 = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass273 anonymousClass273 = this.A04;
        DeviceJid deviceJid = this.A03;
        int i = this.A00;
        C04420Kc c04420Kc = this.A06;
        int i2 = this.A01;
        AnonymousClass094 anonymousClass094 = this.A05;
        Pair pair = this.A02;
        UserJid userJid = deviceJid.userJid;
        C0IO A0T = C002701i.A0T(deviceJid);
        byte[] bArr = null;
        StringBuilder sb = new StringBuilder("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl checking sessions due to retry receipt; recipient=");
        sb.append(A0T);
        sb.append("; targetJid=");
        sb.append(userJid);
        Log.i(sb.toString());
        C01J c01j = anonymousClass273.A04;
        if (c01j.A0U(A0T)) {
            C07930aK c07930aK = c01j.A0C(A0T).A01;
            if (c07930aK.A00.A03 != i) {
                C000200d.A0x("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl deleting session due to registration id change; stop retrying; targetJid=", userJid);
                c01j.A0H.A00();
                c01j.A0C.A01(A0T);
                c01j.A0L(A0T);
                anonymousClass273.A08.A0L(c04420Kc);
                return;
            }
            if (i2 >= 2) {
                C000200d.A0x("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl requiring new session before resending; targetJid=", userJid);
                bArr = c07930aK.A00();
            }
            if (i2 > 2) {
                c01j.A0H.A00();
                if (c01j.A0V(A0T, new AnonymousClass094(userJid, true, "location_msg_id"))) {
                    Log.i("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl will wait to send notification until a new prekey has been fetched");
                    anonymousClass273.A08.A0L(c04420Kc);
                    return;
                }
            }
            if (i2 == 2) {
                Log.i("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl will record the base key used to send");
                c01j.A0O(A0T, userJid, bArr);
            }
        }
        StringBuilder sb2 = new StringBuilder("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; create new SendFinalLiveLocationRetryJob; messageKey=");
        sb2.append(anonymousClass094);
        sb2.append("; targetJid=");
        sb2.append(userJid);
        sb2.append("; timeOffset=");
        sb2.append(pair.second);
        sb2.append("; retryCount=");
        sb2.append(i2);
        Log.i(sb2.toString());
        C0E6 c0e6 = anonymousClass273.A03;
        c0e6.A00.A01(new SendFinalLiveLocationRetryJob(anonymousClass094, deviceJid, (C0K0) pair.first, ((Number) pair.second).intValue(), bArr, i2));
        anonymousClass273.A08.A0L(c04420Kc);
    }
}
