package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;

/* renamed from: X.3M3  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3M3 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ C41761uT A04;
    public final /* synthetic */ AnonymousClass094 A05;
    public final /* synthetic */ C05020My A06;
    public final /* synthetic */ C05020My A07;
    public final /* synthetic */ C04420Kc A08;
    public final /* synthetic */ C0JU A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ byte[] A0B;
    public final /* synthetic */ byte[] A0C;
    public final /* synthetic */ byte[] A0D;

    public /* synthetic */ C3M3(C41761uT c41761uT, byte[] bArr, C05020My c05020My, C05020My c05020My2, DeviceJid deviceJid, byte[] bArr2, byte b, AnonymousClass094 anonymousClass094, byte[] bArr3, int i, boolean z, int i2, C0JU c0ju, C04420Kc c04420Kc) {
        this.A04 = c41761uT;
        this.A0B = bArr;
        this.A06 = c05020My;
        this.A07 = c05020My2;
        this.A03 = deviceJid;
        this.A0C = bArr2;
        this.A00 = b;
        this.A05 = anonymousClass094;
        this.A0D = bArr3;
        this.A02 = i;
        this.A0A = z;
        this.A01 = i2;
        this.A09 = c0ju;
        this.A08 = c04420Kc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41761uT c41761uT = this.A04;
        byte[] bArr = this.A0B;
        C05020My c05020My = this.A06;
        C05020My c05020My2 = this.A07;
        DeviceJid deviceJid = this.A03;
        byte[] bArr2 = this.A0C;
        byte b = this.A00;
        AnonymousClass094 anonymousClass094 = this.A05;
        byte[] bArr3 = this.A0D;
        int i = this.A02;
        boolean z = this.A0A;
        int i2 = this.A01;
        C0JU c0ju = this.A09;
        C04420Kc c04420Kc = this.A08;
        if (bArr != null && c05020My != null && c05020My2 != null && !c41761uT.A04.A0A(deviceJid, bArr2, bArr, b)) {
            StringBuilder sb = new StringBuilder("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/adv validation fails, key=");
            sb.append(c04420Kc);
            Log.e(sb.toString());
            c41761uT.A07.A0L(c04420Kc);
            return;
        }
        byte[] A01 = c41761uT.A08.A01(anonymousClass094, bArr3, i, bArr, b, c05020My2, c05020My, z, i2, deviceJid);
        StringBuilder sb2 = new StringBuilder("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/sending retry for msg = ");
        sb2.append(c0ju);
        sb2.append(" device = ");
        sb2.append(deviceJid);
        Log.i(sb2.toString());
        C0E6 c0e6 = c41761uT.A01;
        c0e6.A00.A01(new SendPeerMessageJob(c0ju, deviceJid, A01, i));
        c41761uT.A07.A0L(c04420Kc);
    }
}
