package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import java.util.List;

/* renamed from: X.3g5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76123g5 implements C2TZ {
    public final int A00;
    public final Jid A01;
    public final AnonymousClass094 A02;
    public final C05200Ns A03;
    public final C04420Kc A04;
    public final List A05;
    public final boolean A06;

    public C76123g5(AnonymousClass094 anonymousClass094, Jid jid, int i, List list, C04420Kc c04420Kc, boolean z, C05200Ns c05200Ns) {
        this.A02 = anonymousClass094;
        this.A01 = jid;
        this.A00 = i;
        this.A05 = list;
        this.A04 = c04420Kc;
        this.A06 = z;
        this.A03 = c05200Ns;
    }

    @Override // X.C2TZ
    public boolean AFZ() {
        return this.A06;
    }

    @Override // X.C2TZ
    public AnonymousClass094 AFz(int i) {
        return this.A02;
    }

    @Override // X.C2TZ
    public DeviceJid AQd(int i) {
        return (DeviceJid) ((Pair) this.A05.get(i)).first;
    }

    @Override // X.C2TZ
    public C05200Ns ARA() {
        return this.A03;
    }

    @Override // X.C2TZ
    public Jid ARI() {
        return this.A01;
    }

    @Override // X.C2TZ
    public void ASE(C0E6 c0e6, int i) {
        List list = this.A05;
        c0e6.A00.A01(new ReceiptMultiTargetProcessingJob(this.A02, this.A01, this.A00, list.subList(i, list.size()), this.A03));
    }

    @Override // X.C2TZ
    public C04420Kc AUx() {
        return this.A04;
    }

    @Override // X.C2TZ
    public int AV8() {
        return this.A00;
    }

    @Override // X.C2TZ
    public long AVW(int i) {
        return ((Number) ((Pair) this.A05.get(i)).second).longValue();
    }

    @Override // X.C2TZ
    public int size() {
        return this.A05.size();
    }
}
