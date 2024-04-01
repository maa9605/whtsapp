package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.2Uw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC51182Uw extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ DeviceJid A01;
    public final /* synthetic */ C22K A02;
    public final /* synthetic */ C05020My A03;
    public final /* synthetic */ C05020My A04;
    public final /* synthetic */ byte[] A05;
    public final /* synthetic */ byte[] A06;
    public final /* synthetic */ byte[] A07;

    public RunnableC51182Uw(C22K c22k, DeviceJid deviceJid, byte[] bArr, byte[] bArr2, byte b, C05020My c05020My, C05020My c05020My2, byte[] bArr3) {
        this.A02 = c22k;
        this.A01 = deviceJid;
        this.A05 = bArr;
        this.A06 = bArr2;
        this.A00 = b;
        this.A03 = c05020My;
        this.A04 = c05020My2;
        this.A07 = bArr3;
    }

    @Override // java.lang.Runnable
    public void run() {
        DeviceJid deviceJid = this.A01;
        if (!deviceJid.isPrimary()) {
            C22K c22k = this.A02;
            if (!c22k.A09.A0A(deviceJid, this.A05, this.A06, this.A00)) {
                Log.e("recvprekeymessagelistener/onGetPreKeySuccess adv verification fails");
                c22k.A00(deviceJid);
                return;
            }
        }
        C0IO A0T = C002701i.A0T(deviceJid);
        C22K c22k2 = this.A02;
        int A03 = c22k2.A07.A03(A0T, this.A06, this.A00, this.A03, this.A04, this.A07);
        if (A03 == 0) {
            c22k2.A00.post(new RunnableEBaseShape0S0110000_I0(this, false, 10));
            return;
        }
        C000200d.A0p("Error received from SignalCoordinator; status=", A03);
        c22k2.A00(deviceJid);
    }
}
