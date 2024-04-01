package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptProcessingJob;

/* renamed from: X.3g4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76113g4 implements C2TZ {
    public final int A00;
    public final long A01;
    public final DeviceJid A02;
    public final Jid A03;
    public final C05200Ns A04;
    public final C04420Kc A05;
    public final boolean A06;
    public final AnonymousClass094[] A07;

    public C76113g4(AnonymousClass094[] anonymousClass094Arr, Jid jid, DeviceJid deviceJid, int i, long j, C04420Kc c04420Kc, boolean z, C05200Ns c05200Ns) {
        this.A07 = anonymousClass094Arr;
        this.A03 = jid;
        this.A02 = deviceJid;
        this.A00 = i;
        this.A01 = j;
        this.A05 = c04420Kc;
        this.A06 = z;
        this.A04 = c05200Ns;
    }

    @Override // X.C2TZ
    public boolean AFZ() {
        return this.A06;
    }

    @Override // X.C2TZ
    public AnonymousClass094 AFz(int i) {
        return this.A07[i];
    }

    @Override // X.C2TZ
    public DeviceJid AQd(int i) {
        return this.A02;
    }

    @Override // X.C2TZ
    public C05200Ns ARA() {
        return this.A04;
    }

    @Override // X.C2TZ
    public Jid ARI() {
        return this.A03;
    }

    @Override // X.C2TZ
    public void ASE(C0E6 c0e6, int i) {
        AnonymousClass094[] anonymousClass094Arr = this.A07;
        int length = anonymousClass094Arr.length - i;
        AnonymousClass094[] anonymousClass094Arr2 = new AnonymousClass094[length];
        System.arraycopy(anonymousClass094Arr, i, anonymousClass094Arr2, 0, length);
        c0e6.A00.A01(new ReceiptProcessingJob(anonymousClass094Arr2, this.A03, this.A02, this.A00, this.A01, this.A04));
    }

    @Override // X.C2TZ
    public C04420Kc AUx() {
        return this.A05;
    }

    @Override // X.C2TZ
    public int AV8() {
        return this.A00;
    }

    @Override // X.C2TZ
    public long AVW(int i) {
        return this.A01;
    }

    @Override // X.C2TZ
    public int size() {
        return this.A07.length;
    }
}
