package X;

import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Hc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48862Hc extends C0SF {
    public final /* synthetic */ RotateSignedPreKeyJob A00;
    public final /* synthetic */ AtomicInteger A01;
    public final /* synthetic */ AtomicReference A02;

    public C48862Hc(RotateSignedPreKeyJob rotateSignedPreKeyJob, AtomicInteger atomicInteger, AtomicReference atomicReference) {
        this.A00 = rotateSignedPreKeyJob;
        this.A01 = atomicInteger;
        this.A02 = atomicReference;
    }

    @Override // X.C0SF
    public void A02(C02590Ca c02590Ca) {
        C02590Ca A0E = c02590Ca.A0E("error");
        this.A01.set(A0E.A05("code", 0));
        C02590Ca A0D = A0E.A0D("identity");
        if (A0D != null) {
            this.A02.set(A0D.A01);
        }
    }

    @Override // X.C0SF
    public void A03(C02590Ca c02590Ca) {
        C01R c01r = this.A00.A02;
        c01r.A00.submit(new RunnableEBaseShape3S0100000_I0_3(this, 25));
    }
}
