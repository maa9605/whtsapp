package java.lang;

import X.AnonymousClass029;
import X.AnonymousClass094;
import X.AnonymousClass273;
import X.C002701i;
import X.C01J;
import X.C04420Kc;
import X.C07930aK;
import X.C0E6;
import X.C0IO;
import X.C41461tx;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0202000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableEBaseShape0S0202000_I0(Object obj, Object obj2, int i, int i2, int i3) {
        this.A04 = i3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A04) {
            case 0:
                AnonymousClass273 anonymousClass273 = (AnonymousClass273) this.A02;
                C04420Kc c04420Kc = (C04420Kc) this.A03;
                int i = this.A00;
                int i2 = this.A01;
                StringBuilder sb = new StringBuilder("need to send retry receipt; stanzaKey=");
                sb.append(c04420Kc);
                Log.i(sb.toString());
                byte[] A1c = AnonymousClass029.A1c(i);
                if (i2 > 1) {
                    anonymousClass273.A02.A03();
                }
                StringBuilder sb2 = new StringBuilder("axolotl sending retry receipt; stanzaKey=");
                sb2.append(c04420Kc);
                sb2.append("; localRegistrationId=");
                sb2.append(i);
                Log.i(sb2.toString());
                C41461tx c41461tx = anonymousClass273.A06;
                UserJid A00 = c04420Kc.A00();
                if (A00 != null) {
                    c41461tx.A0V(A00, A1c, i2 + 1);
                    return;
                }
                throw null;
            case 1:
                AnonymousClass273 anonymousClass2732 = (AnonymousClass273) this.A02;
                DeviceJid deviceJid = (DeviceJid) this.A03;
                int i3 = this.A00;
                int i4 = this.A01;
                C0IO A0T = C002701i.A0T(deviceJid);
                StringBuilder sb3 = new StringBuilder("axolotl checking sessions for ");
                sb3.append(A0T);
                sb3.append(" due to retry receipt for ");
                sb3.append(deviceJid);
                Log.i(sb3.toString());
                C01J c01j = anonymousClass2732.A04;
                byte[] bArr = null;
                if (c01j.A0U(A0T)) {
                    C07930aK c07930aK = c01j.A0C(A0T).A01;
                    if (c07930aK.A00.A03 != i3) {
                        StringBuilder sb4 = new StringBuilder("axolotl deleting session due to registration id change for ");
                        sb4.append(deviceJid);
                        sb4.append(" stop retrying");
                        Log.i(sb4.toString());
                        c01j.A0H.A00();
                        c01j.A0C.A01(A0T);
                        c01j.A0L(A0T);
                        return;
                    }
                    if (i4 >= 2) {
                        StringBuilder sb5 = new StringBuilder("axolotl requiring new session before resending for ");
                        sb5.append(deviceJid);
                        Log.i(sb5.toString());
                        bArr = c07930aK.A00();
                    }
                    if (i4 > 2) {
                        UserJid userJid = deviceJid.userJid;
                        c01j.A0H.A00();
                        if (c01j.A0V(A0T, new AnonymousClass094(userJid, true, "location_msg_id"))) {
                            Log.i("axolotl will wait to send notification until a new prekey has been fetched");
                            return;
                        }
                    }
                    if (i4 == 2) {
                        Log.i("axolotl will record the base key used to send ");
                        c01j.A0O(A0T, deviceJid.userJid, bArr);
                    }
                }
                C0E6 c0e6 = anonymousClass2732.A03;
                c0e6.A00.A01(new SendLiveLocationKeyJob(deviceJid, bArr, i4));
                return;
            default:
                return;
        }
    }
}
